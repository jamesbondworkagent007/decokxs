package o;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: o.mxQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33487mxQ {

    /* JADX INFO: renamed from: o.mxQ$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public interface StateListAnimator {
        void AEQbTJ(android.view.View view);
    }

    public static void EZpvd(android.view.View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static void OLrzqt(android.view.View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static android.graphics.Bitmap AEQbTJ(android.view.View view, android.view.View view2) {
        android.graphics.Bitmap bitmapCopydefault = copydefault(C33570myu.copydefault(view, true), C33570myu.copydefault(view2, true));
        view.destroyDrawingCache();
        view2.destroyDrawingCache();
        return bitmapCopydefault;
    }

    public static android.graphics.Bitmap OLrzqt(android.view.View... viewArr) {
        if (viewArr == null || viewArr.length == 0) {
            return null;
        }
        android.graphics.Bitmap[] bitmapArr = new android.graphics.Bitmap[viewArr.length];
        for (int i = 0; i < viewArr.length; i++) {
            android.graphics.Bitmap bitmapCopydefault = C33570myu.copydefault(viewArr[i], true);
            bitmapArr[i] = bitmapCopydefault;
            if (bitmapCopydefault == null) {
                bitmapArr[i] = C33570myu.AEQbTJ(viewArr[i], true);
            }
        }
        android.graphics.Bitmap bitmapAEQbTJ = AEQbTJ(bitmapArr);
        for (android.view.View view : viewArr) {
            view.destroyDrawingCache();
        }
        return bitmapAEQbTJ;
    }

    public static android.graphics.Bitmap AEQbTJ(android.graphics.Bitmap... bitmapArr) {
        if (bitmapArr == null || bitmapArr.length == 0) {
            return null;
        }
        android.graphics.Bitmap bitmap = null;
        int height = 0;
        for (android.graphics.Bitmap bitmap2 : bitmapArr) {
            if (bitmap2 != null) {
                if (bitmap == null) {
                    bitmap = bitmap2;
                }
                height += bitmap2.getHeight();
            }
        }
        if (bitmap == null) {
            return null;
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap.getWidth(), height, bitmap.getConfig());
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        int height2 = 0;
        for (int i = 0; i < bitmapArr.length; i++) {
            android.graphics.Bitmap bitmap3 = bitmapArr[i];
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, 0.0f, height2, (android.graphics.Paint) null);
                height2 += bitmapArr[i].getHeight();
            }
        }
        for (android.graphics.Bitmap bitmap4 : bitmapArr) {
            if (bitmap4 != null) {
                bitmap4.recycle();
            }
        }
        return bitmapCreateBitmap;
    }

    public static android.graphics.Bitmap OLrzqt(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            return null;
        }
        int width = bitmap2.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(width, bitmap2.getHeight() + height, bitmap2.getConfig());
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        canvas.drawBitmap(bitmap2, 0.0f, height, (android.graphics.Paint) null);
        bitmap.recycle();
        bitmap2.recycle();
        return bitmapCreateBitmap;
    }

    public static android.graphics.Bitmap copydefault(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            return null;
        }
        int width = bitmap2.getWidth();
        int height = bitmap.getHeight();
        int height2 = bitmap2.getHeight();
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(width, height, bitmap2.getConfig());
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        canvas.drawBitmap(bitmap2, 0.0f, height - height2, (android.graphics.Paint) null);
        bitmap.recycle();
        bitmap2.recycle();
        return bitmapCreateBitmap;
    }

    public static boolean OLrzqt(android.graphics.Bitmap bitmap, java.io.File file) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream;
        boolean z = false;
        if (bitmap == null || file == null) {
            return false;
        }
        if (file.exists()) {
            file.delete();
        }
        if (file.isDirectory()) {
            return false;
        }
        boolean z2 = bitmap.getConfig() == Bitmap.Config.RGB_565;
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(file);
            } catch (java.lang.Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
            }
            try {
                try {
                    boolean zCompress = bitmap.compress(z2 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                    try {
                        fileOutputStream.flush();
                        try {
                            fileOutputStream.close();
                            return zCompress;
                        } catch (java.io.IOException e) {
                            e = e;
                            android.util.Log.getStackTraceString(e);
                            return zCompress;
                        }
                    } catch (java.io.IOException e2) {
                        z = zCompress;
                        e = e2;
                        fileOutputStream2 = fileOutputStream;
                        android.util.Log.getStackTraceString(e);
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (java.io.IOException e3) {
                                e = e3;
                                zCompress = z;
                                android.util.Log.getStackTraceString(e);
                                return zCompress;
                            }
                        }
                        return z;
                    }
                } catch (java.io.IOException e4) {
                    e = e4;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (java.io.IOException e5) {
                        android.util.Log.getStackTraceString(e5);
                    }
                }
                throw th;
            }
        } catch (java.io.IOException e6) {
            e = e6;
        }
    }

    public static java.lang.String KWHzl(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        Bitmap.Config config = bitmap.getConfig();
        bitmap.compress((config == null || config != Bitmap.Config.RGB_565) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
        return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    public static android.graphics.Bitmap EZpvd(android.graphics.Bitmap bitmap, float f) {
        try {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            android.graphics.Paint paint = new android.graphics.Paint();
            android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            RectF rectF = new RectF(new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(ViewCompat.MEASURED_STATE_MASK);
            canvas.drawRoundRect(rectF, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), rect, paint);
            return bitmapCreateBitmap;
        } catch (java.lang.Exception unused) {
            return bitmap;
        }
    }

    public static android.graphics.Bitmap OLrzqt(android.content.Context context, int i, int i2, int i3, boolean z, StateListAnimator stateListAnimator) {
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(i, (android.view.ViewGroup) null);
        if (stateListAnimator != null) {
            stateListAnimator.AEQbTJ(viewInflate);
        }
        EZpvd(viewInflate, i2, i3);
        return C33570myu.copydefault(viewInflate, z);
    }

    public static android.graphics.Bitmap copydefault(android.content.Context context, android.view.View view, int i, int i2, boolean z, StateListAnimator stateListAnimator) {
        if (stateListAnimator != null) {
            stateListAnimator.AEQbTJ(view);
        }
        EZpvd(view, i, i2);
        return C33570myu.copydefault(view, z);
    }
}
