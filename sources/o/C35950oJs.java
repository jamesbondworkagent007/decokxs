package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oJs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35950oJs {
    public static final C35950oJs OLrzqt = new C35950oJs();

    private C35950oJs() {
    }

    public static /* synthetic */ int[] calculatePopWindowPos$default(C35950oJs c35950oJs, android.view.View view, android.view.View view2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return c35950oJs.AEQbTJ(view, view2, i);
    }

    public final int[] AEQbTJ(@NotNull android.view.View view, @NotNull android.view.View view2, int i) {
        int iKWHzl;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        int iKWHzl2 = (int) C33570myu.KWHzl(view.getContext(), 16.0f);
        view.getLocationOnScreen(iArr2);
        int height = view.getHeight();
        int iEZpvd = C33570myu.EZpvd();
        int iAEQbTJ = C33570myu.AEQbTJ();
        view2.measure(0, 0);
        if (i == 0) {
            iKWHzl = view2.getMeasuredHeight();
        } else {
            iKWHzl = (int) C33570myu.KWHzl(view.getContext(), (i * 44.0f) + 16.0f);
        }
        int measuredWidth = view2.getMeasuredWidth();
        int i2 = iArr2[1];
        int i3 = iAEQbTJ - measuredWidth;
        if (((iEZpvd - iKWHzl2) - i2) - height < iKWHzl) {
            iArr[0] = i3;
            iArr[1] = i2 - iKWHzl;
        } else {
            iArr[0] = i3;
            iArr[1] = i2 + height;
        }
        return iArr;
    }

    public static /* synthetic */ int[] calculatePopWindowPosWithTouch$default(C35950oJs c35950oJs, android.view.View view, android.view.View view2, float f, float f2, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        return c35950oJs.OLrzqt(view, view2, f, f2, i, z);
    }

    public final int[] OLrzqt(@NotNull android.view.View view, @NotNull android.view.View view2, float f, float f2, int i, boolean z) {
        int iKWHzl;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        int iKWHzl2 = (int) C33570myu.KWHzl(view.getContext(), 60.0f);
        view.getLocationOnScreen(iArr2);
        int height = view.getHeight();
        int iEZpvd = C33570myu.EZpvd() - iKWHzl2;
        int iAEQbTJ = C33570myu.AEQbTJ();
        if (height > iEZpvd) {
            height = iEZpvd;
        }
        view2.measure(0, 0);
        int measuredWidth = view2.getMeasuredWidth();
        if (i == 0) {
            iKWHzl = view2.getMeasuredHeight();
        } else {
            iKWHzl = (int) C33570myu.KWHzl(view.getContext(), (i * 44.0f) + 16.0f);
        }
        int i2 = iArr2[1];
        int i3 = (int) f2;
        if (((iEZpvd - i2) - height) - i3 < iKWHzl) {
            iArr[1] = (i2 - iKWHzl) + (height / 2) + i3;
        } else {
            iArr[1] = i2 + (height / 2) + i3;
        }
        float f3 = measuredWidth;
        if (z) {
            if (f - f3 < 0.0f) {
                iArr[0] = 20;
            } else {
                iArr[0] = (((int) f) - measuredWidth) + 10;
            }
        } else if (f3 + f > iAEQbTJ) {
            iArr[0] = (iAEQbTJ - measuredWidth) - 20;
        } else {
            iArr[0] = ((int) f) + 10;
        }
        return iArr;
    }
}
