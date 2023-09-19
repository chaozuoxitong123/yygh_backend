package com.atguigu.yygh.hosp.repository;

import com.atguigu.yygh.model.hosp.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author malinyan
 * @Date 2023/9/19
 * @Time 10:46
 * @Version 1.0
 */
@Repository
public interface DepartmentRepository extends MongoRepository<Department,String> {
    //上传科室接口
    Department getDepartmentByHoscodeAndDepcode(String hoscode, String depcode);
}
