package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iMj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23870iMj extends AbstractC23872iMl {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray valueOf;
    public long isConnected;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        valueOf = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.SqfPTR, 1);
        sparseIntArray.put(C25493ixk.ActionBar.DDxOgT, 2);
        sparseIntArray.put(C25493ixk.ActionBar.cancelAll, 7);
    }

    public C23870iMj(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 8, AhwBna, valueOf));
    }

    public C23870iMj(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.view.View) objArr[4], (android.view.View) objArr[5], (C55113xdn) objArr[6], (android.widget.HorizontalScrollView) objArr[3], new ViewStubProxy((android.view.ViewStub) objArr[1]), new ViewStubProxy((android.view.ViewStub) objArr[2]), (android.widget.LinearLayout) objArr[7], (android.widget.TextView) objArr[0]);
        this.isConnected = -1L;
        this.OLrzqt.setTag(null);
        this.copydefault.setTag(null);
        this.AEQbTJ.setTag(null);
        this.KWHzl.setTag(null);
        this.EZpvd.setContainingBinding(this);
        this.AYXKKw.setContainingBinding(this);
        this.djBIcL.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
        if (this.EZpvd.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.EZpvd.getBinding());
        }
        if (this.AYXKKw.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.AYXKKw.getBinding());
        }
    }
}
