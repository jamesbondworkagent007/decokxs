package com.okinc.okimcore.feature.message.utility;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.sDN;
import o.sMU;

/* JADX INFO: loaded from: classes10.dex */
public final class TaskQueue$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ sMU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$init$1(sMU smu, Continuation<? super TaskQueue$init$1> continuation) {
        super(2, continuation);
        this.this$0 = smu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TaskQueue$init$1 taskQueue$init$1 = new TaskQueue$init$1(this.this$0, continuation);
        taskQueue$init$1.L$0 = obj;
        return taskQueue$init$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TaskQueue$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:40:0x00a1) to fix multi-entry loop: BACK_EDGE: B:40:0x00a1 -> B:21:0x004c */
    /* JADX WARN: Can't wrap try/catch for region: R(11:7|(2:51|8)|13|53|36|21|(2:23|(1:25)(9:26|27|28|(2:30|(1:32))(2:33|(1:35))|13|53|36|21|(1:43)(0)))(0)|46|(1:48)|49|50) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x004c, code lost:
    
        r7 = kotlin.Result.Companion;
        kotlin.Result.m7377constructorimpl(o.C56391yDq.EZpvd(r6));
        r11 = r11;
        r1 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:21:0x004c, B:23:0x0052, B:27:0x0067, B:43:0x00af, B:40:0x00a1, B:17:0x003d, B:20:0x004a), top: B:55:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:8:0x001a, B:28:0x0069, B:30:0x0071, B:33:0x0089), top: B:51:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:8:0x001a, B:28:0x0069, B:30:0x0071, B:33:0x0089), top: B:51:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #2 {all -> 0x00ad, blocks: (B:21:0x004c, B:23:0x0052, B:27:0x0067, B:43:0x00af, B:40:0x00a1, B:17:0x003d, B:20:0x004a), top: B:55:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0086 -> B:13:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0093 -> B:13:0x002f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        CoroutineScope coroutineScope;
        sMU smu;
        sMU smu2;
        CoroutineScope coroutineScope2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            smu = this.this$0;
            Result.Application application2 = Result.Companion;
            if (CoroutineScopeKt.isActive(coroutineScope)) {
            }
            sMU smu3 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            coroutineScope2 = (CoroutineScope) this.L$1;
            smu2 = (sMU) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Function2 function2 = (Function2) obj;
            Result.Application application3 = Result.Companion;
            if (!smu2.OLrzqt) {
            }
            coroutineScope = coroutineScope2;
            smu = smu2;
            Result.m7377constructorimpl(Unit.INSTANCE);
            if (CoroutineScopeKt.isActive(coroutineScope)) {
            }
            sMU smu32 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        if (i != 2 && i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        coroutineScope2 = (CoroutineScope) this.L$1;
        smu2 = (sMU) this.L$0;
        try {
            C56391yDq.AEQbTJ(obj);
        } catch (Throwable th2) {
            Result.Application application4 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            coroutineScope = coroutineScope2;
            smu = smu2;
            if (CoroutineScopeKt.isActive(coroutineScope)) {
            }
            sMU smu322 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        coroutineScope = coroutineScope2;
        smu = smu2;
        Result.m7377constructorimpl(Unit.INSTANCE);
        if (CoroutineScopeKt.isActive(coroutineScope)) {
            Channel channel = smu.KWHzl;
            this.L$0 = smu;
            this.L$1 = coroutineScope;
            this.label = 1;
            Object objReceive = channel.receive(this);
            if (objReceive == objCopydefault) {
                return objCopydefault;
            }
            sMU smu4 = smu;
            coroutineScope2 = coroutineScope;
            obj = objReceive;
            smu2 = smu4;
            Function2 function22 = (Function2) obj;
            Result.Application application32 = Result.Companion;
            if (!smu2.OLrzqt) {
                CoroutineDispatcher coroutineDispatcherOLrzqt = sDN.copydefault.OLrzqt();
                TaskQueue$init$1$1$1$1 taskQueue$init$1$1$1$1 = new TaskQueue$init$1$1$1$1(function22, null);
                this.L$0 = smu2;
                this.L$1 = coroutineScope2;
                this.label = 2;
                if (BuildersKt.withContext(coroutineDispatcherOLrzqt, taskQueue$init$1$1$1$1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                this.L$0 = smu2;
                this.L$1 = coroutineScope2;
                this.label = 3;
                if (function22.invoke(coroutineScope2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            coroutineScope = coroutineScope2;
            smu = smu2;
            Result.m7377constructorimpl(Unit.INSTANCE);
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            }
        }
        sMU smu3222 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.imLogSync$default(smu3222.valueOf + " => task queue failed", thM7380exceptionOrNullimpl, null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
