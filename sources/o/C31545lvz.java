package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31545lvz extends AbstractC31544lvy {
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
        sparseIntArray.put(C31351lsQ.Application.iLAtSv, 1);
        sparseIntArray.put(C31351lsQ.Application.getNewProxyInstance, 2);
        sparseIntArray.put(C31351lsQ.Application.zLAIeZ, 3);
        sparseIntArray.put(C31351lsQ.Application.OxVOHk, 4);
        sparseIntArray.put(C31351lsQ.Application.sVvuFk, 5);
        sparseIntArray.put(C31351lsQ.Application.idLUrz, 6);
        sparseIntArray.put(C31351lsQ.Application.gUEfcq, 7);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKsuEgdN, 8);
    }

    public C31545lvz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AhwBna, gEmmrt));
    }

    public C31545lvz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[2], (ConstraintLayout) objArr[4], (C55173xeu) objArr[7], (android.widget.TextView) objArr[3], (C55113xdn) objArr[8], (RecyclerView) objArr[5], (C52794wYp) objArr[6], (androidx.appcompat.widget.Toolbar) objArr[1]);
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
        long j;
        synchronized (this) {
            j = this.isConnected;
            this.isConnected = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.fetchVPNInfo, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}
