package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uWu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48583uWu extends AbstractC48579uWq {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray fIwbmz;
    public long AuCTel;
    public final ConstraintLayout fARcdN;

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
        fIwbmz = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.MediaMetadataCompatRatingKey, 1);
        sparseIntArray.put(C48033uCm.Application.ICustomTabsCallback, 2);
        sparseIntArray.put(C48033uCm.Application.WindowDecorActionBarActionModeImpl, 3);
        sparseIntArray.put(C48033uCm.Application.DaRZkR, 4);
        sparseIntArray.put(C48033uCm.Application.getMinimumWidth, 5);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 6);
        sparseIntArray.put(C48033uCm.Application.QsIRgs, 7);
        sparseIntArray.put(C48033uCm.Application.HJWChPQPAeHI, 8);
        sparseIntArray.put(C48033uCm.Application.setShuffleModeEnabledRemoved, 9);
        sparseIntArray.put(C48033uCm.Application.removeQueueItemAt, 10);
        sparseIntArray.put(C48033uCm.Application.ComponentActivity, 11);
        sparseIntArray.put(C48033uCm.Application.Api19Impl, 12);
        sparseIntArray.put(C48033uCm.Application.r8lambdah2i_RK2mddCIbAsGubaI4eL8_cU, 13);
        sparseIntArray.put(C48033uCm.Application.createCallback, 14);
    }

    public C48583uWu(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, DbNXlk, fIwbmz));
    }

    public C48583uWu(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C53539wnR) objArr[4], (android.widget.TextView) objArr[8], (C49774uur) objArr[7], (android.widget.TextView) objArr[6], (C47988uAv) objArr[2], (C52563wQa) objArr[1], (android.widget.TextView) objArr[10], (LinearLayoutCompat) objArr[9], (android.widget.TextView) objArr[14], (wYK) objArr[12], (LinearLayoutCompat) objArr[11], (C55258xgZ) objArr[13], (uBL) objArr[3], (C54154wyx) objArr[5]);
        this.AuCTel = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fARcdN = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTel = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AuCTel != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTel = 0L;
        }
    }
}
