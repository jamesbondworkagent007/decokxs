package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout;
import com.okinc.web3.security.features.importing.widget.WalletImportInputNestedScrollView;
import o.C33537myN;
import o.C52794wYp;
import o.C57407yho;
import o.wYF;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ActivityWeb3SecurityWalletImportBinding extends ViewDataBinding {
    public final C33537myN appBar;
    public final C52794wYp clear;
    public final wYF confirm;
    public final TextView errorMessage;
    public final WalletImportDataInputLayout importDataInput;
    public final C52794wYp paste;
    public final WalletImportInputNestedScrollView scrollView;
    public final RecyclerView suggestedWords;
    public final FrameLayout suggestedWordsArea;
    public final TextView title;
    public final TextView tvSeedPhrasePrompt;

    public ActivityWeb3SecurityWalletImportBinding(Object obj, View view, int i, C33537myN c33537myN, C52794wYp c52794wYp, wYF wyf, TextView textView, WalletImportDataInputLayout walletImportDataInputLayout, C52794wYp c52794wYp2, WalletImportInputNestedScrollView walletImportInputNestedScrollView, RecyclerView recyclerView, FrameLayout frameLayout, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.appBar = c33537myN;
        this.clear = c52794wYp;
        this.confirm = wyf;
        this.errorMessage = textView;
        this.importDataInput = walletImportDataInputLayout;
        this.paste = c52794wYp2;
        this.scrollView = walletImportInputNestedScrollView;
        this.suggestedWords = recyclerView;
        this.suggestedWordsArea = frameLayout;
        this.title = textView2;
        this.tvSeedPhrasePrompt = textView3;
    }

    public static ActivityWeb3SecurityWalletImportBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityWeb3SecurityWalletImportBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ActivityWeb3SecurityWalletImportBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.OLrzqt, viewGroup, z, obj);
    }

    public static ActivityWeb3SecurityWalletImportBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityWeb3SecurityWalletImportBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityWeb3SecurityWalletImportBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.OLrzqt, null, false, obj);
    }

    public static ActivityWeb3SecurityWalletImportBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityWeb3SecurityWalletImportBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ActivityWeb3SecurityWalletImportBinding) ViewDataBinding.bind(obj, view, C57407yho.StateListAnimator.OLrzqt);
    }
}
