package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C55113xdn;
import o.C57407yho;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Web3SecurityLoadingLayoutBinding extends ViewDataBinding {
    public final C55113xdn loadingView;

    public Web3SecurityLoadingLayoutBinding(Object obj, View view, int i, C55113xdn c55113xdn) {
        super(obj, view, i);
        this.loadingView = c55113xdn;
    }

    public static Web3SecurityLoadingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static Web3SecurityLoadingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (Web3SecurityLoadingLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.fARcdN, viewGroup, z, obj);
    }

    public static Web3SecurityLoadingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static Web3SecurityLoadingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (Web3SecurityLoadingLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.fARcdN, null, false, obj);
    }

    public static Web3SecurityLoadingLayoutBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static Web3SecurityLoadingLayoutBinding bind(@NonNull View view, @Nullable Object obj) {
        return (Web3SecurityLoadingLayoutBinding) ViewDataBinding.bind(obj, view, C57407yho.StateListAnimator.fARcdN);
    }
}
