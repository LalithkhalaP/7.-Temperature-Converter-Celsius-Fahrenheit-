package converter;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/tempconverter")
public class TempConverter extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        PrintWriter out = res.getWriter();

        try {
            double celsius = Double.parseDouble(req.getParameter("celsius"));
            double fahrenheit = (celsius * 9 / 5) + 32;

            out.println("Temperature in Fahrenheit = " + fahrenheit);
        } catch (NumberFormatException e) {
            out.println("Error: Please provide a valid number for celsius!");
        }
    }
}
