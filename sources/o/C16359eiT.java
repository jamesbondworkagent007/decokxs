package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eiT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16359eiT extends AbstractC16352eiM {
    public static final ViewDataBinding.IncludedLayouts OLrzqt = null;
    public static final android.util.SparseIntArray copydefault;
    public long AEQbTJ;
    public final android.widget.LinearLayout EZpvd;

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
        copydefault = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.prepareFromUri, 1);
    }

    public C16359eiT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, OLrzqt, copydefault));
    }

    public C16359eiT(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55178xez) objArr[1]);
        this.AEQbTJ = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.EZpvd = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AEQbTJ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AEQbTJ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.AEQbTJ;
            this.AEQbTJ = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.EZpvd, C33570myu.AEQbTJ(getRoot().getContext()));
        }
    }
}
