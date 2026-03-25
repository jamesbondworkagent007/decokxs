package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31519lvZ extends AbstractC31518lvY {
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public static final android.util.SparseIntArray values;
    public long DbNXlk;

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
        values = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.RIuxYh, 1);
        sparseIntArray.put(C31351lsQ.Application.aGOrKO, 2);
        sparseIntArray.put(C31351lsQ.Application.Rtjmuc, 3);
        sparseIntArray.put(C31351lsQ.Application.DarRvM, 4);
        sparseIntArray.put(C31351lsQ.Application.fetchVPNInfo, 5);
        sparseIntArray.put(C31351lsQ.Application.QfZsXX, 6);
        sparseIntArray.put(C31351lsQ.Application.QOjuYg, 7);
        sparseIntArray.put(C31351lsQ.Application.HJWChPOKBmQN, 8);
        sparseIntArray.put(C31351lsQ.Application.HJWChPQPAeHI, 9);
    }

    public C31519lvZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, fetchVPNInfo, values));
    }

    public C31519lvZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[5], (android.widget.ImageView) objArr[4], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[2], (C55033xcM) objArr[3], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[9], (android.widget.ImageView) objArr[7], (ConstraintLayout) objArr[6]);
        this.DbNXlk = -1L;
        this.AEQbTJ.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
