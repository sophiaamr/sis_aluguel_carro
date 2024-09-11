package com.example.controller;

import com.example.beans.Usuario;
import com.example.dao.UsuarioDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    private UsuarioDao usuarioDao;

    // Exibe o formulário de cadastro
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "userform"; // Nome da view do formulário de cadastro
    }

    // Salva um novo usuário
    @PostMapping("/save")
    public String save(@ModelAttribute("usuario") Usuario usuario) {
        usuarioDao.save(usuario);
        return "redirect:/usuarios/list"; // Redireciona para a lista de usuários
    }

    // Lista todos os usuários
    @GetMapping("/list")
    public String listUsers(Model model) {
        List<Usuario> usuarios = usuarioDao.getUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "userlist"; // Nome da view da lista de usuários
    }

    // Exibe o formulário de edição de usuário
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") int id, Model model) {
        Usuario usuario = usuarioDao.getUsuarioById(id);
        model.addAttribute("usuario", usuario);
        return "usereditform"; // Nome da view do formulário de edição
    }

    // Atualiza o usuário após edição
    @PostMapping("/update")
    public String update(@ModelAttribute("usuario") Usuario usuario) {
        usuarioDao.update(usuario);
        return "redirect:/usuarios/list"; // Redireciona para a lista após a atualização
    }

    // Deleta um usuário pelo ID
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        usuarioDao.delete(id);
        return "redirect:/usuarios/list"; // Redireciona para a lista após a exclusão
    }
}
