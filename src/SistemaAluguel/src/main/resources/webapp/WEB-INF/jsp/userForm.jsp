<!DOCTYPE html>
<html>
<head>
    <title>Add User</title>
</head>
<body>
    <h1>Add User</h1>
    <form action="user/save" method="post">
        <label for="nome">Name:</label>
        <input type="text" id="nome" name="nome" required/><br/>
        
        <label for="cpf">CPF:</label>
        <input type="text" id="cpf" name="cpf" required/><br/>
        
        <label for="rg">RG:</label>
        <input type="text" id="rg" name="rg" required/><br/>
        
        <label for="profissao">Profession:</label>
        <input type="text" id="profissao" name="profissao" required/><br/>
        
        <label for="entidadeEmpregadora">Employer Entity:</label>
        <input type="text" id="entidadeEmpregadora" name="entidadeEmpregadora" required/><br/>
        
        <label for="rendimentoAuferido">Income:</label>
        <input type="number" id="rendimentoAuferido" name="rendimentoAuferido" step="0.01" required/><br/>
        
        <label for="tipo">Type:</label>
        <input type="text" id="tipo" name="tipo" required/><br/>
        
        <input type="submit" value="Save"/>
    </form>
</body>
</html>
