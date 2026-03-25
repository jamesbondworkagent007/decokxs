package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nHL extends nHK {
    public static final ViewDataBinding.IncludedLayouts fIwbmz = null;
    public static final android.util.SparseIntArray fJNWhG;
    public long AuCTel;

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
        fJNWhG = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.zbGDDc, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.AxsJAY, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.zMXLsR, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.zuBGHE, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.gasjUx, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.getUriFromString, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.dTTfOR, 7);
        sparseIntArray.put(C35399nuc.StateListAnimator.QOjuYg, 8);
        sparseIntArray.put(C35399nuc.StateListAnimator.DcMfJKfNUfqk, 9);
        sparseIntArray.put(C35399nuc.StateListAnimator.RTWSvT, 10);
        sparseIntArray.put(C35399nuc.StateListAnimator.SqfPTR, 11);
        sparseIntArray.put(C35399nuc.StateListAnimator.DcMfJKDSqxTE, 12);
        sparseIntArray.put(C35399nuc.StateListAnimator.inahnb, 13);
        sparseIntArray.put(C35399nuc.StateListAnimator.DcMfJKDIADVb, 14);
        sparseIntArray.put(C35399nuc.StateListAnimator.RSDDiY, 15);
        sparseIntArray.put(C35399nuc.StateListAnimator.QfsBiF, 16);
    }

    public nHL(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, fIwbmz, fJNWhG));
    }

    public nHL(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[4], (wYC) objArr[2], (wYF) objArr[16], (android.widget.ImageView) objArr[5], (android.widget.ImageView) objArr[15], (C35893oHp) objArr[10], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[12], (android.widget.LinearLayout) objArr[9], (C6995aZr) objArr[13], (ConstraintLayout) objArr[0], (android.widget.ScrollView) objArr[8], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[3], (C55173xeu) objArr[7], (C55113xdn) objArr[6]);
        this.AuCTel = -1L;
        this.DbNXlk.setTag(null);
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
