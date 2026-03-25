package com.okinc.unify_trade.bot.signalbot.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotMaxAvailableResult;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.SignalBotManualOrderReq;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.config.SignalBotManualOrderType;
import com.okinc.unify_trade.bot.config.SignalBotManualOrderUnit;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotManualOrderPresenter;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC54531xLw;
import o.AbstractC55737xpb;
import o.C33070mpX;
import o.C33129mqd;
import o.C54239xBa;
import o.C54282xCq;
import o.C54507xKz;
import o.C54536xML;
import o.C54571xNh;
import o.C54589xNz;
import o.C55688xof;
import o.C56253xzN;
import o.C56261xzV;
import o.C56392yDr;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.xCN;
import o.xKK;
import o.xMR;
import o.xOW;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SignalBotManualOrderPresenter extends AbsPresenter {
    public final TradeLiveData<StrategyPositionResponse> AEQbTJ;
    public final C54282xCq AYXKKw;
    public final TradeLiveData<BotMaxAvailableResult> AhwBna;
    public final TradeLiveData<TickersData> AkhnZx;
    public DetailsData DbNXlk;
    public final xCN EZpvd;
    public final TradeLiveData<String> KWHzl;
    public final C56253xzN OLrzqt;
    public final C56261xzV copydefault;
    public final TradeLiveData<TickersData> djBIcL;
    public AbstractC55737xpb fARcdN;
    public boolean fetchVPNInfo;
    public final TradeLiveData<List<StrategyResponse>> gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final C54239xBa valueOf;
    public final TradeLiveData<String> values;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SignalBotManualOrderUnit.values().length];
            try {
                iArr[SignalBotManualOrderUnit.U.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignalBotManualOrderUnit.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SignalBotManualOrderUnit.CONT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyPositionResponse> AkhnZx() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.fetchVPNInfo = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(DetailsData detailsData) {
        this.DbNXlk = detailsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> ejfBZ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54239xBa fARcdN() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotMaxAvailableResult> fIwbmz() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DetailsData fJNWhG() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<StrategyResponse>> fetchVPNInfo() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<TickersData> hDKMBd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<TickersData> isConnected() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> values() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotManualOrderPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = new C56253xzN();
        this.AhwBna = new TradeLiveData<>();
        this.valueOf = new C54239xBa();
        this.gEmmrt = new TradeLiveData<>();
        this.AYXKKw = new C54282xCq();
        this.djBIcL = new TradeLiveData<>();
        this.copydefault = new C56261xzV();
        this.AEQbTJ = new TradeLiveData<>();
        this.EZpvd = new xCN();
        this.values = new TradeLiveData<>(SignalBotManualOrderType.LIMIT.getConst());
        this.KWHzl = new TradeLiveData<>("buy");
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.xuN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SignalBotManualOrderPresenter.EZpvd();
            }
        });
        this.AkhnZx = new TradeLiveData<>();
    }

    public final TradeLiveData<SignalBotManualOrderUnit> AuCTel() {
        return (TradeLiveData) this.isConnected.getValue();
    }

    public static final TradeLiveData EZpvd() {
        xOW newProxyInstance;
        SignalBotManualOrderUnit.ActionBar actionBar = SignalBotManualOrderUnit.Companion;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return new TradeLiveData(actionBar.OLrzqt((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.iwGUEr()));
    }

    public final SwapInstrument DbNXlk() {
        BizInstrument suggestedInstrument$default;
        String instType;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            DetailsData detailsData = this.DbNXlk;
            if (detailsData == null || (instType = detailsData.getInstType()) == null) {
                instType = "";
            }
            DetailsData detailsData2 = this.DbNXlk;
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, instType, detailsData2 != null ? detailsData2.getInstId() : null, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        if (suggestedInstrument$default instanceof SwapInstrument) {
            return (SwapInstrument) suggestedInstrument$default;
        }
        return null;
    }

    public final AbstractC54531xLw gEmmrt() {
        String instType;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return null;
        }
        DetailsData detailsData = this.DbNXlk;
        if (detailsData == null || (instType = detailsData.getInstType()) == null) {
            instType = "";
        }
        return interfaceC54581xNrOLrzqt.OLrzqt(instType);
    }

    public final int iwGUEr() {
        String instFamily;
        AbstractC54531xLw abstractC54531xLwGEmmrt = gEmmrt();
        if (abstractC54531xLwGEmmrt != null) {
            SwapInstrument swapInstrumentDbNXlk = DbNXlk();
            if (swapInstrumentDbNXlk == null || (instFamily = swapInstrumentDbNXlk.getInstFamily()) == null) {
                instFamily = "";
            }
            String strFARcdN = abstractC54531xLwGEmmrt.fARcdN(instFamily);
            if (strFARcdN != null) {
                return C33129mqd.AhwBna(strFARcdN);
            }
        }
        return C33129mqd.AhwBna("0");
    }

    private final int AuCTelauCTel() {
        String instFamily;
        String marginDig;
        AbstractC54531xLw abstractC54531xLwGEmmrt = gEmmrt();
        if (abstractC54531xLwGEmmrt != null) {
            SwapInstrument swapInstrumentDbNXlk = DbNXlk();
            if (swapInstrumentDbNXlk == null || (instFamily = swapInstrumentDbNXlk.getInstFamily()) == null) {
                instFamily = "";
            }
            IdxConfig idxConfigAkhnZx = abstractC54531xLwGEmmrt.AkhnZx(instFamily);
            if (idxConfigAkhnZx != null && (marginDig = idxConfigAkhnZx.getMarginDig()) != null) {
                return C33129mqd.AhwBna(marginDig);
            }
        }
        return 2;
    }

    public final int getNewProxyInstance() {
        String instFamily;
        AbstractC54531xLw abstractC54531xLwGEmmrt = gEmmrt();
        if (abstractC54531xLwGEmmrt != null) {
            SwapInstrument swapInstrumentDbNXlk = DbNXlk();
            if (swapInstrumentDbNXlk == null || (instFamily = swapInstrumentDbNXlk.getInstFamily()) == null) {
                instFamily = "";
            }
            String strFIwbmz = abstractC54531xLwGEmmrt.fIwbmz(instFamily);
            if (strFIwbmz != null) {
                return C33129mqd.AhwBna(strFIwbmz);
            }
        }
        return 8;
    }

    public final int valueOf() {
        String instFamily;
        String contractDig;
        AbstractC54531xLw abstractC54531xLwGEmmrt = gEmmrt();
        if (abstractC54531xLwGEmmrt != null) {
            SwapInstrument swapInstrumentDbNXlk = DbNXlk();
            if (swapInstrumentDbNXlk == null || (instFamily = swapInstrumentDbNXlk.getInstFamily()) == null) {
                instFamily = "";
            }
            IdxConfig idxConfigAkhnZx = abstractC54531xLwGEmmrt.AkhnZx(instFamily);
            if (idxConfigAkhnZx != null && (contractDig = idxConfigAkhnZx.getContractDig()) != null) {
                return C33129mqd.AhwBna(contractDig);
            }
        }
        return 8;
    }

    public final void AYXKKw() {
        String instId;
        C54282xCq c54282xCq = this.AYXKKw;
        DetailsData detailsData = this.DbNXlk;
        if (detailsData == null || (instId = detailsData.getInstId()) == null) {
            instId = "";
        }
        c54282xCq.AEQbTJ(instId);
        c54282xCq.djBIcL();
        c54282xCq.OLrzqt(this.djBIcL, new C54507xKz());
        xKK.Activity.execute$default(c54282xCq, 0L, 1, null);
        getFieldNames();
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56253xzN c56253xzN = this.OLrzqt;
        DetailsData detailsData = this.DbNXlk;
        String algoId = detailsData != null ? detailsData.getAlgoId() : null;
        boolean z = this.fetchVPNInfo;
        DetailsData detailsData2 = this.DbNXlk;
        c56253xzN.copydefault(algoId, Boolean.valueOf(z), detailsData2 != null ? detailsData2.getInstId() : null, copydefault(str));
        c56253xzN.OLrzqt(this.AhwBna, new C54507xKz());
        xKK.Activity.execute$default(c56253xzN, 0L, 1, null);
    }

    public final void djBIcL() {
        String algoId;
        String instId;
        C56261xzV c56261xzV = this.copydefault;
        DetailsData detailsData = this.DbNXlk;
        String str = "";
        if (detailsData == null || (algoId = detailsData.getAlgoId()) == null) {
            algoId = "";
        }
        c56261xzV.AEQbTJ(algoId);
        c56261xzV.EZpvd("signal_bot");
        DetailsData detailsData2 = this.DbNXlk;
        if (detailsData2 != null && (instId = detailsData2.getInstId()) != null) {
            str = instId;
        }
        c56261xzV.OLrzqt(str);
        c56261xzV.OLrzqt(this.AEQbTJ, new C54507xKz());
        xKK.Activity.execute$default(c56261xzV, 0L, 1, null);
    }

    public final void uzCIH() {
        String instType;
        String instId;
        xCN xcn = this.EZpvd;
        DetailsData detailsData = this.DbNXlk;
        String str = "";
        if (detailsData == null || (instType = detailsData.getInstType()) == null) {
            instType = "";
        }
        DetailsData detailsData2 = this.DbNXlk;
        if (detailsData2 != null && (instId = detailsData2.getInstId()) != null) {
            str = instId;
        }
        xcn.OLrzqt(instType, str);
        xKK.Activity.execute$default(xcn, 0L, 1, null);
    }

    public final List<TradeMenuItemBean> copydefault() {
        SignalBotManualOrderType[] signalBotManualOrderTypeArrValues = SignalBotManualOrderType.values();
        ArrayList arrayList = new ArrayList(signalBotManualOrderTypeArrValues.length);
        for (SignalBotManualOrderType signalBotManualOrderType : signalBotManualOrderTypeArrValues) {
            arrayList.add(new TradeMenuItemBean(C33070mpX.AYXKKw(signalBotManualOrderType.getShowName()), Intrinsics.EZpvd((Object) this.values.getValue(), (Object) signalBotManualOrderType.getConst()), signalBotManualOrderType.getConst(), null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
        }
        return arrayList;
    }

    public final List<TradeMenuItemBean> AEQbTJ() {
        SignalBotManualOrderUnit[] signalBotManualOrderUnitArrValues = SignalBotManualOrderUnit.values();
        ArrayList arrayList = new ArrayList(signalBotManualOrderUnitArrValues.length);
        int length = signalBotManualOrderUnitArrValues.length;
        for (int i = 0; i < length; i++) {
            SignalBotManualOrderUnit signalBotManualOrderUnit = signalBotManualOrderUnitArrValues[i];
            arrayList.add(new TradeMenuItemBean(EZpvd(signalBotManualOrderUnit), AuCTel().getValue() == signalBotManualOrderUnit, signalBotManualOrderUnit, null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String EZpvd(@NotNull SignalBotManualOrderUnit signalBotManualOrderUnit) {
        String quoteSymbol;
        Intrinsics.checkNotNullParameter(signalBotManualOrderUnit, "");
        int i = TaskDescription.EZpvd[signalBotManualOrderUnit.ordinal()];
        if (i == 1) {
            SwapInstrument swapInstrumentDbNXlk = DbNXlk();
            if (swapInstrumentDbNXlk != null) {
                quoteSymbol = swapInstrumentDbNXlk.getQuoteSymbol();
            }
        } else if (i == 2) {
            SwapInstrument swapInstrumentDbNXlk2 = DbNXlk();
            quoteSymbol = swapInstrumentDbNXlk2 != null ? swapInstrumentDbNXlk2.getTradeSymbol() : null;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            quoteSymbol = C33070mpX.AYXKKw(C55688xof.Application.RgaQzq);
        }
        return quoteSymbol == null ? "" : quoteSymbol;
    }

    public final int AEQbTJ(@NotNull SignalBotManualOrderUnit signalBotManualOrderUnit) {
        Intrinsics.checkNotNullParameter(signalBotManualOrderUnit, "");
        int i = TaskDescription.EZpvd[signalBotManualOrderUnit.ordinal()];
        if (i == 1) {
            return AuCTelauCTel();
        }
        if (i == 2) {
            return valueOf();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return iwGUEr();
    }

    public final boolean KWHzl() {
        StrategyPositionResponse value = this.AEQbTJ.getValue();
        String pos = value != null ? value.getPos() : null;
        String value2 = this.KWHzl.getValue();
        if (value2 == null) {
            return false;
        }
        int iHashCode = value2.hashCode();
        if (iHashCode == 97926) {
            if (value2.equals("buy")) {
                return C33129mqd.gEmmrt(pos, 0);
            }
            return false;
        }
        if (iHashCode == 3526482 && value2.equals("sell")) {
            return C33129mqd.AEQbTJ(pos, 0);
        }
        return false;
    }

    public final void gEmmrt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values.postValue(str);
    }

    public final void djBIcL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.postValue(str);
    }

    public final void copydefault(SignalBotManualOrderUnit signalBotManualOrderUnit) {
        TradeLiveData<SignalBotManualOrderUnit> tradeLiveDataAuCTel = AuCTel();
        if (signalBotManualOrderUnit == null) {
            signalBotManualOrderUnit = SignalBotManualOrderUnit.U;
        }
        tradeLiveDataAuCTel.postValue(signalBotManualOrderUnit);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AEQbTJ(@NotNull String str) {
        String sellSize;
        String instFamily;
        C54571xNh c54571xNhAhwBna;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) this.KWHzl.getValue(), (Object) "buy")) {
            BotMaxAvailableResult value = this.AhwBna.getValue();
            sellSize = value != null ? value.getBuySize() : null;
        } else {
            BotMaxAvailableResult value2 = this.AhwBna.getValue();
            if (value2 != null) {
                sellSize = value2.getSellSize();
            }
        }
        if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            str = AubY();
        }
        AbstractC54531xLw abstractC54531xLwGEmmrt = gEmmrt();
        if (abstractC54531xLwGEmmrt != null) {
            SwapInstrument swapInstrumentDbNXlk = DbNXlk();
            if (swapInstrumentDbNXlk == null || (instFamily = swapInstrumentDbNXlk.getInstFamily()) == null) {
                instFamily = "";
            }
            SignalBotManualOrderUnit value3 = AuCTel().getValue();
            C54571xNh c54571xNhDjBIcL = abstractC54531xLwGEmmrt.djBIcL(instFamily, value3 != null ? value3.getType() : null);
            if (c54571xNhDjBIcL != null && (c54571xNhAhwBna = c54571xNhDjBIcL.AhwBna(str)) != null) {
                C54536xML c54536xMLDjBIcL2 = c54571xNhAhwBna.djBIcL(sellSize != null ? sellSize : "");
                if (c54536xMLDjBIcL2 != null && (c54536xMLDjBIcL = c54536xMLDjBIcL2.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
                    return safeString$default;
                }
            }
        }
        return "--";
    }

    private final String AubY() {
        String last;
        TickersData value = this.AkhnZx.getValue();
        String last2 = value != null ? value.getLast() : null;
        TickersData value2 = this.djBIcL.getValue();
        if (value2 == null || (last = value2.getLast()) == null) {
            last = "";
        }
        return (last2 == null || last2.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) last2)) ? last : last2;
    }

    public final String AhwBna() {
        String bidPx;
        TickersData value = this.AkhnZx.getValue();
        String bidPx2 = value != null ? value.getBidPx() : null;
        TickersData value2 = this.djBIcL.getValue();
        if (value2 == null || (bidPx = value2.getBidPx()) == null) {
            bidPx = "";
        }
        return (bidPx2 == null || bidPx2.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) bidPx2)) ? bidPx : bidPx2;
    }

    public final String copydefault(String str) {
        return Intrinsics.EZpvd((Object) this.values.getValue(), (Object) SignalBotManualOrderType.LIMIT.getConst()) ? str : "";
    }

    public static final class Application extends AbstractC55737xpb {
        public Application(String str, String str2) {
            super(str, str2, false, 4, null);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(List<TickersData> list, String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (tickersData != null) {
                SignalBotManualOrderPresenter signalBotManualOrderPresenter = SignalBotManualOrderPresenter.this;
                if (tickersData.getLast().length() == 0) {
                    return;
                }
                signalBotManualOrderPresenter.hDKMBd().postValue(tickersData);
            }
        }
    }

    private final void getFieldNames() {
        String instId;
        DetailsData detailsData = this.DbNXlk;
        if (detailsData == null || (instId = detailsData.getInstId()) == null) {
            instId = "";
        }
        Application application = new Application(instId, C33129mqd.gEmmrt(Long.valueOf(System.currentTimeMillis())));
        this.fARcdN = application;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            interfaceC54581xNrCopydefault.copydefault(yDY.copydefault(application));
        }
    }

    public final String EZpvd(@NotNull String str, @NotNull String str2) {
        Object level;
        String strDivS$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() == 0) {
            return "--";
        }
        if (Intrinsics.EZpvd((Object) this.values.getValue(), (Object) SignalBotManualOrderType.LIMIT.getConst()) && str2.length() == 0) {
            return "--";
        }
        if (this.fetchVPNInfo) {
            strDivS$default = "0";
        } else {
            String strEZpvd = EZpvd(str2);
            String strOLrzqt = OLrzqt(str, strEZpvd);
            SwapInstrument swapInstrumentDbNXlk = DbNXlk();
            String strMulS$default = C33129mqd.mulS$default(swapInstrumentDbNXlk != null ? swapInstrumentDbNXlk.getCtVal() : null, strOLrzqt, null, null, null, 14, null);
            SwapInstrument swapInstrumentDbNXlk2 = DbNXlk();
            String strMulS$default2 = C33129mqd.mulS$default(C33129mqd.mulS$default(strMulS$default, swapInstrumentDbNXlk2 != null ? swapInstrumentDbNXlk2.getCtMult() : null, null, null, null, 14, null), strEZpvd, null, null, null, 14, null);
            DetailsData detailsData = this.DbNXlk;
            if (detailsData == null || (level = detailsData.getLevel()) == null) {
                level = 1;
            }
            strDivS$default = C33129mqd.divS$default(strMulS$default2, level, null, null, null, 14, null);
        }
        String strAhwBna = xMR.copydefault.AhwBna(strDivS$default, AuCTelauCTel());
        SwapInstrument swapInstrumentDbNXlk3 = DbNXlk();
        return strAhwBna + " " + (swapInstrumentDbNXlk3 != null ? swapInstrumentDbNXlk3.getDisplayQuoteSymbol() : null);
    }

    public final String EZpvd(String str) {
        if (Intrinsics.EZpvd((Object) this.values.getValue(), (Object) SignalBotManualOrderType.MARKET.getConst())) {
            return AubY();
        }
        String value = this.KWHzl.getValue();
        return (value != null && value.hashCode() == 97926 && value.equals("buy")) ? str : C33129mqd.gEmmrt(Double.valueOf(Math.max(C33129mqd.AEQbTJ(str), C33129mqd.AEQbTJ(AhwBna()))));
    }

    public final String OLrzqt(String str, String str2) {
        String strDivS$default;
        SignalBotManualOrderUnit value = AuCTel().getValue();
        int i = value == null ? -1 : TaskDescription.EZpvd[value.ordinal()];
        if (i == 1) {
            String strDivS$default2 = C33129mqd.divS$default(str, str2, null, null, null, 14, null);
            SwapInstrument swapInstrumentDbNXlk = DbNXlk();
            strDivS$default = C33129mqd.divS$default(strDivS$default2, swapInstrumentDbNXlk != null ? swapInstrumentDbNXlk.getCtVal() : null, null, null, null, 14, null);
        } else if (i != 2) {
            strDivS$default = str;
        } else {
            SwapInstrument swapInstrumentDbNXlk2 = DbNXlk();
            strDivS$default = C33129mqd.divS$default(str, swapInstrumentDbNXlk2 != null ? swapInstrumentDbNXlk2.getCtVal() : null, null, null, null, 14, null);
        }
        return xMR.copydefault.KWHzl(strDivS$default, DbNXlk(), true, RoundingMode.DOWN);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C54239xBa c54239xBa = this.valueOf;
        DetailsData detailsData = this.DbNXlk;
        String algoId = detailsData != null ? detailsData.getAlgoId() : null;
        DetailsData detailsData2 = this.DbNXlk;
        c54239xBa.copydefault(new SignalBotManualOrderReq(algoId, detailsData2 != null ? detailsData2.getInstId() : null, this.values.getValue(), copydefault(str2), this.fetchVPNInfo, this.KWHzl.getValue(), OLrzqt(str, EZpvd(str2))));
        c54239xBa.AEQbTJ(this.gEmmrt);
        xKK.Activity.execute$default(c54239xBa, 0L, 1, null);
    }

    public final String KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SwapInstrument swapInstrumentDbNXlk = DbNXlk();
        String minSize = swapInstrumentDbNXlk != null ? swapInstrumentDbNXlk.getMinSize() : null;
        SwapInstrument swapInstrumentDbNXlk2 = DbNXlk();
        return C33129mqd.formatS$default(C33129mqd.mulS$default(C33129mqd.mulS$default(minSize, swapInstrumentDbNXlk2 != null ? swapInstrumentDbNXlk2.getCtVal() : null, null, null, null, 14, null), StringsKt__StringsKt.fARcdN((CharSequence) str) ? AubY() : str, null, null, null, 14, null), Integer.valueOf(AuCTelauCTel()), null, RoundingMode.UP, 2, null);
    }

    private final void wlaJM() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        AbstractC55737xpb abstractC55737xpb = this.fARcdN;
        if (abstractC55737xpb == null || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null) {
            return;
        }
        interfaceC54581xNrCopydefault.AEQbTJ(yDY.copydefault(abstractC55737xpb));
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.OLrzqt, this.valueOf, this.AYXKKw, this.copydefault, this.EZpvd);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        wlaJM();
    }
}
