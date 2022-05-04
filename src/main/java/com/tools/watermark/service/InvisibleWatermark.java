package com.tools.watermark.service;

import com.tools.watermark.option.Option;

import java.io.InputStream;
import java.io.OutputStream;

public class InvisibleWatermark implements IWatermark {

    @Override
    public byte[] addWatermark(byte[] inputImage, Option... options) {
        return new byte[0];
    }

    @Override
    public byte[] retrieveWatermark(byte[] inputImage) {
        return new byte[0];
    }
}
