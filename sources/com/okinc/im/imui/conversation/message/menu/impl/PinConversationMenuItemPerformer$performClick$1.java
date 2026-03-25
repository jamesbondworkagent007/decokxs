package com.okinc.im.imui.conversation.message.menu.impl;

import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.sDN;
import o.sNF;

/* JADX INFO: loaded from: classes18.dex */
public final class PinConversationMenuItemPerformer$performClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isPinned;
    int label;
    final /* synthetic */ PinConversationMenuItemPerformer this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinConversationMenuItemPerformer$performClick$1(PinConversationMenuItemPerformer pinConversationMenuItemPerformer, boolean z, Continuation<? super PinConversationMenuItemPerformer$performClick$1> continuation) {
        super(2, continuation);
        this.this$0 = pinConversationMenuItemPerformer;
        this.$isPinned = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PinConversationMenuItemPerformer$performClick$1(this.this$0, this.$isPinned, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PinConversationMenuItemPerformer$performClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.this$0.OLrzqt().getConversationType() == OKConversationType.SYSTEM || this.this$0.OLrzqt().getConversationType() == OKConversationType.OrbitNotifications;
            CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
            PinConversationMenuItemPerformer$performClick$1$result$1 pinConversationMenuItemPerformer$performClick$1$result$1 = new PinConversationMenuItemPerformer$performClick$1$result$1(this.this$0, this.$isPinned, z, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcherCopydefault, pinConversationMenuItemPerformer$performClick$1$result$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        sNF.StateListAnimator stateListAnimator = (sNF.StateListAnimator) obj;
        if (stateListAnimator instanceof sNF.StateListAnimator.Application) {
            C44157sFk.KWHzl(((sNF.StateListAnimator.Application) stateListAnimator).OLrzqt());
        }
        return Unit.INSTANCE;
    }
}
