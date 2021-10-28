package edu.spring.naverserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import mybatis.EmpDAO;
import mybatis.EmpMybatisController;

@SpringBootApplication
@ComponentScan(basePackageClasses = EmpMybatisController.class)
@ComponentScan
@MapperScan(basePackageClasses = EmpDAO.class)
public class Kdigital36StsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Kdigital36StsApplication.class, args);
	}

}
