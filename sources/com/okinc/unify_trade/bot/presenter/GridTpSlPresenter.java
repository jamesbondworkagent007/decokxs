package com.okinc.unify_trade.bot.presenter;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.GridOrderTpSlReq;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.constant.TacticsForbiddenFunctions;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.presenter.GridTpSlPresenter;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC54531xLw;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C54308xDp;
import o.C54536xML;
import o.C54589xNz;
import o.C55688xof;
import o.C55941xtT;
import o.C56033xvF;
import o.C56071xvr;
import o.C56156xxW;
import o.C56157xxX;
import o.C56390yDp;
import o.C56423yEv;
import o.C56424yEw;
import o.C56524yIo;
import o.InterfaceC54581xNr;
import o.pTB;
import o.xKK;
import o.xMR;
import o.xMS;
import o.yDY;
import o.yIJ;
import o.yIL;
import o.yIP;
import o.yJA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GridTpSlPresenter extends AbsPresenter {
    public static final /* synthetic */ yJA<Object>[] EZpvd = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(GridTpSlPresenter.class, "mStartParam", "getMStartParam()Lcom/okinc/unify_trade/biz/AdvancedTriggerSign;", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(GridTpSlPresenter.class, "mStopParam", "getMStopParam()Lcom/okinc/unify_trade/biz/AdvancedTriggerSign;", 0))};
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public final C56156xxW AYXKKw;
    public final TradeLiveData<ResponseData<List<C56157xxX>>> AhwBna;
    public GridOrderTpSlReq AkhnZx;
    public String DbNXlk;
    public final MutableLiveData<Boolean> KWHzl;
    public final LiveData<Boolean> OLrzqt;
    public String djBIcL;
    public final C54308xDp ejfBZ;
    public TacticsData fARcdN;
    public final TradeLiveData<Pair<String, Integer>> fJNWhG;
    public final yIP fetchVPNInfo;
    public String gEmmrt;
    public boolean isConnected;
    public String valueOf;
    public final yIP values;

    public final int AhwBna() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ResponseData<List<C56157xxX>>> AkhnZx() {
        return this.AhwBna;
    }

    public final boolean ejfBZ() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56156xxW fetchVPNInfo() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> valueOf() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.isConnected;
    }

    public static final class ActionBar extends yIL<AdvancedTriggerSign> {
        public final /* synthetic */ GridTpSlPresenter KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(Object obj, GridTpSlPresenter gridTpSlPresenter) {
            super(obj);
            this.KWHzl = gridTpSlPresenter;
        }

        @Override // o.yIL
        public void AEQbTJ(yJA<?> yja, AdvancedTriggerSign advancedTriggerSign, AdvancedTriggerSign advancedTriggerSign2) {
            Intrinsics.checkNotNullParameter(yja, "");
            this.KWHzl.QbewEr();
        }
    }

    public static final class TaskDescription extends yIL<AdvancedTriggerSign> {
        public final /* synthetic */ GridTpSlPresenter KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(Object obj, GridTpSlPresenter gridTpSlPresenter) {
            super(obj);
            this.KWHzl = gridTpSlPresenter;
        }

        @Override // o.yIL
        public void AEQbTJ(yJA<?> yja, AdvancedTriggerSign advancedTriggerSign, AdvancedTriggerSign advancedTriggerSign2) {
            Intrinsics.checkNotNullParameter(yja, "");
            this.KWHzl.QbewEr();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridTpSlPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AYXKKw = new C56156xxW();
        this.AhwBna = new TradeLiveData<>();
        this.ejfBZ = new C54308xDp();
        this.fJNWhG = new TradeLiveData<>();
        yIJ yij = yIJ.OLrzqt;
        this.values = new TaskDescription(null, this);
        this.fetchVPNInfo = new ActionBar(null, this);
        this.AEQbTJ = true;
        this.djBIcL = "";
        this.gEmmrt = "";
        this.valueOf = "";
        this.DbNXlk = "";
        this.AkhnZx = new GridOrderTpSlReq((String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (List) null, (List) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.FALSE);
        this.KWHzl = mutableLiveData;
        this.OLrzqt = mutableLiveData;
    }

    public final AdvancedTriggerSign DbNXlk() {
        return (AdvancedTriggerSign) this.values.getValue(this, EZpvd[0]);
    }

    public final void EZpvd(AdvancedTriggerSign advancedTriggerSign) {
        this.values.KWHzl(this, EZpvd[0], advancedTriggerSign);
    }

    public final void KWHzl(AdvancedTriggerSign advancedTriggerSign) {
        this.fetchVPNInfo.KWHzl(this, EZpvd[1], advancedTriggerSign);
    }

    public final AdvancedTriggerSign fIwbmz() {
        return (AdvancedTriggerSign) this.fetchVPNInfo.getValue(this, EZpvd[1]);
    }

    public static /* synthetic */ void adjustCondition$default(GridTpSlPresenter gridTpSlPresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        gridTpSlPresenter.EZpvd(str);
    }

    public final void EZpvd(String str) {
        this.AkhnZx.setTriggerParams(EZpvd());
        this.AkhnZx.setTopUpAmt(str);
        C56156xxW c56156xxW = this.AYXKKw;
        c56156xxW.OLrzqt(this.AkhnZx);
        c56156xxW.KWHzl(new Function1() { // from class: o.xuy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return GridTpSlPresenter.EZpvd(this.copydefault, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56156xxW, 0L, 1, null);
    }

    public static final Unit EZpvd(GridTpSlPresenter gridTpSlPresenter, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        gridTpSlPresenter.AhwBna.postValue(responseData);
        return Unit.INSTANCE;
    }

    public final ArrayList<AdvancedTriggerSign> EZpvd() {
        ArrayList<AdvancedTriggerSign> arrayList = new ArrayList<>();
        if (DbNXlk() != null && AEQbTJ() && QOLQEE()) {
            AdvancedTriggerSign advancedTriggerSignDbNXlk = DbNXlk();
            Intrinsics.copydefault(advancedTriggerSignDbNXlk);
            arrayList.add(advancedTriggerSignDbNXlk);
        }
        if (fIwbmz() != null && copydefault() && ORxRYg()) {
            AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
            Intrinsics.copydefault(advancedTriggerSignFIwbmz);
            arrayList.add(advancedTriggerSignFIwbmz);
        }
        this.isConnected = !C33129mqd.OLrzqt((Object) Integer.valueOf(arrayList.size()), (Object) 0);
        return arrayList;
    }

    public final Pair<Boolean, String> AEQbTJ(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        TacticsData tacticsData = this.fARcdN;
        if (Intrinsics.EZpvd((Object) (tacticsData != null ? tacticsData.getOrderType() : null), (Object) "contract_grid")) {
            TacticsData tacticsData2 = this.fARcdN;
            if (Intrinsics.EZpvd((Object) (tacticsData2 != null ? tacticsData2.getDirection() : null), (Object) "short")) {
                return copydefault(str, z);
            }
        }
        return KWHzl(str, z);
    }

    public final Pair<Boolean, String> KWHzl(String str, boolean z) {
        if (z && StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return C56390yDp.OLrzqt(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.ActionBar)))));
        }
        if (z && C33129mqd.valueOf(str, 0)) {
            return new Pair<>(Boolean.FALSE, C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImpl));
        }
        Pair<String, Integer> value = this.fJNWhG.getValue();
        String strMulS$default = C33129mqd.mulS$default(value != null ? value.getFirst() : null, 2, null, null, null, 14, null);
        if (C33129mqd.AEQbTJ(strMulS$default, 0) && C33129mqd.copydefault(str, strMulS$default)) {
            return new Pair<>(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.MediaControllerCompatMediaControllerImplApi21, C56423yEv.EZpvd(C56390yDp.OLrzqt("maxPrice", pTB.formatLocalized$default(strMulS$default, null, 1, null)))));
        }
        TacticsData tacticsData = this.fARcdN;
        String tpTriggerPx = tacticsData != null ? tacticsData.getTpTriggerPx() : null;
        if (C33129mqd.AEQbTJ(tpTriggerPx, 0) && C33129mqd.copydefault(str, tpTriggerPx)) {
            return new Pair<>(Boolean.FALSE, C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallbackMessageHandler));
        }
        TacticsData tacticsData2 = this.fARcdN;
        String slTriggerPx = tacticsData2 != null ? tacticsData2.getSlTriggerPx() : null;
        if (C33129mqd.AEQbTJ(slTriggerPx, 0) && C33129mqd.valueOf(str, slTriggerPx)) {
            return new Pair<>(Boolean.FALSE, C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallbackStubApi21));
        }
        return new Pair<>(Boolean.TRUE, "");
    }

    public final Pair<Boolean, String> copydefault(String str, boolean z) {
        if (z && StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return C56390yDp.OLrzqt(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.ActionBar)))));
        }
        if (z && C33129mqd.valueOf(str, 0)) {
            return new Pair<>(Boolean.FALSE, C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImpl));
        }
        Pair<String, Integer> value = this.fJNWhG.getValue();
        String strMulS$default = C33129mqd.mulS$default(value != null ? value.getFirst() : null, 2, null, null, null, 14, null);
        if (C33129mqd.AEQbTJ(strMulS$default, 0) && C33129mqd.copydefault(str, strMulS$default)) {
            return new Pair<>(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.MediaControllerCompatMediaControllerImplApi21, C56423yEv.EZpvd(C56390yDp.OLrzqt("maxPrice", pTB.formatLocalized$default(strMulS$default, null, 1, null)))));
        }
        TacticsData tacticsData = this.fARcdN;
        String tpTriggerPx = tacticsData != null ? tacticsData.getTpTriggerPx() : null;
        if (C33129mqd.AEQbTJ(tpTriggerPx, 0) && C33129mqd.valueOf(str, tpTriggerPx)) {
            return new Pair<>(Boolean.FALSE, C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerExtraData));
        }
        TacticsData tacticsData2 = this.fARcdN;
        String slTriggerPx = tacticsData2 != null ? tacticsData2.getSlTriggerPx() : null;
        if (C33129mqd.AEQbTJ(slTriggerPx, 0) && C33129mqd.copydefault(str, slTriggerPx)) {
            return new Pair<>(Boolean.FALSE, C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallbackStubCompat));
        }
        return new Pair<>(Boolean.TRUE, "");
    }

    public final Pair<Boolean, String> OLrzqt(String str) {
        if (C33129mqd.AEQbTJ(str, "3600")) {
            Boolean bool = Boolean.FALSE;
            int i = C55688xof.Application.ActivityResultContractsOpenDocument;
            xMR xmr = xMR.copydefault;
            return new Pair<>(bool, C33069mpW.copydefault(i, C56424yEw.gEmmrt(C56390yDp.OLrzqt("minDelayTime", xmr.copydefault("0")), C56390yDp.OLrzqt("maxDelayTime", xmr.copydefault("3600")))));
        }
        return new Pair<>(Boolean.TRUE, "");
    }

    public final void KWHzl(TacticsData tacticsData) {
        String algoId;
        String instId;
        String triggerPx;
        String triggerPx2;
        String mode;
        String stopType;
        this.AEQbTJ = true;
        this.fARcdN = tacticsData;
        GridOrderTpSlReq gridOrderTpSlReq = this.AkhnZx;
        String str = "";
        if (tacticsData == null || (algoId = tacticsData.getAlgoId()) == null) {
            algoId = "";
        }
        gridOrderTpSlReq.setAlgoId(algoId);
        GridOrderTpSlReq gridOrderTpSlReq2 = this.AkhnZx;
        TacticsData tacticsData2 = this.fARcdN;
        if (tacticsData2 == null || (instId = tacticsData2.getInstId()) == null) {
            instId = "";
        }
        gridOrderTpSlReq2.setInstId(instId);
        EZpvd(OLrzqt());
        KWHzl(gEmmrt());
        AdvancedTriggerSign advancedTriggerSignDbNXlk = DbNXlk();
        if (advancedTriggerSignDbNXlk == null || (triggerPx = advancedTriggerSignDbNXlk.getTriggerPx()) == null) {
            triggerPx = "";
        }
        this.djBIcL = triggerPx;
        AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
        if (advancedTriggerSignFIwbmz == null || (triggerPx2 = advancedTriggerSignFIwbmz.getTriggerPx()) == null) {
            triggerPx2 = "";
        }
        this.gEmmrt = triggerPx2;
        AdvancedTriggerSign advancedTriggerSignFIwbmz2 = fIwbmz();
        if (advancedTriggerSignFIwbmz2 == null || (mode = advancedTriggerSignFIwbmz2.getTriggerStrategy()) == null) {
            mode = GridStopTriggerType.MANUAL_STOP.getMode();
        }
        this.valueOf = mode;
        AdvancedTriggerSign advancedTriggerSignFIwbmz3 = fIwbmz();
        if (advancedTriggerSignFIwbmz3 != null && (stopType = advancedTriggerSignFIwbmz3.getStopType()) != null) {
            str = stopType;
        }
        this.DbNXlk = str;
        this.AEQbTJ = false;
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (iwGUEr()) {
            AdvancedTriggerSign advancedTriggerSignDbNXlk = DbNXlk();
            EZpvd(advancedTriggerSignDbNXlk != null ? advancedTriggerSignDbNXlk.copy((4079 & 1) != 0 ? advancedTriggerSignDbNXlk.triggerAction : null, (4079 & 2) != 0 ? advancedTriggerSignDbNXlk.indicator : null, (4079 & 4) != 0 ? advancedTriggerSignDbNXlk.triggerStrategy : null, (4079 & 8) != 0 ? advancedTriggerSignDbNXlk.triggerPx : str, (4079 & 16) != 0 ? advancedTriggerSignDbNXlk.delaySeconds : null, (4079 & 32) != 0 ? advancedTriggerSignDbNXlk.timePeriod : null, (4079 & 64) != 0 ? advancedTriggerSignDbNXlk.timeframe : null, (4079 & 128) != 0 ? advancedTriggerSignDbNXlk.triggerCond : null, (4079 & 256) != 0 ? advancedTriggerSignDbNXlk.oversoldThold : null, (4079 & 512) != 0 ? advancedTriggerSignDbNXlk.thold : null, (4079 & 1024) != 0 ? advancedTriggerSignDbNXlk.stopType : null, (4079 & 2048) != 0 ? advancedTriggerSignDbNXlk.authToken : null) : null);
        }
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (AuCTelauCTel()) {
            AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
            KWHzl(advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.copy((4079 & 1) != 0 ? advancedTriggerSignFIwbmz.triggerAction : null, (4079 & 2) != 0 ? advancedTriggerSignFIwbmz.indicator : null, (4079 & 4) != 0 ? advancedTriggerSignFIwbmz.triggerStrategy : null, (4079 & 8) != 0 ? advancedTriggerSignFIwbmz.triggerPx : str, (4079 & 16) != 0 ? advancedTriggerSignFIwbmz.delaySeconds : null, (4079 & 32) != 0 ? advancedTriggerSignFIwbmz.timePeriod : null, (4079 & 64) != 0 ? advancedTriggerSignFIwbmz.timeframe : null, (4079 & 128) != 0 ? advancedTriggerSignFIwbmz.triggerCond : null, (4079 & 256) != 0 ? advancedTriggerSignFIwbmz.oversoldThold : null, (4079 & 512) != 0 ? advancedTriggerSignFIwbmz.thold : null, (4079 & 1024) != 0 ? advancedTriggerSignFIwbmz.stopType : null, (4079 & 2048) != 0 ? advancedTriggerSignFIwbmz.authToken : null) : null);
        }
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (uzCIH()) {
            AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
            KWHzl(advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.copy((4079 & 1) != 0 ? advancedTriggerSignFIwbmz.triggerAction : null, (4079 & 2) != 0 ? advancedTriggerSignFIwbmz.indicator : null, (4079 & 4) != 0 ? advancedTriggerSignFIwbmz.triggerStrategy : null, (4079 & 8) != 0 ? advancedTriggerSignFIwbmz.triggerPx : null, (4079 & 16) != 0 ? advancedTriggerSignFIwbmz.delaySeconds : str, (4079 & 32) != 0 ? advancedTriggerSignFIwbmz.timePeriod : null, (4079 & 64) != 0 ? advancedTriggerSignFIwbmz.timeframe : null, (4079 & 128) != 0 ? advancedTriggerSignFIwbmz.triggerCond : null, (4079 & 256) != 0 ? advancedTriggerSignFIwbmz.oversoldThold : null, (4079 & 512) != 0 ? advancedTriggerSignFIwbmz.thold : null, (4079 & 1024) != 0 ? advancedTriggerSignFIwbmz.stopType : null, (4079 & 2048) != 0 ? advancedTriggerSignFIwbmz.authToken : null) : null);
        }
    }

    public final void gEmmrt(@NotNull String str) {
        AdvancedTriggerSign advancedTriggerSign;
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) str, (Object) GridStopTriggerType.PRICE.getMode())) {
            AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
            advancedTriggerSign = new AdvancedTriggerSign("stop", (String) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.getStopType() : null, (String) null, 3066, (DefaultConstructorMarker) null);
        } else if (Intrinsics.EZpvd((Object) str, (Object) GridStopTriggerType.RSI_14.getMode())) {
            advancedTriggerSign = KWHzl();
        } else {
            AdvancedTriggerSign advancedTriggerSignFIwbmz2 = fIwbmz();
            advancedTriggerSign = new AdvancedTriggerSign("stop", (String) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, advancedTriggerSignFIwbmz2 != null ? advancedTriggerSignFIwbmz2.getStopType() : null, (String) null, 3066, (DefaultConstructorMarker) null);
        }
        KWHzl(advancedTriggerSign);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r1.equals("grid") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f3, code lost:
    
        if (r1.equals("infinite_grid") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f5, code lost:
    
        r6 = com.okinc.unify_trade.bot.config.GridStopTriggerType.RSI_14.getMode();
        r10 = com.okinc.unify_trade.bot.config.TimeFrame.THREE_M.getFrame();
        r11 = com.okinc.unify_trade.bot.config.TriggerCond.ABOVE.getMode();
        r1 = fIwbmz();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010b, code lost:
    
        if (r1 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010d, code lost:
    
        r2 = r1.getStopType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return new com.okinc.unify_trade.biz.AdvancedTriggerSign("stop", (java.lang.String) null, r6, (java.lang.String) null, (java.lang.String) null, "14", r10, r11, (java.lang.String) null, "70", r2, (java.lang.String) null, 2330, (kotlin.jvm.internal.DefaultConstructorMarker) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AdvancedTriggerSign KWHzl() {
        TacticsData tacticsData = this.fARcdN;
        String orderType = tacticsData != null ? tacticsData.getOrderType() : null;
        if (orderType != null) {
            int iHashCode = orderType.hashCode();
            if (iHashCode != -1574173039) {
                if (iHashCode != -512749997) {
                    if (iHashCode == 3181382) {
                    }
                } else if (orderType.equals("contract_grid")) {
                    TacticsData tacticsData2 = this.fARcdN;
                    String direction = tacticsData2 != null ? tacticsData2.getDirection() : null;
                    if (Intrinsics.EZpvd((Object) direction, (Object) "long")) {
                        String mode = GridStopTriggerType.RSI_14.getMode();
                        String frame = TimeFrame.THREE_M.getFrame();
                        String mode2 = TriggerCond.ABOVE.getMode();
                        AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
                        return new AdvancedTriggerSign("stop", (String) null, mode, (String) null, (String) null, "14", frame, mode2, (String) null, "70", advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.getStopType() : null, (String) null, 2330, (DefaultConstructorMarker) null);
                    }
                    if (Intrinsics.EZpvd((Object) direction, (Object) "short")) {
                        String mode3 = GridStopTriggerType.RSI_14.getMode();
                        String frame2 = TimeFrame.THREE_M.getFrame();
                        String mode4 = TriggerCond.BELOW.getMode();
                        AdvancedTriggerSign advancedTriggerSignFIwbmz2 = fIwbmz();
                        return new AdvancedTriggerSign("stop", (String) null, mode3, (String) null, (String) null, "14", frame2, mode4, (String) null, "30", advancedTriggerSignFIwbmz2 != null ? advancedTriggerSignFIwbmz2.getStopType() : null, (String) null, 2330, (DefaultConstructorMarker) null);
                    }
                    String mode5 = GridStopTriggerType.RSI_14.getMode();
                    String frame3 = TimeFrame.FIFTEEN_M.getFrame();
                    String mode6 = TriggerCond.CROSS.getMode();
                    AdvancedTriggerSign advancedTriggerSignFIwbmz3 = fIwbmz();
                    return new AdvancedTriggerSign("stop", (String) null, mode5, (String) null, (String) null, "14", frame3, mode6, (String) null, "50", advancedTriggerSignFIwbmz3 != null ? advancedTriggerSignFIwbmz3.getStopType() : null, (String) null, 2330, (DefaultConstructorMarker) null);
                }
            }
        }
        String mode7 = GridStopTriggerType.RSI_14.getMode();
        String frame4 = TimeFrame.THREE_M.getFrame();
        String mode8 = TriggerCond.ABOVE.getMode();
        AdvancedTriggerSign advancedTriggerSignFIwbmz4 = fIwbmz();
        return new AdvancedTriggerSign("stop", (String) null, mode7, (String) null, (String) null, "14", frame4, mode8, (String) null, "70", advancedTriggerSignFIwbmz4 != null ? advancedTriggerSignFIwbmz4.getStopType() : null, (String) null, 2330, (DefaultConstructorMarker) null);
    }

    public final void OLrzqt(@NotNull AdvancedTriggerSign advancedTriggerSign) {
        AdvancedTriggerSign advancedTriggerSignCopy;
        Intrinsics.checkNotNullParameter(advancedTriggerSign, "");
        KWHzl(advancedTriggerSign);
        AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
        if (advancedTriggerSignFIwbmz != null) {
            advancedTriggerSignCopy = advancedTriggerSignFIwbmz.copy((4079 & 1) != 0 ? advancedTriggerSignFIwbmz.triggerAction : null, (4079 & 2) != 0 ? advancedTriggerSignFIwbmz.indicator : null, (4079 & 4) != 0 ? advancedTriggerSignFIwbmz.triggerStrategy : advancedTriggerSign.getIndicator(), (4079 & 8) != 0 ? advancedTriggerSignFIwbmz.triggerPx : null, (4079 & 16) != 0 ? advancedTriggerSignFIwbmz.delaySeconds : null, (4079 & 32) != 0 ? advancedTriggerSignFIwbmz.timePeriod : null, (4079 & 64) != 0 ? advancedTriggerSignFIwbmz.timeframe : null, (4079 & 128) != 0 ? advancedTriggerSignFIwbmz.triggerCond : null, (4079 & 256) != 0 ? advancedTriggerSignFIwbmz.oversoldThold : null, (4079 & 512) != 0 ? advancedTriggerSignFIwbmz.thold : advancedTriggerSign.getOversoldThold(), (4079 & 1024) != 0 ? advancedTriggerSignFIwbmz.stopType : null, (4079 & 2048) != 0 ? advancedTriggerSignFIwbmz.authToken : null);
        } else {
            advancedTriggerSignCopy = null;
        }
        KWHzl(advancedTriggerSignCopy);
    }

    public final void AYXKKw(String str) {
        AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
        KWHzl(advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.copy((4079 & 1) != 0 ? advancedTriggerSignFIwbmz.triggerAction : null, (4079 & 2) != 0 ? advancedTriggerSignFIwbmz.indicator : null, (4079 & 4) != 0 ? advancedTriggerSignFIwbmz.triggerStrategy : null, (4079 & 8) != 0 ? advancedTriggerSignFIwbmz.triggerPx : null, (4079 & 16) != 0 ? advancedTriggerSignFIwbmz.delaySeconds : null, (4079 & 32) != 0 ? advancedTriggerSignFIwbmz.timePeriod : null, (4079 & 64) != 0 ? advancedTriggerSignFIwbmz.timeframe : null, (4079 & 128) != 0 ? advancedTriggerSignFIwbmz.triggerCond : null, (4079 & 256) != 0 ? advancedTriggerSignFIwbmz.oversoldThold : null, (4079 & 512) != 0 ? advancedTriggerSignFIwbmz.thold : null, (4079 & 1024) != 0 ? advancedTriggerSignFIwbmz.stopType : str, (4079 & 2048) != 0 ? advancedTriggerSignFIwbmz.authToken : null) : null);
    }

    public final boolean QOLQEE() {
        String str = this.djBIcL;
        AdvancedTriggerSign advancedTriggerSignDbNXlk = DbNXlk();
        return (Intrinsics.EZpvd((Object) str, (Object) (advancedTriggerSignDbNXlk != null ? advancedTriggerSignDbNXlk.getTriggerPx() : null)) || this.AEQbTJ) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ORxRYg() {
        boolean z;
        String str = this.valueOf;
        AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
        boolean zEZpvd = Intrinsics.EZpvd((Object) str, (Object) (advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.getTriggerStrategy() : null));
        AdvancedTriggerSign advancedTriggerSignFIwbmz2 = fIwbmz();
        if (Intrinsics.EZpvd((Object) (advancedTriggerSignFIwbmz2 != null ? advancedTriggerSignFIwbmz2.getTriggerStrategy() : null), (Object) GridStopTriggerType.PRICE.getMode())) {
            String str2 = this.gEmmrt;
            AdvancedTriggerSign advancedTriggerSignFIwbmz3 = fIwbmz();
            z = !Intrinsics.EZpvd((Object) str2, (Object) (advancedTriggerSignFIwbmz3 != null ? advancedTriggerSignFIwbmz3.getTriggerPx() : null));
        }
        String str3 = this.DbNXlk;
        AdvancedTriggerSign advancedTriggerSignFIwbmz4 = fIwbmz();
        return ((Intrinsics.EZpvd((Object) str3, (Object) (advancedTriggerSignFIwbmz4 != null ? advancedTriggerSignFIwbmz4.getStopType() : null)) ^ true) || (zEZpvd ^ true) || z) && !this.AEQbTJ;
    }

    public final void QKVWgx() {
        String instId;
        C54308xDp c54308xDp = this.ejfBZ;
        c54308xDp.OLrzqt(this.fJNWhG, new C55941xtT());
        TacticsData tacticsData = this.fARcdN;
        if (tacticsData == null || (instId = tacticsData.getInstId()) == null) {
            instId = "";
        }
        c54308xDp.KWHzl(instId);
        xKK.Activity.execute$default(c54308xDp, 0L, 1, null);
    }

    public final void RJOkX() {
        this.ejfBZ.AYXKKw();
    }

    public final String AYXKKw() {
        xMR xmr = xMR.copydefault;
        return xmr.copydefault("0") + "-" + xmr.copydefault("3600");
    }

    public final String djBIcL() {
        return C33070mpX.AYXKKw(C55688xof.Application.ActionBarDrawerToggle);
    }

    public final int isConnected() {
        String instType;
        String instId;
        TacticsData tacticsData = this.fARcdN;
        String str = "";
        if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsData2 = this.fARcdN;
        if (tacticsData2 != null && (instId = tacticsData2.getInstId()) != null) {
            str = instId;
        }
        return C56033xvF.KWHzl(instType, str);
    }

    public final String fARcdN() {
        String instType;
        String instId;
        TacticsData tacticsData = this.fARcdN;
        String str = "";
        if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsData2 = this.fARcdN;
        if (tacticsData2 != null && (instId = tacticsData2.getInstId()) != null) {
            str = instId;
        }
        return C56033xvF.AEQbTJ(instType, str);
    }

    public final AdvancedTriggerSign OLrzqt() {
        SignParamItem signParamItem;
        String triggerAction;
        List<SignParamItem> signParams;
        Object next;
        TacticsData tacticsData = this.fARcdN;
        if (tacticsData == null || (signParams = tacticsData.getSignParams()) == null) {
            signParamItem = null;
        } else {
            Iterator<T> it = signParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((SignParamItem) next).getTriggerAction(), (Object) TtmlNode.START)) {
                    break;
                }
            }
            signParamItem = (SignParamItem) next;
        }
        return new AdvancedTriggerSign((signParamItem == null || (triggerAction = signParamItem.getTriggerAction()) == null) ? TtmlNode.START : triggerAction, (String) null, signParamItem != null ? signParamItem.getIndicator() : null, signParamItem != null ? signParamItem.getTriggerPx() : null, (Intrinsics.EZpvd((Object) (signParamItem != null ? signParamItem.getIndicator() : null), (Object) GridStartTriggerType.INSTANT.getMode()) || signParamItem == null) ? null : signParamItem.getDelaySeconds(), signParamItem != null ? signParamItem.getTimePeriod() : null, signParamItem != null ? signParamItem.getTimeframe() : null, signParamItem != null ? signParamItem.getTriggerCond() : null, (String) null, signParamItem != null ? signParamItem.getThold() : null, (String) null, (String) null, 3330, (DefaultConstructorMarker) null);
    }

    public final AdvancedTriggerSign gEmmrt() {
        SignParamItem signParamItem;
        String triggerAction;
        List<SignParamItem> signParams;
        Object next;
        TacticsData tacticsData = this.fARcdN;
        if (tacticsData == null || (signParams = tacticsData.getSignParams()) == null) {
            signParamItem = null;
        } else {
            Iterator<T> it = signParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((SignParamItem) next).getTriggerAction(), (Object) "stop")) {
                    break;
                }
            }
            signParamItem = (SignParamItem) next;
        }
        return new AdvancedTriggerSign((signParamItem == null || (triggerAction = signParamItem.getTriggerAction()) == null) ? "stop" : triggerAction, (String) null, signParamItem != null ? signParamItem.getIndicator() : null, signParamItem != null ? signParamItem.getTriggerPx() : null, (Intrinsics.EZpvd((Object) (signParamItem != null ? signParamItem.getIndicator() : null), (Object) GridStopTriggerType.MANUAL_STOP.getMode()) || signParamItem == null) ? null : signParamItem.getDelaySeconds(), signParamItem != null ? signParamItem.getTimePeriod() : null, signParamItem != null ? signParamItem.getTimeframe() : null, signParamItem != null ? signParamItem.getTriggerCond() : null, (String) null, signParamItem != null ? signParamItem.getThold() : null, signParamItem != null ? signParamItem.getStopType() : null, (String) null, 2306, (DefaultConstructorMarker) null);
    }

    public final AdvancedTriggerSign fJNWhG() {
        String triggerAction;
        AdvancedTriggerSign advancedTriggerSignFIwbmz;
        AdvancedTriggerSign advancedTriggerSignFIwbmz2 = fIwbmz();
        if (advancedTriggerSignFIwbmz2 == null || (triggerAction = advancedTriggerSignFIwbmz2.getTriggerAction()) == null) {
            triggerAction = "stop";
        }
        String str = triggerAction;
        AdvancedTriggerSign advancedTriggerSignFIwbmz3 = fIwbmz();
        String triggerStrategy = advancedTriggerSignFIwbmz3 != null ? advancedTriggerSignFIwbmz3.getTriggerStrategy() : null;
        AdvancedTriggerSign advancedTriggerSignFIwbmz4 = fIwbmz();
        String triggerPx = advancedTriggerSignFIwbmz4 != null ? advancedTriggerSignFIwbmz4.getTriggerPx() : null;
        AdvancedTriggerSign advancedTriggerSignFIwbmz5 = fIwbmz();
        String delaySeconds = (Intrinsics.EZpvd((Object) (advancedTriggerSignFIwbmz5 != null ? advancedTriggerSignFIwbmz5.getIndicator() : null), (Object) GridStopTriggerType.MANUAL_STOP.getMode()) || (advancedTriggerSignFIwbmz = fIwbmz()) == null) ? null : advancedTriggerSignFIwbmz.getDelaySeconds();
        AdvancedTriggerSign advancedTriggerSignFIwbmz6 = fIwbmz();
        String timePeriod = advancedTriggerSignFIwbmz6 != null ? advancedTriggerSignFIwbmz6.getTimePeriod() : null;
        AdvancedTriggerSign advancedTriggerSignFIwbmz7 = fIwbmz();
        String timeframe = advancedTriggerSignFIwbmz7 != null ? advancedTriggerSignFIwbmz7.getTimeframe() : null;
        AdvancedTriggerSign advancedTriggerSignFIwbmz8 = fIwbmz();
        String triggerCond = advancedTriggerSignFIwbmz8 != null ? advancedTriggerSignFIwbmz8.getTriggerCond() : null;
        AdvancedTriggerSign advancedTriggerSignFIwbmz9 = fIwbmz();
        String thold = advancedTriggerSignFIwbmz9 != null ? advancedTriggerSignFIwbmz9.getThold() : null;
        AdvancedTriggerSign advancedTriggerSignFIwbmz10 = fIwbmz();
        return new AdvancedTriggerSign(str, triggerStrategy, (String) null, triggerPx, delaySeconds, timePeriod, timeframe, triggerCond, thold, (String) null, advancedTriggerSignFIwbmz10 != null ? advancedTriggerSignFIwbmz10.getStopType() : null, (String) null, 2564, (DefaultConstructorMarker) null);
    }

    public final String DTwDnp() {
        TacticsData tacticsData = this.fARcdN;
        if (Intrinsics.EZpvd((Object) (tacticsData != null ? tacticsData.getOrderType() : null), (Object) "contract_grid")) {
            AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
            if (Intrinsics.EZpvd((Object) (advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.getStopType() : null), (Object) "2")) {
                return C33070mpX.AYXKKw(C55688xof.Application.removeOnReportDrawnListener);
            }
        }
        return "";
    }

    public final boolean hDKMBd() {
        TacticsData tacticsData;
        TacticsData tacticsData2 = this.fARcdN;
        if (!Intrinsics.EZpvd((Object) (tacticsData2 != null ? tacticsData2.getState() : null), (Object) "no_close_position")) {
            TacticsData tacticsData3 = this.fARcdN;
            if (!Intrinsics.EZpvd((Object) (tacticsData3 != null ? tacticsData3.getState() : null), (Object) "stopping")) {
                TacticsData tacticsData4 = this.fARcdN;
                if (!Intrinsics.EZpvd((Object) (tacticsData4 != null ? tacticsData4.getGridState() : null), (Object) "stop_delay_trigger")) {
                    TacticsData tacticsData5 = this.fARcdN;
                    if (!Intrinsics.EZpvd((Object) (tacticsData5 != null ? tacticsData5.getCopyType() : null), (Object) "2") && (tacticsData = this.fARcdN) != null && !tacticsData.isFunctionForbidden(TacticsForbiddenFunctions.SellAllWhenBotStops)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean zsXlph() {
        AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
        String triggerStrategy = advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.getTriggerStrategy() : null;
        return Intrinsics.EZpvd((Object) triggerStrategy, (Object) GridStopTriggerType.MANUAL_STOP.getMode()) || Intrinsics.EZpvd((Object) triggerStrategy, (Object) GridStopTriggerType.PRICE.getMode()) || Intrinsics.EZpvd((Object) triggerStrategy, (Object) GridStopTriggerType.RSI_14.getMode()) || Intrinsics.EZpvd((Object) triggerStrategy, (Object) GridStopTriggerType.TRADINGVIEW.getMode());
    }

    public final boolean zLjUOn() {
        AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
        String triggerStrategy = advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.getTriggerStrategy() : null;
        return Intrinsics.EZpvd((Object) triggerStrategy, (Object) GridStopTriggerType.MANUAL_STOP.getMode()) || Intrinsics.EZpvd((Object) triggerStrategy, (Object) GridStopTriggerType.PRICE.getMode());
    }

    public final boolean AxsJAY() {
        AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
        String triggerStrategy = advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.getTriggerStrategy() : null;
        return (Intrinsics.EZpvd((Object) triggerStrategy, (Object) GridStopTriggerType.MANUAL_STOP.getMode()) || Intrinsics.EZpvd((Object) triggerStrategy, (Object) GridStopTriggerType.RSI_14.getMode())) && !C56071xvr.gEmmrt.uzCIH();
    }

    public final boolean OcIXYQ() {
        AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
        String triggerStrategy = advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.getTriggerStrategy() : null;
        return (Intrinsics.EZpvd((Object) triggerStrategy, (Object) GridStopTriggerType.MANUAL_STOP.getMode()) || Intrinsics.EZpvd((Object) triggerStrategy, (Object) GridStopTriggerType.TRADINGVIEW.getMode())) && !C56071xvr.gEmmrt.uzCIH();
    }

    public final boolean iwGUEr() {
        return AEQbTJ();
    }

    public final boolean AuCTelauCTel() {
        TacticsData tacticsData = this.fARcdN;
        if (!Intrinsics.EZpvd((Object) (tacticsData != null ? tacticsData.getState() : null), (Object) "stopping")) {
            TacticsData tacticsData2 = this.fARcdN;
            if (!Intrinsics.EZpvd((Object) (tacticsData2 != null ? tacticsData2.getState() : null), (Object) "no_close_position")) {
                TacticsData tacticsData3 = this.fARcdN;
                if (!Intrinsics.EZpvd((Object) (tacticsData3 != null ? tacticsData3.getGridState() : null), (Object) "stop_delay_trigger")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean uzCIH() {
        return Intrinsics.EZpvd((Object) this.valueOf, (Object) GridStopTriggerType.MANUAL_STOP.getMode());
    }

    public final boolean AubY() {
        return Intrinsics.EZpvd((Object) this.valueOf, (Object) GridStopTriggerType.MANUAL_STOP.getMode());
    }

    public final String AuCTel() {
        String delaySeconds;
        AdvancedTriggerSign advancedTriggerSignDbNXlk = DbNXlk();
        return (advancedTriggerSignDbNXlk == null || (delaySeconds = advancedTriggerSignDbNXlk.getDelaySeconds()) == null) ? "" : delaySeconds;
    }

    public final String wlaJM() {
        String delaySeconds;
        AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
        return (advancedTriggerSignFIwbmz == null || (delaySeconds = advancedTriggerSignFIwbmz.getDelaySeconds()) == null) ? "" : delaySeconds;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getFieldNames() {
        String triggerPx;
        TacticsData tacticsData;
        xMS xmsGEmmrt;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLCopydefault;
        String safeString$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        String instFamily;
        List<SignParamItem> signParams;
        Object next;
        TacticsData tacticsData2 = this.fARcdN;
        if (tacticsData2 == null || (signParams = tacticsData2.getSignParams()) == null) {
            triggerPx = "";
        } else {
            Iterator<T> it = signParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((SignParamItem) next).getTriggerAction(), (Object) TtmlNode.START)) {
                    break;
                }
            }
            SignParamItem signParamItem = (SignParamItem) next;
            if (signParamItem == null || (triggerPx = signParamItem.getTriggerPx()) == null) {
            }
        }
        if (C33129mqd.OLrzqt(triggerPx, "0") || (tacticsData = this.fARcdN) == null) {
            return "";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, tacticsData.getInstType(), tacticsData.getInstId(), null, null, 12, null) : null;
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(tacticsData.getInstType())) == null) {
            xmsGEmmrt = null;
        } else {
            if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily = "";
            }
            xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
        }
        return (xmsGEmmrt == null || (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(triggerPx)) == null || (c54536xMLIsConnected = c54536xMLAYXKKw.isConnected()) == null || (c54536xMLCopydefault = c54536xMLIsConnected.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) ? "" : safeString$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String OLrzqt(TacticsData tacticsData) {
        String triggerPx;
        xMS xmsGEmmrt;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLCopydefault;
        String safeString$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        String instFamily;
        List<SignParamItem> signParams;
        Object next;
        if (tacticsData == null || (signParams = tacticsData.getSignParams()) == null) {
            triggerPx = "";
        } else {
            Iterator<T> it = signParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((SignParamItem) next).getTriggerAction(), (Object) "stop")) {
                    break;
                }
            }
            SignParamItem signParamItem = (SignParamItem) next;
            if (signParamItem == null || (triggerPx = signParamItem.getTriggerPx()) == null) {
            }
        }
        if (C33129mqd.OLrzqt(triggerPx, "0") || tacticsData == null) {
            return "";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, tacticsData.getInstType(), tacticsData.getInstId(), null, null, 12, null) : null;
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(tacticsData.getInstType())) == null) {
            xmsGEmmrt = null;
        } else {
            if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily = "";
            }
            xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
        }
        return (xmsGEmmrt == null || (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(triggerPx)) == null || (c54536xMLIsConnected = c54536xMLAYXKKw.isConnected()) == null || (c54536xMLCopydefault = c54536xMLIsConnected.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) ? "" : safeString$default;
    }

    public final String sSMYrx() {
        AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
        if (!C33129mqd.OLrzqt((CharSequence) (advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.getTriggerCond() : null))) {
            return "--";
        }
        TriggerCond.Activity activity = TriggerCond.Companion;
        AdvancedTriggerSign advancedTriggerSignFIwbmz2 = fIwbmz();
        return activity.KWHzl(advancedTriggerSignFIwbmz2 != null ? advancedTriggerSignFIwbmz2.getTriggerCond() : null);
    }

    public final String zuBGHE() {
        String timePeriod;
        AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
        if (!C33129mqd.OLrzqt((CharSequence) (advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.getTimePeriod() : null))) {
            return "--";
        }
        xMR xmr = xMR.copydefault;
        AdvancedTriggerSign advancedTriggerSignFIwbmz2 = fIwbmz();
        if (advancedTriggerSignFIwbmz2 == null || (timePeriod = advancedTriggerSignFIwbmz2.getTimePeriod()) == null) {
            timePeriod = "";
        }
        return xmr.copydefault(timePeriod);
    }

    public final String gHZMYf() {
        String timeframe;
        AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
        if (!C33129mqd.OLrzqt((CharSequence) (advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.getTimeframe() : null))) {
            return "--";
        }
        TimeFrame.Application application = TimeFrame.Companion;
        AdvancedTriggerSign advancedTriggerSignFIwbmz2 = fIwbmz();
        if (advancedTriggerSignFIwbmz2 == null || (timeframe = advancedTriggerSignFIwbmz2.getTimeframe()) == null) {
            timeframe = "";
        }
        return application.copydefault(timeframe);
    }

    public final String AwvSrB() {
        String thold;
        AdvancedTriggerSign advancedTriggerSignFIwbmz = fIwbmz();
        if (!C33129mqd.OLrzqt((CharSequence) (advancedTriggerSignFIwbmz != null ? advancedTriggerSignFIwbmz.getThold() : null))) {
            return "--";
        }
        xMR xmr = xMR.copydefault;
        AdvancedTriggerSign advancedTriggerSignFIwbmz2 = fIwbmz();
        if (advancedTriggerSignFIwbmz2 == null || (thold = advancedTriggerSignFIwbmz2.getThold()) == null) {
            thold = "";
        }
        return xmr.copydefault(thold);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AEQbTJ() {
        AdvancedTriggerSign advancedTriggerSignDbNXlk = DbNXlk();
        boolean zEZpvd = Intrinsics.EZpvd((Object) (advancedTriggerSignDbNXlk != null ? advancedTriggerSignDbNXlk.getTriggerStrategy() : null), (Object) GridStartTriggerType.PRICE.getMode());
        TacticsData tacticsData = this.fARcdN;
        if (!Intrinsics.EZpvd((Object) (tacticsData != null ? tacticsData.getState() : null), (Object) "pending_signal")) {
            TacticsData tacticsData2 = this.fARcdN;
            if (Intrinsics.EZpvd((Object) (tacticsData2 != null ? tacticsData2.getState() : null), (Object) "starting")) {
            }
        } else if (zEZpvd) {
            return true;
        }
        return false;
    }

    public final boolean copydefault() {
        return !Intrinsics.EZpvd((Object) (this.fARcdN != null ? r0.getOrderType() : null), (Object) "infinite_grid");
    }

    public final String getNewProxyInstance() {
        TacticsData tacticsData = this.fARcdN;
        String orderType = tacticsData != null ? tacticsData.getOrderType() : null;
        if (Intrinsics.EZpvd((Object) orderType, (Object) "grid")) {
            return C33070mpX.AYXKKw(C55688xof.Application.markerClass);
        }
        return Intrinsics.EZpvd((Object) orderType, (Object) "contract_grid") ? C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsOpenMultipleDocuments) : "";
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AYXKKw, this.ejfBZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void QbewEr() {
        boolean z;
        boolean z2;
        AdvancedTriggerSign advancedTriggerSignFIwbmz;
        String triggerPx;
        String triggerPx2;
        AdvancedTriggerSign advancedTriggerSignDbNXlk;
        String triggerPx3;
        String triggerPx4;
        boolean z3 = QOLQEE() || ORxRYg();
        String str = "";
        if (!AEQbTJ() || (advancedTriggerSignDbNXlk = DbNXlk()) == null || (triggerPx3 = advancedTriggerSignDbNXlk.getTriggerPx()) == null || !(!StringsKt__StringsKt.fARcdN((CharSequence) triggerPx3))) {
            z = false;
        } else {
            AdvancedTriggerSign advancedTriggerSignDbNXlk2 = DbNXlk();
            if (advancedTriggerSignDbNXlk2 == null || (triggerPx4 = advancedTriggerSignDbNXlk2.getTriggerPx()) == null) {
                triggerPx4 = "";
            }
            if (!AEQbTJ(triggerPx4, true).getFirst().booleanValue()) {
                z = true;
            }
        }
        if (copydefault()) {
            AdvancedTriggerSign advancedTriggerSignFIwbmz2 = fIwbmz();
            if (Intrinsics.EZpvd((Object) (advancedTriggerSignFIwbmz2 != null ? advancedTriggerSignFIwbmz2.getTriggerStrategy() : null), (Object) GridStopTriggerType.PRICE.getMode()) && (advancedTriggerSignFIwbmz = fIwbmz()) != null && (triggerPx = advancedTriggerSignFIwbmz.getTriggerPx()) != null && (!StringsKt__StringsKt.fARcdN((CharSequence) triggerPx))) {
                AdvancedTriggerSign advancedTriggerSignFIwbmz3 = fIwbmz();
                if (advancedTriggerSignFIwbmz3 != null && (triggerPx2 = advancedTriggerSignFIwbmz3.getTriggerPx()) != null) {
                    str = triggerPx2;
                }
                if (!AEQbTJ(str, true).getFirst().booleanValue()) {
                    z2 = true;
                }
            }
        } else {
            z2 = false;
        }
        this.KWHzl.setValue(Boolean.valueOf(z3 && !(z || z2)));
    }
}
