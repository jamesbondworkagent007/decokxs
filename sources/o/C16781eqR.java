package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eqR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16781eqR extends AbstractC16784eqU {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray djBIcL;
    public long fetchVPNInfo;

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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.DsfknC, 1);
        sparseIntArray.put(C13754dXa.ActionBar.isConnected, 2);
        sparseIntArray.put(C13754dXa.ActionBar.DbNXlk, 3);
        sparseIntArray.put(C13754dXa.ActionBar.QVAiDq, 4);
        sparseIntArray.put(C13754dXa.ActionBar.DTwDnp, 5);
        sparseIntArray.put(C13754dXa.ActionBar.dNCPSb, 6);
        sparseIntArray.put(C13754dXa.ActionBar.OxVOHk, 7);
    }

    public C16781eqR(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AhwBna, djBIcL));
    }

    public C16781eqR(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[2], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[5], (android.widget.LinearLayout) objArr[4], (wYC) objArr[6], (android.widget.TextView) objArr[7], (ConstraintLayout) objArr[0], (wYC) objArr[1]);
        this.fetchVPNInfo = -1L;
        this.valueOf.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
