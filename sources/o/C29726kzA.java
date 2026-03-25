package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.business.market.data.model.traders.TradersData;
import com.okinc.business.market.data.model.traders.TradersWrapperData;
import com.okinc.business.market.data.model.websocket.WebsocketListWrapper;
import com.okinc.business.market.features.trader.data.TradersRepositoryImpl$getTraderList$5;
import com.okinc.business.market.features.trader.data.TradersRepositoryImpl$subscribeTraderList$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.trader.domain.model.TradersRequestParam;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kzA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29726kzA implements InterfaceC29729kzD {
    public final C27640jyx AEQbTJ;
    public final InterfaceC23229huL EZpvd;
    public final Gson KWHzl;
    public final java.lang.String copydefault;

    public C29726kzA(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull C27640jyx c27640jyx, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.EZpvd = interfaceC23229huL;
        this.AEQbTJ = c27640jyx;
        this.KWHzl = gson;
        this.copydefault = "dex-market-trader-v1";
    }

    @Override // o.InterfaceC29729kzD
    public java.lang.Object copydefault(@NotNull TradersRequestParam tradersRequestParam, @NotNull Continuation<? super AbstractC43419rot<TradersWrapperData, OKServerException>> continuation) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("chainId", tradersRequestParam.AEQbTJ());
        map.put("tokenContractAddress", tradersRequestParam.EZpvd());
        java.lang.String strOLrzqt = tradersRequestParam.OLrzqt();
        if (strOLrzqt != null) {
            map.put("currentUserWalletAddress", strOLrzqt);
        }
        java.lang.String strCopydefault = tradersRequestParam.copydefault();
        if (strCopydefault != null) {
            map.put("addressLabel", strCopydefault);
        }
        java.lang.String strKWHzl = tradersRequestParam.KWHzl();
        if (strKWHzl != null) {
            map.put("filterWalletAddress", strKWHzl);
        }
        return kAB.EZpvd(new TradersRepositoryImpl$getTraderList$5(this, map, null), continuation);
    }

    @Override // o.InterfaceC29729kzD
    public java.lang.Object KWHzl(@NotNull TradersRequestParam tradersRequestParam, @NotNull Continuation<? super Flow<? extends java.util.List<TradersData>>> continuation) {
        Json jsonKWHzl = C43284rmQ.KWHzl();
        jsonKWHzl.getSerializersModule();
        this.AEQbTJ.EZpvd(this.copydefault, yDY.copydefault(new WsArgV5ForWeb3(this.copydefault, null, null, null, (JsonObject) this.KWHzl.fromJson(jsonKWHzl.encodeToString(TradersRequestParam.Companion.serializer(), tradersRequestParam), JsonObject.class), 14, null)));
        return C27591jyA.OLrzqt(new StateListAnimator(this.AEQbTJ.copydefault(), this), continuation);
    }

    /* JADX INFO: renamed from: o.kzA$StateListAnimator */
    public static final class StateListAnimator implements Flow<WebsocketListWrapper<TradersData>> {
        public final /* synthetic */ C29726kzA AEQbTJ;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.kzA$StateListAnimator$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ C29726kzA AEQbTJ;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C29726kzA c29726kzA) {
                this.copydefault = flowCollector;
                this.AEQbTJ = c29726kzA;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                TradersRepositoryImpl$subscribeTraderList$$inlined$mapNotNull$1$2$1 tradersRepositoryImpl$subscribeTraderList$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof TradersRepositoryImpl$subscribeTraderList$$inlined$mapNotNull$1$2$1) {
                    tradersRepositoryImpl$subscribeTraderList$$inlined$mapNotNull$1$2$1 = (TradersRepositoryImpl$subscribeTraderList$$inlined$mapNotNull$1$2$1) continuation;
                    int i = tradersRepositoryImpl$subscribeTraderList$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tradersRepositoryImpl$subscribeTraderList$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        tradersRepositoryImpl$subscribeTraderList$$inlined$mapNotNull$1$2$1 = new TradersRepositoryImpl$subscribeTraderList$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = tradersRepositoryImpl$subscribeTraderList$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = tradersRepositoryImpl$subscribeTraderList$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    WebsocketListWrapper websocketListWrapperKWHzl = this.AEQbTJ.KWHzl((java.lang.String) obj);
                    if (websocketListWrapperKWHzl != null) {
                        tradersRepositoryImpl$subscribeTraderList$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(websocketListWrapperKWHzl, tradersRepositoryImpl$subscribeTraderList$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow, C29726kzA c29726kzA) {
            this.copydefault = flow;
            this.AEQbTJ = c29726kzA;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super WebsocketListWrapper<TradersData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC29729kzD
    public void AEQbTJ() {
        this.AEQbTJ.AEQbTJ();
    }

    public final WebsocketListWrapper<TradersData> KWHzl(java.lang.String str) {
        try {
            Json jsonKWHzl = C43284rmQ.KWHzl();
            jsonKWHzl.getSerializersModule();
            return (WebsocketListWrapper) jsonKWHzl.decodeFromString(WebsocketListWrapper.Companion.serializer(TradersData.Companion.serializer()), str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
