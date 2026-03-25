package uniffi;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public final class UniFFICommonKt$uniffiTraitInterfaceCallAsyncWithError$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<UniffiRustCallStatus.ByValue, Unit> $handleError;
    final /* synthetic */ Function1<T, Unit> $handleSuccess;
    final /* synthetic */ Function1<E, RustBuffer.ByValue> $lowerError;
    final /* synthetic */ Function1<Continuation<? super T>, Object> $makeCall;
    final /* synthetic */ RustBuffer $rustBuffer;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super uniffi.UniffiRustCallStatus$ByValue, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super E, uniffi.RustBuffer$ByValue> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UniFFICommonKt$uniffiTraitInterfaceCallAsyncWithError$job$1(Function1<? super T, Unit> function1, Function1<? super Continuation<? super T>, ? extends Object> function12, Function1<? super UniffiRustCallStatus.ByValue, Unit> function13, RustBuffer rustBuffer, Function1<? super E, RustBuffer.ByValue> function14, Continuation<? super UniFFICommonKt$uniffiTraitInterfaceCallAsyncWithError$job$1> continuation) {
        super(2, continuation);
        this.$handleSuccess = function1;
        this.$makeCall = function12;
        this.$handleError = function13;
        this.$rustBuffer = rustBuffer;
        this.$lowerError = function14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UniFFICommonKt$uniffiTraitInterfaceCallAsyncWithError$job$1(this.$handleSuccess, this.$makeCall, this.$handleError, this.$rustBuffer, this.$lowerError, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UniFFICommonKt$uniffiTraitInterfaceCallAsyncWithError$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to uniffi.UniFFICommonKt$uniffiTraitInterfaceCallAsyncWithError$job$1 for r5v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r5.L$0
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            o.C56391yDq.AEQbTJ(r6)     // Catch: java.lang.Exception -> L33
            goto L2f
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            o.C56391yDq.AEQbTJ(r6)
            kotlin.jvm.functions.Function1<T, kotlin.Unit> r6 = r5.$handleSuccess     // Catch: java.lang.Exception -> L33
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> r1 = r5.$makeCall     // Catch: java.lang.Exception -> L33
            r5.L$0 = r6     // Catch: java.lang.Exception -> L33
            r5.label = r2     // Catch: java.lang.Exception -> L33
            java.lang.Object r1 = r1.invoke(r5)     // Catch: java.lang.Exception -> L33
            if (r1 != r0) goto L2d
            return r0
        L2d:
            r0 = r6
            r6 = r1
        L2f:
            r0.invoke(r6)     // Catch: java.lang.Exception -> L33
            goto L53
        L33:
            r6 = move-exception
            r0 = 3
            java.lang.String r1 = "E"
            kotlin.jvm.internal.Intrinsics.KWHzl(r0, r1)
            kotlin.jvm.functions.Function1<uniffi.UniffiRustCallStatus$ByValue, kotlin.Unit> r0 = r5.$handleError
            uniffi.UniffiRustCallStatus$ActionBar r1 = uniffi.UniffiRustCallStatus.Companion
            uniffi.RustBuffer r3 = r5.$rustBuffer
            o.zxk r3 = r3.getRustBufferOp()
            kotlin.jvm.functions.Function1<E, uniffi.RustBuffer$ByValue> r4 = r5.$lowerError
            java.lang.Object r6 = r4.invoke(r6)
            uniffi.RustBuffer$ByValue r6 = (uniffi.RustBuffer.ByValue) r6
            uniffi.UniffiRustCallStatus$ByValue r6 = r1.EZpvd(r3, r2, r6)
            r0.invoke(r6)
        L53:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uniffi.UniFFICommonKt$uniffiTraitInterfaceCallAsyncWithError$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to uniffi.UniFFICommonKt$uniffiTraitInterfaceCallAsyncWithError$job$1 for r4v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.jvm.functions.Function1<T, kotlin.Unit> r5 = r4.$handleSuccess     // Catch: java.lang.Exception -> Lc
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> r0 = r4.$makeCall     // Catch: java.lang.Exception -> Lc
            java.lang.Object r0 = r0.invoke(r4)     // Catch: java.lang.Exception -> Lc
            r5.invoke(r0)     // Catch: java.lang.Exception -> Lc
            goto L2d
        Lc:
            r5 = move-exception
            r0 = 3
            java.lang.String r1 = "E"
            kotlin.jvm.internal.Intrinsics.KWHzl(r0, r1)
            kotlin.jvm.functions.Function1<uniffi.UniffiRustCallStatus$ByValue, kotlin.Unit> r0 = r4.$handleError
            uniffi.UniffiRustCallStatus$ActionBar r1 = uniffi.UniffiRustCallStatus.Companion
            uniffi.RustBuffer r2 = r4.$rustBuffer
            o.zxk r2 = r2.getRustBufferOp()
            kotlin.jvm.functions.Function1<E, uniffi.RustBuffer$ByValue> r3 = r4.$lowerError
            java.lang.Object r5 = r3.invoke(r5)
            uniffi.RustBuffer$ByValue r5 = (uniffi.RustBuffer.ByValue) r5
            r3 = 1
            uniffi.UniffiRustCallStatus$ByValue r5 = r1.EZpvd(r2, r3, r5)
            r0.invoke(r5)
        L2d:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uniffi.UniFFICommonKt$uniffiTraitInterfaceCallAsyncWithError$job$1.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
    }
}
