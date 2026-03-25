package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31504lvK extends AbstractC31502lvI {
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public static final android.util.SparseIntArray values;
    public long DbNXlk;
    public final ConstraintLayout ejfBZ;

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
        values = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.QsIRgs, 1);
        sparseIntArray.put(C31351lsQ.Application.fXYAwm, 2);
        sparseIntArray.put(C31351lsQ.Application.resume, 3);
        sparseIntArray.put(C31351lsQ.Application.zqTOFw, 4);
        sparseIntArray.put(C31351lsQ.Application.zlvcHA, 5);
        sparseIntArray.put(C31351lsQ.Application.zhUgOk, 6);
        sparseIntArray.put(C31351lsQ.Application.zYHWMc, 7);
        sparseIntArray.put(C31351lsQ.Application.djBIcL, 8);
        sparseIntArray.put(C31351lsQ.Application.AYXKKw, 9);
        sparseIntArray.put(C31351lsQ.Application.ORxRYg, 10);
        sparseIntArray.put(C31351lsQ.Application.AhwBna, 11);
        sparseIntArray.put(C31351lsQ.Application.iWlNch, 12);
    }

    public C31504lvK(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, isConnected, values));
    }

    public C31504lvK(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[9], (android.widget.TextView) objArr[8], (C52794wYp) objArr[11], (ConstraintLayout) objArr[10], (android.widget.TextView) objArr[6], (ConstraintLayout) objArr[5], (android.widget.ImageView) objArr[7], (android.widget.TextView) objArr[4], (android.widget.ImageView) objArr[2], (android.widget.TextView) objArr[3], (ConstraintLayout) objArr[1], (C52794wYp) objArr[12]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ejfBZ = constraintLayout;
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
