package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ewS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C17100ewS extends AbstractC17099ewR {
    public static final android.util.SparseIntArray AEQbTJ;
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public final android.widget.Space AhwBna;
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
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.QkdxfA, 1);
        sparseIntArray.put(C13754dXa.ActionBar.RKDWNf, 2);
    }

    public C17100ewS(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 3, EZpvd, AEQbTJ));
    }

    public C17100ewS(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, new ViewStubProxy((android.view.ViewStub) objArr[1]), new ViewStubProxy((android.view.ViewStub) objArr[2]));
        this.copydefault = -1L;
        this.OLrzqt.setContainingBinding(this);
        this.KWHzl.setContainingBinding(this);
        android.widget.Space space = (android.widget.Space) objArr[0];
        this.AhwBna = space;
        space.setTag(null);
        setRootTag(viewArr);
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
        if (this.OLrzqt.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.OLrzqt.getBinding());
        }
        if (this.KWHzl.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.KWHzl.getBinding());
        }
    }
}
