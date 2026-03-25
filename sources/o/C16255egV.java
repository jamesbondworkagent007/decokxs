package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.egV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16255egV extends AbstractC16256egW {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray gEmmrt;
    public final ConstraintLayout AkhnZx;
    public long values;

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
        sparseIntArray.put(C13754dXa.ActionBar.hGuIrQ, 2);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi212, 3);
        sparseIntArray.put(C13754dXa.ActionBar.addOnContextAvailableListener, 4);
        sparseIntArray.put(C13754dXa.ActionBar.OHsvZP, 5);
        sparseIntArray.put(C13754dXa.ActionBar.MediaControllerCompatApi24TransportControls, 6);
        sparseIntArray.put(C13754dXa.ActionBar.FQMcgEfQMcgE, 7);
        sparseIntArray.put(C13754dXa.ActionBar.AubY, 8);
    }

    public C16255egV(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, djBIcL, gEmmrt));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16255egV(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        C52794wYp c52794wYp = (C52794wYp) objArr[8];
        RecyclerView recyclerView = (RecyclerView) objArr[7];
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[1];
        java.lang.Object obj = objArr[2];
        super(dataBindingComponent, view, 0, c52794wYp, recyclerView, frameLayout, obj != null ? C17117ewj.EZpvd((android.view.View) obj) : null, (android.widget.ImageView) objArr[5], (android.widget.ImageView) objArr[3], (C55230xfy) objArr[6], (android.widget.TextView) objArr[4]);
        this.values = -1L;
        this.KWHzl.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.values;
            this.values = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.KWHzl, C33570myu.AEQbTJ(getRoot().getContext()));
        }
    }
}
