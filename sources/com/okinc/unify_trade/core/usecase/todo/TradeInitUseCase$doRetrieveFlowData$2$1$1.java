package com.okinc.unify_trade.core.usecase.todo;

import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import o.AbstractC54531xLw;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54581xNr;
import o.pUU;

/* JADX INFO: loaded from: classes12.dex */
public final class TradeInitUseCase$doRetrieveFlowData$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProducerScope<ResponseData<Boolean>> $$this$callbackFlow;
    final /* synthetic */ AtomicInteger $initSize;
    final /* synthetic */ Ref.BooleanRef $isSuccess;
    final /* synthetic */ String $it;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super com.okinc.network.okg.response.ResponseData<java.lang.Boolean>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TradeInitUseCase$doRetrieveFlowData$2$1$1(String str, Ref.BooleanRef booleanRef, AtomicInteger atomicInteger, ProducerScope<? super ResponseData<Boolean>> producerScope, Continuation<? super TradeInitUseCase$doRetrieveFlowData$2$1$1> continuation) {
        super(2, continuation);
        this.$it = str;
        this.$isSuccess = booleanRef;
        this.$initSize = atomicInteger;
        this.$$this$callbackFlow = producerScope;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeInitUseCase$doRetrieveFlowData$2$1$1(this.$it, this.$isSuccess, this.$initSize, this.$$this$callbackFlow, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeInitUseCase$doRetrieveFlowData$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC54531xLw abstractC54531xLw;
        Ref.BooleanRef booleanRef;
        AtomicInteger atomicInteger;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null) {
                abstractC54531xLw = null;
                booleanRef = this.$isSuccess;
                String str = this.$it;
                atomicInteger = this.$initSize;
                ProducerScope<ResponseData<Boolean>> producerScope = this.$$this$callbackFlow;
                if (booleanRef.element) {
                    booleanRef.element = abstractC54531xLw != null;
                }
                pUU.EZpvd("TradeInitUseCase", str + " 初始化 -> " + (abstractC54531xLw != null));
                if (atomicInteger.decrementAndGet() == 0) {
                    pUU.EZpvd("TradeInitUseCase", "初始化结束，结果为 -> " + booleanRef.element);
                    producerScope.mo5769trySendJP2dKIU(new ResponseData<>(0, null, null, null, C56443yFo.KWHzl(booleanRef.element), null, 46, null));
                }
                return Unit.INSTANCE;
            }
            String str2 = this.$it;
            this.label = 1;
            obj = interfaceC54581xNrOLrzqt.EZpvd(str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        abstractC54531xLw = (AbstractC54531xLw) obj;
        booleanRef = this.$isSuccess;
        String str3 = this.$it;
        atomicInteger = this.$initSize;
        ProducerScope<ResponseData<Boolean>> producerScope2 = this.$$this$callbackFlow;
        if (booleanRef.element) {
        }
        if (abstractC54531xLw != null) {
        }
        pUU.EZpvd("TradeInitUseCase", str3 + " 初始化 -> " + (abstractC54531xLw != null));
        if (atomicInteger.decrementAndGet() == 0) {
        }
        return Unit.INSTANCE;
    }
}
