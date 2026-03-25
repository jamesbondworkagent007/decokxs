package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import o.C57407yho;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ItemMpcPrivateKeyBinding extends ViewDataBinding {
    public final AppCompatImageView arrow;
    public final TextView chainName;
    public final ImageView icon;
    public final ImageView iconEye;
    public final ImageView iconEyeClose;
    public final ConstraintLayout itemClickView;
    public final ConstraintLayout privateKeyBaseContainer;
    public final ConstraintLayout privateKeyContainer;
    public final ShapeableImageView privateKeyProtectMask;
    public final TextView tvCoinAddress;
    public final TextView tvPrivateKey;

    public ItemMpcPrivateKeyBinding(Object obj, View view, int i, AppCompatImageView appCompatImageView, TextView textView, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ShapeableImageView shapeableImageView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.arrow = appCompatImageView;
        this.chainName = textView;
        this.icon = imageView;
        this.iconEye = imageView2;
        this.iconEyeClose = imageView3;
        this.itemClickView = constraintLayout;
        this.privateKeyBaseContainer = constraintLayout2;
        this.privateKeyContainer = constraintLayout3;
        this.privateKeyProtectMask = shapeableImageView;
        this.tvCoinAddress = textView2;
        this.tvPrivateKey = textView3;
    }

    public static ItemMpcPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMpcPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ItemMpcPrivateKeyBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.ejfBZ, viewGroup, z, obj);
    }

    public static ItemMpcPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMpcPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemMpcPrivateKeyBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.ejfBZ, null, false, obj);
    }

    public static ItemMpcPrivateKeyBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMpcPrivateKeyBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemMpcPrivateKeyBinding) ViewDataBinding.bind(obj, view, C57407yho.StateListAnimator.ejfBZ);
    }
}
