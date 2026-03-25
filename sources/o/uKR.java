package o;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uKR extends AbstractC59533zio<TacticsData, uKT> {
    public final WeakReference<C52499wNr> KWHzl;
    public final java.lang.Integer OLrzqt;
    public final boolean copydefault;

    public uKR(@NotNull C52499wNr c52499wNr, boolean z, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(c52499wNr, "");
        this.copydefault = z;
        this.OLrzqt = num;
        this.KWHzl = new WeakReference<>(c52499wNr);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public uKT onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        return new uKT(composeView, this.KWHzl, this.copydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull uKT ukt, @NotNull TacticsData tacticsData) {
        yHO<java.lang.Integer, java.lang.String, java.lang.String, Unit> yhoValueOf;
        Intrinsics.checkNotNullParameter(ukt, "");
        Intrinsics.checkNotNullParameter(tacticsData, "");
        ukt.EZpvd(ukt.getBindingAdapterPosition() == 0 ? this.OLrzqt : null);
        ukt.copydefault(tacticsData);
        C52499wNr c52499wNr = this.KWHzl.get();
        if (c52499wNr == null || (yhoValueOf = c52499wNr.valueOf()) == null) {
            return;
        }
        yhoValueOf.invoke(java.lang.Integer.valueOf(ukt.getBindingAdapterPosition()), tacticsData.getAlgoId(), "ai_bot");
    }
}
