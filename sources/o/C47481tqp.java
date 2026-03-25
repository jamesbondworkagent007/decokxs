package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* JADX INFO: renamed from: o.tqp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47481tqp extends AbstractC47476tqk {
    public static final ViewDataBinding.IncludedLayouts copydefault = null;
    public static final android.util.SparseIntArray valueOf = null;
    public final android.widget.LinearLayout AYXKKw;
    public long djBIcL;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C47481tqp(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, copydefault, valueOf));
    }

    public C47481tqp(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[1], (android.widget.TextView) objArr[2]);
        this.djBIcL = -1L;
        this.KWHzl.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AYXKKw = linearLayout;
        linearLayout.setTag(null);
        this.AEQbTJ.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C47317tnk.DbNXlk == i) {
            AEQbTJ((android.graphics.drawable.Drawable) obj);
        } else {
            if (C47317tnk.iwGUEr != i) {
                return false;
            }
            AEQbTJ((java.lang.CharSequence) obj);
        }
        return true;
    }

    public void AEQbTJ(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        this.OLrzqt = drawable;
        synchronized (this) {
            this.djBIcL |= 1;
        }
        notifyPropertyChanged(C47317tnk.DbNXlk);
        super.requestRebind();
    }

    @Override // o.AbstractC47476tqk
    public void AEQbTJ(@androidx.annotation.Nullable java.lang.CharSequence charSequence) {
        this.EZpvd = charSequence;
        synchronized (this) {
            this.djBIcL |= 2;
        }
        notifyPropertyChanged(C47317tnk.iwGUEr);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.djBIcL;
            this.djBIcL = 0L;
        }
        android.graphics.drawable.Drawable drawable = this.OLrzqt;
        java.lang.CharSequence charSequence = this.EZpvd;
        if ((5 & j) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.KWHzl, drawable);
        }
        if ((j & 6) != 0) {
            TextViewBindingAdapter.setText(this.AEQbTJ, charSequence);
        }
    }
}
