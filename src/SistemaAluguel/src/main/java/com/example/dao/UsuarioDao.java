package com.example.dao;

import com.example.beans.Usuario;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UsuarioDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Usuario usuario) {
        String sql = "INSERT INTO Usuario (nome, cpf, rg, profissao, entidadeEmpregadora, rendimentoAuferido, tipo) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, usuario.getNome(), usuario.getCpf(), usuario.getRg(),
                usuario.getProfissao(), usuario.getEntidadeEmpregadora(), usuario.getRendimentoAuferido(),
                usuario.getTipo());
    }

    public int update(Usuario usuario) {
        String sql = "UPDATE Usuario SET nome = ?, cpf = ?, rg = ?, profissao = ?, entidadeEmpregadora = ?, " +
                     "rendimentoAuferido = ?, tipo = ? WHERE id = ?";
        return jdbcTemplate.update(sql, usuario.getNome(), usuario.getCpf(), usuario.getRg(),
                usuario.getProfissao(), usuario.getEntidadeEmpregadora(), usuario.getRendimentoAuferido(),
                usuario.getTipo(), usuario.getId());
    }

    public int delete(int id) {
        String sql = "DELETE FROM Usuario WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }

    public Usuario getUsuarioById(int id) {
        String sql = "SELECT * FROM Usuario WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Usuario.class));
    }

    public List<Usuario> getUsuarios() {
        String sql = "SELECT * FROM Usuario";
        return jdbcTemplate.query(sql, new RowMapper<Usuario>() {
            public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setRg(rs.getString("rg"));
                usuario.setProfissao(rs.getString("profissao"));
                usuario.setEntidadeEmpregadora(rs.getString("entidadeEmpregadora"));
                usuario.setRendimentoAuferido(rs.getDouble("rendimentoAuferido"));
                usuario.setTipo(rs.getString("tipo"));
                return usuario;
            }
        });
    }
}
