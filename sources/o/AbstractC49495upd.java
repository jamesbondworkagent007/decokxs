package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradeapi.bean.RouteData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.IdxCcyConfig;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.TradeInfo;
import com.okinc.unify_trade.biz.UserTradeConfigInfo;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.unify_trade.manager.MarginModeManager;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.upd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49495upd extends ViewModel {
    public java.lang.String copydefault;
    public final java.lang.String KWHzl = getClass().getSimpleName();
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.upk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC49495upd.KWHzl();
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.upj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC49495upd.KWHzl(this.OLrzqt);
        }
    });
    public boolean OLrzqt = true;

    public abstract java.lang.Object AEQbTJ(java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.String str3, ParamBuilder paramBuilder, @NotNull Continuation<? super Unit> continuation);

    public abstract java.lang.Object OLrzqt(RouteData routeData, boolean z, ParamBuilder paramBuilder, @NotNull Continuation<? super Unit> continuation);

    public final boolean djBIcL() {
        return C54589xNz.EZpvd.AkhnZx();
    }

    public final boolean gEmmrt() {
        return !Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) DbNXlk());
    }

    public final BizInfoConfig.DefaultBizConfig AEQbTJ() {
        return (BizInfoConfig.DefaultBizConfig) this.AEQbTJ.getValue();
    }

    public static final BizInfoConfig.DefaultBizConfig KWHzl() {
        return BizInfoConfig.DefaultBizConfig.copydefault;
    }

    public final xLY EZpvd() {
        return (xLY) this.EZpvd.getValue();
    }

    public static final xLY KWHzl(AbstractC49495upd abstractC49495upd) {
        return new xLY(abstractC49495upd.AEQbTJ());
    }

    public final boolean AYXKKw() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        boolean z = gEmmrt() || djBIcL() || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || !InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt, null, 1, null) || this.OLrzqt;
        java.lang.String str = this.KWHzl;
        boolean zGEmmrt = gEmmrt();
        boolean zDjBIcL = djBIcL();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
        java.lang.Boolean boolValueOf = interfaceC54581xNrOLrzqt2 != null ? java.lang.Boolean.valueOf(InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt2, null, 1, null)) : null;
        pUU.KWHzl(str, "isChangeLogin:" + zGEmmrt + ",isSystemChange:" + zDjBIcL + ",isInit:" + boolValueOf + ",isInitShow:" + this.OLrzqt + ",---- isShowInit：" + z);
        return z;
    }

    public final void AhwBna() {
        this.OLrzqt = false;
        pUU.KWHzl(this.KWHzl, "setNotShowInit");
    }

    public final void valueOf() {
        pUU.KWHzl(this.KWHzl, "saveUserName");
        this.copydefault = DbNXlk();
    }

    private final java.lang.String DbNXlk() {
        C55697xoo c55697xoo = C55697xoo.OLrzqt;
        if (c55697xoo.isConnected()) {
            return c55697xoo.copydefault();
        }
        return null;
    }

    public static /* synthetic */ java.lang.Object routeRefreshLoader$default(AbstractC49495upd abstractC49495upd, RouteData routeData, boolean z, ParamBuilder paramBuilder, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeRefreshLoader");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            paramBuilder = new ParamBuilder.ActionBar().EZpvd();
        }
        return abstractC49495upd.OLrzqt(routeData, z, paramBuilder, continuation);
    }

    public static /* synthetic */ java.lang.Object routeInnerRefreshLoader$default(AbstractC49495upd abstractC49495upd, java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.String str3, ParamBuilder paramBuilder, Continuation continuation, int i, java.lang.Object obj) {
        if (obj == null) {
            return abstractC49495upd.AEQbTJ(bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? new ParamBuilder.ActionBar().EZpvd() : paramBuilder, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeInnerRefreshLoader");
    }

    public final C49500upi OLrzqt() {
        java.lang.String strKWHzl;
        MarginModeManager marginModeManagerIsConnected;
        xOW newProxyInstance;
        java.lang.String instType;
        java.lang.String instId;
        MarginModeManager marginModeManagerIsConnected2;
        java.lang.String currentMarginMode$default;
        xOW newProxyInstance2;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        java.lang.String isoCode;
        BizInstrument bizInstrumentEZpvd = EZpvd().EZpvd();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String strWlaJM = null;
        UserTradeConfigInfo userTradeConfigInfoGHZMYf = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.gHZMYf() : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        TradeInfo tradeInfoAubY = interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.AubY() : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
        IdxCcyConfig idxCcyConfigValueOf = interfaceC54581xNrOLrzqt3 != null ? interfaceC54581xNrOLrzqt3.valueOf() : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt4 = c54589xNz.OLrzqt();
        IdxConfig idxConfigAhwBna = interfaceC54581xNrOLrzqt4 != null ? interfaceC54581xNrOLrzqt4.AhwBna() : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt5 = c54589xNz.OLrzqt();
        java.lang.String str = "";
        java.lang.String str2 = (interfaceC54581xNrOLrzqt5 == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt5.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance2.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null || (isoCode = value.getIsoCode()) == null) ? "" : isoCode;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt6 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt6 == null || (marginModeManagerIsConnected2 = interfaceC54581xNrOLrzqt6.isConnected()) == null || (currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected2, false, bizInstrumentEZpvd, 1, null)) == null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt7 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt7 == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt7.isConnected()) == null) {
                strKWHzl = null;
            } else {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt8 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt8 != null && (newProxyInstance = interfaceC54581xNrOLrzqt8.getNewProxyInstance()) != null) {
                    strWlaJM = newProxyInstance.wlaJM();
                }
                strKWHzl = marginModeManagerIsConnected.KWHzl(java.lang.String.valueOf(strWlaJM));
            }
        } else {
            strKWHzl = currentMarginMode$default;
        }
        if (bizInstrumentEZpvd == null || bizInstrumentEZpvd.getInstType().length() == 0) {
            C54515xLg c54515xLg = C54515xLg.OLrzqt;
            if (bizInstrumentEZpvd == null || (instType = bizInstrumentEZpvd.getInstType()) == null) {
                instType = "";
            }
            if (bizInstrumentEZpvd != null && (instId = bizInstrumentEZpvd.getInstId()) != null) {
                str = instId;
            }
            c54515xLg.AEQbTJ("getTradeCache", instType, str);
        }
        return new C49500upi(bizInstrumentEZpvd, idxConfigAhwBna, idxCcyConfigValueOf, str2, userTradeConfigInfoGHZMYf, tradeInfoAubY, strKWHzl);
    }
}
