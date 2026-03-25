package o;

import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.features.contractinfo.ui.model.ContractInfoItemType;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C35964oKf;
import o.C55688xof;
import o.oPY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oPW extends AbstractC49400uno<ActionBar, Application> {
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return OLrzqt((ActionBar) obj, (Continuation<? super Application>) continuation);
    }

    @yCM
    public oPW(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
    }

    public static final class ActionBar {
        public static final int OLrzqt = AbstractC54531xLw.copydefault | MarketCoinInfo.$stable;
        public final AbstractC54531xLw AEQbTJ;
        public final MarketCoinInfo KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, MarketCoinInfo marketCoinInfo, AbstractC54531xLw abstractC54531xLw, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                marketCoinInfo = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                abstractC54531xLw = actionBar.AEQbTJ;
            }
            return actionBar.EZpvd(marketCoinInfo, abstractC54531xLw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull MarketCoinInfo marketCoinInfo, AbstractC54531xLw abstractC54531xLw) {
            Intrinsics.checkNotNullParameter(marketCoinInfo, "");
            return new ActionBar(marketCoinInfo, abstractC54531xLw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC54531xLw KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MarketCoinInfo OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            AbstractC54531xLw abstractC54531xLw = this.AEQbTJ;
            return (iHashCode * 31) + (abstractC54531xLw == null ? 0 : abstractC54531xLw.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(marketCoinInfo=" + this.KWHzl + ", biz=" + this.AEQbTJ + ")";
        }

        public ActionBar(@NotNull MarketCoinInfo marketCoinInfo, AbstractC54531xLw abstractC54531xLw) {
            Intrinsics.checkNotNullParameter(marketCoinInfo, "");
            this.KWHzl = marketCoinInfo;
            this.AEQbTJ = abstractC54531xLw;
        }
    }

    public static final class Application {
        public final java.util.List<oPY> KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oPW$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.KWHzl;
            }
            if ((i & 2) != 0) {
                str = application.OLrzqt;
            }
            if ((i & 4) != 0) {
                str2 = application.copydefault;
            }
            return application.KWHzl(list, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<oPY> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull java.util.List<oPY> list, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Application(list, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(items=" + this.KWHzl + ", instFamily=" + this.OLrzqt + ", marginCurrency=" + this.copydefault + ")";
        }

        public Application(@NotNull java.util.List<oPY> list, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = list;
            this.OLrzqt = str;
            this.copydefault = str2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [54=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r0.equals("SPOT") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r0.equals("MARGIN") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull ActionBar actionBar, @NotNull Continuation<? super Application> continuation) {
        MarketCoinInfo marketCoinInfoOLrzqt = actionBar.OLrzqt();
        AbstractC54531xLw abstractC54531xLwKWHzl = actionBar.KWHzl();
        java.lang.String instrumentType = marketCoinInfoOLrzqt.getInstrumentType();
        switch (instrumentType.hashCode()) {
            case -2027980370:
                break;
            case -1956807563:
                if (instrumentType.equals("OPTION")) {
                    return AEQbTJ(marketCoinInfoOLrzqt, abstractC54531xLwKWHzl);
                }
                return new Application(yDY.AhwBna(), "", "");
            case 2552066:
                break;
            case 2558355:
                if (instrumentType.equals("SWAP")) {
                    return copydefault(marketCoinInfoOLrzqt, abstractC54531xLwKWHzl);
                }
                return new Application(yDY.AhwBna(), "", "");
            case 214415088:
                if (instrumentType.equals("FUTURES")) {
                    return EZpvd(marketCoinInfoOLrzqt, abstractC54531xLwKWHzl);
                }
                return new Application(yDY.AhwBna(), "", "");
            default:
                return new Application(yDY.AhwBna(), "", "");
        }
        return OLrzqt(marketCoinInfoOLrzqt, abstractC54531xLwKWHzl);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Application OLrzqt(MarketCoinInfo marketCoinInfo, AbstractC54531xLw abstractC54531xLw) {
        java.lang.String strEZpvd;
        java.lang.String marginSymbol;
        java.lang.String str;
        java.lang.String lotSize;
        java.lang.String localized$default;
        java.lang.String tickerSize;
        java.lang.String instFamily;
        BizInstrument bizInstrumentValueOf = abstractC54531xLw != null ? abstractC54531xLw.valueOf(marketCoinInfo.getInstrumentId()) : null;
        SpotInstrument spotInstrument = bizInstrumentValueOf instanceof SpotInstrument ? (SpotInstrument) bizInstrumentValueOf : null;
        if (spotInstrument == null || (strEZpvd = C37941pGj.EZpvd(spotInstrument)) == null) {
            strEZpvd = "SPOT";
        }
        java.lang.String str2 = "";
        if (spotInstrument == null || (marginSymbol = spotInstrument.getMarginSymbol()) == null) {
            marginSymbol = "";
        }
        if (spotInstrument != null && (instFamily = spotInstrument.getInstFamily()) != null) {
            str2 = instFamily;
        }
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) "MARGIN");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(new oPY(ContractInfoItemType.TICK_SIZE, C33070mpX.AYXKKw(C35964oKf.Fragment.gwwzsY), (spotInstrument == null || (tickerSize = spotInstrument.getTickerSize()) == null) ? "--" : tickerSize, null, 8, null));
        listOLrzqt.add(new oPY(ContractInfoItemType.STEP_SIZE, C33070mpX.AYXKKw(C35964oKf.Fragment.aWJMta), (spotInstrument == null || (lotSize = spotInstrument.getLotSize()) == null || (localized$default = pTB.formatLocalized$default(lotSize, null, 1, null)) == null) ? "--" : localized$default, null, 8, null));
        ContractInfoItemType contractInfoItemType = ContractInfoItemType.MIN_TRADE_AMOUNT;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.apLTlu);
        if (spotInstrument != null) {
            java.lang.String str3 = pTB.formatLocalized$default(spotInstrument.getMinSize(), null, 1, null) + " " + spotInstrument.getTradeSymbol();
            str = str3 == null ? "--" : str3;
        }
        listOLrzqt.add(new oPY(contractInfoItemType, strAYXKKw, str, null, 8, null));
        if (zEZpvd) {
            listOLrzqt.add(new oPY(ContractInfoItemType.LEVERAGE, C33070mpX.AYXKKw(C35964oKf.Fragment.hPlhRW), "--", null, 8, null));
            listOLrzqt.add(new oPY(ContractInfoItemType.UNDERLYING_INDEX, C33070mpX.AYXKKw(C35964oKf.Fragment.jFiva), "--", null, 8, null));
            listOLrzqt.add(new oPY(ContractInfoItemType.MARK_PRICE, C33070mpX.AYXKKw(C35964oKf.Fragment.OCdtug), "--", null, 8, null));
        }
        ContractInfoItemType contractInfoItemType2 = ContractInfoItemType.PRICE_LIMIT;
        listOLrzqt.add(new oPY(contractInfoItemType2, C33070mpX.AYXKKw(C35964oKf.Fragment.DcNNRp), "--", new oPY.ActionBar.Application(contractInfoItemType2, marketCoinInfo.getInstrumentId(), strEZpvd)));
        ContractInfoItemType contractInfoItemType3 = ContractInfoItemType.ORDER_RULE;
        listOLrzqt.add(new oPY(contractInfoItemType3, C33070mpX.AYXKKw(C35964oKf.Fragment.RIKbBf), "--", new oPY.ActionBar.Application(contractInfoItemType3, marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType())));
        return new Application(C56402yEa.fARcdN(listOLrzqt), str2, marginSymbol);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Application copydefault(MarketCoinInfo marketCoinInfo, AbstractC54531xLw abstractC54531xLw) {
        java.lang.String settleCcy;
        java.lang.String str;
        java.lang.String tickerSize;
        java.lang.String localized$default;
        java.lang.String ctMult;
        java.lang.String localized$default2;
        java.lang.String marginSymbol;
        java.lang.String instFamily;
        BizInstrument bizInstrumentValueOf = abstractC54531xLw != null ? abstractC54531xLw.valueOf(marketCoinInfo.getInstrumentId()) : null;
        SwapInstrument swapInstrument = bizInstrumentValueOf instanceof SwapInstrument ? (SwapInstrument) bizInstrumentValueOf : null;
        java.lang.String str2 = "";
        if (swapInstrument == null || (settleCcy = swapInstrument.getSettleCcy()) == null) {
            settleCcy = "";
        }
        if (swapInstrument != null && (instFamily = swapInstrument.getInstFamily()) != null) {
            str2 = instFamily;
        }
        boolean z = swapInstrument != null && swapInstrument.isPositiveContract();
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(new oPY(ContractInfoItemType.SETTLEMENT_COIN, C33070mpX.AYXKKw(C35964oKf.Fragment.OKSWiw), (swapInstrument == null || (marginSymbol = swapInstrument.getMarginSymbol()) == null) ? "--" : marginSymbol, null, 8, null));
        ContractInfoItemType contractInfoItemType = ContractInfoItemType.FACE_VALUE;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.adwzgZ);
        if (swapInstrument != null) {
            java.lang.String str3 = pTB.formatLocalized$default(swapInstrument.getCtVal(), null, 1, null) + " " + swapInstrument.getCtValCcy();
            str = str3 == null ? "--" : str3;
        }
        listOLrzqt.add(new oPY(contractInfoItemType, strAYXKKw, str, null, 8, null));
        if (z) {
            listOLrzqt.add(new oPY(ContractInfoItemType.STEP_SIZE, C33070mpX.AYXKKw(C35964oKf.Fragment.aWJMta), copydefault(swapInstrument.getCtVal(), swapInstrument.getCtValCcy(), swapInstrument.getLotSize()), null, 8, null));
        }
        listOLrzqt.add(new oPY(ContractInfoItemType.CONTRACT_MULTIPLIER, C33070mpX.AYXKKw(C35964oKf.Fragment.iPSTqm), (swapInstrument == null || (ctMult = swapInstrument.getCtMult()) == null || (localized$default2 = pTB.formatLocalized$default(ctMult, null, 1, null)) == null) ? "--" : localized$default2, null, 8, null));
        listOLrzqt.add(new oPY(ContractInfoItemType.TICK_SIZE, C33070mpX.AYXKKw(C35964oKf.Fragment.DzOuPm), (swapInstrument == null || (tickerSize = swapInstrument.getTickerSize()) == null || (localized$default = pTB.formatLocalized$default(tickerSize, null, 1, null)) == null) ? "--" : localized$default, null, 8, null));
        if (z) {
            listOLrzqt.add(new oPY(ContractInfoItemType.MIN_TRADE_AMOUNT, C33070mpX.AYXKKw(C35964oKf.Fragment.apLTlu), OLrzqt(swapInstrument.getCtVal(), swapInstrument.getCtValCcy(), swapInstrument.getMinSize()), null, 8, null));
        }
        listOLrzqt.add(new oPY(ContractInfoItemType.LEVERAGE, C33070mpX.AYXKKw(C35964oKf.Fragment.QOeQqh), "--", null, 8, null));
        ContractInfoItemType contractInfoItemType2 = ContractInfoItemType.PRICE_LIMIT;
        listOLrzqt.add(new oPY(contractInfoItemType2, C33070mpX.AYXKKw(C35964oKf.Fragment.DcNNRp), "--", new oPY.ActionBar.Application(contractInfoItemType2, marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType())));
        ContractInfoItemType contractInfoItemType3 = ContractInfoItemType.ORDER_RULE;
        listOLrzqt.add(new oPY(contractInfoItemType3, C33070mpX.AYXKKw(C35964oKf.Fragment.RIKbBf), "--", new oPY.ActionBar.Application(contractInfoItemType3, marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType())));
        ContractInfoItemType contractInfoItemType4 = ContractInfoItemType.OPEN_POSITION_LIMIT;
        listOLrzqt.add(new oPY(contractInfoItemType4, C33070mpX.AYXKKw(C35964oKf.Fragment.DtnWsU), C33070mpX.AYXKKw(C35964oKf.Fragment.QDqgQU), new oPY.ActionBar.Application(contractInfoItemType4, marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType())));
        listOLrzqt.add(copydefault());
        return new Application(C56402yEa.fARcdN(listOLrzqt), str2, settleCcy);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Application EZpvd(MarketCoinInfo marketCoinInfo, AbstractC54531xLw abstractC54531xLw) {
        java.lang.String settleCcy;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String expTime;
        java.lang.String simpleDateTime$default;
        java.lang.String tickerSize;
        java.lang.String localized$default;
        java.lang.String ctMult;
        java.lang.String localized$default2;
        java.lang.String settleCcy2;
        java.lang.String instFamily;
        BizInstrument bizInstrumentValueOf = abstractC54531xLw != null ? abstractC54531xLw.valueOf(marketCoinInfo.getInstrumentId()) : null;
        FutureInstrument futureInstrument = bizInstrumentValueOf instanceof FutureInstrument ? (FutureInstrument) bizInstrumentValueOf : null;
        java.lang.String str3 = "";
        if (futureInstrument == null || (settleCcy = futureInstrument.getSettleCcy()) == null) {
            settleCcy = "";
        }
        if (futureInstrument != null && (instFamily = futureInstrument.getInstFamily()) != null) {
            str3 = instFamily;
        }
        oPY[] opyArr = new oPY[9];
        opyArr[0] = new oPY(ContractInfoItemType.SETTLEMENT_COIN, C33070mpX.AYXKKw(C35964oKf.Fragment.OKSWiw), (futureInstrument == null || (settleCcy2 = futureInstrument.getSettleCcy()) == null) ? "--" : settleCcy2, null, 8, null);
        ContractInfoItemType contractInfoItemType = ContractInfoItemType.FACE_VALUE;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.adwzgZ);
        if (futureInstrument != null) {
            java.lang.String str4 = pTB.formatLocalized$default(futureInstrument.getCtVal(), null, 1, null) + " " + futureInstrument.getCtValCcy();
            str = str4 == null ? "--" : str4;
        }
        opyArr[1] = new oPY(contractInfoItemType, strAYXKKw, str, null, 8, null);
        opyArr[2] = new oPY(ContractInfoItemType.CONTRACT_MULTIPLIER, C33070mpX.AYXKKw(C35964oKf.Fragment.iPSTqm), (futureInstrument == null || (ctMult = futureInstrument.getCtMult()) == null || (localized$default2 = pTB.formatLocalized$default(ctMult, null, 1, null)) == null) ? "--" : localized$default2, null, 8, null);
        opyArr[3] = new oPY(ContractInfoItemType.TICK_SIZE, C33070mpX.AYXKKw(C35964oKf.Fragment.DzOuPm), (futureInstrument == null || (tickerSize = futureInstrument.getTickerSize()) == null || (localized$default = pTB.formatLocalized$default(tickerSize, null, 1, null)) == null) ? "--" : localized$default, null, 8, null);
        opyArr[4] = new oPY(ContractInfoItemType.LEVERAGE, C33070mpX.AYXKKw(C35964oKf.Fragment.QOeQqh), "--", null, 8, null);
        ContractInfoItemType contractInfoItemType2 = ContractInfoItemType.DELIVERY_TIME;
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C35964oKf.Fragment.ruDxL);
        if (futureInstrument != null && (expTime = futureInstrument.getExpTime()) != null) {
            java.lang.Long lValueOf = java.lang.Long.valueOf(copydefault(expTime));
            if (lValueOf.longValue() <= 0) {
                lValueOf = null;
            }
            if (lValueOf != null && (simpleDateTime$default = pTA.formatSimpleDateTime$default(new Date(lValueOf.longValue()), null, 1, null)) != null) {
                str2 = simpleDateTime$default;
            }
            opyArr[5] = new oPY(contractInfoItemType2, strAYXKKw2, str2, null, 8, null);
            ContractInfoItemType contractInfoItemType3 = ContractInfoItemType.PRICE_LIMIT;
            opyArr[6] = new oPY(contractInfoItemType3, C33070mpX.AYXKKw(C35964oKf.Fragment.DcNNRp), "--", new oPY.ActionBar.Application(contractInfoItemType3, marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType()));
            ContractInfoItemType contractInfoItemType4 = ContractInfoItemType.ORDER_RULE;
            opyArr[7] = new oPY(contractInfoItemType4, C33070mpX.AYXKKw(C35964oKf.Fragment.RIKbBf), "--", new oPY.ActionBar.Application(contractInfoItemType4, marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType()));
            opyArr[8] = copydefault();
            return new Application(yDY.gEmmrt(opyArr), str3, settleCcy);
        }
        str2 = "--";
        opyArr[5] = new oPY(contractInfoItemType2, strAYXKKw2, str2, null, 8, null);
        ContractInfoItemType contractInfoItemType32 = ContractInfoItemType.PRICE_LIMIT;
        opyArr[6] = new oPY(contractInfoItemType32, C33070mpX.AYXKKw(C35964oKf.Fragment.DcNNRp), "--", new oPY.ActionBar.Application(contractInfoItemType32, marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType()));
        ContractInfoItemType contractInfoItemType42 = ContractInfoItemType.ORDER_RULE;
        opyArr[7] = new oPY(contractInfoItemType42, C33070mpX.AYXKKw(C35964oKf.Fragment.RIKbBf), "--", new oPY.ActionBar.Application(contractInfoItemType42, marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType()));
        opyArr[8] = copydefault();
        return new Application(yDY.gEmmrt(opyArr), str3, settleCcy);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Application AEQbTJ(MarketCoinInfo marketCoinInfo, AbstractC54531xLw abstractC54531xLw) {
        java.lang.String strAYXKKw;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String settleCcy;
        java.lang.String settleCcy2;
        java.lang.String ctMult;
        java.lang.String localized$default;
        java.lang.String stk;
        java.lang.String localized$default2;
        java.lang.String simpleDateTime$default;
        BizInstrument bizInstrumentValueOf = abstractC54531xLw != null ? abstractC54531xLw.valueOf(marketCoinInfo.getInstrumentId()) : null;
        OptionInstrument optionInstrument = bizInstrumentValueOf instanceof OptionInstrument ? (OptionInstrument) bizInstrumentValueOf : null;
        if (optionInstrument != null && Intrinsics.EZpvd((java.lang.Object) abstractC54531xLw.copydefault(optionInstrument), (java.lang.Object) "P")) {
            strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.zKcAg);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.hvKCwS);
        }
        oPY[] opyArr = new oPY[13];
        opyArr[0] = new oPY(ContractInfoItemType.CONTRACT_TYPE, C33070mpX.AYXKKw(C35964oKf.Fragment.sVXHln), optionInstrument != null ? strAYXKKw : "--", null, 8, null);
        opyArr[1] = new oPY(ContractInfoItemType.EXPIRY_TIME, C33070mpX.AYXKKw(C35964oKf.Fragment.zDUObI), (optionInstrument == null || (simpleDateTime$default = pTA.formatSimpleDateTime$default(new Date(copydefault(optionInstrument.getExpTime())), null, 1, null)) == null) ? "--" : simpleDateTime$default, null, 8, null);
        opyArr[2] = new oPY(ContractInfoItemType.STRIKE_PRICE, C33070mpX.AYXKKw(C35964oKf.Fragment.zlvcHA), (optionInstrument == null || (stk = optionInstrument.getStk()) == null || (localized$default2 = pTB.formatLocalized$default(stk, null, 1, null)) == null) ? "--" : localized$default2, null, 8, null);
        ContractInfoItemType contractInfoItemType = ContractInfoItemType.FACE_VALUE;
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C35964oKf.Fragment.adwzgZ);
        if (optionInstrument != null) {
            java.lang.String str3 = pTB.formatLocalized$default("1", null, 1, null) + " " + optionInstrument.getCtValCcy();
            str = str3 == null ? "--" : str3;
        }
        opyArr[3] = new oPY(contractInfoItemType, strAYXKKw2, str, null, 8, null);
        opyArr[4] = new oPY(ContractInfoItemType.CONTRACT_MULTIPLIER, C33070mpX.AYXKKw(C35964oKf.Fragment.iPSTqm), (optionInstrument == null || (ctMult = optionInstrument.getCtMult()) == null || (localized$default = pTB.formatLocalized$default(ctMult, null, 1, null)) == null) ? "--" : localized$default, null, 8, null);
        opyArr[5] = new oPY(ContractInfoItemType.QUOTE_COIN, C33070mpX.AYXKKw(C35964oKf.Fragment.tIwhY), (optionInstrument == null || (settleCcy2 = optionInstrument.getSettleCcy()) == null) ? "--" : settleCcy2, null, 8, null);
        opyArr[6] = new oPY(ContractInfoItemType.SETTLEMENT_COIN, C33070mpX.AYXKKw(C35964oKf.Fragment.OKSWiw), (optionInstrument == null || (settleCcy = optionInstrument.getSettleCcy()) == null) ? "--" : settleCcy, null, 8, null);
        opyArr[7] = new oPY(ContractInfoItemType.SETTLEMENT_PRICE, C33070mpX.AYXKKw(C35964oKf.Fragment.zhUgOk), C33070mpX.AYXKKw(C35964oKf.Fragment.zYHWMc), null, 8, null);
        ContractInfoItemType contractInfoItemType2 = ContractInfoItemType.MIN_QUOTE_UNIT;
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C35964oKf.Fragment.USBtdM);
        if (optionInstrument != null) {
            java.lang.String str4 = pTB.formatLocalized$default(optionInstrument.getTickerSize(), null, 1, null) + " " + optionInstrument.getSettleCcy();
            str2 = str4 == null ? "--" : str4;
        }
        opyArr[8] = new oPY(contractInfoItemType2, strAYXKKw3, str2, null, 8, null);
        opyArr[9] = new oPY(ContractInfoItemType.EXERCISE_PROFIT, C33070mpX.AYXKKw(C35964oKf.Fragment.swzYdv), C33070mpX.AYXKKw(C35964oKf.Fragment.QDqgQU), new oPY.ActionBar.C0903ActionBar(C33070mpX.AYXKKw(C35964oKf.Fragment.QIZEnU) + "\n\n" + C33070mpX.AYXKKw(C35964oKf.Fragment.ULRxlR)));
        opyArr[10] = new oPY(ContractInfoItemType.CLOSING_PROFIT, C33070mpX.AYXKKw(C35964oKf.Fragment.DPVBvL), C33070mpX.AYXKKw(C35964oKf.Fragment.QDqgQU), new oPY.ActionBar.C0903ActionBar(C33070mpX.AYXKKw(C35964oKf.Fragment.QXDzTk)));
        opyArr[11] = copydefault();
        opyArr[12] = new oPY(ContractInfoItemType.FEE_RATE, C33070mpX.AYXKKw(C35964oKf.Fragment.zAEkPU), C33070mpX.AYXKKw(C35964oKf.Fragment.vLaW), new oPY.ActionBar.Activity(C33070mpX.AYXKKw(C35964oKf.Fragment.apNKau)));
        return new Application(yDY.gEmmrt(opyArr), "", "");
    }

    public final long copydefault(java.lang.String str) {
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.Exception unused) {
            return 0L;
        }
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str.length() == 0 || str2.length() == 0 || str3.length() == 0) {
            return "--";
        }
        return pTB.formatLocalized$default(C33129mqd.mulS$default(str, str3, null, null, null, 14, null), null, 1, null) + " " + str2;
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str.length() == 0 || str2.length() == 0 || str3.length() == 0) {
            return "--";
        }
        java.lang.String strMulS$default = C33129mqd.mulS$default(str, str3, null, null, null, 14, null);
        return str3 + " " + C33070mpX.AYXKKw(C55688xof.Application.RgaQzq) + " (" + pTB.formatLocalized$default(strMulS$default, null, 1, null) + " " + str2 + ")";
    }

    public final oPY copydefault() {
        return new oPY(ContractInfoItemType.ADL_MECHANISM, C33070mpX.AYXKKw(C35964oKf.Fragment.onProviderEnabled), C33070mpX.AYXKKw(C35964oKf.Fragment.sTzBva), new oPY.ActionBar.Activity(C33070mpX.AYXKKw(C35964oKf.Fragment.QSbQqJ)));
    }
}
