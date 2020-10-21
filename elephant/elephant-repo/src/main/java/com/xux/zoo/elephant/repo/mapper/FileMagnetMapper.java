package com.xux.zoo.elephant.repo.mapper;

import com.xux.zoo.elephant.repo.model.FileMagnet;
import java.util.List;

public interface FileMagnetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FileMagnet record);

    FileMagnet selectByPrimaryKey(Integer id);

    List<FileMagnet> selectAll();

    int updateByPrimaryKey(FileMagnet record);
}