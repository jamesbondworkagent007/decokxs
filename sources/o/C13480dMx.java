package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.dLX;

/* JADX INFO: renamed from: o.dMx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C13480dMx extends AbstractC13481dMy {
    public static final android.util.SparseIntArray ejfBZ;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public long getNewProxyInstance;
    public final ConstraintLayout uzCIH;

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
        sparseIntArray.put(dLX.Application.zsXlph, 1);
        sparseIntArray.put(dLX.Application.wlaJM, 2);
        sparseIntArray.put(dLX.Application.DCJXGO, 3);
        sparseIntArray.put(dLX.Application.Ufzxmz, 4);
        sparseIntArray.put(dLX.Application.values, 5);
        sparseIntArray.put(dLX.Application.QIZEnU, 6);
        sparseIntArray.put(dLX.Application.fIwbmz, 7);
        sparseIntArray.put(dLX.Application.alsFma, 8);
        sparseIntArray.put(dLX.Application.UscePu, 9);
        sparseIntArray.put(dLX.Application.Dmq, 10);
        sparseIntArray.put(dLX.Application.ixgjPv, 11);
        sparseIntArray.put(dLX.Application.QSBOWP, 12);
        sparseIntArray.put(dLX.Application.finit, 13);
        sparseIntArray.put(dLX.Application.AYXKKw, 14);
        sparseIntArray.put(dLX.Application.AhwBna, 15);
        sparseIntArray.put(dLX.Application.QVAiDq, 16);
        sparseIntArray.put(dLX.Application.OcIXYQ, 17);
        sparseIntArray.put(dLX.Application.OxVOHk, 18);
    }

    public C13480dMx(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, fJNWhG, ejfBZ));
    }

    public C13480dMx(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[15], (android.widget.FrameLayout) objArr[14], (android.widget.ImageView) objArr[5], (android.widget.LinearLayout) objArr[7], (wYC) objArr[2], (android.widget.FrameLayout) objArr[1], (android.widget.ImageView) objArr[17], (android.widget.FrameLayout) objArr[16], (android.widget.LinearLayout) objArr[13], (Barrier) objArr[3], (android.widget.FrameLayout) objArr[12], (Barrier) objArr[18], (android.widget.TextView) objArr[11], (android.widget.FrameLayout) objArr[10], (android.widget.TextView) objArr[6], (android.widget.LinearLayout) objArr[4], (android.widget.ImageView) objArr[9], (android.widget.FrameLayout) objArr[8]);
        this.getNewProxyInstance = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.uzCIH = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getNewProxyInstance = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getNewProxyInstance != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getNewProxyInstance = 0L;
        }
    }
}
