package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.kline.ws.KlineSubIndicatorTicker$createInstListTicker$$inlined$map$1$2$1;
import com.okinc.kline.ws.KlineSubIndicatorTicker$createInstListTicker$1;
import com.okinc.kline.ws.KlineSubIndicatorTicker$createInstListTicker$3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pHl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37970pHl {
    public static final C37970pHl copydefault = new C37970pHl();

    private C37970pHl() {
    }

    public final <T> Flow<java.util.List<T>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function1<? super java.lang.String, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return FlowKt.flowOn(FlowKt.m7441catch(new Activity(FlowKt.callbackFlow(new KlineSubIndicatorTicker$createInstListTicker$1(str, str2, null)), function1), new KlineSubIndicatorTicker$createInstListTicker$3(null)), Dispatchers.getDefault());
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.pHl$Activity */
    public static final class Activity<T> implements Flow<java.util.List<? extends T>> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX INFO: renamed from: o.pHl$Activity$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ Function1 EZpvd;
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, Function1 function1) {
                this.KWHzl = flowCollector;
                this.EZpvd = function1;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                KlineSubIndicatorTicker$createInstListTicker$$inlined$map$1$2$1 klineSubIndicatorTicker$createInstListTicker$$inlined$map$1$2$1;
                java.util.List listAhwBna;
                if (continuation instanceof KlineSubIndicatorTicker$createInstListTicker$$inlined$map$1$2$1) {
                    klineSubIndicatorTicker$createInstListTicker$$inlined$map$1$2$1 = (KlineSubIndicatorTicker$createInstListTicker$$inlined$map$1$2$1) continuation;
                    int i = klineSubIndicatorTicker$createInstListTicker$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        klineSubIndicatorTicker$createInstListTicker$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        klineSubIndicatorTicker$createInstListTicker$$inlined$map$1$2$1 = new KlineSubIndicatorTicker$createInstListTicker$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = klineSubIndicatorTicker$createInstListTicker$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = klineSubIndicatorTicker$createInstListTicker$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.lang.Object objInvoke = this.EZpvd.invoke(((OKIncomingData) obj).getPayload().toString());
                    if (objInvoke == null || (listAhwBna = C56402yEa.EZpvd(objInvoke)) == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    klineSubIndicatorTicker$createInstListTicker$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listAhwBna, klineSubIndicatorTicker$createInstListTicker$$inlined$map$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow, Function1 function1) {
            this.EZpvd = flow;
            this.OLrzqt = function1;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass5(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
