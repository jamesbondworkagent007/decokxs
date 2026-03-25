package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.etY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16947etY extends AbstractC16944etV {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray valueOf;
    public final ConstraintLayout AhwBna;
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
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatItemReceiver, 1);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplApi191, 2);
        sparseIntArray.put(C13754dXa.ActionBar.setIconBitmap, 3);
        sparseIntArray.put(C13754dXa.ActionBar.onEvent, 4);
        sparseIntArray.put(C13754dXa.ActionBar.onLocationChanged, 5);
        sparseIntArray.put(C13754dXa.ActionBar.DfrfUJ, 6);
    }

    public C16947etY(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, AYXKKw, valueOf));
    }

    public C16947etY(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[6], (AppCompatImageView) objArr[5], (android.widget.ImageView) objArr[1], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[4], (C57261yfA) objArr[2]);
        this.gEmmrt = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
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
        synchronized (this) {
            this.gEmmrt = 0L;
        }
    }
}
