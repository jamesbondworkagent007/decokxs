package com.okinc.okimcore.usecase;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.model.im.OKInvisibleCustomMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendAck;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.FlowCollector;
import o.C44124sEe;
import o.C44385sNw;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59454zhO;
import o.pUU;
import o.sRW;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagesUseCase$submitMessage$1 extends SuspendLambda implements Function2<FlowCollector<? super C44502sSe.StateListAnimator>, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKMessage $okMessage;
    final /* synthetic */ C44502sSe.StateListAnimator.C0942StateListAnimator $sendingResult;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C44502sSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesUseCase$submitMessage$1(C44502sSe c44502sSe, OKMessage oKMessage, C44502sSe.StateListAnimator.C0942StateListAnimator c0942StateListAnimator, Continuation<? super MessagesUseCase$submitMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = c44502sSe;
        this.$okMessage = oKMessage;
        this.$sendingResult = c0942StateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessagesUseCase$submitMessage$1 messagesUseCase$submitMessage$1 = new MessagesUseCase$submitMessage$1(this.this$0, this.$okMessage, this.$sendingResult, continuation);
        messagesUseCase$submitMessage$1.L$0 = obj;
        return messagesUseCase$submitMessage$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super C44502sSe.StateListAnimator> flowCollector, Continuation<? super Unit> continuation) {
        return ((MessagesUseCase$submitMessage$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0269 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x026a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objM7377constructorimpl;
        C44502sSe.StateListAnimator.C0942StateListAnimator c0942StateListAnimator;
        FlowCollector flowCollector;
        Object objEZpvd;
        Object obj2;
        FlowCollector flowCollector2;
        C44502sSe c44502sSe;
        C44502sSe.StateListAnimator.Application application;
        Throwable thM7380exceptionOrNullimpl;
        String str;
        FlowCollector flowCollector3;
        OKMessage oKMessage;
        Object objWithContext;
        Object obj3;
        C44502sSe.StateListAnimator.TaskDescription taskDescription;
        Throwable th;
        FlowCollector flowCollector4;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                flowCollector4 = (FlowCollector) this.L$0;
                C44502sSe c44502sSe2 = this.this$0;
                OKMessage oKMessage2 = this.$okMessage;
                C44502sSe.StateListAnimator.C0942StateListAnimator c0942StateListAnimator2 = this.$sendingResult;
                Result.Application application3 = Result.Companion;
                InHouseIMMessageEntity inHouseIMMessageEntityOLrzqt = c0942StateListAnimator2.OLrzqt();
                this.L$0 = flowCollector4;
                this.label = 1;
                objAEQbTJ = c44502sSe2.AEQbTJ(oKMessage2, inHouseIMMessageEntityOLrzqt, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl((WSSendAck) objAEQbTJ);
                c0942StateListAnimator = this.$sendingResult;
                OKMessage oKMessage3 = this.$okMessage;
                C44502sSe c44502sSe3 = this.this$0;
                if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    String messageId = c0942StateListAnimator.OLrzqt().getMessageId();
                    pUU.EZpvd("FileUploadProgress", "[" + C59454zhO.isConnected(messageId, 8) + "] submitMessage: SUCCESS");
                    C44385sNw.KWHzl.AYXKKw(messageId);
                    boolean z = oKMessage3.getContent() instanceof OKInvisibleCustomMessage;
                    this.L$0 = flowCollector4;
                    this.L$1 = objM7377constructorimpl;
                    this.L$2 = c0942StateListAnimator;
                    this.L$3 = c44502sSe3;
                    this.label = 2;
                    objEZpvd = c44502sSe3.EZpvd(c0942StateListAnimator, (WSSendAck) objM7377constructorimpl, z, this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objM7377constructorimpl;
                    flowCollector2 = flowCollector4;
                    c44502sSe = c44502sSe3;
                    application = (C44502sSe.StateListAnimator.Application) objEZpvd;
                    this.L$0 = flowCollector2;
                    this.L$1 = obj2;
                    this.L$2 = c0942StateListAnimator;
                    this.L$3 = c44502sSe;
                    this.L$4 = application;
                    this.label = 3;
                    if (flowCollector2.emit(application, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    sRW srw = sRW.KWHzl;
                    srw.AEQbTJ(c44502sSe.AEQbTJ, "IMChat_Message_Send_Click", c0942StateListAnimator.OLrzqt(), C56443yFo.KWHzl(c0942StateListAnimator.OLrzqt().getSendTime()), c44502sSe.copydefault);
                    srw.AEQbTJ(c44502sSe.AEQbTJ, "IMChat_Message_SentAck_Success", c0942StateListAnimator.OLrzqt(), application.KWHzl().getReceiveTime(), c44502sSe.copydefault);
                    C44124sEe.imLogSync$default("send message => notified pending message[" + application.KWHzl().getSeq() + "]: sent", null, application.KWHzl().getChannelId(), 2, null);
                    objM7377constructorimpl = obj2;
                    flowCollector = flowCollector2;
                    C44502sSe.StateListAnimator.C0942StateListAnimator c0942StateListAnimator3 = this.$sendingResult;
                    OKMessage oKMessage4 = this.$okMessage;
                    C44502sSe c44502sSe4 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        String messageId2 = c0942StateListAnimator3.OLrzqt().getMessageId();
                        boolean z2 = thM7380exceptionOrNullimpl instanceof CancellationException;
                        C44385sNw c44385sNw = C44385sNw.KWHzl;
                        boolean zKWHzl = c44385sNw.KWHzl(messageId2);
                        str = "send message => notified pending message[";
                        FlowCollector flowCollector5 = flowCollector;
                        pUU.EZpvd("FileUploadProgress", "[" + C59454zhO.isConnected(messageId2, 8) + "] submitMessage: FAILED (" + thM7380exceptionOrNullimpl.getClass().getSimpleName() + ": " + thM7380exceptionOrNullimpl.getMessage() + ", isCancellation=" + z2 + ", isUserCancelled=" + zKWHzl + ")");
                        if (zKWHzl) {
                            NonCancellable nonCancellable = NonCancellable.INSTANCE;
                            MessagesUseCase$submitMessage$1$3$1 messagesUseCase$submitMessage$1$3$1 = new MessagesUseCase$submitMessage$1$3$1(c44502sSe4, messageId2, null);
                            this.L$0 = objM7377constructorimpl;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.label = 4;
                            if (BuildersKt.withContext(nonCancellable, messagesUseCase$submitMessage$1$3$1, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            if (!z2) {
                                c44385sNw.djBIcL(messageId2);
                            }
                            NonCancellable nonCancellable2 = NonCancellable.INSTANCE;
                            MessagesUseCase$submitMessage$1$3$sendFailedResult$1 messagesUseCase$submitMessage$1$3$sendFailedResult$1 = new MessagesUseCase$submitMessage$1$3$sendFailedResult$1(c44502sSe4, c0942StateListAnimator3, thM7380exceptionOrNullimpl, oKMessage4, null);
                            flowCollector3 = flowCollector5;
                            this.L$0 = flowCollector3;
                            this.L$1 = objM7377constructorimpl;
                            oKMessage = oKMessage4;
                            this.L$2 = oKMessage;
                            this.L$3 = thM7380exceptionOrNullimpl;
                            this.L$4 = null;
                            this.label = 5;
                            objWithContext = BuildersKt.withContext(nonCancellable2, messagesUseCase$submitMessage$1$3$sendFailedResult$1, this);
                            if (objWithContext == objCopydefault) {
                                return objCopydefault;
                            }
                            obj3 = objM7377constructorimpl;
                            taskDescription = (C44502sSe.StateListAnimator.TaskDescription) objWithContext;
                            OKServerException oKServerException = !(thM7380exceptionOrNullimpl instanceof OKServerException) ? (OKServerException) thM7380exceptionOrNullimpl : null;
                            oKMessage.setError(oKServerException == null ? C56443yFo.AEQbTJ(oKServerException.getCode()) : null);
                            this.L$0 = obj3;
                            this.L$1 = thM7380exceptionOrNullimpl;
                            this.L$2 = taskDescription;
                            this.L$3 = null;
                            this.label = 6;
                            if (flowCollector3.emit(taskDescription, this) != objCopydefault) {
                                return objCopydefault;
                            }
                            th = thM7380exceptionOrNullimpl;
                            C44124sEe.AEQbTJ(str + taskDescription.AEQbTJ().getSeq() + "]: failed", th, taskDescription.AEQbTJ().getChannelId());
                        }
                    }
                    return Unit.INSTANCE;
                }
                flowCollector = flowCollector4;
                C44502sSe.StateListAnimator.C0942StateListAnimator c0942StateListAnimator32 = this.$sendingResult;
                OKMessage oKMessage42 = this.$okMessage;
                C44502sSe c44502sSe42 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 1:
                flowCollector4 = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
                objM7377constructorimpl = Result.m7377constructorimpl((WSSendAck) objAEQbTJ);
                c0942StateListAnimator = this.$sendingResult;
                OKMessage oKMessage32 = this.$okMessage;
                C44502sSe c44502sSe32 = this.this$0;
                if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                break;
            case 2:
                C44502sSe c44502sSe5 = (C44502sSe) this.L$3;
                C44502sSe.StateListAnimator.C0942StateListAnimator c0942StateListAnimator4 = (C44502sSe.StateListAnimator.C0942StateListAnimator) this.L$2;
                Object obj4 = this.L$1;
                FlowCollector flowCollector6 = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = obj;
                flowCollector2 = flowCollector6;
                obj2 = obj4;
                c0942StateListAnimator = c0942StateListAnimator4;
                c44502sSe = c44502sSe5;
                application = (C44502sSe.StateListAnimator.Application) objEZpvd;
                this.L$0 = flowCollector2;
                this.L$1 = obj2;
                this.L$2 = c0942StateListAnimator;
                this.L$3 = c44502sSe;
                this.L$4 = application;
                this.label = 3;
                if (flowCollector2.emit(application, this) == objCopydefault) {
                }
                sRW srw2 = sRW.KWHzl;
                srw2.AEQbTJ(c44502sSe.AEQbTJ, "IMChat_Message_Send_Click", c0942StateListAnimator.OLrzqt(), C56443yFo.KWHzl(c0942StateListAnimator.OLrzqt().getSendTime()), c44502sSe.copydefault);
                srw2.AEQbTJ(c44502sSe.AEQbTJ, "IMChat_Message_SentAck_Success", c0942StateListAnimator.OLrzqt(), application.KWHzl().getReceiveTime(), c44502sSe.copydefault);
                C44124sEe.imLogSync$default("send message => notified pending message[" + application.KWHzl().getSeq() + "]: sent", null, application.KWHzl().getChannelId(), 2, null);
                objM7377constructorimpl = obj2;
                flowCollector = flowCollector2;
                C44502sSe.StateListAnimator.C0942StateListAnimator c0942StateListAnimator322 = this.$sendingResult;
                OKMessage oKMessage422 = this.$okMessage;
                C44502sSe c44502sSe422 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 3:
                application = (C44502sSe.StateListAnimator.Application) this.L$4;
                c44502sSe = (C44502sSe) this.L$3;
                c0942StateListAnimator = (C44502sSe.StateListAnimator.C0942StateListAnimator) this.L$2;
                obj2 = this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                sRW srw22 = sRW.KWHzl;
                srw22.AEQbTJ(c44502sSe.AEQbTJ, "IMChat_Message_Send_Click", c0942StateListAnimator.OLrzqt(), C56443yFo.KWHzl(c0942StateListAnimator.OLrzqt().getSendTime()), c44502sSe.copydefault);
                srw22.AEQbTJ(c44502sSe.AEQbTJ, "IMChat_Message_SentAck_Success", c0942StateListAnimator.OLrzqt(), application.KWHzl().getReceiveTime(), c44502sSe.copydefault);
                C44124sEe.imLogSync$default("send message => notified pending message[" + application.KWHzl().getSeq() + "]: sent", null, application.KWHzl().getChannelId(), 2, null);
                objM7377constructorimpl = obj2;
                flowCollector = flowCollector2;
                C44502sSe.StateListAnimator.C0942StateListAnimator c0942StateListAnimator3222 = this.$sendingResult;
                OKMessage oKMessage4222 = this.$okMessage;
                C44502sSe c44502sSe4222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 4:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 5:
                Throwable th3 = (Throwable) this.L$3;
                OKMessage oKMessage5 = (OKMessage) this.L$2;
                obj3 = this.L$1;
                FlowCollector flowCollector7 = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                thM7380exceptionOrNullimpl = th3;
                flowCollector3 = flowCollector7;
                str = "send message => notified pending message[";
                oKMessage = oKMessage5;
                objWithContext = obj;
                taskDescription = (C44502sSe.StateListAnimator.TaskDescription) objWithContext;
                if (!(thM7380exceptionOrNullimpl instanceof OKServerException)) {
                }
                oKMessage.setError(oKServerException == null ? C56443yFo.AEQbTJ(oKServerException.getCode()) : null);
                this.L$0 = obj3;
                this.L$1 = thM7380exceptionOrNullimpl;
                this.L$2 = taskDescription;
                this.L$3 = null;
                this.label = 6;
                if (flowCollector3.emit(taskDescription, this) != objCopydefault) {
                }
                break;
            case 6:
                taskDescription = (C44502sSe.StateListAnimator.TaskDescription) this.L$2;
                th = (Throwable) this.L$1;
                C56391yDq.AEQbTJ(obj);
                str = "send message => notified pending message[";
                C44124sEe.AEQbTJ(str + taskDescription.AEQbTJ().getSeq() + "]: failed", th, taskDescription.AEQbTJ().getChannelId());
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
