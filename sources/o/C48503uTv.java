package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uTv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48503uTv extends AbstractC48502uTu {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts OLrzqt = null;
    public long AhwBna;
    public final android.widget.HorizontalScrollView valueOf;

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
        sparseIntArray.put(C48033uCm.Application.dpErvT, 1);
        sparseIntArray.put(C48033uCm.Application.izFvvl, 2);
        sparseIntArray.put(C48033uCm.Application.sanrWj, 3);
        sparseIntArray.put(C48033uCm.Application.hfeTOA, 4);
    }

    public C48503uTv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, OLrzqt, AYXKKw));
    }

    public C48503uTv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[4], (C52794wYp) objArr[1], (C52794wYp) objArr[3], (C52794wYp) objArr[2]);
        this.AhwBna = -1L;
        android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) objArr[0];
        this.valueOf = horizontalScrollView;
        horizontalScrollView.setTag(null);
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
