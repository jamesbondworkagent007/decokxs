package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iIz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23778iIz extends AbstractC23773iIu {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public long AhwBna;
    public final ConstraintLayout isConnected;

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
        sparseIntArray.put(C25493ixk.ActionBar.izFvvl, 1);
        sparseIntArray.put(C25493ixk.ActionBar.doTurnConnection, 2);
        sparseIntArray.put(C25493ixk.ActionBar.gtCCJH, 3);
        sparseIntArray.put(C25493ixk.ActionBar.DAIeex, 4);
        sparseIntArray.put(C25493ixk.ActionBar.zqTOFw, 5);
        sparseIntArray.put(C25493ixk.ActionBar.DcMfJKRKUgwx, 6);
        sparseIntArray.put(C25493ixk.ActionBar.DGUQLIDGUQLI, 7);
    }

    public C23778iIz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, djBIcL, AYXKKw));
    }

    public C23778iIz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[4], (android.widget.LinearLayout) objArr[5], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[3], (android.widget.ImageView) objArr[6], (android.widget.ImageView) objArr[1], (android.widget.TextView) objArr[2]);
        this.AhwBna = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
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
