package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nNr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33999nNr extends AbstractC34002nNu {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final android.widget.LinearLayout djBIcL;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        valueOf = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.AYXKKw, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.QBiWsm, 3);
    }

    public C33999nNr(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, AEQbTJ, valueOf));
    }

    public C33999nNr(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.RelativeLayout) objArr[2], (android.widget.ImageView) objArr[3], (android.widget.TextView) objArr[1]);
        this.AYXKKw = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.djBIcL = linearLayout;
        linearLayout.setTag(null);
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 2L;
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
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35342ntX.djBIcL != i) {
            return false;
        }
        copydefault((C37736ozU) obj);
        return true;
    }

    public void copydefault(@androidx.annotation.Nullable C37736ozU c37736ozU) {
        this.KWHzl = c37736ozU;
        synchronized (this) {
            this.AYXKKw |= 1;
        }
        notifyPropertyChanged(C35342ntX.djBIcL);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.AYXKKw;
            this.AYXKKw = 0L;
        }
        C37736ozU c37736ozU = this.KWHzl;
        long j2 = j & 3;
        java.lang.CharSequence charSequenceEZpvd = (j2 == 0 || c37736ozU == null) ? null : c37736ozU.EZpvd();
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.copydefault, charSequenceEZpvd);
        }
    }
}
