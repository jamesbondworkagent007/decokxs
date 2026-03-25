package o;

import android.view.View;
import com.okinc.biz.TacticsType;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vvj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51900vvj extends AbstractC59533zio<BotLeadStrateShowData, C51893vvc> {
    public final Function1<BotLeadStrateShowData, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<BotLeadStrateShowData, Unit> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51900vvj(@NotNull Function1<? super BotLeadStrateShowData, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C51893vvc onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.zYHWMc, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51893vvc(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51893vvc c51893vvc, @NotNull BotLeadStrateShowData botLeadStrateShowData) {
        java.lang.String localized$default;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(c51893vvc, "");
        Intrinsics.checkNotNullParameter(botLeadStrateShowData, "");
        c51893vvc.AhwBna().setText(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, botLeadStrateShowData.getInstId(), botLeadStrateShowData.getInstType(), false, false, 12, null));
        C55251xgS c55251xgSCopydefault = c51893vvc.copydefault();
        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(botLeadStrateShowData.getBotType());
        c55251xgSCopydefault.setText(tacticsTypeAEQbTJ != null ? C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName()) : null);
        boolean z = Intrinsics.EZpvd((java.lang.Object) botLeadStrateShowData.getBotType(), (java.lang.Object) "contract_dca") || Intrinsics.EZpvd((java.lang.Object) botLeadStrateShowData.getBotType(), (java.lang.Object) "contract_grid");
        c51893vvc.AEQbTJ().setVisibility(z ? 0 : 8);
        c51893vvc.EZpvd().setVisibility(z ? 0 : 8);
        java.lang.String direction = botLeadStrateShowData.getDirection();
        if (direction == null) {
            direction = "";
        }
        int iValueOf = C56033xvF.valueOf(direction);
        C55251xgS c55251xgSAEQbTJ = c51893vvc.AEQbTJ();
        java.lang.String direction2 = botLeadStrateShowData.getDirection();
        if (direction2 == null) {
            direction2 = "";
        }
        c55251xgSAEQbTJ.setText(C56033xvF.AhwBna(direction2));
        c55251xgSAEQbTJ.setOKDSStyle(iValueOf);
        C55251xgS c55251xgSEZpvd = c51893vvc.EZpvd();
        java.lang.String leverage = botLeadStrateShowData.getLeverage();
        if (leverage == null) {
            leverage = "";
        }
        c55251xgSEZpvd.setText(C56033xvF.getBotLever$default(leverage, false, 2, null));
        c55251xgSEZpvd.setOKDSStyle(iValueOf);
        android.widget.TextView textViewKWHzl = c51893vvc.KWHzl();
        java.lang.String pnl = botLeadStrateShowData.getPnl();
        java.lang.String str2 = pnl == null ? "" : pnl;
        java.lang.String profitSharingCcy = botLeadStrateShowData.getProfitSharingCcy();
        textViewKWHzl.setText(C56033xvF.getBotPnl$default("", "", str2, profitSharingCcy == null ? "" : profitSharingCcy, true, false, null, false, null, null, null, 2016, null));
        android.widget.TextView textViewOLrzqt = c51893vvc.OLrzqt();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.onFastForward);
        java.lang.String copyCount = botLeadStrateShowData.getCopyCount();
        if (copyCount != null && (localized$default = pTB.formatLocalized$default(copyCount, null, 1, null)) != null) {
            str = localized$default;
        }
        textViewOLrzqt.setText(C33069mpW.OLrzqt(strAYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, str))));
        android.view.View view = c51893vvc.itemView;
        view.setOnClickListener(new TaskDescription(view, 1000L, this, botLeadStrateShowData));
    }

    /* JADX INFO: renamed from: o.vvj$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C51900vvj KWHzl;
        public final /* synthetic */ BotLeadStrateShowData OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51900vvj c51900vvj, BotLeadStrateShowData botLeadStrateShowData) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c51900vvj;
            this.OLrzqt = botLeadStrateShowData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.copydefault().invoke(this.OLrzqt);
            }
        }
    }
}
