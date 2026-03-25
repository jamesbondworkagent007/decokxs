package com.okinc.im.imui.group.messages.recallnotification;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC44111sDt;
import o.AbstractC44117sDz;
import o.C35254nrp;
import o.C56391yDq;
import o.C56442yFn;
import o.nYY;
import o.oAC;
import o.sDN;

/* JADX INFO: loaded from: classes18.dex */
public final class RecallNotificationReceiveMessageViewProvider$onBindMessageContentView$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ oAC<AbstractC44111sDt, AbstractC44117sDz> $holder;
    final /* synthetic */ C35254nrp $item;
    final /* synthetic */ AbstractC44117sDz $this_run;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecallNotificationReceiveMessageViewProvider$onBindMessageContentView$2$1(oAC<AbstractC44111sDt, AbstractC44117sDz> oac, C35254nrp c35254nrp, AbstractC44117sDz abstractC44117sDz, Continuation<? super RecallNotificationReceiveMessageViewProvider$onBindMessageContentView$2$1> continuation) {
        super(2, continuation);
        this.$holder = oac;
        this.$item = c35254nrp;
        this.$this_run = abstractC44117sDz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecallNotificationReceiveMessageViewProvider$onBindMessageContentView$2$1 recallNotificationReceiveMessageViewProvider$onBindMessageContentView$2$1 = new RecallNotificationReceiveMessageViewProvider$onBindMessageContentView$2$1(this.$holder, this.$item, this.$this_run, continuation);
        recallNotificationReceiveMessageViewProvider$onBindMessageContentView$2$1.L$0 = obj;
        return recallNotificationReceiveMessageViewProvider$onBindMessageContentView$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecallNotificationReceiveMessageViewProvider$onBindMessageContentView$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            nYY nyy = nYY.KWHzl;
            Context context = this.$holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, sDN.copydefault.AEQbTJ(), null, new AnonymousClass1(this.$this_run, nyy.EZpvd(context, this.$item.OLrzqt()), null), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.group.messages.recallnotification.RecallNotificationReceiveMessageViewProvider$onBindMessageContentView$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $displayText;
        final /* synthetic */ AbstractC44117sDz $this_run;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC44117sDz abstractC44117sDz, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_run = abstractC44117sDz;
            this.$displayText = str;
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
                this.$this_run.EZpvd.setText(this.$displayText);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
