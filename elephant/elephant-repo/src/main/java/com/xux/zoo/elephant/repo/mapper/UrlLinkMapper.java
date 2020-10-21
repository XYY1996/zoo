package com.xux.zoo.elephant.repo.mapper;

import com.xux.zoo.elephant.repo.model.UrlLink;
import java.util.List;

public interface UrlLinkMapper {
    int deleteByPrimaryKey(Integer linkId);

    int insert(UrlLink record);

    UrlLink selectByPrimaryKey(Integer linkId);

    List<UrlLink> selectAll();

    int updateByPrimaryKey(UrlLink record);
}