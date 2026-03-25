package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eqp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16805eqp extends AbstractC16802eqm {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.ScLVFT, 3);
    }

    public C16805eqp(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, djBIcL, AYXKKw));
    }

    public C16805eqp(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[1]);
        this.valueOf = -1L;
        this.OLrzqt.setTag(null);
        this.copydefault.setTag(null);
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
        if (dTV.djBIcL != i) {
            return false;
        }
        EZpvd((C19420gBs) obj);
        return true;
    }

    @Override // o.AbstractC16802eqm
    public void EZpvd(@androidx.annotation.Nullable C19420gBs c19420gBs) {
        this.AEQbTJ = c19420gBs;
        synchronized (this) {
            this.valueOf |= 1;
        }
        notifyPropertyChanged(dTV.djBIcL);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.String strEZpvd;
        java.lang.String strAEQbTJ;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        C19420gBs c19420gBs = this.AEQbTJ;
        long j2 = j & 3;
        if (j2 == 0 || c19420gBs == null) {
            strEZpvd = null;
            strAEQbTJ = null;
        } else {
            strEZpvd = c19420gBs.EZpvd();
            strAEQbTJ = c19420gBs.AEQbTJ();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.copydefault, strEZpvd);
            TextViewBindingAdapter.setText(this.EZpvd, strAEQbTJ);
        }
    }
}
