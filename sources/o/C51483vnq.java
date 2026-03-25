package o;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vnq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51483vnq extends AbstractC59533zio<C51938vwU, C51486vnt> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C51486vnt onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C51957vwn c51957vwn = new C51957vwn(context, null, 0, 6, null);
        c51957vwn.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new C51486vnt(c51957vwn);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51486vnt c51486vnt, @NotNull C51938vwU c51938vwU) {
        Intrinsics.checkNotNullParameter(c51486vnt, "");
        Intrinsics.checkNotNullParameter(c51938vwU, "");
        android.view.View view = c51486vnt.itemView;
        C51957vwn c51957vwn = view instanceof C51957vwn ? (C51957vwn) view : null;
        if (c51957vwn != null) {
            c51957vwn.AEQbTJ(c51938vwU);
        }
    }
}
