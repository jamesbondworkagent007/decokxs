package o;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.market.data.model.alert.LiveMarketPriceData;
import com.okinc.business.market.features.alert.data.AlertRepositoryImpl$subscribeToLivePrice$$inlined$map$1$2$1;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jHa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25806jHa {
    public static final int copydefault = C27640jyx.KWHzl;
    public final C27640jyx OLrzqt;

    /* JADX INFO: renamed from: o.jHa$Application */
    public static final class Application extends TypeToken<java.util.List<? extends LiveMarketPriceData>> {
    }

    public C25806jHa(@NotNull C27640jyx c27640jyx) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        this.OLrzqt = c27640jyx;
    }

    public java.lang.Object EZpvd(@NotNull C27614jyX c27614jyX, @NotNull Continuation<? super Flow<? extends java.util.List<LiveMarketPriceData>>> continuation) {
        this.OLrzqt.AEQbTJ();
        return new ActionBar(this.OLrzqt.KWHzl("dex-market-v3", yDY.copydefault(new WsArgV5ForWeb3("dex-market-v3", null, c27614jyX.AEQbTJ(), c27614jyX.EZpvd(), null, 18, null))), this);
    }

    public void EZpvd() {
        this.OLrzqt.AEQbTJ();
    }

    public final java.util.List<LiveMarketPriceData> AEQbTJ(java.lang.String str) {
        try {
            return (java.util.List) new GsonBuilder().create().fromJson(str, new Application().getType());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: o.jHa$ActionBar */
    public static final class ActionBar implements Flow<java.util.List<? extends LiveMarketPriceData>> {
        public final /* synthetic */ C25806jHa AEQbTJ;
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.jHa$ActionBar$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C25806jHa KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, C25806jHa c25806jHa) {
                this.AEQbTJ = flowCollector;
                this.KWHzl = c25806jHa;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                AlertRepositoryImpl$subscribeToLivePrice$$inlined$map$1$2$1 alertRepositoryImpl$subscribeToLivePrice$$inlined$map$1$2$1;
                if (continuation instanceof AlertRepositoryImpl$subscribeToLivePrice$$inlined$map$1$2$1) {
                    alertRepositoryImpl$subscribeToLivePrice$$inlined$map$1$2$1 = (AlertRepositoryImpl$subscribeToLivePrice$$inlined$map$1$2$1) continuation;
                    int i = alertRepositoryImpl$subscribeToLivePrice$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        alertRepositoryImpl$subscribeToLivePrice$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        alertRepositoryImpl$subscribeToLivePrice$$inlined$map$1$2$1 = new AlertRepositoryImpl$subscribeToLivePrice$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = alertRepositoryImpl$subscribeToLivePrice$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = alertRepositoryImpl$subscribeToLivePrice$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.util.List listAEQbTJ = this.KWHzl.AEQbTJ((java.lang.String) obj);
                    alertRepositoryImpl$subscribeToLivePrice$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listAEQbTJ, alertRepositoryImpl$subscribeToLivePrice$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, C25806jHa c25806jHa) {
            this.KWHzl = flow;
            this.AEQbTJ = c25806jHa;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends LiveMarketPriceData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
