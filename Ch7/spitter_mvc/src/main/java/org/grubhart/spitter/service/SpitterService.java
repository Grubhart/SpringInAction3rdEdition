package org.grubhart.spitter.service;


import org.grubhart.spitter.domain.Spittle;

import java.util.List;

public interface SpitterService {
    List<Spittle> getRecentSpittles(int spitterPerPage);
}
