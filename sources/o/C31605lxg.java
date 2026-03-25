package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lxg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31605lxg extends AbstractC31607lxi {
    public static final android.util.SparseIntArray fARcdN;
    public static final ViewDataBinding.IncludedLayouts fJNWhG;
    public long fIwbmz;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(16);
        fJNWhG = includedLayouts;
        int i = C31351lsQ.ActionBar.hrNTAI;
        includedLayouts.setIncludes(1, new java.lang.String[]{"view_buy_sell_convert_step", "view_buy_sell_convert_step"}, new int[]{2, 3}, new int[]{i, i});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        fARcdN = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.OWSZPf, 4);
        sparseIntArray.put(C31351lsQ.Application.fZc, 5);
        sparseIntArray.put(C31351lsQ.Application.onReceive, 6);
        sparseIntArray.put(C31351lsQ.Application.getUserContextRegisteredStatus, 7);
        sparseIntArray.put(C31351lsQ.Application.dYepVG, 8);
        sparseIntArray.put(C31351lsQ.Application.seuMaA, 9);
        sparseIntArray.put(C31351lsQ.Application.deregisterUser, 10);
        sparseIntArray.put(C31351lsQ.Application.iRgjgR, 11);
        sparseIntArray.put(C31351lsQ.Application.HJWChPfvRMlC, 12);
        sparseIntArray.put(C31351lsQ.Application.RqmePg, 13);
        sparseIntArray.put(C31351lsQ.Application.RZMhtF, 14);
        sparseIntArray.put(C31351lsQ.Application.apHBvG, 15);
    }

    public C31605lxg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fJNWhG, fARcdN));
    }

    public C31605lxg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 2, (ConstraintLayout) objArr[0], (android.widget.ImageView) objArr[13], (ConstraintLayout) objArr[7], (ConstraintLayout) objArr[10], (android.widget.LinearLayout) objArr[1], (android.widget.ImageView) objArr[5], (AbstractC31608lxj) objArr[2], (AbstractC31608lxj) objArr[3], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[4]);
        this.fIwbmz = -1L;
        this.OLrzqt.setTag(null);
        this.KWHzl.setTag(null);
        setContainedBinding(this.gEmmrt);
        setContainedBinding(this.AhwBna);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 4L;
        }
        this.gEmmrt.invalidateAll();
        this.AhwBna.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.fIwbmz != 0) {
                return true;
            }
            return this.gEmmrt.hasPendingBindings() || this.AhwBna.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.gEmmrt.setLifecycleOwner(lifecycleOwner);
        this.AhwBna.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return copydefault((AbstractC31608lxj) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return AEQbTJ((AbstractC31608lxj) obj, i2);
    }

    public final boolean copydefault(AbstractC31608lxj abstractC31608lxj, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fIwbmz |= 1;
        }
        return true;
    }

    public final boolean AEQbTJ(AbstractC31608lxj abstractC31608lxj, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.fIwbmz |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fIwbmz = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.gEmmrt);
        ViewDataBinding.executeBindingsOn(this.AhwBna);
    }
}
