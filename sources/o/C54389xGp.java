package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import me.relex.circleindicator.BuildConfig;
import o.C54401xHa;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xGp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C54389xGp extends xGQ<StrategyDetailsResponse> {
    public java.lang.String AEQbTJ;
    public final C56265xzZ AYXKKw;
    public AbstractC57556yke AhwBna;
    public final java.lang.String EZpvd;
    public InterfaceC58217yxC KWHzl;
    public final LinkedBlockingDeque<java.lang.String> OLrzqt;
    public volatile boolean copydefault;
    public final java.lang.String djBIcL;
    public final java.util.List<java.lang.String> gEmmrt;
    public AbstractC55727xpR valueOf;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    public C54389xGp(@NotNull java.lang.String str, AbstractC55727xpR abstractC55727xpR) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
        this.valueOf = abstractC55727xpR;
        this.EZpvd = "TradeRealStrategyOrderTask";
        this.OLrzqt = new LinkedBlockingDeque<>();
        this.AYXKKw = new C56265xzZ();
        this.gEmmrt = yDY.gEmmrt("effective", "order_failed", "canceled", "stop", "stopped", "completed", "all_done");
        this.AEQbTJ = "";
        copydefault();
    }

    private final void copydefault() {
        java.lang.String strAEQbTJ;
        this.copydefault = false;
        C56265xzZ c56265xzZ = this.AYXKKw;
        AbstractC55727xpR abstractC55727xpR = this.valueOf;
        if (abstractC55727xpR == null || (strAEQbTJ = abstractC55727xpR.AEQbTJ()) == null) {
            strAEQbTJ = "";
        }
        c56265xzZ.EZpvd(strAEQbTJ);
        c56265xzZ.KWHzl(new Function1() { // from class: o.xGn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54389xGp.EZpvd(this.EZpvd, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56265xzZ, 0L, 1, null);
    }

    public final void OLrzqt(StrategyDetailsResponse strategyDetailsResponse) {
        AbstractC55727xpR abstractC55727xpR = this.valueOf;
        if (abstractC55727xpR != null) {
            abstractC55727xpR.OLrzqt("http", strategyDetailsResponse);
        }
        if (strategyDetailsResponse.isHistory()) {
            return;
        }
        OLrzqt(strategyDetailsResponse.getAlgoId());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf A[ORIG_RETURN, RETURN] */
    @Override // o.xGQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String bJ_() {
        java.lang.String str = this.AEQbTJ;
        switch (str.hashCode()) {
            case -1831183611:
                return !str.equals("spot_dca") ? "algo-advance" : "algo-spot-dca";
            case -1574173039:
                if (str.equals("infinite_grid")) {
                    return "grid-orders-infinite";
                }
                break;
            case -1418042064:
                if (str.equals("ai_bot")) {
                    return "algo-ai-bot";
                }
                break;
            case -1402017003:
                if (str.equals("contract_dca")) {
                    return "algo-contract-dca";
                }
                break;
            case -1216369070:
                if (str.equals("smart_portfolio")) {
                    return "algo-smart-portfolio";
                }
                break;
            case -1148661171:
                if (str.equals("smart_iceberg")) {
                    return "slicing-orders-iceberg";
                }
                break;
            case -1086683216:
                if (str.equals("signal_bot")) {
                    return "algo-signalbot";
                }
                break;
            case -591806012:
                if (str.equals("moon_grid")) {
                    return "grid-orders-moon";
                }
                break;
            case -557961837:
                if (str.equals("smart_arbitrage")) {
                    return "algo-smart-arbitrage";
                }
                break;
            case -512749997:
                if (str.equals("contract_grid")) {
                    return "grid-orders-contract-priv";
                }
                break;
            case 3181382:
                if (str.equals("grid")) {
                    return "grid-orders-spot-priv";
                }
                break;
            case 1165749981:
                if (str.equals("recurring")) {
                    return "algo-recurring";
                }
                break;
            case 1485620813:
                if (str.equals("dcd_bot")) {
                    return "algo-dcd-bot";
                }
                break;
            case 1780188297:
                if (str.equals("arbitrage")) {
                    return "algo-arbitrage";
                }
                break;
        }
    }

    public final void OLrzqt(java.lang.String str) {
        java.lang.String strBJ_ = bJ_();
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, strBJ_, new WsArgV5(strBJ_, null, null, Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "dcd_bot") ? null : "ANY", null, str, null, null, BuildConfig.VERSION_CODE, null), (Function1) null, 4, (java.lang.Object) null);
        this.AhwBna = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
    }

    @Override // o.xGQ
    public C57567ykp AYXKKw() {
        if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "infinite_grid")) {
            return C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, true, false, true, false, null, 53, null);
        }
        return super.AYXKKw();
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.OLrzqt.put(str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StrategyDetailsResponse bD_() {
        java.util.List<StrategyDetailsResponse> listCopydefault;
        if (!this.copydefault) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.OLrzqt.isEmpty()) {
            arrayList.add(this.OLrzqt.take());
        }
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.wlaJM(arrayList);
        if (str == null || (listCopydefault = copydefault(str)) == null) {
            return null;
        }
        return (StrategyDetailsResponse) CollectionsKt___CollectionsKt.firstOrNull(listCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        this.AEQbTJ = strategyDetailsResponse.getOrderType();
        strategyDetailsResponse.setHistory(this.gEmmrt.contains(strategyDetailsResponse.getState()));
        AbstractC55727xpR abstractC55727xpR = this.valueOf;
        if (abstractC55727xpR != null) {
            abstractC55727xpR.OLrzqt("WebSocket", strategyDetailsResponse);
        }
    }

    private final java.util.List<StrategyDetailsResponse> copydefault(java.lang.String str) {
        try {
            java.util.List list = (java.util.List) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.ListSerializer(StrategyDetailsResponse.Companion.serializer()), str);
            if (!list.isEmpty()) {
                return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        return null;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55727xpR) {
            java.lang.String strKWHzl = ((AbstractC55727xpR) obj).KWHzl();
            AbstractC55727xpR abstractC55727xpR = this.valueOf;
            if (!Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) (abstractC55727xpR != null ? abstractC55727xpR.KWHzl() : null))) {
                return false;
            }
        }
        EZpvd();
        return true;
    }

    public final void EZpvd() {
        C54407xHg.Companion.EZpvd(bJ_(), this.AhwBna);
        AbstractC57556yke abstractC57556yke = this.AhwBna;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.AhwBna = null;
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.AYXKKw.AYXKKw();
    }

    public static final Unit EZpvd(C54389xGp c54389xGp, ResponseData responseData) {
        StrategyDetailsResponse strategyDetailsResponse;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            c54389xGp.copydefault = true;
            java.util.List list = (java.util.List) responseData.getData();
            if (list == null || (strategyDetailsResponse = (StrategyDetailsResponse) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) {
                strategyDetailsResponse = new StrategyDetailsResponse((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.util.ArrayList) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (ExtendedBusinessInfo) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (TacticsVoucherInfo) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Long) null, (java.util.ArrayList) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnParam) null, (ArbitrageTotalPnlInfo) null, (java.lang.Float) null, (java.lang.String) null, false, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (java.util.List) null, (StrategyProfitResponse) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, (BalanceDetailInfoDto) null, (java.lang.String) null, (BotVo) null, (StrategyDcaEditResp) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, -1, -1, -1, -1, -1, -1, -1, 131071, (DefaultConstructorMarker) null);
            }
            c54389xGp.AEQbTJ = strategyDetailsResponse.getOrderType();
            strategyDetailsResponse.setHistory(c54389xGp.gEmmrt.contains(strategyDetailsResponse.getState()));
            c54389xGp.OLrzqt(strategyDetailsResponse);
        } else {
            AbstractC55727xpR abstractC55727xpR = c54389xGp.valueOf;
            if (abstractC55727xpR != null) {
                abstractC55727xpR.AEQbTJ(responseData.getMsg());
            }
        }
        return Unit.INSTANCE;
    }
}
