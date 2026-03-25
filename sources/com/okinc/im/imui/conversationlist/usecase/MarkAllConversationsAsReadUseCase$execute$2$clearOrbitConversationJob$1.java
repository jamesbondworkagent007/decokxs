package com.okinc.im.imui.conversationlist.usecase;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33842nHw;
import o.C56391yDq;
import o.C56442yFn;
import o.oCD;

/* JADX INFO: loaded from: classes18.dex */
public final class MarkAllConversationsAsReadUseCase$execute$2$clearOrbitConversationJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    int label;
    final /* synthetic */ C33842nHw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkAllConversationsAsReadUseCase$execute$2$clearOrbitConversationJob$1(C33842nHw c33842nHw, Continuation<? super MarkAllConversationsAsReadUseCase$execute$2$clearOrbitConversationJob$1> continuation) {
        super(2, continuation);
        this.this$0 = c33842nHw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarkAllConversationsAsReadUseCase$execute$2$clearOrbitConversationJob$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((MarkAllConversationsAsReadUseCase$execute$2$clearOrbitConversationJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8700invokegIAlus$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oCD ocd = this.this$0.EZpvd;
            this.label = 1;
            objM8700invokegIAlus$default = oCD.m8700invokegIAlus$default(ocd, false, this, 1, null);
            if (objM8700invokegIAlus$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8700invokegIAlus$default = ((Result) obj).m7386unboximpl();
        }
        return Result.m7376boximpl(objM8700invokegIAlus$default);
    }
}
