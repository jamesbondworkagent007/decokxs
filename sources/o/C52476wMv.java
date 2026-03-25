package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.SingleCoinAllocationData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wMv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C52476wMv extends AbstractC59533zio<SingleCoinAllocationData, ActionBar> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C48637uYu c48637uYuOLrzqt = C48637uYu.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c48637uYuOLrzqt, "");
        return new ActionBar(this, c48637uYuOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull SingleCoinAllocationData singleCoinAllocationData) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(singleCoinAllocationData, "");
        C48637uYu c48637uYuAEQbTJ = actionBar.AEQbTJ();
        c48637uYuAEQbTJ.copydefault.setBackgroundTintList(android.content.res.ColorStateList.valueOf(singleCoinAllocationData.getCcyColor()));
        c48637uYuAEQbTJ.OLrzqt.setText(singleCoinAllocationData.getCcyName());
        c48637uYuAEQbTJ.KWHzl.setText(singleCoinAllocationData.getCcyRatio());
    }

    /* JADX INFO: renamed from: o.wMv$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final C48637uYu AEQbTJ;
        public final /* synthetic */ C52476wMv KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C48637uYu AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C52476wMv c52476wMv, C48637uYu c48637uYu) {
            super(c48637uYu.getRoot());
            Intrinsics.checkNotNullParameter(c48637uYu, "");
            this.KWHzl = c52476wMv;
            this.AEQbTJ = c48637uYu;
        }
    }
}
