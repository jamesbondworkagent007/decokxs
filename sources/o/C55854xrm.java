package o;

import com.okinc.unify_trade.biz.DcdArbDetail;
import com.okinc.unify_trade.biz.DcdArbRecord;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import com.okinc.unify_trade.bot.dcd.config.DcdOptionType;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xrm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55854xrm implements InterfaceC54501xKt<java.util.List<? extends DcdArbDetail>, java.util.List<? extends DcdArbRecord>> {
    public final java.lang.String EZpvd;
    public final java.lang.String copydefault;

    public C55854xrm(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.copydefault = str2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* bridge */ /* synthetic */ java.util.List<? extends DcdArbRecord> KWHzl(java.util.List<? extends DcdArbDetail> list) {
        return KWHzl2((java.util.List<DcdArbDetail>) list);
    }

    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    public java.util.List<DcdArbRecord> KWHzl2(@NotNull java.util.List<DcdArbDetail> list) {
        java.util.List<DcdArbRecord> settleRecord;
        Intrinsics.checkNotNullParameter(list, "");
        DcdArbDetail dcdArbDetail = (DcdArbDetail) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (dcdArbDetail == null || (settleRecord = dcdArbDetail.getSettleRecord()) == null) {
            return yDY.AhwBna();
        }
        for (DcdArbRecord dcdArbRecord : settleRecord) {
            dcdArbRecord.setInsideItems(AEQbTJ(dcdArbRecord));
            DcdArbDetail dcdArbDetail2 = (DcdArbDetail) CollectionsKt___CollectionsKt.firstOrNull(list);
            dcdArbRecord.setCurrency(dcdArbDetail2 != null ? dcdArbDetail2.getCurrency() : null);
        }
        return settleRecord;
    }

    public final java.util.List<BotParamItemData> AEQbTJ(DcdArbRecord dcdArbRecord) {
        java.lang.String strAYXKKw;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.aKErDB);
        java.lang.String annualPnlRatio = dcdArbRecord.getAnnualPnlRatio();
        if (annualPnlRatio == null) {
            annualPnlRatio = "";
        }
        arrayList.add(new BotParamItemData(strAYXKKw2, C56033xvF.fmtBotPnlPercent$default(annualPnlRatio, true, 0, 4, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.DGUQLIekVPG);
        java.lang.String pnlRatio = dcdArbRecord.getPnlRatio();
        if (pnlRatio == null) {
            pnlRatio = "";
        }
        java.lang.String strFmtBotPnlPercent$default = C56033xvF.fmtBotPnlPercent$default(pnlRatio, true, 0, 4, null);
        java.lang.String pnlRatio2 = dcdArbRecord.getPnlRatio();
        if (pnlRatio2 == null) {
            pnlRatio2 = "";
        }
        arrayList.add(new BotParamItemData(strAYXKKw3, strFmtBotPnlPercent$default, null, null, false, false, null, null, null, false, 0, C56033xvF.OLrzqt((java.lang.Object) pnlRatio2), 0, 0, 14332, null));
        java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.tIwhY);
        java.lang.String pnlCcy = dcdArbRecord.getPnlCcy();
        if (pnlCcy == null) {
            pnlCcy = "";
        }
        java.lang.String str = strAYXKKw4 + " (" + pnlCcy + ")";
        java.lang.String pnl = dcdArbRecord.getPnl();
        java.lang.String str2 = pnl == null ? "" : pnl;
        java.lang.String pnlCcy2 = dcdArbRecord.getPnlCcy();
        java.lang.String strCopydefault = C56033xvF.copydefault(str2, pnlCcy2 == null ? "" : pnlCcy2, (88 & 4) != 0 ? false : false, (88 & 8) != 0 ? null : "8", (88 & 16) != 0 ? false : false, (88 & 32) == 0, (88 & 64) == 0 ? null : null);
        java.lang.String pnl2 = dcdArbRecord.getPnl();
        if (pnl2 == null) {
            pnl2 = "";
        }
        arrayList.add(new BotParamItemData(str, strCopydefault, null, null, false, false, null, null, null, false, 0, C56033xvF.OLrzqt((java.lang.Object) pnl2), 0, 0, 14332, null));
        if (Intrinsics.EZpvd((java.lang.Object) dcdArbRecord.getDcdOptionType(), (java.lang.Object) DcdOptionType.PUT.getMode())) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.iPSTqm);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.invokespecialDPHOMC);
        }
        java.lang.String strAEQbTJ = TaskDescription.AEQbTJ(this.copydefault).AEQbTJ();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = strAEQbTJ.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String str3 = strAYXKKw + " (" + upperCase + ")";
        java.lang.String str4 = this.EZpvd;
        java.lang.String str5 = this.copydefault;
        java.lang.String strike = dcdArbRecord.getStrike();
        arrayList.add(new BotParamItemData(str3, C56033xvF.getBotPrice$default(str4, str5, strike == null ? "" : strike, false, false, null, null, 120, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.DTg);
        java.lang.String upperCase2 = TaskDescription.AEQbTJ(this.copydefault).AEQbTJ().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        java.lang.String str6 = strAYXKKw5 + " (" + upperCase2 + ")";
        java.lang.String str7 = this.EZpvd;
        java.lang.String str8 = this.copydefault;
        java.lang.String settlePrice = dcdArbRecord.getSettlePrice();
        arrayList.add(new BotParamItemData(str6, C56033xvF.getBotPrice$default(str7, str8, settlePrice == null ? "" : settlePrice, false, false, null, null, 120, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C55688xof.Application.ActivityComposeUtilsKt);
        java.lang.String notionalCcy = dcdArbRecord.getNotionalCcy();
        if (notionalCcy == null) {
            notionalCcy = "";
        }
        java.lang.String str9 = strAYXKKw6 + " (" + notionalCcy + ")";
        java.lang.String notionalCcy2 = dcdArbRecord.getNotionalCcy();
        java.lang.String str10 = notionalCcy2 == null ? "" : notionalCcy2;
        java.lang.String notional = dcdArbRecord.getNotional();
        arrayList.add(new BotParamItemData(str9, C56033xvF.fmtBotValueBySymbol$default(str10, notional == null ? "" : notional, RoundingMode.DOWN, false, "8", false, null, null, null, null, null, 2024, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        return arrayList;
    }
}
