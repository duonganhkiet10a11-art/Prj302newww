package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.UserDAO;
import models.UserDTO;

public class LoginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // ===== LẤY SESSION =====
        HttpSession session = request.getSession();

        // ===== NẾU CHƯA ĐĂNG NHẬP =====
        if (session.getAttribute("user") == null) {

            // ===== LẤY USERNAME & PASSWORD =====
            String txtUsername = request.getParameter("txtUsername");
            String txtPassword = request.getParameter("txtPassword");

            // ===== KIỂM TRA RỖNG (BẮT BUỘC THEO YÊU CẦU) =====
            if (txtUsername == null || txtPassword == null
                    || txtUsername.trim().isEmpty()
                    || txtPassword.trim().isEmpty()) {

                request.setAttribute("message", "Please enter username and password");
                request.getRequestDispatcher("login.jsp").forward(request, response);
                return;
            }

            // ===== GỌI DAO ĐỂ LOGIN =====
            UserDAO udao = new UserDAO();
            UserDTO user = udao.login(txtUsername, txtPassword);

            // ===== KIỂM TRA KẾT QUẢ LOGIN =====
            if (user != null) {

                // ===== BỔ SUNG THEO YÊU CẦU THẦY: CHECK STATUS =====
                if (user.isStatus()) { // status = 1 → cho phép đăng nhập
                    session.setAttribute("user", user);
                    request.getRequestDispatcher("a.jsp").forward(request, response);
                } else { // status = 0 → chuyển trang 403
                    request.setAttribute("message", "Your account is disabled!");
                    request.getRequestDispatcher("403.jsp").forward(request, response);
                }

            } else {
                // ===== SAI USERNAME / PASSWORD =====
                request.setAttribute("message", "Invalid username or password!");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }

        } else {
            // ===== ĐÃ LOGIN → VÀO DASHBOARD =====
            request.getRequestDispatcher("a.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
