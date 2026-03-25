package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50992vec extends AbstractC50994vee {
    public static final android.util.SparseIntArray AEQbTJ;
    public static final ViewDataBinding.IncludedLayouts KWHzl = null;
    public final ConstraintLayout djBIcL;
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
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.heceqZ, 1);
        sparseIntArray.put(C48033uCm.Application.DBxZfM, 2);
        sparseIntArray.put(C48033uCm.Application.onDrawerOpened, 3);
    }

    public C50992vec(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, KWHzl, AEQbTJ));
    }

    public C50992vec(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55258xgZ) objArr[1], (android.widget.TextView) objArr[2], (AppCompatImageView) objArr[3]);
        this.gEmmrt = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.djBIcL = constraintLayout;
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
