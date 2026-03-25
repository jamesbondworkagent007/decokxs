package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16389eix extends AbstractC16340eiA {
    public static final ViewDataBinding.IncludedLayouts KWHzl = null;
    public static final android.util.SparseIntArray valueOf;
    public final ConstraintLayout djBIcL;
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
        valueOf = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi212, 1);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKsgNvtZ, 2);
        sparseIntArray.put(C13754dXa.ActionBar.next, 3);
        sparseIntArray.put(C13754dXa.ActionBar.getQueue, 4);
    }

    public C16389eix(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, KWHzl, valueOf));
    }

    public C16389eix(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYF) objArr[2], (AppCompatImageView) objArr[1], (RecyclerView) objArr[4], (C33546myW) objArr[3]);
        this.gEmmrt = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.djBIcL = constraintLayout;
        constraintLayout.setTag(null);
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
        long j;
        synchronized (this) {
            j = this.gEmmrt;
            this.gEmmrt = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.djBIcL, C33570myu.AEQbTJ(getRoot().getContext()));
        }
    }
}
