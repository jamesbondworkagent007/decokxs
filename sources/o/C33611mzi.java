package o;

import android.graphics.BitmapFactory;
import android.os.Build;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: o.mzi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33611mzi {
    private C33611mzi() {
    }

    public static android.graphics.Bitmap OLrzqt(android.content.Context context, android.net.Uri uri) {
        if (context != null && uri != null) {
            Application application = new Application();
            try {
                android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                if (Build.VERSION.SDK_INT >= 29) {
                    return EZpvd(context, uri, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                java.lang.String strCopydefault = C33618mzp.copydefault(context, uri);
                BitmapFactory.decodeFile(strCopydefault, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                int i3 = displayMetrics.widthPixels;
                if (i > i3) {
                    options.inSampleSize = java.lang.Math.max(i / i3, i2 / displayMetrics.heightPixels);
                }
                options.inJustDecodeBounds = false;
                application.EZpvd(BitmapFactory.decodeFile(strCopydefault, options));
                if (application.EZpvd() == null) {
                    android.util.DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    return EZpvd(context, uri, displayMetrics2.widthPixels, displayMetrics2.heightPixels);
                }
                return application.EZpvd();
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("ImageUtil", "Decode origin uri as bitmap error.", e);
            }
        }
        return null;
    }

    public static android.graphics.Bitmap EZpvd(android.content.Context context, android.net.Uri uri, int i, int i2) {
        if (context != null && uri != null) {
            Application application = new Application();
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
                options.inSampleSize = java.lang.Math.max(options.outWidth / i, options.outHeight / i2);
                options.inJustDecodeBounds = false;
                application.EZpvd(BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options));
                return application.EZpvd();
            } catch (java.io.FileNotFoundException e) {
                pUU.AEQbTJ("ImageUtil", "Decode uri as bitmap error.", e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o.mzi$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static class Application {
        public SoftReference<android.graphics.Bitmap> OLrzqt;

        private Application() {
        }

        public void EZpvd(android.graphics.Bitmap bitmap) {
            this.OLrzqt = new SoftReference<>(bitmap);
        }

        public android.graphics.Bitmap EZpvd() {
            return this.OLrzqt.get();
        }
    }
}
