package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import o.qZH;

/* JADX INFO: renamed from: o.rdu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C42837rdu extends AbstractC42839rdw {
    public static final android.util.SparseIntArray gEmmrt;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long AYXKKw;

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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(qZH.StateListAnimator.QSAYLr, 1);
        sparseIntArray.put(qZH.StateListAnimator.KWHzl, 2);
        sparseIntArray.put(qZH.StateListAnimator.zhUgOk, 3);
        sparseIntArray.put(qZH.StateListAnimator.zlvcHA, 4);
        sparseIntArray.put(qZH.StateListAnimator.iRgjgR, 5);
    }

    public C42837rdu(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, valueOf, gEmmrt));
    }

    public C42837rdu(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C28005kLj) objArr[2], (FragmentContainerView) objArr[4], (C28005kLj) objArr[3], (android.widget.HorizontalScrollView) objArr[1], (FragmentContainerView) objArr[5], (C33546myW) objArr[0]);
        this.AYXKKw = -1L;
        this.AhwBna.setTag(null);
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
