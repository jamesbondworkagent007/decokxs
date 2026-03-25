package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lxp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31614lxp extends AbstractC31615lxq {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.zsXlph, 1);
        sparseIntArray.put(C31351lsQ.Application.WS, 2);
        sparseIntArray.put(C31351lsQ.Application.igXuih, 3);
        sparseIntArray.put(C31351lsQ.Application.htlTjW, 4);
        sparseIntArray.put(C31351lsQ.Application.DGOPHZ, 5);
        sparseIntArray.put(C31351lsQ.Application.wlaJM, 6);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKDSqxTE, 7);
        sparseIntArray.put(C31351lsQ.Application.fdOvFl, 8);
        sparseIntArray.put(C31351lsQ.Application.fDu, 9);
        sparseIntArray.put(C31351lsQ.Application.ixgjPv, 10);
        sparseIntArray.put(C31351lsQ.Application.fjfviF, 11);
    }

    public C31614lxp(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, AkhnZx, fetchVPNInfo));
    }

    public C31614lxp(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[1], (Guideline) objArr[6], (lSR) objArr[11], (android.widget.TextView) objArr[4], (android.widget.ImageView) objArr[3], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[5], (android.view.View) objArr[7], (Barrier) objArr[9]);
        this.isConnected = -1L;
        this.AEQbTJ.setTag(null);
        setRootTag(view);
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
    }
}
