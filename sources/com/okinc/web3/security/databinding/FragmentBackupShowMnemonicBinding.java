package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.web3.security.view.MnemonicView;
import o.C52794wYp;
import o.C57407yho;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FragmentBackupShowMnemonicBinding extends ViewDataBinding {
    public final ConstraintLayout clContent;
    public final C52794wYp continueButton;
    public final ImageView ivMask;
    public final AppCompatImageView ivMaskEye;
    public final LinearLayoutCompat llBottom;
    public final LinearLayoutCompat llMaskContentText;
    public final MnemonicView mnemonicView;
    public final C52794wYp obHide;
    public final TextView tvDescription;
    public final AppCompatTextView tvMaskContent;
    public final TextView tvTitle;

    public FragmentBackupShowMnemonicBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, C52794wYp c52794wYp, ImageView imageView, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, MnemonicView mnemonicView, C52794wYp c52794wYp2, TextView textView, AppCompatTextView appCompatTextView, TextView textView2) {
        super(obj, view, i);
        this.clContent = constraintLayout;
        this.continueButton = c52794wYp;
        this.ivMask = imageView;
        this.ivMaskEye = appCompatImageView;
        this.llBottom = linearLayoutCompat;
        this.llMaskContentText = linearLayoutCompat2;
        this.mnemonicView = mnemonicView;
        this.obHide = c52794wYp2;
        this.tvDescription = textView;
        this.tvMaskContent = appCompatTextView;
        this.tvTitle = textView2;
    }

    public static FragmentBackupShowMnemonicBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBackupShowMnemonicBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (FragmentBackupShowMnemonicBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.AYXKKw, viewGroup, z, obj);
    }

    public static FragmentBackupShowMnemonicBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBackupShowMnemonicBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentBackupShowMnemonicBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.AYXKKw, null, false, obj);
    }

    public static FragmentBackupShowMnemonicBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBackupShowMnemonicBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentBackupShowMnemonicBinding) ViewDataBinding.bind(obj, view, C57407yho.StateListAnimator.AYXKKw);
    }
}
