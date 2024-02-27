package com.jh.EasyExcel;

import com.jh.EasyExcel.easyexcel.ChartAccountDto;
import com.jh.EasyExcel.easyexcel.ExcelDataToListOfObjects;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DecimalFormat;
import java.util.List;

@SpringBootApplication
public class EasyExcelApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyExcelApplication.class, args);
		long init = System.currentTimeMillis();
		System.out.println(init);

		var result = ExcelDataToListOfObjects.excelDataToListOfObjets_withEasyExcel("src/main/resources/1global_chart_of_accounts.xlsx");
		//System.out.println("Results " + result);
		System.out.println("Size " + result.size());


		long end = System.currentTimeMillis();


		System.out.println("\n\n ====================== TOOK : \n" + (end - init) +  " milliseconds");
	}

}
