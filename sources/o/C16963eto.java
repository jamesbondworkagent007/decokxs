package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eto, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16963eto extends AbstractC16960etl {
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public static final android.util.SparseIntArray isConnected;
    public final ConstraintLayout AkhnZx;
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
        isConnected = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.CheckResult, 1);
        sparseIntArray.put(C13754dXa.ActionBar.HJWChPhFGucI, 2);
        sparseIntArray.put(C13754dXa.ActionBar.IntDef, 3);
        sparseIntArray.put(C13754dXa.ActionBar.init, 4);
        sparseIntArray.put(C13754dXa.ActionBar.onStart, 5);
        sparseIntArray.put(C13754dXa.ActionBar.UeEOUB, 6);
        sparseIntArray.put(C13754dXa.ActionBar.DaRZkR, 7);
        sparseIntArray.put(C13754dXa.ActionBar.RsCxkX, 8);
        sparseIntArray.put(C13754dXa.ActionBar.hasEnabledCallbacks, 9);
        sparseIntArray.put(C13754dXa.ActionBar.SUwuXE, 10);
    }

    public C16963eto(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, fetchVPNInfo, isConnected));
    }

    public C16963eto(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55251xgS) objArr[6], (ConstraintLayout) objArr[7], (ConstraintLayout) objArr[4], (Guideline) objArr[2], (android.widget.ImageView) objArr[8], (android.widget.ImageView) objArr[10], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[3]);
        this.values = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
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
