package com.wss.controller;

import com.wss.Dao.FinanceLogDao;
import com.wss.Do.FinanceLogDo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @ClassName:
 * @desc:
 * @author: jintao
 * @date: 2017-12-20 下午4:46
 **/
@RestController
public class FinanceLogController {
    private static final Logger logger = LoggerFactory.getLogger(FinanceLogController.class);
    @Autowired
    private FinanceLogDao financeLogDao;

    @RequestMapping(value = {"queryFinanceLog"}, method = RequestMethod.GET)
    public String queryFinanceLog(Integer id) {
        Optional<FinanceLogDo> financeLogDoOptional = Optional.ofNullable(financeLogDao.findOne(id));
        return financeLogDoOptional.orElse(new FinanceLogDo()).toString();
    }

}
