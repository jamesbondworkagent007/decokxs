package com.okinc.okimcore.feature.conversation.refresh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C43296rmc;
import o.C56391yDq;
import o.C56442yFn;
import o.sDN;
import o.sDZ;
import o.sGF;
import o.sGP;

/* JADX INFO: loaded from: classes10.dex */
public final class ConversationRefreshUseCaseImpl$refreshAllIMUnReadMsgCount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ sGP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationRefreshUseCaseImpl$refreshAllIMUnReadMsgCount$1(sGP sgp, Continuation<? super ConversationRefreshUseCaseImpl$refreshAllIMUnReadMsgCount$1> continuation) {
        super(2, continuation);
        this.this$0 = sgp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationRefreshUseCaseImpl$refreshAllIMUnReadMsgCount$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationRefreshUseCaseImpl$refreshAllIMUnReadMsgCount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sGF sgfAYXKKw = sDZ.AEQbTJ.AYXKKw();
            this.label = 1;
            obj = sgfAYXKKw.djBIcL(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        C43296rmc.AEQbTJ("ConversationRefreshUseCaseImpl", "refreshAllIMUnReadMsgCount => imUnreadCount=" + iIntValue);
        MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, iIntValue, null);
        this.label = 2;
        if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.okimcore.feature.conversation.refresh.ConversationRefreshUseCaseImpl$refreshAllIMUnReadMsgCount$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $imUnreadCount;
        int label;
        final /* synthetic */ sGP this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(sGP sgp, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = sgp;
            this.$imUnreadCount = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$imUnreadCount, continuation);
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
                this.this$0.KWHzl.OLrzqt(this.$imUnreadCount);
                this.this$0.KWHzl.copydefault(this.$imUnreadCount);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
