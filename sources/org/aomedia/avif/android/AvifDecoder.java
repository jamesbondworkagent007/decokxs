package org.aomedia.avif.android;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes24.dex */
public class AvifDecoder {
    private boolean alphaPresent;
    private long decoder;
    private int depth;
    private int frameCount;
    private double[] frameDurations;
    private int height;
    private int repetitionCount;
    private int width;

    public static class Info {
        public boolean alphaPresent;
        public int depth;
        public int height;
        public int width;
    }

    public static native boolean decode(ByteBuffer byteBuffer, int i, Bitmap bitmap, int i2);

    public static native boolean getInfo(ByteBuffer byteBuffer, int i, Info info);

    public static native boolean isAvifImage(ByteBuffer byteBuffer, int i);

    public static native String resultToString(int i);

    public static native String versionString();

    public native long createDecoder(ByteBuffer byteBuffer, int i, int i2);

    public native void destroyDecoder(long j);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getAlphaPresent() {
        return this.alphaPresent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getDepth() {
        return this.depth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getFrameCount() {
        return this.frameCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public double[] getFrameDurations() {
        return this.frameDurations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getRepetitionCount() {
        return this.repetitionCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getWidth() {
        return this.width;
    }

    public native int nextFrame(long j, Bitmap bitmap);

    public native int nextFrameIndex(long j);

    public native int nthFrame(long j, int i, Bitmap bitmap);

    static {
        try {
            System.loadLibrary("avif_android");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private AvifDecoder(ByteBuffer byteBuffer, int i) {
        this.decoder = createDecoder(byteBuffer, byteBuffer.remaining(), i);
    }

    public static boolean isAvifImage(ByteBuffer byteBuffer) {
        return isAvifImage(byteBuffer, byteBuffer.remaining());
    }

    public static boolean decode(ByteBuffer byteBuffer, int i, Bitmap bitmap) {
        return decode(byteBuffer, i, bitmap, 0);
    }

    public void release() {
        long j = this.decoder;
        if (j != 0) {
            destroyDecoder(j);
        }
        this.decoder = 0L;
    }

    public static AvifDecoder create(ByteBuffer byteBuffer) {
        return create(byteBuffer, 1);
    }

    public static AvifDecoder create(ByteBuffer byteBuffer, int i) {
        AvifDecoder avifDecoder = new AvifDecoder(byteBuffer, i);
        if (avifDecoder.decoder == 0) {
            return null;
        }
        return avifDecoder;
    }

    public int nextFrame(Bitmap bitmap) {
        return nextFrame(this.decoder, bitmap);
    }

    public int nextFrameIndex() {
        return nextFrameIndex(this.decoder);
    }

    public int nthFrame(int i, Bitmap bitmap) {
        return nthFrame(this.decoder, i, bitmap);
    }
}
