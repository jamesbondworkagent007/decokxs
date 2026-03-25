package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.IdxCcyConfig;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TradeInfo;
import com.okinc.unify_trade.biz.UserTradeConfigInfo;
import com.okinc.unify_trade.manager.MarginModeManager;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xNr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC54581xNr {
    java.lang.Object AEQbTJ(@NotNull BizInstrument bizInstrument, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.util.List<ChargeGroupData> AEQbTJ();

    xMV AEQbTJ(@NotNull java.lang.String str);

    void AEQbTJ(@NotNull java.util.ArrayList<java.lang.Object> arrayList);

    boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    boolean AEQbTJ(@NotNull C54588xNy c54588xNy);

    java.lang.String AYXKKw(@NotNull java.lang.String str);

    C56130xwx AYXKKw();

    IdxConfig AhwBna();

    TradeCoinInfo AhwBna(@NotNull java.lang.String str);

    java.lang.String AkhnZx();

    boolean AkhnZx(@NotNull java.lang.String str);

    java.util.ArrayList<AbstractC54531xLw> AuCTel();

    C54630xPm AuCTelauCTel();

    TradeInfo AubY();

    C54591xOa AwvSrB();

    void AxsJAY();

    java.util.List<FutureGroupInfo> DbNXlk();

    boolean DbNXlk(@NotNull java.lang.String str);

    BizInstrument EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    FutureGroupInfo EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC54531xLw> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super SourceResp<AbstractC54531xLw>> continuation);

    java.lang.String EZpvd(@NotNull java.lang.String str, boolean z);

    xNQ EZpvd();

    void EZpvd(@NotNull AbstractC54575xNl abstractC54575xNl);

    boolean EZpvd(@NotNull java.lang.String str);

    C54536xML KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    xMW KWHzl();

    void KWHzl(@NotNull BizInstrument bizInstrument);

    void KWHzl(@NotNull java.util.List<ChargeGroupData> list);

    boolean KWHzl(@NotNull java.lang.String str);

    java.util.ArrayList<TradeCoinInfo> OLrzqt();

    AbstractC54531xLw OLrzqt(@NotNull java.lang.String str);

    void OLrzqt(@NotNull MutableLiveData<SourceResp<xOW>> mutableLiveData, UserTradeConfigInfo userTradeConfigInfo, TradeInfo tradeInfo, boolean z);

    void OLrzqt(@NotNull BizInstrument bizInstrument, boolean z);

    void OLrzqt(@NotNull java.util.ArrayList<TradeGroupData> arrayList);

    void OLrzqt(boolean z);

    boolean OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    C54592xOb ORxRYg();

    C54606xOp OcIXYQ();

    void QOLQEE();

    BizInstrument copydefault(@NotNull java.lang.String str, java.lang.String str2);

    BizInstrument copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    java.lang.String copydefault(@NotNull java.lang.String str);

    xOR copydefault();

    void copydefault(@NotNull java.util.ArrayList<java.lang.Object> arrayList);

    void copydefault(@NotNull AbstractC54575xNl abstractC54575xNl);

    java.util.HashMap<java.lang.String, TradeCoinInfo> djBIcL();

    AbstractC54531xLw djBIcL(@NotNull java.lang.String str);

    java.util.ArrayList<java.lang.String> ejfBZ();

    java.util.List<FutureGroupInfo> fARcdN();

    BizInstrument fIwbmz();

    TradePositionManager fJNWhG();

    C56131xwy fetchVPNInfo();

    boolean fetchVPNInfo(@NotNull java.lang.String str);

    xIC gEmmrt();

    boolean gEmmrt(@NotNull java.lang.String str);

    UserTradeConfigInfo gHZMYf();

    C56084xwD getFieldNames();

    xOW getNewProxyInstance();

    java.util.ArrayList<TradeGroupData> hDKMBd();

    MarginModeManager isConnected();

    java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> iwGUEr();

    boolean sSMYrx();

    java.util.ArrayList<TradeGroupData> uzCIH();

    IdxCcyConfig valueOf();

    java.lang.String valueOf(@NotNull java.lang.String str);

    java.util.ArrayList<java.lang.String> values();

    boolean values(java.lang.String str);

    xOU wlaJM();

    C56087xwG zLjUOn();

    C54489xKh zsXlph();

    boolean zuBGHE();

    /* JADX INFO: renamed from: o.xNr$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ boolean isInit$default(InterfaceC54581xNr interfaceC54581xNr, C54588xNy c54588xNy, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isInit");
            }
            if ((i & 1) != 0) {
                c54588xNy = new C54588xNy();
            }
            return interfaceC54581xNr.AEQbTJ(c54588xNy);
        }

        public static /* synthetic */ BizInstrument getSuggestedInstrument$default(InterfaceC54581xNr interfaceC54581xNr, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSuggestedInstrument");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            return interfaceC54581xNr.copydefault(str, str2, str3, str4);
        }

        public static /* synthetic */ BizInstrument getMinSuggestedInstrument$default(InterfaceC54581xNr interfaceC54581xNr, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMinSuggestedInstrument");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            return interfaceC54581xNr.EZpvd(str, str2, str3, str4);
        }

        public static /* synthetic */ void loadTradeSetting$default(InterfaceC54581xNr interfaceC54581xNr, MutableLiveData mutableLiveData, UserTradeConfigInfo userTradeConfigInfo, TradeInfo tradeInfo, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadTradeSetting");
            }
            if ((i & 2) != 0) {
                userTradeConfigInfo = null;
            }
            if ((i & 4) != 0) {
                tradeInfo = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            interfaceC54581xNr.OLrzqt(mutableLiveData, userTradeConfigInfo, tradeInfo, z);
        }

        public static /* synthetic */ boolean isSupportDcd$default(InterfaceC54581xNr interfaceC54581xNr, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isSupportDcd");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            return interfaceC54581xNr.values(str);
        }

        public static /* synthetic */ BizInstrument getBizDefaultByType$default(InterfaceC54581xNr interfaceC54581xNr, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBizDefaultByType");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return interfaceC54581xNr.copydefault(str, str2);
        }
    }
}
