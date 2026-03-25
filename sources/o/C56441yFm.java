package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56532yIw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yFm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56441yFm {
    public static <R, T> java.lang.Object OLrzqt(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends java.lang.Object> function2, R r, @NotNull Continuation<? super T> continuation) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(continuation, "");
        return ((Function2) C56532yIw.KWHzl(function2, 2)).invoke(r, copydefault(C56447yFs.EZpvd(continuation)));
    }

    public static <R, P, T> java.lang.Object copydefault(@NotNull yHO<? super R, ? super P, ? super Continuation<? super T>, ? extends java.lang.Object> yho, R r, P p, @NotNull Continuation<? super T> continuation) {
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(continuation, "");
        return ((yHO) C56532yIw.KWHzl(yho, 3)).invoke(r, p, copydefault(C56447yFs.EZpvd(continuation)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Continuation<Unit> EZpvd(@NotNull final Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1, @NotNull Continuation<? super T> continuation) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(continuation, "");
        final Continuation<?> continuationEZpvd = C56447yFs.EZpvd(continuation);
        if (function1 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function1).create(continuationEZpvd);
        }
        final CoroutineContext context = continuationEZpvd.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new RestrictedContinuationImpl(continuationEZpvd, function1) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
                final /* synthetic */ Function1 $this_createCoroutineUnintercepted$inlined;
                private int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(continuationEZpvd);
                    this.$this_createCoroutineUnintercepted$inlined = function1;
                    Intrinsics.copydefault(continuationEZpvd, "");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public Object invokeSuspend(Object obj) throws Throwable {
                    int i = this.label;
                    if (i == 0) {
                        this.label = 1;
                        C56391yDq.AEQbTJ(obj);
                        Intrinsics.copydefault(this.$this_createCoroutineUnintercepted$inlined, "");
                        return ((Function1) C56532yIw.KWHzl(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
                    }
                    if (i == 1) {
                        this.label = 2;
                        C56391yDq.AEQbTJ(obj);
                        return obj;
                    }
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
            };
        }
        return new ContinuationImpl(continuationEZpvd, context, function1) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
            final /* synthetic */ Function1 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(continuationEZpvd, context);
                this.$this_createCoroutineUnintercepted$inlined = function1;
                Intrinsics.copydefault(continuationEZpvd, "");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    C56391yDq.AEQbTJ(obj);
                    Intrinsics.copydefault(this.$this_createCoroutineUnintercepted$inlined, "");
                    return ((Function1) C56532yIw.KWHzl(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
                }
                if (i == 1) {
                    this.label = 2;
                    C56391yDq.AEQbTJ(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        };
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> Continuation<Unit> KWHzl(@NotNull final Function2<? super R, ? super Continuation<? super T>, ? extends java.lang.Object> function2, final R r, @NotNull Continuation<? super T> continuation) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(continuation, "");
        final Continuation<?> continuationEZpvd = C56447yFs.EZpvd(continuation);
        if (function2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function2).create(r, continuationEZpvd);
        }
        final CoroutineContext context = continuationEZpvd.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new RestrictedContinuationImpl(continuationEZpvd, function2, r) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
                final /* synthetic */ Object $receiver$inlined;
                final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
                private int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(continuationEZpvd);
                    this.$this_createCoroutineUnintercepted$inlined = function2;
                    this.$receiver$inlined = r;
                    Intrinsics.copydefault(continuationEZpvd, "");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public Object invokeSuspend(Object obj) throws Throwable {
                    int i = this.label;
                    if (i == 0) {
                        this.label = 1;
                        C56391yDq.AEQbTJ(obj);
                        Intrinsics.copydefault(this.$this_createCoroutineUnintercepted$inlined, "");
                        return ((Function2) C56532yIw.KWHzl(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
                    }
                    if (i == 1) {
                        this.label = 2;
                        C56391yDq.AEQbTJ(obj);
                        return obj;
                    }
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
            };
        }
        return new ContinuationImpl(continuationEZpvd, context, function2, r) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(continuationEZpvd, context);
                this.$this_createCoroutineUnintercepted$inlined = function2;
                this.$receiver$inlined = r;
                Intrinsics.copydefault(continuationEZpvd, "");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    C56391yDq.AEQbTJ(obj);
                    Intrinsics.copydefault(this.$this_createCoroutineUnintercepted$inlined, "");
                    return ((Function2) C56532yIw.KWHzl(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
                }
                if (i == 1) {
                    this.label = 2;
                    C56391yDq.AEQbTJ(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        };
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Continuation<T> OLrzqt(@NotNull Continuation<? super T> continuation) {
        Continuation<T> continuation2;
        Intrinsics.checkNotNullParameter(continuation, "");
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        return (continuationImpl == null || (continuation2 = (Continuation<T>) continuationImpl.intercepted()) == null) ? continuation : continuation2;
    }

    public static final <T> Continuation<T> copydefault(final Continuation<? super T> continuation) {
        final CoroutineContext context = continuation.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new RestrictedContinuationImpl(continuation) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(continuation);
                    Intrinsics.copydefault(continuation, "");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public Object invokeSuspend(Object obj) throws Throwable {
                    C56391yDq.AEQbTJ(obj);
                    return obj;
                }
            };
        }
        return new ContinuationImpl(continuation, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(continuation, context);
                Intrinsics.copydefault(continuation, "");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                C56391yDq.AEQbTJ(obj);
                return obj;
            }
        };
    }
}
