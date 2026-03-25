package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16532elh extends AbstractC16535elk {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray values;
    public long fetchVPNInfo;

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
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi216, 1);
        sparseIntArray.put(C13754dXa.ActionBar.fromMediaItemList, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ODWQjV, 3);
        sparseIntArray.put(C13754dXa.ActionBar.getMediaId, 4);
        sparseIntArray.put(C13754dXa.ActionBar.OAhWiU, 5);
        sparseIntArray.put(C13754dXa.ActionBar.getActions, 6);
        sparseIntArray.put(C13754dXa.ActionBar.getTag, 7);
        sparseIntArray.put(C13754dXa.ActionBar.DPHNDa, 8);
    }

    public C16532elh(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, gEmmrt, values));
    }

    public C16532elh(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[3], (C52794wYp) objArr[8], (ConstraintLayout) objArr[0], (android.view.View) objArr[5], (NestedScrollView) objArr[1], (android.widget.ImageView) objArr[2], (android.widget.TextView) objArr[4], (RecyclerView) objArr[7], (android.widget.TextView) objArr[6]);
        this.fetchVPNInfo = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
