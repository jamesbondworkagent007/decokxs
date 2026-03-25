package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31458luR extends AbstractC31457luQ {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts values;
    public final ConstraintLayout AuCTel;
    public long fIwbmz;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        values = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"view_filter_order_type", "view_filter_order_status_third_party", "view_filter_order_status_card", "view_filter_order_time"}, new int[]{1, 2, 3, 4}, new int[]{C31351lsQ.ActionBar.aUsmxb, C31351lsQ.ActionBar.QVsKAR, C31351lsQ.ActionBar.OxVOHk, C31351lsQ.ActionBar.QSLkRj});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.geLlBI, 5);
        sparseIntArray.put(C31351lsQ.Application.RWIpjU, 6);
        sparseIntArray.put(C31351lsQ.Application.RzdrRQ, 7);
        sparseIntArray.put(C31351lsQ.Application.sendBehavioSecData, 8);
        sparseIntArray.put(C31351lsQ.Application.hwkNQP, 9);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKDSqxTE, 10);
        sparseIntArray.put(C31351lsQ.Application.sSMYrx, 11);
        sparseIntArray.put(C31351lsQ.Application.QbewEr, 12);
        sparseIntArray.put(C31351lsQ.Application.RJOkX, 13);
    }

    public C31458luR(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, values, AkhnZx));
    }

    public C31458luR(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 4, (android.widget.LinearLayout) objArr[11], (C52794wYp) objArr[13], (C52794wYp) objArr[12], (AbstractC31617lxs) objArr[3], (AbstractC31619lxu) objArr[2], (AbstractC31623lxy) objArr[4], (lxD) objArr[1], (android.widget.RelativeLayout) objArr[5], (AppCompatImageView) objArr[7], (android.view.View) objArr[10], (android.view.View) objArr[8], (Barrier) objArr[9], (android.widget.TextView) objArr[6]);
        this.fIwbmz = -1L;
        setContainedBinding(this.KWHzl);
        setContainedBinding(this.OLrzqt);
        setContainedBinding(this.valueOf);
        setContainedBinding(this.AYXKKw);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AuCTel = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 16L;
        }
        this.AYXKKw.invalidateAll();
        this.OLrzqt.invalidateAll();
        this.KWHzl.invalidateAll();
        this.valueOf.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.fIwbmz != 0) {
                return true;
            }
            return this.AYXKKw.hasPendingBindings() || this.OLrzqt.hasPendingBindings() || this.KWHzl.hasPendingBindings() || this.valueOf.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AYXKKw.setLifecycleOwner(lifecycleOwner);
        this.OLrzqt.setLifecycleOwner(lifecycleOwner);
        this.KWHzl.setLifecycleOwner(lifecycleOwner);
        this.valueOf.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return EZpvd((AbstractC31617lxs) obj, i2);
        }
        if (i == 1) {
            return OLrzqt((AbstractC31619lxu) obj, i2);
        }
        if (i == 2) {
            return AEQbTJ((AbstractC31623lxy) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return EZpvd((lxD) obj, i2);
    }

    public final boolean EZpvd(AbstractC31617lxs abstractC31617lxs, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fIwbmz |= 1;
        }
        return true;
    }

    public final boolean OLrzqt(AbstractC31619lxu abstractC31619lxu, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fIwbmz |= 2;
        }
        return true;
    }

    public final boolean AEQbTJ(AbstractC31623lxy abstractC31623lxy, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fIwbmz |= 4;
        }
        return true;
    }

    public final boolean EZpvd(lxD lxd, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fIwbmz |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fIwbmz = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.AYXKKw);
        ViewDataBinding.executeBindingsOn(this.OLrzqt);
        ViewDataBinding.executeBindingsOn(this.KWHzl);
        ViewDataBinding.executeBindingsOn(this.valueOf);
    }
}
