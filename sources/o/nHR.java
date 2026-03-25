package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nHR extends nHP {
    public static final android.util.SparseIntArray fIwbmz;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public long AuCTel;
    public final android.widget.LinearLayout ejfBZ;

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
        sparseIntArray.put(C35399nuc.StateListAnimator.zbGDDc, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.QFTsTN, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.abAflu, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.OKvQBs, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.fiXcQa, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.ORrpqH, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.onLost, 7);
        sparseIntArray.put(C35399nuc.StateListAnimator.gBtXYZ, 8);
        sparseIntArray.put(C35399nuc.StateListAnimator.FSMca, 9);
        sparseIntArray.put(C35399nuc.StateListAnimator.OGitdB, 10);
        sparseIntArray.put(C35399nuc.StateListAnimator.getConnectivityMgr, 11);
        sparseIntArray.put(C35399nuc.StateListAnimator.iOIMNp, 12);
        sparseIntArray.put(C35399nuc.StateListAnimator.fGT, 13);
        sparseIntArray.put(C35399nuc.StateListAnimator.OHsvZP, 14);
        sparseIntArray.put(C35399nuc.StateListAnimator.ExKek, 15);
    }

    public nHR(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fJNWhG, fIwbmz));
    }

    public nHR(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[8], (wYC) objArr[3], (ConstraintLayout) objArr[2], (C35893oHp) objArr[5], (android.widget.FrameLayout) objArr[15], (oIV) objArr[9], (android.widget.FrameLayout) objArr[12], (androidx.appcompat.widget.Toolbar) objArr[1], (android.widget.TextView) objArr[10], (android.widget.LinearLayout) objArr[4], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7]);
        this.AuCTel = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.ejfBZ = linearLayout;
        linearLayout.setTag(null);
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
