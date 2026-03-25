package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uTi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48490uTi extends AbstractC48491uTj {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray valueOf;
    public final ConstraintLayout AhwBna;
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
        valueOf = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplApi217, 1);
        sparseIntArray.put(C48033uCm.Application.removeOnTrimMemoryListener, 2);
        sparseIntArray.put(C48033uCm.Application.saveState, 3);
        sparseIntArray.put(C48033uCm.Application.reportFullyDrawn, 4);
        sparseIntArray.put(C48033uCm.Application.updateStateFromTypedArray, 5);
    }

    public C48490uTi(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, djBIcL, valueOf));
    }

    public C48490uTi(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55258xgZ) objArr[1], (AppCompatTextView) objArr[4], (android.widget.FrameLayout) objArr[2], (C55258xgZ) objArr[3], (android.view.View) objArr[5]);
        this.gEmmrt = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
        constraintLayout.setTag(null);
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
