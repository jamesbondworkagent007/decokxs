package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16738epb extends AbstractC16683eoZ {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public long AkhnZx;
    public final ConstraintLayout values;

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
        sparseIntArray.put(C13754dXa.ActionBar.aWJMta, 1);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatApi21CustomAction, 2);
        sparseIntArray.put(C13754dXa.ActionBar.hasCallback, 3);
        sparseIntArray.put(C13754dXa.ActionBar.setExtraBinder, 4);
        sparseIntArray.put(C13754dXa.ActionBar.izFvvl, 5);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatRepeatMode, 6);
        sparseIntArray.put(C13754dXa.ActionBar.onPreparePanel, 7);
        sparseIntArray.put(C13754dXa.ActionBar.addOnMultiWindowModeChangedListener, 8);
        sparseIntArray.put(C13754dXa.ActionBar.OKvQBs, 9);
        sparseIntArray.put(C13754dXa.ActionBar.RequiresOptIn, 10);
        sparseIntArray.put(C13754dXa.ActionBar.RVsVBY, 11);
    }

    public C16738epb(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, DbNXlk, fetchVPNInfo));
    }

    public C16738epb(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[11], (Guideline) objArr[5], (android.widget.ImageView) objArr[1], (android.widget.ImageView) objArr[9], (C55251xgS) objArr[4], (C55251xgS) objArr[3], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[7], (android.view.View) objArr[10]);
        this.AkhnZx = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
