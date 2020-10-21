package com.xux.zoo.elephant.repo.mapper;

import com.xux.zoo.elephant.repo.model.MsgMedia;
import java.util.List;

public interface MsgMediaMapper {
    int deleteByPrimaryKey(Long mediaId);

    int insert(MsgMedia record);

    MsgMedia selectByPrimaryKey(Long mediaId);

    List<MsgMedia> selectAll();

    int updateByPrimaryKey(MsgMedia record);
}