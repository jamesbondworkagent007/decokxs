package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47451tqL extends AbstractC47450tqK {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray KWHzl;
    public final android.widget.RelativeLayout OLrzqt;
    public long copydefault;

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
        KWHzl = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.DcMfJK, 1);
    }

    public C47451tqL(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, AEQbTJ, KWHzl));
    }

    public C47451tqL(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, new ViewStubProxy((android.view.ViewStub) objArr[1]));
        this.copydefault = -1L;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) objArr[0];
        this.OLrzqt = relativeLayout;
        relativeLayout.setTag(null);
        this.EZpvd.setContainingBinding(this);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.copydefault = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.copydefault != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.copydefault = 0L;
        }
        if (this.EZpvd.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.EZpvd.getBinding());
        }
    }
}
