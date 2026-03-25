package o;

import com.bumptech.glide.Glide;
import com.okinc.unify_trade.bot.data.DistributeItem;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wfL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53109wfL extends AbstractC59533zio<DistributeItem, C53111wfN> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C53111wfN onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.fRNHEq, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C53111wfN(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C53111wfN c53111wfN, @NotNull DistributeItem distributeItem) {
        Intrinsics.checkNotNullParameter(c53111wfN, "");
        Intrinsics.checkNotNullParameter(distributeItem, "");
        android.content.Context context = c53111wfN.itemView.getContext();
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        java.lang.String coinImgUrl = distributeItem.getCoinImgUrl();
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, coinImgUrl != null ? coinImgUrl : "", "lfit", 48, 48).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(context)).EZpvd(c53111wfN.OLrzqt());
        c53111wfN.KWHzl().setText(distributeItem.getCoinName());
        c53111wfN.AEQbTJ().setText(distributeItem.getCoinPercent());
    }
}
