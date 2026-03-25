package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16422ejd extends AbstractC16424ejf {
    public static final android.util.SparseIntArray gEmmrt;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long AhwBna;
    public final ConstraintLayout DbNXlk;

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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.iZzfmt, 1);
        sparseIntArray.put(C13754dXa.ActionBar.spnCvw, 2);
        sparseIntArray.put(C13754dXa.ActionBar.Dmq, 3);
        sparseIntArray.put(C13754dXa.ActionBar.zblBkD, 4);
        sparseIntArray.put(C13754dXa.ActionBar.getLong, 5);
        sparseIntArray.put(C13754dXa.ActionBar.getRating, 6);
        sparseIntArray.put(C13754dXa.ActionBar.getBitmap, 7);
    }

    public C16422ejd(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, valueOf, gEmmrt));
    }

    public C16422ejd(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (android.widget.ImageView) objArr[4], (android.widget.RelativeLayout) objArr[2], (android.widget.TextView) objArr[3], (android.widget.ImageView) objArr[7], (android.widget.RelativeLayout) objArr[5], (android.widget.TextView) objArr[6]);
        this.AhwBna = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.DbNXlk = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AhwBna != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
    }
}
