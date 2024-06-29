package controller;

import dto.SystemAdminDto;
import service.SystemAdminService;
import service.impl.SystemAdminServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/account")
public class SystemAdminServlet extends HttpServlet {

    private SystemAdminService systemAdminService=new SystemAdminServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email=req.getParameter("email");
        String password=req.getParameter("pwd");
        try {
            SystemAdminDto systemAdminDto =this.systemAdminService.login(email,password);
            if (systemAdminDto.getCode()==-1){
                req.setAttribute("emailError","此邮箱不存在！");
                req.getRequestDispatcher("login.jsp").forward(req,resp);
            }
            if (systemAdminDto.getCode()==-2){
                req.setAttribute("pwdError","密码错误");
                req.getRequestDispatcher("login.jsp").forward(req,resp);
            }
            if (systemAdminDto.getCode()==1){
                HttpSession session=req.getSession();
                session.setAttribute("admin",systemAdminDto.getSystemAdmin());
                resp.sendRedirect("/BSMM_war_exploded/house_list.jsp");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
