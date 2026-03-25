package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.etU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16943etU extends AbstractC16945etW {
    public static final android.util.SparseIntArray gEmmrt;
    public static final ViewDataBinding.IncludedLayouts valueOf;
    public long AhwBna;
    public final ConstraintLayout values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        valueOf = includedLayouts;
        int i = C13754dXa.TaskDescription.NRYds;
        includedLayouts.setIncludes(1, new java.lang.String[]{"item_multi_send_board", "item_multi_send_board", "item_multi_send_board"}, new int[]{2, 3, 4}, new int[]{i, i, i});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.getSessionToken, 5);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatBuilder, 6);
        sparseIntArray.put(C13754dXa.ActionBar.getRccStateFromState, 7);
    }

    public C16943etU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, valueOf, gEmmrt));
    }

    public C16943etU(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 3, (AbstractC16783eqT) objArr[4], (AbstractC16783eqT) objArr[3], (AbstractC16783eqT) objArr[2], (AppCompatImageView) objArr[5], (android.widget.TextView) objArr[7], (NestedScrollView) objArr[0], (android.widget.TextView) objArr[6]);
        this.AhwBna = -1L;
        setContainedBinding(this.OLrzqt);
        setContainedBinding(this.KWHzl);
        setContainedBinding(this.EZpvd);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
        this.AYXKKw.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 8L;
        }
        this.EZpvd.invalidateAll();
        this.KWHzl.invalidateAll();
        this.OLrzqt.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AhwBna != 0) {
                return true;
            }
            return this.EZpvd.hasPendingBindings() || this.KWHzl.hasPendingBindings() || this.OLrzqt.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.EZpvd.setLifecycleOwner(lifecycleOwner);
        this.KWHzl.setLifecycleOwner(lifecycleOwner);
        this.OLrzqt.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return AEQbTJ((AbstractC16783eqT) obj, i2);
        }
        if (i == 1) {
            return copydefault((AbstractC16783eqT) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return KWHzl((AbstractC16783eqT) obj, i2);
    }

    public final boolean AEQbTJ(AbstractC16783eqT abstractC16783eqT, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AhwBna |= 1;
        }
        return true;
    }

    public final boolean copydefault(AbstractC16783eqT abstractC16783eqT, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AhwBna |= 2;
        }
        return true;
    }

    public final boolean KWHzl(AbstractC16783eqT abstractC16783eqT, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AhwBna |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.EZpvd);
        ViewDataBinding.executeBindingsOn(this.KWHzl);
        ViewDataBinding.executeBindingsOn(this.OLrzqt);
    }
}
