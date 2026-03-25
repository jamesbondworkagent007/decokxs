package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uYC extends AbstractC48640uYx {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long AhwBna;
    public final LinearLayoutCompat AkhnZx;

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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.Ranim, 1);
        sparseIntArray.put(C48033uCm.Application.getString, 2);
        sparseIntArray.put(C48033uCm.Application.setCursor, 3);
        sparseIntArray.put(C48033uCm.Application.getIconAttributeResId, 4);
        sparseIntArray.put(C48033uCm.Application.DQzvGNdrmXxu, 5);
        sparseIntArray.put(C48033uCm.Application.setHasDecor, 6);
        sparseIntArray.put(C48033uCm.Application.DcMfJKDCKfqP, 7);
    }

    public uYC(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, gEmmrt, AYXKKw));
    }

    public uYC(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[5], (wYF) objArr[7], (C55353xiO) objArr[2], (C55378xin) objArr[1], (android.widget.TextView) objArr[4], (C55376xil) objArr[6], (android.widget.TextView) objArr[3]);
        this.AhwBna = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.AkhnZx = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AhwBna != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.AhwBna;
            this.AhwBna = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.AkhnZx, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}
