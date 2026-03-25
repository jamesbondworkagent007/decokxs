package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.web3.security.features.importing.widget.DisableAutofillEditText;
import o.C57407yho;

/* JADX INFO: loaded from: classes17.dex */
public final class LayoutWalletImportDataInputBinding implements ViewBinding {
    public final DisableAutofillEditText privateKey;
    private final View rootView;
    public final RecyclerView wordList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    private LayoutWalletImportDataInputBinding(@NonNull View view, @NonNull DisableAutofillEditText disableAutofillEditText, @NonNull RecyclerView recyclerView) {
        this.rootView = view;
        this.privateKey = disableAutofillEditText;
        this.wordList = recyclerView;
    }

    public static LayoutWalletImportDataInputBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C57407yho.StateListAnimator.fIwbmz, viewGroup);
        return bind(viewGroup);
    }

    public static LayoutWalletImportDataInputBinding bind(@NonNull View view) {
        int i = C57407yho.Application.UeEOUB;
        DisableAutofillEditText disableAutofillEditText = (DisableAutofillEditText) ViewBindings.findChildViewById(view, i);
        if (disableAutofillEditText != null) {
            i = C57407yho.Application.DLWbHP;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new LayoutWalletImportDataInputBinding(view, disableAutofillEditText, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
