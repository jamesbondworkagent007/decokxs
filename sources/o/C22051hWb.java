package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hWb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C22051hWb extends AbstractC59533zio<C22027hVe, StateListAnimator> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21476hAu c21476hAuKWHzl = C21476hAu.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21476hAuKWHzl, "");
        return new StateListAnimator(c21476hAuKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull C22027hVe c22027hVe) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(c22027hVe, "");
        if (c22027hVe.KWHzl().isSingleSwapStyle()) {
            stateListAnimator.EZpvd().copydefault.setContentDescription("web3_dex_history_chain_cell");
            stateListAnimator.EZpvd().copydefault.setNetworkInfo(c22027hVe.KWHzl().getFromChainName(), "");
        } else {
            stateListAnimator.EZpvd().copydefault.setContentDescription("web3_dex_history_crossChain_cell");
            stateListAnimator.EZpvd().copydefault.setNetworkInfo(c22027hVe.KWHzl().getFromChainName(), c22027hVe.KWHzl().getToChainName());
        }
    }

    /* JADX INFO: renamed from: o.hWb$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C21476hAu OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21476hAu EZpvd() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C21476hAu c21476hAu) {
            super(c21476hAu.getRoot());
            Intrinsics.checkNotNullParameter(c21476hAu, "");
            this.OLrzqt = c21476hAu;
        }
    }
}
