package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.web3.security.features.importing.widget.SeedPhraseWordEditText;
import o.C57407yho;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutSeedPhraseWordBinding implements ViewBinding {
    public final TextView index;
    private final View rootView;
    public final SeedPhraseWordEditText word;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    private LayoutSeedPhraseWordBinding(@NonNull View view, @NonNull TextView textView, @NonNull SeedPhraseWordEditText seedPhraseWordEditText) {
        this.rootView = view;
        this.index = textView;
        this.word = seedPhraseWordEditText;
    }

    public static LayoutSeedPhraseWordBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C57407yho.StateListAnimator.fJNWhG, viewGroup);
        return bind(viewGroup);
    }

    public static LayoutSeedPhraseWordBinding bind(@NonNull View view) {
        int i = C57407yho.Application.hDKMBd;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C57407yho.Application.hBpjJd;
            SeedPhraseWordEditText seedPhraseWordEditText = (SeedPhraseWordEditText) ViewBindings.findChildViewById(view, i);
            if (seedPhraseWordEditText != null) {
                return new LayoutSeedPhraseWordBinding(view, textView, seedPhraseWordEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
