package com.okinc.web3.security.features.importing.adapter;

import com.okinc.web3.security.features.importing.model.SuggestedWord;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C59534zip;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class SuggestedWordsAdapter extends C59534zip {
    public static final int $stable = 0;

    public interface OnWordClickListener {
        void onWordClick(@NotNull SuggestedWord suggestedWord);
    }

    public SuggestedWordsAdapter(@NotNull OnWordClickListener onWordClickListener) {
        Intrinsics.checkNotNullParameter(onWordClickListener, "");
        register(SuggestedWord.class, new SuggestedWordViewBinder(onWordClickListener));
    }

    public final void setWords(@NotNull List<SuggestedWord> list) {
        Intrinsics.checkNotNullParameter(list, "");
        setItems(list);
        notifyDataSetChanged();
    }
}
