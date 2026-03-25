package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: renamed from: o.mGp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31860mGp extends AbstractC31858mGn {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts values = null;
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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.hUfVAv, 1);
        sparseIntArray.put(mDC.ActionBar.sTzBva, 2);
        sparseIntArray.put(mDC.ActionBar.gSBher, 3);
        sparseIntArray.put(mDC.ActionBar.OcIXYQ, 4);
        sparseIntArray.put(mDC.ActionBar.QOLQEE, 5);
        sparseIntArray.put(mDC.ActionBar.igXuih, 6);
        sparseIntArray.put(mDC.ActionBar.fjfviF, 7);
        sparseIntArray.put(mDC.ActionBar.OJuSTm, 8);
        sparseIntArray.put(mDC.ActionBar.QSLkRj, 9);
    }

    public C31860mGp(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, values, DbNXlk));
    }

    public C31860mGp(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[9], (ConstraintLayout) objArr[0], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7], (android.widget.ImageView) objArr[3], (android.widget.TextView) objArr[2]);
        this.AkhnZx = -1L;
        this.AhwBna.setTag(null);
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
