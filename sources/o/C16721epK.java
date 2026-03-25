package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16721epK extends AbstractC16723epM {
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public static final android.util.SparseIntArray fJNWhG;
    public final android.widget.LinearLayout AuCTel;
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
        fJNWhG = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.ArkbYM, 1);
        sparseIntArray.put(C13754dXa.ActionBar.znKlvJ, 2);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi211, 3);
        sparseIntArray.put(C13754dXa.ActionBar.gVEiQJ, 4);
        sparseIntArray.put(C13754dXa.ActionBar.putString, 5);
        sparseIntArray.put(C13754dXa.ActionBar.OqHLSf, 6);
        sparseIntArray.put(C13754dXa.ActionBar.invokespecialRuDPQV, 7);
        sparseIntArray.put(C13754dXa.ActionBar.bindToGooglePlayService, 8);
        sparseIntArray.put(C13754dXa.ActionBar.rewind, 9);
        sparseIntArray.put(C13754dXa.ActionBar.glVQsU, 10);
        sparseIntArray.put(C13754dXa.ActionBar.OqFWZa, 11);
        sparseIntArray.put(C13754dXa.ActionBar.setShuffleModeEnabledRemoved, 12);
        sparseIntArray.put(C13754dXa.ActionBar.sendMediaButton, 13);
        sparseIntArray.put(C13754dXa.ActionBar.gsvlRV, 14);
        sparseIntArray.put(C13754dXa.ActionBar.OAhWiU, 15);
    }

    public C16721epK(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, ejfBZ, fJNWhG));
    }

    public C16721epK(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[11], (C55251xgS) objArr[7], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[14], (C55251xgS) objArr[4], (android.view.View) objArr[15], (ShapeableImageView) objArr[2], (android.widget.ImageView) objArr[6], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[3], (C55251xgS) objArr[5], (ConstraintLayout) objArr[9], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[13]);
        this.fARcdN = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AuCTel = linearLayout;
        linearLayout.setTag(null);
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
