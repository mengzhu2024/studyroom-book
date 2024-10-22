package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoweiyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoweiyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoweiyudingView;


/**
 * 座位预订
 *
 */
public interface ZuoweiyudingService extends IService<ZuoweiyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<ZuoweiyudingVO> selectListVO(Wrapper<ZuoweiyudingEntity> wrapper);

   	ZuoweiyudingVO selectVO(@Param("ew") Wrapper<ZuoweiyudingEntity> wrapper);

   	List<ZuoweiyudingView> selectListView(Wrapper<ZuoweiyudingEntity> wrapper);

   	ZuoweiyudingView selectView(@Param("ew") Wrapper<ZuoweiyudingEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoweiyudingEntity> wrapper);

}

