package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C49720utq;

/* JADX INFO: renamed from: o.utK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49688utK extends AbstractC49689utL {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts valueOf;
    public long isConnected;
    public final android.widget.LinearLayout values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        valueOf = includedLayouts;
        int i = C49720utq.ActionBar.copydefault;
        includedLayouts.setIncludes(0, new java.lang.String[]{"view_depth_ticker_info_item", "view_depth_ticker_info_item", "view_depth_ticker_info_item", "view_depth_ticker_info_item", "view_depth_ticker_info_item", "view_depth_ticker_info_swap_new_item"}, new int[]{1, 2, 3, 4, 5, 6}, new int[]{i, i, i, i, i, C49720utq.ActionBar.KWHzl});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C49720utq.Application.OLrzqt, 7);
        sparseIntArray.put(C49720utq.Application.EZpvd, 8);
    }

    public C49688utK(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, valueOf, AYXKKw));
    }

    public C49688utK(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 6, (AbstractC49681utD) objArr[4], (android.widget.TextView) objArr[8], (AbstractC49681utD) objArr[3], (AbstractC49681utD) objArr[5], (AbstractC49681utD) objArr[2], (android.view.View) objArr[7], (AbstractC49681utD) objArr[1], (AbstractC49686utI) objArr[6]);
        this.isConnected = -1L;
        setContainedBinding(this.copydefault);
        setContainedBinding(this.OLrzqt);
        setContainedBinding(this.KWHzl);
        setContainedBinding(this.EZpvd);
        setContainedBinding(this.gEmmrt);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.values = linearLayout;
        linearLayout.setTag(null);
        setContainedBinding(this.AhwBna);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 64L;
        }
        this.gEmmrt.invalidateAll();
        this.EZpvd.invalidateAll();
        this.OLrzqt.invalidateAll();
        this.copydefault.invalidateAll();
        this.KWHzl.invalidateAll();
        this.AhwBna.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.isConnected != 0) {
                return true;
            }
            return this.gEmmrt.hasPendingBindings() || this.EZpvd.hasPendingBindings() || this.OLrzqt.hasPendingBindings() || this.copydefault.hasPendingBindings() || this.KWHzl.hasPendingBindings() || this.AhwBna.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.gEmmrt.setLifecycleOwner(lifecycleOwner);
        this.EZpvd.setLifecycleOwner(lifecycleOwner);
        this.OLrzqt.setLifecycleOwner(lifecycleOwner);
        this.copydefault.setLifecycleOwner(lifecycleOwner);
        this.KWHzl.setLifecycleOwner(lifecycleOwner);
        this.AhwBna.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return AEQbTJ((AbstractC49681utD) obj, i2);
        }
        if (i == 1) {
            return EZpvd((AbstractC49681utD) obj, i2);
        }
        if (i == 2) {
            return OLrzqt((AbstractC49681utD) obj, i2);
        }
        if (i == 3) {
            return KWHzl((AbstractC49681utD) obj, i2);
        }
        if (i == 4) {
            return copydefault((AbstractC49681utD) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return copydefault((AbstractC49686utI) obj, i2);
    }

    public final boolean AEQbTJ(AbstractC49681utD abstractC49681utD, int i) {
        if (i != C49719utp.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.isConnected |= 1;
        }
        return true;
    }

    public final boolean EZpvd(AbstractC49681utD abstractC49681utD, int i) {
        if (i != C49719utp.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.isConnected |= 2;
        }
        return true;
    }

    public final boolean OLrzqt(AbstractC49681utD abstractC49681utD, int i) {
        if (i != C49719utp.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.isConnected |= 4;
        }
        return true;
    }

    private boolean KWHzl(AbstractC49681utD abstractC49681utD, int i) {
        if (i != C49719utp.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.isConnected |= 8;
        }
        return true;
    }

    private boolean copydefault(AbstractC49681utD abstractC49681utD, int i) {
        if (i != C49719utp.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.isConnected |= 16;
        }
        return true;
    }

    public final boolean copydefault(AbstractC49686utI abstractC49686utI, int i) {
        if (i != C49719utp.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.isConnected |= 32;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.isConnected;
            this.isConnected = 0L;
        }
        if ((j & 64) != 0) {
            this.copydefault.KWHzl(true);
            this.copydefault.OLrzqt(getRoot().getResources().getString(C49720utq.Activity.gEmmrt));
            this.OLrzqt.KWHzl(true);
            this.OLrzqt.OLrzqt(getRoot().getResources().getString(C49720utq.Activity.valueOf));
            this.KWHzl.KWHzl(true);
            this.KWHzl.OLrzqt(getRoot().getResources().getString(C49720utq.Activity.getNewProxyInstance));
            this.EZpvd.OLrzqt(getRoot().getResources().getString(C49720utq.Activity.copydefault));
            this.gEmmrt.OLrzqt(getRoot().getResources().getString(C49720utq.Activity.EZpvd));
            this.AhwBna.EZpvd(true);
        }
        ViewDataBinding.executeBindingsOn(this.gEmmrt);
        ViewDataBinding.executeBindingsOn(this.EZpvd);
        ViewDataBinding.executeBindingsOn(this.OLrzqt);
        ViewDataBinding.executeBindingsOn(this.copydefault);
        ViewDataBinding.executeBindingsOn(this.KWHzl);
        ViewDataBinding.executeBindingsOn(this.AhwBna);
    }
}
