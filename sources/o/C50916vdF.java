package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.vdF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50916vdF extends AbstractC50913vdC {
    public static final ViewDataBinding.IncludedLayouts copydefault = null;
    public static final android.util.SparseIntArray gEmmrt = null;
    public long AYXKKw;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public C50916vdF(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 4, copydefault, gEmmrt));
    }

    public C50916vdF(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (C53420wlE) objArr[0], (C55258xgZ) objArr[2], (C47988uAv) objArr[1], (AppCompatTextView) objArr[3]);
        this.AYXKKw = -1L;
        this.KWHzl.setTag(null);
        this.AEQbTJ.setTag(null);
        this.EZpvd.setTag(null);
        this.OLrzqt.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
    }
}
