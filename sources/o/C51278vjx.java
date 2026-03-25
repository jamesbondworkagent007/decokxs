package o;

import com.okinc.unify_trade.bot.data.LabelData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51278vjx extends AbstractC59533zio<LabelData, C51230vjB> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C51230vjB onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.DGUQLIdZmdUa, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51230vjB(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51230vjB c51230vjB, @NotNull LabelData labelData) {
        Intrinsics.checkNotNullParameter(c51230vjB, "");
        Intrinsics.checkNotNullParameter(labelData, "");
        C55296xhK.margin$default(c51230vjB.KWHzl(), null, java.lang.Float.valueOf(labelData.getTopMargin()), null, java.lang.Float.valueOf(labelData.getBottomMargin()), 5, null);
        c51230vjB.KWHzl().setText(labelData.getTitle());
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(labelData.getTitleStyle()), 0)) {
            c51230vjB.KWHzl().setTextAppearance(labelData.getTitleStyle());
        }
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(labelData.getTitleColor()), 0)) {
            c51230vjB.KWHzl().setTextColor(labelData.getTitleColor());
        }
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(labelData.getTitleSize()), 0)) {
            c51230vjB.KWHzl().setTextSize(labelData.getTitleSize());
        }
    }
}
