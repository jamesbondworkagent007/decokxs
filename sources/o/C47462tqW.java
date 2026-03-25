package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* JADX INFO: renamed from: o.tqW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47462tqW extends AbstractC47461tqV {
    public static final android.util.SparseIntArray OLrzqt = null;
    public static final ViewDataBinding.IncludedLayouts copydefault = null;
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public long EZpvd;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C47462tqW(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, copydefault, OLrzqt));
    }

    public C47462tqW(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.EZpvd = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AEQbTJ = linearLayout;
        linearLayout.setTag(null);
        android.widget.TextView textView = (android.widget.TextView) objArr[1];
        this.AYXKKw = textView;
        textView.setTag(null);
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
        if (C47317tnk.getFieldNames != i) {
            return false;
        }
        OLrzqt((java.lang.String) obj);
        return true;
    }

    public void OLrzqt(@androidx.annotation.Nullable java.lang.String str) {
        this.KWHzl = str;
        synchronized (this) {
            this.EZpvd |= 1;
        }
        notifyPropertyChanged(C47317tnk.getFieldNames);
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
            TextViewBindingAdapter.setText(this.AYXKKw, str);
        }
    }
}
