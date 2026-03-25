package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.web3.security.view.MnemonicCheckView;
import o.C52794wYp;
import o.C57407yho;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FragmentBackupCheckMnemonicBinding extends ViewDataBinding {
    public final C52794wYp complete;
    public final MnemonicCheckView mnemonicCheckView;

    public FragmentBackupCheckMnemonicBinding(Object obj, View view, int i, C52794wYp c52794wYp, MnemonicCheckView mnemonicCheckView) {
        super(obj, view, i);
        this.complete = c52794wYp;
        this.mnemonicCheckView = mnemonicCheckView;
    }

    public static FragmentBackupCheckMnemonicBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBackupCheckMnemonicBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (FragmentBackupCheckMnemonicBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.djBIcL, viewGroup, z, obj);
    }

    public static FragmentBackupCheckMnemonicBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBackupCheckMnemonicBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentBackupCheckMnemonicBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.djBIcL, null, false, obj);
    }

    public static FragmentBackupCheckMnemonicBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBackupCheckMnemonicBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentBackupCheckMnemonicBinding) ViewDataBinding.bind(obj, view, C57407yho.StateListAnimator.djBIcL);
    }
}
