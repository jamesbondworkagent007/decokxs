package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lxw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31621lxw extends AbstractC31619lxu {
    public static final android.util.SparseIntArray djBIcL;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long AhwBna;
    public final android.widget.LinearLayout isConnected;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        djBIcL = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.Qsauvs, 1);
        sparseIntArray.put(C31351lsQ.Application.DeEinT, 2);
        sparseIntArray.put(C31351lsQ.Application.gdLjtZ, 3);
        sparseIntArray.put(C31351lsQ.Application.hcetpZ, 4);
        sparseIntArray.put(C31351lsQ.Application.HJWChPHhYHK, 5);
        sparseIntArray.put(C31351lsQ.Application.OxbLUn, 6);
        sparseIntArray.put(C31351lsQ.Application.dSJNDS, 7);
    }

    public C31621lxw(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, gEmmrt, djBIcL));
    }

    public C31621lxw(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[4], (C52794wYp) objArr[3], (C52794wYp) objArr[5], (C52794wYp) objArr[6], (C52794wYp) objArr[1], (C52794wYp) objArr[2], (C52794wYp) objArr[7]);
        this.AhwBna = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.isConnected = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AhwBna != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
    }
}
