package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uXj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48599uXj extends AbstractC48595uXf {
    public static final android.util.SparseIntArray isConnected;
    public static final ViewDataBinding.IncludedLayouts values;
    public long DbNXlk;
    public final ConstraintLayout ejfBZ;
    public final NestedScrollView fARcdN;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        values = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"trade_impl_explain_chart_fast_deal", "trade_impl_explain_chart_better_price", "trade_impl_explain_chart_best_price"}, new int[]{2, 3, 4}, new int[]{C48033uCm.Activity.Hx, C48033uCm.Activity.DcMfJKfbSiEC, C48033uCm.Activity.DcMfJKRKUgwx});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        isConnected = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.sJPPOI, 5);
        sparseIntArray.put(C48033uCm.Application.isInitInProgress, 6);
        sparseIntArray.put(C48033uCm.Application.isScanInProgress, 7);
        sparseIntArray.put(C48033uCm.Application.zlvcHA, 8);
        sparseIntArray.put(C48033uCm.Application.zAEkPU, 9);
        sparseIntArray.put(C48033uCm.Application.vLaW, 10);
        sparseIntArray.put(C48033uCm.Application.zDUObI, 11);
        sparseIntArray.put(C48033uCm.Application.zKcAg, 12);
        sparseIntArray.put(C48033uCm.Application.tIwhY, 13);
    }

    public C48599uXj(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, values, isConnected));
    }

    public C48599uXj(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 3, (AppCompatImageView) objArr[12], (AbstractC48530uUv) objArr[4], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[11], (AppCompatImageView) objArr[9], (AbstractC48533uUy) objArr[3], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[8], (AppCompatImageView) objArr[6], (uUE) objArr[2], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[5]);
        this.DbNXlk = -1L;
        setContainedBinding(this.AEQbTJ);
        setContainedBinding(this.gEmmrt);
        setContainedBinding(this.AYXKKw);
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.fARcdN = nestedScrollView;
        nestedScrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.ejfBZ = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 8L;
        }
        this.AYXKKw.invalidateAll();
        this.gEmmrt.invalidateAll();
        this.AEQbTJ.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.DbNXlk != 0) {
                return true;
            }
            return this.AYXKKw.hasPendingBindings() || this.gEmmrt.hasPendingBindings() || this.AEQbTJ.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AYXKKw.setLifecycleOwner(lifecycleOwner);
        this.gEmmrt.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return KWHzl((uUE) obj, i2);
        }
        if (i == 1) {
            return KWHzl((AbstractC48533uUy) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return KWHzl((AbstractC48530uUv) obj, i2);
    }

    public final boolean KWHzl(uUE uue, int i) {
        if (i != C48034uCn.AEQbTJ) {
            return false;
        }
        synchronized (this) {
            this.DbNXlk |= 1;
        }
        return true;
    }

    public final boolean KWHzl(AbstractC48533uUy abstractC48533uUy, int i) {
        if (i != C48034uCn.AEQbTJ) {
            return false;
        }
        synchronized (this) {
            this.DbNXlk |= 2;
        }
        return true;
    }

    public final boolean KWHzl(AbstractC48530uUv abstractC48530uUv, int i) {
        if (i != C48034uCn.AEQbTJ) {
            return false;
        }
        synchronized (this) {
            this.DbNXlk |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.AYXKKw);
        ViewDataBinding.executeBindingsOn(this.gEmmrt);
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
    }
}
