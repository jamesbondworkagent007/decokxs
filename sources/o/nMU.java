package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nMU extends nMW {
    public static final android.util.SparseIntArray AEQbTJ;
    public static final ViewDataBinding.IncludedLayouts OLrzqt = null;
    public long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.hTAtCx, 1);
    }

    public nMU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, OLrzqt, AEQbTJ));
    }

    public nMU(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[0], (android.widget.TextView) objArr[1]);
        this.valueOf = -1L;
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35342ntX.djBIcL != i) {
            return false;
        }
        copydefault((C35694oAf) obj);
        return true;
    }

    public void copydefault(@androidx.annotation.Nullable C35694oAf c35694oAf) {
        this.copydefault = c35694oAf;
        synchronized (this) {
            this.valueOf |= 1;
        }
        notifyPropertyChanged(C35342ntX.djBIcL);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        C35694oAf c35694oAf = this.copydefault;
        long j2 = j & 3;
        java.lang.CharSequence charSequenceKWHzl = (j2 == 0 || c35694oAf == null) ? null : c35694oAf.KWHzl();
        if (j2 == 0 || ViewDataBinding.getBuildSdkInt() < 4) {
            return;
        }
        this.EZpvd.setContentDescription(charSequenceKWHzl);
    }
}
