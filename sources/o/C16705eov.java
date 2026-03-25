package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16705eov extends AbstractC16708eoy {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public final ConstraintLayout AkhnZx;
    public long DbNXlk;

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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.ibrGus, 1);
        sparseIntArray.put(C13754dXa.ActionBar.CheckResult, 2);
        sparseIntArray.put(C13754dXa.ActionBar.onBackInvoked, 3);
        sparseIntArray.put(C13754dXa.ActionBar.createSession, 4);
        sparseIntArray.put(C13754dXa.ActionBar.hrnhsO, 5);
        sparseIntArray.put(C13754dXa.ActionBar.BackHandlerKtBackHandler11, 6);
        sparseIntArray.put(C13754dXa.ActionBar.r8lambdatzBBo0FLedRCWSI6_icF8qhF74s, 7);
        sparseIntArray.put(C13754dXa.ActionBar.gtdfxv, 8);
        sparseIntArray.put(C13754dXa.ActionBar.USBtdM, 9);
    }

    public C16705eov(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, AhwBna, fetchVPNInfo));
    }

    public C16705eov(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Barrier) objArr[9], (C52794wYp) objArr[8], (android.widget.ImageView) objArr[5], (android.widget.ImageView) objArr[1], (C55251xgS) objArr[4], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[2]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
