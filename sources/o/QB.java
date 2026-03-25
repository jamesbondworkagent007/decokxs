package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class QB {
    public static final Lock AEQbTJ;
    public static final android.graphics.Paint EZpvd;
    public static final java.util.Set<java.lang.String> OLrzqt;
    public static final android.graphics.Paint KWHzl = new android.graphics.Paint(6);
    public static final android.graphics.Paint copydefault = new android.graphics.Paint(7);

    public interface TaskDescription {
        void AEQbTJ(android.graphics.Canvas canvas, android.graphics.Paint paint, RectF rectF);
    }

    public static int AEQbTJ(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return SubsamplingScaleImageView.ORIENTATION_270;
            default:
                return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Lock KWHzl() {
        return AEQbTJ;
    }

    public static boolean copydefault(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        OLrzqt = hashSet;
        AEQbTJ = hashSet.contains(android.os.Build.MODEL) ? new ReentrantLock() : new Activity();
        android.graphics.Paint paint = new android.graphics.Paint(7);
        EZpvd = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private QB() {
    }

    public static android.graphics.Bitmap AEQbTJ(@androidx.annotation.NonNull OG og, @androidx.annotation.NonNull android.graphics.Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(i, i2, AEQbTJ(bitmap));
        EZpvd(bitmap, bitmapCopydefault);
        AEQbTJ(bitmap, bitmapCopydefault, matrix);
        return bitmapCopydefault;
    }

    public static android.graphics.Bitmap EZpvd(@androidx.annotation.NonNull OG og, @androidx.annotation.NonNull android.graphics.Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float fMin = java.lang.Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int iRound = java.lang.Math.round(bitmap.getWidth() * fMin);
        int iRound2 = java.lang.Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            return bitmap;
        }
        android.graphics.Bitmap bitmapCopydefault = og.copydefault((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), AEQbTJ(bitmap));
        EZpvd(bitmap, bitmapCopydefault);
        if (android.util.Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            bitmapCopydefault.getWidth();
            bitmapCopydefault.getHeight();
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(fMin, fMin);
        AEQbTJ(bitmap, bitmapCopydefault, matrix);
        return bitmapCopydefault;
    }

    public static android.graphics.Bitmap KWHzl(@androidx.annotation.NonNull OG og, @androidx.annotation.NonNull android.graphics.Bitmap bitmap, int i, int i2) {
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? EZpvd(og, bitmap, i, i2) : bitmap;
    }

    public static void EZpvd(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static android.graphics.Bitmap EZpvd(@androidx.annotation.NonNull OG og, @androidx.annotation.NonNull android.graphics.Bitmap bitmap, int i) {
        if (!copydefault(i)) {
            return bitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        copydefault(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(java.lang.Math.round(rectF.width()), java.lang.Math.round(rectF.height()), AEQbTJ(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapCopydefault.setHasAlpha(bitmap.hasAlpha());
        AEQbTJ(bitmap, bitmapCopydefault, matrix);
        return bitmapCopydefault;
    }

    public static android.graphics.Bitmap copydefault(@androidx.annotation.NonNull OG og, @androidx.annotation.NonNull android.graphics.Bitmap bitmap, int i, int i2) {
        int iMin = java.lang.Math.min(i, i2);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = java.lang.Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        android.graphics.Bitmap bitmapKWHzl = KWHzl(og, bitmap);
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(iMin, iMin, EZpvd(bitmap));
        bitmapCopydefault.setHasAlpha(true);
        Lock lock = AEQbTJ;
        lock.lock();
        try {
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCopydefault);
            canvas.drawCircle(f2, f2, f2, copydefault);
            canvas.drawBitmap(bitmapKWHzl, (android.graphics.Rect) null, rectF, EZpvd);
            EZpvd(canvas);
            lock.unlock();
            if (!bitmapKWHzl.equals(bitmap)) {
                og.copydefault(bitmapKWHzl);
            }
            return bitmapCopydefault;
        } catch (java.lang.Throwable th) {
            AEQbTJ.unlock();
            throw th;
        }
    }

    public static android.graphics.Bitmap KWHzl(@androidx.annotation.NonNull OG og, @androidx.annotation.NonNull android.graphics.Bitmap bitmap) {
        Bitmap.Config configEZpvd = EZpvd(bitmap);
        if (configEZpvd.equals(bitmap.getConfig())) {
            return bitmap;
        }
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(bitmap.getWidth(), bitmap.getHeight(), configEZpvd);
        new android.graphics.Canvas(bitmapCopydefault).drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        return bitmapCopydefault;
    }

    public static Bitmap.Config EZpvd(@androidx.annotation.NonNull android.graphics.Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap.Config.RGBA_F16;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static android.graphics.Bitmap AEQbTJ(@androidx.annotation.NonNull OG og, @androidx.annotation.NonNull android.graphics.Bitmap bitmap, final int i) {
        SE.copydefault(i > 0, "roundingRadius must be greater than 0.");
        return EZpvd(og, bitmap, new TaskDescription() { // from class: o.QB.4
            @Override // o.QB.TaskDescription
            public void AEQbTJ(android.graphics.Canvas canvas, android.graphics.Paint paint, RectF rectF) {
                float f = i;
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        });
    }

    public static android.graphics.Bitmap EZpvd(@androidx.annotation.NonNull OG og, @androidx.annotation.NonNull android.graphics.Bitmap bitmap, TaskDescription taskDescription) {
        Bitmap.Config configEZpvd = EZpvd(bitmap);
        android.graphics.Bitmap bitmapKWHzl = KWHzl(og, bitmap);
        android.graphics.Bitmap bitmapCopydefault = og.copydefault(bitmapKWHzl.getWidth(), bitmapKWHzl.getHeight(), configEZpvd);
        bitmapCopydefault.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapKWHzl, tileMode, tileMode);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapCopydefault.getWidth(), bitmapCopydefault.getHeight());
        Lock lock = AEQbTJ;
        lock.lock();
        try {
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCopydefault);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            taskDescription.AEQbTJ(canvas, paint, rectF);
            EZpvd(canvas);
            lock.unlock();
            if (!bitmapKWHzl.equals(bitmap)) {
                og.copydefault(bitmapKWHzl);
            }
            return bitmapCopydefault;
        } catch (java.lang.Throwable th) {
            AEQbTJ.unlock();
            throw th;
        }
    }

    public static void EZpvd(android.graphics.Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap.Config AEQbTJ(@androidx.annotation.NonNull android.graphics.Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    public static void AEQbTJ(@androidx.annotation.NonNull android.graphics.Bitmap bitmap, @androidx.annotation.NonNull android.graphics.Bitmap bitmap2, android.graphics.Matrix matrix) {
        Lock lock = AEQbTJ;
        lock.lock();
        try {
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, KWHzl);
            EZpvd(canvas);
            lock.unlock();
        } catch (java.lang.Throwable th) {
            AEQbTJ.unlock();
            throw th;
        }
    }

    public static void copydefault(int i, android.graphics.Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    public static final class Activity implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws java.lang.InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, @androidx.annotation.NonNull java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public java.util.concurrent.locks.Condition newCondition() {
            throw new java.lang.UnsupportedOperationException("Should not be called");
        }
    }
}
