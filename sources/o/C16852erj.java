package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16852erj extends AbstractC16844erb {
    public static final ViewDataBinding.IncludedLayouts ejfBZ;
    public static final android.util.SparseIntArray fARcdN;
    public long AuCTel;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(16);
        ejfBZ = includedLayouts;
        int i = C13754dXa.TaskDescription.OKSWiw;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_send_coin_fee_custom_item", "layout_send_coin_fee_custom_item", "layout_send_coin_fee_custom_item", "layout_send_coin_fee_custom_item", "layout_send_coin_fee_custom_item"}, new int[]{3, 4, 5, 6, 7}, new int[]{i, i, i, i, i});
        includedLayouts.setIncludes(1, new java.lang.String[]{"layout_network_fees"}, new int[]{2}, new int[]{C13754dXa.TaskDescription.QOeQqh});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        fARcdN = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.sQOHWT, 8);
        sparseIntArray.put(C13754dXa.ActionBar.RhjxDW, 9);
        sparseIntArray.put(C13754dXa.ActionBar.onReceive, 10);
        sparseIntArray.put(C13754dXa.ActionBar.OqFWZa, 11);
        sparseIntArray.put(C13754dXa.ActionBar.OAhWiU, 12);
        sparseIntArray.put(C13754dXa.ActionBar.MediaControllerCompatApi21TransportControls, 13);
        sparseIntArray.put(C13754dXa.ActionBar.getAudioAttributes, 14);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatCallbackStubApi24, 15);
    }

    public C16852erj(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, ejfBZ, fARcdN));
    }

    public C16852erj(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 6, (AppCompatImageView) objArr[11], (ConstraintLayout) objArr[0], (android.view.View) objArr[12], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[9], (AppCompatImageView) objArr[8], (AbstractC17079evy) objArr[4], (AbstractC17079evy) objArr[6], (AbstractC17079evy) objArr[3], (C57303yfq) objArr[1], (AbstractC17079evy) objArr[5], (AbstractC17079evy) objArr[7], (AbstractC17075evu) objArr[2], (C52794wYp) objArr[14], (wYK) objArr[13], (android.widget.Space) objArr[15]);
        this.AuCTel = -1L;
        this.EZpvd.setTag(null);
        setContainedBinding(this.AYXKKw);
        setContainedBinding(this.valueOf);
        setContainedBinding(this.gEmmrt);
        this.AhwBna.setTag(null);
        setContainedBinding(this.AkhnZx);
        setContainedBinding(this.DbNXlk);
        setContainedBinding(this.fetchVPNInfo);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTel = 64L;
        }
        this.fetchVPNInfo.invalidateAll();
        this.gEmmrt.invalidateAll();
        this.AYXKKw.invalidateAll();
        this.AkhnZx.invalidateAll();
        this.valueOf.invalidateAll();
        this.DbNXlk.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AuCTel != 0) {
                return true;
            }
            return this.fetchVPNInfo.hasPendingBindings() || this.gEmmrt.hasPendingBindings() || this.AYXKKw.hasPendingBindings() || this.AkhnZx.hasPendingBindings() || this.valueOf.hasPendingBindings() || this.DbNXlk.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.fetchVPNInfo.setLifecycleOwner(lifecycleOwner);
        this.gEmmrt.setLifecycleOwner(lifecycleOwner);
        this.AYXKKw.setLifecycleOwner(lifecycleOwner);
        this.AkhnZx.setLifecycleOwner(lifecycleOwner);
        this.valueOf.setLifecycleOwner(lifecycleOwner);
        this.DbNXlk.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return AEQbTJ((AbstractC17079evy) obj, i2);
        }
        if (i == 1) {
            return KWHzl((AbstractC17079evy) obj, i2);
        }
        if (i == 2) {
            return OLrzqt((AbstractC17079evy) obj, i2);
        }
        if (i == 3) {
            return copydefault((AbstractC17079evy) obj, i2);
        }
        if (i == 4) {
            return EZpvd((AbstractC17079evy) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return copydefault((AbstractC17075evu) obj, i2);
    }

    public final boolean AEQbTJ(AbstractC17079evy abstractC17079evy, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AuCTel |= 1;
        }
        return true;
    }

    public final boolean KWHzl(AbstractC17079evy abstractC17079evy, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AuCTel |= 2;
        }
        return true;
    }

    public final boolean OLrzqt(AbstractC17079evy abstractC17079evy, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AuCTel |= 4;
        }
        return true;
    }

    public final boolean copydefault(AbstractC17079evy abstractC17079evy, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AuCTel |= 8;
        }
        return true;
    }

    public final boolean EZpvd(AbstractC17079evy abstractC17079evy, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AuCTel |= 16;
        }
        return true;
    }

    private boolean copydefault(AbstractC17075evu abstractC17075evu, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AuCTel |= 32;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTel = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.fetchVPNInfo);
        ViewDataBinding.executeBindingsOn(this.gEmmrt);
        ViewDataBinding.executeBindingsOn(this.AYXKKw);
        ViewDataBinding.executeBindingsOn(this.AkhnZx);
        ViewDataBinding.executeBindingsOn(this.valueOf);
        ViewDataBinding.executeBindingsOn(this.DbNXlk);
    }
}
