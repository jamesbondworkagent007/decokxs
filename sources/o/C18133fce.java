package o;

import androidx.core.view.ViewCompat;
import androidx.core.view.ViewParentCompat;

/* JADX INFO: renamed from: o.fce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C18133fce {
    public final android.view.View AEQbTJ;
    public android.view.ViewParent EZpvd;
    public int[] KWHzl;
    public boolean OLrzqt;
    public android.view.ViewParent copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i, android.view.ViewParent viewParent) {
        if (i == 0) {
            this.EZpvd = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.copydefault = viewParent;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.view.ViewParent OLrzqt(int i) {
        if (i == 0) {
            return this.EZpvd;
        }
        if (i != 1) {
            return null;
        }
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int[] copydefault() {
        if (this.KWHzl == null) {
            this.KWHzl = new int[2];
        }
        return this.KWHzl;
    }

    public C18133fce(@androidx.annotation.NonNull android.view.View view) {
        this.AEQbTJ = view;
    }

    public void copydefault(boolean z) {
        if (this.OLrzqt) {
            ViewCompat.stopNestedScroll(this.AEQbTJ);
        }
        this.OLrzqt = z;
    }

    public boolean EZpvd(int i) {
        return OLrzqt(i) != null;
    }

    public boolean copydefault(int i, int i2) {
        if (EZpvd(i2)) {
            return true;
        }
        if (!EZpvd()) {
            return false;
        }
        android.view.View view = this.AEQbTJ;
        for (android.view.ViewParent parent = this.AEQbTJ.getParent(); parent != null; parent = parent.getParent()) {
            if (ViewParentCompat.onStartNestedScroll(parent, view, this.AEQbTJ, i, i2)) {
                AEQbTJ(i2, parent);
                ViewParentCompat.onNestedScrollAccepted(parent, view, this.AEQbTJ, i, i2);
                return true;
            }
            if (parent instanceof android.view.View) {
                view = (android.view.View) parent;
            }
        }
        return false;
    }

    public void KWHzl(int i) {
        android.view.ViewParent viewParentOLrzqt = OLrzqt(i);
        if (viewParentOLrzqt != null) {
            ViewParentCompat.onStopNestedScroll(viewParentOLrzqt, this.AEQbTJ, i);
            AEQbTJ(i, null);
        }
    }

    public boolean AEQbTJ(int i, int i2, int i3, int i4, @androidx.annotation.Nullable int[] iArr, int i5) {
        return AEQbTJ(i, i2, i3, i4, iArr, i5, null);
    }

    public void KWHzl(int i, int i2, int i3, int i4, @androidx.annotation.Nullable int[] iArr, int i5, @androidx.annotation.Nullable int[] iArr2) {
        AEQbTJ(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final boolean AEQbTJ(int i, int i2, int i3, int i4, @androidx.annotation.Nullable int[] iArr, int i5, @androidx.annotation.Nullable int[] iArr2) {
        android.view.ViewParent viewParentOLrzqt;
        int i6;
        int i7;
        int[] iArr3;
        if (!EZpvd() || (viewParentOLrzqt = OLrzqt(i5)) == null) {
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
            this.AEQbTJ.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] iArrCopydefault = copydefault();
            iArrCopydefault[0] = 0;
            iArrCopydefault[1] = 0;
            iArr3 = iArrCopydefault;
        } else {
            iArr3 = iArr2;
        }
        ViewParentCompat.onNestedScroll(viewParentOLrzqt, this.AEQbTJ, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.AEQbTJ.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public boolean copydefault(int i, int i2, @androidx.annotation.Nullable int[] iArr, @androidx.annotation.Nullable int[] iArr2, int i3) {
        android.view.ViewParent viewParentOLrzqt;
        int i4;
        int i5;
        if (!EZpvd() || (viewParentOLrzqt = OLrzqt(i3)) == null) {
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
            this.AEQbTJ.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = copydefault();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        ViewParentCompat.onNestedPreScroll(viewParentOLrzqt, this.AEQbTJ, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.AEQbTJ.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean AEQbTJ(float f, float f2, boolean z) {
        android.view.ViewParent viewParentOLrzqt;
        if (!EZpvd() || (viewParentOLrzqt = OLrzqt(0)) == null) {
            return false;
        }
        return ViewParentCompat.onNestedFling(viewParentOLrzqt, this.AEQbTJ, f, f2, z);
    }

    public boolean EZpvd(float f, float f2) {
        android.view.ViewParent viewParentOLrzqt;
        if (!EZpvd() || (viewParentOLrzqt = OLrzqt(0)) == null) {
            return false;
        }
        return ViewParentCompat.onNestedPreFling(viewParentOLrzqt, this.AEQbTJ, f, f2);
    }
}
