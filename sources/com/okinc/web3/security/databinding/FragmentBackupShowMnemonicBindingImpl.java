package com.okinc.web3.security.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.web3.security.view.MnemonicView;
import o.C52794wYp;
import o.C57407yho;

/* JADX INFO: loaded from: classes12.dex */
public class FragmentBackupShowMnemonicBindingImpl extends FragmentBackupShowMnemonicBinding {
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
        sparseIntArray.put(C57407yho.Application.djBIcL, 1);
        sparseIntArray.put(C57407yho.Application.DXXBbs, 2);
        sparseIntArray.put(C57407yho.Application.ODWQjV, 3);
        sparseIntArray.put(C57407yho.Application.ORxRYg, 4);
        sparseIntArray.put(C57407yho.Application.QfsBiF, 5);
        sparseIntArray.put(C57407yho.Application.wlaJM, 6);
        sparseIntArray.put(C57407yho.Application.sSMYrx, 7);
        sparseIntArray.put(C57407yho.Application.AuCTelauCTel, 8);
        sparseIntArray.put(C57407yho.Application.DarRvM, 9);
        sparseIntArray.put(C57407yho.Application.gHZMYf, 10);
        sparseIntArray.put(C57407yho.Application.AkhnZx, 11);
    }

    public FragmentBackupShowMnemonicBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    private FragmentBackupShowMnemonicBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[1], (C52794wYp) objArr[11], (ImageView) objArr[6], (AppCompatImageView) objArr[8], (LinearLayoutCompat) objArr[10], (LinearLayoutCompat) objArr[7], (MnemonicView) objArr[4], (C52794wYp) objArr[5], (TextView) objArr[3], (AppCompatTextView) objArr[9], (TextView) objArr[2]);
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
