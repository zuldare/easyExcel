package com.jh.EasyExcel.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ExcelDataToListOfObjects {


    public static List<ChartAccountDto> excelDataToListOfObjets_withEasyExcel(String fileLocation){
        return EasyExcel.read(new File(fileLocation)).sheet("Global chart of accounts").doReadSync();
    }

    public static List<ChartAccountDto> excelDataToListOfObjets_withEasyExcelByBatch(String fileLocation){
        List<ChartAccountDto> result = new ArrayList<>();
        var rowsPerBatch = 100;
        PageReadListener<ChartAccountDto> listener = new PageReadListener<>(voList ->{
            result.addAll( voList );
        }, rowsPerBatch);
        EasyExcel.read(new File(fileLocation), ChartAccountDto.class, listener).sheet().doRead();
        return result;
    }
}
