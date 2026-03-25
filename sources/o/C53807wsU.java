package o;

import com.okinc.biz.TacticsType;
import com.okinc.unify_trade.biz.MpStgyDetail;
import com.okinc.unify_trade.biz.MpStgyParam;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.data.ShareData;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.math.BigDecimal;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import o.C55959xtl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wsU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53807wsU implements InterfaceC54501xKt<java.util.List<? extends TickersData>, TacticsData> {
    public static final int EZpvd = MpStgyDetail.$stable | MpStgyParam.$stable;
    public final MpStgyDetail KWHzl;
    public final MpStgyParam copydefault;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* synthetic */ TacticsData KWHzl(java.util.List<? extends TickersData> list) {
        return AEQbTJ((java.util.List<TickersData>) list);
    }

    public C53807wsU(@NotNull MpStgyParam mpStgyParam, @NotNull MpStgyDetail mpStgyDetail) {
        Intrinsics.checkNotNullParameter(mpStgyParam, "");
        Intrinsics.checkNotNullParameter(mpStgyDetail, "");
        this.copydefault = mpStgyParam;
        this.KWHzl = mpStgyDetail;
    }

    public TacticsData AEQbTJ(@NotNull java.util.List<TickersData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list);
        java.lang.String last = tickersData != null ? tickersData.getLast() : null;
        java.lang.String str = last != null ? last : "";
        java.lang.String coinTitle$default = C56033xvF.getCoinTitle$default(this.copydefault.getInstType(), this.copydefault.getInstId(), false, null, null, 28, null);
        java.lang.String instId = this.copydefault.getInstId();
        java.lang.String instType = this.copydefault.getInstType();
        java.lang.String algoId = this.copydefault.getAlgoId();
        java.lang.String strSubS$default = C33129mqd.subS$default(this.KWHzl.getPTime(), this.KWHzl.getCTime(), null, null, null, 14, null);
        ShareData shareDataAEQbTJ = AEQbTJ(str);
        java.lang.String direction = this.copydefault.getDirection();
        java.lang.String ordType = this.copydefault.getOrdType();
        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(this.copydefault.getOrdType());
        if (tacticsTypeAEQbTJ == null) {
            tacticsTypeAEQbTJ = TacticsType.TACTICS_GRDE;
        }
        return new TacticsData(ordType, algoId, instType, instId, null, null, false, coinTitle$default, tacticsTypeAEQbTJ, 0, C54797xVr.getCorrectShowLeverageWithSymbol$default(C54797xVr.copydefault, this.copydefault.getLever(), false, null, null, false, 30, null), null, 0L, null, null, null, null, null, shareDataAEQbTJ, null, null, coinTitle$default + " " + C56033xvF.iwGUEr(this.copydefault.getOrdType()), direction, null, null, null, null, null, this.copydefault.getRecurringList(), this.copydefault.getPortfolioList(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.copydefault.getCopyType(), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, strSubS$default, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -811861392, Integer.MAX_VALUE, -1, -1, -33, 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xtn.ActionBar.getFrequency$default(o.xtn$ActionBar, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):kotlin.Pair */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [71=4, 62=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ShareData AEQbTJ(java.lang.String str) {
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt;
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt2;
        java.lang.String str2;
        java.lang.String ordType = this.copydefault.getOrdType();
        java.lang.String plainString = null;
        switch (ordType.hashCode()) {
            case -1831183611:
                pairOLrzqt = !ordType.equals("spot_dca") ? C56390yDp.OLrzqt(null, null) : C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk), ContractDcaTriggerType.Companion.EZpvd(this.copydefault.getTriggerParams(), this.copydefault.getInvestCcy()));
                break;
            case -1402017003:
                if (ordType.equals("contract_dca")) {
                    pairOLrzqt = C55951xtd.Companion.EZpvd(this.copydefault.getCompletedCycles());
                    break;
                }
                break;
            case -1216369070:
                if (ordType.equals("smart_portfolio")) {
                    pairOLrzqt = C55924xtC.Companion.copydefault(this.copydefault.getPortfolioList(), this.copydefault.getInvestCcy());
                    break;
                }
                break;
            case -512749997:
                if (ordType.equals("contract_grid")) {
                    pairOLrzqt = C55959xtl.ActionBar.getTitleOne$default(C55959xtl.Companion, null, str, 1, null);
                    break;
                }
                break;
            case 3181382:
                if (!ordType.equals("grid")) {
                }
                break;
            case 1165749981:
                if (ordType.equals("recurring")) {
                    pairOLrzqt = C55961xtn.Companion.OLrzqt(this.copydefault.getRecurringList(), this.copydefault.getInstType(), this.copydefault.getInvestCcy());
                    break;
                }
                break;
        }
        java.lang.String strComponent1 = pairOLrzqt.component1();
        java.lang.String strComponent2 = pairOLrzqt.component2();
        java.lang.String ordType2 = this.copydefault.getOrdType();
        switch (ordType2.hashCode()) {
            case -1216369070:
                pairOLrzqt2 = !ordType2.equals("smart_portfolio") ? C56390yDp.OLrzqt(null, null) : C55924xtC.Companion.EZpvd(this.copydefault.getBalType(), this.copydefault.getDeltaRatio(), this.copydefault.getInterval());
                break;
            case -512749997:
                if (ordType2.equals("contract_grid")) {
                    C55959xtl.ActionBar actionBar = C55959xtl.Companion;
                    java.lang.String priceRangeCcy = this.copydefault.getPriceRangeCcy();
                    pairOLrzqt2 = actionBar.copydefault(priceRangeCcy == null ? "" : priceRangeCcy, this.copydefault.getInstType(), this.copydefault.getInstId(), this.copydefault.getMinPx(), this.copydefault.getMaxPx());
                    break;
                }
                break;
            case 3181382:
                if (!ordType2.equals("grid")) {
                }
                break;
            case 1165749981:
                if (ordType2.equals("recurring")) {
                    pairOLrzqt2 = C55961xtn.Companion.OLrzqt(this.copydefault.getPeriod(), this.copydefault.getRecurringDay(), this.copydefault.getRecurringTime(), this.copydefault.getRecurringHour(), (48 & 16) != 0 ? "" : null, (48 & 32) != 0 ? "" : null);
                    break;
                }
                break;
        }
        java.lang.String strComponent12 = pairOLrzqt2.component1();
        java.lang.String strComponent22 = pairOLrzqt2.component2();
        java.lang.String pnlRatio = this.KWHzl.getPnlRatio();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) pnlRatio)) {
            pnlRatio = C33129mqd.divS$default(this.copydefault.getTotalPnl(), this.copydefault.getInvestment(), null, null, null, 14, null);
        }
        java.lang.String str3 = pnlRatio;
        java.lang.String totalPnl = this.copydefault.getTotalPnl();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) totalPnl)) {
            java.util.ArrayList<RecurringListItem> recurringList = this.copydefault.getRecurringList();
            if (!(!recurringList.isEmpty())) {
                recurringList = null;
            }
            if (recurringList != null) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
                java.util.Iterator<T> it = recurringList.iterator();
                while (it.hasNext()) {
                    bigDecimalValueOf = bigDecimalValueOf.add(C33129mqd.EZpvd(((RecurringListItem) it.next()).getProfit()));
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
                }
                if (bigDecimalValueOf != null) {
                    plainString = bigDecimalValueOf.toPlainString();
                }
            }
            str2 = plainString != null ? plainString : "";
        } else {
            str2 = totalPnl;
        }
        return new ShareData(null, str3, null, str2, this.copydefault.getInvestCcy(), strComponent1, strComponent2, strComponent12, strComponent22, this.KWHzl.getAvatar(), this.KWHzl.getUsername(), null, null, null, null, 30725, null);
    }
}
