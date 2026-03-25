package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50846vbp extends AbstractC50844vbn {
    public static final android.util.SparseIntArray gEmmrt;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.QKDJJA, 1);
        sparseIntArray.put(C48033uCm.Application.gAnGwV, 2);
        sparseIntArray.put(C48033uCm.Application.getActiveNotifications, 3);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImplApi24Impl, 4);
        sparseIntArray.put(C48033uCm.Application.Srftgn, 5);
        sparseIntArray.put(C48033uCm.Application.GravityInt, 6);
    }

    public C50846vbp(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, valueOf, gEmmrt));
    }

    public C50846vbp(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[1], (android.widget.FrameLayout) objArr[2], (Guideline) objArr[5], (AppCompatImageView) objArr[3], (android.widget.FrameLayout) objArr[6], (android.widget.TextView) objArr[4]);
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
