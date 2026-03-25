package com.okinc.web3.security.features.importing.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import com.okinc.web3.security.databinding.ItemAssociationalWordBinding;
import com.okinc.web3.security.features.importing.adapter.SuggestedWordsAdapter;
import com.okinc.web3.security.features.importing.model.SuggestedWord;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59533zio;
import o.C55296xhK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SuggestedWordViewBinder extends AbstractC59533zio<SuggestedWord, SuggestedWordViewHolder> {
    public static final int $stable = 8;
    private final SuggestedWordsAdapter.OnWordClickListener listener;

    public SuggestedWordViewBinder(@NotNull SuggestedWordsAdapter.OnWordClickListener onWordClickListener) {
        Intrinsics.checkNotNullParameter(onWordClickListener, "");
        this.listener = onWordClickListener;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    public SuggestedWordViewHolder onCreateViewHolder(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemAssociationalWordBinding itemAssociationalWordBindingInflate = ItemAssociationalWordBinding.inflate(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemAssociationalWordBindingInflate, "");
        return new SuggestedWordViewHolder(itemAssociationalWordBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    public void onBindViewHolder(@NotNull SuggestedWordViewHolder suggestedWordViewHolder, @NotNull final SuggestedWord suggestedWord) {
        Intrinsics.checkNotNullParameter(suggestedWordViewHolder, "");
        Intrinsics.checkNotNullParameter(suggestedWord, "");
        suggestedWordViewHolder.getBinding().word.setText(suggestedWord.getWord());
        final View view = suggestedWordViewHolder.itemView;
        final long j = 1000;
        view.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.importing.adapter.SuggestedWordViewBinder$onBindViewHolder$$inlined$singleClick$default$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(view) > j || (view instanceof Checkable)) {
                    C55296xhK.OLrzqt(view, jCurrentTimeMillis);
                    this.listener.onWordClick(suggestedWord);
                }
            }
        });
    }
}
