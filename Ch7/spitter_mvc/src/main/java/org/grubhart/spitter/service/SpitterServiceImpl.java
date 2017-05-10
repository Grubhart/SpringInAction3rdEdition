package org.grubhart.spitter.service;

import org.grubhart.spitter.domain.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpitterServiceImpl implements SpitterService{

    public List<Spittle> getRecentSpittles(int spitterPerPage) {
        List<Spittle> list = new ArrayList<Spittle>();
        list.add(new Spittle("mensaje 1"));
        list.add(new Spittle("mensaje 2"));
        list.add(new Spittle("mensaje 3"));
        list.add(new Spittle("mensaje 4"));
        return list;

    }
}
