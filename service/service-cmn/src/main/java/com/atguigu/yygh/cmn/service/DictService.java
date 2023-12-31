package com.atguigu.yygh.cmn.service;

import com.atguigu.yygh.model.cmn.Dict;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author malinyan
 * @Date 2023/9/11
 * @Time 18:22
 * @Version 1.0
 */
public interface DictService extends IService<Dict> {
    //根据数据id查询子数据列表
    List<Dict> findChlidData(Long id);

    /**
     * 导出
     * @param response
     */
    void exportData(HttpServletResponse response);

    void importData(MultipartFile file);

    //根据dictcode和value查询
    String getDictName(String dictcode, String value);
    //根据dict_code查询子节点
    List<Dict> findByDictCode(String dictcode);
}
