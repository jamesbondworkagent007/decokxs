package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C57407yho;
import o.wYF;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FragmentCopyPrivateKeyProtectBinding extends ViewDataBinding {
    public final wYF btnboxCopy;
    public final ImageView headerIcon;
    public final LinearLayoutCompat llCode;
    public final TextView tip;
    public final TextView tipTitle;
    public final TextView tvCodeOutput1;
    public final TextView tvCodeOutput2;
    public final TextView tvCodeOutput3;
    public final TextView tvCodeOutput4;
    public final TextView tvCodeOutput5;
    public final TextView tvCodeOutput6;

    public FragmentCopyPrivateKeyProtectBinding(Object obj, View view, int i, wYF wyf, ImageView imageView, LinearLayoutCompat linearLayoutCompat, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        super(obj, view, i);
        this.btnboxCopy = wyf;
        this.headerIcon = imageView;
        this.llCode = linearLayoutCompat;
        this.tip = textView;
        this.tipTitle = textView2;
        this.tvCodeOutput1 = textView3;
        this.tvCodeOutput2 = textView4;
        this.tvCodeOutput3 = textView5;
        this.tvCodeOutput4 = textView6;
        this.tvCodeOutput5 = textView7;
        this.tvCodeOutput6 = textView8;
    }

    public static FragmentCopyPrivateKeyProtectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCopyPrivateKeyProtectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (FragmentCopyPrivateKeyProtectBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.valueOf, viewGroup, z, obj);
    }

    public static FragmentCopyPrivateKeyProtectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCopyPrivateKeyProtectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentCopyPrivateKeyProtectBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.valueOf, null, false, obj);
    }

    public static FragmentCopyPrivateKeyProtectBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCopyPrivateKeyProtectBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentCopyPrivateKeyProtectBinding) ViewDataBinding.bind(obj, view, C57407yho.StateListAnimator.valueOf);
    }
}
