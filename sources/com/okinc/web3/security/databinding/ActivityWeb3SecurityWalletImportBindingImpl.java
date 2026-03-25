package com.okinc.web3.security.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout;
import com.okinc.web3.security.features.importing.widget.WalletImportInputNestedScrollView;
import o.C33537myN;
import o.C52794wYp;
import o.C57407yho;
import o.wYF;

/* JADX INFO: loaded from: classes12.dex */
public class ActivityWeb3SecurityWalletImportBindingImpl extends ActivityWeb3SecurityWalletImportBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C57407yho.Application.KWHzl, 1);
        sparseIntArray.put(C57407yho.Application.dvKsVJ, 2);
        sparseIntArray.put(C57407yho.Application.gGvvIC, 3);
        sparseIntArray.put(C57407yho.Application.getNewProxyInstance, 4);
        sparseIntArray.put(C57407yho.Application.values, 5);
        sparseIntArray.put(C57407yho.Application.QVAiDq, 6);
        sparseIntArray.put(C57407yho.Application.AYXKKw, 7);
        sparseIntArray.put(C57407yho.Application.fetchVPNInfo, 8);
        sparseIntArray.put(C57407yho.Application.finit, 9);
        sparseIntArray.put(C57407yho.Application.dxcTrN, 10);
        sparseIntArray.put(C57407yho.Application.QSBOWP, 11);
    }

    public ActivityWeb3SecurityWalletImportBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    private ActivityWeb3SecurityWalletImportBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C52794wYp) objArr[7], (wYF) objArr[8], (TextView) objArr[5], (WalletImportDataInputLayout) objArr[4], (C52794wYp) objArr[6], (WalletImportInputNestedScrollView) objArr[2], (RecyclerView) objArr[10], (FrameLayout) objArr[9], (TextView) objArr[3], (TextView) objArr[11]);
        this.mDirtyFlags = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.mDirtyFlags != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }
}
