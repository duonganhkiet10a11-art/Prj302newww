package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String action = request.getParameter("action");
        String req = request.getParameter("req");
        String url = "login.jsp"; // mặc định

        // ===== XỬ LÝ ACTION (login / logout) =====
        if (action != null) {
            if (action.equals("login")) {
                url = "LoginController";
            } else if (action.equals("logout")) {
                url = "LogoutController";
            }
        } // ===== XỬ LÝ REQ (search) =====
        else if (req != null) {
            if (req.equals("search")) {
                // Ở đây có thể xử lý search (nếu cần)
                // Hiện tại chỉ cần LUỒNG là đủ yêu cầu thầy
                url = "a.jsp"; // quay về dashboard
            }
        }

        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
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

    @Override
    public String getServletInfo() {
        return "Main Controller";
    }
}
