package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lxd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31602lxd extends AbstractC31603lxe {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long AhwBna;
    public final ConstraintLayout AkhnZx;

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
        sparseIntArray.put(C31351lsQ.Application.values, 1);
        sparseIntArray.put(C31351lsQ.Application.getAdvertisingId, 2);
        sparseIntArray.put(C31351lsQ.Application.AkhnZx, 3);
        sparseIntArray.put(C31351lsQ.Application.RIuxYh, 4);
        sparseIntArray.put(C31351lsQ.Application.isConnected, 5);
        sparseIntArray.put(C31351lsQ.Application.QDqgQU, 6);
        sparseIntArray.put(C31351lsQ.Application.RXzakW, 7);
    }

    public C31602lxd(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, valueOf, AYXKKw));
    }

    public C31602lxd(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[5], (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7], (ConstraintLayout) objArr[4], (C55113xdn) objArr[2]);
        this.AhwBna = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AhwBna != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
    }
}
