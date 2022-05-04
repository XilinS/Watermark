package com.tools.watermark.service;

import com.tools.watermark.option.Option;

import java.io.InputStream;

public interface IWatermark {
    /**
     * Add a watermark to an image.
     * @param inputImage input an image as InputStream type
     * @param options options for that image, e.g. watermark size, color
     * @return image that contain the watermark
     */
    public byte[] addWatermark(byte[] inputImage, Option... options);

    /**
     * Retrieve the invisible watermark from the image.
     * @param inputImage image that contains invisible watermark
     * @return the content of the watermark
     */
    public byte[] retrieveWatermark(byte[] inputImage);
}
