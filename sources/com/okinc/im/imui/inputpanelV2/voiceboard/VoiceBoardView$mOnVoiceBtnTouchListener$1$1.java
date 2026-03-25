package com.okinc.im.imui.inputpanelV2.voiceboard;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35259nru;

/* JADX INFO: loaded from: classes23.dex */
public final class VoiceBoardView$mOnVoiceBtnTouchListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC35259nru $callManager;
    final /* synthetic */ Ref.BooleanRef $isMicAvailable;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceBoardView$mOnVoiceBtnTouchListener$1$1(Ref.BooleanRef booleanRef, InterfaceC35259nru interfaceC35259nru, Continuation<? super VoiceBoardView$mOnVoiceBtnTouchListener$1$1> continuation) {
        super(2, continuation);
        this.$isMicAvailable = booleanRef;
        this.$callManager = interfaceC35259nru;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VoiceBoardView$mOnVoiceBtnTouchListener$1$1(this.$isMicAvailable, this.$callManager, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VoiceBoardView$mOnVoiceBtnTouchListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.BooleanRef booleanRef;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.BooleanRef booleanRef2 = this.$isMicAvailable;
            InterfaceC35259nru interfaceC35259nru = this.$callManager;
            this.L$0 = booleanRef2;
            this.label = 1;
            Object objEZpvd = interfaceC35259nru.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            booleanRef = booleanRef2;
            obj = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef = (Ref.BooleanRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        booleanRef.element = ((Boolean) obj).booleanValue();
        return Unit.INSTANCE;
    }
}
