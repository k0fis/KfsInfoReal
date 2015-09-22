package kfs.kfsbotinforeal.dao.jpa;

import kfs.kfsbotinforeal.dao.InfoRealDao;
import kfs.kfsbotinforeal.domain.InfoReal;
import kfs.springutils.BaseDaoJpa;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pavedrim
 */
@Repository
public class InfoRealDaoJpa extends BaseDaoJpa<InfoReal, Long> implements InfoRealDao{

    @Override
    protected Class<InfoReal> getDataClass() {
        return InfoReal.class;
    }

    @Override
    protected Long getId(InfoReal data) {
        return data.getId();
    }

}
