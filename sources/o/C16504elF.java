package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16504elF extends AbstractC16502elD {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray gEmmrt;
    public final android.widget.RelativeLayout AkhnZx;
    public long values;

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
        sparseIntArray.put(C13754dXa.ActionBar.PluralsRes, 1);
        sparseIntArray.put(C13754dXa.ActionBar.dPkBzA, 2);
        sparseIntArray.put(C13754dXa.ActionBar.FQNKFG, 3);
        sparseIntArray.put(C13754dXa.ActionBar.gqOnQv, 4);
        sparseIntArray.put(C13754dXa.ActionBar.svhCHd, 5);
        sparseIntArray.put(C13754dXa.ActionBar.zEHIKV, 6);
        sparseIntArray.put(C13754dXa.ActionBar.Dap, 7);
        sparseIntArray.put(C13754dXa.ActionBar.getAudioAttributes, 8);
    }

    public C16504elF(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AhwBna, gEmmrt));
    }

    public C16504elF(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[4], (ConstraintLayout) objArr[2], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[5], (C57230yeW) objArr[6], (android.widget.TextView) objArr[3], (C52794wYp) objArr[8], (android.widget.TextView) objArr[1]);
        this.values = -1L;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) objArr[0];
        this.AkhnZx = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
