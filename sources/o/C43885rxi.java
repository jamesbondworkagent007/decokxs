package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.C32113mPz;

/* JADX INFO: renamed from: o.rxi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43885rxi extends AbstractC43883rxg {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray AhwBna = null;
    public long gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@androidx.annotation.Nullable rIB rib) {
        this.KWHzl = rib;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C43885rxi(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, AEQbTJ, AhwBna));
    }

    public C43885rxi(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYK) objArr[1], (ConstraintLayout) objArr[0]);
        this.gEmmrt = -1L;
        this.OLrzqt.setTag(null);
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 4L;
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
        if (C43664rtZ.AEQbTJ == i) {
            copydefault((rIB) obj);
        } else {
            if (C43664rtZ.OLrzqt != i) {
                return false;
            }
            OLrzqt((java.lang.Boolean) obj);
        }
        return true;
    }

    @Override // o.AbstractC43883rxg
    public void OLrzqt(@androidx.annotation.Nullable java.lang.Boolean bool) {
        this.EZpvd = bool;
        synchronized (this) {
            this.gEmmrt |= 2;
        }
        notifyPropertyChanged(C43664rtZ.OLrzqt);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.gEmmrt;
            this.gEmmrt = 0L;
        }
        java.lang.Boolean bool = this.EZpvd;
        long j2 = j & 6;
        float dimension = 0.0f;
        if (j2 != 0) {
            boolean zSafeUnbox = ViewDataBinding.safeUnbox(bool);
            if (j2 != 0) {
                j |= zSafeUnbox ? 16L : 8L;
            }
            if (zSafeUnbox) {
                dimension = this.OLrzqt.getResources().getDimension(C32113mPz.StateListAnimator.DbNXlk);
            }
        }
        if ((j & 6) != 0) {
            TextViewBindingAdapter.setLineSpacingExtra(this.OLrzqt, dimension);
        }
    }
}
