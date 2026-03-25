package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import o.C13754dXa;

/* JADX INFO: renamed from: o.etX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16946etX extends AbstractC16942etT {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts fIwbmz = null;
    public long fARcdN;
    public final ConstraintLayout fJNWhG;

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
        sparseIntArray.put(C13754dXa.ActionBar.MediaDescriptionCompatApi23Builder, 1);
        sparseIntArray.put(C13754dXa.ActionBar.KWHzl, 2);
        sparseIntArray.put(C13754dXa.ActionBar.FHvxmb, 3);
        sparseIntArray.put(C13754dXa.ActionBar.DpxfQh, 4);
        sparseIntArray.put(C13754dXa.ActionBar.OqCbbx, 5);
        sparseIntArray.put(C13754dXa.ActionBar.UCQKYV, 6);
        sparseIntArray.put(C13754dXa.ActionBar.IResultReceiver, 7);
        sparseIntArray.put(C13754dXa.ActionBar.putInt, 8);
        sparseIntArray.put(C13754dXa.ActionBar.getLabel, 9);
        sparseIntArray.put(C13754dXa.ActionBar.IPostMessageServiceDefault, 10);
        sparseIntArray.put(C13754dXa.ActionBar.fdazkH, 11);
        sparseIntArray.put(C13754dXa.ActionBar.startIntentSenderForResult, 12);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatCustomActionResultReceiver, 13);
        sparseIntArray.put(C13754dXa.ActionBar.HJWChPhFGucI, 14);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatSearchResultReceiver, 15);
    }

    public C16946etX(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fIwbmz, AuCTel));
    }

    public C16946etX(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppBarLayout) objArr[2], (ConstraintLayout) objArr[9], (CollapsingToolbarLayout) objArr[3], (android.widget.FrameLayout) objArr[8], (Guideline) objArr[14], (AppCompatImageView) objArr[6], (android.widget.TextView) objArr[5], (LinearLayoutCompat) objArr[4], (AppCompatImageView) objArr[11], (android.widget.LinearLayout) objArr[10], (Barrier) objArr[13], (C52794wYp) objArr[15], (CoordinatorLayout) objArr[1], (androidx.appcompat.widget.Toolbar) objArr[7], (android.widget.TextView) objArr[12]);
        this.fARcdN = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fJNWhG = constraintLayout;
        constraintLayout.setTag(null);
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
