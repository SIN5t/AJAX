package cn.edu.uestc.ajax;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//这里不要加项目名的！
@WebServlet({"/ajaxServlet02"})
public class AjaxServlet02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");

        //前端的XMLHttpRequest对象会接收到
        //前端以this.responseText进行获取的，获取到的全都是以文本的形式获取的

        out.print("<font color='red'>用户名已存在！！！</font>");
        out.print("username=" + username + ", pwd=" + pwd);

    }
}
