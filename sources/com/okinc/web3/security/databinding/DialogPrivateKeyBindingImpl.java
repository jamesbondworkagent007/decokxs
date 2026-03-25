package com.okinc.web3.security.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C52794wYp;
import o.C57407yho;

/* JADX INFO: loaded from: classes12.dex */
public class DialogPrivateKeyBindingImpl extends DialogPrivateKeyBinding {
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
        sparseIntArray.put(C57407yho.Application.AxsJAY, 1);
        sparseIntArray.put(C57407yho.Application.QOLQEE, 2);
        sparseIntArray.put(C57407yho.Application.getPostValueLengthLimit, 3);
        sparseIntArray.put(C57407yho.Application.ffGIBT, 4);
        sparseIntArray.put(C57407yho.Application.zsXlph, 5);
        sparseIntArray.put(C57407yho.Application.AubY, 6);
        sparseIntArray.put(C57407yho.Application.RKDWNf, 7);
        sparseIntArray.put(C57407yho.Application.QkdxfA, 8);
        sparseIntArray.put(C57407yho.Application.valueOf, 9);
        sparseIntArray.put(C57407yho.Application.AEQbTJ, 10);
    }

    public DialogPrivateKeyBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, sIncludes, sViewsWithIds));
    }

    private DialogPrivateKeyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[10], (C52794wYp) objArr[9], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[6], (ConstraintLayout) objArr[1], (ImageView) objArr[2], (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[8], (TextView) objArr[7]);
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
