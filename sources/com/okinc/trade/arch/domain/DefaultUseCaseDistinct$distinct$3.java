package com.okinc.trade.arch.domain;

import com.okinc.trade.arch.domain.IUseCaseDistinct;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import o.C49406unu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes11.dex */
public final class DefaultUseCaseDistinct$distinct$3<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
    final /* synthetic */ IUseCaseDistinct.DistinctStrategy $strategy;
    final /* synthetic */ Function1<Continuation<? super R>, Object> $this_distinct;
    final /* synthetic */ String $trackingId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C49406unu<R> this$0;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[IUseCaseDistinct.DistinctStrategy.values().length];
            try {
                iArr[IUseCaseDistinct.DistinctStrategy.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IUseCaseDistinct.DistinctStrategy.OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IUseCaseDistinct.DistinctStrategy.STRICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultUseCaseDistinct$distinct$3(IUseCaseDistinct.DistinctStrategy distinctStrategy, C49406unu<R> c49406unu, String str, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super DefaultUseCaseDistinct$distinct$3> continuation) {
        super(2, continuation);
        this.$strategy = distinctStrategy;
        this.this$0 = c49406unu;
        this.$trackingId = str;
        this.$this_distinct = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultUseCaseDistinct$distinct$3 defaultUseCaseDistinct$distinct$3 = new DefaultUseCaseDistinct$distinct$3(this.$strategy, this.this$0, this.$trackingId, this.$this_distinct, continuation);
        defaultUseCaseDistinct$distinct$3.L$0 = obj;
        return defaultUseCaseDistinct$distinct$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
        return ((DefaultUseCaseDistinct$distinct$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            int i2 = TaskDescription.EZpvd[this.$strategy.ordinal()];
            if (i2 == 1) {
                C49406unu<R> c49406unu = this.this$0;
                String str = this.$trackingId;
                Function1<Continuation<? super R>, Object> function1 = this.$this_distinct;
                this.label = 1;
                obj = invokeSuspend$executeAndCache(coroutineScope, c49406unu, str, function1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else if (i2 == 2) {
                Deferred<R> deferred = this.this$0.KWHzl().get(this.$trackingId);
                if (deferred != null) {
                    Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
                }
                C49406unu<R> c49406unu2 = this.this$0;
                String str2 = this.$trackingId;
                Function1<Continuation<? super R>, Object> function12 = this.$this_distinct;
                this.label = 2;
                obj = invokeSuspend$executeAndCache(coroutineScope, c49406unu2, str2, function12, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.this$0.KWHzl().containsKey(this.$trackingId)) {
                    throw new IUseCaseDistinct.RedundantExecutionException("Closure[" + this.$trackingId + "] is still executing.");
                }
                C49406unu<R> c49406unu3 = this.this$0;
                String str3 = this.$trackingId;
                Function1<Continuation<? super R>, Object> function13 = this.$this_distinct;
                this.label = 3;
                obj = invokeSuspend$executeAndCache(coroutineScope, c49406unu3, str3, function13, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> Object invokeSuspend$executeAndCache(CoroutineScope coroutineScope, C49406unu<R> c49406unu, String str, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) throws Throwable {
        DefaultUseCaseDistinct$distinct$3$executeAndCache$1 defaultUseCaseDistinct$distinct$3$executeAndCache$1;
        if (continuation instanceof DefaultUseCaseDistinct$distinct$3$executeAndCache$1) {
            defaultUseCaseDistinct$distinct$3$executeAndCache$1 = (DefaultUseCaseDistinct$distinct$3$executeAndCache$1) continuation;
            int i = defaultUseCaseDistinct$distinct$3$executeAndCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultUseCaseDistinct$distinct$3$executeAndCache$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultUseCaseDistinct$distinct$3$executeAndCache$1 = new DefaultUseCaseDistinct$distinct$3$executeAndCache$1(continuation);
            }
        }
        Object objAwait = defaultUseCaseDistinct$distinct$3$executeAndCache$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = defaultUseCaseDistinct$distinct$3$executeAndCache$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Deferred<R> deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, CoroutineStart.LAZY, new DefaultUseCaseDistinct$distinct$3$executeAndCache$2(function1, null), 1, null);
                c49406unu.KWHzl().put(str, deferredAsync$default);
                defaultUseCaseDistinct$distinct$3$executeAndCache$1.L$0 = c49406unu;
                defaultUseCaseDistinct$distinct$3$executeAndCache$1.L$1 = str;
                defaultUseCaseDistinct$distinct$3$executeAndCache$1.label = 1;
                objAwait = deferredAsync$default.await(defaultUseCaseDistinct$distinct$3$executeAndCache$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) defaultUseCaseDistinct$distinct$3$executeAndCache$1.L$1;
                c49406unu = (C49406unu) defaultUseCaseDistinct$distinct$3$executeAndCache$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
            }
            return objAwait;
        } finally {
            c49406unu.KWHzl().remove(str);
        }
    }
}
