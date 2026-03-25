package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vdM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50923vdM extends AbstractC50925vdO {
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public static final android.util.SparseIntArray djBIcL;
    public long AYXKKw;
    public final ConstraintLayout AhwBna;

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
        sparseIntArray.put(C48033uCm.Application.addCallbackdefault, 1);
        sparseIntArray.put(C48033uCm.Application.accessobserveReporter, 2);
        sparseIntArray.put(C48033uCm.Application.ReportDrawnWhen, 3);
        sparseIntArray.put(C48033uCm.Application.ActionBar, 4);
    }

    public C50923vdM(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, EZpvd, djBIcL));
    }

    public C50923vdM(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55258xgZ) objArr[1], (C47988uAv) objArr[2], (C47988uAv) objArr[3], (C47988uAv) objArr[4]);
        this.AYXKKw = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
    }
}
