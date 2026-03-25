package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31523lvd extends AbstractC31520lva {
    public static final ViewDataBinding.IncludedLayouts AuCTel;
    public static final android.util.SparseIntArray fJNWhG;
    public long ejfBZ;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(17);
        AuCTel = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"item_bsc_level1_header"}, new int[]{2}, new int[]{C31351lsQ.ActionBar.finit});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        fJNWhG = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.DQzvGNdrmXxudrmXxu, 3);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKDIADVb, 4);
        sparseIntArray.put(C31351lsQ.Application.OcIXYQ, 5);
        sparseIntArray.put(C31351lsQ.Application.GzAsTt, 6);
        sparseIntArray.put(C31351lsQ.Application.Th, 7);
        sparseIntArray.put(C31351lsQ.Application.GQzpsZ, 8);
        sparseIntArray.put(C31351lsQ.Application.OzhFjl, 9);
        sparseIntArray.put(C31351lsQ.Application.iKEqwx, 10);
        sparseIntArray.put(C31351lsQ.Application.DPhTBN, 11);
        sparseIntArray.put(C31351lsQ.Application.gtdfxv, 12);
        sparseIntArray.put(C31351lsQ.Application.iCPUKe, 13);
        sparseIntArray.put(C31351lsQ.Application.QFTsTN, 14);
        sparseIntArray.put(C31351lsQ.Application.DcNNRp, 15);
        sparseIntArray.put(C31351lsQ.Application.QKVWgx, 16);
    }

    public C31523lvd(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, AuCTel, fJNWhG));
    }

    public C31523lvd(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (ConstraintLayout) objArr[0], (C55113xdn) objArr[16], (ConstraintLayout) objArr[5], (android.widget.TextView) objArr[12], (android.widget.ImageView) objArr[10], (android.widget.ImageView) objArr[13], (android.widget.TextView) objArr[11], (ConstraintLayout) objArr[1], (android.widget.ImageView) objArr[7], (android.widget.LinearLayout) objArr[3], (AbstractC31494lvA) objArr[2], (lIB) objArr[4], (C55113xdn) objArr[14], (ConstraintLayout) objArr[8], (android.widget.LinearLayout) objArr[9], (C55249xgQ) objArr[6], (ViewPager2) objArr[15]);
        this.ejfBZ = -1L;
        this.KWHzl.setTag(null);
        this.valueOf.setTag(null);
        setContainedBinding(this.DbNXlk);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 2L;
        }
        this.DbNXlk.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.ejfBZ != 0) {
                return true;
            }
            return this.DbNXlk.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.DbNXlk.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return AEQbTJ((AbstractC31494lvA) obj, i2);
    }

    public final boolean AEQbTJ(AbstractC31494lvA abstractC31494lvA, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.ejfBZ |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.ejfBZ;
            this.ejfBZ = 0L;
        }
        if ((j & 2) != 0) {
            C30329lUi.EZpvd(this.KWHzl, true);
        }
        ViewDataBinding.executeBindingsOn(this.DbNXlk);
    }
}
