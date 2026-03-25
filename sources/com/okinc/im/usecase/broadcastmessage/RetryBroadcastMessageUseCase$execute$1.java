package com.okinc.im.usecase.broadcastmessage;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC35761oCs;
import o.C35760oCr;
import o.C35766oCx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class RetryBroadcastMessageUseCase$execute$1 extends SuspendLambda implements Function2<FlowCollector<? super AbstractC35761oCs>, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKMessage $message;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C35766oCx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryBroadcastMessageUseCase$execute$1(OKMessage oKMessage, C35766oCx c35766oCx, Continuation<? super RetryBroadcastMessageUseCase$execute$1> continuation) {
        super(2, continuation);
        this.$message = oKMessage;
        this.this$0 = c35766oCx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetryBroadcastMessageUseCase$execute$1 retryBroadcastMessageUseCase$execute$1 = new RetryBroadcastMessageUseCase$execute$1(this.$message, this.this$0, continuation);
        retryBroadcastMessageUseCase$execute$1.L$0 = obj;
        return retryBroadcastMessageUseCase$execute$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super AbstractC35761oCs> flowCollector, Continuation<? super Unit> continuation) {
        return ((RetryBroadcastMessageUseCase$execute$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(1:(1:(1:(1:(3:8|44|45)(2:9|10))(6:11|38|39|(2:41|(1:43))|44|45))(11:12|46|13|14|27|32|(2:34|(1:36)(2:37|38))|39|(0)|44|45))(1:17))(2:18|(1:20)(1:21))|22|48|23|(1:25)(8:26|27|32|(0)|39|(0)|44|45)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        OKMessage oKMessage;
        Object objKWHzl;
        FlowCollector flowCollector2;
        Object objM7377constructorimpl;
        FlowCollector flowCollector3;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector4 = (FlowCollector) this.L$0;
            OKMessage oKMessage2 = this.$message;
            OKMessage oKMessageCopy = oKMessage2.copy((262143 & 1) != 0 ? oKMessage2.seq : 0L, (262143 & 2) != 0 ? oKMessage2.clientMessageId : null, (262143 & 4) != 0 ? oKMessage2.targetId : null, (262143 & 8) != 0 ? oKMessage2.senderUserId : null, (262143 & 16) != 0 ? oKMessage2.messageType : null, (262143 & 32) != 0 ? oKMessage2.conversationType : null, (262143 & 64) != 0 ? oKMessage2.sentTime : 0L, (262143 & 128) != 0 ? oKMessage2.receivedTime : 0L, (262143 & 256) != 0 ? oKMessage2.extra : null, (262143 & 512) != 0 ? oKMessage2.objectName : null, (262143 & 1024) != 0 ? oKMessage2.messageDirection : null, (262143 & 2048) != 0 ? oKMessage2.sentStatus : OKMessage.SentStatus.SENDING, (262143 & 4096) != 0 ? oKMessage2.content : null, (262143 & 8192) != 0 ? oKMessage2.messagePushConfig : null, (262143 & 16384) != 0 ? oKMessage2.sourceJsonString : null, (262143 & 32768) != 0 ? oKMessage2.isVisible : false, (262143 & 65536) != 0 ? oKMessage2.error : null, (262143 & 131072) != 0 ? oKMessage2.reactionDisplay : null);
            AbstractC35761oCs.TaskDescription taskDescription = new AbstractC35761oCs.TaskDescription(this.$message);
            this.L$0 = flowCollector4;
            this.L$1 = oKMessageCopy;
            this.label = 1;
            if (flowCollector4.emit(taskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
            flowCollector = flowCollector4;
            oKMessage = oKMessageCopy;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    objM7377constructorimpl = this.L$1;
                    flowCollector3 = (FlowCollector) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    flowCollector2 = flowCollector3;
                    OKMessage oKMessage3 = this.$message;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        AbstractC35761oCs.StateListAnimator stateListAnimator = new AbstractC35761oCs.StateListAnimator(oKMessage3, thM7380exceptionOrNullimpl);
                        this.L$0 = objM7377constructorimpl;
                        this.L$1 = null;
                        this.label = 4;
                        if (flowCollector2.emit(stateListAnimator, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                flowCollector2 = (FlowCollector) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl = obj;
                    objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) objKWHzl);
                } catch (Throwable th) {
                    th = th;
                    flowCollector = flowCollector2;
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    flowCollector2 = flowCollector;
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    AbstractC35761oCs.Application application2 = new AbstractC35761oCs.Application((OKMessage) objM7377constructorimpl);
                    this.L$0 = flowCollector2;
                    this.L$1 = objM7377constructorimpl;
                    this.label = 3;
                    if (flowCollector2.emit(application2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    flowCollector3 = flowCollector2;
                    flowCollector2 = flowCollector3;
                }
                OKMessage oKMessage32 = this.$message;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            oKMessage = (OKMessage) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C35766oCx c35766oCx = this.this$0;
        Result.Application application3 = Result.Companion;
        C35760oCr c35760oCr = c35766oCx.KWHzl;
        this.L$0 = flowCollector;
        this.L$1 = null;
        this.label = 2;
        objKWHzl = c35760oCr.KWHzl(oKMessage, null, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        flowCollector2 = flowCollector;
        objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) objKWHzl);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        OKMessage oKMessage322 = this.$message;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
