package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uSE extends uSF {
    public static final ViewDataBinding.IncludedLayouts uzCIH = null;
    public static final android.util.SparseIntArray zsXlph;
    public long AuCTelauCTel;
    public final LinearLayoutCompat AubY;

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
        zsXlph = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.invokespecialaVhqwO, 2);
        sparseIntArray.put(C48033uCm.Application.gGNlxh, 3);
        sparseIntArray.put(C48033uCm.Application.RemoteActionCompatParcelizer, 4);
        sparseIntArray.put(C48033uCm.Application.StyleableRes, 5);
        sparseIntArray.put(C48033uCm.Application.onNothingSelected, 6);
        sparseIntArray.put(C48033uCm.Application.InspectableProperty, 7);
        sparseIntArray.put(C48033uCm.Application.IdRes, 8);
        sparseIntArray.put(C48033uCm.Application.FractionRes, 9);
        sparseIntArray.put(C48033uCm.Application.Qsauvs, 10);
        sparseIntArray.put(C48033uCm.Application.fAklCm, 11);
        sparseIntArray.put(C48033uCm.Application.DVmcag, 12);
        sparseIntArray.put(C48033uCm.Application.dPnHjp, 13);
        sparseIntArray.put(C48033uCm.Application.verifyToken, 14);
        sparseIntArray.put(C48033uCm.Application.DQYQgr, 15);
        sparseIntArray.put(C48033uCm.Application.DKtBnz, 16);
        sparseIntArray.put(C48033uCm.Application.DIIpTV, 17);
        sparseIntArray.put(C48033uCm.Application.EZpvd, 18);
        sparseIntArray.put(C48033uCm.Application.AEQbTJ, 19);
        sparseIntArray.put(C48033uCm.Application.ensureViewModelStore, 20);
        sparseIntArray.put(C48033uCm.Application.setHotspotBounds, 21);
        sparseIntArray.put(C48033uCm.Application.setTintMode, 22);
        sparseIntArray.put(C48033uCm.Application.setVisible, 23);
        sparseIntArray.put(C48033uCm.Application.DPHsZd, 24);
    }

    public uSE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 25, uzCIH, zsXlph));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public uSE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[18];
        android.widget.TextView textView = (android.widget.TextView) objArr[19];
        C48208uIz c48208uIz = (C48208uIz) objArr[17];
        FragmentContainerView fragmentContainerView = (FragmentContainerView) objArr[16];
        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) objArr[24];
        java.lang.Object obj = objArr[2];
        super(dataBindingComponent, view, 0, linearLayoutCompat, textView, c48208uIz, fragmentContainerView, fragmentContainerView2, obj != null ? uRP.copydefault((android.view.View) obj) : null, (FragmentContainerView) objArr[15], (wPY) objArr[13], (ConstraintLayout) objArr[3], (C55249xgQ) objArr[12], (LinearLayoutCompat) objArr[10], (C55258xgZ) objArr[11], (C51601vqB) objArr[4], (NestedScrollView) objArr[0], (uII) objArr[14], (android.widget.TextView) objArr[20], (C55372xih) objArr[9], (LinearLayoutCompat) objArr[7], (C55372xih) objArr[8], (android.widget.RelativeLayout) objArr[5], (android.widget.TextView) objArr[6], (LinearLayoutCompat) objArr[21], (android.widget.TextView) objArr[22], (android.widget.TextView) objArr[23]);
        this.AuCTelauCTel = -1L;
        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) objArr[1];
        this.AubY = linearLayoutCompat2;
        linearLayoutCompat2.setTag(null);
        this.fetchVPNInfo.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTelauCTel = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AuCTelauCTel != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTelauCTel = 0L;
        }
    }
}
