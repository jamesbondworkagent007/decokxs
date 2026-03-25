package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lxm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31611lxm extends AbstractC31610lxl {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final ConstraintLayout AkhnZx;
    public long DbNXlk;

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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.GqbzPL, 1);
        sparseIntArray.put(C31351lsQ.Application.aUsmxb, 2);
        sparseIntArray.put(C31351lsQ.Application.GiPPlLgiPPlL, 3);
        sparseIntArray.put(C31351lsQ.Application.Dff, 4);
        sparseIntArray.put(C31351lsQ.Application.RhjxDW, 5);
        sparseIntArray.put(C31351lsQ.Application.ORmwhf, 6);
        sparseIntArray.put(C31351lsQ.Application.gCNefq, 7);
        sparseIntArray.put(C31351lsQ.Application.TarCU, 8);
        sparseIntArray.put(C31351lsQ.Application.copydefault, 9);
    }

    public C31611lxm(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, valueOf, fetchVPNInfo));
    }

    public C31611lxm(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[9], (C52794wYp) objArr[2], (ConstraintLayout) objArr[8], (ConstraintLayout) objArr[1], (C52794wYp) objArr[3], (ConstraintLayout) objArr[4], (C52794wYp) objArr[5], (C52794wYp) objArr[7], (ConstraintLayout) objArr[6]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
