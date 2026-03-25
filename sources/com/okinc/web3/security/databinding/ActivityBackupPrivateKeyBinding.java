package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C33537myN;
import o.C57407yho;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ActivityBackupPrivateKeyBinding extends ViewDataBinding {
    public final C33537myN appBar;
    public final RecyclerView recyclerView;

    public ActivityBackupPrivateKeyBinding(Object obj, View view, int i, C33537myN c33537myN, RecyclerView recyclerView) {
        super(obj, view, i);
        this.appBar = c33537myN;
        this.recyclerView = recyclerView;
    }

    public static ActivityBackupPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBackupPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ActivityBackupPrivateKeyBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.KWHzl, viewGroup, z, obj);
    }

    public static ActivityBackupPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBackupPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityBackupPrivateKeyBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.KWHzl, null, false, obj);
    }

    public static ActivityBackupPrivateKeyBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBackupPrivateKeyBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ActivityBackupPrivateKeyBinding) ViewDataBinding.bind(obj, view, C57407yho.StateListAnimator.KWHzl);
    }
}
