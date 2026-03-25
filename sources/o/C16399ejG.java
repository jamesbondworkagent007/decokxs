package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16399ejG extends AbstractC16400ejH {
    public static final android.util.SparseIntArray iwGUEr;
    public static final ViewDataBinding.IncludedLayouts uzCIH = null;
    public long getFieldNames;

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
        iwGUEr = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.MediaDescriptionCompatApi23Builder, 1);
        sparseIntArray.put(C13754dXa.ActionBar.KWHzl, 2);
        sparseIntArray.put(C13754dXa.ActionBar.FHvxmb, 3);
        sparseIntArray.put(C13754dXa.ActionBar.DpxfQh, 4);
        sparseIntArray.put(C13754dXa.ActionBar.OqCbbx, 5);
        sparseIntArray.put(C13754dXa.ActionBar.UCQKYV, 6);
        sparseIntArray.put(C13754dXa.ActionBar.IResultReceiver, 7);
        sparseIntArray.put(C13754dXa.ActionBar.getName, 8);
        sparseIntArray.put(C13754dXa.ActionBar.fGsPTM, 9);
        sparseIntArray.put(C13754dXa.ActionBar.putInt, 10);
        sparseIntArray.put(C13754dXa.ActionBar.getSubtitle, 11);
        sparseIntArray.put(C13754dXa.ActionBar.ensureClassLoader, 12);
        sparseIntArray.put(C13754dXa.ActionBar.QYNZmZ, 13);
        sparseIntArray.put(C13754dXa.ActionBar.GiPPlL, 14);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKDGTeJD, 15);
        sparseIntArray.put(C13754dXa.ActionBar.getString, 16);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKfNUfqk, 17);
        sparseIntArray.put(C13754dXa.ActionBar.UlpNxW, 18);
        sparseIntArray.put(C13754dXa.ActionBar.addOnReportDrawnListener, 19);
    }

    public C16399ejG(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 20, uzCIH, iwGUEr));
    }

    public C16399ejG(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppBarLayout) objArr[2], (ConstraintLayout) objArr[0], (C52794wYp) objArr[15], (wYF) objArr[17], (CollapsingToolbarLayout) objArr[3], (android.widget.TextView) objArr[14], (android.widget.FrameLayout) objArr[10], (AppCompatImageView) objArr[6], (android.widget.TextView) objArr[5], (LinearLayoutCompat) objArr[4], (C57294yfh) objArr[13], (android.widget.ImageView) objArr[9], (android.widget.FrameLayout) objArr[18], (OKAlertBanner) objArr[11], (CoordinatorLayout) objArr[1], (C52794wYp) objArr[16], (C57209yeB) objArr[12], (android.widget.ImageView) objArr[8], (androidx.appcompat.widget.Toolbar) objArr[7], (android.widget.TextView) objArr[19]);
        this.getFieldNames = -1L;
        this.AEQbTJ.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getFieldNames = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getFieldNames != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getFieldNames = 0L;
        }
    }
}
