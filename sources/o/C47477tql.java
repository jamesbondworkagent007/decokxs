package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* JADX INFO: renamed from: o.tql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47477tql extends AbstractC47480tqo {
    public static final android.util.SparseIntArray AhwBna = null;
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public final android.widget.LinearLayout AYXKKw;
    public long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C47477tql(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, EZpvd, AhwBna));
    }

    public C47477tql(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[1]);
        this.valueOf = -1L;
        this.KWHzl.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AYXKKw = linearLayout;
        linearLayout.setTag(null);
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 4L;
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
        if (C47317tnk.getNewProxyInstance == i) {
            copydefault((java.lang.String) obj);
        } else {
            if (C47317tnk.EZpvd != i) {
                return false;
            }
            OLrzqt((java.lang.String) obj);
        }
        return true;
    }

    @Override // o.AbstractC47480tqo
    public void copydefault(@androidx.annotation.Nullable java.lang.String str) {
        this.OLrzqt = str;
        synchronized (this) {
            this.valueOf |= 1;
        }
        notifyPropertyChanged(C47317tnk.getNewProxyInstance);
        super.requestRebind();
    }

    @Override // o.AbstractC47480tqo
    public void OLrzqt(@androidx.annotation.Nullable java.lang.String str) {
        this.AEQbTJ = str;
        synchronized (this) {
            this.valueOf |= 2;
        }
        notifyPropertyChanged(C47317tnk.EZpvd);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        java.lang.String str = this.OLrzqt;
        java.lang.String str2 = this.AEQbTJ;
        if ((6 & j) != 0) {
            TextViewBindingAdapter.setText(this.KWHzl, str2);
        }
        if ((j & 5) != 0) {
            TextViewBindingAdapter.setText(this.copydefault, str);
        }
    }
}
