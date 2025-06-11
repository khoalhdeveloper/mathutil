package com.giaolang.util.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import javax.management.ConstructorParameters;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTest {
//CHUAN BI BO DÂT ĐỂ RIÊNG GỌI LÀ DATA DRIVEN
    //FILL VÀO HÀM SO SÁNH T TESTING
    //FILL VÀO QUA THAM SỐ HÀM - HÀM LÀM VIỆC VỚI NHIỀU DATA
    //DDT CÒN GỌI TÊN KHÁC ; PARAMETERIZED TESTING . KIỂM THỬ THEO KIỂU THAM SỐ HÓA
    // BỘ DATA NẰM TRONG HÀM STATIC - TĨNH MỘT CHỖ ĐỂ DỄ LẤY
    //BỘ DATA THƯỜNG LÀ MẢNG 2 CHIỀU VÌ NÓ CÓ GIÁ TRỊ VÀO VÀ GT TRẢ VỀ
    public static Object[][] initData() {
        return new Object[][]{{0,1},
                              {1,1},
                              {2,2},
                              {3,6},
                              {4,24},
                              {5,120}};
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgsRunsWell(int n, long expected){
        assertEquals(expected,MathUtility.getFactorial(n));

    }
}