package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C49511upt;

/* JADX INFO: renamed from: o.uqC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49521uqC extends AbstractC49567uqw {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts fARcdN = null;
    public long fIwbmz;

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
        AuCTel = sparseIntArray;
        sparseIntArray.put(C49511upt.Application.fsSxsn, 1);
        sparseIntArray.put(C49511upt.Application.swzYdv, 2);
        sparseIntArray.put(C49511upt.Application.dLBcXg, 3);
        sparseIntArray.put(C49511upt.Application.fXHmeK, 4);
        sparseIntArray.put(C49511upt.Application.sTzBva, 5);
        sparseIntArray.put(C49511upt.Application.Ufzxmz, 6);
        sparseIntArray.put(C49511upt.Application.zKcAg, 7);
        sparseIntArray.put(C49511upt.Application.tIwhY, 8);
        sparseIntArray.put(C49511upt.Application.RXzakW, 9);
        sparseIntArray.put(C49511upt.Application.gmHjFq, 10);
        sparseIntArray.put(C49511upt.Application.iPSTqm, 11);
        sparseIntArray.put(C49511upt.Application.fHqPtx, 12);
        sparseIntArray.put(C49511upt.Application.hCLrkq, 13);
        sparseIntArray.put(C49511upt.Application.DWgRXt, 14);
        sparseIntArray.put(C49511upt.Application.UrRBLY, 15);
    }

    public C49521uqC(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fARcdN, AuCTel));
    }

    public C49521uqC(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (android.widget.ImageView) objArr[15], (android.widget.TextView) objArr[14], (ConstraintLayout) objArr[12], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[3], (android.widget.LinearLayout) objArr[4], (android.view.View) objArr[1], (android.view.View) objArr[10], (android.view.View) objArr[11], (android.widget.ImageView) objArr[2], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[8]);
        this.fIwbmz = -1L;
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fIwbmz != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fIwbmz = 0L;
        }
    }
}
