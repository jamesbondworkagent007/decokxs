package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iKH extends iKF {
    public static final android.util.SparseIntArray fARcdN;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public final ConstraintLayout getFieldNames;
    public long getNewProxyInstance;

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
        fARcdN = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.QfsBiF, 1);
        sparseIntArray.put(C25493ixk.ActionBar.RIsQag, 2);
        sparseIntArray.put(C25493ixk.ActionBar.aKErDB, 3);
        sparseIntArray.put(C25493ixk.ActionBar.adwzgZ, 4);
        sparseIntArray.put(C25493ixk.ActionBar.HJWChPDXdlte, 5);
        sparseIntArray.put(C25493ixk.ActionBar.QhYuFg, 6);
        sparseIntArray.put(C25493ixk.ActionBar.apNbdB, 7);
        sparseIntArray.put(C25493ixk.ActionBar.zFZsbn, 8);
        sparseIntArray.put(C25493ixk.ActionBar.getValue, 9);
        sparseIntArray.put(C25493ixk.ActionBar.zXhzOT, 10);
        sparseIntArray.put(C25493ixk.ActionBar.inahnb, 11);
        sparseIntArray.put(C25493ixk.ActionBar.RFmUsE, 12);
        sparseIntArray.put(C25493ixk.ActionBar.zFtALg, 13);
        sparseIntArray.put(C25493ixk.ActionBar.hGuIrQ, 14);
        sparseIntArray.put(C25493ixk.ActionBar.pXZxY, 15);
        sparseIntArray.put(C25493ixk.ActionBar.sRzUNh, 16);
        sparseIntArray.put(C25493ixk.ActionBar.Dff, 17);
        sparseIntArray.put(C25493ixk.ActionBar.UJpkuA, 18);
    }

    public iKH(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, fJNWhG, fARcdN));
    }

    public iKH(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C27267jrv) objArr[1], (android.view.View) objArr[3], (android.widget.ImageView) objArr[7], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[16], (android.widget.LinearLayout) objArr[11], (Guideline) objArr[9], (Guideline) objArr[10], (android.widget.ImageView) objArr[17], (C27226jrG) objArr[5], (android.widget.FrameLayout) objArr[4], (android.widget.ImageView) objArr[18], (C27226jrG) objArr[6], (C27267jrv) objArr[2], (android.widget.ImageView) objArr[8]);
        this.getNewProxyInstance = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.getFieldNames = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getNewProxyInstance = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getNewProxyInstance != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getNewProxyInstance = 0L;
        }
    }
}
