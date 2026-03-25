package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oMv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36034oMv extends AbstractC36030oMr {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray AhwBna;
    public final android.widget.LinearLayout fetchVPNInfo;
    public long gEmmrt;

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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C35964oKf.StateListAnimator.dzCpvv, 1);
        sparseIntArray.put(C35964oKf.StateListAnimator.IconCompatParcelizer, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.aChkwz, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.fRNHEq, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.hfFNez, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.DGGHxk, 6);
        sparseIntArray.put(C35964oKf.StateListAnimator.sJPPOI, 7);
    }

    public C36034oMv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AYXKKw, AhwBna));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C36034oMv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[1];
        super(dataBindingComponent, view, 0, obj != null ? oMY.OLrzqt((android.view.View) obj) : null, (android.widget.ImageView) objArr[6], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[4], (RecyclerView) objArr[7], (android.widget.TextView) objArr[5], (android.widget.LinearLayout) objArr[2]);
        this.gEmmrt = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fetchVPNInfo = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gEmmrt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
    }
}
