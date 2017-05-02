package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * Created by ZhuXianfei on 2017/4/27.
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细，可过滤重复
     *
     * @param seckillId
     * @param userPhone
     * @return 插入的行数
     */
    int insertSuccessKilled(long seckillId, long userPhone);

    /**
     * 根据Id查询SuccessKilled并携带秒杀产品对象实例
     *
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);


}
