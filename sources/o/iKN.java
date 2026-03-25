package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iKN extends iKO {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray valueOf;
    public long AkhnZx;
    public final ConstraintLayout isConnected;

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
        valueOf = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.RhjxDW, 1);
        sparseIntArray.put(C25493ixk.ActionBar.GzAsTt, 2);
        sparseIntArray.put(C25493ixk.ActionBar.spnCvw, 3);
        sparseIntArray.put(C25493ixk.ActionBar.HJWChPDXdlte, 4);
        sparseIntArray.put(C25493ixk.ActionBar.QVAiDq, 5);
        sparseIntArray.put(C25493ixk.ActionBar.QhYuFg, 6);
        sparseIntArray.put(C25493ixk.ActionBar.DcMfJKDIADVb, 7);
        sparseIntArray.put(C25493ixk.ActionBar.QjzqRB, 8);
    }

    public iKN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, djBIcL, valueOf));
    }

    public iKN(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[5], (android.widget.FrameLayout) objArr[3], (android.view.View) objArr[7], (android.widget.ImageView) objArr[4], (C55251xgS) objArr[2], (Guideline) objArr[1], (android.widget.ImageView) objArr[6], (C55251xgS) objArr[8]);
        this.AkhnZx = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
