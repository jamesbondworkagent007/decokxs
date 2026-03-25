package com.okinc.web3.security.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import o.C57407yho;

/* JADX INFO: loaded from: classes12.dex */
public class ItemMpcPrivateKeyBindingImpl extends ItemMpcPrivateKeyBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;

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
        sparseIntArray.put(C57407yho.Application.iwGUEr, 1);
        sparseIntArray.put(C57407yho.Application.AuCTel, 2);
        sparseIntArray.put(C57407yho.Application.AhwBna, 3);
        sparseIntArray.put(C57407yho.Application.RlQdEF, 4);
        sparseIntArray.put(C57407yho.Application.OLrzqt, 5);
        sparseIntArray.put(C57407yho.Application.aKErDB, 6);
        sparseIntArray.put(C57407yho.Application.RcXXUw, 7);
        sparseIntArray.put(C57407yho.Application.QkdxfA, 8);
        sparseIntArray.put(C57407yho.Application.fJNWhG, 9);
        sparseIntArray.put(C57407yho.Application.dNCPSb, 10);
        sparseIntArray.put(C57407yho.Application.fIwbmz, 11);
    }

    public ItemMpcPrivateKeyBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    private ItemMpcPrivateKeyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[5], (TextView) objArr[3], (ImageView) objArr[2], (ImageView) objArr[9], (ImageView) objArr[11], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[7], (ConstraintLayout) objArr[6], (ShapeableImageView) objArr[10], (TextView) objArr[4], (TextView) objArr[8]);
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
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
