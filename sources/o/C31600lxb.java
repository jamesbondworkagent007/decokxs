package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lxb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31600lxb extends AbstractC31569lwW {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long AYXKKw;
    public final ConstraintLayout AkhnZx;

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
        sparseIntArray.put(C31351lsQ.Application.GCXiNH, 1);
        sparseIntArray.put(C31351lsQ.Application.UlJrfe, 2);
        sparseIntArray.put(C31351lsQ.Application.zLjUOn, 3);
        sparseIntArray.put(C31351lsQ.Application.fTEjYi, 4);
        sparseIntArray.put(C31351lsQ.Application.gHZMYf, 5);
        sparseIntArray.put(C31351lsQ.Application.fsw, 6);
        sparseIntArray.put(C31351lsQ.Application.setLocationManually, 7);
    }

    public C31600lxb(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, gEmmrt, AhwBna));
    }

    public C31600lxb(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[3], (android.widget.TextView) objArr[5], (ConstraintLayout) objArr[2], (android.view.View) objArr[1], (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7]);
        this.AYXKKw = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
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
