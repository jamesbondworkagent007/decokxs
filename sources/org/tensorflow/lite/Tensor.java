package org.tensorflow.lite;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public interface Tensor {
    ByteBuffer asReadOnlyBuffer();

    DataType dataType();

    int index();

    String name();

    int numBytes();

    int numDimensions();

    int numElements();

    QuantizationParams quantizationParams();

    int[] shape();

    int[] shapeSignature();

    public static class QuantizationParams {
        private final float scale;
        private final int zeroPoint;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public float getScale() {
            return this.scale;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getZeroPoint() {
            return this.zeroPoint;
        }

        public QuantizationParams(float f, int i) {
            this.scale = f;
            this.zeroPoint = i;
        }
    }
}
