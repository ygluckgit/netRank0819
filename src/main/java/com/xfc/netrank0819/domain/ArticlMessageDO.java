package com.xfc.netrank0819.domain;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author 
 * 
 */
@Data
@Accessors(chain = true)
public class ArticlMessageDO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 公众号
     */
    private String officalAccount;

    /**
     * 账号名
     */
    private String accountName;

    /**
     * 文章总数
     */
    private Long articlSum;

    /**
     * 文章总增量
     */
    private Long articlAddSum;

    /**
     * 超过10w文章数
     */
    private Long moreTenw;

    /**
     * 超过10w文章数增量
     */
    private Long moreTenwAdd;

    /**
     * 阅读总数
     */
    private Long readSum;

    /**
     * 阅读总量增量
     */
    private Long readAddSum;

    /**
     * 平均阅读数
     */
    private Long aveRead;

    /**
     * 平均阅读增量
     */
    private Long aveReadAdd;

    /**
     * 在看总数
     */
    private Long readNow;

    /**
     * 在看总数增量
     */
    private Long readNowAdd;

    /**
     * 平均在看数
     */
    private Long aveReadNow;

    /**
     * 平均在看增量
     */
    private Long aveReadNowAdd;

    /**
     * 发布次数
     */
    private Long replaySum;

    /**
     * 发布次数增量
     */
    private Long replayAddSum;

    /**
     * 头条阅读量
     */
    private Long headlineReadSum;

    /**
     * 头条阅读增量
     */
    private Long headlineReadSumAdd;

    /**
     * 头条在看数
     */
    private Long headlineReadNow;

    /**
     * 最大阅读数
     */
    private Long largestRead;

    /**
     * 最大在看数
     */
    private Long largestReadNow;

    /**
     * 在看率
     */
    private String readedPro;

    /**
     * 点赞总数
     */
    private Long likeSum;

    /**
     * 点赞增量
     */
    private Long likeAddSum;

    /**
     * 最大点赞数
     */
    private Long largestLikeSum;

    /**
     * 头条点赞数
     */
    private Long headlineLikeSum;

    /**
     * 平均点赞数
     */
    private Long aveLikeSum;

    /**
     * 平均点赞增量
     */
    private Double aveLikeAddSum;

    /**
     * wci
     */
    private Double wci;

    /**
     * wci增量
     */
    private Long wciAdd;

    /**
     * 总排名
     */
    private Long rank;

    /**
     * 总排名增量
     */
    private Long rankAdd;

    private Byte isDelete;

    private static final long serialVersionUID = 1L;
}