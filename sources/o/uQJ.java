package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uQJ extends uQL {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public long getFieldNames;
    public final ConstraintLayout hDKMBd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.uQL
    public void EZpvd(@androidx.annotation.Nullable C55915xsu c55915xsu) {
        this.isConnected = c55915xsu;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AuCTel = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.IResultReceiver2StubProxy, 1);
        sparseIntArray.put(C48033uCm.Application.gbIfDn, 2);
        sparseIntArray.put(C48033uCm.Application.GFUIi, 3);
        sparseIntArray.put(C48033uCm.Application.UJEglR, 4);
        sparseIntArray.put(C48033uCm.Application.attachBaseContext, 5);
        sparseIntArray.put(C48033uCm.Application.setPageName, 6);
        sparseIntArray.put(C48033uCm.Application.OxVOHk, 7);
        sparseIntArray.put(C48033uCm.Application.DaRZkR, 8);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 9);
        sparseIntArray.put(C48033uCm.Application.ICustomTabsCallbackDefault, 10);
        sparseIntArray.put(C48033uCm.Application.asBinder, 11);
        sparseIntArray.put(C48033uCm.Application.getDisplayOptions, 12);
        sparseIntArray.put(C48033uCm.Application.shouldAnimateContextView, 13);
        sparseIntArray.put(C48033uCm.Application.setHasEmbeddedTabs, 14);
        sparseIntArray.put(C48033uCm.Application.configureTab, 15);
        sparseIntArray.put(C48033uCm.Application.onRelationshipValidationResult, 16);
        sparseIntArray.put(C48033uCm.Application.getMinimumWidth, 17);
    }

    public uQJ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, fJNWhG, AuCTel));
    }

    public uQJ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (uBL) objArr[7], (C53605woe) objArr[8], (C47988uAv) objArr[6], (C53477wmI) objArr[4], (C53487wmS) objArr[3], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[11], (ConstraintLayout) objArr[10], (C53534wnM) objArr[1], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[5], (C55258xgZ) objArr[15], (android.widget.TextView) objArr[14], (ConstraintLayout) objArr[13], (C54154wyx) objArr[17]);
        this.getFieldNames = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.hDKMBd = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getFieldNames = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getFieldNames != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C48034uCn.OLrzqt != i) {
            return false;
        }
        EZpvd((C55915xsu) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getFieldNames = 0L;
        }
    }
}
