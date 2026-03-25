package o;

import com.okinc.business.market.common.websocket.WsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.data.model.websocket.WebsocketListWrapper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27591jyA {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.jyA$TaskDescription */
    public static final class TaskDescription<T> implements Flow<java.util.List<? extends T>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C27592jyB EZpvd;

        /* JADX INFO: renamed from: o.jyA$TaskDescription$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ C27592jyB KWHzl;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, C27592jyB c27592jyB) {
                this.copydefault = flowCollector;
                this.KWHzl = c27592jyB;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1 wsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof WsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1) {
                    wsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1 = (WsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1) continuation;
                    int i = wsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        wsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        wsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1 = new WsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = wsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = wsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.copydefault;
                    WebsocketListWrapper websocketListWrapper = (WebsocketListWrapper) obj;
                    C27592jyB c27592jyB = this.KWHzl;
                    java.util.List<T> listOLrzqt = websocketListWrapper.OLrzqt();
                    java.lang.Long lEZpvd = websocketListWrapper.EZpvd();
                    java.lang.Integer numKWHzl = websocketListWrapper.KWHzl();
                    int iIntValue = numKWHzl != null ? numKWHzl.intValue() : 0;
                    java.lang.Integer numAEQbTJ = websocketListWrapper.AEQbTJ();
                    wsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1.L$0 = flowCollector2;
                    wsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1.label = 1;
                    java.lang.Object objKWHzl = c27592jyB.KWHzl(listOLrzqt, lEZpvd, iIntValue, numAEQbTJ, wsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objKWHzl;
                    flowCollector = flowCollector2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) wsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                }
                if (obj2 != null) {
                    wsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1.L$0 = null;
                    wsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1.label = 2;
                    if (flowCollector.emit(obj2, wsDataWindowHelperKt$collectWithWindow$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow, C27592jyB c27592jyB) {
            this.AEQbTJ = flow;
            this.EZpvd = c27592jyB;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final <T> java.lang.Object OLrzqt(@NotNull Flow<WebsocketListWrapper<T>> flow, @NotNull Continuation<? super Flow<? extends java.util.List<? extends T>>> continuation) {
        return new TaskDescription(flow, new C27592jyB());
    }
}
