package test;

import jakarta.resource.cci.ResultSet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import model.DBConnection;

@WebServlet(urlPatterns = {"/ChequeBalanceReportServlet"})

public class ChequeBalanceReportServlet extends HttpServlet {

    protected void dopost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, Exception {
        try {
            ResultSet rs = DBConnection.search("SELECT * FROM `chequeinvoice`");
            if (rs.next()) {
                String chequeId = rs.getString(0);
                Integer invoice_id = rs.getInt(1);               
                BigDecimal settled_amount = rs.getBigDecimal(2);


                
            }
           
        } catch (Exception e) {
        }

    }

    private static class ChequeBalance {

        private ChequeBalance(String chequeId, int invoice_id, BigDecimal settled_amount) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
