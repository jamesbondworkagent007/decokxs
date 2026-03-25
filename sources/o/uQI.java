package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uQI extends uQM {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public final android.widget.LinearLayout fetchVPNInfo;
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
        sparseIntArray.put(C48033uCm.Application.get, 1);
        sparseIntArray.put(C48033uCm.Application.ColorLong, 2);
        sparseIntArray.put(C48033uCm.Application.getMetadata, 3);
        sparseIntArray.put(C48033uCm.Application.fastForward, 4);
        sparseIntArray.put(C48033uCm.Application.GVpNrsfQMcgE, 5);
        sparseIntArray.put(C48033uCm.Application.setHideOffset, 6);
        sparseIntArray.put(C48033uCm.Application.hCLrkq, 7);
        sparseIntArray.put(C48033uCm.Application.setRepeatMode, 8);
        sparseIntArray.put(C48033uCm.Application.wlaJM, 9);
    }

    public uQI(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, djBIcL, DbNXlk));
    }

    public uQI(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C53095wey) objArr[9], (C53539wnR) objArr[7], (C53056weL) objArr[5], (C49924uxi) objArr[4], (wUP) objArr[3], (C53539wnR) objArr[8], (C49861uwY) objArr[1], (ConstraintLayout) objArr[2], (uBL) objArr[6]);
        this.values = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fetchVPNInfo = linearLayout;
        linearLayout.setTag(null);
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
