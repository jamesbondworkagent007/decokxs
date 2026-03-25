package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C33537myN;
import o.C57407yho;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ActivityBackupShowMnemonicBinding extends ViewDataBinding {
    public final C33537myN appBar;
    public final FrameLayout container;
    public final AppCompatImageView ivTip;

    public ActivityBackupShowMnemonicBinding(Object obj, View view, int i, C33537myN c33537myN, FrameLayout frameLayout, AppCompatImageView appCompatImageView) {
        super(obj, view, i);
        this.appBar = c33537myN;
        this.container = frameLayout;
        this.ivTip = appCompatImageView;
    }

    public static ActivityBackupShowMnemonicBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBackupShowMnemonicBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ActivityBackupShowMnemonicBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.AEQbTJ, viewGroup, z, obj);
    }

    public static ActivityBackupShowMnemonicBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBackupShowMnemonicBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityBackupShowMnemonicBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.AEQbTJ, null, false, obj);
    }

    public static ActivityBackupShowMnemonicBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBackupShowMnemonicBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ActivityBackupShowMnemonicBinding) ViewDataBinding.bind(obj, view, C57407yho.StateListAnimator.AEQbTJ);
    }
}
