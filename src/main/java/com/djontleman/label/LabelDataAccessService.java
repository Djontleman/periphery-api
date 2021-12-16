package com.djontleman.label;

import com.djontleman.album.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("postgresLabel")
public class LabelDataAccessService implements LabelDAO{

    private JdbcTemplate jdbcTemplate;
    private LabelRowMapper labelRowMapper;

    @Autowired
    public LabelDataAccessService(JdbcTemplate jdbcTemplate, LabelRowMapper labelRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.labelRowMapper = labelRowMapper;
    }

    // || ====================== Create/POST ====================== ||

    @Override
    public int postLabel(Label label) {
        String sql = """
                INSERT
                INTO labels (label_name)
                VALUES (?);
                """;
        return jdbcTemplate.update(sql, label.getName());
    }

    // || ====================== Read/GET ====================== ||

    @Override
    public List<Label> getAllLabels() {
        String sql = """
                SELECT *
                FROM labels;
                """;
        return jdbcTemplate.query(sql, labelRowMapper);
    }

    @Override
    public Optional<Label> getLabelById(int id) {
        String sql = """
                SELECT *
                FROM labels
                WHERE id = ?;
                """;
        return jdbcTemplate.query(sql, labelRowMapper, id)
                .stream()
                .findFirst();
    }

    @Override
    public List<Label> getLabelsByAlbumId(int id) {
        String sql = """
                SELECT * FROM labels
                INNER JOIN albums_labels ON labels.id = albums_labels.label_id
                WHERE album_id = ?;
                """;
        return jdbcTemplate.query(sql, labelRowMapper, id);
    }

    // || ====================== Update/PUT/PATCH ====================== ||

    @Override
    public int putLabel(int id, Label label) {
        String sql = """
                UPDATE labels
                SET label_name = ?
                WHERE id = ?;
                """;
        return jdbcTemplate.update(
                sql, label.getName(), id);
    }

    // || ====================== Delete/DELETE ====================== ||

    @Override
    public int deleteLabel(int id) {
        String sql = """
                DELETE FROM labels
                WHERE id = ?;
                """;
        return jdbcTemplate.update(sql, id);
    }
}
