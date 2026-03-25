package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nJX extends nJV {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray values;
    public final android.widget.FrameLayout DbNXlk;
    public long fetchVPNInfo;

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
        values = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.DcqEDu, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.DGgkXd, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.GzAsTt, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.RihMUf, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.fHqPtx, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.giSNqX, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.Srftgn, 7);
        sparseIntArray.put(C35399nuc.StateListAnimator.QwvEab, 8);
        sparseIntArray.put(C35399nuc.StateListAnimator.AxsJAYsNCnLh, 9);
    }

    public nJX(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, djBIcL, values));
    }

    public nJX(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[6], (wYF) objArr[9], (android.widget.CheckBox) objArr[8], (android.widget.FrameLayout) objArr[1], (ConstraintLayout) objArr[5], (C33604mzb) objArr[4], (RecyclerView) objArr[3], (C33546myW) objArr[2], (android.widget.TextView) objArr[7]);
        this.fetchVPNInfo = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.DbNXlk = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
