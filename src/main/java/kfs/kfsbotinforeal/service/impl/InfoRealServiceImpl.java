package kfs.kfsbotinforeal.service.impl;

import kfs.kfsbotinforeal.dao.InfoRealDao;
import kfs.kfsbotinforeal.service.InfoRealService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author pavedrim
 */
public class InfoRealServiceImpl implements InfoRealService {

    @Autowired
    InfoRealDao infoRealDao;
}
