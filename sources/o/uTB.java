package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.fragment.app.FragmentContainerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uTB extends AbstractC48505uTx {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray values;
    public long DbNXlk;
    public final ConstraintLayout isConnected;

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
        values = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.Slwtri, 1);
        sparseIntArray.put(C48033uCm.Application.min, 2);
        sparseIntArray.put(C48033uCm.Application.access000, 3);
        sparseIntArray.put(C48033uCm.Application.aSdHwS, 4);
        sparseIntArray.put(C48033uCm.Application.RgaQzq, 5);
        sparseIntArray.put(C48033uCm.Application.gAnGwV, 6);
        sparseIntArray.put(C48033uCm.Application.GiPPlLRPuVlr, 7);
        sparseIntArray.put(C48033uCm.Application.GcnicV, 8);
        sparseIntArray.put(C48033uCm.Application.DzOuPm, 9);
    }

    public uTB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, AhwBna, values));
    }

    public uTB(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (FragmentContainerView) objArr[6], (Group) objArr[8], (C52794wYp) objArr[7], (C55173xeu) objArr[9], (AppCompatImageView) objArr[1], (NestedScrollView) objArr[5], (AppCompatTextView) objArr[4], (android.widget.ImageView) objArr[3], (ConstraintLayout) objArr[2]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.DbNXlk;
            this.DbNXlk = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.isConnected, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}
