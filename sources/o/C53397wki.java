package o;

import com.okinc.biz.TradeType;
import com.okinc.tradingbot.impl.order.strategy.twap.base.TwapTradePresenter;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.universal.data.TradeCloseAvailable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53397wki extends AbstractC53400wkl {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC53400wkl
    public void OLrzqt(@NotNull final java.lang.String str, @NotNull final TwapReq twapReq, @NotNull final Function1<? super TwapReq, Unit> function1) {
        java.lang.String posLong;
        java.lang.String strGEmmrt;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(twapReq, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (((AbstractC48432uRe) gGvvIC()).AEQbTJ.iwGUEr()) {
            if (C56059xvf.EZpvd.DbNXlk() && C49861uwY.Companion.copydefault().get() == TradeType.SELL_CLOSE) {
                TradeCloseAvailable tradeCloseAvailableFetchVPNInfo = fetchVPNInfo();
                if (tradeCloseAvailableFetchVPNInfo != null) {
                    if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "clickBuy")) {
                        posLong = tradeCloseAvailableFetchVPNInfo.getPosShort();
                    } else {
                        posLong = tradeCloseAvailableFetchVPNInfo.getPosLong();
                    }
                    C54796xVq c54796xVq = C54796xVq.AEQbTJ;
                    java.lang.Float fValueOf = ((AbstractC48432uRe) gGvvIC()).AEQbTJ.valueOf();
                    if (fValueOf == null || (strGEmmrt = C33129mqd.gEmmrt(fValueOf)) == null) {
                        strGEmmrt = "";
                    }
                    java.lang.String strCopydefault = c54796xVq.copydefault(strGEmmrt, posLong, true, ((TwapTradePresenter) dxcTrN()).fvQaOB().AhwBna());
                    C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(((TwapTradePresenter) dxcTrN()).fvQaOB(), null, false, 3, null);
                    if (c54571xNhCreateAmtConvert$default != null && (c54536xMLDjBIcL = c54571xNhCreateAmtConvert$default.djBIcL(strCopydefault)) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
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
            AEQbTJ(new Function1() { // from class: o.wkg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53397wki.EZpvd(this.KWHzl, twapReq, str, function1, (MaxAvailableResp) obj);
                }
            });
            return;
        }
        function1.invoke(twapReq);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C53397wki c53397wki, TwapReq twapReq, java.lang.String str, Function1 function1, MaxAvailableResp maxAvailableResp) {
        TwapReq first;
        java.lang.String sellSize;
        java.lang.String strGEmmrt;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        if (maxAvailableResp != null) {
            kotlin.Pair<TwapReq, java.lang.Boolean> pairCopydefault = ((AbstractC48432uRe) c53397wki.gGvvIC()).AEQbTJ.copydefault();
            if (pairCopydefault.getFirst() != null && (first = pairCopydefault.getFirst()) != null && first.equals(twapReq)) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "clickBuy")) {
                    sellSize = maxAvailableResp.getBuySize();
                } else {
                    sellSize = maxAvailableResp.getSellSize();
                }
                C54796xVq c54796xVq = C54796xVq.AEQbTJ;
                java.lang.Float fValueOf = ((AbstractC48432uRe) c53397wki.gGvvIC()).AEQbTJ.valueOf();
                java.lang.String str2 = "";
                if (fValueOf == null || (strGEmmrt = C33129mqd.gEmmrt(fValueOf)) == null) {
                    strGEmmrt = "";
                }
                java.lang.String strCopydefault = c54796xVq.copydefault(strGEmmrt, sellSize, C49861uwY.Companion.copydefault().get() == TradeType.SELL_CLOSE, ((TwapTradePresenter) c53397wki.dxcTrN()).fvQaOB().AhwBna());
                C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(((TwapTradePresenter) c53397wki.dxcTrN()).fvQaOB(), null, false, 3, null);
                if (c54571xNhCreateAmtConvert$default != null && (c54536xMLDjBIcL = c54571xNhCreateAmtConvert$default.djBIcL(strCopydefault)) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
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

    @Override // o.AbstractC48165uHj, o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C56028xvA.registerBotFragmentTrack$default(this, "ContractTwapBaseFragment", new kotlin.Pair[0], null, 8, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
