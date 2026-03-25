package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* JADX INFO: renamed from: o.nLw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33950nLw extends AbstractC33952nLy {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray OLrzqt = null;
    public long KWHzl;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C33950nLw(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, AEQbTJ, OLrzqt));
    }

    public C33950nLw(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[0]);
        this.KWHzl = -1L;
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.KWHzl = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.KWHzl != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35342ntX.djBIcL != i) {
            return false;
        }
        KWHzl((C37735ozT) obj);
        return true;
    }

    public void KWHzl(@androidx.annotation.Nullable C37735ozT c37735ozT) {
        this.EZpvd = c37735ozT;
        synchronized (this) {
            this.KWHzl |= 1;
        }
        notifyPropertyChanged(C35342ntX.djBIcL);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.CharSequence charSequenceOLrzqt;
        android.graphics.drawable.Drawable drawableEZpvd;
        synchronized (this) {
            j = this.KWHzl;
            this.KWHzl = 0L;
        }
        C37735ozT c37735ozT = this.EZpvd;
        long j2 = j & 3;
        if (j2 == 0 || c37735ozT == null) {
            charSequenceOLrzqt = null;
            drawableEZpvd = null;
        } else {
            charSequenceOLrzqt = c37735ozT.OLrzqt();
            drawableEZpvd = c37735ozT.EZpvd();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.setDrawableTop(this.copydefault, drawableEZpvd);
            TextViewBindingAdapter.setText(this.copydefault, charSequenceOLrzqt);
        }
    }
}
