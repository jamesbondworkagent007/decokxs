package com.okinc.im.imui.broadcastmessages;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C35772oDc;
import o.C35774oDe;
import o.C56391yDq;
import o.C56442yFn;
import o.oCT;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessagesActivityViewModel$leaveBroadcastPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isSentMessage;
    final /* synthetic */ String $textInput;
    int label;
    final /* synthetic */ BroadcastMessagesActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessagesActivityViewModel$leaveBroadcastPage$1(BroadcastMessagesActivityViewModel broadcastMessagesActivityViewModel, String str, boolean z, Continuation<? super BroadcastMessagesActivityViewModel$leaveBroadcastPage$1> continuation) {
        super(2, continuation);
        this.this$0 = broadcastMessagesActivityViewModel;
        this.$textInput = str;
        this.$isSentMessage = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastMessagesActivityViewModel$leaveBroadcastPage$1(this.this$0, this.$textInput, this.$isSentMessage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BroadcastMessagesActivityViewModel$leaveBroadcastPage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C35772oDc c35772oDc;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    c35772oDc = (C35772oDc) obj;
                    if (c35772oDc == null) {
                        MutableSharedFlow mutableSharedFlow = this.this$0.AEQbTJ;
                        this.label = 3;
                        if (mutableSharedFlow.emit(c35772oDc, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        MutableSharedFlow mutableSharedFlow2 = this.this$0.KWHzl;
                        Unit unit = Unit.INSTANCE;
                        this.label = 4;
                        if (mutableSharedFlow2.emit(unit, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            C35774oDe c35774oDeEZpvd = this.this$0.AhwBna.EZpvd(this.$textInput);
            if (c35774oDeEZpvd != null) {
                MutableSharedFlow mutableSharedFlow3 = this.this$0.copydefault;
                this.label = 1;
                if (mutableSharedFlow3.emit(c35774oDeEZpvd, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                oCT oct = this.this$0.djBIcL;
                String str = this.$textInput;
                boolean z = this.$isSentMessage;
                this.label = 2;
                obj = oct.EZpvd(str, z, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                c35772oDc = (C35772oDc) obj;
                if (c35772oDc == null) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
