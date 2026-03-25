package com.okinc.okapm.okqpl.reporter;

import com.okinc.okapm.okqpl.QPLEvent;
import com.okinc.okapm.okqpl.QPLType;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.rWB;

/* JADX INFO: loaded from: classes10.dex */
public final class OkQPLReporter$isNetworkQplInBlackList$1 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
    final /* synthetic */ QPLEvent $qplEvent;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkQPLReporter$isNetworkQplInBlackList$1(QPLEvent qPLEvent, Continuation<? super OkQPLReporter$isNetworkQplInBlackList$1> continuation) {
        super(2, continuation);
        this.$qplEvent = qPLEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OkQPLReporter$isNetworkQplInBlackList$1 okQPLReporter$isNetworkQplInBlackList$1 = new OkQPLReporter$isNetworkQplInBlackList$1(this.$qplEvent, continuation);
        okQPLReporter$isNetworkQplInBlackList$1.L$0 = obj;
        return okQPLReporter$isNetworkQplInBlackList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
        return ((OkQPLReporter$isNetworkQplInBlackList$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        if (Intrinsics.EZpvd((Object) this.$qplEvent.getQplType(), (Object) QPLType.NETWORKV2.getValue()) || Intrinsics.EZpvd((Object) this.$qplEvent.getQplType(), (Object) QPLType.NETWORK.getValue())) {
            List<String> listCopydefault = rWB.copydefault();
            QPLEvent qPLEvent = this.$qplEvent;
            for (String str : listCopydefault) {
                if (Intrinsics.EZpvd((Object) qPLEvent.getSource(), (Object) str) || StringsKt__StringsKt.contains$default((CharSequence) qPLEvent.getSource(), (CharSequence) str, false, 2, (Object) null)) {
                    pUU.KWHzl("Monitor.OkQPL", "ignore record " + qPLEvent + " its under ignore list");
                    Boolean boolKWHzl = C56443yFo.KWHzl(false);
                    this.label = 1;
                    if (flowCollector.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
        this.label = 2;
        if (flowCollector.emit(boolKWHzl2, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
