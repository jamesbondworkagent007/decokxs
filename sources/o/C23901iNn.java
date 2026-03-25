package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iNn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23901iNn extends AbstractC23899iNl {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public long AhwBna;
    public final android.widget.LinearLayout DbNXlk;

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
        sparseIntArray.put(C25493ixk.ActionBar.gbIfDn, 1);
        sparseIntArray.put(C25493ixk.ActionBar.ITrustedWebActivityServiceStubProxy, 2);
        sparseIntArray.put(C25493ixk.ActionBar.ITrustedWebActivityServiceDefault, 3);
        sparseIntArray.put(C25493ixk.ActionBar.dump, 4);
        sparseIntArray.put(C25493ixk.ActionBar.DBAlnt, 5);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatMediaItemFlags, 6);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatSearchCallback, 7);
    }

    public C23901iNn(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, djBIcL, AYXKKw));
    }

    public C23901iNn(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[1], (android.widget.ImageView) objArr[5], (C27516jwf) objArr[2], (android.widget.TextView) objArr[3], (android.widget.ImageView) objArr[4], (C27516jwf) objArr[6], (android.widget.TextView) objArr[7]);
        this.AhwBna = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.DbNXlk = linearLayout;
        linearLayout.setTag(null);
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
