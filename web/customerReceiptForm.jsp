<!DOCTYPE html>
<html>
<head>
    <title>Generate Customer Receipt</title>
</head>
<body>
    <h2>Generate Customer Receipt</h2>
    <form action="GenerateReceiptServlet" method="post">
        <label for="invoiceId">Invoice ID:</label>
        <input type="text" id="invoiceId" name="invoiceId"><br><br>

        <label for="chequeId">Cheque ID:</label>
        <input type="text" id="chequeId" name="chequeId"><br><br>

        <label for="settledAmount">Settled Amount:</label>
        <input type="text" id="settledAmount" name="settledAmount"><br><br>

        <input type="submit" value="Generate Receipt">
    </form>
</body>
</html>
