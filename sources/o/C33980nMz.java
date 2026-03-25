package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* JADX INFO: renamed from: o.nMz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33980nMz extends nMC {
    public static final android.util.SparseIntArray KWHzl = null;
    public static final ViewDataBinding.IncludedLayouts copydefault = null;
    public long AhwBna;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C33980nMz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, copydefault, KWHzl));
    }

    public C33980nMz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[1]);
        this.AhwBna = -1L;
        this.OLrzqt.setTag(null);
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AhwBna != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35342ntX.djBIcL != i) {
            return false;
        }
        EZpvd((C37740ozY) obj);
        return true;
    }

    public void EZpvd(@androidx.annotation.Nullable C37740ozY c37740ozY) {
        this.AEQbTJ = c37740ozY;
        synchronized (this) {
            this.AhwBna |= 1;
        }
        notifyPropertyChanged(C35342ntX.djBIcL);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.CharSequence charSequenceOLrzqt;
        java.lang.CharSequence charSequenceKWHzl;
        synchronized (this) {
            j = this.AhwBna;
            this.AhwBna = 0L;
        }
        C37740ozY c37740ozY = this.AEQbTJ;
        long j2 = j & 3;
        if (j2 == 0 || c37740ozY == null) {
            charSequenceOLrzqt = null;
            charSequenceKWHzl = null;
        } else {
            charSequenceOLrzqt = c37740ozY.OLrzqt();
            charSequenceKWHzl = c37740ozY.KWHzl();
        }
        if (j2 != 0) {
            if (ViewDataBinding.getBuildSdkInt() >= 4) {
                this.OLrzqt.setContentDescription(charSequenceKWHzl);
            }
            TextViewBindingAdapter.setText(this.EZpvd, charSequenceOLrzqt);
        }
    }
}
