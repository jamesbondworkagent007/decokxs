package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* JADX INFO: renamed from: o.nLp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33943nLp extends AbstractC33939nLl {
    public static final ViewDataBinding.IncludedLayouts KWHzl = null;
    public static final android.util.SparseIntArray valueOf = null;
    public final ConstraintLayout AYXKKw;
    public long AhwBna;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C33943nLp(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, KWHzl, valueOf));
    }

    public C33943nLp(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[2], (C55239xgG) objArr[3], (android.widget.TextView) objArr[1]);
        this.AhwBna = -1L;
        this.EZpvd.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AYXKKw = constraintLayout;
        constraintLayout.setTag(null);
        this.AEQbTJ.setTag(null);
        this.OLrzqt.setTag(null);
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
        if (C35342ntX.gEmmrt != i) {
            return false;
        }
        copydefault((C37201opP) obj);
        return true;
    }

    @Override // o.AbstractC33939nLl
    public void copydefault(@androidx.annotation.Nullable C37201opP c37201opP) {
        this.copydefault = c37201opP;
        synchronized (this) {
            this.AhwBna |= 1;
        }
        notifyPropertyChanged(C35342ntX.gEmmrt);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.String strOLrzqt;
        boolean zEZpvd;
        java.lang.String strAEQbTJ;
        synchronized (this) {
            j = this.AhwBna;
            this.AhwBna = 0L;
        }
        C37201opP c37201opP = this.copydefault;
        long j2 = j & 3;
        if (j2 == 0 || c37201opP == null) {
            strOLrzqt = null;
            zEZpvd = false;
            strAEQbTJ = null;
        } else {
            zEZpvd = c37201opP.EZpvd();
            strOLrzqt = c37201opP.OLrzqt();
            strAEQbTJ = c37201opP.AEQbTJ();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.EZpvd, strAEQbTJ);
            CompoundButtonBindingAdapter.setChecked(this.AEQbTJ, zEZpvd);
            TextViewBindingAdapter.setText(this.OLrzqt, strOLrzqt);
        }
    }
}
