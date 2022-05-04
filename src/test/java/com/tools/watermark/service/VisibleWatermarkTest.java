package com.tools.watermark.service;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class VisibleWatermarkTest {
    private VisibleWatermark watermark = new VisibleWatermark();
    @Test
    void addWatermarkTest() throws FileNotFoundException {
        File file = new File("filepath");
        InputStream inputStream = new FileInputStream(file);
        // 1. transform inputStream to bytes

        // 2. call watermark.addWatermark() to add watermark
        // 3. save the result to a file

    }
}