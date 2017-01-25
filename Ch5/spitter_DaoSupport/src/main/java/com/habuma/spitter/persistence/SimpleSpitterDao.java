package com.habuma.spitter.persistence;


import com.habuma.domain.spitter.persistence.Spitter;
import com.sun.corba.se.spi.ior.ObjectKey;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


public class SimpleSpitterDao extends SimpleJdbcDaoSupport {


    private static final String SQL_INSERT_SPITTER = "insert into spitter (username, password, fullname, email, update_by_email) values (?, ?, ?, ?, ?)";
    private static final String SQL_NAMED_INSERT_SPITTER = " insert into spitter (username, password, fullname ) values ( :username, :password,: fullname)";

    private static final String SQL_SELECT_SPITTER = "select id, username, password, fullname from spitter";
    private static final String SQL_SELECT_SPITTER_BY_ID = SQL_SELECT_SPITTER + " where id=?";


    public void addSpitter(Spitter spitter){

        getSimpleJdbcTemplate().update(SQL_INSERT_SPITTER,
                            spitter.getUsername(),
                            spitter.getPassword(),
                            spitter.getFullname(),
                            spitter.getEmail(),
                            spitter.isUpdatedByEmail());
        spitter.setId(queryForIdentity());



    }

    public void addSpitterByName(Spitter spitter){

        Map<String,Object> params = new HashMap<String,Object>();
        params.put("username",spitter.getUsername());
        params.put("password",spitter.getPassword());
        params.put("fullname",spitter.getFullname());

        getSimpleJdbcTemplate().update(SQL_NAMED_INSERT_SPITTER,params);
        spitter.setId(queryForIdentity());
    }

    private long queryForIdentity() {

        return getSimpleJdbcTemplate().queryForLong("call identity()");
    }

    public Spitter getSpitterById(long id){
        return getSimpleJdbcTemplate().queryForObject(SQL_SELECT_SPITTER_BY_ID, new ParameterizedRowMapper<Spitter>() {
            public Spitter mapRow(ResultSet resultSet, int rowNumber) throws SQLException {

                Spitter spitter = new Spitter();
                spitter.setId(resultSet.getLong(1));
                spitter.setUsername(resultSet.getString(2));
                spitter.setPassword(resultSet.getString(3));
                spitter.setFullname(resultSet.getString(4));

                return spitter;
            }
        },id);
    }
}
