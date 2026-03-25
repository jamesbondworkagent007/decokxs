package org.tensorflow.lite.support.image;

import org.tensorflow.lite.support.image.ImageProperties;

/* JADX INFO: loaded from: classes25.dex */
final class AutoValue_ImageProperties extends ImageProperties {
    private final ColorSpaceType colorSpaceType;
    private final int height;
    private final int width;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.tensorflow.lite.support.image.ImageProperties
    public ColorSpaceType getColorSpaceType() {
        return this.colorSpaceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.tensorflow.lite.support.image.ImageProperties
    public int getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.tensorflow.lite.support.image.ImageProperties
    public int getWidth() {
        return this.width;
    }

    private AutoValue_ImageProperties(int i, int i2, ColorSpaceType colorSpaceType) {
        this.height = i;
        this.width = i2;
        this.colorSpaceType = colorSpaceType;
    }

    public String toString() {
        return "ImageProperties{height=" + this.height + ", width=" + this.width + ", colorSpaceType=" + this.colorSpaceType + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageProperties)) {
            return false;
        }
        ImageProperties imageProperties = (ImageProperties) obj;
        return this.height == imageProperties.getHeight() && this.width == imageProperties.getWidth() && this.colorSpaceType.equals(imageProperties.getColorSpaceType());
    }

    public int hashCode() {
        int i = this.height;
        return ((((i ^ 1000003) * 1000003) ^ this.width) * 1000003) ^ this.colorSpaceType.hashCode();
    }

    public static final class Builder extends ImageProperties.Builder {
        private ColorSpaceType colorSpaceType;
        private Integer height;
        private Integer width;

        @Override // org.tensorflow.lite.support.image.ImageProperties.Builder
        public ImageProperties.Builder setHeight(int i) {
            this.height = Integer.valueOf(i);
            return this;
        }

        @Override // org.tensorflow.lite.support.image.ImageProperties.Builder
        public ImageProperties.Builder setWidth(int i) {
            this.width = Integer.valueOf(i);
            return this;
        }

        @Override // org.tensorflow.lite.support.image.ImageProperties.Builder
        public ImageProperties.Builder setColorSpaceType(ColorSpaceType colorSpaceType) {
            if (colorSpaceType == null) {
                throw new NullPointerException("Null colorSpaceType");
            }
            this.colorSpaceType = colorSpaceType;
            return this;
        }

        @Override // org.tensorflow.lite.support.image.ImageProperties.Builder
        public ImageProperties autoBuild() {
            String str = "";
            if (this.height == null) {
                str = " height";
            }
            if (this.width == null) {
                str = str + " width";
            }
            if (this.colorSpaceType == null) {
                str = str + " colorSpaceType";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_ImageProperties(this.height.intValue(), this.width.intValue(), this.colorSpaceType);
        }
    }
}
