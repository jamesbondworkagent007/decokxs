package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ehH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16294ehH extends AbstractC16293ehG {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray valueOf;
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
        valueOf = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.accept, 1);
        sparseIntArray.put(C13754dXa.ActionBar.registerCallback, 2);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatBuilder, 3);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompat1, 4);
        sparseIntArray.put(C13754dXa.ActionBar.containsKey, 5);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKfNUfqk, 6);
        sparseIntArray.put(C13754dXa.ActionBar.DzkRMH, 7);
    }

    public C16294ehH(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AYXKKw, valueOf));
    }

    public C16294ehH(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C14775drn) objArr[6], (C52794wYp) objArr[7], (android.widget.LinearLayout) objArr[0], (C14775drn) objArr[5], (android.widget.LinearLayout) objArr[2], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3]);
        this.AkhnZx = -1L;
        this.OLrzqt.setTag(null);
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
