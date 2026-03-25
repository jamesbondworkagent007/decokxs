package com.okinc.web3.security.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C57407yho;
import o.wYF;

/* JADX INFO: loaded from: classes12.dex */
public class FragmentCopyPrivateKeyProtectBindingImpl extends FragmentCopyPrivateKeyProtectBinding {
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
        sparseIntArray.put(C57407yho.Application.ejfBZ, 1);
        sparseIntArray.put(C57407yho.Application.fvQaOB, 2);
        sparseIntArray.put(C57407yho.Application.gasjUx, 3);
        sparseIntArray.put(C57407yho.Application.OcIXYQ, 4);
        sparseIntArray.put(C57407yho.Application.AxsJAYaxsJAY, 5);
        sparseIntArray.put(C57407yho.Application.iZzfmt, 6);
        sparseIntArray.put(C57407yho.Application.hUfVAv, 7);
        sparseIntArray.put(C57407yho.Application.accept, 8);
        sparseIntArray.put(C57407yho.Application.DAIeex, 9);
        sparseIntArray.put(C57407yho.Application.AxsJAYsNCnLh, 10);
        sparseIntArray.put(C57407yho.Application.gEmmrt, 11);
    }

    public FragmentCopyPrivateKeyProtectBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    private FragmentCopyPrivateKeyProtectBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYF) objArr[11], (ImageView) objArr[1], (LinearLayoutCompat) objArr[4], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[5], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[10]);
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
