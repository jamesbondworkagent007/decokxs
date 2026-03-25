package o;

import android.os.Build;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import o.InterfaceC60177zxn;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniFFICommonKt$uniffiRustCallAsync$1;
import uniffi.UniFFICommonKt$uniffiTraitInterfaceCallAsync$job$1;
import uniffi.UniFFICommonKt$uniffiTraitInterfaceCallAsyncWithError$job$1;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.uniffiForeignFutureDroppedCallbackImpl;
import uniffi.uniffiRustFutureContinuationCallbackImpl;

/* JADX INFO: renamed from: o.zxj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60173zxj {
    public static final int IDX_CALLBACK_FREE = 0;
    public static final int UNIFFI_CALLBACK_ERROR = 1;
    public static final int UNIFFI_CALLBACK_SUCCESS = 0;
    public static final int UNIFFI_CALLBACK_UNEXPECTED_ERROR = 2;
    public static final byte UNIFFI_CALL_ERROR = 1;
    public static final byte UNIFFI_CALL_SUCCESS = 0;
    public static final byte UNIFFI_CALL_UNEXPECTED_ERROR = 2;
    public static final long UNIFFI_HANDLEMAP_DELTA = 2;
    public static final long UNIFFI_HANDLEMAP_INITIAL = 1;
    public static final byte UNIFFI_RUST_FUTURE_POLL_READY = 0;
    public static final byte UNIFFI_RUST_FUTURE_POLL_WAKE = 1;
    public static Function2<? super java.lang.String, ? super java.lang.Class<?>, Unit> afterRegister;
    public static Function2<? super java.lang.String, ? super java.lang.Class<?>, Unit> beforeRegister;
    public static Function1<? super java.lang.Throwable, Unit> unExceptionReport;
    public static final C60180zxq<CancellableContinuation<java.lang.Byte>> uniffiContinuationHandleMap = new C60180zxq<>();
    public static final C60180zxq<Job> uniffiForeignFutureHandleMap = new C60180zxq<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Class<?>, kotlin.Unit>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.Class<?>, kotlin.Unit> */
    public static final Function2<java.lang.String, java.lang.Class<?>, Unit> getAfterRegister() {
        return afterRegister;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Class<?>, kotlin.Unit>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.Class<?>, kotlin.Unit> */
    public static final Function2<java.lang.String, java.lang.Class<?>, Unit> getBeforeRegister() {
        return beforeRegister;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> */
    public static final Function1<java.lang.Throwable, Unit> getUnExceptionReport() {
        return unExceptionReport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C60180zxq<CancellableContinuation<java.lang.Byte>> getUniffiContinuationHandleMap() {
        return uniffiContinuationHandleMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C60180zxq<Job> getUniffiForeignFutureHandleMap() {
        return uniffiForeignFutureHandleMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void setAfterRegister(Function2<? super java.lang.String, ? super java.lang.Class<?>, Unit> function2) {
        afterRegister = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void setBeforeRegister(Function2<? super java.lang.String, ? super java.lang.Class<?>, Unit> function2) {
        beforeRegister = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void setUnExceptionReport(Function1<? super java.lang.Throwable, Unit> function1) {
        unExceptionReport = function1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final <U, E extends java.lang.Exception> U uniffiRustCallWithError(@NotNull RustBuffer rustBuffer, @NotNull InterfaceC60181zxr<E> interfaceC60181zxr, @NotNull Function1<? super UniffiRustCallStatus, ? extends U> function1) throws E, InternalException {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        Intrinsics.checkNotNullParameter(interfaceC60181zxr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC60174zxk rustBufferOp = rustBuffer.getRustBufferOp();
        if (rustBufferOp != null) {
            UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus(rustBufferOp);
            U uInvoke = function1.invoke(uniffiRustCallStatus);
            uniffiCheckCallStatus(rustBuffer, interfaceC60181zxr, uniffiRustCallStatus);
            return uInvoke;
        }
        throw new java.lang.IllegalStateException("RustBuffer.rustBufferOp is null");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Exception */
    public static final <E extends java.lang.Exception> void uniffiCheckCallStatus(RustBuffer rustBuffer, InterfaceC60181zxr<E> interfaceC60181zxr, UniffiRustCallStatus uniffiRustCallStatus) throws E, InternalException {
        if (uniffiRustCallStatus.isSuccess()) {
            return;
        }
        if (uniffiRustCallStatus.isError()) {
            throw interfaceC60181zxr.copydefault(uniffiRustCallStatus.error_buf);
        }
        if (uniffiRustCallStatus.isPanic()) {
            if (uniffiRustCallStatus.error_buf.len > 0) {
                throw new InternalException(new BaseFfiConverterString(rustBuffer).lift2(uniffiRustCallStatus.error_buf));
            }
            throw new InternalException("Rust panic");
        }
        throw new InternalException("Unknown rust call status: " + uniffiRustCallStatus + ".code");
    }

    public static final <U> U uniffiRustCall(@NotNull RustBuffer rustBuffer, @NotNull Function1<? super UniffiRustCallStatus, ? extends U> function1) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return (U) uniffiRustCallWithError(rustBuffer, new C60178zxo(rustBuffer), function1);
    }

    public static final <T> void uniffiTraitInterfaceCall(@NotNull RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus, @NotNull Function0<? extends T> function0, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            function1.invoke(function0.invoke());
        } catch (java.lang.Exception e) {
            Function1<java.lang.Throwable, Unit> unExceptionReport2 = getUnExceptionReport();
            if (unExceptionReport2 != null) {
                unExceptionReport2.invoke(e);
            }
            uniffiRustCallStatus.code = (byte) 2;
            uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
        }
    }

    public static final /* synthetic */ <T, E extends java.lang.Throwable> void uniffiTraitInterfaceCallWithError(RustBuffer rustBuffer, UniffiRustCallStatus uniffiRustCallStatus, Function0<? extends T> function0, Function1<? super T, Unit> function1, Function1<? super E, RustBuffer.ByValue> function12) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        try {
            function1.invoke(function0.invoke());
        } catch (java.lang.Exception e) {
            Intrinsics.KWHzl(3, "E");
            uniffiRustCallStatus.code = (byte) 1;
            uniffiRustCallStatus.error_buf = function12.invoke(e);
        }
    }

    public static final java.lang.String findLibraryName(@NotNull java.lang.String str) {
        synchronized (C60173zxj.class) {
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.String property = java.lang.System.getProperty("uniffi.component." + str + ".libraryOverride");
            return property != null ? property : "OKCore";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:25:0x00b7, B:27:0x00bf, B:19:0x0071, B:21:0x00ac), top: B:37:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:25:0x00b7, B:27:0x00bf, B:19:0x0071, B:21:0x00ac), top: B:37:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b2 -> B:37:0x00b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, F, E extends java.lang.Exception> java.lang.Object uniffiRustCallAsync(@NotNull RustBuffer rustBuffer, long j, @NotNull yHO<? super java.lang.Long, ? super UniffiRustFutureContinuationCallback, ? super java.lang.Long, Unit> yho, @NotNull Function2<? super java.lang.Long, ? super UniffiRustCallStatus, ? extends F> function2, @NotNull Function1<? super java.lang.Long, Unit> function1, @NotNull Function1<? super F, ? extends T> function12, @NotNull InterfaceC60181zxr<E> interfaceC60181zxr, @NotNull Continuation<? super T> continuation) throws java.lang.Throwable {
        UniFFICommonKt$uniffiRustCallAsync$1 uniFFICommonKt$uniffiRustCallAsync$1;
        RustBuffer rustBuffer2;
        final long j2;
        final Function2<? super java.lang.Long, ? super UniffiRustCallStatus, ? extends F> function22;
        Function1<? super java.lang.Long, Unit> function13;
        Function1<? super F, ? extends T> function14;
        InterfaceC60181zxr<E> interfaceC60181zxr2;
        UniFFICommonKt$uniffiRustCallAsync$1 uniFFICommonKt$uniffiRustCallAsync$12;
        yHO<? super java.lang.Long, ? super UniffiRustFutureContinuationCallback, ? super java.lang.Long, Unit> yho2;
        java.lang.Throwable th;
        java.lang.Object result;
        if (continuation instanceof UniFFICommonKt$uniffiRustCallAsync$1) {
            uniFFICommonKt$uniffiRustCallAsync$1 = (UniFFICommonKt$uniffiRustCallAsync$1) continuation;
            int i = uniFFICommonKt$uniffiRustCallAsync$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uniFFICommonKt$uniffiRustCallAsync$1.label = i - Integer.MIN_VALUE;
            } else {
                uniFFICommonKt$uniffiRustCallAsync$1 = new UniFFICommonKt$uniffiRustCallAsync$1(continuation);
            }
        }
        java.lang.Object obj = uniFFICommonKt$uniffiRustCallAsync$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = uniFFICommonKt$uniffiRustCallAsync$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            rustBuffer2 = rustBuffer;
            j2 = j;
            function22 = function2;
            function13 = function1;
            function14 = function12;
            interfaceC60181zxr2 = interfaceC60181zxr;
            uniFFICommonKt$uniffiRustCallAsync$12 = uniFFICommonKt$uniffiRustCallAsync$1;
            yho2 = yho;
            uniFFICommonKt$uniffiRustCallAsync$12.L$0 = rustBuffer2;
            uniFFICommonKt$uniffiRustCallAsync$12.L$1 = yho2;
            uniFFICommonKt$uniffiRustCallAsync$12.L$2 = function22;
            uniFFICommonKt$uniffiRustCallAsync$12.L$3 = function13;
            uniFFICommonKt$uniffiRustCallAsync$12.L$4 = function14;
            uniFFICommonKt$uniffiRustCallAsync$12.L$5 = interfaceC60181zxr2;
            uniFFICommonKt$uniffiRustCallAsync$12.J$0 = j2;
            uniFFICommonKt$uniffiRustCallAsync$12.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(uniFFICommonKt$uniffiRustCallAsync$12), 1);
            cancellableContinuationImpl.initCancellability();
            yho2.invoke(C56443yFo.KWHzl(j2), uniffiRustFutureContinuationCallbackImpl.INSTANCE, C56443yFo.KWHzl(getUniffiContinuationHandleMap().EZpvd(cancellableContinuationImpl)));
            result = cancellableContinuationImpl.getResult();
            if (result == C56442yFn.copydefault()) {
            }
            if (result != objCopydefault) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = uniFFICommonKt$uniffiRustCallAsync$1.J$0;
            InterfaceC60181zxr<E> interfaceC60181zxr3 = (InterfaceC60181zxr) uniFFICommonKt$uniffiRustCallAsync$1.L$5;
            Function1<? super F, ? extends T> function15 = (Function1) uniFFICommonKt$uniffiRustCallAsync$1.L$4;
            Function1<? super java.lang.Long, Unit> function16 = (Function1) uniFFICommonKt$uniffiRustCallAsync$1.L$3;
            Function2<? super java.lang.Long, ? super UniffiRustCallStatus, ? extends F> function23 = (Function2) uniFFICommonKt$uniffiRustCallAsync$1.L$2;
            yHO<? super java.lang.Long, ? super UniffiRustFutureContinuationCallback, ? super java.lang.Long, Unit> yho3 = (yHO) uniFFICommonKt$uniffiRustCallAsync$1.L$1;
            RustBuffer rustBuffer3 = (RustBuffer) uniFFICommonKt$uniffiRustCallAsync$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                uniFFICommonKt$uniffiRustCallAsync$12 = uniFFICommonKt$uniffiRustCallAsync$1;
                yho2 = yho3;
                interfaceC60181zxr2 = interfaceC60181zxr3;
                function22 = function23;
                function14 = function15;
                function13 = function16;
                try {
                    if (((java.lang.Number) obj).byteValue() != 0) {
                        T tInvoke = function14.invoke((java.lang.Object) uniffiRustCallWithError(rustBuffer3, interfaceC60181zxr2, new Function1() { // from class: o.zxi
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return C60173zxj.uniffiRustCallAsync$lambda$1(function22, j2, (UniffiRustCallStatus) obj2);
                            }
                        }));
                        function13.invoke(C56443yFo.KWHzl(j2));
                        return tInvoke;
                    }
                    rustBuffer2 = rustBuffer3;
                    uniFFICommonKt$uniffiRustCallAsync$12.L$0 = rustBuffer2;
                    uniFFICommonKt$uniffiRustCallAsync$12.L$1 = yho2;
                    uniFFICommonKt$uniffiRustCallAsync$12.L$2 = function22;
                    uniFFICommonKt$uniffiRustCallAsync$12.L$3 = function13;
                    uniFFICommonKt$uniffiRustCallAsync$12.L$4 = function14;
                    uniFFICommonKt$uniffiRustCallAsync$12.L$5 = interfaceC60181zxr2;
                    uniFFICommonKt$uniffiRustCallAsync$12.J$0 = j2;
                    uniFFICommonKt$uniffiRustCallAsync$12.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(C56441yFm.OLrzqt(uniFFICommonKt$uniffiRustCallAsync$12), 1);
                    cancellableContinuationImpl2.initCancellability();
                    yho2.invoke(C56443yFo.KWHzl(j2), uniffiRustFutureContinuationCallbackImpl.INSTANCE, C56443yFo.KWHzl(getUniffiContinuationHandleMap().EZpvd(cancellableContinuationImpl2)));
                    result = cancellableContinuationImpl2.getResult();
                    if (result == C56442yFn.copydefault()) {
                        C56447yFs.copydefault(uniFFICommonKt$uniffiRustCallAsync$12);
                    }
                    if (result != objCopydefault) {
                        return objCopydefault;
                    }
                    rustBuffer3 = rustBuffer2;
                    obj = result;
                    if (((java.lang.Number) obj).byteValue() != 0) {
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    function16 = function13;
                    function16.invoke(C56443yFo.KWHzl(j2));
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                function16.invoke(C56443yFo.KWHzl(j2));
                throw th;
            }
        }
    }

    public static final java.lang.Object uniffiRustCallAsync$lambda$1(Function2 function2, long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return function2.invoke(java.lang.Long.valueOf(j), uniffiRustCallStatus);
    }

    public static final <T> void uniffiTraitInterfaceCallAsync(@NotNull RustBuffer rustBuffer, @NotNull Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1, @NotNull Function1<? super T, Unit> function12, @NotNull Function1<? super UniffiRustCallStatus.ByValue, Unit> function13, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
        uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new UniFFICommonKt$uniffiTraitInterfaceCallAsync$job$1(function12, function1, function13, rustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
    }

    public static final /* synthetic */ <T, E extends java.lang.Throwable> void uniffiTraitInterfaceCallAsyncWithError(RustBuffer rustBuffer, Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1, Function1<? super T, Unit> function12, Function1<? super UniffiRustCallStatus.ByValue, Unit> function13, Function1<? super E, RustBuffer.ByValue> function14, UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
        GlobalScope globalScope = GlobalScope.INSTANCE;
        Intrinsics.OLrzqt();
        uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(globalScope, null, null, new UniFFICommonKt$uniffiTraitInterfaceCallAsyncWithError$job$1(function12, function1, function13, rustBuffer, function14, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
    }

    public static final int uniffiForeignFutureHandleCount() {
        return uniffiForeignFutureHandleMap.EZpvd();
    }

    public static final <T extends InterfaceC60170zxg, R> R use(T t, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            return function1.invoke(t);
        } finally {
            C56518yIi.KWHzl(1);
            if (t != null) {
                try {
                    t.destroy();
                } catch (java.lang.Throwable unused) {
                }
            }
            C56518yIi.copydefault(1);
        }
    }

    public static final InterfaceC60177zxn create(@NotNull InterfaceC60177zxn.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (Build.VERSION.SDK_INT >= 34) {
            return new C60167zxd();
        }
        return new C60179zxp();
    }
}
