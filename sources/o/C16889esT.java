package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.esT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16889esT extends AbstractC16891esV {
    public static final ViewDataBinding.IncludedLayouts DbNXlk;
    public static final android.util.SparseIntArray isConnected;
    public final ConstraintLayout fJNWhG;
    public long values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(13);
        DbNXlk = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"layout_btc_utxo_more_input"}, new int[]{3}, new int[]{C13754dXa.TaskDescription.dSJNDS});
        includedLayouts.setIncludes(2, new java.lang.String[]{"layout_btc_utxo_more_input"}, new int[]{4}, new int[]{C13754dXa.TaskDescription.dSJNDS});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        isConnected = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.dcEsSD, 5);
        sparseIntArray.put(C13754dXa.ActionBar.CheckResult, 6);
        sparseIntArray.put(C13754dXa.ActionBar.hrnhsO, 7);
        sparseIntArray.put(C13754dXa.ActionBar.ReportDrawnAfter, 8);
        sparseIntArray.put(C13754dXa.ActionBar.MediaControllerCompatTransportControls, 9);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultRegistryLifecycleContainer, 10);
        sparseIntArray.put(C13754dXa.ActionBar.skipToPrevious, 11);
        sparseIntArray.put(C13754dXa.ActionBar.STbtMW, 12);
    }

    public C16889esT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, DbNXlk, isConnected));
    }

    public C16889esT(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 2, (android.widget.ImageView) objArr[7], (ConstraintLayout) objArr[1], (AbstractC16890esU) objArr[3], (AbstractC16890esU) objArr[4], (ConstraintLayout) objArr[2], (LinearLayoutCompat) objArr[5], (Group) objArr[12], (RecyclerView) objArr[9], (RecyclerView) objArr[11], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[6]);
        this.values = -1L;
        this.EZpvd.setTag(null);
        setContainedBinding(this.OLrzqt);
        setContainedBinding(this.AEQbTJ);
        this.copydefault.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fJNWhG = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 4L;
        }
        this.OLrzqt.invalidateAll();
        this.AEQbTJ.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.values != 0) {
                return true;
            }
            return this.OLrzqt.hasPendingBindings() || this.AEQbTJ.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.OLrzqt.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return OLrzqt((AbstractC16890esU) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return AEQbTJ((AbstractC16890esU) obj, i2);
    }

    public final boolean OLrzqt(AbstractC16890esU abstractC16890esU, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.values |= 1;
        }
        return true;
    }

    public final boolean AEQbTJ(AbstractC16890esU abstractC16890esU, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.values |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.OLrzqt);
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
    }
}
