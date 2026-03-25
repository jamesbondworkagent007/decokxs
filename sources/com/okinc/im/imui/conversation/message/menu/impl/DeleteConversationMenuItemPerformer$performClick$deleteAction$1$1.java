package com.okinc.im.imui.conversation.message.menu.impl;

import android.graphics.drawable.Drawable;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C43251rlk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sDN;

/* JADX INFO: loaded from: classes18.dex */
public final class DeleteConversationMenuItemPerformer$performClick$deleteAction$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $baseActivity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DeleteConversationMenuItemPerformer this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteConversationMenuItemPerformer$performClick$deleteAction$1$1(AbstractActivityC33041mov abstractActivityC33041mov, DeleteConversationMenuItemPerformer deleteConversationMenuItemPerformer, Continuation<? super DeleteConversationMenuItemPerformer$performClick$deleteAction$1$1> continuation) {
        super(2, continuation);
        this.$baseActivity = abstractActivityC33041mov;
        this.this$0 = deleteConversationMenuItemPerformer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DeleteConversationMenuItemPerformer$performClick$deleteAction$1$1 deleteConversationMenuItemPerformer$performClick$deleteAction$1$1 = new DeleteConversationMenuItemPerformer$performClick$deleteAction$1$1(this.$baseActivity, this.this$0, continuation);
        deleteConversationMenuItemPerformer$performClick$deleteAction$1$1.L$0 = obj;
        return deleteConversationMenuItemPerformer$performClick$deleteAction$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeleteConversationMenuItemPerformer$performClick$deleteAction$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractActivityC33041mov abstractActivityC33041mov;
        AbstractActivityC33041mov abstractActivityC33041mov2;
        Object objM7377constructorimpl;
        String message;
        Throwable thM7380exceptionOrNullimpl;
        String message2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU != null) {
                abstractActivityC33041mov = this.$baseActivity;
                DeleteConversationMenuItemPerformer deleteConversationMenuItemPerformer = this.this$0;
                abstractActivityC33041mov.showLoading();
                try {
                    Result.Application application = Result.Companion;
                    CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
                    DeleteConversationMenuItemPerformer$performClick$deleteAction$1$1$1$1$result$1 deleteConversationMenuItemPerformer$performClick$deleteAction$1$1$1$1$result$1 = new DeleteConversationMenuItemPerformer$performClick$deleteAction$1$1$1$1$result$1(interfaceC35180nqU, deleteConversationMenuItemPerformer, null);
                    this.L$0 = abstractActivityC33041mov;
                    this.label = 1;
                    obj = BuildersKt.withContext(coroutineDispatcherCopydefault, deleteConversationMenuItemPerformer$performClick$deleteAction$1$1$1$1$result$1, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractActivityC33041mov2 = abstractActivityC33041mov;
                } catch (Throwable th) {
                    th = th;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    abstractActivityC33041mov2 = abstractActivityC33041mov;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        abstractActivityC33041mov2 = (AbstractActivityC33041mov) this.L$0;
        try {
            C56391yDq.AEQbTJ(obj);
        } catch (Throwable th2) {
            th = th2;
            abstractActivityC33041mov = abstractActivityC33041mov2;
            Result.Application application22 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            abstractActivityC33041mov2 = abstractActivityC33041mov;
        }
        Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
        if (Result.m7383isFailureimpl(objM7386unboximpl) && (thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl)) != null && (message2 = thM7380exceptionOrNullimpl.getMessage()) != null) {
            C55326xho.toast$default(message2, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl2 != null && (message = thM7380exceptionOrNullimpl2.getMessage()) != null) {
            C55326xho.toast$default(message, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
        abstractActivityC33041mov2.dismissLoading();
        return Unit.INSTANCE;
    }
}
