package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16981euF extends AbstractC16977euB {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray values;
    public long AkhnZx;

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
        sparseIntArray.put(C13754dXa.ActionBar.zeUYeG, 1);
        sparseIntArray.put(C13754dXa.ActionBar.ReportDrawnKtReportDrawnAfter1, 2);
        sparseIntArray.put(C13754dXa.ActionBar.HJWChPiaHEvk, 3);
        sparseIntArray.put(C13754dXa.ActionBar.getCREATORannotations, 4);
        sparseIntArray.put(C13754dXa.ActionBar.removeReporter, 5);
        sparseIntArray.put(C13754dXa.ActionBar.removeOnReportDrawnListener, 6);
        sparseIntArray.put(C13754dXa.ActionBar.isRated, 7);
        sparseIntArray.put(C13754dXa.ActionBar.iSpHlg, 8);
        sparseIntArray.put(C13754dXa.ActionBar.setMediaTypeactivity_release, 9);
        sparseIntArray.put(C13754dXa.ActionBar.aQtmcU, 10);
    }

    public C16981euF(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, DbNXlk, values));
    }

    public C16981euF(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (android.view.View) objArr[10], (android.view.View) objArr[1], (Guideline) objArr[3], (AppCompatImageView) objArr[8], (ConstraintLayout) objArr[7], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[9]);
        this.AkhnZx = -1L;
        this.AEQbTJ.setTag(null);
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
