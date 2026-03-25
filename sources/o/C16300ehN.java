package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ehN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16300ehN extends AbstractC16295ehI {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long AkhnZx;

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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.accept, 1);
        sparseIntArray.put(C13754dXa.ActionBar.getMediaUri, 2);
        sparseIntArray.put(C13754dXa.ActionBar.registerCallback, 3);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompat1, 4);
        sparseIntArray.put(C13754dXa.ActionBar.containsKey, 5);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKfNUfqk, 6);
        sparseIntArray.put(C13754dXa.ActionBar.viewCreated, 7);
        sparseIntArray.put(C13754dXa.ActionBar.DzkRMH, 8);
    }

    public C16300ehN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, gEmmrt, DbNXlk));
    }

    public C16300ehN(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C14775drn) objArr[6], (C52794wYp) objArr[8], (android.widget.LinearLayout) objArr[0], (NestedScrollView) objArr[2], (C14775drn) objArr[5], (android.widget.LinearLayout) objArr[3], (android.widget.TextView) objArr[4], (AppCompatTextView) objArr[7]);
        this.AkhnZx = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
