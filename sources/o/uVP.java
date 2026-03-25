package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uVP extends uVN {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray DbNXlk;
    public long values;

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
        sparseIntArray.put(C48033uCm.Application.DdI, 1);
        sparseIntArray.put(C48033uCm.Application.launchUnitdefault, 2);
        sparseIntArray.put(C48033uCm.Application.launchdefault, 3);
        sparseIntArray.put(C48033uCm.Application.getQueue, 4);
        sparseIntArray.put(C48033uCm.Application.getPackageName, 5);
        sparseIntArray.put(C48033uCm.Application.target, 6);
        sparseIntArray.put(C48033uCm.Application.onRepeatModeChanged, 7);
        sparseIntArray.put(C48033uCm.Application.AnimatorRes, 8);
        sparseIntArray.put(C48033uCm.Application.openFileOutput, 9);
        sparseIntArray.put(C48033uCm.Application.sjbWxX, 10);
        sparseIntArray.put(C48033uCm.Application.dxTXDv, 11);
    }

    public uVP(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, AkhnZx, DbNXlk));
    }

    public uVP(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[1], (LinearLayoutCompat) objArr[9], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[10], (C47988uAv) objArr[7], (C55258xgZ) objArr[4], (android.widget.TextView) objArr[5], (NestedScrollView) objArr[0], (C55258xgZ) objArr[2], (C47988uAv) objArr[3], (vKO) objArr[8], (android.widget.TextView) objArr[6]);
        this.values = -1L;
        this.djBIcL.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
