
/*
 * User:liveGreen
 * Date: 2019/5/26
 */

package com.green.lc.controller;

import com.green.lc.entity.Emp;
import com.green.lc.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    /**
     * 通过ID删除对象
     * @param empId
     * @return
     */
    @DeleteMapping("/emp/{empId}")
    public int deleteByPrimaryKey(@PathVariable("empId") Integer empId){
        return empService.deleteByPrimaryKey(empId);
    }

    /**
     * 添加一个对象
     * @param record
     * @return
     */
    @PostMapping("/emp")
    public int insert(Emp record){
        return empService.insert(record);
    }

    /**
     * 根据ID查询数据
     * @param empId
     * @return
     */
    @GetMapping("/emp/{empId}")
    public Emp selectByPrimaryKey(@PathVariable("empId") Integer empId){
        return empService.selectByPrimaryKey(empId);
    }

    /**
     * 查询所有数据
     * @return
     */
    @GetMapping("/emp")
    public List<Emp> selectAll(){
        return empService.selectAll();
    }

    /**
     * 修改对象
     * @param record
     * @return
     */
    @PutMapping("/emp")
    public int updateByPrimaryKey(Emp record){
        return empService.updateByPrimaryKey(record);
    }

    /**
     * 查询大于传入ID的数据
     * @param empId
     * @return
     */
    @GetMapping("/emp/greater/{empId}")
    public List<Emp> selectByIdGreater(@PathVariable("empId") Integer empId){
        return empService.selectByIdGreater(empId);
    }

}
