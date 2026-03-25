package o;

import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wrz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53785wrz {
    public static final C53785wrz OLrzqt = new C53785wrz();

    private C53785wrz() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [34=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r1.equals("grid") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (r1.equals("contract_grid") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r1.equals("contract_dca") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r1.equals("spot_dca") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return copydefault(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return KWHzl(r4);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C53778wrs EZpvd(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        java.lang.String orderType = strategyDetailsResponse.getOrderType();
        switch (orderType.hashCode()) {
            case -1831183611:
                break;
            case -1402017003:
                break;
            case -1216369070:
                if (orderType.equals("smart_portfolio")) {
                    return valueOf(strategyDetailsResponse);
                }
                return new C53778wrs("", "");
            case -557961837:
                if (orderType.equals("smart_arbitrage")) {
                    return AYXKKw(strategyDetailsResponse);
                }
                return new C53778wrs("", "");
            case -512749997:
                break;
            case 3181382:
                break;
            case 1165749981:
                if (orderType.equals("recurring")) {
                    return AEQbTJ(strategyDetailsResponse);
                }
                return new C53778wrs("", "");
            case 1485620813:
                if (orderType.equals("dcd_bot")) {
                    return OLrzqt(strategyDetailsResponse);
                }
                return new C53778wrs("", "");
            default:
                return new C53778wrs("", "");
        }
    }

    public final C53778wrs copydefault(StrategyDetailsResponse strategyDetailsResponse) {
        return new C53778wrs(C33070mpX.AYXKKw(C55688xof.Application.onKeyShortcut), C56068xvo.getProcessedPrice$default(C56068xvo.copydefault, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getRunPx(), RoundingMode.UP, false, false, 48, null));
    }

    public final C53778wrs KWHzl(StrategyDetailsResponse strategyDetailsResponse) {
        return new C53778wrs(C33070mpX.AYXKKw(C55688xof.Application.RlQdEF), pTB.formatICUNumber$default(C33129mqd.EZpvd(strategyDetailsResponse.getCompletedCycles()), null, C38307pTy.Companion.AEQbTJ(0), null, null, 13, null));
    }

    public final C53778wrs AYXKKw(StrategyDetailsResponse strategyDetailsResponse) {
        return new C53778wrs(C33070mpX.AYXKKw(C48033uCm.Fragment.gsvlRV), pTB.formatICUPercent$default(C33129mqd.EZpvd(strategyDetailsResponse.getFundingFeeRatio()), null, C38307pTy.Companion.AEQbTJ(3), null, java.lang.Double.valueOf(100.0d), null, 21, null));
    }

    public final C53778wrs OLrzqt(StrategyDetailsResponse strategyDetailsResponse) {
        return new C53778wrs(C33070mpX.AYXKKw(C55688xof.Application.zYHWMc), pTB.formatICUNumber$default(java.lang.Integer.valueOf(C33129mqd.AhwBna(strategyDetailsResponse.getCycle())), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null));
    }

    public final C53778wrs AEQbTJ(StrategyDetailsResponse strategyDetailsResponse) {
        if (strategyDetailsResponse.getRecurringList().size() == 1) {
            return djBIcL(strategyDetailsResponse);
        }
        return AhwBna(strategyDetailsResponse);
    }

    public final C53778wrs djBIcL(StrategyDetailsResponse strategyDetailsResponse) {
        java.util.ArrayList<RecurringListItem> recurringList = strategyDetailsResponse.getRecurringList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(recurringList, 10));
        for (RecurringListItem recurringListItem : recurringList) {
            arrayList.add(C56068xvo.getProcessedPrice$default(C56068xvo.copydefault, strategyDetailsResponse.getInstType(), recurringListItem.getCcy() + "-" + strategyDetailsResponse.getInvestCcy(), recurringListItem.getAvgPx(), RoundingMode.UP, false, false, 48, null));
        }
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (str == null) {
            str = "";
        }
        return new C53778wrs(C33070mpX.AYXKKw(C48033uCm.Fragment.OKvQBs), str);
    }

    public final C53778wrs AhwBna(StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(strategyDetailsResponse.getRecurringList(), ", ", null, null, 2, "...", new Function1() { // from class: o.wrv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53785wrz.OLrzqt((RecurringListItem) obj);
            }
        }, 6, null);
        if (strJoinToString$default.length() == 0) {
            strJoinToString$default = "--";
        }
        return new C53778wrs(C33070mpX.AYXKKw(C48033uCm.Fragment.DtnWsU), strJoinToString$default);
    }

    public static final java.lang.CharSequence OLrzqt(RecurringListItem recurringListItem) {
        Intrinsics.checkNotNullParameter(recurringListItem, "");
        return recurringListItem.getCcy() + " " + pTB.formatICUPercent$default(C33129mqd.EZpvd(recurringListItem.getRatio()), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(0), null, java.lang.Double.valueOf(100.0d), null, 20, null);
    }

    public final C53778wrs valueOf(StrategyDetailsResponse strategyDetailsResponse) {
        return new C53778wrs(C33070mpX.AYXKKw(C48033uCm.Fragment.DtnWsU), C55924xtC.Companion.copydefault(strategyDetailsResponse.getPortfolioList(), strategyDetailsResponse.getInvestCcy()).component2());
    }
}
