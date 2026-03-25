package com.okinc.im.imui.conversation.message.menu.impl;

import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sGF;
import o.sNF;

/* JADX INFO: loaded from: classes18.dex */
public final class DisturbConversationMenuItemPerformer$performClick$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super sNF.Application>, Object> {
    final /* synthetic */ boolean $isNoDisturb;
    int label;
    final /* synthetic */ DisturbConversationMenuItemPerformer this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisturbConversationMenuItemPerformer$performClick$1$result$1(DisturbConversationMenuItemPerformer disturbConversationMenuItemPerformer, boolean z, Continuation<? super DisturbConversationMenuItemPerformer$performClick$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = disturbConversationMenuItemPerformer;
        this.$isNoDisturb = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DisturbConversationMenuItemPerformer$performClick$1$result$1(this.this$0, this.$isNoDisturb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super sNF.Application> continuation) {
        return ((DisturbConversationMenuItemPerformer$performClick$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sGF sgfKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU == null || (sgfKWHzl = interfaceC35180nqU.KWHzl()) == null) {
                return null;
            }
            OKConversation oKConversationOLrzqt = this.this$0.OLrzqt();
            boolean z = this.$isNoDisturb;
            this.label = 1;
            obj = sgfKWHzl.AEQbTJ(oKConversationOLrzqt, true ^ z, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return (sNF.Application) obj;
    }
}
