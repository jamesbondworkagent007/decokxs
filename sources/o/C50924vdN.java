package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.vdN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50924vdN extends AbstractC50927vdQ {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray isConnected = null;
    public long ejfBZ;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public C50924vdN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 13, AkhnZx, isConnected));
    }

    public C50924vdN(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (C53539wnR) objArr[10], (C53539wnR) objArr[4], (C52794wYp) objArr[7], (C52794wYp) objArr[2], (Barrier) objArr[6], (C52794wYp) objArr[1], (C52794wYp) objArr[0], (C53539wnR) objArr[5], (C53539wnR) objArr[8], (C53539wnR) objArr[9], (C53539wnR) objArr[3], (Barrier) objArr[11], (C52794wYp) objArr[12]);
        this.ejfBZ = -1L;
        this.EZpvd.setTag(null);
        this.AEQbTJ.setTag(null);
        this.copydefault.setTag(null);
        this.OLrzqt.setTag(null);
        this.KWHzl.setTag(null);
        this.djBIcL.setTag(null);
        this.AYXKKw.setTag(null);
        this.valueOf.setTag(null);
        this.AhwBna.setTag(null);
        this.gEmmrt.setTag(null);
        this.fetchVPNInfo.setTag(null);
        this.values.setTag(null);
        this.DbNXlk.setTag(null);
        setRootTag(viewArr);
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
        synchronized (this) {
            this.ejfBZ = 0L;
        }
    }
}
