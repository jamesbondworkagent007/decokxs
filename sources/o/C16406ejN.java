package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16406ejN extends AbstractC16403ejK {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray djBIcL;
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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.accept, 1);
        sparseIntArray.put(C13754dXa.ActionBar.getMediaUri, 2);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompat1, 3);
        sparseIntArray.put(C13754dXa.ActionBar.onPrepareFromUri, 4);
        sparseIntArray.put(C13754dXa.ActionBar.onRemoveQueueItemAt, 5);
        sparseIntArray.put(C13754dXa.ActionBar.onRemoveQueueItem, 6);
        sparseIntArray.put(C13754dXa.ActionBar.tIwhY, 7);
    }

    public C16406ejN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AhwBna, djBIcL));
    }

    public C16406ejN(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C52794wYp) objArr[7], (NestedScrollView) objArr[2], (android.widget.RelativeLayout) objArr[0], (C14775drn) objArr[4], (C14775drn) objArr[5], (C14775drn) objArr[6], (android.widget.TextView) objArr[3]);
        this.values = -1L;
        this.KWHzl.setTag(null);
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
        synchronized (this) {
            this.values = 0L;
        }
    }
}
