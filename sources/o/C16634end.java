package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.end, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16634end extends AbstractC16633enc {
    public static final ViewDataBinding.IncludedLayouts AYXKKw;
    public static final android.util.SparseIntArray gEmmrt;
    public final android.widget.LinearLayout AkhnZx;
    public final android.widget.LinearLayout djBIcL;
    public long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        AYXKKw = includedLayouts;
        int i = C13754dXa.TaskDescription.gbIfDn;
        includedLayouts.setIncludes(1, new java.lang.String[]{"item_network_fee", "item_network_fee", "item_network_fee", "item_network_fee_custom"}, new int[]{2, 3, 4, 5}, new int[]{i, i, i, C13754dXa.TaskDescription.FhERFw});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi26, 6);
        sparseIntArray.put(C13754dXa.ActionBar.sSi, 7);
    }

    public C16634end(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AYXKKw, gEmmrt));
    }

    public C16634end(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 4, (AbstractC16844erb) objArr[5], (AbstractC16843era) objArr[4], (android.widget.LinearLayout) objArr[7], (NestedScrollView) objArr[6], (AbstractC16843era) objArr[2], (AbstractC16843era) objArr[3]);
        this.valueOf = -1L;
        setContainedBinding(this.EZpvd);
        setContainedBinding(this.copydefault);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.djBIcL = linearLayout;
        linearLayout.setTag(null);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) objArr[1];
        this.AkhnZx = linearLayout2;
        linearLayout2.setTag(null);
        setContainedBinding(this.AEQbTJ);
        setContainedBinding(this.AhwBna);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 16L;
        }
        this.AEQbTJ.invalidateAll();
        this.AhwBna.invalidateAll();
        this.copydefault.invalidateAll();
        this.EZpvd.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.valueOf != 0) {
                return true;
            }
            return this.AEQbTJ.hasPendingBindings() || this.AhwBna.hasPendingBindings() || this.copydefault.hasPendingBindings() || this.EZpvd.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
        this.AhwBna.setLifecycleOwner(lifecycleOwner);
        this.copydefault.setLifecycleOwner(lifecycleOwner);
        this.EZpvd.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return KWHzl((AbstractC16844erb) obj, i2);
        }
        if (i == 1) {
            return OLrzqt((AbstractC16843era) obj, i2);
        }
        if (i == 2) {
            return EZpvd((AbstractC16843era) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return AEQbTJ((AbstractC16843era) obj, i2);
    }

    public final boolean KWHzl(AbstractC16844erb abstractC16844erb, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.valueOf |= 1;
        }
        return true;
    }

    private boolean OLrzqt(AbstractC16843era abstractC16843era, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.valueOf |= 2;
        }
        return true;
    }

    private boolean EZpvd(AbstractC16843era abstractC16843era, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.valueOf |= 4;
        }
        return true;
    }

    private boolean AEQbTJ(AbstractC16843era abstractC16843era, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.valueOf |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
        ViewDataBinding.executeBindingsOn(this.AhwBna);
        ViewDataBinding.executeBindingsOn(this.copydefault);
        ViewDataBinding.executeBindingsOn(this.EZpvd);
    }
}
