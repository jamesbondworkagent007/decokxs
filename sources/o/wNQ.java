package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsListLabelUiData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class wNQ extends AbstractC59533zio<TacticsInsideItemData, StateListAnimator> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.gbIfDn, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new StateListAnimator(this, (AbstractC48591uXb) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull TacticsInsideItemData tacticsInsideItemData) {
        java.lang.Integer rightTextColor;
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl2;
        C55312xha c55312xhaValueOf2;
        C55320xhi c55320xhiKWHzl3;
        C55320xhi c55320xhiKWHzl4;
        C55312xha c55312xhaValueOf3;
        C55320xhi c55320xhiKWHzl5;
        C55320xhi c55320xhiKWHzl6;
        C55320xhi c55320xhiKWHzl7;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(tacticsInsideItemData, "");
        AbstractC48591uXb abstractC48591uXbKWHzl = stateListAnimator.KWHzl();
        C55312xha c55312xhaValueOf4 = abstractC48591uXbKWHzl.copydefault.valueOf();
        if (c55312xhaValueOf4 != null && (c55320xhiKWHzl7 = c55312xhaValueOf4.KWHzl()) != null) {
            c55320xhiKWHzl7.setText(tacticsInsideItemData.getTitle());
        }
        C55312xha c55312xhaValueOf5 = abstractC48591uXbKWHzl.OLrzqt.valueOf();
        if (c55312xhaValueOf5 != null && (c55320xhiKWHzl6 = c55312xhaValueOf5.KWHzl()) != null) {
            c55320xhiKWHzl6.setText(tacticsInsideItemData.getText());
        }
        boolean z = (tacticsInsideItemData.getTags().isEmpty() ^ true) && !Intrinsics.EZpvd((java.lang.Object) tacticsInsideItemData.getText(), (java.lang.Object) "--");
        AppCompatImageView appCompatImageView = abstractC48591uXbKWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z ? 0 : 8);
        if (z && (c55312xhaValueOf3 = abstractC48591uXbKWHzl.OLrzqt.valueOf()) != null && (c55320xhiKWHzl5 = c55312xhaValueOf3.KWHzl()) != null) {
            c55320xhiKWHzl5.setTextColor(C56033xvF.OLrzqt((java.lang.Object) ((TacticsListLabelUiData) CollectionsKt___CollectionsKt.AuCTelauCTel(tacticsInsideItemData.getTags())).AEQbTJ()));
        }
        if (tacticsInsideItemData.getSubItemType() instanceof TacticsUiConst.BotListSubItemType.BotSubTip) {
            C55312xha c55312xhaValueOf6 = abstractC48591uXbKWHzl.copydefault.valueOf();
            if (c55312xhaValueOf6 != null) {
                c55312xhaValueOf6.setShowUnderline(true);
            }
        } else {
            C55312xha c55312xhaValueOf7 = abstractC48591uXbKWHzl.copydefault.valueOf();
            if (c55312xhaValueOf7 != null) {
                c55312xhaValueOf7.setShowUnderline(false);
            }
        }
        if (!C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(tacticsInsideItemData.getTvColor()), (java.lang.Object) 0)) {
            int tvColor = tacticsInsideItemData.getTvColor();
            C55312xha c55312xhaValueOf8 = abstractC48591uXbKWHzl.copydefault.valueOf();
            if (c55312xhaValueOf8 != null && (c55320xhiKWHzl4 = c55312xhaValueOf8.KWHzl()) != null) {
                c55320xhiKWHzl4.setTextColor(tvColor);
            }
        }
        if (tacticsInsideItemData.getTextStyle() != 0 && (c55312xhaValueOf2 = abstractC48591uXbKWHzl.OLrzqt.valueOf()) != null && (c55320xhiKWHzl3 = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl3.setTextAppearance(tacticsInsideItemData.getTextStyle());
        }
        if (tacticsInsideItemData.getTitleStyle() != 0 && (c55312xhaValueOf = abstractC48591uXbKWHzl.copydefault.valueOf()) != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl2.setTextAppearance(tacticsInsideItemData.getTitleStyle());
        }
        if (C33129mqd.OLrzqt((java.lang.Object) tacticsInsideItemData.getRightTextColor(), (java.lang.Object) 0) || (rightTextColor = tacticsInsideItemData.getRightTextColor()) == null) {
            return;
        }
        int iIntValue = rightTextColor.intValue();
        C55312xha c55312xhaValueOf9 = abstractC48591uXbKWHzl.OLrzqt.valueOf();
        if (c55312xhaValueOf9 == null || (c55320xhiKWHzl = c55312xhaValueOf9.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setTextColor(iIntValue);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final AbstractC48591uXb OLrzqt;
        public final /* synthetic */ wNQ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC48591uXb KWHzl() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull wNQ wnq, AbstractC48591uXb abstractC48591uXb) {
            super(abstractC48591uXb.getRoot());
            Intrinsics.checkNotNullParameter(abstractC48591uXb, "");
            this.copydefault = wnq;
            this.OLrzqt = abstractC48591uXb;
        }
    }
}
