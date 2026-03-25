package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.uhD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49045uhD {
    public static final C49045uhD EZpvd = new C49045uhD();

    private C49045uhD() {
    }

    public final android.graphics.Bitmap copydefault(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        try {
            int iCopydefault = C56548yJl.copydefault(drawable.getIntrinsicWidth(), 1);
            int iCopydefault2 = C56548yJl.copydefault(drawable.getIntrinsicHeight(), 1);
            android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
            drawableMutate.setBounds(0, 0, iCopydefault, iCopydefault2);
            Intrinsics.checkNotNullExpressionValue(drawableMutate, "");
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iCopydefault, iCopydefault2, Bitmap.Config.ARGB_8888);
            drawableMutate.draw(new android.graphics.Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        } catch (java.lang.OutOfMemoryError e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
