package org.seckill.dao;

import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by ZhuXianfei on 2017/4/27.
 */
public interface SeckillDao {
    /**
     * 减库存，
     *
     * @param seckillId
     * @param killTime
     * @return 如果影响函数>1，表示更新的记录条数
     */
    int reduceNumber(long seckillId, Date killTime);

    /**
     * 根据ID查询秒杀对象
     *
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     *
     * @param offet 偏移量
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offet, int limit);
}
