package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.RelativeTransactionVO;
import com.okinc.business.dexui.main.swap.history.detail.adapter.ItemType;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hWq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C22066hWq extends AbstractC59533zio<C22032hVj, ActionBar> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hAD hadEZpvd = hAD.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hadEZpvd, "");
        return new ActionBar(hadEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull C22032hVj c22032hVj) {
        java.lang.String exploreUrl;
        java.lang.String transactionHash;
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(c22032hVj, "");
        actionBar.KWHzl().OLrzqt.setContentDescription("web3_dex_history_txnHash_cell");
        if (Intrinsics.EZpvd((java.lang.Object) c22032hVj.copydefault(), (java.lang.Object) ItemType.ITEM_TYPE_WITHDRAW_HASH.getValue())) {
            actionBar.KWHzl().OLrzqt.setTxHashTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.RIsQag));
            RelativeTransactionVO relativeTransaction = c22032hVj.KWHzl().getRelativeTransaction();
            if (relativeTransaction != null && (transactionHash = relativeTransaction.getTransactionHash()) != null) {
                actionBar.KWHzl().OLrzqt.setTxHashValue(transactionHash);
            }
            RelativeTransactionVO relativeTransaction2 = c22032hVj.KWHzl().getRelativeTransaction();
            if (relativeTransaction2 == null || (exploreUrl = relativeTransaction2.getExploreUrl()) == null) {
                return;
            }
            actionBar.KWHzl().OLrzqt.copydefault(exploreUrl);
            return;
        }
        actionBar.KWHzl().OLrzqt.setTxHashValue(c22032hVj.KWHzl().getTransactionHash());
        actionBar.KWHzl().OLrzqt.copydefault(c22032hVj.KWHzl().getFinalExploreUrl());
    }

    /* JADX INFO: renamed from: o.hWq$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final hAD EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final hAD KWHzl() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull hAD had) {
            super(had.getRoot());
            Intrinsics.checkNotNullParameter(had, "");
            this.EZpvd = had;
        }
    }
}
