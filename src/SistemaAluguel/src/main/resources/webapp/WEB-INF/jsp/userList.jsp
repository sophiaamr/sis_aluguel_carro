<!DOCTYPE html>
<html>
<head>
    <title>View Users</title>
</head>
<body>
    <h1>Users List</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>CPF</th>
                <th>RG</th>
                <th>Profession</th>
                <th>Employer Entity</th>
                <th>Income</th>
                <th>Type</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="user" items="${usuarios}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.nome}</td>
                    <td>${user.cpf}</td>
                    <td>${user.rg}</td>
                    <td>${user.profissao}</td>
                    <td>${user.entidadeEmpregadora}</td>
                    <td>${user.rendimentoAuferido}</td>
                    <td>${user.tipo}</td>
                    <td>
                        <a href="user/edit/${user.id}">Edit</a>
                        <a href="user/delete/${user.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
