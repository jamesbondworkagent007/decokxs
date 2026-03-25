package com.okinc.tradingbot.impl.order.strategy.recurring.presenter;

import android.app.Application;
import androidx.camera.video.AudioStats;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.biz.TradeType;
import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.tradingbot.impl.balance.dto.AccountBalance;
import com.okinc.tradingbot.impl.balance.dto.AccountType;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.AccountShow;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.FirstTimeBuyOption;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.MinInvestReq;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;
import com.okinc.unify_trade.bot.util.recurring.RecurringCycleConfigNew;
import com.okinc.unify_trade.bot.util.recurring.RecurringHourlyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC54531xLw;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C43417ror;
import o.C48033uCm;
import o.C48159uHd;
import o.C54507xKz;
import o.C54536xML;
import o.C54571xNh;
import o.C54589xNz;
import o.C55688xof;
import o.C55801xqm;
import o.C55968xtu;
import o.C56046xvS;
import o.C56064xvk;
import o.C56111xwe;
import o.C56183xxx;
import o.C56390yDp;
import o.C56403yEb;
import o.C56423yEv;
import o.C56524yIo;
import o.InterfaceC48160uHe;
import o.InterfaceC54581xNr;
import o.pTB;
import o.pUU;
import o.uLP;
import o.wUL;
import o.xAR;
import o.xKK;
import o.xOW;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class RecurringTradePresenterNew extends BaseBotOrderPresenter {
    public final Map<String, ArrayList<SelectCoinData>> AYXKKw;
    public final TradeLiveData<MinInvestResp> AhwBna;
    public final xAR AkhnZx;
    public final C55968xtu AuCTel;
    public final ArrayList<SelectCoinData> DbNXlk;
    public final C48159uHd EZpvd;
    public final TradeLiveData<ArrayList<AccountBalance>> OLrzqt;
    public final ArrayList<AccountType> copydefault;
    public FirstTimeBuyOption djBIcL;
    public final List<String> ejfBZ;
    public int fARcdN;
    public int fIwbmz;
    public final C56111xwe<String> fJNWhG;
    public final C56183xxx fetchVPNInfo;
    public boolean gEmmrt;
    public final C56111xwe<List<StrategyResponse>> isConnected;
    public final C56111xwe<String> valueOf;
    public int values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public static int KWHzl = RecurringCycleConfigNew.DAY.getIndex();

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.FUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.fARcdN = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<MinInvestResp> AkhnZx() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AuCTel() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTelauCTel() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56183xxx DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ArrayList<AccountBalance>> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AccountType> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.fIwbmz = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull FirstTimeBuyOption firstTimeBuyOption) {
        Intrinsics.checkNotNullParameter(firstTimeBuyOption, "");
        this.djBIcL = firstTimeBuyOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48159uHd OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.values = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAR ejfBZ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SelectCoinData> fARcdN() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SelectCoinData> fIwbmz() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FirstTimeBuyOption gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNewProxyInstance() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int hDKMBd() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<String> uzCIH() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<String> valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<StrategyResponse>> values() {
        return this.isConnected;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringTradePresenterNew(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.ejfBZ = yDY.gEmmrt("USDT", "USDC", "USD");
        this.values = KWHzl;
        this.fARcdN = 12;
        this.djBIcL = FirstTimeBuyOption.BUY_NOW;
        this.DbNXlk = new ArrayList<>();
        this.AuCTel = new C55968xtu();
        this.AYXKKw = new LinkedHashMap();
        this.fetchVPNInfo = new C56183xxx();
        this.AhwBna = new TradeLiveData<>();
        this.AkhnZx = new xAR();
        this.isConnected = new C56111xwe<>();
        this.fJNWhG = new C56111xwe<>();
        this.EZpvd = new C48159uHd(Dispatchers.getIO(), (InterfaceC48160uHe) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC48160uHe.class)));
        this.OLrzqt = new TradeLiveData<>();
        this.copydefault = new ArrayList<>();
        this.valueOf = new C56111xwe<>();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringTradePresenterNew.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static /* synthetic */ void requestMinInvest$default(RecurringTradePresenterNew recurringTradePresenterNew, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        recurringTradePresenterNew.KWHzl(j);
    }

    public final void KWHzl(long j) {
        String strDbNXlk = fvQaOB().DbNXlk();
        if (strDbNXlk == null || StringsKt__StringsKt.fARcdN((CharSequence) strDbNXlk)) {
            return;
        }
        C56183xxx c56183xxx = this.fetchVPNInfo;
        String strDbNXlk2 = fvQaOB().DbNXlk();
        if (strDbNXlk2 == null) {
            strDbNXlk2 = "";
        }
        c56183xxx.AEQbTJ(new MinInvestReq(strDbNXlk2, getFieldNames(), fvQaOB().AEQbTJ("recurring")));
        c56183xxx.OLrzqt(this.AhwBna, new C54507xKz());
        c56183xxx.OLrzqt(j);
    }

    public final void AEQbTJ(String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        RecurringOrderData recurringOrderDataEZpvd = EZpvd(str, str2);
        pUU.KWHzl("botRecurringBuy", String.valueOf(recurringOrderDataEZpvd));
        xAR xar = this.AkhnZx;
        xar.copydefault(recurringOrderDataEZpvd);
        xar.AEQbTJ(this.isConnected);
        xKK.Activity.execute$default(xar, 0L, 1, null);
    }

    public final RecurringOrderData EZpvd(String str, String str2) {
        xOW newProxyInstance;
        List<CoinRatioParam> listAEQbTJ = AEQbTJ();
        int offset = new GregorianCalendar().getTimeZone().getOffset(System.currentTimeMillis()) / 3600000;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        boolean z = (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.gEmmrt()) ? false : true;
        int i = this.values;
        RecurringCycleConfigNew recurringCycleConfigNew = RecurringCycleConfigNew.HOUR;
        String strValueOf = i != recurringCycleConfigNew.getIndex() ? String.valueOf(this.fIwbmz + 1) : "";
        String strAEQbTJ = this.values == recurringCycleConfigNew.getIndex() ? RecurringHourlyConfig.Companion.AEQbTJ(this.fIwbmz) : "";
        String strOLrzqt = RecurringCycleConfigNew.Companion.OLrzqt(this.values);
        int i2 = this.fARcdN;
        String strDbNXlk = fvQaOB().DbNXlk();
        String str3 = z ? "cross" : "cash";
        String strAEQbTJ2 = fvQaOB().AEQbTJ("recurring");
        ArrayList<AccountType> arrayList = this.copydefault;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(C33129mqd.AhwBna(((AccountType) it.next()).getValue())));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.add(0, Integer.valueOf(C33129mqd.AhwBna(AccountType.TRADE.getValue())));
        Unit unit = Unit.INSTANCE;
        return new RecurringOrderData(listAEQbTJ, str, strOLrzqt, strValueOf, String.valueOf(i2), strAEQbTJ, String.valueOf(offset), str2, strDbNXlk, str3, (String) null, strAEQbTJ2, arrayList3, Integer.valueOf(this.djBIcL.getOrderParamCode()), 1024, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StrategyReqGroup copydefault(String str, @NotNull String str2) {
        boolean z;
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(str2, "");
        List<CoinRatioParam> listAEQbTJ = AEQbTJ();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) {
            z = false;
        } else {
            z = true;
            if (!newProxyInstance.gEmmrt()) {
            }
        }
        return new StrategyReqGroup(new StrategyBaseReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, "recurring", (TradeType) null, (String) null, (Boolean) null, 1919, (DefaultConstructorMarker) null), (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, new RecurringOrderData(listAEQbTJ, str, C33129mqd.gEmmrt(Integer.valueOf(this.values)), C33129mqd.gEmmrt(Integer.valueOf(this.fIwbmz)), String.valueOf(this.fARcdN), (String) null, (String) null, str2, fvQaOB().DbNXlk(), z ? "cross" : "cash", (String) null, fvQaOB().AkhnZx(), (List) null, Integer.valueOf(this.djBIcL.getOrderParamCode()), 5216, (DefaultConstructorMarker) null), (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32510, (DefaultConstructorMarker) null);
    }

    public final void zLjUOn() {
        this.AuCTel.EZpvd();
    }

    public final void AubY() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        ArrayList<BizInstrument> arrayListEZpvd;
        CountDownInfo countDownInfo;
        this.AYXKKw.clear();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("SPOT")) != null && (arrayListEZpvd = abstractC54531xLwOLrzqt.EZpvd()) != null) {
            for (BizInstrument bizInstrument : arrayListEZpvd) {
                String quoteSymbol = bizInstrument.getQuoteSymbol();
                if (this.ejfBZ.contains(quoteSymbol) && ((countDownInfo = bizInstrument.getCountDownInfo()) == null || !countDownInfo.isInvalidForBot())) {
                    String tradeSymbol = bizInstrument.getTradeSymbol();
                    ArrayList<SelectCoinData> orDefault = this.AYXKKw.getOrDefault(quoteSymbol, new ArrayList<>());
                    orDefault.add(new SelectCoinData(interfaceC54581xNrOLrzqt.valueOf(tradeSymbol), tradeSymbol, null, false, interfaceC54581xNrOLrzqt.fetchVPNInfo(tradeSymbol), false, bizInstrument.getInstId(), null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, 8108, null));
                    this.AYXKKw.put(quoteSymbol, orDefault);
                }
            }
        }
        String simpleName = RecurringTradePresenterNew.class.getSimpleName();
        Set<String> setKeySet = this.AYXKKw.keySet();
        Collection<ArrayList<SelectCoinData>> collectionValues = this.AYXKKw.values();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((ArrayList) it.next()).size()));
        }
        pUU.EZpvd("USDRename", simpleName + " sortCoinsBySymbol() investMap: key: " + setKeySet + " value size : " + arrayList);
    }

    public final ArrayList<SelectCoinData> djBIcL() {
        String strDbNXlk = fvQaOB().DbNXlk();
        ArrayList<SelectCoinData> arrayList = this.AYXKKw.get(strDbNXlk);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        pUU.EZpvd("USDRename", RecurringTradePresenterNew.class.getSimpleName() + " getAvailCoinList() currentQuote: " + strDbNXlk + ", currentAvailableList size: " + arrayList.size());
        return arrayList;
    }

    public final BizInstrument AYXKKw() {
        Object next;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Iterator<T> it = djBIcL().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((SelectCoinData) next).getInstId(), (Object) fvQaOB().gEmmrt())) {
                break;
            }
        }
        if (((SelectCoinData) next) != null) {
            pUU.EZpvd("USDRename", RecurringTradePresenterNew.class.getSimpleName() + " getCurrentBiz() found syncSelectedBizInst in avaliableList");
            BizInstrument bizInstrumentAhwBna = fvQaOB().AhwBna();
            if (bizInstrumentAhwBna != null) {
                return bizInstrumentAhwBna;
            }
        }
        SelectCoinData selectCoinData = (SelectCoinData) CollectionsKt___CollectionsKt.firstOrNull(djBIcL());
        if (selectCoinData == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return null;
        }
        return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SPOT", selectCoinData.getInstId(), null, null, 12, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.fetchVPNInfo, this.AkhnZx);
    }

    public final int fetchVPNInfo() {
        return C56046xvS.AEQbTJ.AEQbTJ();
    }

    public final String KWHzl(int i, int i2, int i3, @NotNull FirstTimeBuyOption firstTimeBuyOption) {
        Intrinsics.checkNotNullParameter(firstTimeBuyOption, "");
        return this.AuCTel.EZpvd(i, i2, i3, firstTimeBuyOption == FirstTimeBuyOption.BUY_NOW);
    }

    public final void OLrzqt(ArrayList<SelectCoinData> arrayList) {
        if (AEQbTJ(arrayList)) {
            return;
        }
        this.fJNWhG.postValue("average_ratio");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AEQbTJ(@NotNull ArrayList<SelectCoinData> arrayList) {
        String str;
        String strValueOf;
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.DbNXlk.clear();
        String strOLrzqt = fvQaOB().OLrzqt();
        String str2 = strOLrzqt == null ? "" : strOLrzqt;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SelectCoinData) it.next()).getName());
        }
        if (arrayList2.contains(str2)) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            this.DbNXlk.add(new SelectCoinData((interfaceC54581xNrOLrzqt == null || (strValueOf = interfaceC54581xNrOLrzqt.valueOf(str2)) == null) ? "" : strValueOf, str2, "100", true, false, false, fvQaOB().gEmmrt(), null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, 8112, null));
            return false;
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        SelectCoinData selectCoinData = (SelectCoinData) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null) {
            str = "";
        } else {
            String name = selectCoinData.getName();
            if (name == null) {
                name = "";
            }
            String strValueOf2 = interfaceC54581xNrOLrzqt2.valueOf(name);
            if (strValueOf2 != null) {
                str = strValueOf2;
            }
        }
        this.DbNXlk.add(new SelectCoinData(str, selectCoinData.getName(), "100", true, false, false, selectCoinData.getInstId(), null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, 8112, null));
        return false;
    }

    public final void copydefault(List<SelectCoinData> list) {
        C56064xvk c56064xvk = C56064xvk.copydefault;
        ArrayList<SelectCoinData> arrayList = this.DbNXlk;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            String ratio = ((SelectCoinData) it.next()).getRatio();
            if (ratio == null) {
                ratio = "";
            }
            arrayList2.add(ratio);
        }
        if (c56064xvk.copydefault(arrayList2)) {
            this.DbNXlk.clear();
            this.DbNXlk.addAll(list);
            ArrayList<String> arrayListAEQbTJ = C56064xvk.copydefault.AEQbTJ(this.DbNXlk.size());
            int size = this.DbNXlk.size();
            for (int i = 0; i < size; i++) {
                this.DbNXlk.get(i).setRatio(arrayListAEQbTJ.get(i));
            }
            this.fJNWhG.postValue("average_ratio");
            return;
        }
        this.DbNXlk.clear();
        this.DbNXlk.addAll(list);
        this.fJNWhG.postValue("custom_ratio");
    }

    public final void wlaJM() {
        this.fIwbmz = 0;
        this.fARcdN = fetchVPNInfo();
    }

    public static /* synthetic */ void fetchAccountGroupData$default(RecurringTradePresenterNew recurringTradePresenterNew, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        recurringTradePresenterNew.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        String id;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        TradeCoinInfo tradeCoinInfoAhwBna;
        if (AYXKKw() == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(fvQaOB().copydefault("recurring"))) == null || (id = tradeCoinInfoAhwBna.getId()) == null) {
            id = "";
        }
        if (id.length() == 0) {
            return;
        }
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new RecurringTradePresenterNew$fetchAccountGroupData$1(this, id, z ? CacheStrategy.NO_CACHE : CacheStrategy.FIRST_CACHE, null), 2, null);
    }

    public final ArrayList<AccountShow> AhwBna() {
        Object next;
        AccountShow accountShow;
        Object next2;
        ArrayList<AccountBalance> value = this.OLrzqt.getValue();
        ArrayList<AccountShow> arrayList = null;
        if (value != null) {
            ArrayList<AccountBalance> arrayList2 = new ArrayList();
            for (Object obj : value) {
                if (yDY.copydefault(AccountType.FUND.getValue(), AccountType.EARN.getValue()).contains(((AccountBalance) obj).getTarget())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (AccountBalance accountBalance : arrayList2) {
                if (Activity.KWHzl[accountBalance.getAccountType().ordinal()] == 1) {
                    Iterator<T> it = this.copydefault.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        if (((AccountType) next2) == AccountType.FUND) {
                            break;
                        }
                    }
                    AccountType accountType = (AccountType) next2;
                    String strIsConnected = accountBalance.getAvailable().length() == 0 ? isConnected() : AEQbTJ(accountBalance.getAvailable());
                    accountShow = new AccountShow(AccountType.FUND, C33070mpX.AYXKKw(C48033uCm.Fragment.aPFruk), C33070mpX.AYXKKw(C48033uCm.Fragment.hdBMmm) + " " + strIsConnected, accountType != null);
                } else {
                    Iterator<T> it2 = this.copydefault.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (((AccountType) next) == AccountType.EARN) {
                            break;
                        }
                    }
                    accountShow = new AccountShow(AccountType.EARN, C33070mpX.AYXKKw(C48033uCm.Fragment.apNKau), C33069mpW.copydefault(C48033uCm.Fragment.UlJrfe, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", accountBalance.getAvailable().length() == 0 ? isConnected() : AEQbTJ(accountBalance.getAvailable())))), ((AccountType) next) != null);
                }
                arrayList3.add(accountShow);
            }
            arrayList = new ArrayList<>(arrayList3);
        }
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    public final String isConnected() {
        return "-- " + fvQaOB().copydefault("recurring");
    }

    public final String AEQbTJ(@NotNull String str) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        C54571xNh c54571xNhEZpvd = fvQaOB().EZpvd(str, true, fvQaOB().copydefault("recurring"));
        return (c54571xNhEZpvd == null || (c54536xMLAYXKKw = c54571xNhEZpvd.AYXKKw(str)) == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) ? "" : safeString$default;
    }

    public final Pair<? extends String, ? extends String> iwGUEr() {
        Object next;
        String available;
        ArrayList<AccountBalance> value = this.OLrzqt.getValue();
        if (value == null) {
            return uLP.Companion.OLrzqt();
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((AccountBalance) next).getTarget(), (Object) AccountType.TRADE.getValue())) {
                break;
            }
        }
        AccountBalance accountBalance = (AccountBalance) next;
        if (accountBalance == null || (available = accountBalance.getAvailable()) == null) {
            available = "";
        }
        ArrayList<AccountBalance> arrayList = new ArrayList();
        for (Object obj : value) {
            AccountBalance accountBalance2 = (AccountBalance) obj;
            ArrayList<AccountType> arrayList2 = this.copydefault;
            if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                Iterator<T> it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.EZpvd((Object) ((AccountType) it2.next()).getValue(), (Object) accountBalance2.getTarget())) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        String available2 = available;
        for (AccountBalance accountBalance3 : arrayList) {
            if (accountBalance3.getAvailable().length() > 0) {
                available2 = available2.length() == 0 ? accountBalance3.getAvailable() : C33129mqd.addS$default(available2, accountBalance3.getAvailable(), null, null, null, 14, null);
            }
        }
        if (available.length() == 0) {
            return uLP.EZpvd(isConnected(), "");
        }
        return uLP.EZpvd(AEQbTJ(available2), available2);
    }

    public final String AEQbTJ(@NotNull AccountType accountType) {
        Object next;
        String available;
        String str = "";
        Intrinsics.checkNotNullParameter(accountType, "");
        ArrayList<AccountBalance> value = this.OLrzqt.getValue();
        if (value == null) {
            return "";
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((AccountBalance) next).getTarget(), (Object) accountType.getValue())) {
                break;
            }
        }
        AccountBalance accountBalance = (AccountBalance) next;
        if (accountBalance != null && (available = accountBalance.getAvailable()) != null) {
            str = available;
        }
        return AEQbTJ(str);
    }

    public final void KWHzl(@NotNull String str) {
        String minInvestment;
        Intrinsics.checkNotNullParameter(str, "");
        String strKWHzl = uLP.KWHzl(iwGUEr());
        MinInvestResp value = this.AhwBna.getValue();
        if (value == null || (minInvestment = value.getMinInvestment()) == null) {
            minInvestment = "0";
        }
        this.valueOf.postValue((C33129mqd.gEmmrt(str, minInvestment) || str.length() == 0 || strKWHzl.length() == 0) ? "--" : pTB.formatLocalized$default(C33129mqd.divS$default(strKWHzl, str, 0, null, null, 12, null), null, 1, null));
    }

    public final boolean copydefault() {
        ArrayList<SelectCoinData> arrayList = this.DbNXlk;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (C33129mqd.AEQbTJ(((SelectCoinData) obj).getRatio(), 0)) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        int iAhwBna = 0;
        while (it.hasNext()) {
            iAhwBna += C33129mqd.AhwBna(((SelectCoinData) it.next()).getRatio());
        }
        return iAhwBna == 100;
    }

    public final List<CoinRatioParam> getFieldNames() {
        ArrayList<SelectCoinData> arrayList = this.DbNXlk;
        ArrayList<SelectCoinData> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (C33129mqd.AEQbTJ(((SelectCoinData) obj).getRatio(), 0)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        for (SelectCoinData selectCoinData : arrayList2) {
            String name = selectCoinData.getName();
            if (name == null) {
                name = "";
            }
            arrayList3.add(new CoinRatioParam(name, String.valueOf(C33129mqd.AEQbTJ(selectCoinData.getRatio()) / ((double) 100.0f)), (String) null, (String) null, 12, (DefaultConstructorMarker) null));
        }
        return arrayList3;
    }

    public final List<CoinRatioParam> AEQbTJ() {
        ArrayList<SelectCoinData> arrayList = this.DbNXlk;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (SelectCoinData selectCoinData : arrayList) {
            String name = selectCoinData.getName();
            if (name == null) {
                name = "";
            }
            double dAEQbTJ = C33129mqd.AEQbTJ(selectCoinData.getRatio()) / ((double) 100.0f);
            arrayList2.add(new CoinRatioParam(name, String.valueOf(dAEQbTJ), selectCoinData.getMinPrice(), selectCoinData.getMaxPrice()));
        }
        return arrayList2;
    }

    public final String fJNWhG() {
        ArrayList<SelectCoinData> arrayList = this.DbNXlk;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            SelectCoinData selectCoinData = (SelectCoinData) obj;
            if (C33129mqd.OLrzqt((CharSequence) selectCoinData.getMaxPrice()) || C33129mqd.OLrzqt((CharSequence) selectCoinData.getMinPrice())) {
                arrayList2.add(obj);
            }
        }
        if (C33129mqd.KWHzl((Collection) arrayList2)) {
            if (arrayList2.size() == 1) {
                SelectCoinData selectCoinData2 = (SelectCoinData) arrayList2.get(0);
                C56046xvS c56046xvS = C56046xvS.AEQbTJ;
                String name = selectCoinData2.getName();
                if (name == null) {
                    name = "";
                }
                return c56046xvS.KWHzl(name, selectCoinData2.getMinPrice(), selectCoinData2.getMaxPrice());
            }
            return C33069mpW.copydefault(C55688xof.Application.sWlOSi, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(Integer.valueOf(arrayList2.size())))));
        }
        return C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
    }

    public final void EZpvd(@NotNull List<C55801xqm> list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "");
        for (SelectCoinData selectCoinData : this.DbNXlk) {
            selectCoinData.setMaxPrice(null);
            selectCoinData.setMinPrice(null);
        }
        for (C55801xqm c55801xqm : list) {
            Iterator<T> it = this.DbNXlk.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((SelectCoinData) next).getName(), (Object) c55801xqm.OLrzqt())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SelectCoinData selectCoinData2 = (SelectCoinData) next;
            if (selectCoinData2 != null) {
                selectCoinData2.setMinPrice(c55801xqm.AYXKKw());
                selectCoinData2.setMaxPrice(c55801xqm.valueOf());
            }
        }
    }
}
