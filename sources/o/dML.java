package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.dLX;

/* JADX INFO: loaded from: classes4.dex */
public class dML extends dMP {
    public static final android.util.SparseIntArray gEmmrt;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long AhwBna;
    public final android.widget.FrameLayout djBIcL;

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
        sparseIntArray.put(dLX.Application.zLjUOn, 1);
        sparseIntArray.put(dLX.Application.RlQdEF, 2);
        sparseIntArray.put(dLX.Application.RKcVTr, 3);
        sparseIntArray.put(dLX.Application.getPostValueLengthLimit, 4);
        sparseIntArray.put(dLX.Application.hCLrkq, 5);
        sparseIntArray.put(dLX.Application.iRxXKY, 6);
    }

    public dML(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, valueOf, gEmmrt));
    }

    public dML(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[1], (wYC) objArr[6], (android.widget.ImageView) objArr[2], (android.widget.LinearLayout) objArr[4], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[3]);
        this.AhwBna = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.djBIcL = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AhwBna != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
    }
}
