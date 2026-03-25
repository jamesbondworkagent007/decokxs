package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.BotSmartArbItemData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52492wNk extends AbstractC59533zio<BotSmartArbItemData, Application> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC50834vbd abstractC50834vbdAEQbTJ = AbstractC50834vbd.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC50834vbdAEQbTJ, "");
        return new Application(abstractC50834vbdAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull BotSmartArbItemData botSmartArbItemData) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(botSmartArbItemData, "");
        AbstractC50834vbd abstractC50834vbdKWHzl = application.KWHzl();
        abstractC50834vbdKWHzl.OLrzqt.setText(botSmartArbItemData.getTitle());
        abstractC50834vbdKWHzl.KWHzl.setText(botSmartArbItemData.getValue());
    }

    /* JADX INFO: renamed from: o.wNk$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final AbstractC50834vbd AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC50834vbd KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AbstractC50834vbd abstractC50834vbd) {
            super(abstractC50834vbd.getRoot());
            Intrinsics.checkNotNullParameter(abstractC50834vbd, "");
            this.AEQbTJ = abstractC50834vbd;
        }
    }
}
