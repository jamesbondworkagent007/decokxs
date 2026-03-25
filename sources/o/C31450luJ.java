package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31450luJ extends AbstractC31447luG {
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public static final android.util.SparseIntArray values;
    public long DbNXlk;
    public final ConstraintLayout fetchVPNInfo;

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
        sparseIntArray.put(C31351lsQ.Application.GQzpsZgQzpsZ, 1);
        sparseIntArray.put(C31351lsQ.Application.hGuIrQ, 2);
        sparseIntArray.put(C31351lsQ.Application.fGsPTM, 3);
        sparseIntArray.put(C31351lsQ.Application.DCJXGO, 4);
        sparseIntArray.put(C31351lsQ.Application.OqFWZa, 5);
        sparseIntArray.put(C31351lsQ.Application.DXXBbs, 6);
        sparseIntArray.put(C31351lsQ.Application.ODWQjV, 7);
        sparseIntArray.put(C31351lsQ.Application.RKcVTr, 8);
        sparseIntArray.put(C31351lsQ.Application.RVsVBY, 9);
        sparseIntArray.put(C31351lsQ.Application.DsrFlB, 10);
        sparseIntArray.put(C31351lsQ.Application.QXDzTk, 11);
    }

    public C31450luJ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, isConnected, values));
    }

    public C31450luJ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[6], (ConstraintLayout) objArr[4], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[10], (ConstraintLayout) objArr[8], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[1], (ConstraintLayout) objArr[3]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
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
