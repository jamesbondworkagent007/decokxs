package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ContractGridVo;
import com.okinc.unify_trade.biz.MarginPerCcyVo;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.UnitDisplayVo;
import com.okinc.unify_trade.bot.mapper.CoinMarginedCcyDisplay;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55889xsU {
    public static final C55889xsU copydefault = new C55889xsU();

    private C55889xsU() {
    }

    public final boolean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, BotVo botVo) {
        java.util.Map<java.lang.String, MarginPerCcyVo> mapKWHzl;
        BizInstrument bizInstrumentAhwBna;
        ContractGridVo contractGrid;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C55887xsS c55887xsS = new C55887xsS(str2, str);
        UnitDisplayVo unitDisplayVO = (botVo == null || (contractGrid = botVo.getContractGrid()) == null) ? null : contractGrid.getUnitDisplayVO();
        if (unitDisplayVO == null || (mapKWHzl = unitDisplayVO.getMarginPerCcy()) == null) {
            mapKWHzl = C56424yEw.KWHzl();
        }
        MarginPerCcyVo marginPerCcyVo = mapKWHzl.get("USDT");
        return xVL.EZpvd.copydefault(str2) && (bizInstrumentAhwBna = c55887xsS.AhwBna()) != null && Intrinsics.EZpvd(bizInstrumentAhwBna.isNegativeContract(), java.lang.Boolean.TRUE) && unitDisplayVO != null && unitDisplayVO.getCoinToggleCcy() && marginPerCcyVo != null && marginPerCcyVo.getInvestment().length() > 0 && marginPerCcyVo.getTotalPnl().length() > 0 && marginPerCcyVo.getPnlRatio().length() > 0 && marginPerCcyVo.getGridProfit().length() > 0 && marginPerCcyVo.getGridProfitRate().length() > 0 && marginPerCcyVo.getExtraMargin().length() > 0 && marginPerCcyVo.getExtraMarginSz().length() > 0 && marginPerCcyVo.getFloatProfit().length() > 0 && marginPerCcyVo.getFloatProfitRate().length() > 0 && marginPerCcyVo.getArbitrageApy().length() > 0 && marginPerCcyVo.getTotalApy().length() > 0;
    }

    public final int AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return CoinMarginedCcyDisplay.COIN.getIndex();
        }
        return C55991xuQ.KWHzl.copydefault(str).getIndex();
    }

    public final void EZpvd(@NotNull java.lang.String str, int i) {
        CoinMarginedCcyDisplay coinMarginedCcyDisplay;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return;
        }
        if (i != 0 && i == 1) {
            coinMarginedCcyDisplay = CoinMarginedCcyDisplay.USDT;
        } else {
            coinMarginedCcyDisplay = CoinMarginedCcyDisplay.COIN;
        }
        C55991xuQ.KWHzl.EZpvd(str, coinMarginedCcyDisplay);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        TradeCoinInfo tradeCoinInfoAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        return C56033xvF.getBotPnl$default(str, str2, str3, null, false, true, (interfaceC54581xNrCopydefault == null || (tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault.AhwBna("USDT")) == null) ? null : tradeCoinInfoAhwBna.getSizeDig(), false, null, null, null, 1944, null);
    }
}
