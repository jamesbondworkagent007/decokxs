package o;

import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.evU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C17049evU extends AbstractC17047evS {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray valueOf = null;
    public long AYXKKw;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public C17049evU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 6, gEmmrt, valueOf));
    }

    public C17049evU(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.ImageView) objArr[4], (Guideline) objArr[1], (android.widget.ImageView) objArr[2], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[0], (android.view.View) objArr[5]);
        this.AYXKKw = -1L;
        this.OLrzqt.setTag(null);
        this.EZpvd.setTag(null);
        this.copydefault.setTag(null);
        this.AEQbTJ.setTag(null);
        this.KWHzl.setTag(null);
        this.djBIcL.setTag(null);
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
