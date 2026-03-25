package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import o.C57407yho;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemAssociationalWordBinding implements ViewBinding {
    private final TextView rootView;
    public final TextView word;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    private ItemAssociationalWordBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.word = textView2;
    }

    public static ItemAssociationalWordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemAssociationalWordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C57407yho.StateListAnimator.values, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemAssociationalWordBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new ItemAssociationalWordBinding(textView, textView);
    }
}
