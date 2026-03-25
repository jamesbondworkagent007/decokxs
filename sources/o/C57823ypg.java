package o;

import android.os.Build;
import java.lang.ref.WeakReference;
import o.C57712ynb;

/* JADX INFO: renamed from: o.ypg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57823ypg {
    public static final int AEQbTJ = copydefault(24);

    public static boolean KWHzl(WeakReference<android.app.Activity> weakReference) {
        android.view.View decorView;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.graphics.Rect rect = new android.graphics.Rect();
        if (weakReference.get() != null) {
            android.view.Window window = weakReference.get().getWindow();
            decorView = window.getDecorView();
            decorView.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            decorView = null;
        }
        return decorView != null && displayMetrics.heightPixels - rect.bottom > AEQbTJ;
    }

    public static void KWHzl(@androidx.annotation.NonNull android.app.Activity activity, @androidx.annotation.NonNull final java.lang.Runnable runnable) {
        final java.lang.String str = "decorViewReady:" + runnable;
        activity.getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.ypg.5
            @Override // java.lang.Runnable
            public void run() {
                final C57712ynb c57712ynbCopydefault = C57714ynd.copydefault();
                if (c57712ynbCopydefault != null) {
                    c57712ynbCopydefault.KWHzl(str, new C57712ynb.TaskDescription() { // from class: o.ypg.5.1
                        @Override // o.C57712ynb.TaskDescription
                        public void OLrzqt(@androidx.annotation.NonNull android.app.Activity activity2) {
                            c57712ynbCopydefault.OLrzqt(str);
                            if (C57823ypg.valueOf(activity2)) {
                                runnable.run();
                            } else {
                                C57823ypg.KWHzl(activity2, runnable);
                            }
                        }
                    });
                }
            }
        });
    }

    public static android.graphics.Rect OLrzqt(@androidx.annotation.NonNull android.app.Activity activity) {
        android.graphics.Rect rect = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    public static int[] AEQbTJ(@androidx.annotation.NonNull android.app.Activity activity) {
        float safeInsetRight;
        float safeInsetLeft;
        android.view.DisplayCutout cutout;
        android.graphics.Rect rectOLrzqt = OLrzqt(activity);
        android.view.View viewFindViewById = activity.getWindow().findViewById(android.R.id.content);
        float top = (rectOLrzqt.top - viewFindViewById.getTop()) / android.content.res.Resources.getSystem().getDisplayMetrics().density;
        float bottom = (viewFindViewById.getBottom() - rectOLrzqt.bottom) / android.content.res.Resources.getSystem().getDisplayMetrics().density;
        if (Build.VERSION.SDK_INT != 29 || (cutout = activity.getWindowManager().getDefaultDisplay().getCutout()) == null) {
            safeInsetRight = 0.0f;
            safeInsetLeft = 0.0f;
        } else {
            safeInsetRight = cutout.getSafeInsetRight() / android.content.res.Resources.getSystem().getDisplayMetrics().density;
            safeInsetLeft = cutout.getSafeInsetLeft() / android.content.res.Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{java.lang.Math.round(top), java.lang.Math.round(bottom), java.lang.Math.round(safeInsetRight), java.lang.Math.round(safeInsetLeft)};
    }

    public static int KWHzl(@androidx.annotation.NonNull android.app.Activity activity) {
        return activity.getWindow().getDecorView().getWidth();
    }

    public static int AYXKKw(@androidx.annotation.NonNull android.app.Activity activity) {
        return OLrzqt(activity).width();
    }

    public static int EZpvd(@androidx.annotation.NonNull android.app.Activity activity) {
        return copydefault(activity);
    }

    public static int copydefault(@androidx.annotation.NonNull android.app.Activity activity) {
        android.view.View decorView = activity.getWindow().getDecorView();
        android.view.WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return decorView.getHeight();
        }
        return (decorView.getHeight() - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
    }

    public static int copydefault(int i) {
        return (int) (i * android.content.res.Resources.getSystem().getDisplayMetrics().density);
    }

    public static boolean valueOf(@androidx.annotation.NonNull android.app.Activity activity) {
        return (activity.getWindow().getDecorView().getApplicationWindowToken() != null) && (activity.getWindow().getDecorView().getRootWindowInsets() != null);
    }
}
