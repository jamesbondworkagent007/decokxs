package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C55251xgS;
import o.C57407yho;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ItemCollisionBinding extends ViewDataBinding {
    public final ImageView arror;
    public final TextView description;
    public final ImageView img;
    public final C55251xgS tag;
    public final TextView title;

    public ItemCollisionBinding(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2, C55251xgS c55251xgS, TextView textView2) {
        super(obj, view, i);
        this.arror = imageView;
        this.description = textView;
        this.img = imageView2;
        this.tag = c55251xgS;
        this.title = textView2;
    }

    public static ItemCollisionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCollisionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ItemCollisionBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.isConnected, viewGroup, z, obj);
    }

    public static ItemCollisionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCollisionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCollisionBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.isConnected, null, false, obj);
    }

    public static ItemCollisionBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCollisionBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemCollisionBinding) ViewDataBinding.bind(obj, view, C57407yho.StateListAnimator.isConnected);
    }
}
