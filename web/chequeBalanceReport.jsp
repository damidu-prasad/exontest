<!DOCTYPE html>
<html>
<head>
    <title>Cheque Balance Report</title>
</head>
<body>
    <h2>Cheque Balance Report</h2>
    <table border="1">
        
        <tr>
            <th>Cheque ID</th>
            <th>Total Amount</th>
            <th>Used Amount</th>
            
        </tr>
        <% 
            List<ChequeBalance> chequeBalances = (List<ChequeBalance>) request.getAttribute("chequeBalances");
            for (ChequeBalance balance : chequeBalances) {
        %>
        <tr id="tableraw">
            <td><%= balance.getChequeId() %></td>
            <td><%= balance.getTotalAmount() %></td>
            <td><%= balance.getUsedAmount() %></td>
           
        </tr>
        <% } %>
    </table>
</body>
</html>
