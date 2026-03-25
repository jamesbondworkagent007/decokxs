package o;

import androidx.core.view.ViewCompat;
import androidx.core.view.ViewParentCompat;

/* JADX INFO: renamed from: o.atD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7931atD {
    public android.view.ViewParent AEQbTJ;
    public int[] EZpvd;
    public android.view.ViewParent KWHzl;
    public boolean OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.view.ViewParent KWHzl(int i) {
        if (i == 0) {
            return this.KWHzl;
        }
        if (i != 1) {
            return null;
        }
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int[] KWHzl() {
        if (this.EZpvd == null) {
            this.EZpvd = new int[2];
        }
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i, android.view.ViewParent viewParent) {
        if (i == 0) {
            this.KWHzl = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.AEQbTJ = viewParent;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.OLrzqt;
    }

    public C7931atD(@androidx.annotation.NonNull android.view.View view) {
        this.copydefault = view;
    }

    public void EZpvd(boolean z) {
        if (this.OLrzqt) {
            ViewCompat.stopNestedScroll(this.copydefault);
        }
        this.OLrzqt = z;
    }

    public boolean OLrzqt(int i) {
        return KWHzl(i) != null;
    }

    public boolean AEQbTJ(int i, int i2) {
        if (OLrzqt(i2)) {
            return true;
        }
        if (!OLrzqt()) {
            return false;
        }
        android.view.View view = this.copydefault;
        for (android.view.ViewParent parent = this.copydefault.getParent(); parent != null; parent = parent.getParent()) {
            if (ViewParentCompat.onStartNestedScroll(parent, view, this.copydefault, i, i2)) {
                OLrzqt(i2, parent);
                ViewParentCompat.onNestedScrollAccepted(parent, view, this.copydefault, i, i2);
                return true;
            }
            if (parent instanceof android.view.View) {
                view = (android.view.View) parent;
            }
        }
        return false;
    }

    public void AEQbTJ(int i) {
        android.view.ViewParent viewParentKWHzl = KWHzl(i);
        if (viewParentKWHzl != null) {
            ViewParentCompat.onStopNestedScroll(viewParentKWHzl, this.copydefault, i);
            OLrzqt(i, null);
        }
    }

    public boolean OLrzqt(int i, int i2, int i3, int i4, @androidx.annotation.Nullable int[] iArr, int i5) {
        return KWHzl(i, i2, i3, i4, iArr, i5, null);
    }

    public void AEQbTJ(int i, int i2, int i3, int i4, @androidx.annotation.Nullable int[] iArr, int i5, @androidx.annotation.Nullable int[] iArr2) {
        KWHzl(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final boolean KWHzl(int i, int i2, int i3, int i4, @androidx.annotation.Nullable int[] iArr, int i5, @androidx.annotation.Nullable int[] iArr2) {
        android.view.ViewParent viewParentKWHzl;
        int i6;
        int i7;
        int[] iArr3;
        if (!OLrzqt() || (viewParentKWHzl = KWHzl(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.copydefault.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] iArrKWHzl = KWHzl();
            iArrKWHzl[0] = 0;
            iArrKWHzl[1] = 0;
            iArr3 = iArrKWHzl;
        } else {
            iArr3 = iArr2;
        }
        ViewParentCompat.onNestedScroll(viewParentKWHzl, this.copydefault, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.copydefault.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public boolean KWHzl(int i, int i2, @androidx.annotation.Nullable int[] iArr, @androidx.annotation.Nullable int[] iArr2, int i3) {
        android.view.ViewParent viewParentKWHzl;
        int i4;
        int i5;
        if (!OLrzqt() || (viewParentKWHzl = KWHzl(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.copydefault.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = KWHzl();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        ViewParentCompat.onNestedPreScroll(viewParentKWHzl, this.copydefault, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.copydefault.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean EZpvd(float f, float f2, boolean z) {
        android.view.ViewParent viewParentKWHzl;
        if (!OLrzqt() || (viewParentKWHzl = KWHzl(0)) == null) {
            return false;
        }
        return ViewParentCompat.onNestedFling(viewParentKWHzl, this.copydefault, f, f2, z);
    }

    public boolean copydefault(float f, float f2) {
        android.view.ViewParent viewParentKWHzl;
        if (!OLrzqt() || (viewParentKWHzl = KWHzl(0)) == null) {
            return false;
        }
        return ViewParentCompat.onNestedPreFling(viewParentKWHzl, this.copydefault, f, f2);
    }
}
