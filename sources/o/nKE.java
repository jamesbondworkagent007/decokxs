package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nKE extends nKF {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray values;
    public final LinearLayoutCompat AuCTel;
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
        values = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.swzYdv, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.apAOXX, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.DcMfJKsgNvtZ, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.DzOuPm, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.OKSWiw, 7);
        sparseIntArray.put(C35399nuc.StateListAnimator.fMBJsc, 8);
        sparseIntArray.put(C35399nuc.StateListAnimator.FhERFw, 9);
        sparseIntArray.put(C35399nuc.StateListAnimator.DzCpqu, 10);
        sparseIntArray.put(C35399nuc.StateListAnimator.geAOna, 11);
        sparseIntArray.put(C35399nuc.StateListAnimator.adwzgZ, 12);
        sparseIntArray.put(C35399nuc.StateListAnimator.QMuEJi, 13);
    }

    public nKE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, DbNXlk, values));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nKE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[2];
        java.lang.Object obj = objArr[3];
        C34042nPg c34042nPgKWHzl = obj != null ? C34042nPg.KWHzl((android.view.View) obj) : null;
        C55113xdn c55113xdn = (C55113xdn) objArr[5];
        java.lang.Object obj2 = objArr[4];
        super(dataBindingComponent, view, 0, linearLayoutCompat, c34042nPgKWHzl, c55113xdn, obj2 != null ? C34042nPg.KWHzl((android.view.View) obj2) : null, (LinearLayoutCompat) objArr[8], (android.widget.TextView) objArr[9], (C35887oHj) objArr[13], (android.widget.ImageView) objArr[10], (C33546myW) objArr[11], (LinearLayoutCompat) objArr[1], (LinearLayoutCompat) objArr[7], (RecyclerView) objArr[6], (RecyclerView) objArr[12]);
        this.fJNWhG = -1L;
        this.KWHzl.setTag(null);
        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) objArr[0];
        this.AuCTel = linearLayoutCompat2;
        linearLayoutCompat2.setTag(null);
        this.AhwBna.setTag(null);
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
        synchronized (this) {
            this.fJNWhG = 0L;
        }
    }
}
