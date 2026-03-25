package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.wallet.interaction.view.DappItemFeeView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16957eti extends AbstractC16955etg {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts djBIcL;
    public long gEmmrt;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        djBIcL = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_aa_wallet_info"}, new int[]{1}, new int[]{C13754dXa.TaskDescription.OxbLUn});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.ZGRCNj, 2);
        sparseIntArray.put(C13754dXa.ActionBar.resume, 3);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1, 4);
        sparseIntArray.put(C13754dXa.ActionBar.getMediaMetadata, 5);
    }

    public C16957eti(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, djBIcL, AYXKKw));
    }

    public C16957eti(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (DappItemFeeView) objArr[3], (AbstractC16884esO) objArr[1], (C18437fiQ) objArr[2], (android.widget.LinearLayout) objArr[0], (DappItemFeeView) objArr[4], (DappItemFeeView) objArr[5]);
        this.gEmmrt = -1L;
        setContainedBinding(this.copydefault);
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 2L;
        }
        this.copydefault.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.gEmmrt != 0) {
                return true;
            }
            return this.copydefault.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.copydefault.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return AEQbTJ((AbstractC16884esO) obj, i2);
    }

    public final boolean AEQbTJ(AbstractC16884esO abstractC16884esO, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.gEmmrt |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.copydefault);
    }
}
