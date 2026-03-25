package o;

import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.RecurringBuyDto;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.ShareData;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.C55961xtn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55961xtn implements InterfaceC54501xKt<StrategyDetailsResponse, ShareData> {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.xtn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xtn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(@NotNull java.util.List<RecurringListItem> list, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 2, null, new Function1() { // from class: o.xts
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C55961xtn.ActionBar.OLrzqt(str2, str, (RecurringListItem) obj);
                }
            }, 23, null);
            if (strJoinToString$default.length() == 0) {
                strJoinToString$default = "--";
            }
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.setBufferedPosition), strJoinToString$default);
        }

        public static final java.lang.CharSequence OLrzqt(java.lang.String str, java.lang.String str2, RecurringListItem recurringListItem) {
            Intrinsics.checkNotNullParameter(recurringListItem, "");
            java.lang.String processedPrice$default = C56068xvo.getProcessedPrice$default(C56068xvo.copydefault, str2, recurringListItem.getCcy() + "-" + str, recurringListItem.getAvgPx(), RoundingMode.HALF_UP, false, false, 48, null);
            return recurringListItem.getCcy() + " " + processedPrice$default;
        }

        public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(@NotNull java.util.List<RecurringListItem> list, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 2, null, new Function1() { // from class: o.xtr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C55961xtn.ActionBar.KWHzl(str2, str, (RecurringListItem) obj);
                }
            }, 23, null);
            if (strJoinToString$default.length() == 0) {
                strJoinToString$default = "--";
            }
            return C56390yDp.OLrzqt(C33069mpW.copydefault(C55688xof.Application.fromToken, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", str2))), strJoinToString$default);
        }

        public static final java.lang.CharSequence KWHzl(java.lang.String str, java.lang.String str2, RecurringListItem recurringListItem) {
            Intrinsics.checkNotNullParameter(recurringListItem, "");
            java.lang.String processedPrice$default = C56068xvo.getProcessedPrice$default(C56068xvo.copydefault, str2, recurringListItem.getCcy() + "-" + str, recurringListItem.getAvgPx(), RoundingMode.HALF_UP, false, false, 48, null);
            return recurringListItem.getCcy() + " " + processedPrice$default;
        }

        public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatRepeatMode), C56046xvS.AEQbTJ.copydefault(str, str2, str3, str4, str5, str6));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ShareData KWHzl(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        RecurringBuyDto recurring;
        RecurringBuyDto recurring2;
        java.lang.Integer recurringTimeType;
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        ActionBar actionBar = Companion;
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = actionBar.OLrzqt(strategyDetailsResponse.getRecurringList(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInvestCcy());
        java.lang.String strComponent1 = pairOLrzqt.component1();
        java.lang.String strComponent2 = pairOLrzqt.component2();
        java.lang.String period = strategyDetailsResponse.getPeriod();
        java.lang.String recurringDay = strategyDetailsResponse.getRecurringDay();
        java.lang.String recurringTime = strategyDetailsResponse.getRecurringTime();
        java.lang.String recurringHour = strategyDetailsResponse.getRecurringHour();
        BotVo bot = strategyDetailsResponse.getBot();
        java.lang.String recurringTimeMinutes = null;
        java.lang.String strGEmmrt = (bot == null || (recurring2 = bot.getRecurring()) == null || (recurringTimeType = recurring2.getRecurringTimeType()) == null) ? null : C33129mqd.gEmmrt(recurringTimeType);
        if (strGEmmrt == null) {
            strGEmmrt = "";
        }
        BotVo bot2 = strategyDetailsResponse.getBot();
        if (bot2 != null && (recurring = bot2.getRecurring()) != null) {
            recurringTimeMinutes = recurring.getRecurringTimeMinutes();
        }
        if (recurringTimeMinutes == null) {
            recurringTimeMinutes = "";
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt2 = actionBar.OLrzqt(period, recurringDay, recurringTime, recurringHour, strGEmmrt, recurringTimeMinutes);
        return new ShareData(null, C33129mqd.divS$default(strategyDetailsResponse.getTotalPnl(), strategyDetailsResponse.getInvestAmt(), null, null, null, 14, null), null, strategyDetailsResponse.getTotalPnl(), strategyDetailsResponse.getInvestCcy(), strComponent1, strComponent2, pairOLrzqt2.component1(), pairOLrzqt2.component2(), null, null, null, null, null, null, 32261, null);
    }
}
