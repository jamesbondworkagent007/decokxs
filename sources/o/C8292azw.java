package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.azw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8292azw extends AbstractC8293azx {
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public static final android.util.SparseIntArray OLrzqt = null;
    public long AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8293azx
    public void KWHzl(@androidx.annotation.Nullable C6714aUa c6714aUa) {
        this.copydefault = c6714aUa;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C8292azw(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, EZpvd, OLrzqt));
    }

    public C8292azw(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[0]);
        this.AEQbTJ = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AEQbTJ = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AEQbTJ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C8209ayS.KWHzl != i) {
            return false;
        }
        KWHzl((C6714aUa) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AEQbTJ = 0L;
        }
    }
}
