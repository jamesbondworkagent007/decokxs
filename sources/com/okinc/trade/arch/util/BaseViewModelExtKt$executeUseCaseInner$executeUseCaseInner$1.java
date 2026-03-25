package com.okinc.trade.arch.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class BaseViewModelExtKt$executeUseCaseInner$executeUseCaseInner$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Throwable, Continuation<? super Unit>, Object> $onFailure;
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $onLoading;
    final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $onSuccess;
    final /* synthetic */ Function1<Continuation<? super T>, Object> $onUseCase;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelExtKt$executeUseCaseInner$executeUseCaseInner$1(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Function1<? super Continuation<? super T>, ? extends Object> function12, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super BaseViewModelExtKt$executeUseCaseInner$executeUseCaseInner$1> continuation) {
        super(2, continuation);
        this.$onLoading = function1;
        this.$onUseCase = function12;
        this.$onSuccess = function2;
        this.$onFailure = function22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseViewModelExtKt$executeUseCaseInner$executeUseCaseInner$1 baseViewModelExtKt$executeUseCaseInner$executeUseCaseInner$1 = new BaseViewModelExtKt$executeUseCaseInner$executeUseCaseInner$1(this.$onLoading, this.$onUseCase, this.$onSuccess, this.$onFailure, continuation);
        baseViewModelExtKt$executeUseCaseInner$executeUseCaseInner$1.L$0 = obj;
        return baseViewModelExtKt$executeUseCaseInner$executeUseCaseInner$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseViewModelExtKt$executeUseCaseInner$executeUseCaseInner$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseInner$executeUseCaseInner$1 for r6v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r6.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L33
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L27
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            o.C56391yDq.AEQbTJ(r7)
            goto L8e
        L19:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L21:
            java.lang.Object r1 = r6.L$0
            o.C56391yDq.AEQbTJ(r7)
            goto L7b
        L27:
            o.C56391yDq.AEQbTJ(r7)     // Catch: java.lang.Throwable -> L5c
            goto L57
        L2b:
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            o.C56391yDq.AEQbTJ(r7)
            goto L47
        L33:
            o.C56391yDq.AEQbTJ(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r6.$onLoading
            r6.L$0 = r7
            r6.label = r5
            java.lang.Object r7 = r1.invoke(r6)
            if (r7 != r0) goto L47
            return r0
        L47:
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> r7 = r6.$onUseCase
            kotlin.Result$Application r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L5c
            r1 = 0
            r6.L$0 = r1     // Catch: java.lang.Throwable -> L5c
            r6.label = r4     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L5c
            if (r7 != r0) goto L57
            return r0
        L57:
            java.lang.Object r7 = kotlin.Result.m7377constructorimpl(r7)     // Catch: java.lang.Throwable -> L5c
            goto L67
        L5c:
            r7 = move-exception
            kotlin.Result$Application r1 = kotlin.Result.Companion
            java.lang.Object r7 = o.C56391yDq.EZpvd(r7)
            java.lang.Object r7 = kotlin.Result.m7377constructorimpl(r7)
        L67:
            r1 = r7
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r7 = r6.$onSuccess
            boolean r4 = kotlin.Result.m7384isSuccessimpl(r1)
            if (r4 == 0) goto L7b
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r7.invoke(r1, r6)
            if (r7 != r0) goto L7b
            return r0
        L7b:
            kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r7 = r6.$onFailure
            java.lang.Throwable r3 = kotlin.Result.m7380exceptionOrNullimpl(r1)
            if (r3 == 0) goto L8e
            r6.L$0 = r1
            r6.label = r2
            java.lang.Object r7 = r7.invoke(r3, r6)
            if (r7 != r0) goto L8e
            return r0
        L8e:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseInner$executeUseCaseInner$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
