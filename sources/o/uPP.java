package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uPP extends uPR {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray DbNXlk;
    public long fetchVPNInfo;
    public final ConstraintLayout values;

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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.r8lambdaSjF4PZlnE9fmKbolD64Sz5ghy6c, 1);
        sparseIntArray.put(C48033uCm.Application.OqhRBMiKdSzF, 2);
        sparseIntArray.put(C48033uCm.Application.FullyDrawnReporterOwner, 3);
        sparseIntArray.put(C48033uCm.Application.OtZEmZ, 4);
        sparseIntArray.put(C48033uCm.Application.stopBehavioSecDataCollection, 5);
        sparseIntArray.put(C48033uCm.Application.resultCodeToString, 6);
        sparseIntArray.put(C48033uCm.Application.RvdRAu, 7);
        sparseIntArray.put(C48033uCm.Application.QhsCdEQhsCdE, 8);
        sparseIntArray.put(C48033uCm.Application.createFromXmlInner, 9);
    }

    public uPP(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, AYXKKw, DbNXlk));
    }

    public uPP(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[7], (Group) objArr[5], (android.widget.ImageView) objArr[2], (android.widget.ImageView) objArr[4], (C33604mzb) objArr[8], (android.widget.ImageView) objArr[3], (C33546myW) objArr[6], (AppCompatTextView) objArr[1], (C55113xdn) objArr[9]);
        this.fetchVPNInfo = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
