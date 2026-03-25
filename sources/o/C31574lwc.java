package o;

import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lwc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31574lwc extends AbstractC31577lwf {
    public static final android.util.SparseIntArray ejfBZ;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public final ConstraintLayout fARcdN;
    public long fIwbmz;

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
        ejfBZ = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.RbVjfb, 1);
        sparseIntArray.put(C31351lsQ.Application.YFmri, 2);
        sparseIntArray.put(C31351lsQ.Application.RZNAhV, 3);
        sparseIntArray.put(C31351lsQ.Application.RgLUBD, 4);
        sparseIntArray.put(C31351lsQ.Application.HJWChPdNQGVJ, 5);
        sparseIntArray.put(C31351lsQ.Application.gZKUVK, 6);
        sparseIntArray.put(C31351lsQ.Application.iLWfRf, 7);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKfwDlxl, 8);
        sparseIntArray.put(C31351lsQ.Application.HJWChPdIKEqB, 9);
        sparseIntArray.put(C31351lsQ.Application.getSessionID, 10);
        sparseIntArray.put(C31351lsQ.Application.gAnGwV, 11);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKsfEqpH, 12);
        sparseIntArray.put(C31351lsQ.Application.XW, 13);
        sparseIntArray.put(C31351lsQ.Application.bindToGooglePlayService, 14);
    }

    public C31574lwc(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, isConnected, ejfBZ));
    }

    public C31574lwc(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[1], (android.widget.ImageView) objArr[3], (C55251xgS) objArr[4], (android.widget.ImageView) objArr[2], (android.widget.ImageView) objArr[10], (C52794wYp) objArr[12], (ConstraintLayout) objArr[8], (C52794wYp) objArr[13], (C52794wYp) objArr[14], (RecyclerView) objArr[11], (ComposeView) objArr[7], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6]);
        this.fIwbmz = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fARcdN = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fIwbmz != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fIwbmz = 0L;
        }
    }
}
