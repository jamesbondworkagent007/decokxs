package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lwg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31578lwg extends AbstractC31576lwe {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public long ejfBZ;

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
        sparseIntArray.put(C31351lsQ.Application.gdmIOq, 2);
        sparseIntArray.put(C31351lsQ.Application.invokespecialRuDPQV, 3);
        sparseIntArray.put(C31351lsQ.Application.invokespecialsiEkQe, 4);
        sparseIntArray.put(C31351lsQ.Application.jNexW, 5);
        sparseIntArray.put(C31351lsQ.Application.DAgZj, 6);
        sparseIntArray.put(C31351lsQ.Application.invokespecialaKhcqp, 7);
        sparseIntArray.put(C31351lsQ.Application.hPlhRW, 8);
        sparseIntArray.put(C31351lsQ.Application.OgHfcT, 9);
        sparseIntArray.put(C31351lsQ.Application.Dfm, 10);
        sparseIntArray.put(C31351lsQ.Application.ardYFU, 11);
        sparseIntArray.put(C31351lsQ.Application.invokespecialDPHOMC, 12);
    }

    public C31578lwg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, DbNXlk, fetchVPNInfo));
    }

    public C31578lwg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[0], (android.widget.ImageView) objArr[12], (android.widget.ImageView) objArr[3], (android.widget.ImageView) objArr[7], (android.widget.ImageView) objArr[4], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[10], (ConstraintLayout) objArr[9], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[11]);
        this.ejfBZ = -1L;
        this.EZpvd.setTag(null);
        this.valueOf.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ejfBZ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.ejfBZ;
            this.ejfBZ = 0L;
        }
        if ((j & 1) != 0) {
            C31908mIj.KWHzl(this.valueOf, 2);
        }
    }
}
