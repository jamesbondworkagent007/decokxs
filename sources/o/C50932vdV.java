package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vdV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50932vdV extends AbstractC50930vdT {
    public static final android.util.SparseIntArray ejfBZ;
    public static final ViewDataBinding.IncludedLayouts fARcdN = null;
    public long fIwbmz;
    public final ConstraintLayout fJNWhG;

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
        sparseIntArray.put(C48033uCm.Application.StyleableRes, 1);
        sparseIntArray.put(C48033uCm.Application.allOf, 2);
        sparseIntArray.put(C48033uCm.Application.otherwise, 3);
        sparseIntArray.put(C48033uCm.Application.to, 4);
        sparseIntArray.put(C48033uCm.Application.GuardedBy, 5);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatCustomActionCallback, 6);
        sparseIntArray.put(C48033uCm.Application.setInternalConnectionCallback, 7);
        sparseIntArray.put(C48033uCm.Application.registerUser, 8);
        sparseIntArray.put(C48033uCm.Application.ensureTabsExist, 9);
        sparseIntArray.put(C48033uCm.Application.swzYdv, 10);
        sparseIntArray.put(C48033uCm.Application.iPSTqm, 11);
        sparseIntArray.put(C48033uCm.Application.sTzBva, 12);
        sparseIntArray.put(C48033uCm.Application.hasLogo, 13);
        sparseIntArray.put(C48033uCm.Application.completeDeferredDestroyActionMode, 14);
        sparseIntArray.put(C48033uCm.Application.fObYrO, 15);
        sparseIntArray.put(C48033uCm.Application.dNxZaP, 16);
    }

    public C50932vdV(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, fARcdN, ejfBZ));
    }

    public C50932vdV(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[11], (C53198wgv) objArr[12], (AppCompatTextView) objArr[10], (android.widget.RelativeLayout) objArr[8], (AppCompatTextView) objArr[16], (android.view.View) objArr[15], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[7], (C55251xgS) objArr[4], (C49774uur) objArr[5], (AppCompatTextView) objArr[2], (ConstraintLayout) objArr[1], (android.widget.RelativeLayout) objArr[3], (C52794wYp) objArr[9], (AppCompatTextView) objArr[14], (AppCompatImageView) objArr[13]);
        this.fIwbmz = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fJNWhG = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fIwbmz != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fIwbmz = 0L;
        }
    }
}
