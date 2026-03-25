package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uQr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48416uQr extends AbstractC48417uQs {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public long AkhnZx;

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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.fvQaOB, 1);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi21TransportControls, 2);
        sparseIntArray.put(C48033uCm.Application.onNavigationItemSelected, 3);
        sparseIntArray.put(C48033uCm.Application.adjustVolume, 4);
        sparseIntArray.put(C48033uCm.Application.UkuJRw, 5);
        sparseIntArray.put(C48033uCm.Application.clearCurrentKeyboardTarget, 6);
        sparseIntArray.put(C48033uCm.Application.getIControllerCallback, 7);
        sparseIntArray.put(C48033uCm.Application.hlXVux, 8);
    }

    public C48416uQr(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, djBIcL, DbNXlk));
    }

    public C48416uQr(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C57597ylS) objArr[1], (C52794wYp) objArr[8], (C52870wal) objArr[6], (C52873wao) objArr[5], (android.widget.LinearLayout) objArr[0], (C52873wao) objArr[4], (C53425wlJ) objArr[7], (NestedScrollView) objArr[2], (C53420wlE) objArr[3]);
        this.AkhnZx = -1L;
        this.copydefault.setTag(null);
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
