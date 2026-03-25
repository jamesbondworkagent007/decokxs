package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16464ekS extends AbstractC16468ekW {
    public static final ViewDataBinding.IncludedLayouts ejfBZ;
    public static final android.util.SparseIntArray fJNWhG;
    public long AuCTel;
    public final ConstraintLayout fIwbmz;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(16);
        ejfBZ = includedLayouts;
        int i = C13754dXa.TaskDescription.akftKQ;
        includedLayouts.setIncludes(1, new java.lang.String[]{"dfragment_speed_up_tx_item", "dfragment_speed_up_tx_item", "dfragment_speed_up_tx_item", "dfragment_speed_up_tx_item", "dfragment_speed_up_tx_item"}, new int[]{2, 3, 4, 5, 6}, new int[]{i, i, i, i, i});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        fJNWhG = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatBuilder, 7);
        sparseIntArray.put(C13754dXa.ActionBar.getRccStateFromState, 8);
        sparseIntArray.put(C13754dXa.ActionBar.sbu, 9);
        sparseIntArray.put(C13754dXa.ActionBar.OAhWiU, 10);
        sparseIntArray.put(C13754dXa.ActionBar.r8lambdahrfbBpVkizzQbtGmrw6DTx0hH1A, 11);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKfNUfqk, 12);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKffREWX, 13);
        sparseIntArray.put(C13754dXa.ActionBar.RZMhtF, 14);
        sparseIntArray.put(C13754dXa.ActionBar.INotificationSideChannelStub, 15);
    }

    public C16464ekS(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, ejfBZ, fJNWhG));
    }

    public C16464ekS(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 5, (AbstractC16471ekZ) objArr[3], (AbstractC16471ekZ) objArr[5], (AbstractC16471ekZ) objArr[2], (AppCompatImageView) objArr[9], (C55173xeu) objArr[13], (C52794wYp) objArr[12], (LinearLayoutCompat) objArr[1], (AbstractC16471ekZ) objArr[4], (android.view.View) objArr[10], (Group) objArr[14], (C55113xdn) objArr[15], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[7], (AbstractC16471ekZ) objArr[6], (android.widget.TextView) objArr[11]);
        this.AuCTel = -1L;
        setContainedBinding(this.AEQbTJ);
        setContainedBinding(this.EZpvd);
        setContainedBinding(this.copydefault);
        this.valueOf.setTag(null);
        setContainedBinding(this.djBIcL);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fIwbmz = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.values);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTel = 32L;
        }
        this.copydefault.invalidateAll();
        this.AEQbTJ.invalidateAll();
        this.djBIcL.invalidateAll();
        this.EZpvd.invalidateAll();
        this.values.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AuCTel != 0) {
                return true;
            }
            return this.copydefault.hasPendingBindings() || this.AEQbTJ.hasPendingBindings() || this.djBIcL.hasPendingBindings() || this.EZpvd.hasPendingBindings() || this.values.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.copydefault.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
        this.djBIcL.setLifecycleOwner(lifecycleOwner);
        this.EZpvd.setLifecycleOwner(lifecycleOwner);
        this.values.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return EZpvd((AbstractC16471ekZ) obj, i2);
        }
        if (i == 1) {
            return KWHzl((AbstractC16471ekZ) obj, i2);
        }
        if (i == 2) {
            return copydefault((AbstractC16471ekZ) obj, i2);
        }
        if (i == 3) {
            return OLrzqt((AbstractC16471ekZ) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return AEQbTJ((AbstractC16471ekZ) obj, i2);
    }

    public final boolean EZpvd(AbstractC16471ekZ abstractC16471ekZ, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AuCTel |= 1;
        }
        return true;
    }

    public final boolean KWHzl(AbstractC16471ekZ abstractC16471ekZ, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AuCTel |= 2;
        }
        return true;
    }

    public final boolean copydefault(AbstractC16471ekZ abstractC16471ekZ, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AuCTel |= 4;
        }
        return true;
    }

    public final boolean OLrzqt(AbstractC16471ekZ abstractC16471ekZ, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AuCTel |= 8;
        }
        return true;
    }

    public final boolean AEQbTJ(AbstractC16471ekZ abstractC16471ekZ, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AuCTel |= 16;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTel = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.copydefault);
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
        ViewDataBinding.executeBindingsOn(this.djBIcL);
        ViewDataBinding.executeBindingsOn(this.EZpvd);
        ViewDataBinding.executeBindingsOn(this.values);
    }
}
