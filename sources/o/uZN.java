package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uZN extends uZK {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray isConnected;
    public long AkhnZx;
    public final NestedScrollView DbNXlk;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        isConnected = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.invokespecialRtjmuc, 1);
        sparseIntArray.put(C48033uCm.Application.hasLogo, 2);
        sparseIntArray.put(C48033uCm.Application.completeDeferredDestroyActionMode, 3);
        sparseIntArray.put(C48033uCm.Application.GuardedBy, 4);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatCustomActionCallback, 5);
        sparseIntArray.put(C48033uCm.Application.setInternalConnectionCallback, 6);
        sparseIntArray.put(C48033uCm.Application.dNxZaP, 7);
        sparseIntArray.put(C48033uCm.Application.QhYuFg, 8);
        sparseIntArray.put(C48033uCm.Application.fsw, 9);
    }

    public uZN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, AYXKKw, isConnected));
    }

    public uZN(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[1], (RecyclerView) objArr[9], (AppCompatTextView) objArr[7], (android.widget.TextView) objArr[8], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[6], (C49774uur) objArr[4], (AppCompatTextView) objArr[3], (AppCompatImageView) objArr[2]);
        this.AkhnZx = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.DbNXlk = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
