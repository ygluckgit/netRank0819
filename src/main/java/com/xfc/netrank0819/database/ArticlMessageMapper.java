package com.xfc.netrank0819.database;

import com.xfc.netrank0819.domain.ArticlMessageDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticlMessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticlMessageDO record);

    int insertSelective(ArticlMessageDO record);

    ArticlMessageDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticlMessageDO record);

    int updateByPrimaryKey(ArticlMessageDO record);

    List<ArticlMessageDO> selectList();
}