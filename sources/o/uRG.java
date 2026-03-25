package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.AbstractC50583vTu;

/* JADX INFO: loaded from: classes11.dex */
public class uRG extends uRK {
    public static final android.util.SparseIntArray AEQbTJ = null;
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public final android.widget.LinearLayout AhwBna;
    public long gEmmrt;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public uRG(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, EZpvd, AEQbTJ));
    }

    public uRG(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[1]);
        this.gEmmrt = -1L;
        this.KWHzl.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AhwBna = linearLayout;
        linearLayout.setTag(null);
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 2L;
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
        if (C48034uCn.gEmmrt != i) {
            return false;
        }
        EZpvd((AbstractC50583vTu.StateListAnimator) obj);
        return true;
    }

    public void EZpvd(@androidx.annotation.Nullable AbstractC50583vTu.StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator;
        synchronized (this) {
            this.gEmmrt |= 1;
        }
        notifyPropertyChanged(C48034uCn.gEmmrt);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.String strCopydefault;
        java.lang.String strKWHzl;
        synchronized (this) {
            j = this.gEmmrt;
            this.gEmmrt = 0L;
        }
        AbstractC50583vTu.StateListAnimator stateListAnimator = this.OLrzqt;
        long j2 = j & 3;
        if (j2 == 0 || stateListAnimator == null) {
            strCopydefault = null;
            strKWHzl = null;
        } else {
            strCopydefault = stateListAnimator.copydefault();
            strKWHzl = stateListAnimator.KWHzl();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.KWHzl, strKWHzl);
            TextViewBindingAdapter.setText(this.copydefault, strCopydefault);
        }
    }
}
