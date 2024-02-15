package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
  @author   Sofiia
  @project   ArabicTooRoman
  @class  ConverterToRomanTest
  @version  1.0.0 
  @since 15.02.2024 - 19.33
*/class ConverterToRomanTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void whenRomanToArabicIsEmptyInput() {
        ConverterToRoman.romanToInteger("");
    }

    @Test
    public void whenRomanToArabicIsNull() {
        ConverterToRoman.romanToInteger(null);
    }

    @Test
    public void whenRomanToArabicIsHasInvalidInput() {
        ConverterToRoman.romanToInteger("XXIXZ");
    }

    @Test
    public void whenRomanToArabicIsNumber() {
        ConverterToRoman.romanToInteger("123");
    }


    @Test
    public void whenRomanIIIthenArabic3() {
        String romanNumeral = "III";
        int expectedResult = 3;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanIVthenArabic4() {
        String romanNumeral = "IV";
        int expectedResult = 4;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanVthenArabic5() {
        String romanNumeral = "V";
        int expectedResult = 5;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanVIthenArabic6() {
        String romanNumeral = "VI";
        int expectedResult = 6;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanIXthenArabic9() {
        String romanNumeral = "IX";
        int expectedResult = 9;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanXthenArabic10() {
        String romanNumeral = "X";
        int expectedResult = 10;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanXIIthenArabic12() {
        String romanNumeral = "XII";
        int expectedResult = 12;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanXIVthenArabic14() {
        String romanNumeral = "XIV";
        int expectedResult = 14;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanXXthenArabic20() {
        String romanNumeral = "XX";
        int expectedResult = 20;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanXXVIIthenArabic27() {
        String romanNumeral = "XXVII";
        int expectedResult = 27;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanXLIXthenArabic49() {
        String romanNumeral = "XLIX";
        int expectedResult = 49;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanLthenArabic50() {
        String romanNumeral = "L";
        int expectedResult = 50;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanXCthenArabic90() {
        String romanNumeral = "XC";
        int expectedResult = 90;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanCLXthenArabic160() {
        String romanNumeral = "CLX";
        int expectedResult = 160;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanCDthenArabic400() {
        String romanNumeral = "CD";
        int expectedResult = 400;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanMMDCLXVIthenArabic2666() {
        String romanNumeral = "MMDCLXVI";
        int expectedResult = 2666;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanMMMMMthenArabic5000() {
        String romanNumeral = "MMMMM";
        int expectedResult = 5000;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanDMthenArabic500() {
        String romanNumeral = "DM";
        int expectedResult = 500;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanDMCthenArabic600() {
        String romanNumeral = "DMC";
        int expectedResult = 600;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanCLXthenArabic1600() {
        String romanNumeral = "CLX";
        int expectedResult = 160;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanCDthenArabic4000() {
        String romanNumeral = "CD";
        int expectedResult = 400;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanMMDCLXVIthenArabic26660() {
        String romanNumeral = "MMDCLXVI";
        int expectedResult = 2666;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanMMMMMthenArabic50000() {
        String romanNumeral = "MMMMM";
        int expectedResult = 5000;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanDMthenArabic5000() {
        String romanNumeral = "DM";
        int expectedResult = 500;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanDMCthenArabic6000() {
        String romanNumeral = "DMC";
        int expectedResult = 600;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanDMCthenArabic6001() {
        String romanNumeral = "DMC";
        int expectedResult = 600;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanCLXthenArabic16001() {
        String romanNumeral = "CLX";
        int expectedResult = 160;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanCDthenArabic40001() {
        String romanNumeral = "CD";
        int expectedResult = 400;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanMMDCLXVIthenArabic266601() {
        String romanNumeral = "MMDCLXVI";
        int expectedResult = 2666;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanMMMMMthenArabic500001() {
        String romanNumeral = "MMMMM";
        int expectedResult = 5000;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanDMthenArabic50001() {
        String romanNumeral = "DM";
        int expectedResult = 500;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanDMCthenArabic60001() {
        String romanNumeral = "DMC";
        int expectedResult = 600;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanMMDCLXVIthenArabic2666012() {
        String romanNumeral = "MMDCLXVI";
        int expectedResult = 2666;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanMMMMMthenArabic5000012() {
        String romanNumeral = "MMMMM";
        int expectedResult = 5000;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanDMthenArabic500012() {
        String romanNumeral = "DM";
        int expectedResult = 500;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenRomanDMCthenArabic600012() {
        String romanNumeral = "DMC";
        int expectedResult = 600;
        int actualResult = ConverterToRoman.romanToInteger(romanNumeral);
        assertEquals(expectedResult, actualResult);
    }


}