package test;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import model.DBConnection;

@WebServlet(urlPatterns = {"/GenerateReceiptServlet"})

public class GenerateReceiptServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String invoiceId = request.getParameter("invoiceId");
        String chequeId = request.getParameter("chequeId");
        String settledAmount = request.getParameter("settledAmount");

        try {
//            DBConnection.iud("INSERT INTO chequeinvoice(cheque_id,invoice_id,settled_amount) VALUES('"+invoiceId+"','"+chequeId+"','"+settledAmount+"')");
            DBConnection.iud("INSERT INTO cheque(cheque_id,amount) VALUES('12345','500000.00')");

            System.out.println("done");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
