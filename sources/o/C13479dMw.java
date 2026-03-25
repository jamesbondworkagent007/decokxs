package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.dLX;

/* JADX INFO: renamed from: o.dMw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C13479dMw extends dMA {
    public static final ViewDataBinding.IncludedLayouts AuCTel = null;
    public static final android.util.SparseIntArray iwGUEr;
    public long hDKMBd;

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
        iwGUEr = sparseIntArray;
        sparseIntArray.put(dLX.Application.zuBGHE, 1);
        sparseIntArray.put(dLX.Application.AxsJAYsNCnLh, 2);
        sparseIntArray.put(dLX.Application.copydefault, 3);
        sparseIntArray.put(dLX.Application.AxsJAY, 4);
        sparseIntArray.put(dLX.Application.DBxZfM, 5);
        sparseIntArray.put(dLX.Application.OFhtUX, 6);
        sparseIntArray.put(dLX.Application.QwvEab, 7);
        sparseIntArray.put(dLX.Application.zblBkD, 8);
        sparseIntArray.put(dLX.Application.DWgRXt, 9);
        sparseIntArray.put(dLX.Application.UrRBLY, 10);
        sparseIntArray.put(dLX.Application.ODXsMY, 11);
        sparseIntArray.put(dLX.Application.hrNTAI, 12);
        sparseIntArray.put(dLX.Application.RKDWNf, 13);
        sparseIntArray.put(dLX.Application.QkdxfA, 14);
        sparseIntArray.put(dLX.Application.QHmsKR, 15);
        sparseIntArray.put(dLX.Application.dxcTrN, 16);
        sparseIntArray.put(dLX.Application.QbewEr, 17);
        sparseIntArray.put(dLX.Application.AubY, 18);
    }

    public C13479dMw(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, AuCTel, iwGUEr));
    }

    public C13479dMw(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[3], (android.widget.LinearLayout) objArr[18], (wYC) objArr[4], (android.widget.FrameLayout) objArr[0], (android.widget.LinearLayout) objArr[1], (android.widget.LinearLayout) objArr[17], (android.widget.LinearLayout) objArr[16], (wYC) objArr[2], (android.widget.LinearLayout) objArr[13], (wYC) objArr[14], (android.widget.TextView) objArr[15], (android.widget.LinearLayout) objArr[6], (android.widget.LinearLayout) objArr[11], (android.widget.TextView) objArr[12], (android.widget.LinearLayout) objArr[7], (android.widget.LinearLayout) objArr[8], (android.widget.LinearLayout) objArr[9], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[5]);
        this.hDKMBd = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.hDKMBd = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.hDKMBd != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.hDKMBd = 0L;
        }
    }
}
