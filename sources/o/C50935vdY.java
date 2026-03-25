package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vdY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50935vdY extends AbstractC50929vdS {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.isShowing, 5);
        sparseIntArray.put(C48033uCm.Application.ReportDrawnAfter, 6);
        sparseIntArray.put(C48033uCm.Application.hide, 7);
        sparseIntArray.put(C48033uCm.Application.ReportDrawnKtReportDrawnAfterfullyDrawnReporter1, 8);
        sparseIntArray.put(C48033uCm.Application.invalidateMenu, 9);
    }

    public C50935vdY(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 10, AkhnZx, fetchVPNInfo));
    }

    public C50935vdY(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.ImageView) objArr[2], (android.view.View) objArr[1], (ConstraintLayout) objArr[4], (android.view.View) objArr[3], (android.widget.TextView) objArr[9], (wYK) objArr[6], (C47988uAv) objArr[8], (C55258xgZ) objArr[0], (wYK) objArr[5], (C47988uAv) objArr[7]);
        this.values = -1L;
        this.OLrzqt.setTag(null);
        this.EZpvd.setTag(null);
        this.KWHzl.setTag(null);
        this.copydefault.setTag(null);
        this.AhwBna.setTag(null);
        setRootTag(viewArr);
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
