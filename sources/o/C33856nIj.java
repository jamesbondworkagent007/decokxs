package o;

import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nIj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33856nIj extends AbstractC33852nIf {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray fIwbmz;
    public long fJNWhG;

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
        sparseIntArray.put(C35399nuc.StateListAnimator.adevsa, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.ROgMPW, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.processStrongAuthMessage, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.DGUQLI, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.gwTjWJ, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.dHguZz, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.fdazkH, 7);
        sparseIntArray.put(C35399nuc.StateListAnimator.onLost, 8);
        sparseIntArray.put(C35399nuc.StateListAnimator.pXZxY, 9);
        sparseIntArray.put(C35399nuc.StateListAnimator.RjCdvpRjCdvp, 10);
        sparseIntArray.put(C35399nuc.StateListAnimator.dzkkkq, 11);
        sparseIntArray.put(C35399nuc.StateListAnimator.invokespecialsiEkQe, 12);
        sparseIntArray.put(C35399nuc.StateListAnimator.fZBcTu, 13);
    }

    public C33856nIj(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, DbNXlk, fIwbmz));
    }

    public C33856nIj(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[13], (android.widget.LinearLayout) objArr[6], (CardView) objArr[5], (android.widget.FrameLayout) objArr[4], (C35893oHp) objArr[12], (android.widget.ImageView) objArr[2], (android.widget.ImageView) objArr[11], (android.widget.ImageView) objArr[3], (C6995aZr) objArr[9], (android.widget.FrameLayout) objArr[0], (android.widget.FrameLayout) objArr[1], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[8]);
        this.fJNWhG = -1L;
        this.gEmmrt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fJNWhG = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fJNWhG != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.fJNWhG;
            this.fJNWhG = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.gEmmrt, C33570myu.AEQbTJ(getRoot().getContext()));
        }
    }
}
