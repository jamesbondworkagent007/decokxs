package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.vcm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50896vcm extends AbstractC50895vcl {
    public static final ViewDataBinding.IncludedLayouts copydefault = null;
    public static final android.util.SparseIntArray valueOf = null;
    public long gEmmrt;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public C50896vcm(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 4, copydefault, valueOf));
    }

    public C50896vcm(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (C47988uAv) objArr[2], (C50387vMn) objArr[3], (C53530wnI) objArr[1], (C55258xgZ) objArr[0]);
        this.gEmmrt = -1L;
        this.AEQbTJ.setTag(null);
        this.OLrzqt.setTag(null);
        this.EZpvd.setTag(null);
        this.KWHzl.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
    }
}
