package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.SettlementBean;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.wUE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vvd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C51894vvd extends AbstractC59533zio<SettlementBean, Activity> {
    public java.lang.String copydefault = "";

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC48438uRk abstractC48438uRkCopydefault = AbstractC48438uRk.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC48438uRkCopydefault, "");
        return new Activity(abstractC48438uRkCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull SettlementBean settlementBean) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(settlementBean, "");
        AbstractC48438uRk abstractC48438uRkOLrzqt = activity.OLrzqt();
        java.lang.String simpleDate$default = pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(settlementBean.getSettlementTime())), null, 1, null);
        if (!Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) simpleDate$default)) {
            this.copydefault = simpleDate$default;
            android.widget.TextView textView = abstractC48438uRkOLrzqt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            abstractC48438uRkOLrzqt.EZpvd.setText(simpleDate$default);
        } else {
            android.widget.TextView textView2 = abstractC48438uRkOLrzqt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        }
        wUE wue = wUE.OLrzqt;
        android.widget.ImageView imageView = abstractC48438uRkOLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        java.lang.String avatar = settlementBean.getAvatar();
        if (avatar == null) {
            avatar = "";
        }
        wue.KWHzl(imageView, wUE.Application.m8784constructorimpl$default(avatar, null, 2, null));
        abstractC48438uRkOLrzqt.copydefault.setText(settlementBean.getUsername());
        android.widget.TextView textView3 = abstractC48438uRkOLrzqt.OLrzqt;
        java.lang.String amount = settlementBean.getAmount();
        java.lang.String str = amount == null ? "" : amount;
        java.lang.String ccy = settlementBean.getCcy();
        textView3.setText(C56033xvF.copydefault(str, ccy == null ? "" : ccy, (88 & 4) != 0 ? false : true, (88 & 8) != 0 ? null : null, (88 & 16) != 0 ? false : false, (88 & 32) == 0 ? false : false, (88 & 64) == 0 ? null : null));
    }

    /* JADX INFO: renamed from: o.vvd$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final AbstractC48438uRk AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC48438uRk OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull AbstractC48438uRk abstractC48438uRk) {
            super(abstractC48438uRk.getRoot());
            Intrinsics.checkNotNullParameter(abstractC48438uRk, "");
            this.AEQbTJ = abstractC48438uRk;
        }
    }
}
