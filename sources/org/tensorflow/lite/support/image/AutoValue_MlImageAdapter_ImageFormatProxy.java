package org.tensorflow.lite.support.image;

import org.tensorflow.lite.support.image.MlImageAdapter;

/* JADX INFO: loaded from: classes25.dex */
final class AutoValue_MlImageAdapter_ImageFormatProxy extends MlImageAdapter.ImageFormatProxy {
    private final ColorSpaceType colorSpaceType;
    private final int imageFormat;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.tensorflow.lite.support.image.MlImageAdapter.ImageFormatProxy
    public ColorSpaceType getColorSpaceType() {
        return this.colorSpaceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.tensorflow.lite.support.image.MlImageAdapter.ImageFormatProxy
    public int getImageFormat() {
        return this.imageFormat;
    }

    public AutoValue_MlImageAdapter_ImageFormatProxy(ColorSpaceType colorSpaceType, int i) {
        if (colorSpaceType == null) {
            throw new NullPointerException("Null colorSpaceType");
        }
        this.colorSpaceType = colorSpaceType;
        this.imageFormat = i;
    }

    public String toString() {
        return "ImageFormatProxy{colorSpaceType=" + this.colorSpaceType + ", imageFormat=" + this.imageFormat + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MlImageAdapter.ImageFormatProxy)) {
            return false;
        }
        MlImageAdapter.ImageFormatProxy imageFormatProxy = (MlImageAdapter.ImageFormatProxy) obj;
        return this.colorSpaceType.equals(imageFormatProxy.getColorSpaceType()) && this.imageFormat == imageFormatProxy.getImageFormat();
    }

    public int hashCode() {
        return ((this.colorSpaceType.hashCode() ^ 1000003) * 1000003) ^ this.imageFormat;
    }
}
