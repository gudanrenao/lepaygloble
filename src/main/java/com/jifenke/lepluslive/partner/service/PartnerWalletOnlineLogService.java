package com.jifenke.lepluslive.partner.service;

import com.jifenke.lepluslive.partner.repository.PartnerWalletOnlineLogRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * Created by
 * @Azxf on 2017/11/15.
 */
@Service
public class PartnerWalletOnlineLogService {
    @Inject
    private PartnerWalletOnlineLogRepository partnerWalletOnlineLogRepository;

    /***
     * 获取合伙人当日佣金收入
     * @param partnerId
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public Long countDailyIncomeCommissionByPartner(Long partnerId) {
        return partnerWalletOnlineLogRepository.findIncomeCommissionByPartnerDaily(partnerId);
    }

    /***
     * 获取合伙人当日佣金支出
     * @param partnerId
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public Long countDailyExpendCommissionByPartner(Long partnerId) {
        return partnerWalletOnlineLogRepository.findExpendCommissionByPartnerDaily(partnerId);
    }
}
