package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50866vcI extends AbstractC50862vcE {
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
        sparseIntArray.put(C48033uCm.Application.putCallback, 1);
        sparseIntArray.put(C48033uCm.Application.DcMfJKsfEqpH, 2);
        sparseIntArray.put(C48033uCm.Application.ActivityResultCallerLauncherresultContract2, 3);
        sparseIntArray.put(C48033uCm.Application.sendMediaButton, 4);
        sparseIntArray.put(C48033uCm.Application.wtf, 5);
    }

    public C50866vcI(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, djBIcL, valueOf));
    }

    public C50866vcI(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYK) objArr[2], (C47988uAv) objArr[5], (android.widget.LinearLayout) objArr[1], (C55052xcf) objArr[4], (android.widget.Space) objArr[3]);
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
