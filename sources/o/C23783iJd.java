package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iJd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23783iJd extends AbstractC23787iJh {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long AhwBna;
    public final ConstraintLayout fetchVPNInfo;

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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.jNexW, 1);
        sparseIntArray.put(C25493ixk.ActionBar.DzkRMH, 2);
        sparseIntArray.put(C25493ixk.ActionBar.DGGHxk, 3);
        sparseIntArray.put(C25493ixk.ActionBar.DcMfJKDGTeJD, 4);
        sparseIntArray.put(C25493ixk.ActionBar.QWpYiD, 5);
        sparseIntArray.put(C25493ixk.ActionBar.DDjfYY, 6);
        sparseIntArray.put(C25493ixk.ActionBar.fiXcQa, 7);
    }

    public C23783iJd(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, valueOf, AYXKKw));
    }

    public C23783iJd(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYC) objArr[4], (android.widget.TextView) objArr[6], (android.widget.ImageView) objArr[7], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[3], (C55251xgS) objArr[1], (android.widget.TextView) objArr[5]);
        this.AhwBna = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
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
