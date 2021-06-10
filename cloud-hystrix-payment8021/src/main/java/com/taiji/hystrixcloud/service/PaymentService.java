package com.taiji.hystrixcloud.service;

public interface PaymentService {

        /**
         * 正常访问的方法
         * @param id
         * @return
         */
        String paymentInfo_ok(Integer id);

        /**
         * 延迟方法
         * @param id
         * @return
         */
        String paymentInfo_timeout(Integer id);

}
