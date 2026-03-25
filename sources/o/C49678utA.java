package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C49720utq;

/* JADX INFO: renamed from: o.utA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49678utA extends AbstractC49729utz {
    public static final ViewDataBinding.IncludedLayouts KWHzl;
    public static final android.util.SparseIntArray OLrzqt;
    public long djBIcL;
    public final android.widget.LinearLayout gEmmrt;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        KWHzl = includedLayouts;
        int i = C49720utq.ActionBar.copydefault;
        includedLayouts.setIncludes(0, new java.lang.String[]{"view_depth_ticker_info_item", "view_depth_ticker_info_item"}, new int[]{1, 2}, new int[]{i, i});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        OLrzqt = sparseIntArray;
        sparseIntArray.put(C49720utq.Application.OLrzqt, 3);
    }

    public C49678utA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, KWHzl, OLrzqt));
    }

    public C49678utA(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 2, (AbstractC49681utD) objArr[2], (android.view.View) objArr[3], (AbstractC49681utD) objArr[1]);
        this.djBIcL = -1L;
        setContainedBinding(this.copydefault);
        setContainedBinding(this.EZpvd);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.gEmmrt = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 4L;
        }
        this.EZpvd.invalidateAll();
        this.copydefault.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.djBIcL != 0) {
                return true;
            }
            return this.EZpvd.hasPendingBindings() || this.copydefault.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.EZpvd.setLifecycleOwner(lifecycleOwner);
        this.copydefault.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return KWHzl((AbstractC49681utD) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return AEQbTJ((AbstractC49681utD) obj, i2);
    }

    public final boolean KWHzl(AbstractC49681utD abstractC49681utD, int i) {
        if (i != C49719utp.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.djBIcL |= 1;
        }
        return true;
    }

    public final boolean AEQbTJ(AbstractC49681utD abstractC49681utD, int i) {
        if (i != C49719utp.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.djBIcL |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.djBIcL;
            this.djBIcL = 0L;
        }
        if ((j & 4) != 0) {
            this.copydefault.OLrzqt(getRoot().getResources().getString(C49720utq.Activity.copydefault));
            this.EZpvd.OLrzqt(getRoot().getResources().getString(C49720utq.Activity.EZpvd));
        }
        ViewDataBinding.executeBindingsOn(this.EZpvd);
        ViewDataBinding.executeBindingsOn(this.copydefault);
    }
}
