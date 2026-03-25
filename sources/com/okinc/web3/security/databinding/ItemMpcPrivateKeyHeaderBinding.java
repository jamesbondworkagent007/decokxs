package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C57407yho;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ItemMpcPrivateKeyHeaderBinding extends ViewDataBinding {
    public ItemMpcPrivateKeyHeaderBinding(Object obj, View view, int i) {
        super(obj, view, i);
    }

    public static ItemMpcPrivateKeyHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMpcPrivateKeyHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ItemMpcPrivateKeyHeaderBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.AuCTel, viewGroup, z, obj);
    }

    public static ItemMpcPrivateKeyHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMpcPrivateKeyHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemMpcPrivateKeyHeaderBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.AuCTel, null, false, obj);
    }

    public static ItemMpcPrivateKeyHeaderBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMpcPrivateKeyHeaderBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemMpcPrivateKeyHeaderBinding) ViewDataBinding.bind(obj, view, C57407yho.StateListAnimator.AuCTel);
    }
}
