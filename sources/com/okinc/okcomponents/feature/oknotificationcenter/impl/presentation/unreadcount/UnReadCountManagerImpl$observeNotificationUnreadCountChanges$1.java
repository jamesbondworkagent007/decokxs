package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.unreadcount;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C43251rlk;
import o.C44629saY;
import o.C56391yDq;
import o.C56442yFn;
import o.rXE;

/* JADX INFO: loaded from: classes10.dex */
public final class UnReadCountManagerImpl$observeNotificationUnreadCountChanges$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44629saY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnReadCountManagerImpl$observeNotificationUnreadCountChanges$1(C44629saY c44629saY, Continuation<? super UnReadCountManagerImpl$observeNotificationUnreadCountChanges$1> continuation) {
        super(2, continuation);
        this.this$0 = c44629saY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnReadCountManagerImpl$observeNotificationUnreadCountChanges$1 unReadCountManagerImpl$observeNotificationUnreadCountChanges$1 = new UnReadCountManagerImpl$observeNotificationUnreadCountChanges$1(this.this$0, continuation);
        unReadCountManagerImpl$observeNotificationUnreadCountChanges$1.L$0 = obj;
        return unReadCountManagerImpl$observeNotificationUnreadCountChanges$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnReadCountManagerImpl$observeNotificationUnreadCountChanges$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C44629saY c44629saY = this.this$0;
                Result.Application application = Result.Companion;
                List listKWHzl = C43251rlk.KWHzl(rXE.class);
                rXE rxe = listKWHzl != null ? (rXE) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl) : null;
                if (rxe != null && rxe.OLrzqt()) {
                    Flow<Integer> flowEZpvd = rxe.EZpvd();
                    UnReadCountManagerImpl$observeNotificationUnreadCountChanges$1$1$1 unReadCountManagerImpl$observeNotificationUnreadCountChanges$1$1$1 = new UnReadCountManagerImpl$observeNotificationUnreadCountChanges$1$1$1(c44629saY, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowEZpvd, unReadCountManagerImpl$observeNotificationUnreadCountChanges$1$1$1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
