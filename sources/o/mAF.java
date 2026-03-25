package o;

import android.graphics.Outline;
import android.graphics.drawable.shapes.PathShape;

/* JADX INFO: loaded from: classes8.dex */
public class mAF extends PathShape {
    public android.graphics.Path AEQbTJ;

    public mAF(android.graphics.Path path, float f, float f2) {
        super(path, f, f2);
        this.AEQbTJ = path;
    }

    public static mAF EZpvd(float f, float f2, boolean z) {
        android.graphics.Path path = new android.graphics.Path();
        if (z) {
            path.moveTo(0.0f, f2);
            path.lineTo(f, f2);
            path.lineTo(f / 2.0f, 0.0f);
            path.close();
        } else {
            path.moveTo(0.0f, 0.0f);
            path.lineTo(f / 2.0f, f2);
            path.lineTo(f, 0.0f);
            path.close();
        }
        return new mAF(path, f, f2);
    }

    @Override // android.graphics.drawable.shapes.Shape
    public void getOutline(@androidx.annotation.NonNull Outline outline) {
        outline.setConvexPath(this.AEQbTJ);
    }
}
