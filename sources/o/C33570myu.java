package o;

import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import o.C32113mPz;
import o.C52761wXj;

/* JADX INFO: renamed from: o.myu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33570myu {
    public static int EZpvd;
    public static int copydefault;

    /* JADX INFO: renamed from: o.myu$ActionBar */
    public interface ActionBar {
        boolean AEQbTJ(android.view.View view);
    }

    public static void AEQbTJ(android.content.Context context, android.view.View view) {
        ((android.view.inputmethod.InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void AEQbTJ(android.content.Context context, android.widget.EditText editText) {
        editText.setFocusable(true);
        editText.requestFocus();
        ((android.view.inputmethod.InputMethodManager) context.getSystemService("input_method")).showSoftInput(editText, 0);
    }

    public static void copydefault(android.app.Activity activity) {
        OLrzqt(activity, activity.getCurrentFocus());
    }

    public static void OLrzqt(android.app.Activity activity, android.view.View view) {
        if (activity.getWindow().getAttributes().softInputMode != 2) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method");
            if (view != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
            }
        }
    }

    public static void copydefault(android.view.View view, java.lang.Runnable runnable) {
        OLrzqt(view, true, runnable);
    }

    public static void OLrzqt(final android.view.View view, final boolean z, final java.lang.Runnable runnable) {
        if (view == null) {
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        final ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: o.myu.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                java.lang.Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                return z;
            }
        };
        viewTreeObserver.addOnWindowAttachListener(new ViewTreeObserver.OnWindowAttachListener() { // from class: o.myu.3
            @Override // android.view.ViewTreeObserver.OnWindowAttachListener
            public void onWindowAttached() {
            }

            @Override // android.view.ViewTreeObserver.OnWindowAttachListener
            public void onWindowDetached() {
                view.getViewTreeObserver().removeOnWindowAttachListener(this);
                view.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        });
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    public static android.graphics.Bitmap EZpvd(android.view.View view) {
        return copydefault(view, true);
    }

    public static android.graphics.Bitmap copydefault(android.view.View view, boolean z) {
        if (view == null) {
            return null;
        }
        try {
            view.destroyDrawingCache();
            if (z) {
                view.setDrawingCacheBackgroundColor(0);
            } else {
                view.setDrawingCacheBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            if (!view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(true);
            }
            return view.getDrawingCache(true);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static android.graphics.Bitmap AEQbTJ(android.view.View view, boolean z) {
        android.graphics.Bitmap bitmapCreateBitmap = null;
        if (view == null) {
            return null;
        }
        try {
            bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            if (!z) {
                canvas.drawColor(view.getResources().getColor(C52761wXj.Activity.registerUser));
            }
            view.draw(canvas);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        return bitmapCreateBitmap;
    }

    public static int AEQbTJ(android.content.Context context) {
        return gEmmrt(context);
    }

    public static void KWHzl(android.app.Activity activity) {
        WindowInsetsCompat rootWindowInsets;
        if (activity != null) {
            if (copydefault <= 0 || EZpvd <= 0) {
                android.content.res.TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
                try {
                    try {
                        if (typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar) && (rootWindowInsets = ViewCompat.getRootWindowInsets(activity.findViewById(android.R.id.content))) != null) {
                            copydefault = rootWindowInsets.getInsets(WindowInsetsCompat.Type.statusBars()).top;
                            EZpvd = rootWindowInsets.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
                            pUU.EZpvd("UIHelper", "initWindowInsetsCompat: statusBarHeight=" + copydefault + ", navigationBarHeight=" + EZpvd);
                        }
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                } finally {
                    typedArrayObtainStyledAttributes.recycle();
                }
            }
        }
    }

    public static int gEmmrt(android.content.Context context) {
        int i = copydefault;
        if (i > 0) {
            return i;
        }
        KWHzl(C54819xWm.KWHzl().AEQbTJ());
        int i2 = copydefault;
        return i2 == 0 ? AhwBna(context) : i2;
    }

    public static int AhwBna(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
        return dimensionPixelSize == 0 ? context.getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.values) : dimensionPixelSize;
    }

    public static int OLrzqt() {
        return gEmmrt(C57601ylW.OLrzqt());
    }

    public static int valueOf(android.content.Context context) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarSize, typedValue, true)) {
            return android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return context.getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.AuCTel);
    }

    public static int copydefault(android.content.Context context) {
        return context.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.KWHzl);
    }

    public static int OLrzqt(android.content.Context context) {
        return KWHzl(context);
    }

    public static int KWHzl(android.content.Context context) {
        int i = EZpvd;
        if (i > 0) {
            return i;
        }
        KWHzl(C54819xWm.KWHzl().AEQbTJ());
        int i2 = EZpvd;
        return i2 == 0 ? EZpvd(context) : i2;
    }

    public static int EZpvd(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
        return dimensionPixelSize == 0 ? context.getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.isConnected) : dimensionPixelSize;
    }

    public static int djBIcL(android.content.Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static void EZpvd(android.content.Context context, java.lang.String str) {
        ((android.content.ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text", str));
    }

    public static java.lang.String AYXKKw(android.content.Context context) {
        java.lang.CharSequence text = ((android.content.ClipboardManager) context.getSystemService("clipboard")).getText();
        return text != null ? text.toString().trim() : "";
    }

    public static float KWHzl(android.content.Context context, float f) {
        return android.util.TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static int EZpvd(android.content.Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int AEQbTJ() {
        return C57601ylW.OLrzqt().getResources().getDisplayMetrics().widthPixels;
    }

    public static int EZpvd() {
        return C57601ylW.OLrzqt().getResources().getDisplayMetrics().heightPixels;
    }

    public static void AEQbTJ(android.app.Activity activity) {
        try {
            if (C34703nhO.AhwBna(activity)) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity.getWindow().getDecorView();
                C57602ylX c57602ylX = new C57602ylX(activity);
                c57602ylX.setContentDescription("debugTag");
                c57602ylX.EZpvd("DEBUG").copydefault(-1).AEQbTJ(SupportMenu.CATEGORY_MASK).KWHzl(20).OLrzqt(50).EZpvd(1);
                c57602ylX.EZpvd("DEBUG");
                if (viewGroup.indexOfChild(c57602ylX) == -1) {
                    viewGroup.addView(c57602ylX);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c57602ylX.getLayoutParams();
                    layoutParams.width = EZpvd(activity, 60);
                    layoutParams.height = EZpvd(activity, 60);
                    layoutParams.gravity = 8388661;
                    c57602ylX.setLayoutParams(layoutParams);
                }
            }
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }
}
