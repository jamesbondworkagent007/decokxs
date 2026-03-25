package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ehx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16336ehx extends AbstractC16335ehw {
    public static final android.util.SparseIntArray getNewProxyInstance;
    public static final ViewDataBinding.IncludedLayouts iwGUEr = null;
    public final ConstraintLayout hDKMBd;
    public long uzCIH;

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
        getNewProxyInstance = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.DarRvM, 1);
        sparseIntArray.put(C13754dXa.ActionBar.DisplayContext, 2);
        sparseIntArray.put(C13754dXa.ActionBar.getSmallIconBitmap, 3);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKDIADVb, 4);
        sparseIntArray.put(C13754dXa.ActionBar.iflRwn, 5);
        sparseIntArray.put(C13754dXa.ActionBar.svUkWZ, 6);
        sparseIntArray.put(C13754dXa.ActionBar.UimiPOhkCVbT, 7);
        sparseIntArray.put(C13754dXa.ActionBar.open, 8);
        sparseIntArray.put(C13754dXa.ActionBar.verifyToken, 9);
        sparseIntArray.put(C13754dXa.ActionBar.IntRange, 10);
        sparseIntArray.put(C13754dXa.ActionBar.hlXVux, 11);
        sparseIntArray.put(C13754dXa.ActionBar.QhsCdEQhsCdE, 12);
        sparseIntArray.put(C13754dXa.ActionBar.ComponentDialog, 13);
        sparseIntArray.put(C13754dXa.ActionBar.isSystemPickerAvailableactivity_release, 14);
        sparseIntArray.put(C13754dXa.ActionBar.dTTfOR, 15);
        sparseIntArray.put(C13754dXa.ActionBar.AttrRes, 16);
        sparseIntArray.put(C13754dXa.ActionBar.getACTION_SYSTEM_FALLBACK_PICK_IMAGESannotations, 17);
        sparseIntArray.put(C13754dXa.ActionBar.getUriFromString, 18);
        sparseIntArray.put(C13754dXa.ActionBar.codename, 19);
        sparseIntArray.put(C13754dXa.ActionBar.DGUQLI, 20);
    }

    public C16336ehx(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 21, iwGUEr, getNewProxyInstance));
    }

    public C16336ehx(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C55390xiz) objArr[20], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[4], (ShapeableImageView) objArr[12], (android.widget.ImageView) objArr[15], (android.widget.ImageView) objArr[18], (ShapeableImageView) objArr[5], (ShapeableImageView) objArr[7], (ShapeableImageView) objArr[6], (LinearLayoutCompat) objArr[3], (C55251xgS) objArr[9], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[17], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[19], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[8]);
        this.uzCIH = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.hDKMBd = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.uzCIH = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.uzCIH != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.uzCIH = 0L;
        }
    }
}
