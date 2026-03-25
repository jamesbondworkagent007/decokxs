package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwner;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31529lvj extends AbstractC31533lvn {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts AhwBna;
    public final ConstraintLayout DbNXlk;
    public final ConstraintLayout djBIcL;
    public long gEmmrt;
    public final ConstraintLayout valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        AhwBna = includedLayouts;
        includedLayouts.setIncludes(2, new java.lang.String[]{"layout_buy_sell_footer"}, new int[]{5}, new int[]{C31351lsQ.ActionBar.OqFWZa});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.hlXVux, 3);
        sparseIntArray.put(C31351lsQ.Application.registerUser, 4);
        sparseIntArray.put(C31351lsQ.Application.sIqKDg, 6);
        sparseIntArray.put(C31351lsQ.Application.zzQwtT, 7);
    }

    public C31529lvj(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AhwBna, AYXKKw));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C31529lvj(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        AbstractC31595lwx abstractC31595lwx = (AbstractC31595lwx) objArr[5];
        FragmentContainerView fragmentContainerView = (FragmentContainerView) objArr[7];
        java.lang.Object obj = objArr[3];
        C31549lwC c31549lwCKWHzl = obj != null ? C31549lwC.KWHzl((android.view.View) obj) : null;
        java.lang.Object obj2 = objArr[4];
        super(dataBindingComponent, view, 1, abstractC31595lwx, fragmentContainerView, c31549lwCKWHzl, obj2 != null ? C31552lwF.EZpvd((android.view.View) obj2) : null, (lOJ) objArr[6]);
        this.gEmmrt = -1L;
        setContainedBinding(this.AEQbTJ);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.valueOf = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.djBIcL = constraintLayout2;
        constraintLayout2.setTag(null);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) objArr[2];
        this.DbNXlk = constraintLayout3;
        constraintLayout3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 2L;
        }
        this.AEQbTJ.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.gEmmrt != 0) {
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
        return copydefault((AbstractC31595lwx) obj, i2);
    }

    private boolean copydefault(AbstractC31595lwx abstractC31595lwx, int i) {
        if (i != C31350lsP.copydefault) {
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
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
    }
}
