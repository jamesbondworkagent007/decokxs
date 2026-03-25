package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C17051evW extends AbstractC17052evX {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public long isConnected;

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
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatBuilder, 1);
        sparseIntArray.put(C13754dXa.ActionBar.dGgpab, 2);
        sparseIntArray.put(C13754dXa.ActionBar.DoNotInline, 3);
        sparseIntArray.put(C13754dXa.ActionBar.InspectablePropertyEnumEntry, 4);
        sparseIntArray.put(C13754dXa.ActionBar.ChecksSdkIntAtLeast, 5);
        sparseIntArray.put(C13754dXa.ActionBar.flagMapping, 6);
        sparseIntArray.put(C13754dXa.ActionBar.ContentView, 7);
        sparseIntArray.put(C13754dXa.ActionBar.mask, 8);
        sparseIntArray.put(C13754dXa.ActionBar.createOnBackInvokedCallback, 9);
    }

    public C17051evW(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, fetchVPNInfo, DbNXlk));
    }

    public C17051evW(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[1], (C52794wYp) objArr[9], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[4]);
        this.isConnected = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
