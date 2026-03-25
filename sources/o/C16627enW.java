package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16627enW extends AbstractC16630enZ {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray ejfBZ;
    public long fIwbmz;

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
        ejfBZ = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi212, 1);
        sparseIntArray.put(C13754dXa.ActionBar.getServiceComponent, 2);
        sparseIntArray.put(C13754dXa.ActionBar.QWpYiD, 3);
        sparseIntArray.put(C13754dXa.ActionBar.DzCpqu, 4);
        sparseIntArray.put(C13754dXa.ActionBar.viewModels, 5);
        sparseIntArray.put(C13754dXa.ActionBar.dkJJWw, 6);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityViewModelLazyKt, 7);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatCallbackStubApi23, 8);
        sparseIntArray.put(C13754dXa.ActionBar.OAhWiU, 9);
        sparseIntArray.put(C13754dXa.ActionBar.getCallingPackage, 10);
        sparseIntArray.put(C13754dXa.ActionBar.getQueue, 11);
        sparseIntArray.put(C13754dXa.ActionBar.hCLrkq, 12);
        sparseIntArray.put(C13754dXa.ActionBar.AuCTelauCTel, 13);
    }

    public C16627enW(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, DbNXlk, ejfBZ));
    }

    public C16627enW(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[13], (android.widget.FrameLayout) objArr[12], (ConstraintLayout) objArr[0], (fDS) objArr[3], (android.view.View) objArr[9], (AppBarLayout) objArr[4], (AppCompatImageView) objArr[6], (AppCompatTextView) objArr[2], (AppCompatImageView) objArr[1], (RecyclerView) objArr[11], (C55230xfy) objArr[10], (android.view.View) objArr[8], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[7]);
        this.fIwbmz = -1L;
        this.AEQbTJ.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fIwbmz != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fIwbmz = 0L;
        }
    }
}
