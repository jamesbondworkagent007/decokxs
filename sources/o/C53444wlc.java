package o;

import com.okinc.biz.TradeType;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.universal.data.TradeCloseAvailable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wlc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53444wlc extends AbstractC53377wkO {
    @Override // o.AbstractC53377wkO
    public void copydefault() {
        super.copydefault();
        values().AEQbTJ.setOnAmtPercentCallback(new Function2() { // from class: o.wkZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53444wlc.KWHzl(this.AEQbTJ, (C47988uAv) obj, (java.lang.Float) obj2);
            }
        });
    }

    public static final Unit KWHzl(C53444wlc c53444wlc, C47988uAv c47988uAv, java.lang.Float f) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (f != null && c47988uAv.zLjUOn()) {
            AbstractC48610uXu abstractC48610uXuValues = c53444wlc.values();
            abstractC48610uXuValues.KWHzl.EZpvd(abstractC48610uXuValues.AEQbTJ.EZpvd());
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC53377wkO
    public void EZpvd(@NotNull final java.lang.String str, @NotNull final TwapReq twapReq, @NotNull final Function1<? super TwapReq, Unit> function1) {
        java.lang.String posLong;
        java.lang.String strGEmmrt;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(twapReq, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (values().AEQbTJ.iwGUEr()) {
            final TacticsData tacticsDataValueOf = OLrzqt().valueOf();
            if (tacticsDataValueOf == null) {
                return;
            }
            if (C56059xvf.EZpvd.DbNXlk() && OLrzqt(tacticsDataValueOf)) {
                TradeCloseAvailable tradeCloseAvailableKWHzl = values().KWHzl.KWHzl();
                if (tradeCloseAvailableKWHzl != null) {
                    if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "clickBuy")) {
                        posLong = tradeCloseAvailableKWHzl.getPosShort();
                    } else {
                        posLong = tradeCloseAvailableKWHzl.getPosLong();
                    }
                    C54796xVq c54796xVq = C54796xVq.AEQbTJ;
                    java.lang.Float fValueOf = values().AEQbTJ.valueOf();
                    if (fValueOf == null || (strGEmmrt = C33129mqd.gEmmrt(fValueOf)) == null) {
                        strGEmmrt = "";
                    }
                    C54589xNz c54589xNz = C54589xNz.EZpvd;
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                    java.lang.String strCopydefault = c54796xVq.copydefault(strGEmmrt, posLong, true, interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, tacticsDataValueOf.getInstType(), tacticsDataValueOf.getInstId(), null, null, 12, null) : null);
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                    C54571xNh c54571xNhCreateStrategyTradeConverter$default = (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(tacticsDataValueOf.getInstType())) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(tacticsDataValueOf.getInstId())) == null) ? null : C54566xNc.createStrategyTradeConverter$default(bizInstrumentValueOf.getInstType(), bizInstrumentValueOf.getInstFamily(), null, 4, null);
                    if (c54571xNhCreateStrategyTradeConverter$default != null && (c54536xMLDjBIcL = c54571xNhCreateStrategyTradeConverter$default.djBIcL(strCopydefault)) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
                        str2 = safeString$default;
                    }
                    twapReq.setSz(str2);
                    if (C33129mqd.AEQbTJ(twapReq.getSzLimit(), twapReq.getSz())) {
                        C33134mqi.copydefault(C55688xof.Application.ActionBarDisplayOptions);
                        function1.invoke(null);
                        return;
                    } else {
                        function1.invoke(twapReq);
                        return;
                    }
                }
                function1.invoke(null);
                return;
            }
            values().KWHzl.OLrzqt(new Function1() { // from class: o.wla
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53444wlc.EZpvd(this.OLrzqt, twapReq, str, tacticsDataValueOf, function1, (MaxAvailableResp) obj);
                }
            });
            return;
        }
        function1.invoke(twapReq);
    }

    public static final Unit EZpvd(C53444wlc c53444wlc, TwapReq twapReq, java.lang.String str, TacticsData tacticsData, Function1 function1, MaxAvailableResp maxAvailableResp) {
        TwapReq first;
        java.lang.String sellSize;
        java.lang.String strGEmmrt;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        if (maxAvailableResp != null) {
            kotlin.Pair<TwapReq, java.lang.Boolean> pairCopydefault = c53444wlc.values().AEQbTJ.copydefault();
            if (pairCopydefault.getFirst() != null && (first = pairCopydefault.getFirst()) != null && first.equals(twapReq)) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "clickBuy")) {
                    sellSize = maxAvailableResp.getBuySize();
                } else {
                    sellSize = maxAvailableResp.getSellSize();
                }
                C54796xVq c54796xVq = C54796xVq.AEQbTJ;
                java.lang.Float fValueOf = c53444wlc.values().AEQbTJ.valueOf();
                java.lang.String str2 = "";
                if (fValueOf == null || (strGEmmrt = C33129mqd.gEmmrt(fValueOf)) == null) {
                    strGEmmrt = "";
                }
                boolean z = C49861uwY.Companion.copydefault().get() == TradeType.SELL_CLOSE;
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                java.lang.String strCopydefault = c54796xVq.copydefault(strGEmmrt, sellSize, z, interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, tacticsData.getInstType(), tacticsData.getInstId(), null, null, 12, null) : null);
                InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                C54571xNh c54571xNhCreateStrategyTradeConverter$default = (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(tacticsData.getInstType())) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(tacticsData.getInstId())) == null) ? null : C54566xNc.createStrategyTradeConverter$default(bizInstrumentValueOf.getInstType(), bizInstrumentValueOf.getInstFamily(), null, 4, null);
                if (c54571xNhCreateStrategyTradeConverter$default != null && (c54536xMLDjBIcL = c54571xNhCreateStrategyTradeConverter$default.djBIcL(strCopydefault)) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
                    str2 = safeString$default;
                }
                twapReq.setSz(str2);
                if (C33129mqd.AEQbTJ(twapReq.getSzLimit(), twapReq.getSz())) {
                    C33134mqi.copydefault(C55688xof.Application.ActionBarDisplayOptions);
                    function1.invoke(null);
                } else {
                    function1.invoke(twapReq);
                }
            } else {
                function1.invoke(null);
            }
        } else {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }

    public final boolean OLrzqt(TacticsData tacticsData) {
        return (Intrinsics.EZpvd((java.lang.Object) tacticsData.getSide(), (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) tacticsData.getPosSide(), (java.lang.Object) "short")) || (Intrinsics.EZpvd((java.lang.Object) tacticsData.getSide(), (java.lang.Object) "sell") && Intrinsics.EZpvd((java.lang.Object) tacticsData.getPosSide(), (java.lang.Object) "long"));
    }
}
