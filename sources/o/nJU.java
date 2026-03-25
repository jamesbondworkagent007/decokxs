package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nJU extends nJT {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray DbNXlk;
    public long isConnected;

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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.nriSR, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.invokespecialDPHOMC, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.fhUrPt, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.pause, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.HJWChP, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.RihMUf, 7);
        sparseIntArray.put(C35399nuc.StateListAnimator.RvdRAu, 8);
        sparseIntArray.put(C35399nuc.StateListAnimator.fGsPTM, 9);
        sparseIntArray.put(C35399nuc.StateListAnimator.aJFbMH, 10);
        sparseIntArray.put(C35399nuc.StateListAnimator.hDKMBd, 11);
    }

    public nJU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, AkhnZx, DbNXlk));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nJU(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[1];
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[11];
        android.view.View view2 = (android.view.View) objArr[10];
        android.view.View view3 = (android.view.View) objArr[8];
        java.lang.Object obj = objArr[3];
        C34041nPf c34041nPfKWHzl = obj != null ? C34041nPf.KWHzl((android.view.View) obj) : null;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        C35887oHj c35887oHj = (C35887oHj) objArr[7];
        C33603mza c33603mza = (C33603mza) objArr[5];
        C33546myW c33546myW = (C33546myW) objArr[4];
        RecyclerView recyclerView = (RecyclerView) objArr[6];
        java.lang.Object obj2 = objArr[2];
        super(dataBindingComponent, view, 0, linearLayoutCompat, frameLayout, view2, view3, c34041nPfKWHzl, constraintLayout, c35887oHj, c33603mza, c33546myW, recyclerView, obj2 != null ? C34036nPa.AEQbTJ((android.view.View) obj2) : null, (android.widget.TextView) objArr[9]);
        this.isConnected = -1L;
        this.OLrzqt.setTag(null);
        this.AhwBna.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
