package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.CoinStackItemData;
import com.okinc.unify_trade.bot.data.InformationFragmentData;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.ItemDataToggle;
import com.okinc.unify_trade.bot.util.signalBot.SignalBotAdvancedData;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55967xtt implements InterfaceC54501xKt<StrategyDetailsResponse, InformationFragmentData> {
    public final java.util.ArrayList<java.lang.Object> OLrzqt = new java.util.ArrayList<>();

    public static final SignalBotAdvancedData OLrzqt(StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String subOrdType = strategyDetailsResponse.getSubOrdType();
        if (subOrdType == null) {
            subOrdType = "";
        }
        java.lang.String str = subOrdType;
        java.lang.String ratio = strategyDetailsResponse.getRatio();
        EntrySignalOrderAmtParam signalOrderAmtParam = strategyDetailsResponse.getSignalOrderAmtParam();
        ExitSignalOrderAmtParam signalBotOrderStopParam = strategyDetailsResponse.getSignalBotOrderStopParam();
        java.lang.Boolean allowMultipleEntry = strategyDetailsResponse.getAllowMultipleEntry();
        return new SignalBotAdvancedData(str, ratio, signalOrderAmtParam, signalBotOrderStopParam, allowMultipleEntry != null ? allowMultipleEntry.booleanValue() : false);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    @Override // o.InterfaceC54501xKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InformationFragmentData KWHzl(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String tradeSymbol;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        java.util.ArrayList<java.lang.Object> arrayList = this.OLrzqt;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.apHBvG);
        java.lang.String signalChanName = strategyDetailsResponse.getSignalChanName();
        arrayList.add(new ItemData(strAYXKKw, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, true, "signal_intro", (java.lang.String) null, false, signalChanName == null ? "" : signalChanName, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16757758, (DefaultConstructorMarker) null));
        int iAhwBna = C33129mqd.AhwBna(strategyDetailsResponse.getSymbolsNumber());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(iAhwBna);
        for (int i = 0; i < iAhwBna; i++) {
            java.util.List<java.lang.String> instIds = strategyDetailsResponse.getInstIds();
            if (!C33129mqd.gEmmrt(java.lang.Integer.valueOf(i), instIds != null ? java.lang.Integer.valueOf(instIds.size()) : null) || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
                tradeSymbol = "";
            } else {
                java.util.List<java.lang.String> instIds2 = strategyDetailsResponse.getInstIds();
                BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SWAP", instIds2 != null ? instIds2.get(i) : null, null, null, 12, null);
                if (suggestedInstrument$default == null || (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) == null) {
                }
            }
            arrayList2.add(tradeSymbol);
        }
        this.OLrzqt.add(new CoinStackItemData(C33070mpX.AYXKKw(C55688xof.Application.HJWChPfrwjPh), arrayList2, C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList2.size()), 1)));
        java.util.ArrayList<java.lang.Object> arrayList3 = this.OLrzqt;
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.GVpNrsfQMcgE);
        java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId());
        java.lang.String totalAmt = strategyDetailsResponse.getTotalAmt();
        arrayList3.add(new ItemData(strAYXKKw2, C56033xvF.fmtBotValueBySymbol$default(strAEQbTJ, totalAmt == null ? "" : totalAmt, RoundingMode.DOWN, true, null, false, null, null, null, null, null, 2032, null), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
        this.OLrzqt.add(new ItemData((java.lang.String) null, (java.lang.String) null, true, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777211, (DefaultConstructorMarker) null));
        java.util.ArrayList<java.lang.Object> arrayList4 = this.OLrzqt;
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.OsDdEf);
        C56048xvU c56048xvU = C56048xvU.EZpvd;
        arrayList4.add(new ItemData(strAYXKKw3, c56048xvU.EZpvd(OLrzqt(strategyDetailsResponse)), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
        this.OLrzqt.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.newSession), c56048xvU.OLrzqt(OLrzqt(strategyDetailsResponse)), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
        this.OLrzqt.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.mayLaunchUrl), c56048xvU.copydefault(OLrzqt(strategyDetailsResponse)), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
        return new InformationFragmentData(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), null, null, null, null, this.OLrzqt, strategyDetailsResponse.getInvestCcy(), null, null, null, 1852, null);
    }
}
