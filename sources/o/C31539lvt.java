package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31539lvt extends AbstractC31537lvr {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
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
        sparseIntArray.put(C31351lsQ.Application.Ufzxmz, 1);
        sparseIntArray.put(C31351lsQ.Application.fVjYLc, 2);
        sparseIntArray.put(C31351lsQ.Application.QSLkRj, 3);
        sparseIntArray.put(C31351lsQ.Application.GiPPlLQAswws, 4);
        sparseIntArray.put(C31351lsQ.Application.AxsJAY, 5);
        sparseIntArray.put(C31351lsQ.Application.DPHOMC, 6);
        sparseIntArray.put(C31351lsQ.Application.OAUGar, 7);
        sparseIntArray.put(C31351lsQ.Application.UCQKYV, 8);
        sparseIntArray.put(C31351lsQ.Application.cBPFI, 9);
        sparseIntArray.put(C31351lsQ.Application.OqCbbx, 10);
        sparseIntArray.put(C31351lsQ.Application.gGNlxh, 11);
    }

    public C31539lvt(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, AkhnZx, fetchVPNInfo));
    }

    public C31539lvt(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[3], (androidx.appcompat.widget.Toolbar) objArr[1], (ConstraintLayout) objArr[9], (android.widget.ImageView) objArr[6], (ConstraintLayout) objArr[0], (C52794wYp) objArr[11], (wYC) objArr[2], (android.widget.ScrollView) objArr[4], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[7]);
        this.DbNXlk = -1L;
        this.AYXKKw.setTag(null);
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
