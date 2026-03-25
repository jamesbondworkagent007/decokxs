package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.C49720utq;

/* JADX INFO: renamed from: o.utC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49680utC extends AbstractC49679utB {
    public static final android.util.SparseIntArray djBIcL;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final ConstraintLayout fetchVPNInfo;
    public long gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@androidx.annotation.Nullable java.lang.String str) {
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@androidx.annotation.Nullable java.lang.String str) {
        this.EZpvd = str;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        djBIcL = sparseIntArray;
        sparseIntArray.put(C49720utq.Application.AhwBna, 2);
    }

    public C49680utC(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, valueOf, djBIcL));
    }

    public C49680utC(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55320xhi) objArr[1], (C55258xgZ) objArr[2]);
        this.gEmmrt = -1L;
        this.AEQbTJ.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gEmmrt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C49719utp.copydefault == i) {
            OLrzqt((java.lang.String) obj);
        } else if (C49719utp.OLrzqt == i) {
            copydefault((java.lang.String) obj);
        } else if (C49719utp.AYXKKw == i) {
            EZpvd((java.lang.String) obj);
        } else if (C49719utp.KWHzl == i) {
            EZpvd(((java.lang.Boolean) obj).booleanValue());
        } else {
            if (C49719utp.AEQbTJ != i) {
                return false;
            }
            OLrzqt(((java.lang.Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // o.AbstractC49679utB
    public void OLrzqt(@androidx.annotation.Nullable java.lang.String str) {
        this.KWHzl = str;
        synchronized (this) {
            this.gEmmrt |= 1;
        }
        notifyPropertyChanged(C49719utp.copydefault);
        super.requestRebind();
    }

    @Override // o.AbstractC49679utB
    public void EZpvd(boolean z) {
        this.copydefault = z;
        synchronized (this) {
            this.gEmmrt |= 8;
        }
        notifyPropertyChanged(C49719utp.KWHzl);
        super.requestRebind();
    }

    @Override // o.AbstractC49679utB
    public void OLrzqt(boolean z) {
        this.OLrzqt = z;
        synchronized (this) {
            this.gEmmrt |= 16;
        }
        notifyPropertyChanged(C49719utp.AEQbTJ);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.gEmmrt;
            this.gEmmrt = 0L;
        }
        java.lang.String str = this.KWHzl;
        boolean z = this.copydefault;
        boolean z2 = this.OLrzqt;
        long j2 = j & 40;
        int i = 0;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= z ? 128L : 64L;
            }
            if (z) {
                i = 8;
            }
        }
        if ((33 & j) != 0) {
            TextViewBindingAdapter.setText(this.AEQbTJ, str);
        }
        if ((48 & j) != 0) {
            this.AEQbTJ.setShowUnderline(z2);
        }
        if ((j & 40) != 0) {
            this.fetchVPNInfo.setVisibility(i);
        }
    }
}
