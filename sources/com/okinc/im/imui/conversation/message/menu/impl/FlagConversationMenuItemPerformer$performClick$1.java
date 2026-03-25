package com.okinc.im.imui.conversation.message.menu.impl;

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
public final class FlagConversationMenuItemPerformer$performClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFlagged;
    int label;
    final /* synthetic */ FlagConversationMenuItemPerformer this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagConversationMenuItemPerformer$performClick$1(FlagConversationMenuItemPerformer flagConversationMenuItemPerformer, boolean z, Continuation<? super FlagConversationMenuItemPerformer$performClick$1> continuation) {
        super(2, continuation);
        this.this$0 = flagConversationMenuItemPerformer;
        this.$isFlagged = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlagConversationMenuItemPerformer$performClick$1(this.this$0, this.$isFlagged, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlagConversationMenuItemPerformer$performClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
            FlagConversationMenuItemPerformer$performClick$1$result$1 flagConversationMenuItemPerformer$performClick$1$result$1 = new FlagConversationMenuItemPerformer$performClick$1$result$1(this.this$0, this.$isFlagged, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcherCopydefault, flagConversationMenuItemPerformer$performClick$1$result$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        sNF.ActionBar actionBar = (sNF.ActionBar) obj;
        if (actionBar instanceof sNF.ActionBar.C0939ActionBar) {
            C44157sFk.KWHzl(((sNF.ActionBar.C0939ActionBar) actionBar).copydefault());
        }
        return Unit.INSTANCE;
    }
}
