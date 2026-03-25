package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: renamed from: o.exf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C17166exf extends AbstractC17165exe {
    public static final android.util.SparseIntArray djBIcL = null;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long AYXKKw;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    public C17166exf(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 5, gEmmrt, djBIcL));
    }

    public C17166exf(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (C55173xeu) objArr[3], (AppCompatImageView) objArr[1], (LottieAnimationView) objArr[4], (C14736drA) objArr[2], (AppCompatTextView) objArr[0]);
        this.AYXKKw = -1L;
        this.EZpvd.setTag(null);
        this.KWHzl.setTag(null);
        this.OLrzqt.setTag(null);
        this.AEQbTJ.setTag(null);
        this.copydefault.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
    }
}
