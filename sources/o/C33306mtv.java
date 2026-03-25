package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import o.C33160mrH;

/* JADX INFO: renamed from: o.mtv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33306mtv extends AbstractC33303mts {
    public static final ViewDataBinding.IncludedLayouts AhwBna;
    public static final android.util.SparseIntArray djBIcL;
    public final ConstraintLayout gEmmrt;
    public long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        AhwBna = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"mode_change_common_toolbar"}, new int[]{1}, new int[]{C33160mrH.Application.valueOf});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        djBIcL = sparseIntArray;
        sparseIntArray.put(C33160mrH.StateListAnimator.zsXlph, 2);
        sparseIntArray.put(C33160mrH.StateListAnimator.AuCTelauCTel, 3);
        sparseIntArray.put(C33160mrH.StateListAnimator.zLjUOn, 4);
        sparseIntArray.put(C33160mrH.StateListAnimator.AxsJAY, 5);
    }

    public C33306mtv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, AhwBna, djBIcL));
    }

    public C33306mtv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (AbstractC33295mtk) objArr[1], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[2], (ConstraintLayout) objArr[3], (android.widget.TextView) objArr[5]);
        this.valueOf = -1L;
        setContainedBinding(this.AEQbTJ);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.gEmmrt = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 2L;
        }
        this.AEQbTJ.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.valueOf != 0) {
                return true;
            }
            return this.AEQbTJ.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return AEQbTJ((AbstractC33295mtk) obj, i2);
    }

    public final boolean AEQbTJ(AbstractC33295mtk abstractC33295mtk, int i) {
        if (i != C33147mqv.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.valueOf |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        if ((j & 2) != 0) {
            ViewBindingAdapter.setPaddingTop(this.gEmmrt, C33570myu.AEQbTJ(getRoot().getContext()));
        }
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
    }
}
