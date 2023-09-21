package com.atguigu.yygh.hosp.service;

import com.atguigu.yygh.model.hosp.Hospital;
import com.atguigu.yygh.vo.hosp.HospitalQueryVo;
import com.atguigu.yygh.vo.hosp.HospitalSetQueryVo;
import org.springframework.data.domain.Page;

import java.util.Map;

/**
 * @Author malinyan
 * @Date 2023/9/16
 * @Time 21:16
 * @Version 1.0
 */
public interface HospitalService {
    //上传医院接口
    void save(Map<String, Object> paramMap);

    Hospital getByHoscode(String hoscode);

    //医院列表（条件查询带分页）
    Page<Hospital> selectHospPage(Integer page, Integer limit, HospitalQueryVo hospitalQueryVo);

    void updateStatus(String id, Integer status);

    //医院详情信息
    Map<String, Object> getHospById(String id);
}
