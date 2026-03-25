package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31441luA extends AbstractC31443luC {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts gEmmrt;
    public long AhwBna;
    public final ConstraintLayout valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        gEmmrt = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_buy_sell_footer"}, new int[]{1}, new int[]{C31351lsQ.ActionBar.OqFWZa});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.DzkRMH, 2);
        sparseIntArray.put(C31351lsQ.Application.fiXcQa, 3);
        sparseIntArray.put(C31351lsQ.Application.glVQsU, 4);
        sparseIntArray.put(C31351lsQ.Application.alsFma, 5);
        sparseIntArray.put(C31351lsQ.Application.dLBcXg, 6);
    }

    public C31441luA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, gEmmrt, AYXKKw));
    }

    public C31441luA(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (wYK) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[4], (ConstraintLayout) objArr[2], (android.widget.TextView) objArr[3], (AbstractC31595lwx) objArr[1]);
        this.AhwBna = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.valueOf = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.djBIcL);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 2L;
        }
        this.djBIcL.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AhwBna != 0) {
                return true;
            }
            return this.djBIcL.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.djBIcL.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return AEQbTJ((AbstractC31595lwx) obj, i2);
    }

    public final boolean AEQbTJ(AbstractC31595lwx abstractC31595lwx, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.AhwBna |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.djBIcL);
    }
}
