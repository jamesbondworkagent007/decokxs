package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* JADX INFO: renamed from: o.nLq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33944nLq extends AbstractC33940nLm {
    public static final ViewDataBinding.IncludedLayouts OLrzqt = null;
    public static final android.util.SparseIntArray copydefault = null;
    public long EZpvd;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C33944nLq(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, OLrzqt, copydefault));
    }

    public C33944nLq(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[0]);
        this.EZpvd = -1L;
        this.AEQbTJ.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.EZpvd = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.EZpvd != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35342ntX.djBIcL != i) {
            return false;
        }
        KWHzl((java.lang.String) obj);
        return true;
    }

    public void KWHzl(@androidx.annotation.Nullable java.lang.String str) {
        this.KWHzl = str;
        synchronized (this) {
            this.EZpvd |= 1;
        }
        notifyPropertyChanged(C35342ntX.djBIcL);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.EZpvd;
            this.EZpvd = 0L;
        }
        java.lang.String str = this.KWHzl;
        if ((j & 3) != 0) {
            TextViewBindingAdapter.setText(this.AEQbTJ, str);
        }
    }
}
