package o;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uQU extends uQV {
    public static final android.util.SparseIntArray ejfBZ;
    public static final ViewDataBinding.IncludedLayouts fARcdN = null;
    public long iwGUEr;

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
        ejfBZ = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.iZzfmt, 1);
        sparseIntArray.put(C48033uCm.Application.Rbool, 2);
        sparseIntArray.put(C48033uCm.Application.zagaMW, 3);
        sparseIntArray.put(C48033uCm.Application.htlTjW, 4);
        sparseIntArray.put(C48033uCm.Application.fDu, 5);
        sparseIntArray.put(C48033uCm.Application.HJWChPOKBmQNaCIdOM, 6);
        sparseIntArray.put(C48033uCm.Application.HJWChPOZOJIj, 7);
        sparseIntArray.put(C48033uCm.Application.igXuih, 8);
        sparseIntArray.put(C48033uCm.Application.sSi, 9);
        sparseIntArray.put(C48033uCm.Application.ZaDspl, 10);
        sparseIntArray.put(C48033uCm.Application.ZqidTP, 11);
        sparseIntArray.put(C48033uCm.Application.UnZVfqExternalSyntheticApiModelOutline0, 12);
        sparseIntArray.put(C48033uCm.Application.DzCpqu, 13);
        sparseIntArray.put(C48033uCm.Application.createOverrideConfigurationForDayNight, 14);
        sparseIntArray.put(C48033uCm.Application.getChangingConfigurations, 15);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi23, 16);
        sparseIntArray.put(C48033uCm.Application.IResultReceiver, 17);
    }

    public uQU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, fARcdN, ejfBZ));
    }

    public uQU(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppBarLayout) objArr[1], (android.widget.LinearLayout) objArr[4], (android.widget.LinearLayout) objArr[8], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7], (android.view.View) objArr[13], (android.widget.LinearLayout) objArr[3], (RecyclerView) objArr[12], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[11], (NestedScrollView) objArr[16], (RecyclerView) objArr[17], (CoordinatorLayout) objArr[0], (CollapsingToolbarLayout) objArr[2], (android.widget.TextView) objArr[14], (android.view.View) objArr[15]);
        this.iwGUEr = -1L;
        this.fetchVPNInfo.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.iwGUEr = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.iwGUEr != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.iwGUEr = 0L;
        }
    }
}
