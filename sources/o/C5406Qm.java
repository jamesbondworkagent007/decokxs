package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import java.util.Objects;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: o.Qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5406Qm {
    public static final OG AEQbTJ = new OM() { // from class: o.Qm.4
        @Override // o.OM, o.OG
        public void copydefault(android.graphics.Bitmap bitmap) {
        }
    };

    private C5406Qm() {
    }

    public static OC<android.graphics.Bitmap> copydefault(OG og, android.graphics.drawable.Drawable drawable, int i, int i2) {
        android.graphics.Bitmap bitmapAEQbTJ;
        android.graphics.drawable.Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmapAEQbTJ = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapAEQbTJ = null;
        } else {
            bitmapAEQbTJ = AEQbTJ(og, current, i, i2);
            z = true;
        }
        if (!z) {
            og = AEQbTJ;
        }
        return C5398Qe.copydefault(bitmapAEQbTJ, og);
    }

    public static android.graphics.Bitmap AEQbTJ(OG og, android.graphics.drawable.Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (android.util.Log.isLoggable("DrawableToBitmap", 5)) {
                Objects.toString(drawable);
            }
            return null;
        }
        if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (android.util.Log.isLoggable("DrawableToBitmap", 5)) {
                Objects.toString(drawable);
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        Lock lockKWHzl = QB.KWHzl();
        lockKWHzl.lock();
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(i, i2, Bitmap.Config.ARGB_8888);
        try {
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCopydefault);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapCopydefault;
        } finally {
            lockKWHzl.unlock();
        }
    }
}
