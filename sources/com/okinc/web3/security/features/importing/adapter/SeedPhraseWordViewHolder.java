package com.okinc.web3.security.features.importing.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SeedPhraseWordViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    private final SeedPhraseWordInputLayout view;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SeedPhraseWordInputLayout getView() {
        return this.view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeedPhraseWordViewHolder(@NotNull SeedPhraseWordInputLayout seedPhraseWordInputLayout) {
        super(seedPhraseWordInputLayout);
        Intrinsics.checkNotNullParameter(seedPhraseWordInputLayout, "");
        this.view = seedPhraseWordInputLayout;
    }
}
