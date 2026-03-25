package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57407yho;

/* JADX INFO: loaded from: classes24.dex */
public final class ItemMnemonicViewBinding implements ViewBinding {
    public final TextView index;
    public final View line;
    private final ConstraintLayout rootView;
    public final TextView word;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private ItemMnemonicViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull View view, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.index = textView;
        this.line = view;
        this.word = textView2;
    }

    public static ItemMnemonicViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMnemonicViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C57407yho.StateListAnimator.DbNXlk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemMnemonicViewBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = C57407yho.Application.hDKMBd;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C57407yho.Application.zuBGHE))) != null) {
            i = C57407yho.Application.hBpjJd;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                return new ItemMnemonicViewBinding((ConstraintLayout) view, textView, viewFindChildViewById, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
