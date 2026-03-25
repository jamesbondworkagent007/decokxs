package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uSz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48480uSz extends uSD {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
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
        sparseIntArray.put(C48033uCm.Application.prepareFromMediaId, 8);
        sparseIntArray.put(C48033uCm.Application.prepare, 9);
        sparseIntArray.put(C48033uCm.Application.newView, 10);
        sparseIntArray.put(C48033uCm.Application.ITrustedWebActivityService, 11);
    }

    public C48480uSz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 12, DbNXlk, fetchVPNInfo));
    }

    public C48480uSz(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (C47988uAv) objArr[0], (C53539wnR) objArr[3], (android.widget.TextView) objArr[5], (C55258xgZ) objArr[11], (android.widget.LinearLayout) objArr[6], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[8], (ConstraintLayout) objArr[2], (android.widget.TextView) objArr[7], (wYK) objArr[10], (uBL) objArr[1], (C54154wyx) objArr[4]);
        this.isConnected = -1L;
        this.KWHzl.setTag(null);
        this.copydefault.setTag(null);
        this.AEQbTJ.setTag(null);
        this.OLrzqt.setTag(null);
        this.AYXKKw.setTag(null);
        this.djBIcL.setTag(null);
        this.AkhnZx.setTag(null);
        this.values.setTag(null);
        setRootTag(viewArr);
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
