package com.okinc.im.imui.conversation.message.menu.impl;

import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sGF;

/* JADX INFO: loaded from: classes18.dex */
public final class DeleteConversationMenuItemPerformer$performClick$deleteAction$1$1$1$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ InterfaceC35180nqU $okimService;
    int label;
    final /* synthetic */ DeleteConversationMenuItemPerformer this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteConversationMenuItemPerformer$performClick$deleteAction$1$1$1$1$result$1(InterfaceC35180nqU interfaceC35180nqU, DeleteConversationMenuItemPerformer deleteConversationMenuItemPerformer, Continuation<? super DeleteConversationMenuItemPerformer$performClick$deleteAction$1$1$1$1$result$1> continuation) {
        super(2, continuation);
        this.$okimService = interfaceC35180nqU;
        this.this$0 = deleteConversationMenuItemPerformer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeleteConversationMenuItemPerformer$performClick$deleteAction$1$1$1$1$result$1(this.$okimService, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Boolean>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Boolean>> continuation) {
        return ((DeleteConversationMenuItemPerformer$performClick$deleteAction$1$1$1$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sGF sgfKWHzl = this.$okimService.KWHzl();
            OKConversation oKConversationOLrzqt = this.this$0.OLrzqt();
            this.label = 1;
            objCopydefault = sgfKWHzl.copydefault(oKConversationOLrzqt, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        return Result.m7376boximpl(objCopydefault);
    }
}
