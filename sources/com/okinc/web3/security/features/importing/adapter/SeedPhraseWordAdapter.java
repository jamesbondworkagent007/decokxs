package com.okinc.web3.security.features.importing.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.okinc.web3.security.features.importing.model.WalletImportInputState;
import com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import o.C55298xhM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class SeedPhraseWordAdapter extends ListAdapter<WalletImportInputState.SeedPhraseState.WordState, SeedPhraseWordViewHolder> {
    public static final int $stable = 8;
    private final SeedPhraseWordInputLayout.OnWordBackspaceDownListener onWordBackspaceDownListener;
    private final SeedPhraseWordInputLayout.OnWordEditorActionListener onWordEditorActionListener;
    private final SeedPhraseWordInputLayout.OnWordFocusGainedListener onWordFocusGainedListener;
    private final SeedPhraseWordInputLayout.OnWordTextChangedListener onWordTextChangedListener;
    private RecyclerView recyclerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeedPhraseWordAdapter(@NotNull Executor executor, @NotNull SeedPhraseWordInputLayout.OnWordFocusGainedListener onWordFocusGainedListener, @NotNull SeedPhraseWordInputLayout.OnWordBackspaceDownListener onWordBackspaceDownListener, @NotNull SeedPhraseWordInputLayout.OnWordTextChangedListener onWordTextChangedListener, @NotNull SeedPhraseWordInputLayout.OnWordEditorActionListener onWordEditorActionListener) {
        super(new AsyncDifferConfig.Builder(SeedPhraseWordDiffCallback.INSTANCE).setBackgroundThreadExecutor(executor).build());
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(onWordFocusGainedListener, "");
        Intrinsics.checkNotNullParameter(onWordBackspaceDownListener, "");
        Intrinsics.checkNotNullParameter(onWordTextChangedListener, "");
        Intrinsics.checkNotNullParameter(onWordEditorActionListener, "");
        this.onWordFocusGainedListener = onWordFocusGainedListener;
        this.onWordBackspaceDownListener = onWordBackspaceDownListener;
        this.onWordTextChangedListener = onWordTextChangedListener;
        this.onWordEditorActionListener = onWordEditorActionListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerView = null;
    }

    @Override // androidx.recyclerview.widget.ListAdapter
    public void submitList(final List<WalletImportInputState.SeedPhraseState.WordState> list) {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null && (recyclerView.isComputingLayout() || recyclerView.getScrollState() != 0)) {
            recyclerView.post(new Runnable() { // from class: com.okinc.web3.security.features.importing.adapter.SeedPhraseWordAdapter$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    super/*androidx.recyclerview.widget.ListAdapter*/.submitList(list);
                }
            });
        } else {
            super.submitList(list);
        }
    }

    @Override // androidx.recyclerview.widget.ListAdapter
    public void submitList(final List<WalletImportInputState.SeedPhraseState.WordState> list, final Runnable runnable) {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null && (recyclerView.isComputingLayout() || recyclerView.getScrollState() != 0)) {
            recyclerView.post(new Runnable() { // from class: com.okinc.web3.security.features.importing.adapter.SeedPhraseWordAdapter$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    super/*androidx.recyclerview.widget.ListAdapter*/.submitList(list, runnable);
                }
            });
        } else {
            super.submitList(list, runnable);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SeedPhraseWordViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        SeedPhraseWordInputLayout seedPhraseWordInputLayout = new SeedPhraseWordInputLayout(context);
        FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(-2, -2);
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C55298xhM.OLrzqt(16, context2);
        Context context3 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        layoutParams.setMarginStart(C55298xhM.OLrzqt(12, context3));
        seedPhraseWordInputLayout.setLayoutParams(layoutParams);
        seedPhraseWordInputLayout.setOnWordKeyListener(this.onWordBackspaceDownListener);
        seedPhraseWordInputLayout.setOnWordTextChangedListener(this.onWordTextChangedListener);
        seedPhraseWordInputLayout.setOnWordFocusChangeListener(this.onWordFocusGainedListener);
        seedPhraseWordInputLayout.setOnWordEditorActionListener(this.onWordEditorActionListener);
        return new SeedPhraseWordViewHolder(seedPhraseWordInputLayout);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SeedPhraseWordViewHolder seedPhraseWordViewHolder, int i) {
        Intrinsics.checkNotNullParameter(seedPhraseWordViewHolder, "");
        WalletImportInputState.SeedPhraseState.WordState item = getItem(i);
        SeedPhraseWordInputLayout view = seedPhraseWordViewHolder.getView();
        Intrinsics.copydefault(item);
        view.setWord(item);
    }
}
