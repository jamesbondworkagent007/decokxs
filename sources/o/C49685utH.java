package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C49720utq;

/* JADX INFO: renamed from: o.utH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49685utH extends AbstractC49684utG {
    public static final ViewDataBinding.IncludedLayouts djBIcL;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final android.widget.LinearLayout isConnected;
    public final android.widget.LinearLayout values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        djBIcL = includedLayouts;
        int i = C49720utq.ActionBar.copydefault;
        includedLayouts.setIncludes(0, new java.lang.String[]{"view_depth_ticker_info_item", "view_depth_ticker_info_item", "view_depth_ticker_info_item", "view_depth_ticker_info_item"}, new int[]{2, 3, 4, 5}, new int[]{i, i, i, i});
        int i2 = C49720utq.ActionBar.EZpvd;
        includedLayouts.setIncludes(1, new java.lang.String[]{"view_depth_ticker_info_future_new_item", "view_depth_ticker_info_future_new_item"}, new int[]{6, 7}, new int[]{i2, i2});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        valueOf = sparseIntArray;
        sparseIntArray.put(C49720utq.Application.OLrzqt, 8);
    }

    public C49685utH(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, djBIcL, valueOf));
    }

    public C49685utH(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 6, (AbstractC49681utD) objArr[5], (AbstractC49681utD) objArr[4], (AbstractC49679utB) objArr[7], (AbstractC49681utD) objArr[3], (android.view.View) objArr[8], (AbstractC49681utD) objArr[2], (AbstractC49679utB) objArr[6]);
        this.AYXKKw = -1L;
        setContainedBinding(this.AEQbTJ);
        setContainedBinding(this.copydefault);
        setContainedBinding(this.OLrzqt);
        setContainedBinding(this.KWHzl);
        setContainedBinding(this.AhwBna);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.values = linearLayout;
        linearLayout.setTag(null);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) objArr[1];
        this.isConnected = linearLayout2;
        linearLayout2.setTag(null);
        setContainedBinding(this.gEmmrt);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 64L;
        }
        this.AhwBna.invalidateAll();
        this.KWHzl.invalidateAll();
        this.copydefault.invalidateAll();
        this.AEQbTJ.invalidateAll();
        this.gEmmrt.invalidateAll();
        this.OLrzqt.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AYXKKw != 0) {
                return true;
            }
            return this.AhwBna.hasPendingBindings() || this.KWHzl.hasPendingBindings() || this.copydefault.hasPendingBindings() || this.AEQbTJ.hasPendingBindings() || this.gEmmrt.hasPendingBindings() || this.OLrzqt.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AhwBna.setLifecycleOwner(lifecycleOwner);
        this.KWHzl.setLifecycleOwner(lifecycleOwner);
        this.copydefault.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
        this.gEmmrt.setLifecycleOwner(lifecycleOwner);
        this.OLrzqt.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return copydefault((AbstractC49681utD) obj, i2);
        }
        if (i == 1) {
            return OLrzqt((AbstractC49679utB) obj, i2);
        }
        if (i == 2) {
            return EZpvd((AbstractC49679utB) obj, i2);
        }
        if (i == 3) {
            return KWHzl((AbstractC49681utD) obj, i2);
        }
        if (i == 4) {
            return EZpvd((AbstractC49681utD) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return AEQbTJ((AbstractC49681utD) obj, i2);
    }

    public final boolean copydefault(AbstractC49681utD abstractC49681utD, int i) {
        if (i != C49719utp.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AYXKKw |= 1;
        }
        return true;
    }

    public final boolean OLrzqt(AbstractC49679utB abstractC49679utB, int i) {
        if (i != C49719utp.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AYXKKw |= 2;
        }
        return true;
    }

    public final boolean EZpvd(AbstractC49679utB abstractC49679utB, int i) {
        if (i != C49719utp.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AYXKKw |= 4;
        }
        return true;
    }

    private boolean KWHzl(AbstractC49681utD abstractC49681utD, int i) {
        if (i != C49719utp.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AYXKKw |= 8;
        }
        return true;
    }

    public final boolean EZpvd(AbstractC49681utD abstractC49681utD, int i) {
        if (i != C49719utp.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AYXKKw |= 16;
        }
        return true;
    }

    private boolean AEQbTJ(AbstractC49681utD abstractC49681utD, int i) {
        if (i != C49719utp.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AYXKKw |= 32;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.AYXKKw;
            this.AYXKKw = 0L;
        }
        if ((j & 64) != 0) {
            this.AEQbTJ.KWHzl(true);
            this.AEQbTJ.OLrzqt(getRoot().getResources().getString(C49720utq.Activity.AYXKKw));
            this.copydefault.KWHzl(true);
            this.copydefault.OLrzqt(getRoot().getResources().getString(C49720utq.Activity.valueOf));
            this.OLrzqt.EZpvd(true);
            this.KWHzl.OLrzqt(getRoot().getResources().getString(C49720utq.Activity.copydefault));
            this.AhwBna.OLrzqt(getRoot().getResources().getString(C49720utq.Activity.EZpvd));
            this.gEmmrt.EZpvd(true);
        }
        ViewDataBinding.executeBindingsOn(this.AhwBna);
        ViewDataBinding.executeBindingsOn(this.KWHzl);
        ViewDataBinding.executeBindingsOn(this.copydefault);
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
        ViewDataBinding.executeBindingsOn(this.gEmmrt);
        ViewDataBinding.executeBindingsOn(this.OLrzqt);
    }
}
