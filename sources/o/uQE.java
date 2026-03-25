package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uQE extends uQH {
    public static final android.util.SparseIntArray zLjUOn;
    public static final ViewDataBinding.IncludedLayouts zsXlph = null;
    public long AubY;
    public final NestedScrollView sSMYrx;

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
        zLjUOn = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.UPzgla, 1);
        sparseIntArray.put(C48033uCm.Application.OYuSWK, 2);
        sparseIntArray.put(C48033uCm.Application.m, 3);
        sparseIntArray.put(C48033uCm.Application.openFileOutput, 4);
        sparseIntArray.put(C48033uCm.Application.WFXFk, 5);
        sparseIntArray.put(C48033uCm.Application.shErWi, 6);
        sparseIntArray.put(C48033uCm.Application.zSsVtY, 7);
        sparseIntArray.put(C48033uCm.Application.OWSZPf, 8);
        sparseIntArray.put(C48033uCm.Application.getLabel, 9);
        sparseIntArray.put(C48033uCm.Application.DGUQLIekVPG, 10);
        sparseIntArray.put(C48033uCm.Application.fBE, 11);
        sparseIntArray.put(C48033uCm.Application.DjzMc, 12);
        sparseIntArray.put(C48033uCm.Application.f1066api, 13);
        sparseIntArray.put(C48033uCm.Application.codename, 14);
        sparseIntArray.put(C48033uCm.Application.OeawrH, 15);
        sparseIntArray.put(C48033uCm.Application.parameter, 16);
        sparseIntArray.put(C48033uCm.Application.akftKQ, 17);
        sparseIntArray.put(C48033uCm.Application.getCallback, 18);
        sparseIntArray.put(C48033uCm.Application.onSearchResult, 19);
        sparseIntArray.put(C48033uCm.Application.centerButton, 20);
        sparseIntArray.put(C48033uCm.Application.manageScrollIndicators, 21);
        sparseIntArray.put(C48033uCm.Application.getCallbacks, 22);
        sparseIntArray.put(C48033uCm.Application.AlertControllerAlertParams3, 23);
        sparseIntArray.put(C48033uCm.Application.AlertControllerButtonHandler, 24);
        sparseIntArray.put(C48033uCm.Application.parseItem, 25);
        sparseIntArray.put(C48033uCm.Application.AlertDialogBuilder, 26);
        sparseIntArray.put(C48033uCm.Application.DDNONI, 27);
    }

    public uQE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 28, zsXlph, zLjUOn));
    }

    public uQE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wUX) objArr[17], (android.widget.TextView) objArr[9], (LinearLayoutCompat) objArr[7], (android.widget.TextView) objArr[11], (LinearLayoutCompat) objArr[10], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[27], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (LinearLayoutCompat) objArr[4], (LinearLayoutCompat) objArr[12], (C53024wdg) objArr[1], (LinearLayoutCompat) objArr[19], (LinearLayoutCompat) objArr[22], (LinearLayoutCompat) objArr[18], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[21], (android.widget.TextView) objArr[23], (android.widget.TextView) objArr[24], (android.widget.TextView) objArr[26], (android.view.View) objArr[25]);
        this.AubY = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.sSMYrx = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AubY = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AubY != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AubY = 0L;
        }
    }
}
