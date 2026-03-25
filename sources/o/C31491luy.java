package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31491luy extends AbstractC31490lux {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long djBIcL;

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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.HJWChPOZOJIj, 1);
        sparseIntArray.put(C31351lsQ.Application.DjwCMv, 2);
        sparseIntArray.put(C31351lsQ.Application.QkdxfA, 3);
        sparseIntArray.put(C31351lsQ.Application.DPHNDa, 4);
        sparseIntArray.put(C31351lsQ.Application.QSBOWP, 5);
    }

    public C31491luy(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, valueOf, AYXKKw));
    }

    public C31491luy(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[3], (C52794wYp) objArr[5], (ConstraintLayout) objArr[0], (RecyclerView) objArr[4], (android.widget.TextView) objArr[2], (ConstraintLayout) objArr[1]);
        this.djBIcL = -1L;
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
    }
}
