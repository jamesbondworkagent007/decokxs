package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: loaded from: classes7.dex */
public class lwZ extends AbstractC31570lwX {
    public static final android.util.SparseIntArray getFieldNames;
    public static final ViewDataBinding.IncludedLayouts uzCIH = null;
    public long iwGUEr;
    public final LinearLayoutCompat zsXlph;

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
        getFieldNames = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.HJWChPOKBmQNaCIdOM, 1);
        sparseIntArray.put(C31351lsQ.Application.xxhdY, 2);
        sparseIntArray.put(C31351lsQ.Application.spnCvw, 3);
        sparseIntArray.put(C31351lsQ.Application.RuDPQV, 4);
        sparseIntArray.put(C31351lsQ.Application.dkJJWw, 5);
        sparseIntArray.put(C31351lsQ.Application.fmdvVn, 6);
        sparseIntArray.put(C31351lsQ.Application.OeZisf, 7);
        sparseIntArray.put(C31351lsQ.Application.OeawrH, 8);
        sparseIntArray.put(C31351lsQ.Application.sEAkxl, 9);
        sparseIntArray.put(C31351lsQ.Application.invokespecialaGOrKO, 10);
        sparseIntArray.put(C31351lsQ.Application.fzHEvu, 11);
        sparseIntArray.put(C31351lsQ.Application.onStatusChanged, 12);
        sparseIntArray.put(C31351lsQ.Application.onLocationChanged, 13);
        sparseIntArray.put(C31351lsQ.Application.nriSR, 14);
        sparseIntArray.put(C31351lsQ.Application.akftKQ, 15);
        sparseIntArray.put(C31351lsQ.Application.QOeQqh, 16);
        sparseIntArray.put(C31351lsQ.Application.dGrqPl, 17);
        sparseIntArray.put(C31351lsQ.Application.onProviderDisabled, 18);
        sparseIntArray.put(C31351lsQ.Application.hwXsuq, 19);
        sparseIntArray.put(C31351lsQ.Application.HJWChPiaHEvk, 20);
        sparseIntArray.put(C31351lsQ.Application.HrMTQN, 21);
        sparseIntArray.put(C31351lsQ.Application.fGT, 22);
    }

    public lwZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 23, uzCIH, getFieldNames));
    }

    public lwZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[3], (android.view.View) objArr[15], (android.widget.ImageView) objArr[10], (android.widget.ImageView) objArr[4], (C33537myN) objArr[1], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[19], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[21], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[22], (android.widget.TextView) objArr[17], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6]);
        this.iwGUEr = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.zsXlph = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.iwGUEr = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.iwGUEr != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.iwGUEr = 0L;
        }
    }
}
