package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uQF extends uQD {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public long gEmmrt;
    public final NestedScrollView values;

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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.OYuSWK, 1);
        sparseIntArray.put(C48033uCm.Application.UvfnWv, 2);
        sparseIntArray.put(C48033uCm.Application.fOrBHg, 3);
        sparseIntArray.put(C48033uCm.Application.DcMfJKffREWX, 4);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi23TransportControls, 5);
        sparseIntArray.put(C48033uCm.Application.getIconUri, 6);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplBase, 7);
    }

    public uQF(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, djBIcL, AhwBna));
    }

    public uQF(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C53020wdc) objArr[4], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[3], (C53018wda) objArr[7], (android.widget.LinearLayout) objArr[6], (C55113xdn) objArr[5]);
        this.gEmmrt = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.values = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gEmmrt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
    }
}
