package com.okinc.web3.security.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.web3.security.BR;
import com.okinc.web3.security.model.PrivateKeyInfo;
import o.C52794wYp;
import o.C55251xgS;
import o.C57407yho;
import o.C57440yiU;

/* JADX INFO: loaded from: classes12.dex */
public class ItemBackupPrivateKeyBindingImpl extends ItemBackupPrivateKeyBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.web3.security.databinding.ItemBackupPrivateKeyBinding
    public void setPrivateKeyInfo(@Nullable PrivateKeyInfo privateKeyInfo) {
        this.mPrivateKeyInfo = privateKeyInfo;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C57407yho.Application.djBIcL, 1);
        sparseIntArray.put(C57407yho.Application.uzCIH, 2);
        sparseIntArray.put(C57407yho.Application.iRxXKY, 3);
        sparseIntArray.put(C57407yho.Application.fFgQHt, 4);
        sparseIntArray.put(C57407yho.Application.RlQdEF, 5);
        sparseIntArray.put(C57407yho.Application.QbewEr, 6);
        sparseIntArray.put(C57407yho.Application.flVtFt, 7);
        sparseIntArray.put(C57407yho.Application.getFieldNames, 8);
        sparseIntArray.put(C57407yho.Application.OqFWZa, 9);
        sparseIntArray.put(C57407yho.Application.fZBcTu, 10);
        sparseIntArray.put(C57407yho.Application.AwvSrB, 11);
        sparseIntArray.put(C57407yho.Application.AuCTelauCTel, 12);
        sparseIntArray.put(C57407yho.Application.DCJXGO, 13);
        sparseIntArray.put(C57407yho.Application.QUSxYX, 14);
        sparseIntArray.put(C57407yho.Application.QKudOq, 15);
        sparseIntArray.put(C57407yho.Application.EZpvd, 16);
        sparseIntArray.put(C57407yho.Application.DTwDnp, 17);
    }

    public ItemBackupPrivateKeyBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, sIncludes, sViewsWithIds));
    }

    private ItemBackupPrivateKeyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Group) objArr[16], (ConstraintLayout) objArr[1], (AppCompatImageView) objArr[8], (ImageView) objArr[2], (ImageView) objArr[12], (LinearLayoutCompat) objArr[11], (Group) objArr[17], (C52794wYp) objArr[14], (C57440yiU) objArr[6], (ShapeableImageView) objArr[10], (C55251xgS) objArr[4], (C55251xgS) objArr[7], (TextView) objArr[3], (TextView) objArr[5], (C52794wYp) objArr[15], (TextView) objArr[9], (TextView) objArr[13]);
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
            this.mDirtyFlags = 2L;
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
    public boolean setVariable(int i, @Nullable Object obj) {
        if (BR.privateKeyInfo != i) {
            return false;
        }
        setPrivateKeyInfo((PrivateKeyInfo) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }
}
