package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31488luv extends AbstractC31492luz {
    public static final ViewDataBinding.IncludedLayouts AhwBna;
    public static final android.util.SparseIntArray DbNXlk;
    public long isConnected;
    public final ConstraintLayout values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        AhwBna = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_buy_sell_footer"}, new int[]{1}, new int[]{C31351lsQ.ActionBar.OqFWZa});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.hlkKmr, 2);
        sparseIntArray.put(C31351lsQ.Application.gUEfcq, 3);
        sparseIntArray.put(C31351lsQ.Application.gwTjWJ, 4);
        sparseIntArray.put(C31351lsQ.Application.QHmsKR, 5);
        sparseIntArray.put(C31351lsQ.Application.hBpjJd, 6);
        sparseIntArray.put(C31351lsQ.Application.dmfpNf, 7);
        sparseIntArray.put(C31351lsQ.Application.RdAHlO, 8);
        sparseIntArray.put(C31351lsQ.Application.dHguZz, 9);
    }

    public C31488luv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, AhwBna, DbNXlk));
    }

    public C31488luv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (ConstraintLayout) objArr[5], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[4], (C55173xeu) objArr[3], (ConstraintLayout) objArr[2], (AbstractC31595lwx) objArr[1]);
        this.isConnected = -1L;
        setContainedBinding(this.AYXKKw);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 2L;
        }
        this.AYXKKw.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.isConnected != 0) {
                return true;
            }
            return this.AYXKKw.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AYXKKw.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return OLrzqt((AbstractC31595lwx) obj, i2);
    }

    public final boolean OLrzqt(AbstractC31595lwx abstractC31595lwx, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.isConnected |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.AYXKKw);
    }
}
