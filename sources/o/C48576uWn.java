package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uWn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48576uWn extends AbstractC48578uWp {
    public static final android.util.SparseIntArray EZpvd;
    public static final ViewDataBinding.IncludedLayouts copydefault = null;
    public long AEQbTJ;
    public final android.widget.FrameLayout gEmmrt;

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
        EZpvd = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.setHandler, 1);
        sparseIntArray.put(C48033uCm.Application.fhUrPt, 2);
    }

    public C48576uWn(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, copydefault, EZpvd));
    }

    public C48576uWn(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, new ViewStubProxy((android.view.ViewStub) objArr[2]), new ViewStubProxy((android.view.ViewStub) objArr[1]));
        this.AEQbTJ = -1L;
        this.OLrzqt.setContainingBinding(this);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.gEmmrt = frameLayout;
        frameLayout.setTag(null);
        this.KWHzl.setContainingBinding(this);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AEQbTJ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AEQbTJ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AEQbTJ = 0L;
        }
        if (this.OLrzqt.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.OLrzqt.getBinding());
        }
        if (this.KWHzl.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.KWHzl.getBinding());
        }
    }
}
