package org.tensorflow.lite.support.image.ops;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;
import org.tensorflow.lite.support.image.ColorSpaceType;
import org.tensorflow.lite.support.image.ImageOperator;
import org.tensorflow.lite.support.image.TensorImage;

/* JADX INFO: loaded from: classes13.dex */
public class Rot90Op implements ImageOperator {
    private final int numRotation;

    public Rot90Op() {
        this(1);
    }

    public Rot90Op(int i) {
        this.numRotation = i % 4;
    }

    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // org.tensorflow.lite.support.image.ImageOperator, org.tensorflow.lite.support.common.Operator
    public TensorImage apply(TensorImage tensorImage) {
        SupportPreconditions.checkArgument(tensorImage.getColorSpaceType() == ColorSpaceType.RGB, "Only RGB images are supported in Rot90Op, but not " + tensorImage.getColorSpaceType().name());
        Bitmap bitmap = tensorImage.getBitmap();
        if (this.numRotation == 0) {
            return tensorImage;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postTranslate(width * 0.5f, height * 0.5f);
        matrix.postRotate(this.numRotation * (-90));
        int i = this.numRotation % 2;
        matrix.postTranslate((i == 0 ? width : height) * 0.5f, (i == 0 ? height : width) * 0.5f);
        tensorImage.load(Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false));
        return tensorImage;
    }

    @Override // org.tensorflow.lite.support.image.ImageOperator
    public int getOutputImageHeight(int i, int i2) {
        return this.numRotation % 2 == 0 ? i : i2;
    }

    @Override // org.tensorflow.lite.support.image.ImageOperator
    public int getOutputImageWidth(int i, int i2) {
        return this.numRotation % 2 == 0 ? i2 : i;
    }

    @Override // org.tensorflow.lite.support.image.ImageOperator
    public PointF inverseTransform(PointF pointF, int i, int i2) {
        return transformImpl(pointF, getOutputImageHeight(i, i2), getOutputImageWidth(i, i2), (4 - this.numRotation) % 4);
    }

    private static PointF transformImpl(PointF pointF, int i, int i2, int i3) {
        if (i3 == 0) {
            return pointF;
        }
        if (i3 == 1) {
            return new PointF(pointF.y, i2 - pointF.x);
        }
        if (i3 == 2) {
            return new PointF(i2 - pointF.x, i - pointF.y);
        }
        return new PointF(i - pointF.y, pointF.x);
    }
}
