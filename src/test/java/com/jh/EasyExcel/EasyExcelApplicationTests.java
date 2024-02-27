package com.jh.EasyExcel;

import com.jh.EasyExcel.easyexcel.ChartAccountDto;
import com.jh.EasyExcel.easyexcel.ExcelDataToListOfObjects;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;


class EasyExcelApplicationTests {

	@Test
	public void whenParsingExcelFileWithEasyExcel_thenConvertsToList() {
		List<ChartAccountDto> results = ExcelDataToListOfObjects.excelDataToListOfObjets_withEasyExcel("src/main/resources/1global_chart_of_accounts.xlsx");
		assertNotNull(results);
//		assertEquals("Beverages", results.get(0).getCategory());
//		assertEquals("Dairy", results.get(3).getCategory());
	}
/*
	@Test
	public void whenParsingExcelFileWithEasyExcelByBatch_thenConvertsToList() {
		List<FoodInfo> foodInfoList = ExcelDataToListOfObjectsEasyExcel.excelDataToListOfObjets_withEasyExcelByBatch("src/main/resources/food_info.xlsx");

		assertEquals("Beverages", foodInfoList.get(0).getCategory());
		assertEquals("Dairy", foodInfoList.get(3).getCategory());
	}

	@Test
	public void whenParsingExcelFileWithEasyExcelEasyPoi_thenConvertsToList(){
		List<FoodInfo> foodInfoList = ExcelDataToListOfObjectsEasyPoi.excelDataToListOfObjets_withEasyPoi("src/main/resources/food_info.xlsx");

		assertEquals("Beverages", foodInfoList.get(0).getCategory());
		assertEquals("Dairy", foodInfoList.get(3).getCategory());
	}
	*/

}
