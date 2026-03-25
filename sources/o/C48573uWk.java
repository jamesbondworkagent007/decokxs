package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uWk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48573uWk extends AbstractC48570uWh {
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public static final android.util.SparseIntArray fIwbmz;
    public long fARcdN;

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
        sparseIntArray.put(C48033uCm.Application.setTintList, 8);
        sparseIntArray.put(C48033uCm.Application.setEnterFadeDuration, 9);
        sparseIntArray.put(C48033uCm.Application.ParceledListSliceAdapterApi21, 10);
        sparseIntArray.put(C48033uCm.Application.RatingCompat, 11);
        sparseIntArray.put(C48033uCm.Application.setExitFadeDuration, 12);
        sparseIntArray.put(C48033uCm.Application.setConstantState, 13);
        sparseIntArray.put(C48033uCm.Application.MediaMetadataCompatLongKey, 14);
        sparseIntArray.put(C48033uCm.Application.MediaMetadataCompatApi21, 15);
    }

    public C48573uWk(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 16, ejfBZ, fIwbmz));
    }

    public C48573uWk(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (Barrier) objArr[3], (Barrier) objArr[6], (Guideline) objArr[0], (android.widget.TextView) objArr[15], (ConstraintLayout) objArr[5], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[11], (ConstraintLayout) objArr[2], (android.widget.TextView) objArr[10], (C51287vkF) objArr[7], (android.widget.TextView) objArr[13], (ConstraintLayout) objArr[4], (android.widget.TextView) objArr[12], (AppCompatTextView) objArr[9], (ConstraintLayout) objArr[1], (AppCompatTextView) objArr[8]);
        this.fARcdN = -1L;
        this.KWHzl.setTag(null);
        this.copydefault.setTag(null);
        this.AEQbTJ.setTag(null);
        this.OLrzqt.setTag(null);
        this.djBIcL.setTag(null);
        this.valueOf.setTag(null);
        this.AkhnZx.setTag(null);
        this.fetchVPNInfo.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fARcdN != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fARcdN = 0L;
        }
    }
}
