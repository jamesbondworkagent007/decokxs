package o;

import android.os.Build;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mxB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33472mxB {
    public java.lang.Integer AEQbTJ;
    public android.view.View EZpvd;
    public final android.view.Window KWHzl;
    public kotlin.Pair<java.lang.Integer, android.util.Size> OLrzqt;
    public final android.content.Context copydefault;

    public C33472mxB(@NotNull android.content.Context context, @NotNull android.view.Window window) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(window, "");
        this.copydefault = context;
        this.KWHzl = window;
        this.AEQbTJ = Build.VERSION.SDK_INT >= 35 ? 0 : null;
    }

    public final kotlin.Pair<java.lang.Integer, android.util.Size> EZpvd(Insets insets) {
        if (insets.bottom > 0) {
            return C56390yDp.OLrzqt(80, new android.util.Size(-1, insets.bottom));
        }
        if (insets.right > 0) {
            return C56390yDp.OLrzqt(5, new android.util.Size(insets.right, -1));
        }
        if (insets.top > 0) {
            return C56390yDp.OLrzqt(48, new android.util.Size(-1, insets.top));
        }
        if (insets.left > 0) {
            return C56390yDp.OLrzqt(3, new android.util.Size(insets.left, -1));
        }
        return C56390yDp.OLrzqt(80, new android.util.Size(0, 0));
    }

    public final void KWHzl(int i, kotlin.Pair<java.lang.Integer, android.util.Size> pair) {
        android.view.View view = this.EZpvd;
        android.view.View decorView = this.KWHzl.getDecorView();
        Intrinsics.copydefault(decorView, "");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) decorView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (Intrinsics.EZpvd(C56390yDp.OLrzqt(java.lang.Integer.valueOf(layoutParams2.gravity), new android.util.Size(layoutParams2.width, layoutParams2.height)), pair)) {
                pUU.EZpvd("EdgeToEdge", "set navigation bg color: " + pair + ", " + i);
                view.setBackgroundColor(i);
                return;
            }
            pUU.EZpvd("EdgeToEdge", "remove existing navigation bg view");
            frameLayout.removeView(view);
            this.EZpvd = null;
        }
        if (pair.getFirst().intValue() > 0) {
            pUU.EZpvd("EdgeToEdge", "add navigation bg view: " + pair + ", " + i);
            android.view.View view2 = new android.view.View(this.copydefault);
            view2.setLayoutParams(new FrameLayout.LayoutParams(pair.getSecond().getWidth(), pair.getSecond().getHeight(), pair.getFirst().intValue()));
            view2.setBackgroundColor(i);
            frameLayout.addView(view2);
            this.EZpvd = view2;
        }
    }

    public final void AEQbTJ(@androidx.annotation.ColorInt int i) {
        KWHzl(i, copydefault());
    }

    public final void KWHzl(@androidx.annotation.ColorInt int i, boolean z) {
        if (!z && Build.VERSION.SDK_INT < 26) {
            i = this.copydefault.getColor(C52761wXj.Activity.DcMfJKDGTeJD);
        }
        KWHzl(i);
    }

    public final void KWHzl(@androidx.annotation.ColorInt final int i) {
        java.lang.Integer num = this.AEQbTJ;
        if (num != null && i == num.intValue()) {
            return;
        }
        this.AEQbTJ = java.lang.Integer.valueOf(i);
        if (Build.VERSION.SDK_INT < 35) {
            this.KWHzl.setNavigationBarColor(i);
            return;
        }
        if (this.EZpvd != null) {
            pUU.EZpvd("EdgeToEdge", "set navigation bg color: " + i);
            android.view.View view = this.EZpvd;
            Intrinsics.copydefault(view);
            view.setBackgroundColor(i);
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(this.KWHzl.getDecorView(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.mxG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
                return C33472mxB.AEQbTJ(this.AEQbTJ, i, view2, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat AEQbTJ(C33472mxB c33472mxB, int i, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        kotlin.Pair<java.lang.Integer, android.util.Size> pairEZpvd = c33472mxB.EZpvd(insets);
        c33472mxB.OLrzqt = pairEZpvd;
        c33472mxB.KWHzl(i, pairEZpvd);
        return windowInsetsCompat;
    }

    public final void AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewCompat.setOnApplyWindowInsetsListener(view, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.mxI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
                return C33472mxB.KWHzl(this.AEQbTJ, view2, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat KWHzl(C33472mxB c33472mxB, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        c33472mxB.OLrzqt = c33472mxB.EZpvd(insets);
        return windowInsetsCompat;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.huawei.hms.activity.BridgeActivity$$ExternalSyntheticApiModelOutline0.m(android.view.WindowManager$LayoutParams, int):void */
    /* JADX DEBUG: Class process forced to load method for inline: o.mxD.AEQbTJ(android.view.WindowManager$LayoutParams):int */
    public final void AEQbTJ() {
        WindowCompat.setDecorFitsSystemWindows(this.KWHzl, false);
        this.KWHzl.setStatusBarColor(0);
        this.KWHzl.setNavigationBarColor(0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int i2 = i >= 30 ? 3 : 1;
            WindowManager.LayoutParams attributes = this.KWHzl.getAttributes();
            if (attributes.layoutInDisplayCutoutMode != i2) {
                attributes.layoutInDisplayCutoutMode = i2;
                this.KWHzl.setAttributes(attributes);
            }
        }
        if (i >= 29) {
            this.KWHzl.setStatusBarContrastEnforced(false);
            this.KWHzl.setNavigationBarContrastEnforced(false);
        }
    }

    public static /* synthetic */ void enableEdgeToEdgeForBottomSheetFragment$default(C33472mxB c33472mxB, android.app.Dialog dialog, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c33472mxB.KWHzl(dialog, z);
    }

    public final void KWHzl(@NotNull android.app.Dialog dialog, boolean z) {
        Intrinsics.checkNotNullParameter(dialog, "");
        AEQbTJ();
        android.view.View viewFindViewById = dialog.findViewById(com.google.android.material.R.id.container);
        if (viewFindViewById != null) {
            viewFindViewById.setFitsSystemWindows(false);
            if (z) {
                AEQbTJ(viewFindViewById);
            }
        }
        android.view.View viewFindViewById2 = dialog.findViewById(com.google.android.material.R.id.coordinator);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setFitsSystemWindows(false);
        }
    }

    public final void EZpvd() {
        EZpvd(!copydefault());
    }

    public final void EZpvd(boolean z) {
        EZpvd(z, z);
    }

    public final void EZpvd(boolean z, boolean z2) {
        android.view.Window window = this.KWHzl;
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        insetsController.setAppearanceLightStatusBars(z);
        insetsController.setAppearanceLightNavigationBars(z2);
    }

    public final boolean copydefault() {
        int i = this.copydefault.getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            return false;
        }
        if (i != 32) {
            return C33492mxV.OLrzqt();
        }
        return true;
    }
}
