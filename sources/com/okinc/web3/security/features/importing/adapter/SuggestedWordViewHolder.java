package com.okinc.web3.security.features.importing.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.web3.security.databinding.ItemAssociationalWordBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SuggestedWordViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    private final ItemAssociationalWordBinding binding;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ItemAssociationalWordBinding getBinding() {
        return this.binding;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedWordViewHolder(@NotNull ItemAssociationalWordBinding itemAssociationalWordBinding) {
        super(itemAssociationalWordBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemAssociationalWordBinding, "");
        this.binding = itemAssociationalWordBinding;
    }
}
