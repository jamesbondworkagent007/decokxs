package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vdv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50958vdv extends AbstractC50957vdu {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray valueOf;
    public long djBIcL;

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
        sparseIntArray.put(C48033uCm.Application.ITrustedWebActivityServiceStub, 1);
        sparseIntArray.put(C48033uCm.Application.initializePanelDecor, 2);
        sparseIntArray.put(C48033uCm.Application.OeawrHOeawrH, 3);
        sparseIntArray.put(C48033uCm.Application.DimenRes, 4);
        sparseIntArray.put(C48033uCm.Application.hdBMmm, 5);
        sparseIntArray.put(C48033uCm.Application.notify, 6);
    }

    public C50958vdv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, gEmmrt, valueOf));
    }

    public C50958vdv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55001xbh) objArr[3], (android.widget.FrameLayout) objArr[5], (android.widget.ImageView) objArr[1], (android.widget.ImageView) objArr[6], (ConstraintLayout) objArr[0], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[2]);
        this.djBIcL = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
    }
}
