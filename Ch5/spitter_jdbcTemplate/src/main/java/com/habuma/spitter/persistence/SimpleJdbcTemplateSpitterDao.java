package com.habuma.spitter.persistence;


import com.habuma.domain.spitter.persistence.Spitter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SimpleJdbcTemplateSpitterDao extends SimpleJdbcDaoSupport {

    private JdbcTemplate jdbcTemplate;

    private static final String SQL_INSERT_SPITTER = "insert into spitter (username, password, fullname, email, update_by_email) values (?, ?, ?, ?, ?)";

    public void addSpitter(Spitter spitter){

        jdbcTemplate.update(SQL_INSERT_SPITTER,
                            spitter.getUsername(),
                            spitter.getPassword(),
                            spitter.getFullname(),
                            spitter.getEmail(),
                            spitter.isUpdatedByEmail());
        spitter.setId(queryForIdentity());



    }

    private long queryForIdentity() {

        return getSimpleJdbcTemplate().queryForLong("call identity()");
    }

}
