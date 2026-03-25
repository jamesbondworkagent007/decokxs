package com.okinc.core.glide;

import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* JADX INFO: loaded from: classes8.dex */
public class ImageSize {
    private DownsampleStrategy downsampler;
    private int height;
    private int width;
    public static DownsampleStrategy AT_LEAST = DownsampleStrategy.KWHzl;
    public static DownsampleStrategy NONE = DownsampleStrategy.AhwBna;
    public static DownsampleStrategy AT_MOST = DownsampleStrategy.EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DownsampleStrategy getDownsampler() {
        return this.downsampler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDownsampler(DownsampleStrategy downsampleStrategy) {
        this.downsampler = downsampleStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setHeight(int i) {
        this.height = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setWidth(int i) {
        this.width = i;
    }

    public static ImageSize create() {
        return create(DownsampleStrategy.AhwBna, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static ImageSize create(int i) {
        return create(NONE, i, i);
    }

    public static ImageSize create(int i, int i2) {
        return create(NONE, i, i2);
    }

    public static ImageSize createAtLeastSize(int i, int i2) {
        return create(AT_LEAST, i, i2);
    }

    public static ImageSize createAtLeastSize(int i) {
        return create(AT_LEAST, i, i);
    }

    public static ImageSize createAtMostSize(int i, int i2) {
        return create(AT_MOST, i, i2);
    }

    public static ImageSize createAtMostSize(int i) {
        return create(AT_MOST, i, i);
    }

    public static ImageSize create(DownsampleStrategy downsampleStrategy, int i) {
        ImageSize imageSize = new ImageSize();
        imageSize.setDownsampler(downsampleStrategy);
        imageSize.setWidth(i);
        imageSize.setHeight(i);
        return imageSize;
    }

    public static ImageSize create(DownsampleStrategy downsampleStrategy, int i, int i2) {
        ImageSize imageSize = new ImageSize();
        imageSize.setDownsampler(downsampleStrategy);
        imageSize.setWidth(i);
        imageSize.setHeight(i2);
        return imageSize;
    }

    private ImageSize() {
    }
}
