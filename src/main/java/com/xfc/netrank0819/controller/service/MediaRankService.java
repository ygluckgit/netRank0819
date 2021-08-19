package com.xfc.netrank0819.controller.service;  /**
 * @title: MediaRankService
 * @return
 */

import com.xfc.netrank0819.database.ArticlMessageMapper;
import com.xfc.netrank0819.domain.ArticlMessageDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *@ClassName MediaRankService
 *@Description TODO
 *@Author YGuang
 *@Date 2021/8/19 9:54
 *@Version 1.0
 **/

@Service
public class MediaRankService {
    @Resource
    ArticlMessageMapper articlmessageMapper;
    public List <ArticlMessageDO> showList() {
        return articlmessageMapper.selectList();
    }

    public ArticlMessageDO find() {
        return articlmessageMapper.selectByPrimaryKey(2L);
    }
}
