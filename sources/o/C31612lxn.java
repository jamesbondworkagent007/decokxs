package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lxn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31612lxn extends AbstractC31613lxo {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public final ConstraintLayout AkhnZx;
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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.DIIpTV, 1);
        sparseIntArray.put(C31351lsQ.Application.DrqXHJ, 2);
        sparseIntArray.put(C31351lsQ.Application.DGUQLIhJrIAr, 3);
        sparseIntArray.put(C31351lsQ.Application.DUUtXg, 4);
        sparseIntArray.put(C31351lsQ.Application.DSiOMJ, 5);
        sparseIntArray.put(C31351lsQ.Application.fXHmeK, 6);
        sparseIntArray.put(C31351lsQ.Application.sRzUNh, 7);
        sparseIntArray.put(C31351lsQ.Application.inahnb, 8);
        sparseIntArray.put(C31351lsQ.Application.zFtALg, 9);
        sparseIntArray.put(C31351lsQ.Application.RLmrWm, 10);
    }

    public C31612lxn(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, values, fetchVPNInfo));
    }

    public C31612lxn(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[6], (android.widget.ImageView) objArr[5], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3], (android.widget.ImageView) objArr[2], (ConstraintLayout) objArr[1], (android.widget.ImageView) objArr[10], (android.widget.TextView) objArr[9], (android.widget.ImageView) objArr[8], (ConstraintLayout) objArr[7]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
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
