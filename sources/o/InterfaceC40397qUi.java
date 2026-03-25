package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.market.ticker.datasource.api.MarketDexTickerWsApi$DefaultImpls$createDexTickersFlow$$inlined$map$1$2$1;
import com.okinc.market.ticker.datasource.api.MarketDexTickerWsApi$createDexTickersFlow$1;
import com.okinc.market.ticker.datasource.api.MarketDexTickerWsApi$createDexTickersFlow$2;
import com.okinc.market.ticker.datasource.api.MarketDexTickerWsApi$createDexTickersFlow$3;
import com.okinc.market.ticker.model.DexTickerPo;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC9859bdY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qUi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40397qUi {
    public static final /* synthetic */ TaskDescription Companion = TaskDescription.EZpvd;

    /* JADX INFO: renamed from: o.qUi$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.qUi$StateListAnimator */
    public static final class StateListAnimator {

        /* JADX INFO: renamed from: o.qUi$StateListAnimator$ActionBar */
        public static final class ActionBar implements Flow<DexTickerPo> {
            public final /* synthetic */ Flow KWHzl;

            /* JADX INFO: renamed from: o.qUi$StateListAnimator$ActionBar$1, reason: invalid class name */
            public static final class AnonymousClass1<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass1(FlowCollector flowCollector) {
                    this.copydefault = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                    MarketDexTickerWsApi$DefaultImpls$createDexTickersFlow$$inlined$map$1$2$1 marketDexTickerWsApi$DefaultImpls$createDexTickersFlow$$inlined$map$1$2$1;
                    if (continuation instanceof MarketDexTickerWsApi$DefaultImpls$createDexTickersFlow$$inlined$map$1$2$1) {
                        marketDexTickerWsApi$DefaultImpls$createDexTickersFlow$$inlined$map$1$2$1 = (MarketDexTickerWsApi$DefaultImpls$createDexTickersFlow$$inlined$map$1$2$1) continuation;
                        int i = marketDexTickerWsApi$DefaultImpls$createDexTickersFlow$$inlined$map$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            marketDexTickerWsApi$DefaultImpls$createDexTickersFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            marketDexTickerWsApi$DefaultImpls$createDexTickersFlow$$inlined$map$1$2$1 = new MarketDexTickerWsApi$DefaultImpls$createDexTickersFlow$$inlined$map$1$2$1(this, continuation);
                        }
                    }
                    java.lang.Object obj2 = marketDexTickerWsApi$DefaultImpls$createDexTickersFlow$$inlined$map$1$2$1.result;
                    java.lang.Object objCopydefault = C56442yFn.copydefault();
                    int i2 = marketDexTickerWsApi$DefaultImpls$createDexTickersFlow$$inlined$map$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.copydefault;
                        DexTickerPo dexTickerPoAEQbTJ = DexTickerPo.Companion.AEQbTJ(((OKIncomingData) obj).getPayload().toString());
                        marketDexTickerWsApi$DefaultImpls$createDexTickersFlow$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(dexTickerPoAEQbTJ, marketDexTickerWsApi$DefaultImpls$createDexTickersFlow$$inlined$map$1$2$1) == objCopydefault) {
                            return objCopydefault;
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

            public ActionBar(Flow flow) {
                this.KWHzl = flow;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(FlowCollector<? super DexTickerPo> flowCollector, Continuation continuation) {
                java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass1(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        public static Flow<DexTickerPo> KWHzl(InterfaceC40397qUi interfaceC40397qUi, java.lang.String str, java.util.List<WsArgV5ForWeb3> list) {
            C57567ykp c57567ykpWalletPublicConnection$default = InterfaceC9859bdY.Application.walletPublicConnection$default((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class), false, 1, null);
            java.util.ArrayList arrayList = new java.util.ArrayList(list);
            return FlowKt.filterNotNull(new ActionBar(FlowKt.onCompletion(FlowKt.onStart(FlowKt.callbackFlow(new MarketDexTickerWsApi$createDexTickersFlow$1(str, c57567ykpWalletPublicConnection$default, arrayList, null)), new MarketDexTickerWsApi$createDexTickersFlow$2(str, arrayList, null)), new MarketDexTickerWsApi$createDexTickersFlow$3(str, arrayList, null))));
        }

        public static Flow<DexTickerPo> AEQbTJ(@NotNull InterfaceC40397qUi interfaceC40397qUi, @NotNull java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                kotlin.Pair pair = (kotlin.Pair) it.next();
                arrayList.add(new WsArgV5ForWeb3("dex-market-v3", null, (java.lang.String) pair.component1(), (java.lang.String) pair.component2(), null, 18, null));
            }
            return KWHzl(interfaceC40397qUi, "dex-market-v3", arrayList);
        }
    }
}
