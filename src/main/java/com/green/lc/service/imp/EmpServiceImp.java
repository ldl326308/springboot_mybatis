
/*
 * User:liveGreen
 * Date: 2019/5/26
 */

package com.green.lc.service.imp;

import com.green.lc.dao.EmpMapper;
import com.green.lc.entity.Emp;
import com.green.lc.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImp implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public int deleteByPrimaryKey(Integer empId) {
        return empMapper.deleteByPrimaryKey(empId);
    }

    @Override
    public int insert(Emp record) {
        return empMapper.insert(record);
    }

    @Override
    public Emp selectByPrimaryKey(Integer empId) {
        return empMapper.selectByPrimaryKey(empId);
    }

    @Override
    public List<Emp> selectAll() {
        return empMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Emp record) {
        return empMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Emp> selectByIdGreater(Integer empId) {
        return empMapper.selectByIdGreater(empId);
    }
}
