package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.subscribe.ArbitrageFundingResp;
import com.okinc.unify_trade.biz.subscribe.ArbitrageRespData;
import com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadInverseResp;
import com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadLinearResp;
import com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadResp;
import com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData;
import com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56094xwN {
    public java.lang.Exception EZpvd;
    public InterfaceC55701xos<ArbitrageRespData> OLrzqt;
    public volatile int gEmmrt;
    public final xCF AEQbTJ = new xCF();
    public final xCE valueOf = new xCE();
    public java.util.ArrayList<SpreadArbitrageData> AYXKKw = new java.util.ArrayList<>();
    public java.util.ArrayList<FundingRateArbitrageData> copydefault = new java.util.ArrayList<>();
    public boolean KWHzl = true;

    public final void KWHzl(@NotNull InterfaceC55701xos<ArbitrageRespData> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        this.OLrzqt = interfaceC55701xos;
        copydefault();
        AEQbTJ();
    }

    public final void EZpvd() {
        InterfaceC55701xos<ArbitrageRespData> interfaceC55701xos;
        if (this.gEmmrt != 2 || (interfaceC55701xos = this.OLrzqt) == null) {
            return;
        }
        interfaceC55701xos.EZpvd(this.KWHzl, new ArbitrageRespData(this.AYXKKw, this.copydefault), this.EZpvd);
    }

    public final void copydefault() {
        xCF xcf = this.AEQbTJ;
        xcf.KWHzl(new Function1() { // from class: o.xwL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56094xwN.copydefault(this.copydefault, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xcf, 0L, 1, null);
    }

    public static final Unit copydefault(C56094xwN c56094xwN, ResponseData responseData) {
        java.util.List<FundingRateArbitrageData> usd;
        java.util.List<FundingRateArbitrageData> usdc;
        java.util.List<FundingRateArbitrageData> usdt;
        java.util.List<FundingRateArbitrageData> usd2;
        java.util.List<FundingRateArbitrageData> usdc2;
        java.util.List<FundingRateArbitrageData> usdt2;
        Intrinsics.checkNotNullParameter(responseData, "");
        c56094xwN.gEmmrt++;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            ArbitrageFundingResp arbitrageFundingResp = (ArbitrageFundingResp) responseData.getData();
            if (arbitrageFundingResp != null && (usdt2 = arbitrageFundingResp.getUSDT()) != null) {
                for (FundingRateArbitrageData fundingRateArbitrageData : usdt2) {
                    fundingRateArbitrageData.setCtType("linear");
                    fundingRateArbitrageData.setCcyType("USDT");
                }
            }
            ArbitrageFundingResp arbitrageFundingResp2 = (ArbitrageFundingResp) responseData.getData();
            if (arbitrageFundingResp2 != null && (usdc2 = arbitrageFundingResp2.getUSDC()) != null) {
                for (FundingRateArbitrageData fundingRateArbitrageData2 : usdc2) {
                    fundingRateArbitrageData2.setCtType("linear");
                    fundingRateArbitrageData2.setCcyType("USDC");
                }
            }
            ArbitrageFundingResp arbitrageFundingResp3 = (ArbitrageFundingResp) responseData.getData();
            if (arbitrageFundingResp3 != null && (usd2 = arbitrageFundingResp3.getUSD()) != null) {
                for (FundingRateArbitrageData fundingRateArbitrageData3 : usd2) {
                    fundingRateArbitrageData3.setCtType("inverse");
                    fundingRateArbitrageData3.setCcyType("USD");
                }
            }
            ArbitrageFundingResp arbitrageFundingResp4 = (ArbitrageFundingResp) responseData.getData();
            if (arbitrageFundingResp4 != null && (usdt = arbitrageFundingResp4.getUSDT()) != null) {
                c56094xwN.copydefault.addAll(usdt);
            }
            ArbitrageFundingResp arbitrageFundingResp5 = (ArbitrageFundingResp) responseData.getData();
            if (arbitrageFundingResp5 != null && (usdc = arbitrageFundingResp5.getUSDC()) != null) {
                c56094xwN.copydefault.addAll(usdc);
            }
            ArbitrageFundingResp arbitrageFundingResp6 = (ArbitrageFundingResp) responseData.getData();
            if (arbitrageFundingResp6 != null && (usd = arbitrageFundingResp6.getUSD()) != null) {
                c56094xwN.copydefault.addAll(usd);
            }
        }
        if (responseData.getCode() != 0) {
            c56094xwN.KWHzl = false;
            c56094xwN.EZpvd = new BizApiException(responseData.getMsg(), java.lang.String.valueOf(responseData.getCode()), null, null, null, 28, null);
        }
        c56094xwN.EZpvd();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        xCE xce = this.valueOf;
        xce.KWHzl(new Function1() { // from class: o.xwM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56094xwN.EZpvd(this.EZpvd, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xce, 0L, 1, null);
    }

    public static final Unit EZpvd(C56094xwN c56094xwN, ResponseData responseData) {
        ArbitrageSpreadInverseResp usd;
        java.util.List<SpreadArbitrageData> futures_spot;
        ArbitrageSpreadInverseResp usd2;
        java.util.List<SpreadArbitrageData> futures_futures;
        ArbitrageSpreadLinearResp usdc;
        java.util.List<SpreadArbitrageData> futures_spot2;
        ArbitrageSpreadLinearResp usdc2;
        java.util.List<SpreadArbitrageData> futures_futures2;
        ArbitrageSpreadLinearResp usdt;
        java.util.List<SpreadArbitrageData> futures_spot3;
        ArbitrageSpreadLinearResp usdt2;
        java.util.List<SpreadArbitrageData> futures_futures3;
        ArbitrageSpreadInverseResp usd3;
        java.util.List<SpreadArbitrageData> futures_spot4;
        ArbitrageSpreadInverseResp usd4;
        java.util.List<SpreadArbitrageData> futures_futures4;
        ArbitrageSpreadLinearResp usdc3;
        java.util.List<SpreadArbitrageData> futures_spot5;
        ArbitrageSpreadLinearResp usdc4;
        java.util.List<SpreadArbitrageData> futures_futures5;
        ArbitrageSpreadLinearResp usdt3;
        java.util.List<SpreadArbitrageData> futures_spot6;
        ArbitrageSpreadLinearResp usdt4;
        java.util.List<SpreadArbitrageData> futures_futures6;
        Intrinsics.checkNotNullParameter(responseData, "");
        c56094xwN.gEmmrt++;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            ArbitrageSpreadResp arbitrageSpreadResp = (ArbitrageSpreadResp) responseData.getData();
            if (arbitrageSpreadResp != null && (usdt4 = arbitrageSpreadResp.getUSDT()) != null && (futures_futures6 = usdt4.getFutures_futures()) != null) {
                for (SpreadArbitrageData spreadArbitrageData : futures_futures6) {
                    spreadArbitrageData.setCtType("linear");
                    spreadArbitrageData.setCcyType("USDT");
                    spreadArbitrageData.setArbitrageType("futures_futures");
                }
            }
            ArbitrageSpreadResp arbitrageSpreadResp2 = (ArbitrageSpreadResp) responseData.getData();
            if (arbitrageSpreadResp2 != null && (usdt3 = arbitrageSpreadResp2.getUSDT()) != null && (futures_spot6 = usdt3.getFutures_spot()) != null) {
                for (SpreadArbitrageData spreadArbitrageData2 : futures_spot6) {
                    spreadArbitrageData2.setCtType("linear");
                    spreadArbitrageData2.setCcyType("USDT");
                    spreadArbitrageData2.setArbitrageType("futures_spot");
                }
            }
            ArbitrageSpreadResp arbitrageSpreadResp3 = (ArbitrageSpreadResp) responseData.getData();
            if (arbitrageSpreadResp3 != null && (usdc4 = arbitrageSpreadResp3.getUSDC()) != null && (futures_futures5 = usdc4.getFutures_futures()) != null) {
                for (SpreadArbitrageData spreadArbitrageData3 : futures_futures5) {
                    spreadArbitrageData3.setCtType("linear");
                    spreadArbitrageData3.setCcyType("USDC");
                    spreadArbitrageData3.setArbitrageType("futures_futures");
                }
            }
            ArbitrageSpreadResp arbitrageSpreadResp4 = (ArbitrageSpreadResp) responseData.getData();
            if (arbitrageSpreadResp4 != null && (usdc3 = arbitrageSpreadResp4.getUSDC()) != null && (futures_spot5 = usdc3.getFutures_spot()) != null) {
                for (SpreadArbitrageData spreadArbitrageData4 : futures_spot5) {
                    spreadArbitrageData4.setCtType("linear");
                    spreadArbitrageData4.setCcyType("USDC");
                    spreadArbitrageData4.setArbitrageType("futures_spot");
                }
            }
            ArbitrageSpreadResp arbitrageSpreadResp5 = (ArbitrageSpreadResp) responseData.getData();
            if (arbitrageSpreadResp5 != null && (usd4 = arbitrageSpreadResp5.getUSD()) != null && (futures_futures4 = usd4.getFutures_futures()) != null) {
                for (SpreadArbitrageData spreadArbitrageData5 : futures_futures4) {
                    spreadArbitrageData5.setCtType("inverse");
                    spreadArbitrageData5.setCcyType("USD");
                    spreadArbitrageData5.setArbitrageType("futures_futures");
                }
            }
            ArbitrageSpreadResp arbitrageSpreadResp6 = (ArbitrageSpreadResp) responseData.getData();
            if (arbitrageSpreadResp6 != null && (usd3 = arbitrageSpreadResp6.getUSD()) != null && (futures_spot4 = usd3.getFutures_spot()) != null) {
                for (SpreadArbitrageData spreadArbitrageData6 : futures_spot4) {
                    spreadArbitrageData6.setCtType("inverse");
                    spreadArbitrageData6.setCcyType("USD");
                    spreadArbitrageData6.setArbitrageType("futures_spot");
                }
            }
            ArbitrageSpreadResp arbitrageSpreadResp7 = (ArbitrageSpreadResp) responseData.getData();
            if (arbitrageSpreadResp7 != null && (usdt2 = arbitrageSpreadResp7.getUSDT()) != null && (futures_futures3 = usdt2.getFutures_futures()) != null) {
                c56094xwN.AYXKKw.addAll(futures_futures3);
            }
            ArbitrageSpreadResp arbitrageSpreadResp8 = (ArbitrageSpreadResp) responseData.getData();
            if (arbitrageSpreadResp8 != null && (usdt = arbitrageSpreadResp8.getUSDT()) != null && (futures_spot3 = usdt.getFutures_spot()) != null) {
                c56094xwN.AYXKKw.addAll(futures_spot3);
            }
            ArbitrageSpreadResp arbitrageSpreadResp9 = (ArbitrageSpreadResp) responseData.getData();
            if (arbitrageSpreadResp9 != null && (usdc2 = arbitrageSpreadResp9.getUSDC()) != null && (futures_futures2 = usdc2.getFutures_futures()) != null) {
                c56094xwN.AYXKKw.addAll(futures_futures2);
            }
            ArbitrageSpreadResp arbitrageSpreadResp10 = (ArbitrageSpreadResp) responseData.getData();
            if (arbitrageSpreadResp10 != null && (usdc = arbitrageSpreadResp10.getUSDC()) != null && (futures_spot2 = usdc.getFutures_spot()) != null) {
                c56094xwN.AYXKKw.addAll(futures_spot2);
            }
            ArbitrageSpreadResp arbitrageSpreadResp11 = (ArbitrageSpreadResp) responseData.getData();
            if (arbitrageSpreadResp11 != null && (usd2 = arbitrageSpreadResp11.getUSD()) != null && (futures_futures = usd2.getFutures_futures()) != null) {
                c56094xwN.AYXKKw.addAll(futures_futures);
            }
            ArbitrageSpreadResp arbitrageSpreadResp12 = (ArbitrageSpreadResp) responseData.getData();
            if (arbitrageSpreadResp12 != null && (usd = arbitrageSpreadResp12.getUSD()) != null && (futures_spot = usd.getFutures_spot()) != null) {
                c56094xwN.AYXKKw.addAll(futures_spot);
            }
        }
        if (responseData.getCode() != 0) {
            c56094xwN.KWHzl = false;
            c56094xwN.EZpvd = new BizApiException(responseData.getMsg(), java.lang.String.valueOf(responseData.getCode()), null, null, null, 28, null);
        }
        c56094xwN.EZpvd();
        return Unit.INSTANCE;
    }
}
