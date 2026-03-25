package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16562emK extends AbstractC16563emL {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public long fARcdN;

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
        AuCTel = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.ensureClassLoader, 1);
        sparseIntArray.put(C13754dXa.ActionBar.closeSocket, 2);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatBuilder, 3);
        sparseIntArray.put(C13754dXa.ActionBar.OAhWiU, 4);
        sparseIntArray.put(C13754dXa.ActionBar.RawRes, 5);
        sparseIntArray.put(C13754dXa.ActionBar.OpenForTesting, 6);
        sparseIntArray.put(C13754dXa.ActionBar.iqeXgQ, 7);
        sparseIntArray.put(C13754dXa.ActionBar.HJWChPUUMfbK, 8);
        sparseIntArray.put(C13754dXa.ActionBar.dIjzlO, 9);
        sparseIntArray.put(C13754dXa.ActionBar.Hx, 10);
        sparseIntArray.put(C13754dXa.ActionBar.ihnvzI, 11);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKfbSiEC, 12);
        sparseIntArray.put(C13754dXa.ActionBar.ExKek, 13);
        sparseIntArray.put(C13754dXa.ActionBar.DzkRMH, 14);
    }

    public C16562emK(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, ejfBZ, AuCTel));
    }

    public C16562emK(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[11], (wYK) objArr[9], (android.widget.TextView) objArr[12], (android.view.View) objArr[10], (ConstraintLayout) objArr[0], (C52794wYp) objArr[14], (android.widget.FrameLayout) objArr[13], (android.view.View) objArr[4], (RecyclerView) objArr[8], (android.widget.TextView) objArr[7], (android.widget.LinearLayout) objArr[2], (NestedScrollView) objArr[1], (android.widget.TextView) objArr[3], (RecyclerView) objArr[6], (android.widget.TextView) objArr[5]);
        this.fARcdN = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fARcdN != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fARcdN = 0L;
        }
    }
}
