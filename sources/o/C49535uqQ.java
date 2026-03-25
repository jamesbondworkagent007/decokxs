package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C49511upt;

/* JADX INFO: renamed from: o.uqQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49535uqQ extends AbstractC49536uqR {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public final android.widget.LinearLayout AkhnZx;
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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C49511upt.Application.RVsVBY, 1);
        sparseIntArray.put(C49511upt.Application.dLBcXg, 2);
        sparseIntArray.put(C49511upt.Application.AwvSrB, 3);
        sparseIntArray.put(C49511upt.Application.QIZEnU, 4);
        sparseIntArray.put(C49511upt.Application.QXDzTk, 5);
        sparseIntArray.put(C49511upt.Application.gEmmrt, 6);
        sparseIntArray.put(C49511upt.Application.aKErDB, 7);
    }

    public C49535uqQ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AhwBna, AYXKKw));
    }

    public C49535uqQ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Barrier) objArr[6], (android.widget.ImageView) objArr[3], (android.widget.ImageView) objArr[7], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[2]);
        this.gEmmrt = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AkhnZx = linearLayout;
        linearLayout.setTag(null);
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
