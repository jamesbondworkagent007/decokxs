package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.etD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16926etD extends AbstractC16971etw {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray valueOf;
    public long AhwBna;
    public final ConstraintLayout gEmmrt;

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
        sparseIntArray.put(C13754dXa.ActionBar.size, 1);
        sparseIntArray.put(C13754dXa.ActionBar.setVolumeTo, 2);
        sparseIntArray.put(C13754dXa.ActionBar.setCaptioningEnabled, 3);
        sparseIntArray.put(C13754dXa.ActionBar.fXG, 4);
        sparseIntArray.put(C13754dXa.ActionBar.IResultReceiver2Stub, 5);
        sparseIntArray.put(C13754dXa.ActionBar.fQQVvf, 6);
    }

    public C16926etD(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, AYXKKw, valueOf));
    }

    public C16926etD(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Barrier) objArr[6], (ShapeableImageView) objArr[4], (C57440yiU) objArr[1], (ShapeableImageView) objArr[3], (ShapeableImageView) objArr[2], (Barrier) objArr[5]);
        this.AhwBna = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.gEmmrt = constraintLayout;
        constraintLayout.setTag(null);
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
