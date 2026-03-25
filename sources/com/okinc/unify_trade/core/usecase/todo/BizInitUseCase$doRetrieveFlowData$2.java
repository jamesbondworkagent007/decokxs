package com.okinc.unify_trade.core.usecase.todo;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54581xNr;
import o.xCN;

/* JADX INFO: loaded from: classes12.dex */
public final class BizInitUseCase$doRetrieveFlowData$2 extends SuspendLambda implements Function2<ProducerScope<? super ResponseData<Boolean>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xCN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizInitUseCase$doRetrieveFlowData$2(xCN xcn, Continuation<? super BizInitUseCase$doRetrieveFlowData$2> continuation) {
        super(2, continuation);
        this.this$0 = xcn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BizInitUseCase$doRetrieveFlowData$2 bizInitUseCase$doRetrieveFlowData$2 = new BizInitUseCase$doRetrieveFlowData$2(this.this$0, continuation);
        bizInitUseCase$doRetrieveFlowData$2.L$0 = obj;
        return bizInitUseCase$doRetrieveFlowData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ResponseData<Boolean>> producerScope, Continuation<? super Unit> continuation) {
        return ((BizInitUseCase$doRetrieveFlowData$2) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProducerScope producerScope;
        String str;
        Boolean bool;
        Function0 function0;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            producerScope = (ProducerScope) this.L$0;
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
            if (interfaceC54581xNrCopydefault != null) {
                String str2 = this.this$0.EZpvd;
                if (str2 == null) {
                    Intrinsics.gEmmrt("");
                    str2 = null;
                }
                String str3 = this.this$0.OLrzqt;
                if (str3 == null) {
                    Intrinsics.gEmmrt("");
                    str = null;
                } else {
                    str = str3;
                }
                BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str, null, null, 12, null);
                if (suggestedInstrument$default != null) {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                    if (interfaceC54581xNrOLrzqt != null) {
                        this.L$0 = producerScope;
                        this.label = 1;
                        obj = interfaceC54581xNrOLrzqt.AEQbTJ(suggestedInstrument$default, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        bool = null;
                        ChannelResult.m7420boximpl(producerScope.mo5769trySendJP2dKIU(new ResponseData(!Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) ? 0 : -1, null, null, null, bool, null, 46, null)));
                    }
                }
            }
            function0 = new Function0() { // from class: o.xCL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            this.L$0 = null;
            this.label = 2;
            if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        producerScope = (ProducerScope) this.L$0;
        C56391yDq.AEQbTJ(obj);
        bool = (Boolean) obj;
        ChannelResult.m7420boximpl(producerScope.mo5769trySendJP2dKIU(new ResponseData(!Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) ? 0 : -1, null, null, null, bool, null, 46, null)));
        function0 = new Function0() { // from class: o.xCL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return Unit.INSTANCE;
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
