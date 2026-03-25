package com.okinc.tradingbot.impl.market_place.bot_copy.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.biz.TacticsType;
import com.okinc.tradingbot.impl.strategy.bean.SignalProfitCard;
import com.okinc.tradingbot.impl.strategy.bean.SignalSubsData;
import com.okinc.tradingbot.impl.strategy.bean.SignalTriggerCard;
import com.okinc.tradingbot.impl.strategy.bean.SignalTypeData;
import com.okinc.tradingbot.impl.strategy.dataMapper.SignalProfitRange;
import com.okinc.unify_trade.biz.EmptyResp;
import com.okinc.unify_trade.biz.InstTierItem;
import com.okinc.unify_trade.biz.SignalDetails;
import com.okinc.unify_trade.biz.SignalSubsReq;
import com.okinc.unify_trade.bot.data.BotGuideData;
import com.okinc.unify_trade.bot.data.BotGuideItem;
import com.okinc.unify_trade.bot.data.BotGuideLinkItem;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.mapper.SignalBotShareDataMapper;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C33070mpX;
import o.C33129mqd;
import o.C53685wqE;
import o.C53872wtg;
import o.C53874wti;
import o.C53876wtk;
import o.C54252xBn;
import o.C54274xCi;
import o.C55276xgr;
import o.C55688xof;
import o.C56111xwe;
import o.C56193xyG;
import o.C56201xyO;
import o.C56273xzh;
import o.C56274xzi;
import o.C56402yEa;
import o.InterfaceC54501xKt;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SignalBotCopyPresenter extends AbsPresenter {
    public String AEQbTJ;
    public int AYXKKw;
    public SignalProfitRange AhwBna;
    public String AkhnZx;
    public final C56201xyO AuCTel;
    public final TradeLiveData<SignalTriggerCard> DbNXlk;
    public final C56193xyG EZpvd;
    public final C54252xBn KWHzl;
    public final TradeLiveData<List<String>> OLrzqt;
    public final C53872wtg copydefault;
    public final TradeLiveData<TacticsData> djBIcL;
    public final C56274xzi ejfBZ;
    public String fARcdN;
    public final C56111xwe<String> fIwbmz;
    public final TradeLiveData<SignalProfitCard> fetchVPNInfo;
    public final String gEmmrt;
    public final C56273xzh isConnected;
    public final C54274xCi valueOf;
    public final TacticsData values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54252xBn AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54274xCi AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalProfitRange AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<TacticsData> AkhnZx() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<SignalProfitCard> AuCTel() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData DbNXlk() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C53872wtg EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull SignalProfitRange signalProfitRange) {
        Intrinsics.checkNotNullParameter(signalProfitRange, "");
        this.AhwBna = signalProfitRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx = str;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public boolean clearOnDestroy() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<SignalTriggerCard> fJNWhG() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<String>> gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<String> getFieldNames() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewProxyInstance() {
        return this.AYXKKw == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56273xzh isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56274xzi iwGUEr() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56201xyO uzCIH() {
        return this.AuCTel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotCopyPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AkhnZx = "";
        this.AEQbTJ = "";
        this.isConnected = new C56273xzh();
        this.djBIcL = new TradeLiveData<>();
        this.values = new TacticsData(null, null, null, null, null, null, false, null, TacticsType.TACTICS_SIGNAL_BOT, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, 3, null);
        this.KWHzl = new C54252xBn();
        this.copydefault = new C53872wtg();
        this.valueOf = new C54274xCi();
        this.fetchVPNInfo = new TradeLiveData<>();
        this.AhwBna = SignalProfitRange.DAY_30;
        this.AuCTel = new C56201xyO();
        this.DbNXlk = new TradeLiveData<>();
        this.ejfBZ = new C56274xzi();
        this.fIwbmz = new C56111xwe<>();
        this.EZpvd = new C56193xyG();
        this.OLrzqt = new TradeLiveData<>();
        this.fARcdN = "";
        this.AYXKKw = 1;
        this.gEmmrt = "20";
    }

    public final void AubY() {
        C56273xzh c56273xzh = this.isConnected;
        c56273xzh.EZpvd(this.AkhnZx);
        TradeLiveData<TacticsData> tradeLiveData = this.djBIcL;
        SignalBotShareDataMapper signalBotShareDataMapper = new SignalBotShareDataMapper(this.values, SignalBotShareDataMapper.SignalSharePath.SIGNAL_DETAIL);
        signalBotShareDataMapper.EZpvd(fIwbmz());
        Unit unit = Unit.INSTANCE;
        c56273xzh.OLrzqt(tradeLiveData, signalBotShareDataMapper);
        xKK.Activity.execute$default(c56273xzh, 0L, 1, null);
    }

    public final void zLjUOn() {
        C54252xBn c54252xBn = this.KWHzl;
        c54252xBn.OLrzqt().OLrzqt(this.AkhnZx);
        c54252xBn.KWHzl().KWHzl(this.AkhnZx);
        c54252xBn.copydefault().copydefault(this.AkhnZx);
        c54252xBn.fIwbmz();
    }

    public final void zuBGHE() {
        this.AYXKKw = 1;
        AuCTelauCTel();
    }

    public final void wlaJM() {
        this.AYXKKw++;
        AuCTelauCTel();
    }

    public final void AuCTelauCTel() {
        C54274xCi c54274xCi = this.valueOf;
        c54274xCi.OLrzqt(this.fetchVPNInfo, new C53874wti(this.AhwBna));
        c54274xCi.KWHzl(this.AkhnZx);
        c54274xCi.OLrzqt(this.AhwBna.getDuration());
        c54274xCi.EZpvd(C33129mqd.gEmmrt(Integer.valueOf(this.AYXKKw)));
        c54274xCi.AEQbTJ(this.gEmmrt);
        xKK.Activity.execute$default(c54274xCi, 0L, 1, null);
    }

    public final void EZpvd(@NotNull SignalDetails signalDetails) {
        List<String> listAhwBna;
        Intrinsics.checkNotNullParameter(signalDetails, "");
        if (Intrinsics.EZpvd((Object) signalDetails.getTickType(), (Object) "1")) {
            C56193xyG c56193xyG = this.EZpvd;
            c56193xyG.copydefault("SWAP");
            c56193xyG.OLrzqt(this.OLrzqt, new Activity());
            xKK.Activity.execute$default(c56193xyG, 0L, 1, null);
            return;
        }
        TradeLiveData<List<String>> tradeLiveData = this.OLrzqt;
        String instIds = signalDetails.getInstIds();
        if (instIds == null || (listAhwBna = StringsKt__StringsKt.split$default((CharSequence) instIds, new String[]{","}, false, 0, 6, (Object) null)) == null) {
            listAhwBna = yDY.AhwBna();
        }
        tradeLiveData.setValue(listAhwBna);
    }

    public static final class Activity implements InterfaceC54501xKt<List<? extends InstTierItem>, List<? extends String>> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* bridge */ /* synthetic */ List<? extends String> KWHzl(List<? extends InstTierItem> list) {
            return KWHzl2((List<InstTierItem>) list);
        }

        /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
        public List<String> KWHzl2(List<InstTierItem> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String instId = ((InstTierItem) it.next()).getInstId();
                if (instId != null) {
                    arrayList.add(instId);
                }
            }
            return arrayList;
        }
    }

    public final void AwvSrB() {
        this.AYXKKw = 1;
        AxsJAY();
    }

    public final void zsXlph() {
        this.AYXKKw++;
        AxsJAY();
    }

    public final void AxsJAY() {
        C56201xyO c56201xyO = this.AuCTel;
        c56201xyO.OLrzqt(this.DbNXlk, new C53876wtk());
        c56201xyO.copydefault(this.AkhnZx);
        c56201xyO.OLrzqt(C33129mqd.gEmmrt(Integer.valueOf(this.AYXKKw)));
        c56201xyO.KWHzl(this.gEmmrt);
        xKK.Activity.execute$default(c56201xyO, 0L, 1, null);
    }

    public final void copydefault(@NotNull SignalDetails signalDetails) {
        Intrinsics.checkNotNullParameter(signalDetails, "");
        String subscriptionType = signalDetails.getSubscriptionType();
        this.fARcdN = subscriptionType != null ? subscriptionType : "";
        C56274xzi c56274xzi = this.ejfBZ;
        c56274xzi.AEQbTJ(KWHzl(signalDetails));
        c56274xzi.OLrzqt(this.fIwbmz, new TaskDescription(signalDetails));
        xKK.Activity.execute$default(c56274xzi, 0L, 1, null);
    }

    public static final class TaskDescription implements InterfaceC54501xKt<List<? extends EmptyResp>, String> {
        public final /* synthetic */ SignalDetails copydefault;

        public TaskDescription(SignalDetails signalDetails) {
            this.copydefault = signalDetails;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public String KWHzl(List<EmptyResp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return this.copydefault.getBotOrderType();
        }
    }

    public final SignalSubsReq KWHzl(SignalDetails signalDetails) {
        String subscriptionType = signalDetails.getSubscriptionType();
        if (subscriptionType == null) {
            subscriptionType = "";
        }
        SignalSubsReq signalSubsReq = new SignalSubsReq(signalDetails.getSignalChanId(), subscriptionType, null, null, null, 28, null);
        if (Intrinsics.EZpvd((Object) subscriptionType, (Object) "subscription")) {
            signalSubsReq.setSubscriptionFee(signalDetails.getSubscriptionFee());
            signalSubsReq.setAutoRenewal(Boolean.valueOf(signalDetails.getAutoRenewal()));
        } else if (Intrinsics.EZpvd((Object) subscriptionType, (Object) "profit_sharing")) {
            signalSubsReq.setProfitSharingRatio(signalDetails.getProfitSharingRatio());
        }
        return signalSubsReq;
    }

    public final List<C55276xgr> valueOf() {
        return SignalProfitRange.Companion.EZpvd(this.AhwBna);
    }

    public final SignalDetails fIwbmz() {
        return this.copydefault.copydefault();
    }

    public final boolean hDKMBd() {
        SignalDetails signalDetailsFIwbmz = fIwbmz();
        return signalDetailsFIwbmz.isSubscribed() || Intrinsics.EZpvd((Object) signalDetailsFIwbmz.getType(), (Object) "created");
    }

    public final BotGuideData KWHzl() {
        BotGuideData botGuideDataValues = values();
        botGuideDataValues.setBotName(C33070mpX.AYXKKw(C55688xof.Application.QVMIlxQVMIlx));
        botGuideDataValues.setTitleAppearance(C32113mPz.Dialog.QKVWgx);
        botGuideDataValues.setPicUrl(C33070mpX.AYXKKw(C55688xof.Application.fzHEvu));
        botGuideDataValues.setGuideItemList(C56402yEa.EZpvd(new BotGuideItem("", C33070mpX.AYXKKw(C55688xof.Application.SdSTJp))));
        return botGuideDataValues;
    }

    public final List<SignalTypeData> djBIcL() {
        return this.copydefault.KWHzl();
    }

    public final SignalSubsData AEQbTJ(@NotNull SignalDetails signalDetails) {
        Intrinsics.checkNotNullParameter(signalDetails, "");
        return this.copydefault.OLrzqt(signalDetails);
    }

    public final SignalDetails KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.EZpvd(str);
    }

    public final List<String> ejfBZ() {
        return C56402yEa.EZpvd(this.copydefault.KWHzl(this.fARcdN));
    }

    public final void OLrzqt() {
        C53685wqE.copydefault.AEQbTJ().EZpvd();
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.KWHzl.values());
        arrayList.add(this.valueOf);
        arrayList.add(this.AuCTel);
        arrayList.add(this.ejfBZ);
        arrayList.add(this.isConnected);
        arrayList.add(this.EZpvd);
        return arrayList;
    }

    public final BotGuideData values() {
        return new BotGuideData(C33070mpX.AYXKKw(C55688xof.Application.fdazkH), C33070mpX.AYXKKw(C55688xof.Application.ActivityViewModelLazyKtviewModels3), C33070mpX.AYXKKw(C55688xof.Application.warmup), "signal_bot", C56402yEa.EZpvd(new BotGuideItem(C33070mpX.AYXKKw(C55688xof.Application.ITrustedWebActivityCallback), C33070mpX.AYXKKw(C55688xof.Application.IPostMessageServiceStubProxy))), new BotGuideLinkItem(C33070mpX.AYXKKw(C55688xof.Application.sTbpmZ), C33070mpX.AYXKKw(C55688xof.Application.arDRxL)), null, 0, null, null, 960, null);
    }
}
