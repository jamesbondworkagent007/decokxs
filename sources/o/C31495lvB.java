package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31495lvB extends AbstractC31496lvC {
    public static final android.util.SparseIntArray djBIcL;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
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
        sparseIntArray.put(C31351lsQ.Application.iLAtSv, 1);
        sparseIntArray.put(C31351lsQ.Application.getNewProxyInstance, 2);
        sparseIntArray.put(C31351lsQ.Application.zLAIeZ, 3);
        sparseIntArray.put(C31351lsQ.Application.FQMcgE, 4);
        sparseIntArray.put(C31351lsQ.Application.DGUQLIekVPG, 5);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKsuEgdN, 6);
    }

    public C31495lvB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, gEmmrt, djBIcL));
    }

    public C31495lvB(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[2], (C55173xeu) objArr[5], (android.widget.TextView) objArr[3], (C55113xdn) objArr[6], (RecyclerView) objArr[4], (androidx.appcompat.widget.Toolbar) objArr[1]);
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
        long j;
        synchronized (this) {
            j = this.AYXKKw;
            this.AYXKKw = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.AhwBna, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}
