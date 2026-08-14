package com.sky.service;

import com.sky.dto.OrdersSubmitDTO;
import com.sky.result.PageResult;
import com.sky.vo.OrderSubmitVO;
import com.sky.vo.OrderVO;

public interface OrderService {

    /**
     * 用户下单
     *  @param ordersSubmitDTO
     *  @return
     */
    OrderSubmitVO submitOrder(OrdersSubmitDTO ordersSubmitDTO);

    /**
     * 历史订单查询
     *
     * @param page
     * @param pageSize
     * @param status   订单状态 1待付款 2待接单 3已接单 4派送中 5已完成 6已取消
     * @return
     */
    PageResult pageQueryUser(int page,int pageSize,Integer status);

    /**
     * 查询订单详情
     * @parame id
     * @return
     */
    OrderVO details(Long id);
}
