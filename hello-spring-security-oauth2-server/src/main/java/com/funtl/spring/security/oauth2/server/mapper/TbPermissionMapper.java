package com.funtl.spring.security.oauth2.server.mapper;

import com.funtl.spring.security.oauth2.server.domain.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;
import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {
    List<TbPermission> selectByUserId(@Param("id") Long id);
}