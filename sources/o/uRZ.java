package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uRZ extends uRY {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray isConnected;
    public final android.widget.LinearLayout AkhnZx;
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
        isConnected = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.setMediaId, 1);
        sparseIntArray.put(C48033uCm.Application.zDGrpR, 2);
        sparseIntArray.put(C48033uCm.Application.hkDICb, 3);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImpl7, 4);
        sparseIntArray.put(C48033uCm.Application.IIEbr, 5);
        sparseIntArray.put(C48033uCm.Application.startAsSupportActionMode, 6);
        sparseIntArray.put(C48033uCm.Application.OqIZjC, 7);
        sparseIntArray.put(C48033uCm.Application.getApplyableNightMode, 8);
        sparseIntArray.put(C48033uCm.Application.hOMIpD, 9);
    }

    public uRZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, gEmmrt, isConnected));
    }

    public uRZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYF) objArr[9], (AppCompatTextView) objArr[2], (C55258xgZ) objArr[7], (C47988uAv) objArr[5], (C47980uAn) objArr[3], (C55372xih) objArr[1], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[6]);
        this.DbNXlk = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AkhnZx = linearLayout;
        linearLayout.setTag(null);
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
