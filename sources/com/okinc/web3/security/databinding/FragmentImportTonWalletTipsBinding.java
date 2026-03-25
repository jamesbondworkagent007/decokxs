package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57407yho;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentImportTonWalletTipsBinding implements ViewBinding {
    private final NestedScrollView rootView;
    public final AppCompatTextView title;
    public final AppCompatImageView warning;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    private FragmentImportTonWalletTipsBinding(@NonNull NestedScrollView nestedScrollView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatImageView appCompatImageView) {
        this.rootView = nestedScrollView;
        this.title = appCompatTextView;
        this.warning = appCompatImageView;
    }

    public static FragmentImportTonWalletTipsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentImportTonWalletTipsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C57407yho.StateListAnimator.gEmmrt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentImportTonWalletTipsBinding bind(@NonNull View view) {
        int i = C57407yho.Application.gGvvIC;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C57407yho.Application.RdAHlO;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                return new FragmentImportTonWalletTipsBinding((NestedScrollView) view, appCompatTextView, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
