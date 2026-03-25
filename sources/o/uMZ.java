package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uMZ extends uMX {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray fARcdN;
    public long fIwbmz;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@androidx.annotation.Nullable C55915xsu c55915xsu) {
        this.djBIcL = c55915xsu;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        fARcdN = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.DdI, 1);
        sparseIntArray.put(C48033uCm.Application.gLWkOL, 2);
        sparseIntArray.put(C48033uCm.Application.QBiWsm, 3);
        sparseIntArray.put(C48033uCm.Application.IMediaSessionStub, 4);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatMediaSessionImplBaseCommand, 5);
        sparseIntArray.put(C48033uCm.Application.playFromSearch, 6);
        sparseIntArray.put(C48033uCm.Application.DtnWsU, 7);
        sparseIntArray.put(C48033uCm.Application.removeCancellable, 8);
        sparseIntArray.put(C48033uCm.Application.sQOHWT, 9);
        sparseIntArray.put(C48033uCm.Application.getConnectivityMgr, 10);
        sparseIntArray.put(C48033uCm.Application.FF, 11);
        sparseIntArray.put(C48033uCm.Application.OHsvZP, 12);
    }

    public uMZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, AkhnZx, fARcdN));
    }

    public uMZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C53533wnL) objArr[2], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[12], (C55258xgZ) objArr[10], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[3], (C47988uAv) objArr[9], (ConstraintLayout) objArr[1], (C47988uAv) objArr[6], (C47988uAv) objArr[4], (NestedScrollView) objArr[0], (android.widget.TextView) objArr[5], (C55258xgZ) objArr[8]);
        this.fIwbmz = -1L;
        this.DbNXlk.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 2L;
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
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C48034uCn.OLrzqt != i) {
            return false;
        }
        EZpvd((C55915xsu) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fIwbmz = 0L;
        }
    }
}
