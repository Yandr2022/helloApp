package main.webapp;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String[] nums = req.getParameterValues("nums");

        try {
            writer.print("<h2>numbers: ");
            for (String num:nums) {
                writer.print(num+" ");
            }
            writer.print("</h2>");
        } finally {
            writer.close();
        }

    }
}
