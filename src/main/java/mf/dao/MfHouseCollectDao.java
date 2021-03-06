package mf.dao;

import mf.entity.MfHouseCollectEntity;
import mf.entity.MfHouseInfoEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author dengfan
 * @email 283105211@qq.com
 * @date 2017-03-05 22:33:19
 */
public interface MfHouseCollectDao extends BaseDao<MfHouseCollectEntity> {

    List<MfHouseInfoEntity> queryMyCollect(Map<String, Object> map);

    void del(MfHouseCollectEntity entity);
}
