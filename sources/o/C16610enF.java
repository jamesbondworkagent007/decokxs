package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.uilab.reminder.OKReminder;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16610enF extends AbstractC16611enG {
    public static final ViewDataBinding.IncludedLayouts valueOf;
    public static final android.util.SparseIntArray values;
    public long AkhnZx;
    public final android.widget.LinearLayout DbNXlk;
    public final android.widget.LinearLayout fetchVPNInfo;
    public final android.widget.LinearLayout isConnected;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(12);
        valueOf = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_dapp_interaction_btn_layout"}, new int[]{10}, new int[]{C13754dXa.TaskDescription.HJWChPOZOJIj});
        includedLayouts.setIncludes(1, new java.lang.String[]{"layout_dapp_interaction_top", "layout_dapp_interaction_network_fee"}, new int[]{3, 4}, new int[]{C13754dXa.TaskDescription.HJWChPOKBmQN, C13754dXa.TaskDescription.DjwCMv});
        includedLayouts.setIncludes(2, new java.lang.String[]{"layout_dapp_interaction_wallet", "layout_dapp_interaction_approved_amount", "layout_dapp_interaction_address", "layout_dapp_interaction_network", "layout_dapp_interaction_data"}, new int[]{5, 6, 7, 8, 9}, new int[]{C13754dXa.TaskDescription.QsIRgs, C13754dXa.TaskDescription.putInt, C13754dXa.TaskDescription.hwkNQP, C13754dXa.TaskDescription.HJWChPOKBmQNaCIdOM, C13754dXa.TaskDescription.fDu});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        values = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.playFromMediaId, 11);
    }

    public C16610enF(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, valueOf, values));
    }

    public C16610enF(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 8, (AbstractC16952etd) objArr[10], (AbstractC16954etf) objArr[6], (AbstractC16951etc) objArr[9], (AbstractC16958etj) objArr[8], (AbstractC16955etg) objArr[4], (AbstractC16949eta) objArr[7], (AbstractC16962etn) objArr[3], (AbstractC16960etl) objArr[5], (OKReminder) objArr[11]);
        this.AkhnZx = -1L;
        setContainedBinding(this.KWHzl);
        setContainedBinding(this.OLrzqt);
        setContainedBinding(this.copydefault);
        setContainedBinding(this.AEQbTJ);
        setContainedBinding(this.EZpvd);
        setContainedBinding(this.AhwBna);
        setContainedBinding(this.djBIcL);
        setContainedBinding(this.AYXKKw);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.DbNXlk = linearLayout;
        linearLayout.setTag(null);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) objArr[1];
        this.isConnected = linearLayout2;
        linearLayout2.setTag(null);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) objArr[2];
        this.fetchVPNInfo = linearLayout3;
        linearLayout3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 256L;
        }
        this.djBIcL.invalidateAll();
        this.EZpvd.invalidateAll();
        this.AYXKKw.invalidateAll();
        this.OLrzqt.invalidateAll();
        this.AhwBna.invalidateAll();
        this.AEQbTJ.invalidateAll();
        this.copydefault.invalidateAll();
        this.KWHzl.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AkhnZx != 0) {
                return true;
            }
            return this.djBIcL.hasPendingBindings() || this.EZpvd.hasPendingBindings() || this.AYXKKw.hasPendingBindings() || this.OLrzqt.hasPendingBindings() || this.AhwBna.hasPendingBindings() || this.AEQbTJ.hasPendingBindings() || this.copydefault.hasPendingBindings() || this.KWHzl.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.djBIcL.setLifecycleOwner(lifecycleOwner);
        this.EZpvd.setLifecycleOwner(lifecycleOwner);
        this.AYXKKw.setLifecycleOwner(lifecycleOwner);
        this.OLrzqt.setLifecycleOwner(lifecycleOwner);
        this.AhwBna.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
        this.copydefault.setLifecycleOwner(lifecycleOwner);
        this.KWHzl.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        switch (i) {
            case 0:
                return AEQbTJ((AbstractC16954etf) obj, i2);
            case 1:
                return KWHzl((AbstractC16962etn) obj, i2);
            case 2:
                return OLrzqt((AbstractC16960etl) obj, i2);
            case 3:
                return AEQbTJ((AbstractC16949eta) obj, i2);
            case 4:
                return KWHzl((AbstractC16951etc) obj, i2);
            case 5:
                return EZpvd((AbstractC16958etj) obj, i2);
            case 6:
                return KWHzl((AbstractC16952etd) obj, i2);
            case 7:
                return KWHzl((AbstractC16955etg) obj, i2);
            default:
                return false;
        }
    }

    public final boolean AEQbTJ(AbstractC16954etf abstractC16954etf, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AkhnZx |= 1;
        }
        return true;
    }

    public final boolean KWHzl(AbstractC16962etn abstractC16962etn, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AkhnZx |= 2;
        }
        return true;
    }

    public final boolean OLrzqt(AbstractC16960etl abstractC16960etl, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AkhnZx |= 4;
        }
        return true;
    }

    public final boolean AEQbTJ(AbstractC16949eta abstractC16949eta, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AkhnZx |= 8;
        }
        return true;
    }

    public final boolean KWHzl(AbstractC16951etc abstractC16951etc, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AkhnZx |= 16;
        }
        return true;
    }

    public final boolean EZpvd(AbstractC16958etj abstractC16958etj, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AkhnZx |= 32;
        }
        return true;
    }

    public final boolean KWHzl(AbstractC16952etd abstractC16952etd, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AkhnZx |= 64;
        }
        return true;
    }

    public final boolean KWHzl(AbstractC16955etg abstractC16955etg, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AkhnZx |= 128;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.djBIcL);
        ViewDataBinding.executeBindingsOn(this.EZpvd);
        ViewDataBinding.executeBindingsOn(this.AYXKKw);
        ViewDataBinding.executeBindingsOn(this.OLrzqt);
        ViewDataBinding.executeBindingsOn(this.AhwBna);
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
        ViewDataBinding.executeBindingsOn(this.copydefault);
        ViewDataBinding.executeBindingsOn(this.KWHzl);
    }
}
