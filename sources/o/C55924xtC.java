package o;

import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.ShareData;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.C55924xtC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55924xtC implements InterfaceC54501xKt<StrategyDetailsResponse, ShareData> {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.xtC$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xtC.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(@NotNull java.util.List<SmartPortfolioListItem> list, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatErrorCode), AEQbTJ(list, str));
        }

        public final kotlin.Pair<java.lang.String, java.lang.String> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.toInclusive), AEQbTJ(str, str2, str3));
        }

        public static final java.lang.CharSequence KWHzl(SmartPortfolioListItem smartPortfolioListItem) {
            Intrinsics.checkNotNullParameter(smartPortfolioListItem, "");
            return smartPortfolioListItem.getCcy() + " " + pTB.KWHzl(xMR.copydefault.OLrzqt((java.lang.Object) smartPortfolioListItem.getRatio()), 0, RoundingMode.DOWN);
        }

        public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            java.lang.String strEZpvd;
            java.lang.String strAYXKKw = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "ratio") ? C33070mpX.AYXKKw(C55688xof.Application.ChecksSdkIntAtLeast) : C33070mpX.AYXKKw(C55688xof.Application.suggest);
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "ratio")) {
                strEZpvd = xMR.copydefault.AEQbTJ(str2, 0, RoundingMode.DOWN);
            } else if (C33129mqd.OLrzqt((java.lang.Object) C33129mqd.remS$default(str3, 60, null, null, null, 14, null), (java.lang.Object) 0)) {
                java.lang.String strDivS$default = C33129mqd.divS$default(str3, 60, null, null, null, 14, null);
                strEZpvd = pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C55688xof.Activity.EZpvd, C33129mqd.AhwBna(strDivS$default), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(strDivS$default, null, 1, null))));
            } else {
                strEZpvd = pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C55688xof.Activity.AEQbTJ, C33129mqd.AhwBna(str3), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(str3, null, 1, null))));
            }
            return strAYXKKw + " " + strEZpvd;
        }

        public final java.lang.String AEQbTJ(java.util.List<SmartPortfolioListItem> list, java.lang.String str) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((SmartPortfolioListItem) obj).getCcy(), (java.lang.Object) str)) {
                    arrayList.add(obj);
                }
            }
            java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 2, null, new Function1() { // from class: o.xtG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C55924xtC.Application.KWHzl((SmartPortfolioListItem) obj2);
                }
            }, 23, null);
            return strJoinToString$default.length() == 0 ? "--" : strJoinToString$default;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    public ShareData KWHzl(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        Application application = Companion;
        kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault = application.copydefault(strategyDetailsResponse.getPortfolioList(), strategyDetailsResponse.getInvestCcy());
        java.lang.String strComponent1 = pairCopydefault.component1();
        java.lang.String strComponent2 = pairCopydefault.component2();
        kotlin.Pair<java.lang.String, java.lang.String> pairEZpvd = application.EZpvd(strategyDetailsResponse.getBalType(), strategyDetailsResponse.getDeltaRatio(), strategyDetailsResponse.getInterval());
        return new ShareData(null, C33129mqd.divS$default(strategyDetailsResponse.getTotalPnl(), strategyDetailsResponse.getInvestAmt(), null, null, null, 14, null), null, strategyDetailsResponse.getTotalPnl(), strategyDetailsResponse.getInvestCcy(), strComponent1, strComponent2, pairEZpvd.component1(), pairEZpvd.component2(), null, null, null, null, null, null, 32261, null);
    }
}
