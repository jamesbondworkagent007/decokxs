package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lwj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31581lwj extends AbstractC31580lwi {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public final ConstraintLayout ejfBZ;
    public long values;

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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.invokespecialaVhqwO, 1);
        sparseIntArray.put(C31351lsQ.Application.RcvFxC, 2);
        sparseIntArray.put(C31351lsQ.Application.zlzhuY, 3);
        sparseIntArray.put(C31351lsQ.Application.DsfknC, 4);
        sparseIntArray.put(C31351lsQ.Application.HJWChPRAkuRW, 5);
        sparseIntArray.put(C31351lsQ.Application.IKQXqd, 6);
        sparseIntArray.put(C31351lsQ.Application.adwzgZ, 7);
        sparseIntArray.put(C31351lsQ.Application.OKSWiw, 8);
        sparseIntArray.put(C31351lsQ.Application.DPVBvL, 9);
        sparseIntArray.put(C31351lsQ.Application.setProfilesSinceInitCount, 10);
        sparseIntArray.put(C31351lsQ.Application.DaTmkG, 11);
        sparseIntArray.put(C31351lsQ.Application.RkASWs, 12);
    }

    public C31581lwj(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, isConnected, DbNXlk));
    }

    public C31581lwj(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[12], (android.widget.ImageView) objArr[1], (android.widget.ImageView) objArr[11], (android.widget.Space) objArr[2], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[6]);
        this.values = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ejfBZ = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
