package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uQv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48420uQv extends AbstractC48419uQu {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray djBIcL;
    public long gEmmrt;

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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.fvQaOB, 1);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi21TransportControls, 2);
        sparseIntArray.put(C48033uCm.Application.getRatingType, 3);
        sparseIntArray.put(C48033uCm.Application.fromMediaItem, 4);
        sparseIntArray.put(C48033uCm.Application.onNavigationItemSelected, 5);
        sparseIntArray.put(C48033uCm.Application.hlXVux, 6);
    }

    public C48420uQv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, AhwBna, djBIcL));
    }

    public C48420uQv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C57597ylS) objArr[1], (C52794wYp) objArr[6], (C52873wao) objArr[4], (android.widget.LinearLayout) objArr[0], (C53420wlE) objArr[3], (NestedScrollView) objArr[2], (C53420wlE) objArr[5]);
        this.gEmmrt = -1L;
        this.KWHzl.setTag(null);
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
