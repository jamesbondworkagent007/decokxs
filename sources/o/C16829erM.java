package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C10026bgg;

/* JADX INFO: renamed from: o.erM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16829erM extends AbstractC16827erK {
    public static final android.util.SparseIntArray KWHzl = null;
    public static final ViewDataBinding.IncludedLayouts copydefault = null;
    public final android.view.View AEQbTJ;
    public long EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@androidx.annotation.Nullable C10026bgg.Application application) {
        this.OLrzqt = application;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C16829erM(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, copydefault, KWHzl));
    }

    public C16829erM(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.EZpvd = -1L;
        android.view.View view2 = (android.view.View) objArr[0];
        this.AEQbTJ = view2;
        view2.setTag(null);
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
        if (dTV.AhwBna != i) {
            return false;
        }
        KWHzl((C10026bgg.Application) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.EZpvd = 0L;
        }
    }
}
