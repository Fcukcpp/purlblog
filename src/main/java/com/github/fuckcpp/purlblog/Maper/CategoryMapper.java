package com.github.fuckcpp.purlblog.Maper;/*
作者Crying711
日期:2021/1/10
时间:21:33
*/

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.fuckcpp.purlblog.pojo.Admin.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

    /**
     * 根据id修改 type
     * @param id
     * @param value
     * @return
     */
    @Update("update t_category set type =#{type} where id =#{id}")
    public Boolean setpage(@Param("id") Integer id, @Param("type")Integer value) ;


    /**
     *  根据id 修改state
     * @param id
     * @param value
     * @return
     */
    @Update("update t_category set state =#{state} where id =#{id}")
    public Boolean changeState(@Param("id") Integer id, @Param("state")Integer value) ;


    @Select("select  * from t_category where state > 0 and  type = 0;")
    public  List<Category> Reception();

}
