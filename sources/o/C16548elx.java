package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16548elx extends AbstractC16549ely {
    public static final ViewDataBinding.IncludedLayouts fIwbmz;
    public static final android.util.SparseIntArray fJNWhG;
    public long fARcdN;
    public final ConstraintLayout getFieldNames;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(18);
        fIwbmz = includedLayouts;
        int i = C13754dXa.TaskDescription.gbIfDn;
        includedLayouts.setIncludes(1, new java.lang.String[]{"item_network_fee", "item_network_fee", "item_network_fee"}, new int[]{2, 3, 4}, new int[]{i, i, i});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        fJNWhG = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.hTAtCx, 5);
        sparseIntArray.put(C13754dXa.ActionBar.CheckResult, 6);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsPickVisualMediaVideoOnly, 7);
        sparseIntArray.put(C13754dXa.ActionBar.getFlagsMask, 8);
        sparseIntArray.put(C13754dXa.ActionBar.ITrustedWebActivityCallback, 9);
        sparseIntArray.put(C13754dXa.ActionBar.haRtnV, 10);
        sparseIntArray.put(C13754dXa.ActionBar.create, 11);
        sparseIntArray.put(C13754dXa.ActionBar.hrnhsO, 12);
        sparseIntArray.put(C13754dXa.ActionBar.createIntent, 13);
        sparseIntArray.put(C13754dXa.ActionBar.ICustomTabsCallbackStubProxy, 14);
        sparseIntArray.put(C13754dXa.ActionBar.setContent, 15);
        sparseIntArray.put(C13754dXa.ActionBar.DdI, 16);
        sparseIntArray.put(C13754dXa.ActionBar.getAudioAttributes, 17);
    }

    public C16548elx(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, fIwbmz, fJNWhG));
    }

    public C16548elx(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 3, (AbstractC16843era) objArr[4], (AppCompatImageView) objArr[12], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[10], (AppCompatImageView) objArr[16], (android.widget.LinearLayout) objArr[14], (android.widget.RelativeLayout) objArr[9], (NestedScrollView) objArr[0], (C52794wYp) objArr[17], (AbstractC16843era) objArr[2], (AbstractC16843era) objArr[3], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[6]);
        this.fARcdN = -1L;
        setContainedBinding(this.OLrzqt);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.getFieldNames = constraintLayout;
        constraintLayout.setTag(null);
        this.valueOf.setTag(null);
        setContainedBinding(this.djBIcL);
        setContainedBinding(this.fetchVPNInfo);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = 8L;
        }
        this.djBIcL.invalidateAll();
        this.fetchVPNInfo.invalidateAll();
        this.OLrzqt.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.fARcdN != 0) {
                return true;
            }
            return this.djBIcL.hasPendingBindings() || this.fetchVPNInfo.hasPendingBindings() || this.OLrzqt.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.djBIcL.setLifecycleOwner(lifecycleOwner);
        this.fetchVPNInfo.setLifecycleOwner(lifecycleOwner);
        this.OLrzqt.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return AEQbTJ((AbstractC16843era) obj, i2);
        }
        if (i == 1) {
            return OLrzqt((AbstractC16843era) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return copydefault((AbstractC16843era) obj, i2);
    }

    public final boolean AEQbTJ(AbstractC16843era abstractC16843era, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fARcdN |= 1;
        }
        return true;
    }

    public final boolean OLrzqt(AbstractC16843era abstractC16843era, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fARcdN |= 2;
        }
        return true;
    }

    public final boolean copydefault(AbstractC16843era abstractC16843era, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.fARcdN |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fARcdN = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.djBIcL);
        ViewDataBinding.executeBindingsOn(this.fetchVPNInfo);
        ViewDataBinding.executeBindingsOn(this.OLrzqt);
    }
}
