package com.okinc.im.imui.broadcastmessages.inputpanel;

import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C35773oDd;
import o.C56391yDq;
import o.C56442yFn;
import o.oCS;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessageInputPanelFragmentViewModel$sendMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isConfirmSendMessage;
    final /* synthetic */ List<SendMessageRequestParam> $params;
    int label;
    final /* synthetic */ BroadcastMessageInputPanelFragmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.im.config.serviceprovider.SendMessageRequestParam> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastMessageInputPanelFragmentViewModel$sendMessage$1(BroadcastMessageInputPanelFragmentViewModel broadcastMessageInputPanelFragmentViewModel, boolean z, List<? extends SendMessageRequestParam> list, Continuation<? super BroadcastMessageInputPanelFragmentViewModel$sendMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = broadcastMessageInputPanelFragmentViewModel;
        this.$isConfirmSendMessage = z;
        this.$params = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastMessageInputPanelFragmentViewModel$sendMessage$1(this.this$0, this.$isConfirmSendMessage, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BroadcastMessageInputPanelFragmentViewModel$sendMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableSharedFlow mutableSharedFlow;
        Unit unit;
        MutableSharedFlow mutableSharedFlow2;
        Unit unit2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                oCS ocs = this.this$0.djBIcL;
                this.label = 1;
                obj = ocs.OLrzqt(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                C35773oDd c35773oDd = (C35773oDd) obj;
                if (!this.$isConfirmSendMessage) {
                    MutableSharedFlow mutableSharedFlow3 = this.this$0.AEQbTJ;
                    GeneralAction.SendMessages sendMessages = new GeneralAction.SendMessages(new ArrayList(this.$params));
                    this.label = 5;
                    if (mutableSharedFlow3.emit(sendMessages, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlow2 = this.this$0.EZpvd;
                    unit2 = Unit.INSTANCE;
                    this.label = 6;
                    if (mutableSharedFlow2.emit(unit2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                if (c35773oDd != null) {
                    MutableSharedFlow mutableSharedFlow4 = this.this$0.OLrzqt;
                    List<SendMessageRequestParam> list = this.$params;
                    this.label = 2;
                    if (mutableSharedFlow4.emit(list, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                MutableSharedFlow mutableSharedFlow5 = this.this$0.AEQbTJ;
                GeneralAction.SendMessages sendMessages2 = new GeneralAction.SendMessages(new ArrayList(this.$params));
                this.label = 3;
                if (mutableSharedFlow5.emit(sendMessages2, this) == objCopydefault) {
                    return objCopydefault;
                }
                mutableSharedFlow = this.this$0.EZpvd;
                unit = Unit.INSTANCE;
                this.label = 4;
                if (mutableSharedFlow.emit(unit, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C35773oDd c35773oDd2 = (C35773oDd) obj;
                if (!this.$isConfirmSendMessage) {
                }
                break;
            case 2:
            case 4:
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 3:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.EZpvd;
                unit = Unit.INSTANCE;
                this.label = 4;
                if (mutableSharedFlow.emit(unit, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 5:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow2 = this.this$0.EZpvd;
                unit2 = Unit.INSTANCE;
                this.label = 6;
                if (mutableSharedFlow2.emit(unit2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
