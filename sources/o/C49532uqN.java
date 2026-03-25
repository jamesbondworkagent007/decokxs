package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.uqN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49532uqN extends AbstractC49533uqO {
    public static final android.util.SparseIntArray djBIcL = null;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long AYXKKw;
    public final android.view.View valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public C49532uqN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 7, gEmmrt, djBIcL));
    }

    public C49532uqN(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[3], (C52794wYp) objArr[5], (AppCompatImageView) objArr[0], (C52794wYp) objArr[4], (AppCompatTextView) objArr[1]);
        this.AYXKKw = -1L;
        this.OLrzqt.setTag(null);
        this.AEQbTJ.setTag(null);
        this.copydefault.setTag(null);
        this.EZpvd.setTag(null);
        android.view.View view = (android.view.View) objArr[6];
        this.valueOf = view;
        view.setTag(null);
        this.KWHzl.setTag(null);
        this.AhwBna.setTag(null);
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
