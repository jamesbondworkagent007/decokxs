package com.okinc.im.imui.group.messages.inhouse;

import com.okinc.okimcore.model.im.UpdateGroupMemberMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.nLO;
import o.sDN;

/* JADX INFO: loaded from: classes18.dex */
public final class UpdateGroupMemberMessageViewProvider$onBindGroupNotificationMessage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UpdateGroupMemberMessage $content;
    final /* synthetic */ nLO $this_run;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UpdateGroupMemberMessageViewProvider this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateGroupMemberMessageViewProvider$onBindGroupNotificationMessage$1$1(UpdateGroupMemberMessageViewProvider updateGroupMemberMessageViewProvider, UpdateGroupMemberMessage updateGroupMemberMessage, nLO nlo, Continuation<? super UpdateGroupMemberMessageViewProvider$onBindGroupNotificationMessage$1$1> continuation) {
        super(2, continuation);
        this.this$0 = updateGroupMemberMessageViewProvider;
        this.$content = updateGroupMemberMessage;
        this.$this_run = nlo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UpdateGroupMemberMessageViewProvider$onBindGroupNotificationMessage$1$1 updateGroupMemberMessageViewProvider$onBindGroupNotificationMessage$1$1 = new UpdateGroupMemberMessageViewProvider$onBindGroupNotificationMessage$1$1(this.this$0, this.$content, this.$this_run, continuation);
        updateGroupMemberMessageViewProvider$onBindGroupNotificationMessage$1$1.L$0 = obj;
        return updateGroupMemberMessageViewProvider$onBindGroupNotificationMessage$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UpdateGroupMemberMessageViewProvider$onBindGroupNotificationMessage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, sDN.copydefault.AEQbTJ(), null, new AnonymousClass1(this.$this_run, this.this$0.KWHzl(this.$content), null), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.group.messages.inhouse.UpdateGroupMemberMessageViewProvider$onBindGroupNotificationMessage$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CharSequence $displayText;
        final /* synthetic */ nLO $this_run;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(nLO nlo, CharSequence charSequence, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_run = nlo;
            this.$displayText = charSequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_run, this.$displayText, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$this_run.copydefault.setText(this.$displayText);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
