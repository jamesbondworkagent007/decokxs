package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57407yho;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentSecurityGuideBinding implements ViewBinding {
    public final ImageView imageTop;
    private final NestedScrollView rootView;
    public final TextView tvNum1Subtitle;
    public final TextView tvNum1Title;
    public final TextView tvNum2Subtitle;
    public final TextView tvNum2Title;
    public final TextView tvTitle;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    private FragmentSecurityGuideBinding(@NonNull NestedScrollView nestedScrollView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = nestedScrollView;
        this.imageTop = imageView;
        this.tvNum1Subtitle = textView;
        this.tvNum1Title = textView2;
        this.tvNum2Subtitle = textView3;
        this.tvNum2Title = textView4;
        this.tvTitle = textView5;
    }

    public static FragmentSecurityGuideBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSecurityGuideBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C57407yho.StateListAnimator.AhwBna, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSecurityGuideBinding bind(@NonNull View view) {
        int i = C57407yho.Application.fARcdN;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C57407yho.Application.DCUTEI;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C57407yho.Application.OuxcSI;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C57407yho.Application.zuWLRA;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = C57407yho.Application.QHmsKR;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = C57407yho.Application.OBJEWx;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                return new FragmentSecurityGuideBinding((NestedScrollView) view, imageView, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
