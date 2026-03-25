package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* JADX INFO: renamed from: o.erQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16833erQ extends AbstractC16831erO {
    public static final ViewDataBinding.IncludedLayouts KWHzl = null;
    public static final android.util.SparseIntArray copydefault = null;
    public long OLrzqt;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C16833erQ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, KWHzl, copydefault));
    }

    public C16833erQ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[0]);
        this.OLrzqt = -1L;
        this.AEQbTJ.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.OLrzqt = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.OLrzqt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.fIwbmz != i) {
            return false;
        }
        EZpvd((java.lang.String) obj);
        return true;
    }

    public void EZpvd(@androidx.annotation.Nullable java.lang.String str) {
        this.EZpvd = str;
        synchronized (this) {
            this.OLrzqt |= 1;
        }
        notifyPropertyChanged(dTV.fIwbmz);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.OLrzqt;
            this.OLrzqt = 0L;
        }
        java.lang.String str = this.EZpvd;
        if ((j & 3) != 0) {
            TextViewBindingAdapter.setText(this.AEQbTJ, str);
        }
    }
}
