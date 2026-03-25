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
import o.C52794wYp;
import o.C57407yho;

/* JADX INFO: loaded from: classes12.dex */
public abstract class DialogPrivateKeyBinding extends ViewDataBinding {
    public final C52794wYp btnCopy;
    public final C52794wYp btnNotCopy;
    public final AppCompatImageView ivClose;
    public final AppCompatImageView ivInfo;
    public final ConstraintLayout layoutTitle;
    public final ImageView logo;
    public final TextView tvAddress;
    public final TextView tvName;
    public final TextView tvPrivateKey;
    public final TextView tvTip;

    public DialogPrivateKeyBinding(Object obj, View view, int i, C52794wYp c52794wYp, C52794wYp c52794wYp2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.btnCopy = c52794wYp;
        this.btnNotCopy = c52794wYp2;
        this.ivClose = appCompatImageView;
        this.ivInfo = appCompatImageView2;
        this.layoutTitle = constraintLayout;
        this.logo = imageView;
        this.tvAddress = textView;
        this.tvName = textView2;
        this.tvPrivateKey = textView3;
        this.tvTip = textView4;
    }

    public static DialogPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (DialogPrivateKeyBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.EZpvd, viewGroup, z, obj);
    }

    public static DialogPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DialogPrivateKeyBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.EZpvd, null, false, obj);
    }

    public static DialogPrivateKeyBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogPrivateKeyBinding bind(@NonNull View view, @Nullable Object obj) {
        return (DialogPrivateKeyBinding) ViewDataBinding.bind(obj, view, C57407yho.StateListAnimator.EZpvd);
    }
}
