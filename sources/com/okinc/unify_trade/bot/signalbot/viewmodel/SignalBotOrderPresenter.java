package com.okinc.unify_trade.bot.signalbot.viewmodel;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.biz.TradeType;
import com.okinc.unify_trade.biz.ArbitrageCostVo;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.MultiMinAmountItem;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SignalDetails;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.SignalListResult;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import com.okinc.unify_trade.bot.data.SignalMultiCoinPairSelectItemData;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC54531xLw;
import o.C33129mqd;
import o.C54219xAh;
import o.C54507xKz;
import o.C54589xNz;
import o.C54799xVt;
import o.C55688xof;
import o.C55697xoo;
import o.C55983xuI;
import o.C56111xwe;
import o.C56193xyG;
import o.C56235xyw;
import o.C56262xzW;
import o.C56278xzm;
import o.C56402yEa;
import o.C56403yEb;
import o.C56423yEv;
import o.C56548yJl;
import o.C59449zhJ;
import o.InterfaceC54501xKt;
import o.InterfaceC54581xNr;
import o.pTB;
import o.xAU;
import o.xAZ;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalBotOrderPresenter extends BaseBotOrderPresenter {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public static final List<String> copydefault = C56402yEa.EZpvd("USDT");
    public final C56235xyw AEQbTJ;
    public final C56278xzm AYXKKw;
    public final EntrySignalOrderAmtParam AhwBna;
    public final C56193xyG AkhnZx;
    public final C56111xwe<StrategyResponse> AuCTel;
    public final C56111xwe<MultiMinAmountItem> DbNXlk;
    public final xAZ EZpvd;
    public final C56111xwe<StrategyConfigInfo> KWHzl;
    public final ArrayList<SignalMultiCoinPairSelectItemData> djBIcL;
    public final ArrayList<SignalCoinPairItemData> ejfBZ;
    public final C56262xzW fARcdN;
    public final ArrayList<SignalCoinPairItemData> fIwbmz;
    public final C54219xAh fJNWhG;
    public final C56111xwe<ArrayList<SignalCoinPairItemData>> fetchVPNInfo;
    public final String gEmmrt;
    public final xAU getNewProxyInstance;
    public final C56111xwe<List<SignalListItem>> hDKMBd;
    public final TradeLiveData<SignalDetails> isConnected;
    public final TradeLiveData<ThirdSignalDetail> iwGUEr;
    public final SignalBotReq uzCIH;
    public final ThirdSignalDetail valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAZ AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.values = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<ArrayList<SignalCoinPairItemData>> AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ThirdSignalDetail AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56262xzW AkhnZx() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SignalCoinPairItemData> AuCTel() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<SignalDetails> DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<StrategyConfigInfo> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<StrategyResponse> ejfBZ() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54219xAh fARcdN() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SignalCoinPairItemData> fIwbmz() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalBotReq fJNWhG() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56193xyG fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SignalMultiCoinPairSelectItemData> gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAU getNewProxyInstance() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<SignalListItem>> hDKMBd() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<MultiMinAmountItem> isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ThirdSignalDetail> uzCIH() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56235xyw valueOf() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.values;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotOrderPresenter.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotOrderPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.uzCIH = new SignalBotReq((String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (ThirdSignalDetail) null, false, (ArrayList) null, (String) null, (AutoVipProfitInfo) null, 32767, (DefaultConstructorMarker) null);
        this.djBIcL = new ArrayList<>();
        this.fIwbmz = new ArrayList<>();
        this.ejfBZ = new ArrayList<>();
        this.AhwBna = new EntrySignalOrderAmtParam((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        this.values = 4;
        this.gEmmrt = "USDT";
        this.valueOf = new ThirdSignalDetail((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
        this.EZpvd = new xAZ();
        this.iwGUEr = new TradeLiveData<>();
        this.AYXKKw = new C56278xzm();
        this.isConnected = new TradeLiveData<>();
        this.AuCTel = new C56111xwe<>();
        this.fJNWhG = new C54219xAh();
        this.hDKMBd = new C56111xwe<>();
        this.getNewProxyInstance = new xAU();
        this.fetchVPNInfo = new C56111xwe<>();
        this.AkhnZx = new C56193xyG();
        this.AEQbTJ = new C56235xyw();
        this.KWHzl = new C56111xwe<>();
        this.DbNXlk = new C56111xwe<>();
        this.fARcdN = new C56262xzW();
    }

    public static /* synthetic */ void refreshBaseData$default(SignalBotOrderPresenter signalBotOrderPresenter, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        signalBotOrderPresenter.EZpvd(str, str2, str3);
    }

    public final void EZpvd(String str, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        ThirdSignalDetail thirdSignalDetail = this.valueOf;
        thirdSignalDetail.setSignalChanId(str);
        thirdSignalDetail.setSignalChanName(str2);
        thirdSignalDetail.setType(str3);
        this.uzCIH.setSignalItem(this.valueOf);
    }

    public final void gHZMYf() {
        if (this.iwGUEr.getValue() == null) {
            return;
        }
        ThirdSignalDetail value = this.iwGUEr.getValue();
        Intrinsics.copydefault(value);
        ThirdSignalDetail thirdSignalDetail = value;
        ThirdSignalDetail thirdSignalDetail2 = this.valueOf;
        thirdSignalDetail2.setTickType(thirdSignalDetail.getTickType());
        thirdSignalDetail2.setInstIds(thirdSignalDetail.getInstIds());
        thirdSignalDetail2.setTipLever(thirdSignalDetail.getTipLever());
        thirdSignalDetail2.setTipMinInvest(thirdSignalDetail.getTipMinInvest());
        this.uzCIH.setSignalItem(this.valueOf);
    }

    public final void zuBGHE() {
        if (this.isConnected.getValue() == null) {
            return;
        }
        SignalDetails value = this.isConnected.getValue();
        Intrinsics.copydefault(value);
        SignalDetails signalDetails = value;
        ThirdSignalDetail thirdSignalDetail = this.valueOf;
        thirdSignalDetail.setSubscriptionType(signalDetails.getUserSubscriptionType());
        thirdSignalDetail.setSubscriptionFee(signalDetails.getSubscriptionFee());
        thirdSignalDetail.setProfitSharingRatio(signalDetails.getProfitSharingRatio());
        thirdSignalDetail.setUsername(signalDetails.getUsername());
        thirdSignalDetail.setAvatar(signalDetails.getAvatar());
        thirdSignalDetail.setType(signalDetails.getType());
        this.uzCIH.setSignalItem(this.valueOf);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.setSignalChanName(str);
    }

    public final void QfsBiF() {
        xAZ xaz = this.EZpvd;
        xaz.OLrzqt(this.uzCIH.getSignalChanId());
        xaz.djBIcL();
        xaz.OLrzqt(this.iwGUEr, new C54507xKz());
        xKK.Activity.execute$default(xaz, 0L, 1, null);
    }

    public final void RJOkX() {
        C56278xzm c56278xzm = this.AYXKKw;
        c56278xzm.OLrzqt(this.uzCIH.getSignalChanId());
        c56278xzm.djBIcL();
        c56278xzm.OLrzqt(this.isConnected, new C54507xKz());
        xKK.Activity.execute$default(c56278xzm, 0L, 1, null);
    }

    public final List<String> getFieldNames() {
        List<String> listSplit$default;
        String instIds = this.valueOf.getInstIds();
        return (instIds == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) instIds, new String[]{","}, false, 0, 6, (Object) null)) == null) ? yDY.AhwBna() : listSplit$default;
    }

    public final void KWHzl() {
        ArrayList<String> arrayListWlaJM = wlaJM();
        boolean z = false;
        if (C33129mqd.OLrzqt((Object) Integer.valueOf(arrayListWlaJM.size()), (Object) 0)) {
            return;
        }
        ArrayList<SignalCoinPairItemData> arrayList = this.fIwbmz;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SignalCoinPairItemData) it.next()).getInstId());
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (!arrayListWlaJM.contains((String) it2.next())) {
                z = true;
            }
        }
        this.uzCIH.setContainsUnSupportPair(z);
    }

    public final ArrayList<String> wlaJM() {
        String instIds;
        ThirdSignalDetail value = this.iwGUEr.getValue();
        List listSplit$default = (value == null || (instIds = value.getInstIds()) == null) ? null : StringsKt__StringsKt.split$default((CharSequence) instIds, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList<String> arrayList = listSplit$default instanceof ArrayList ? (ArrayList) listSplit$default : null;
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    public final void OLrzqt(@NotNull ArrayList<SignalCoinPairItemData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        ArrayList arrayList2 = new ArrayList();
        for (SignalCoinPairItemData signalCoinPairItemData : this.fIwbmz) {
            if (!arrayList.contains(signalCoinPairItemData)) {
                arrayList2.add(signalCoinPairItemData);
            }
        }
        this.fIwbmz.clear();
        this.fIwbmz.addAll(arrayList2);
    }

    public final void zLjUOn() {
        String name;
        this.djBIcL.clear();
        ArrayList<SignalCoinPairItemData> value = this.fetchVPNInfo.getValue();
        if (value != null) {
            for (SignalCoinPairItemData signalCoinPairItemData : value) {
                boolean zContains = this.uzCIH.getInstIds().contains(signalCoinPairItemData.getInstId());
                boolean zValueOf = C33129mqd.valueOf(this.uzCIH.getLever(), signalCoinPairItemData.getMaxLever());
                TradeCoinInfo tradeCoinInfoOLrzqt = C54799xVt.AEQbTJ.OLrzqt(signalCoinPairItemData.getCcy());
                this.djBIcL.add(new SignalMultiCoinPairSelectItemData(signalCoinPairItemData.getTitle(), signalCoinPairItemData.getTitleUrl(), signalCoinPairItemData.getInstId(), signalCoinPairItemData.getInstType(), signalCoinPairItemData.getMaxLever(), zContains, zValueOf, null, AudioStats.AUDIO_AMPLITUDE_NONE, (tradeCoinInfoOLrzqt == null || (name = tradeCoinInfoOLrzqt.getName()) == null) ? signalCoinPairItemData.getTitle() : name, AudioStats.AUDIO_AMPLITUDE_NONE, 1408, null));
            }
        }
    }

    public final void AxsJAY() {
        this.AhwBna.setDeleType("1");
        SignalBotReq signalBotReq = this.uzCIH;
        signalBotReq.setSubOrdType("2");
        signalBotReq.setAllowMultipleEntry(true);
        signalBotReq.setSignalOrderAmtParam(this.AhwBna);
        signalBotReq.setSignalBotOrderStopParam(null);
    }

    public final void DTwDnp() {
        this.fIwbmz.clear();
        EntrySignalOrderAmtParam entrySignalOrderAmtParam = this.AhwBna;
        entrySignalOrderAmtParam.setDeleType("1");
        entrySignalOrderAmtParam.setAmt(null);
        entrySignalOrderAmtParam.setAmtRatio(null);
        SignalBotReq signalBotReq = this.uzCIH;
        signalBotReq.setSignalChanId("");
        signalBotReq.setSignalItem(null);
        signalBotReq.setOrdType("signal_bot");
        signalBotReq.setTotalAmt("");
        signalBotReq.setSubOrdType("2");
        signalBotReq.setRatio(null);
        signalBotReq.setSignalOrderAmtParam(this.AhwBna);
        signalBotReq.setSignalBotOrderStopParam(null);
        signalBotReq.setAllowMultipleEntry(true);
    }

    public final void EZpvd() {
        this.uzCIH.setInstIds(new ArrayList<>(CollectionsKt___CollectionsKt.QbewEr(this.uzCIH.getInstIds())));
        AubY();
        C54219xAh c54219xAh = this.fJNWhG;
        c54219xAh.EZpvd(sSMYrx());
        c54219xAh.EZpvd(this.uzCIH);
        c54219xAh.OLrzqt(this.AuCTel, new C54507xKz());
        xKK.Activity.execute$default(c54219xAh, 0L, 1, null);
    }

    public final void AubY() {
        EntrySignalOrderAmtParam signalOrderAmtParam;
        EntrySignalOrderAmtParam signalOrderAmtParam2 = this.uzCIH.getSignalOrderAmtParam();
        String deleType = signalOrderAmtParam2 != null ? signalOrderAmtParam2.getDeleType() : null;
        if (deleType != null) {
            switch (deleType.hashCode()) {
                case 49:
                    if (deleType.equals("1")) {
                        EntrySignalOrderAmtParam signalOrderAmtParam3 = this.uzCIH.getSignalOrderAmtParam();
                        if (signalOrderAmtParam3 != null) {
                            signalOrderAmtParam3.setAmt(null);
                        }
                        EntrySignalOrderAmtParam signalOrderAmtParam4 = this.uzCIH.getSignalOrderAmtParam();
                        if (signalOrderAmtParam4 != null) {
                            signalOrderAmtParam4.setAmtRatio(null);
                            return;
                        }
                        return;
                    }
                    return;
                case 50:
                    if (deleType.equals("2") && (signalOrderAmtParam = this.uzCIH.getSignalOrderAmtParam()) != null) {
                        signalOrderAmtParam.setAmtRatio(null);
                        return;
                    }
                    return;
                case 51:
                default:
                    return;
                case 52:
                    if (!deleType.equals("4")) {
                        return;
                    }
                    break;
                case 53:
                    if (!deleType.equals("5")) {
                        return;
                    }
                    break;
            }
            EntrySignalOrderAmtParam signalOrderAmtParam5 = this.uzCIH.getSignalOrderAmtParam();
            if (signalOrderAmtParam5 != null) {
                signalOrderAmtParam5.setAmt(null);
            }
        }
    }

    public final StrategyBaseReq sSMYrx() {
        return new StrategyBaseReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, "signal_bot", (TradeType) null, (String) null, (Boolean) null, 1919, (DefaultConstructorMarker) null);
    }

    public final void ORxRYg() {
        xAU xau = this.getNewProxyInstance;
        xau.OLrzqt(this.hDKMBd, new StateListAnimator());
        xKK.Activity.execute$default(xau, 0L, 1, null);
    }

    public static final class StateListAnimator implements InterfaceC54501xKt<List<? extends SignalListResult>, List<? extends SignalListItem>> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public List<SignalListItem> KWHzl(List<SignalListResult> list) {
            List<SignalListItem> signals;
            Intrinsics.checkNotNullParameter(list, "");
            SignalListResult signalListResult = (SignalListResult) CollectionsKt___CollectionsKt.firstOrNull(list);
            return (signalListResult == null || (signals = signalListResult.getSignals()) == null) ? yDY.AhwBna() : signals;
        }
    }

    public final void QKVWgx() {
        String tradeSymbol;
        String str;
        String leveragePercents;
        List listSplit$default;
        String strValueOf;
        BizInstrument suggestedInstrument$default;
        ArrayList arrayList;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        if (C55697xoo.OLrzqt.isConnected()) {
            C56193xyG c56193xyG = this.AkhnZx;
            c56193xyG.copydefault("SWAP");
            c56193xyG.OLrzqt(this.fetchVPNInfo, new C55983xuI());
            xKK.Activity.execute$default(c56193xyG, 0L, 1, null);
            return;
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        ArrayList<BizInstrument> arrayListEZpvd = (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt("SWAP")) == null) ? null : abstractC54531xLwOLrzqt.EZpvd();
        ArrayList<SignalCoinPairItemData> arrayList2 = new ArrayList<>();
        arrayList2.clear();
        ArrayList<BizInstrument> arrayList3 = new ArrayList();
        for (String str2 : copydefault) {
            if (arrayListEZpvd == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList();
                for (Object obj : arrayListEZpvd) {
                    if (C59449zhJ.endsWith$default(((BizInstrument) obj).getInstId(), "-" + str2 + "-SWAP", false, 2, null)) {
                        arrayList.add(obj);
                    }
                }
            }
            arrayList3.addAll(arrayList);
        }
        for (BizInstrument bizInstrument : arrayList3) {
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, bizInstrument.getInstType(), bizInstrument.getInstId(), null, null, 12, null)) == null || (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) == null) {
                tradeSymbol = "";
            }
            String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, 12, null);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            String str3 = (interfaceC54581xNrOLrzqt2 == null || (strValueOf = interfaceC54581xNrOLrzqt2.valueOf(tradeSymbol)) == null) ? "" : strValueOf;
            StrategyConfigInfo value = this.KWHzl.getValue();
            if (value == null || (leveragePercents = value.getLeveragePercents()) == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) leveragePercents, new String[]{","}, false, 0, 6, (Object) null)) == null || (str = (String) CollectionsKt___CollectionsKt.wlaJM(listSplit$default)) == null) {
                str = "125";
            }
            String str4 = str;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt3 != null && interfaceC54581xNrOLrzqt3.OLrzqt(bizInstrument.getInstId(), bizInstrument.getInstType())) {
                arrayList2.add(new SignalCoinPairItemData(titleByIdAndType$default, str3, (Integer) null, (Integer) null, bizInstrument.getInstId(), bizInstrument.getInstType(), tradeSymbol, str4, false, false, false, 0, false, 7948, (DefaultConstructorMarker) null));
            }
        }
        this.fetchVPNInfo.postValue(arrayList2);
    }

    public final void QOLQEE() {
        C56235xyw c56235xyw = this.AEQbTJ;
        c56235xyw.KWHzl("signal_bot");
        c56235xyw.AEQbTJ("BTC-USDT-SWAP");
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(this.KWHzl, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public final void OcIXYQ() {
        if (C33129mqd.AEQbTJ(Integer.valueOf(this.uzCIH.getInstIds().size()), 0) && C33129mqd.AEQbTJ(this.uzCIH.getLever(), 0)) {
            C56262xzW c56262xzW = this.fARcdN;
            c56262xzW.OLrzqt("signal_bot");
            c56262xzW.EZpvd(this.uzCIH.getInstIds());
            c56262xzW.EZpvd(this.uzCIH.getLever());
            c56262xzW.OLrzqt(this.DbNXlk, new C54507xKz());
            xKK.Activity.execute$default(c56262xzW, 0L, 1, null);
            return;
        }
        this.DbNXlk.postValue(new MultiMinAmountItem("", (String) null, (String) null, (ArbitrageCostVo) null, (List) null, (String) null, 62, (DefaultConstructorMarker) null));
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uzCIH.setSignalChanId(str);
    }

    public final void copydefault(@NotNull SignalBotReq signalBotReq) {
        Intrinsics.checkNotNullParameter(signalBotReq, "");
        this.uzCIH.setSignalBotOrderStopParam(signalBotReq.getSignalBotOrderStopParam());
    }

    public final void KWHzl(@NotNull SignalBotReq signalBotReq) {
        Intrinsics.checkNotNullParameter(signalBotReq, "");
        this.uzCIH.setSubOrdType(signalBotReq.getSubOrdType());
        this.uzCIH.setRatio(signalBotReq.getRatio());
    }

    public final void OLrzqt(@NotNull SignalBotReq signalBotReq) {
        Intrinsics.checkNotNullParameter(signalBotReq, "");
        this.uzCIH.setAllowMultipleEntry(signalBotReq.getAllowMultipleEntry());
        EntrySignalOrderAmtParam signalOrderAmtParam = this.uzCIH.getSignalOrderAmtParam();
        if (signalOrderAmtParam != null) {
            EntrySignalOrderAmtParam signalOrderAmtParam2 = signalBotReq.getSignalOrderAmtParam();
            signalOrderAmtParam.setDeleType(signalOrderAmtParam2 != null ? signalOrderAmtParam2.getDeleType() : null);
        }
        EntrySignalOrderAmtParam signalOrderAmtParam3 = this.uzCIH.getSignalOrderAmtParam();
        if (signalOrderAmtParam3 != null) {
            EntrySignalOrderAmtParam signalOrderAmtParam4 = signalBotReq.getSignalOrderAmtParam();
            signalOrderAmtParam3.setAmt(signalOrderAmtParam4 != null ? signalOrderAmtParam4.getAmt() : null);
        }
        EntrySignalOrderAmtParam signalOrderAmtParam5 = this.uzCIH.getSignalOrderAmtParam();
        if (signalOrderAmtParam5 != null) {
            EntrySignalOrderAmtParam signalOrderAmtParam6 = signalBotReq.getSignalOrderAmtParam();
            signalOrderAmtParam5.setAmtRatio(signalOrderAmtParam6 != null ? signalOrderAmtParam6.getAmtRatio() : null);
        }
    }

    public final void zsXlph() {
        this.uzCIH.getInstIds().clear();
        ArrayList<String> instIds = this.uzCIH.getInstIds();
        ArrayList<SignalCoinPairItemData> arrayList = this.fIwbmz;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SignalCoinPairItemData) it.next()).getInstId());
        }
        instIds.addAll(arrayList2);
        OcIXYQ();
        if (!C33129mqd.copydefault((Object) Integer.valueOf(this.fIwbmz.size()), (Object) 1) || !C33129mqd.valueOf(Integer.valueOf(this.fIwbmz.size()), 10)) {
            if (C33129mqd.AEQbTJ(Integer.valueOf(this.fIwbmz.size()), 10)) {
                this.ejfBZ.clear();
                int i = 0;
                for (Object obj : this.fIwbmz) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    SignalCoinPairItemData signalCoinPairItemData = (SignalCoinPairItemData) obj;
                    if (C33129mqd.gEmmrt(Integer.valueOf(i), 9)) {
                        this.ejfBZ.add(signalCoinPairItemData);
                    }
                    i++;
                }
                this.ejfBZ.add(new SignalCoinPairItemData(Marker.ANY_NON_NULL_MARKER + pTB.formatLocalized$default(C33129mqd.subS$default(Integer.valueOf(this.fIwbmz.size()), 9, null, null, null, 14, null), null, 1, null), (String) null, Integer.valueOf(C55688xof.TaskDescription.OLrzqt), Integer.valueOf(C55688xof.TaskDescription.KWHzl), (String) null, (String) null, (String) null, (String) null, true, false, false, 0, false, 7410, (DefaultConstructorMarker) null));
                return;
            }
            return;
        }
        this.ejfBZ.clear();
        this.ejfBZ.addAll(this.fIwbmz);
    }

    public final void AwvSrB() {
        List<String> fieldNames = getFieldNames();
        this.fIwbmz.clear();
        String tickType = this.valueOf.getTickType();
        if (Intrinsics.EZpvd((Object) tickType, (Object) "1")) {
            ArrayList<SignalCoinPairItemData> value = this.fetchVPNInfo.getValue();
            if (value != null) {
                for (SignalCoinPairItemData signalCoinPairItemData : value) {
                    if (C33129mqd.valueOf(this.valueOf.getTipLever(), signalCoinPairItemData.getMaxLever())) {
                        this.fIwbmz.add(signalCoinPairItemData);
                    }
                }
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd((Object) tickType, (Object) "2")) {
            if (C33129mqd.OLrzqt((Object) Integer.valueOf(fieldNames.size()), (Object) 0)) {
                SignalCoinPairItemData signalCoinPairItemDataQVAiDq = QVAiDq();
                if (signalCoinPairItemDataQVAiDq != null) {
                    this.fIwbmz.add(signalCoinPairItemDataQVAiDq);
                    return;
                }
                return;
            }
            ArrayList<SignalCoinPairItemData> value2 = this.fetchVPNInfo.getValue();
            if (value2 != null) {
                for (SignalCoinPairItemData signalCoinPairItemData2 : value2) {
                    if (fieldNames.contains(signalCoinPairItemData2.getInstId()) && C33129mqd.valueOf(this.valueOf.getTipLever(), signalCoinPairItemData2.getMaxLever())) {
                        this.fIwbmz.add(signalCoinPairItemData2);
                    }
                }
                return;
            }
            return;
        }
        SignalCoinPairItemData signalCoinPairItemDataQVAiDq2 = QVAiDq();
        if (signalCoinPairItemDataQVAiDq2 != null) {
            this.fIwbmz.add(signalCoinPairItemDataQVAiDq2);
        }
    }

    public final ArrayList<SignalCoinPairItemData> AuCTelauCTel() {
        List<String> fieldNames = getFieldNames();
        ArrayList<SignalCoinPairItemData> arrayList = new ArrayList<>();
        String tickType = this.valueOf.getTickType();
        if (Intrinsics.EZpvd((Object) tickType, (Object) "1")) {
            ArrayList<SignalCoinPairItemData> value = this.fetchVPNInfo.getValue();
            if (value != null) {
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    arrayList.add((SignalCoinPairItemData) it.next());
                }
            }
        } else if (Intrinsics.EZpvd((Object) tickType, (Object) "2")) {
            if (C33129mqd.OLrzqt((Object) Integer.valueOf(fieldNames.size()), (Object) 0)) {
                SignalCoinPairItemData signalCoinPairItemDataQVAiDq = QVAiDq();
                if (signalCoinPairItemDataQVAiDq != null) {
                    arrayList.add(signalCoinPairItemDataQVAiDq);
                }
            } else {
                ArrayList<SignalCoinPairItemData> value2 = this.fetchVPNInfo.getValue();
                if (value2 == null) {
                    value2 = yDY.AhwBna();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(value2, 10)), 16));
                for (Object obj : value2) {
                    linkedHashMap.put(((SignalCoinPairItemData) obj).getInstId(), obj);
                }
                Iterator<T> it2 = fieldNames.iterator();
                while (it2.hasNext()) {
                    SignalCoinPairItemData signalCoinPairItemData = (SignalCoinPairItemData) linkedHashMap.get((String) it2.next());
                    if (signalCoinPairItemData != null) {
                        arrayList.add(signalCoinPairItemData);
                    }
                }
            }
        } else {
            SignalCoinPairItemData signalCoinPairItemDataQVAiDq2 = QVAiDq();
            if (signalCoinPairItemDataQVAiDq2 != null) {
                arrayList.add(signalCoinPairItemDataQVAiDq2);
            }
        }
        return arrayList;
    }

    public final SignalCoinPairItemData QVAiDq() {
        SignalCoinPairItemData signalCoinPairItemData;
        ArrayList<SignalCoinPairItemData> value;
        Object next;
        ArrayList<SignalCoinPairItemData> value2 = this.fetchVPNInfo.getValue();
        if (value2 != null) {
            Iterator<T> it = value2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((SignalCoinPairItemData) next).getInstId(), (Object) "BTC-USDT-SWAP")) {
                    break;
                }
            }
            signalCoinPairItemData = (SignalCoinPairItemData) next;
        } else {
            signalCoinPairItemData = null;
        }
        if (signalCoinPairItemData != null && C33129mqd.copydefault(signalCoinPairItemData.getMaxLever(), this.uzCIH.getLever())) {
            return signalCoinPairItemData;
        }
        ArrayList<SignalCoinPairItemData> value3 = this.fetchVPNInfo.getValue();
        if (!C33129mqd.copydefault((Object) (value3 != null ? Integer.valueOf(value3.size()) : null), (Object) 1) || (value = this.fetchVPNInfo.getValue()) == null) {
            return null;
        }
        return (SignalCoinPairItemData) CollectionsKt___CollectionsKt.firstOrNull(value);
    }

    public final void copydefault() {
        ArrayList<SignalCoinPairItemData> arrayListAuCTelauCTel = AuCTelauCTel();
        Iterator<T> it = arrayListAuCTelauCTel.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!this.fIwbmz.contains((SignalCoinPairItemData) it.next())) {
                z = true;
            }
        }
        this.uzCIH.setTotalCoinPairs(arrayListAuCTelauCTel);
        this.uzCIH.setContainsUnSupportPair(z);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.fJNWhG, this.getNewProxyInstance, this.AkhnZx, this.AEQbTJ, this.fARcdN, this.EZpvd, this.AYXKKw);
    }

    public final String iwGUEr() {
        ArrayList<SignalCoinPairItemData> arrayList = this.fIwbmz;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (SignalCoinPairItemData signalCoinPairItemData : arrayList) {
            arrayList2.add(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, signalCoinPairItemData.getInstId(), signalCoinPairItemData.getInstType(), false, false, 12, null));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 0, null, null, 62, null);
    }
}
