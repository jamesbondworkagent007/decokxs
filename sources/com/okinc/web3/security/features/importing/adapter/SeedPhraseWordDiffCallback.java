package com.okinc.web3.security.features.importing.adapter;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.web3.security.features.importing.model.WalletImportInputState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SeedPhraseWordDiffCallback extends DiffUtil.ItemCallback<WalletImportInputState.SeedPhraseState.WordState> {
    public static final int $stable = 0;
    public static final SeedPhraseWordDiffCallback INSTANCE = new SeedPhraseWordDiffCallback();

    private SeedPhraseWordDiffCallback() {
    }

    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areItemsTheSame(@NotNull WalletImportInputState.SeedPhraseState.WordState wordState, @NotNull WalletImportInputState.SeedPhraseState.WordState wordState2) {
        Intrinsics.checkNotNullParameter(wordState, "");
        Intrinsics.checkNotNullParameter(wordState2, "");
        return wordState.getId() == wordState2.getId();
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(@NotNull WalletImportInputState.SeedPhraseState.WordState wordState, @NotNull WalletImportInputState.SeedPhraseState.WordState wordState2) {
        Intrinsics.checkNotNullParameter(wordState, "");
        Intrinsics.checkNotNullParameter(wordState2, "");
        return Intrinsics.EZpvd(wordState, wordState2);
    }
}
