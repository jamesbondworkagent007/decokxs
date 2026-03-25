package com.okinc.oklive.domain.usecase;

import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.oklive.app.ui.list.displaymodel.LiveStreamCustomMessageUpdate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sVX;

/* JADX INFO: loaded from: classes10.dex */
public final class ProcessLiveStreamCustomMessageUseCase$processCustomMessage$1 extends SuspendLambda implements Function2<FlowCollector<? super LiveStreamCustomMessageUpdate>, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKMessage $message;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sVX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessLiveStreamCustomMessageUseCase$processCustomMessage$1(OKMessage oKMessage, sVX svx, Continuation<? super ProcessLiveStreamCustomMessageUseCase$processCustomMessage$1> continuation) {
        super(2, continuation);
        this.$message = oKMessage;
        this.this$0 = svx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProcessLiveStreamCustomMessageUseCase$processCustomMessage$1 processLiveStreamCustomMessageUseCase$processCustomMessage$1 = new ProcessLiveStreamCustomMessageUseCase$processCustomMessage$1(this.$message, this.this$0, continuation);
        processLiveStreamCustomMessageUseCase$processCustomMessage$1.L$0 = obj;
        return processLiveStreamCustomMessageUseCase$processCustomMessage$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super LiveStreamCustomMessageUpdate> flowCollector, Continuation<? super Unit> continuation) {
        return ((ProcessLiveStreamCustomMessageUseCase$processCustomMessage$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [64=9] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        LiveStreamCustomMessageUpdate liveStreamCustomMessageUpdateKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            OKMessageContent content = this.$message.getContent();
            if (!(content instanceof OKCustomMessage)) {
                pUU.valueOf("ProcessLiveStreamCustomMessageUseCase", "Message content is not OKCustomMessage, ignoring");
                return Unit.INSTANCE;
            }
            OKCustomMessage oKCustomMessage = (OKCustomMessage) content;
            pUU.EZpvd("ProcessLiveStreamCustomMessageUseCase", "Processing custom message: serviceName=" + oKCustomMessage.getServiceName() + ", bizName=" + oKCustomMessage.getBizName() + ", channelId=" + this.$message.getTargetId());
            String bizName = oKCustomMessage.getBizName();
            if (bizName != null) {
                switch (bizName.hashCode()) {
                    case -1075504235:
                        if (!bizName.equals("LiveStreamUpdate")) {
                            pUU.EZpvd("ProcessLiveStreamCustomMessageUseCase", "Unknown bizName: " + oKCustomMessage.getBizName() + ", handling generically");
                            liveStreamCustomMessageUpdateKWHzl = this.this$0.KWHzl(oKCustomMessage);
                        } else {
                            liveStreamCustomMessageUpdateKWHzl = this.this$0.AEQbTJ(oKCustomMessage);
                        }
                        break;
                    case -613746730:
                        if (bizName.equals("RemoveViewer")) {
                            liveStreamCustomMessageUpdateKWHzl = this.this$0.AYXKKw(oKCustomMessage);
                            break;
                        }
                        break;
                    case 93142845:
                        if (bizName.equals("UnmuteUser")) {
                            liveStreamCustomMessageUpdateKWHzl = this.this$0.valueOf(oKCustomMessage);
                            break;
                        }
                        break;
                    case 229009410:
                        if (bizName.equals("TokenUpdate")) {
                            liveStreamCustomMessageUpdateKWHzl = this.this$0.gEmmrt(oKCustomMessage);
                            break;
                        }
                        break;
                    case 480310467:
                        if (bizName.equals("GeneralInsights")) {
                            liveStreamCustomMessageUpdateKWHzl = this.this$0.OLrzqt(oKCustomMessage);
                            break;
                        }
                        break;
                    case 933061028:
                        if (!bizName.equals("MuteUser")) {
                        }
                        break;
                    case 1169830452:
                        if (bizName.equals("ModeratorAssign")) {
                            liveStreamCustomMessageUpdateKWHzl = this.this$0.copydefault(oKCustomMessage);
                            break;
                        }
                        break;
                    case 1643691979:
                        if (bizName.equals("ModeratorRevoke")) {
                            liveStreamCustomMessageUpdateKWHzl = this.this$0.EZpvd(oKCustomMessage);
                            break;
                        }
                        break;
                    case 1709818066:
                        if (bizName.equals("PinMessage")) {
                            liveStreamCustomMessageUpdateKWHzl = this.this$0.AhwBna(oKCustomMessage);
                            break;
                        }
                        break;
                    case 2002295851:
                        if (bizName.equals("UnpinMessage")) {
                            liveStreamCustomMessageUpdateKWHzl = this.this$0.djBIcL(oKCustomMessage);
                            break;
                        }
                        break;
                }
                this.label = 1;
                if (flowCollector.emit(liveStreamCustomMessageUpdateKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
