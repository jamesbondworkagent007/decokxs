package com.okinc.tradingbot.impl.order.strategy;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradeapi.bean.RouteData;
import com.okinc.tradeapi.main.mvp.kline.HalfScreenKLinePageType;
import com.okinc.tradecore.main.mvp.home.EventTrade;
import com.okinc.tradecore.main.mvp.mediator.BaseMediator;
import com.okinc.tradingbot.impl.notice.banner.UMContractLimitedPresenter;
import com.okinc.tradingbot.impl.order.strategy.BotTradePresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC42536rWm;
import o.C32869mli;
import o.C48033uCm;
import o.C52478wMx;
import o.C53685wqE;
import o.C54589xNz;
import o.C54782xVc;
import o.C54786xVg;
import o.C55326xho;
import o.C55688xof;
import o.C56058xve;
import o.C56111xwe;
import o.C56392yDr;
import o.InterfaceC49427uoO;
import o.InterfaceC49429uoQ;
import o.InterfaceC49432uoT;
import o.InterfaceC49434uoV;
import o.InterfaceC49435uoW;
import o.InterfaceC49436uoX;
import o.InterfaceC49496upe;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.xKK;
import o.xLY;
import o.xOU;
import o.xOW;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotTradePresenter extends BaseMediator implements InterfaceC49435uoW {
    public String AEQbTJ;
    public C52478wMx AYXKKw;
    public InterfaceC49434uoV AhwBna;
    public Function0<Unit> AkhnZx;
    public UMContractLimitedPresenter AuCTel;
    public String DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public BizInstrument KWHzl;
    public Context OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public InterfaceC49436uoX djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public AbstractC42536rWm fetchVPNInfo;
    public InterfaceC49427uoO gEmmrt;
    public final C56111xwe<BotTradeData> isConnected;
    public InterfaceC49432uoT valueOf;
    public HashMap<String, String> values;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EventTrade.values().length];
            try {
                iArr[EventTrade.GET_CONTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventTrade.GET_TRADE_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventTrade.GET_CHILD_FM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EventTrade.GET_ROUTE_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EventTrade.GET_TRADE_VIEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EventTrade.GET_INIT_PRESENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EventTrade.GET_BIZ_CONFIG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C52478wMx AkhnZx() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(AbstractC42536rWm abstractC42536rWm) {
        this.fetchVPNInfo = abstractC42536rWm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull InterfaceC49436uoX interfaceC49436uoX) {
        Intrinsics.checkNotNullParameter(interfaceC49436uoX, "");
        this.djBIcL = interfaceC49436uoX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> fARcdN() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<BotTradeData> values() {
        return this.isConnected;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotTradePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.isConnected = new C56111xwe<>();
        this.AEQbTJ = "";
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.vzT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotTradePresenter.AhwBna();
            }
        });
        this.AYXKKw = new C52478wMx();
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vzS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotTradePresenter.uzCIH();
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vAb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotTradePresenter.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public static final InterfaceC49429uoQ AhwBna() {
        return C53685wqE.copydefault.AEQbTJ();
    }

    public final InterfaceC49429uoQ AuCTel() {
        return (InterfaceC49429uoQ) this.ejfBZ.getValue();
    }

    private final BizInfoConfig.DefaultBizConfig AuCTelauCTel() {
        return (BizInfoConfig.DefaultBizConfig) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BizInfoConfig.DefaultBizConfig uzCIH() {
        return BizInfoConfig.DefaultBizConfig.copydefault;
    }

    public static final xLY AEQbTJ(BotTradePresenter botTradePresenter) {
        return new xLY(botTradePresenter.AuCTelauCTel());
    }

    public final xLY fetchVPNInfo() {
        return (xLY) this.copydefault.getValue();
    }

    public InterfaceC49436uoX fJNWhG() {
        InterfaceC49436uoX interfaceC49436uoX = this.djBIcL;
        if (interfaceC49436uoX != null) {
            return interfaceC49436uoX;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator
    public void AEQbTJ() {
        Object obj = this.valueOf;
        BaseMediator baseMediator = obj instanceof BaseMediator ? (BaseMediator) obj : null;
        if (baseMediator != null) {
            baseMediator.AEQbTJ();
        }
        Object obj2 = this.AhwBna;
        BaseMediator baseMediator2 = obj2 instanceof BaseMediator ? (BaseMediator) obj2 : null;
        if (baseMediator2 != null) {
            baseMediator2.AEQbTJ();
        }
        AEQbTJ(new Function1() { // from class: o.vzZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return BotTradePresenter.valueOf((BaseMediator) obj3);
            }
        });
        C54782xVc.AEQbTJ.AhwBna(fetchVPNInfo().EZpvd());
        C54786xVg.copydefault.AEQbTJ(fetchVPNInfo().EZpvd());
    }

    public static final Unit valueOf(BaseMediator baseMediator) {
        Intrinsics.checkNotNullParameter(baseMediator, "");
        baseMediator.AEQbTJ();
        return Unit.INSTANCE;
    }

    public void OLrzqt(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C53685wqE c53685wqE = C53685wqE.copydefault;
        this.gEmmrt = c53685wqE.copydefault().EZpvd(this, view);
        OLrzqt(AuCTel().OLrzqt());
        InterfaceC49496upe interfaceC49496upeCopydefault = c53685wqE.copydefault();
        InterfaceC49436uoX interfaceC49436uoX = this.djBIcL;
        InterfaceC49436uoX interfaceC49436uoX2 = null;
        if (interfaceC49436uoX == null) {
            Intrinsics.gEmmrt("");
            interfaceC49436uoX = null;
        }
        this.AhwBna = interfaceC49496upeCopydefault.EZpvd(interfaceC49436uoX.AEQbTJ(), this, getApplication(), getSavedStateHandle());
        InterfaceC49496upe interfaceC49496upeCopydefault2 = c53685wqE.copydefault();
        InterfaceC49436uoX interfaceC49436uoX3 = this.djBIcL;
        if (interfaceC49436uoX3 == null) {
            Intrinsics.gEmmrt("");
            interfaceC49436uoX3 = null;
        }
        InterfaceC49432uoT interfaceC49432uoTOLrzqt = interfaceC49496upeCopydefault2.OLrzqt(interfaceC49436uoX3.AEQbTJ(), this, getApplication(), getSavedStateHandle());
        this.valueOf = interfaceC49432uoTOLrzqt;
        if (interfaceC49432uoTOLrzqt != null) {
            interfaceC49432uoTOLrzqt.copydefault(HalfScreenKLinePageType.TRADE_TACTICS);
        }
        InterfaceC49436uoX interfaceC49436uoX4 = this.djBIcL;
        if (interfaceC49436uoX4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            interfaceC49436uoX2 = interfaceC49436uoX4;
        }
        this.AuCTel = new UMContractLimitedPresenter(interfaceC49436uoX2.AEQbTJ(), this, getApplication(), getSavedStateHandle());
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator, o.InterfaceC49498upg
    public Object AEQbTJ(@NotNull EventTrade eventTrade, @NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(eventTrade, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        InterfaceC49436uoX interfaceC49436uoX = null;
        switch (TaskDescription.copydefault[eventTrade.ordinal()]) {
            case 1:
                Context context = this.OLrzqt;
                if (context != null) {
                    return context;
                }
                Intrinsics.gEmmrt("");
                return null;
            case 2:
                return C54589xNz.EZpvd.fetchVPNInfo();
            case 3:
                InterfaceC49436uoX interfaceC49436uoX2 = this.djBIcL;
                if (interfaceC49436uoX2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    interfaceC49436uoX = interfaceC49436uoX2;
                }
                return interfaceC49436uoX.copydefault();
            case 4:
                return AuCTel().OLrzqt();
            case 5:
                return fJNWhG();
            case 6:
                return this.AYXKKw;
            case 7:
                return AuCTelauCTel();
            default:
                return Unit.INSTANCE;
        }
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator
    public void KWHzl() {
        Object obj = this.valueOf;
        BaseMediator baseMediator = obj instanceof BaseMediator ? (BaseMediator) obj : null;
        if (baseMediator != null) {
            baseMediator.KWHzl();
        }
        Object obj2 = this.AhwBna;
        BaseMediator baseMediator2 = obj2 instanceof BaseMediator ? (BaseMediator) obj2 : null;
        if (baseMediator2 != null) {
            baseMediator2.KWHzl();
        }
        AEQbTJ(new Function1() { // from class: o.vzU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return BotTradePresenter.djBIcL((BaseMediator) obj3);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotTradePresenter$onVisible$2(AuCTel().copydefault(), this, null), 3, null);
        Function0<Unit> function0 = this.AkhnZx;
        if (function0 != null) {
            function0.invoke();
        }
        this.AkhnZx = null;
    }

    public static final Unit djBIcL(BaseMediator baseMediator) {
        Intrinsics.checkNotNullParameter(baseMediator, "");
        baseMediator.KWHzl();
        return Unit.INSTANCE;
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator
    public void copydefault() {
        Object obj = this.AhwBna;
        BaseMediator baseMediator = obj instanceof BaseMediator ? (BaseMediator) obj : null;
        if (baseMediator != null) {
            baseMediator.copydefault();
        }
        Object obj2 = this.valueOf;
        BaseMediator baseMediator2 = obj2 instanceof BaseMediator ? (BaseMediator) obj2 : null;
        if (baseMediator2 != null) {
            baseMediator2.copydefault();
        }
        AEQbTJ(new Function1() { // from class: o.vzW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return BotTradePresenter.AhwBna((BaseMediator) obj3);
            }
        });
        C54782xVc.AEQbTJ.AYXKKw();
    }

    public static final Unit AhwBna(BaseMediator baseMediator) {
        Intrinsics.checkNotNullParameter(baseMediator, "");
        baseMediator.copydefault();
        return Unit.INSTANCE;
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator
    public void OLrzqt() {
        Object obj = this.valueOf;
        BaseMediator baseMediator = obj instanceof BaseMediator ? (BaseMediator) obj : null;
        if (baseMediator != null) {
            baseMediator.OLrzqt();
        }
        Object obj2 = this.AhwBna;
        BaseMediator baseMediator2 = obj2 instanceof BaseMediator ? (BaseMediator) obj2 : null;
        if (baseMediator2 != null) {
            baseMediator2.OLrzqt();
        }
        AEQbTJ(new Function1() { // from class: o.vzY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return BotTradePresenter.copydefault((BaseMediator) obj3);
            }
        });
        C54786xVg.copydefault.AEQbTJ();
    }

    public static final Unit copydefault(BaseMediator baseMediator) {
        Intrinsics.checkNotNullParameter(baseMediator, "");
        baseMediator.OLrzqt();
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC49435uoW
    public void copydefault(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC49436uoX interfaceC49436uoX = this.djBIcL;
        if (interfaceC49436uoX == null) {
            Intrinsics.gEmmrt("");
            interfaceC49436uoX = null;
        }
        interfaceC49436uoX.EZpvd(str, str2, str3, str4, z, z2);
    }

    public void getNewProxyInstance() {
        InterfaceC49427uoO interfaceC49427uoO = this.gEmmrt;
        if (interfaceC49427uoO != null) {
            interfaceC49427uoO.KWHzl();
        }
    }

    public void AYXKKw() {
        InterfaceC49427uoO interfaceC49427uoO = this.gEmmrt;
        if (interfaceC49427uoO != null) {
            interfaceC49427uoO.OLrzqt();
        }
    }

    public void hDKMBd() {
        InterfaceC49427uoO interfaceC49427uoO = this.gEmmrt;
        if (interfaceC49427uoO != null) {
            interfaceC49427uoO.AEQbTJ();
        }
    }

    public void gEmmrt() {
        InterfaceC49427uoO interfaceC49427uoO = this.gEmmrt;
        if (interfaceC49427uoO != null) {
            interfaceC49427uoO.EZpvd();
        }
    }

    public void KWHzl(String str) {
        InterfaceC49427uoO interfaceC49427uoO = this.gEmmrt;
        if (interfaceC49427uoO != null) {
            if (str == null) {
                str = "";
            }
            interfaceC49427uoO.KWHzl(str);
        }
    }

    public void iwGUEr() {
        InterfaceC49434uoV interfaceC49434uoV = this.AhwBna;
        if (interfaceC49434uoV != null) {
            interfaceC49434uoV.EZpvd();
        }
    }

    public final C56111xwe<ParamBuilder> fIwbmz() {
        return AuCTel().KWHzl();
    }

    public final void KWHzl(Bundle bundle) {
        BotTradeData botTradeData;
        Serializable serializable = bundle != null ? bundle.getSerializable("bot_track_param") : null;
        this.values = serializable instanceof HashMap ? (HashMap) serializable : null;
        this.DbNXlk = bundle != null ? bundle.getString("bot_trade_source") : null;
        Object obj = getSavedStateHandle().get("bot_trade_parse_done");
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.EZpvd(obj, bool)) {
            return;
        }
        if (bundle != null && (botTradeData = (BotTradeData) bundle.getParcelable("bot_trade_data")) != null) {
            EZpvd(botTradeData);
        }
        getSavedStateHandle().set("bot_trade_parse_done", bool);
        C56058xve.Companion.copydefault().AEQbTJ(this.values);
    }

    public final ParamBuilder EZpvd(@NotNull BotTradeData botTradeData) {
        String instType;
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(botTradeData, "");
        String botType = botTradeData.getBotType();
        if (Intrinsics.EZpvd((Object) botType, (Object) "twap") || Intrinsics.EZpvd((Object) botType, (Object) "smart_iceberg")) {
            instType = botTradeData.getInstType();
            if (Intrinsics.EZpvd((Object) instType, (Object) "MARGIN")) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                if (!Intrinsics.EZpvd((Object) ((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM()), (Object) "2")) {
                    instType = "SPOT";
                }
            }
        } else {
            instType = botTradeData.getInstType();
        }
        ParamBuilder.ActionBar actionBarCopydefault = new ParamBuilder.ActionBar().OLrzqt(botType).KWHzl(instType).copydefault(botTradeData.getInstId()).EZpvd(botTradeData.getInstFamily()).copydefault(true);
        Bundle bundle = new Bundle();
        Parcelable req = botTradeData.getReq();
        if (req != null) {
            bundle.putParcelable("bot_copy_req", req);
            bundle.putBoolean("bot_one_click_copy", botTradeData.isOneClickCopy());
        }
        String recommendId = botTradeData.getRecommendId();
        if (recommendId != null) {
            bundle.putString("recommendId", recommendId);
        }
        bundle.putString("bot_inst_id", botTradeData.getInstId());
        bundle.putString("bot_inst_type", instType);
        bundle.putBoolean("bot_from_deeplink", botTradeData.isDeepLink());
        bundle.putParcelableArrayList("FUNDING_RATE_ARB_COIN_LIST", new ArrayList<>(botTradeData.getReqList()));
        ParamBuilder paramBuilderEZpvd = actionBarCopydefault.copydefault(bundle).EZpvd();
        AuCTel().KWHzl(paramBuilderEZpvd);
        return paramBuilderEZpvd;
    }

    public final void getFieldNames() {
        xOU xouWlaJM;
        this.KWHzl = fetchVPNInfo().EZpvd();
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        this.AEQbTJ = (interfaceC54581xNrCopydefault == null || (xouWlaJM = interfaceC54581xNrCopydefault.wlaJM()) == null) ? null : xouWlaJM.OLrzqt();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(Boolean bool) {
        boolean z;
        xOU xouWlaJM;
        if (Intrinsics.EZpvd(bool, Boolean.TRUE)) {
            C55326xho.toastWithSuccessfulIcon$default(C48033uCm.Fragment.OAjjVP, 0, 1, (Object) null);
            return;
        }
        if (this.KWHzl == null || this.AEQbTJ == null) {
            return;
        }
        BizInstrument bizInstrumentEZpvd = fetchVPNInfo().EZpvd();
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        String strOLrzqt = (interfaceC54581xNrCopydefault == null || (xouWlaJM = interfaceC54581xNrCopydefault.wlaJM()) == null) ? null : xouWlaJM.OLrzqt();
        if (Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) strOLrzqt)) {
            z = false;
        } else {
            BizInstrument bizInstrument = this.KWHzl;
            if (!Intrinsics.EZpvd((Object) (bizInstrument != null ? bizInstrument.getTradeSymbol() : null), (Object) (bizInstrumentEZpvd != null ? bizInstrumentEZpvd.getTradeSymbol() : null))) {
                z = true;
            }
        }
        boolean z2 = !Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) "arbitrage") && Intrinsics.EZpvd((Object) strOLrzqt, (Object) "arbitrage");
        boolean z3 = Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) "arbitrage") && !Intrinsics.EZpvd((Object) strOLrzqt, (Object) "arbitrage");
        if (z || z2 || z3) {
            C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.MediaDescriptionCompatApi21Builder, 0, 1, (Object) null);
        }
        this.KWHzl = null;
        this.AEQbTJ = null;
    }

    public final ParamBuilder isConnected() {
        return AuCTel().copydefault();
    }

    public void valueOf() {
        AuCTel().EZpvd();
        getSavedStateHandle().remove("bot_trade_data");
        getSavedStateHandle().set("bot_running_jump", Boolean.TRUE);
    }

    public static /* synthetic */ void appPageEnter$default(BotTradePresenter botTradePresenter, RouteData routeData, int i, Object obj) {
        if ((i & 1) != 0) {
            routeData = null;
        }
        botTradePresenter.OLrzqt(routeData);
    }

    public final void OLrzqt(final RouteData routeData) {
        if (routeData != null) {
            C32869mli.onNewOKexEventWithParams$default("app_page_enter", null, new Function1() { // from class: o.vzV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotTradePresenter.copydefault(routeData, routeData, (EventParamsList) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit copydefault(RouteData routeData, RouteData routeData2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page_id", "page_trade", false);
        String fromPage = routeData.getFromPage();
        if (fromPage == null) {
            fromPage = "page_home";
        }
        eventParamsList.put("pre_page_id", fromPage, false);
        if (routeData2.getBizType() != null) {
            String instType = routeData2.getInstType();
            if (instType == null) {
                instType = "";
            }
            eventParamsList.put("deal_type", instType, false);
        }
        if (routeData2.getInstId() != null) {
            String instId = routeData2.getInstId();
            eventParamsList.put("deal_name", instId != null ? instId : "", false);
        }
        return Unit.INSTANCE;
    }

    @Override // com.okinc.tradecore.main.mvp.mediator.BaseMediator, com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.AYXKKw.values();
    }

    public final void AEQbTJ(Function1<? super BaseMediator, Unit> function1) {
        UMContractLimitedPresenter uMContractLimitedPresenter = this.AuCTel;
        if (uMContractLimitedPresenter != null) {
            if (uMContractLimitedPresenter == null) {
                Intrinsics.gEmmrt("");
                uMContractLimitedPresenter = null;
            }
            UMContractLimitedPresenter uMContractLimitedPresenter2 = uMContractLimitedPresenter instanceof BaseMediator ? uMContractLimitedPresenter : null;
            if (uMContractLimitedPresenter2 != null) {
                function1.invoke(uMContractLimitedPresenter2);
            }
        }
    }

    public final Fragment DbNXlk() {
        InterfaceC49432uoT interfaceC49432uoT = this.valueOf;
        if (interfaceC49432uoT != null) {
            return interfaceC49432uoT.OLrzqt();
        }
        return null;
    }

    public final void EZpvd(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        InterfaceC49432uoT interfaceC49432uoT = this.valueOf;
        if (interfaceC49432uoT != null) {
            interfaceC49432uoT.AEQbTJ(function0);
        }
    }
}
