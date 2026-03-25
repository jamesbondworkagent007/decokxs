package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57380yhN extends AbstractC57383yhQ {
    public static final ViewDataBinding.IncludedLayouts AuCTel = null;
    public static final android.util.SparseIntArray fIwbmz;
    public long getFieldNames;

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
        sparseIntArray.put(C57406yhn.StateListAnimator.QUSxYX, 8);
        sparseIntArray.put(C57406yhn.StateListAnimator.spnCvw, 9);
        sparseIntArray.put(C57406yhn.StateListAnimator.getNewProxyInstance, 10);
        sparseIntArray.put(C57406yhn.StateListAnimator.gEmmrt, 11);
        sparseIntArray.put(C57406yhn.StateListAnimator.run, 12);
        sparseIntArray.put(C57406yhn.StateListAnimator.AkhnZx, 13);
        sparseIntArray.put(C57406yhn.StateListAnimator.DBxZfM, 14);
        sparseIntArray.put(C57406yhn.StateListAnimator.zblBkD, 15);
        sparseIntArray.put(C57406yhn.StateListAnimator.djSkpj, 16);
        sparseIntArray.put(C57406yhn.StateListAnimator.DNMMPQ, 17);
    }

    public C57380yhN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 18, AuCTel, fIwbmz));
    }

    public C57380yhN(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (C55249xgQ) objArr[11], (android.view.View) objArr[13], (android.view.View) objArr[6], (android.view.View) objArr[10], (android.widget.ImageView) objArr[0], (android.widget.ImageView) objArr[8], (android.widget.ImageView) objArr[16], (ConstraintLayout) objArr[1], (android.widget.LinearLayout) objArr[7], (android.widget.LinearLayout) objArr[3], (C55251xgS) objArr[2], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[17]);
        this.getFieldNames = -1L;
        this.OLrzqt.setTag(null);
        this.KWHzl.setTag(null);
        this.gEmmrt.setTag(null);
        this.djBIcL.setTag(null);
        this.valueOf.setTag(null);
        this.DbNXlk.setTag(null);
        this.values.setTag(null);
        this.ejfBZ.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getFieldNames = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getFieldNames != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getFieldNames = 0L;
        }
    }
}
