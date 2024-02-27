package com.jh.EasyExcel.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ChartAccountDto {


    @ExcelProperty("Entity")
    private String entity;

    @ExcelProperty("currency")
    private String currency;

    @ExcelProperty("product")
    private String product;

    @ExcelProperty("financialBeahaviour")
    private String financialBeahaviour;


}
