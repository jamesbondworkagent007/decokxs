package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.okinc.uilab.edit.OKEditText;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nHS extends nHT {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray gEmmrt;
    public long AYXKKw;
    public final android.widget.LinearLayout AhwBna;

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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.adevsa, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.hTAtCx, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.ROgMPW, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.zhUgOk, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.DTwDnp, 5);
    }

    public nHS(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, djBIcL, gEmmrt));
    }

    public nHS(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[5], (OKEditText) objArr[4], (wYC) objArr[3], (android.widget.FrameLayout) objArr[1], (android.widget.TextView) objArr[2]);
        this.AYXKKw = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AhwBna = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.AYXKKw;
            this.AYXKKw = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.AhwBna, C33570myu.AEQbTJ(getRoot().getContext()));
        }
    }
}
