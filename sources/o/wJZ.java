package o;

import com.okinc.unify_trade.bot.data.BotGuideItem;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class wJZ extends AbstractC59533zio<BotGuideItem, C52403wKc> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C52403wKc onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.QfJbVf, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C52403wKc(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52403wKc c52403wKc, @NotNull BotGuideItem botGuideItem) {
        Intrinsics.checkNotNullParameter(c52403wKc, "");
        Intrinsics.checkNotNullParameter(botGuideItem, "");
        c52403wKc.KWHzl().setText(botGuideItem.getTitle());
        c52403wKc.KWHzl().setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) botGuideItem.getTitle()) ? 0 : 8);
        c52403wKc.AEQbTJ().setText(botGuideItem.getText());
        c52403wKc.AEQbTJ().setLineSpacing(20.0f, 1.0f);
    }
}
