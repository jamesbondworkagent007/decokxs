package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iHJ extends iHK {
    public static final android.util.SparseIntArray ORxRYg;
    public static final ViewDataBinding.IncludedLayouts QKVWgx = null;
    public long OcIXYQ;

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
        ORxRYg = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.Hx, 1);
        sparseIntArray.put(C25493ixk.ActionBar.OTJFaA, 2);
        sparseIntArray.put(C25493ixk.ActionBar.getLocation, 3);
        sparseIntArray.put(C25493ixk.ActionBar.DztXDE, 4);
        sparseIntArray.put(C25493ixk.ActionBar.gkZNMa, 5);
        sparseIntArray.put(C25493ixk.ActionBar.gCZUJG, 6);
        sparseIntArray.put(C25493ixk.ActionBar.hNurIN, 7);
        sparseIntArray.put(C25493ixk.ActionBar.aSdHwS, 8);
        sparseIntArray.put(C25493ixk.ActionBar.QMuEJi, 9);
        sparseIntArray.put(C25493ixk.ActionBar.RZNAhV, 10);
        sparseIntArray.put(C25493ixk.ActionBar.addPreRequisiteCollector, 11);
        sparseIntArray.put(C25493ixk.ActionBar.DRuYWY, 12);
        sparseIntArray.put(C25493ixk.ActionBar.DRtzUu, 13);
        sparseIntArray.put(C25493ixk.ActionBar.DGgnkA, 14);
        sparseIntArray.put(C25493ixk.ActionBar.RSmiaq, 15);
        sparseIntArray.put(C25493ixk.ActionBar.RTWSvT, 16);
        sparseIntArray.put(C25493ixk.ActionBar.DHEdFZ, 17);
        sparseIntArray.put(C25493ixk.ActionBar.RgaQzq, 18);
        sparseIntArray.put(C25493ixk.ActionBar.Swccd, 19);
        sparseIntArray.put(C25493ixk.ActionBar.RAaltf, 20);
        sparseIntArray.put(C25493ixk.ActionBar.getLabel, 21);
        sparseIntArray.put(C25493ixk.ActionBar.Zpvmxu, 22);
        sparseIntArray.put(C25493ixk.ActionBar.applyOptions, 23);
        sparseIntArray.put(C25493ixk.ActionBar.ijmTNW, 24);
        sparseIntArray.put(C25493ixk.ActionBar.cancel, 25);
        sparseIntArray.put(C25493ixk.ActionBar.ixgjPv, 26);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi26, 27);
        sparseIntArray.put(C25493ixk.ActionBar.setSubtitle, 28);
        sparseIntArray.put(C25493ixk.ActionBar.gCiISl, 29);
        sparseIntArray.put(C25493ixk.ActionBar.dLBcXg, 30);
        sparseIntArray.put(C25493ixk.ActionBar.QfgJNx, 31);
        sparseIntArray.put(C25493ixk.ActionBar.DvMhtu, 32);
        sparseIntArray.put(C25493ixk.ActionBar.QWSkGZ, 33);
        sparseIntArray.put(C25493ixk.ActionBar.drbYRJ, 34);
        sparseIntArray.put(C25493ixk.ActionBar.OsDdEf, 35);
    }

    public iHJ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 36, QKVWgx, ORxRYg));
    }

    public iHJ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[26], (NestedScrollView) objArr[14], (C27131jpR) objArr[30], (C27206jqn) objArr[21], (C27193jqa) objArr[19], (C27349jtX) objArr[10], (C27209jqq) objArr[16], (android.widget.ImageView) objArr[25], (android.widget.FrameLayout) objArr[1], (C55033xcM) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7], (C27308jsj) objArr[4], (C55030xcJ) objArr[34], (android.widget.LinearLayout) objArr[9], (android.widget.LinearLayout) objArr[3], (C27209jqq) objArr[15], (C27174jqH) objArr[29], (C27349jtX) objArr[11], (C27204jql) objArr[0], (C27138jpY) objArr[17], (ConstraintLayout) objArr[12], (android.view.View) objArr[13], (NestedScrollView) objArr[2], (C52794wYp) objArr[35], (C27197jqe) objArr[33], (C27200jqh) objArr[32], (android.widget.LinearLayout) objArr[31], (NestedScrollView) objArr[8], (C27187jqU) objArr[20], (C27209jqq) objArr[18], (android.widget.TextView) objArr[24], (LinearLayoutCompat) objArr[22], (android.widget.TextView) objArr[23], (android.widget.TextView) objArr[27], (android.widget.TextView) objArr[28]);
        this.OcIXYQ = -1L;
        this.AuCTel.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.OcIXYQ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.OcIXYQ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.OcIXYQ = 0L;
        }
    }
}
