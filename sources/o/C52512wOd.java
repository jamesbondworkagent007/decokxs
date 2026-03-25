package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.TacticsInsideLineItemData;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wOd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52512wOd extends AbstractC59533zio<TacticsInsideLineItemData, wNY> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public wNY onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C49511upt.StateListAnimator.AhwBna, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new wNY(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull wNY wny, @NotNull TacticsInsideLineItemData tacticsInsideLineItemData) {
        android.view.View viewCopydefault;
        Intrinsics.checkNotNullParameter(wny, "");
        Intrinsics.checkNotNullParameter(tacticsInsideLineItemData, "");
        android.view.View viewCopydefault2 = wny.copydefault();
        ViewGroup.LayoutParams layoutParams = viewCopydefault2 != null ? viewCopydefault2.getLayoutParams() : null;
        RecyclerView.LayoutParams layoutParams2 = layoutParams instanceof RecyclerView.LayoutParams ? (RecyclerView.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = tacticsInsideLineItemData.getMarginTop();
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = tacticsInsideLineItemData.getMarginBottom();
            wny.copydefault().setLayoutParams(layoutParams2);
        }
        if (!C33129mqd.AhwBna(java.lang.Integer.valueOf(tacticsInsideLineItemData.getLineColor()), 0) || (viewCopydefault = wny.copydefault()) == null) {
            return;
        }
        viewCopydefault.setBackgroundColor(tacticsInsideLineItemData.getLineColor());
    }
}
