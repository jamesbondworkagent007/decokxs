package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.BotCreateTitleItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.voG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51500voG extends AbstractC59533zio<BotCreateTitleItem, StateListAnimator> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC50847vbq abstractC50847vbqKWHzl = AbstractC50847vbq.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC50847vbqKWHzl, "");
        return new StateListAnimator(abstractC50847vbqKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull BotCreateTitleItem botCreateTitleItem) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(botCreateTitleItem, "");
        stateListAnimator.OLrzqt().OLrzqt.setText(botCreateTitleItem.getTitle());
    }

    /* JADX INFO: renamed from: o.voG$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final AbstractC50847vbq EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC50847vbq OLrzqt() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull AbstractC50847vbq abstractC50847vbq) {
            super(abstractC50847vbq.getRoot());
            Intrinsics.checkNotNullParameter(abstractC50847vbq, "");
            this.EZpvd = abstractC50847vbq;
        }
    }
}
