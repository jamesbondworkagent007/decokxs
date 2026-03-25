package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public class oPM extends oPH {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public long values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C35964oKf.StateListAnimator.AkhnZx, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi212, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.ORmwhf, 6);
    }

    public oPM(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, fetchVPNInfo, DbNXlk));
    }

    public oPM(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayoutCompat) objArr[4], (C39845pzy) objArr[2], (C39846pzz) objArr[1], (C39843pzw) objArr[3], (C39842pzv) objArr[6], (NestedScrollView) objArr[0], (android.widget.TextView) objArr[5]);
        this.values = -1L;
        this.KWHzl.setTag(null);
        this.EZpvd.setTag(null);
        this.AEQbTJ.setTag(null);
        this.valueOf.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35963oKe.OLrzqt == i) {
            AEQbTJ(((java.lang.Boolean) obj).booleanValue());
        } else if (C35963oKe.copydefault == i) {
            OLrzqt(((java.lang.Boolean) obj).booleanValue());
        } else {
            if (C35963oKe.AEQbTJ != i) {
                return false;
            }
            KWHzl(((java.lang.Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // o.oPH
    public void AEQbTJ(boolean z) {
        this.AhwBna = z;
        synchronized (this) {
            this.values |= 1;
        }
        notifyPropertyChanged(C35963oKe.OLrzqt);
        super.requestRebind();
    }

    @Override // o.oPH
    public void OLrzqt(boolean z) {
        this.gEmmrt = z;
        synchronized (this) {
            this.values |= 2;
        }
        notifyPropertyChanged(C35963oKe.copydefault);
        super.requestRebind();
    }

    @Override // o.oPH
    public void KWHzl(boolean z) {
        this.AYXKKw = z;
        synchronized (this) {
            this.values |= 4;
        }
        notifyPropertyChanged(C35963oKe.AEQbTJ);
        super.requestRebind();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a A[PHI: r2
  0x002a: PHI (r2v1 long) = (r2v0 long), (r2v14 long) binds: [B:7:0x0019, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042 A[PHI: r2
  0x0042: PHI (r2v3 long) = (r2v2 long), (r2v12 long) binds: [B:18:0x0031, B:24:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0058 A[PHI: r2
  0x0058: PHI (r2v5 long) = (r2v4 long), (r2v10 long) binds: [B:29:0x0049, B:35:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.values;
            this.values = 0L;
        }
        boolean z = this.AhwBna;
        boolean z2 = this.gEmmrt;
        boolean z3 = this.AYXKKw;
        long j2 = j & 9;
        int i3 = 8;
        if (j2 == 0) {
            i = 0;
        } else {
            if (j2 != 0) {
                j |= z ? 512L : 256L;
            }
            if (!z) {
                i = 8;
            }
        }
        long j3 = j & 10;
        if (j3 == 0) {
            i2 = 0;
        } else {
            if (j3 != 0) {
                j |= z2 ? 32L : 16L;
            }
            if (!z2) {
                i2 = 8;
            }
        }
        long j4 = j & 12;
        if (j4 == 0) {
            i3 = 0;
        } else {
            if (j4 != 0) {
                j |= z3 ? 128L : 64L;
            }
            if (z3) {
            }
        }
        if ((12 & j) != 0) {
            this.KWHzl.setVisibility(i3);
        }
        if ((j & 10) != 0) {
            this.EZpvd.setVisibility(i2);
        }
        if ((j & 9) != 0) {
            this.AEQbTJ.setVisibility(i);
        }
    }
}
