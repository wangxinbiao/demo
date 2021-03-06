package com.example.demo.service;

import com.example.demo.domain.Employee;
import com.example.demo.domain.Page;
import com.example.demo.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by WangXinbiao on 2018/12/13
 */
@Service
public class EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    public Integer insert(Employee employee){
        return employeeMapper.insert(employee);
    }

    public Employee select(Employee employee){
        return employeeMapper.selectOne(employee);
    }

    public Integer update(Employee employee){
        return employeeMapper.updateById(employee);
    }

    public List<Employee> selectAll(Page page){
        return employeeMapper.selectAll(page);
    }

    public int selectCount(Employee employee){
        return employeeMapper.selectCount(employee);
    }

    public int selectA(Employee employee,String companyCode){
        return employeeMapper.selectA(employee,companyCode);
    }

    public String queryCurrTime(){
        return employeeMapper.queryCurrTime();
    }

    public String query(String date){
        return employeeMapper.query(date);
    }
}
