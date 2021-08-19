package com.xfc.netrank0819.controller;  /**
 * @title: NewRankController
 * @return
 */


import com.xfc.netrank0819.controller.service.MediaRankService;
import com.xfc.netrank0819.domain.ArticlMessageDO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *@ClassName NewRankController
 *@Description TODO
 *@Author YGuang
 *@Date 2021/7/21 17:35
 *@Version 1.0
 **/

@RestController("/")
public class NewRankController {
    private final MediaRankService mediaRankService;
    public NewRankController(MediaRankService mediaRankService) {
        this.mediaRankService = mediaRankService;
    }
    @PostMapping("/show")
    public List <ArticlMessageDO> show(){
        List <ArticlMessageDO> articlMessageDOS = mediaRankService.showList();
        articlMessageDOS.forEach(a-> System.out.println(a.getAccountName()));
        return articlMessageDOS;
    }
    @PostMapping("/try")
    public ArticlMessageDO find(){
        ArticlMessageDO articlMessageDO = mediaRankService.find();
        return articlMessageDO;
    }
}
