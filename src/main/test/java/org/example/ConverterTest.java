package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void testConvert1() {
        assertEquals("I", Converter.convertArabicToRoman(1));
    }

    @Test
    public void testConvert2() {
        assertEquals("II", Converter.convertArabicToRoman(2));
    }

    @Test
    public void testConvert3() {
        assertEquals("III", Converter.convertArabicToRoman(3));
    }

    @Test
    public void testConvert4() {
        assertEquals("IV", Converter.convertArabicToRoman(4));
    }

    @Test
    public void testConvert5() {
        assertEquals("V", Converter.convertArabicToRoman(5));
    }

    @Test
    public void testConvert9() {
        assertEquals("IX", Converter.convertArabicToRoman(9));
    }

    @Test
    public void testConvert10() {
        assertEquals("X", Converter.convertArabicToRoman(10));
    }

    @Test
    public void testConvert40() {
        assertEquals("XL", Converter.convertArabicToRoman(40));
    }

    @Test
    public void testConvert50() {
        assertEquals("L", Converter.convertArabicToRoman(50));
    }

    @Test
    public void testConvert90() {
        assertEquals("XC", Converter.convertArabicToRoman(90));
    }

    @Test
    public void testConvert100() {
        assertEquals("C", Converter.convertArabicToRoman(100));
    }

    @Test
    public void testConvert400() {
        assertEquals("CD", Converter.convertArabicToRoman(400));
    }

    @Test
    public void testConvert500() {
        assertEquals("D", Converter.convertArabicToRoman(500));
    }

    @Test
    public void testConvert900() {
        assertEquals("CM", Converter.convertArabicToRoman(900));
    }

    @Test
    public void testConvert1000() {
        assertEquals("M", Converter.convertArabicToRoman(1000));
    }

    @Test
    public void testConvert3999() {
        assertEquals("MMMCMXCIX", Converter.convertArabicToRoman(3999));
    }

    @Test
    public void testConvert2019() {
        assertEquals("MMXIX", Converter.convertArabicToRoman(2019));
    }

    @Test
    public void testConvert2024() {
        assertEquals("MMXXIV", Converter.convertArabicToRoman(2024));
    }

    @Test
    public void testConvert399() {
        assertEquals("CCCXCIX", Converter.convertArabicToRoman(399));
    }

    @Test
    public void testConvert888() {
        assertEquals("DCCCLXXXVIII", Converter.convertArabicToRoman(888));
    }

    @Test
    public void testConvert1111() {
        assertEquals("MCXI", Converter.convertArabicToRoman(1111));
    }

    @Test
    public void testConvert2022() {
        assertEquals("MMXXII", Converter.convertArabicToRoman(2022));
    }

    @Test
    public void testConvert2500() {
        assertEquals("MMD", Converter.convertArabicToRoman(2500));
    }

    @Test
    public void testConvert3000() {
        assertEquals("MMM", Converter.convertArabicToRoman(3000));
    }

    @Test
    public void testConvert1666() {
        assertEquals("MDCLXVI", Converter.convertArabicToRoman(1666));
    }

    @Test
    public void testConvert1001() {
        assertEquals("MI", Converter.convertArabicToRoman(1001));
    }

    @Test
    public void testConvert299() {
        assertEquals("CCXCIX", Converter.convertArabicToRoman(299));
    }

    @Test
    public void testConvert999() {
        assertEquals("CMXCIX", Converter.convertArabicToRoman(999));
    }

    @Test
    public void testConvert888888() {
        assertEquals("DCCCCLXXXVIII", Converter.convertArabicToRoman(888888));
    }

    @Test
    public void testConvert20() {
        assertEquals("XX", Converter.convertArabicToRoman(20));
    }

    @Test
    public void testConvert21() {
        assertEquals("XXI", Converter.convertArabicToRoman(21));
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void convertArabicToRoman() {
    }
}