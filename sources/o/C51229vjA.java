package o;

import android.view.ViewGroup;
import com.okinc.unify_trade.bot.data.BotGuideData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51229vjA extends AbstractC59533zio<BotGuideData, C51232vjD> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C51232vjD onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new C51232vjD(new C51965vwv(context, null, 0, 6, null));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51232vjD c51232vjD, @NotNull BotGuideData botGuideData) {
        Intrinsics.checkNotNullParameter(c51232vjD, "");
        Intrinsics.checkNotNullParameter(botGuideData, "");
        android.view.View view = c51232vjD.itemView;
        C51965vwv c51965vwv = view instanceof C51965vwv ? (C51965vwv) view : null;
        if (c51965vwv != null) {
            c51965vwv.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            c51965vwv.copydefault(botGuideData);
        }
    }
}
