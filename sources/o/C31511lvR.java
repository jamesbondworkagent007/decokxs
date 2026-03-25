package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31511lvR extends AbstractC31506lvM {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray gEmmrt;
    public final ConstraintLayout fetchVPNInfo;
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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.config, 1);
        sparseIntArray.put(C31351lsQ.Application.fXYAwm, 2);
        sparseIntArray.put(C31351lsQ.Application.resume, 3);
        sparseIntArray.put(C31351lsQ.Application.getLocation, 4);
        sparseIntArray.put(C31351lsQ.Application.zqTOFw, 5);
        sparseIntArray.put(C31351lsQ.Application.zlvcHA, 6);
        sparseIntArray.put(C31351lsQ.Application.zhUgOk, 7);
        sparseIntArray.put(C31351lsQ.Application.zYHWMc, 8);
    }

    public C31511lvR(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AhwBna, gEmmrt));
    }

    public C31511lvR(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[7], (ConstraintLayout) objArr[6], (android.widget.ImageView) objArr[8], (android.widget.TextView) objArr[5], (android.widget.ImageView) objArr[2], (ConstraintLayout) objArr[1], (C55251xgS) objArr[4], (android.widget.TextView) objArr[3]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
        constraintLayout.setTag(null);
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
