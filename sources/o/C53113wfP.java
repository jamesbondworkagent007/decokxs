package o;

import com.bumptech.glide.Glide;
import com.okinc.unify_trade.bot.data.SmartInvestData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wfP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53113wfP extends AbstractC59533zio<SmartInvestData, C53116wfS> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C53116wfS onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.OqHLSf, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C53116wfS(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C53116wfS c53116wfS, @NotNull SmartInvestData smartInvestData) {
        Intrinsics.checkNotNullParameter(c53116wfS, "");
        Intrinsics.checkNotNullParameter(smartInvestData, "");
        android.content.Context context = c53116wfS.itemView.getContext();
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, smartInvestData.getUrl(), "lfit", 48, 48).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(context)).EZpvd((android.widget.ImageView) c53116wfS.copydefault());
        c53116wfS.OLrzqt().setText(smartInvestData.getCoinName());
        c53116wfS.AEQbTJ().setText(smartInvestData.getTotalInvest());
        c53116wfS.EZpvd().setText(smartInvestData.getInvestDetail());
    }
}
