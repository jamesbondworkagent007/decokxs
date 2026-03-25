package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16457ekL extends AbstractC16458ekM {
    public static final ViewDataBinding.IncludedLayouts AkhnZx;
    public static final android.util.SparseIntArray isConnected;
    public final NestedScrollView DbNXlk;
    public long values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(12);
        AkhnZx = includedLayouts;
        int i = C13754dXa.TaskDescription.TarCU;
        includedLayouts.setIncludes(1, new java.lang.String[]{"dfragment_mpc_escape_success_item", "dfragment_mpc_escape_success_item", "dfragment_mpc_escape_success_item", "dfragment_mpc_escape_success_item"}, new int[]{2, 3, 4, 5}, new int[]{i, i, i, i});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        isConnected = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.sbu, 6);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatBuilder, 7);
        sparseIntArray.put(C13754dXa.ActionBar.DfrfUJ, 8);
        sparseIntArray.put(C13754dXa.ActionBar.OAhWiU, 9);
        sparseIntArray.put(C13754dXa.ActionBar.sendVolumeInfoChanged, 10);
        sparseIntArray.put(C13754dXa.ActionBar.newPercentageRating, 11);
    }

    public C16457ekL(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, AkhnZx, isConnected));
    }

    public C16457ekL(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 4, (AppCompatImageView) objArr[6], (AppCompatTextView) objArr[8], (android.view.View) objArr[9], (C52794wYp) objArr[11], (AbstractC16460ekO) objArr[2], (AbstractC16460ekO) objArr[3], (AbstractC16460ekO) objArr[4], (AbstractC16460ekO) objArr[5], (android.widget.LinearLayout) objArr[1], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[7]);
        this.values = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.DbNXlk = nestedScrollView;
        nestedScrollView.setTag(null);
        setContainedBinding(this.AEQbTJ);
        setContainedBinding(this.djBIcL);
        setContainedBinding(this.valueOf);
        setContainedBinding(this.AhwBna);
        this.AYXKKw.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 16L;
        }
        this.AEQbTJ.invalidateAll();
        this.djBIcL.invalidateAll();
        this.valueOf.invalidateAll();
        this.AhwBna.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.values != 0) {
                return true;
            }
            return this.AEQbTJ.hasPendingBindings() || this.djBIcL.hasPendingBindings() || this.valueOf.hasPendingBindings() || this.AhwBna.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
        this.djBIcL.setLifecycleOwner(lifecycleOwner);
        this.valueOf.setLifecycleOwner(lifecycleOwner);
        this.AhwBna.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return copydefault((AbstractC16460ekO) obj, i2);
        }
        if (i == 1) {
            return OLrzqt((AbstractC16460ekO) obj, i2);
        }
        if (i == 2) {
            return KWHzl((AbstractC16460ekO) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return EZpvd((AbstractC16460ekO) obj, i2);
    }

    public final boolean copydefault(AbstractC16460ekO abstractC16460ekO, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.values |= 1;
        }
        return true;
    }

    public final boolean OLrzqt(AbstractC16460ekO abstractC16460ekO, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.values |= 2;
        }
        return true;
    }

    public final boolean KWHzl(AbstractC16460ekO abstractC16460ekO, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.values |= 4;
        }
        return true;
    }

    public final boolean EZpvd(AbstractC16460ekO abstractC16460ekO, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.values |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
        ViewDataBinding.executeBindingsOn(this.djBIcL);
        ViewDataBinding.executeBindingsOn(this.valueOf);
        ViewDataBinding.executeBindingsOn(this.AhwBna);
    }
}
