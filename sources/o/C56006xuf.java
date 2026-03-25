package o;

import androidx.lifecycle.LiveData;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.bot.data.BotRemindData;
import com.okinc.unify_trade.bot.data.TacticsClickableInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsCoinsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideLineItemData;
import com.okinc.unify_trade.bot.util.recurring.RecurringCycleConfigNew;
import com.okinc.unify_trade.bot.util.recurring.RecurringHourlyConfig;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC56005xue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xuf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56006xuf implements InterfaceC56005xue {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final java.lang.String AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public StrategyReqGroup KWHzl;
    public final java.lang.String copydefault;
    public final C55968xtu djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(StrategyReqGroup strategyReqGroup) {
        this.KWHzl = strategyReqGroup;
    }

    public java.lang.Void copydefault() {
        return null;
    }

    public C56006xuf(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.xud
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C56006xuf.copydefault(this.OLrzqt);
            }
        });
        C55968xtu c55968xtu = new C55968xtu();
        c55968xtu.EZpvd();
        this.djBIcL = c55968xtu;
    }

    @Override // o.InterfaceC56005xue
    public void EZpvd(@NotNull java.lang.Object obj) {
        InterfaceC56005xue.ActionBar.AEQbTJ(this, obj);
    }

    @Override // o.InterfaceC56005xue
    public /* synthetic */ LiveData OLrzqt() {
        return (LiveData) copydefault();
    }

    /* JADX INFO: renamed from: o.xuf$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xuf.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    private final C55887xsS gEmmrt() {
        return (C55887xsS) this.EZpvd.getValue();
    }

    public static final C55887xsS copydefault(C56006xuf c56006xuf) {
        RecurringOrderData recurringOrderData;
        C55887xsS c55887xsS = new C55887xsS(c56006xuf.AEQbTJ, c56006xuf.copydefault);
        StrategyReqGroup strategyReqGroup = c56006xuf.KWHzl;
        c55887xsS.gEmmrt((strategyReqGroup == null || (recurringOrderData = strategyReqGroup.getRecurringOrderData()) == null) ? null : recurringOrderData.getTradeQuoteCcy());
        return c55887xsS;
    }

    @Override // o.InterfaceC56005xue
    public java.util.List<java.lang.Object> AEQbTJ() {
        RecurringOrderData recurringOrderData;
        java.util.ArrayList arrayList;
        CoinRatioParam coinRatioParam;
        java.lang.String ccy;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        StrategyReqGroup strategyReqGroup = this.KWHzl;
        if (strategyReqGroup == null || (recurringOrderData = strategyReqGroup.getRecurringOrderData()) == null) {
            return new java.util.ArrayList();
        }
        arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatRepeatMode), this.djBIcL.EZpvd(C33129mqd.AhwBna(recurringOrderData.getPeriod()), C33129mqd.AhwBna(recurringOrderData.getRecurringDay()), C33129mqd.AhwBna(recurringOrderData.getRecurringTime()), recurringOrderData.isBuyNow()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        if (!recurringOrderData.isBuyNow()) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.isAvailable);
            C56046xvS c56046xvS = C56046xvS.AEQbTJ;
            java.lang.String strOLrzqt = RecurringCycleConfigNew.Companion.OLrzqt(C33129mqd.AhwBna(recurringOrderData.getPeriod()));
            java.lang.String strAddS$default = C33129mqd.addS$default(java.lang.Integer.valueOf(C33129mqd.AhwBna(recurringOrderData.getRecurringDay())), 1, null, null, null, 14, null);
            java.lang.String strAEQbTJ = RecurringHourlyConfig.Companion.AEQbTJ(C33129mqd.AhwBna(recurringOrderData.getRecurringDay()));
            java.lang.String recurringTime = recurringOrderData.getRecurringTime();
            if (recurringTime == null) {
                recurringTime = "";
            }
            arrayList2.add(new TacticsInsideItemData(strAYXKKw, c56046xvS.OLrzqt(strOLrzqt, strAddS$default, strAEQbTJ, recurringTime), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        java.util.List<CoinRatioParam> recurringList = recurringOrderData.getRecurringList();
        if (recurringList != null && C33129mqd.KWHzl((java.util.Collection) recurringList)) {
            java.util.List<CoinRatioParam> recurringList2 = recurringOrderData.getRecurringList();
            if (recurringList2 != null && C33129mqd.AEQbTJ(java.lang.Integer.valueOf(recurringList2.size()), 1)) {
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatApi21CallbackProxy);
                java.util.List<CoinRatioParam> recurringList3 = recurringOrderData.getRecurringList();
                if (recurringList3 == null) {
                    recurringList3 = yDY.AhwBna();
                }
                arrayList2.add(new TacticsCoinsInsideItemData(strAYXKKw2, recurringList3, 0, 0, 12, null));
            } else {
                java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.iflRwn);
                java.util.List<CoinRatioParam> recurringList4 = recurringOrderData.getRecurringList();
                arrayList2.add(new TacticsInsideItemData(strAYXKKw3, (recurringList4 == null || (coinRatioParam = recurringList4.get(0)) == null || (ccy = coinRatioParam.getCcy()) == null) ? "" : ccy, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            }
        }
        java.util.List<CoinRatioParam> recurringList5 = recurringOrderData.getRecurringList();
        if (recurringList5 != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : recurringList5) {
                CoinRatioParam coinRatioParam2 = (CoinRatioParam) obj;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) coinRatioParam2.getMinPrice()) || C33129mqd.OLrzqt((java.lang.CharSequence) coinRatioParam2.getMaxPrice())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            if (arrayList.size() == 1) {
                arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.UlpNxW), C56046xvS.AEQbTJ.KWHzl(((CoinRatioParam) arrayList.get(0)).getCcy(), ((CoinRatioParam) arrayList.get(0)).getMinPrice(), ((CoinRatioParam) arrayList.get(0)).getMaxPrice()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            } else {
                arrayList2.add(new TacticsClickableInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.UlpNxW), C33069mpW.copydefault(C55688xof.Application.sWlOSi, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Integer.valueOf(arrayList.size())))))));
            }
        }
        java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.gRtANS);
        java.lang.String stgyName = recurringOrderData.getStgyName();
        TacticsInsideItemData tacticsInsideItemData = new TacticsInsideItemData(strAYXKKw4, stgyName == null ? "" : stgyName, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        TacticsInsideLineItemData tacticsInsideLineItemData = new TacticsInsideLineItemData(0, 0, 0, 4, null);
        BotRemindData botRemindData = new BotRemindData(C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomAction1), 0, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), null, 10, null);
        java.lang.String strKWHzl = gEmmrt().KWHzl("recurring");
        TacticsInsideItemData tacticsInsideItemData2 = strKWHzl != null ? new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhenfullyDrawnReporter1), strKWHzl, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null) : null;
        arrayList2.add(tacticsInsideItemData);
        if (tacticsInsideItemData2 != null) {
            arrayList2.add(tacticsInsideItemData2);
        }
        arrayList2.add(tacticsInsideLineItemData);
        arrayList2.add(botRemindData);
        return arrayList2;
    }

    public java.lang.String AhwBna() {
        RecurringOrderData recurringOrderData;
        java.lang.String investCcy;
        StrategyReqGroup strategyReqGroup = this.KWHzl;
        return (strategyReqGroup == null || (recurringOrderData = strategyReqGroup.getRecurringOrderData()) == null || (investCcy = recurringOrderData.getInvestCcy()) == null) ? "" : investCcy;
    }

    @Override // o.InterfaceC56005xue
    public java.lang.String EZpvd() {
        java.lang.String strAkhnZx = gEmmrt().AkhnZx();
        return (strAkhnZx == null || strAkhnZx.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) ? AhwBna() : strAkhnZx;
    }

    @Override // o.InterfaceC56005xue
    public java.lang.String KWHzl() {
        java.lang.String strAEQbTJ;
        RecurringOrderData recurringOrderData;
        RecurringOrderData recurringOrderData2;
        java.lang.String investCcy;
        RecurringOrderData recurringOrderData3;
        StrategyReqGroup strategyReqGroup = this.KWHzl;
        java.lang.String amt = (strategyReqGroup == null || (recurringOrderData3 = strategyReqGroup.getRecurringOrderData()) == null) ? null : recurringOrderData3.getAmt();
        java.lang.String str = amt == null ? "" : amt;
        StrategyReqGroup strategyReqGroup2 = this.KWHzl;
        java.lang.String str2 = (strategyReqGroup2 == null || (recurringOrderData2 = strategyReqGroup2.getRecurringOrderData()) == null || (investCcy = recurringOrderData2.getInvestCcy()) == null) ? "" : investCcy;
        StrategyReqGroup strategyReqGroup3 = this.KWHzl;
        if (strategyReqGroup3 == null || (recurringOrderData = strategyReqGroup3.getRecurringOrderData()) == null || (strAEQbTJ = recurringOrderData.getTradeQuoteCcy()) == null) {
            strAEQbTJ = C56033xvF.AEQbTJ(this.AEQbTJ, this.copydefault);
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "--";
        }
        return C56033xvF.fmtBotValueBySymbol$default(str2, str, RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null) + " " + strAEQbTJ;
    }
}
