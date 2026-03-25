package o;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.google.android.material.appbar.AppBarLayout;
import o.C32982mnp;

/* JADX INFO: renamed from: o.mps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33091mps extends AbstractC33093mpu {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray AhwBna;
    public long gEmmrt;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AhwBna = sparseIntArray;
        sparseIntArray.put(C32982mnp.StateListAnimator.KWHzl, 3);
        sparseIntArray.put(C32982mnp.StateListAnimator.djBIcL, 4);
    }

    public C33091mps(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, AYXKKw, AhwBna));
    }

    public C33091mps(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppBarLayout) objArr[3], (android.widget.FrameLayout) objArr[2], (CoordinatorLayout) objArr[0], (androidx.appcompat.widget.Toolbar) objArr[1], (android.widget.TextView) objArr[4]);
        this.gEmmrt = -1L;
        this.KWHzl.setTag(null);
        this.OLrzqt.setTag(null);
        this.EZpvd.setTag(null);
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
        if (C32974mnh.OLrzqt != i) {
            return false;
        }
        EZpvd(((java.lang.Boolean) obj).booleanValue());
        return true;
    }

    @Override // o.AbstractC33093mpu
    public void EZpvd(boolean z) {
        this.copydefault = z;
        synchronized (this) {
            this.gEmmrt |= 1;
        }
        notifyPropertyChanged(C32974mnh.OLrzqt);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.gEmmrt;
            this.gEmmrt = 0L;
        }
        boolean z = this.copydefault;
        long j2 = j & 3;
        int iAEQbTJ = 0;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= z ? 8L : 4L;
            }
            if (!z) {
                iAEQbTJ = C33570myu.AEQbTJ(getRoot().getContext()) + C33570myu.valueOf(getRoot().getContext());
            }
        }
        if ((j & 3) != 0) {
            ViewBindingAdapter.setPaddingTop(this.KWHzl, iAEQbTJ);
        }
        if ((j & 2) != 0) {
            ViewBindingAdapter.setPaddingTop(this.EZpvd, C33570myu.AEQbTJ(getRoot().getContext()));
            C33090mpr.EZpvd(this.EZpvd, C33570myu.AEQbTJ(getRoot().getContext()) + C33570myu.valueOf(getRoot().getContext()));
        }
    }
}
