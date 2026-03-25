package uniffi.network;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C4298Bav;
import o.C60173zxj;
import o.InterfaceC2789AZh;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.network.UniffiVTableCallbackInterfaceLegacyDownloadCallback;
import uniffi.network.uniffiCallbackInterfaceLegacyDownloadCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceLegacyDownloadCallback {
    public static final uniffiCallbackInterfaceLegacyDownloadCallback INSTANCE = new uniffiCallbackInterfaceLegacyDownloadCallback();
    public static UniffiVTableCallbackInterfaceLegacyDownloadCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfaceLegacyDownloadCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onProgress.INSTANCE, onError.INSTANCE, onSuccess.INSTANCE);
    public static final int $stable = 8;

    public static final class onProgress implements UniffiCallbackInterfaceLegacyDownloadCallbackMethod0 {
        public static final int $stable = 0;
        public static final onProgress INSTANCE = new onProgress();

        private onProgress() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod0
        public void callback(long j, final long j2, final long j3, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2789AZh interfaceC2789AZhCopydefault = FfiConverterTypeLegacyDownloadCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BcS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceLegacyDownloadCallback.onProgress.callback$lambda$0(interfaceC2789AZhCopydefault, j2, j3);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BcQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceLegacyDownloadCallback.onProgress.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C4298Bav.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(InterfaceC2789AZh interfaceC2789AZh, long j, long j2) {
            FfiConverterULong ffiConverterULong = FfiConverterULong.INSTANCE;
            interfaceC2789AZh.EZpvd(ffiConverterULong.m9557liftI7RO_PI(j), ffiConverterULong.m9557liftI7RO_PI(j2));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceLegacyDownloadCallback() {
    }

    public static final class onError implements UniffiCallbackInterfaceLegacyDownloadCallbackMethod1 {
        public static final int $stable = 0;
        public static final onError INSTANCE = new onError();

        private onError() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod1
        public void callback(long j, final int i, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2789AZh interfaceC2789AZhCopydefault = FfiConverterTypeLegacyDownloadCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BcO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceLegacyDownloadCallback.onError.callback$lambda$0(interfaceC2789AZhCopydefault, i, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BcP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceLegacyDownloadCallback.onError.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C4298Bav.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(InterfaceC2789AZh interfaceC2789AZh, int i, RustBuffer.ByValue byValue) {
            interfaceC2789AZh.copydefault(FfiConverterInt.INSTANCE.lift(i).intValue(), FfiConverterString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class onSuccess implements UniffiCallbackInterfaceLegacyDownloadCallbackMethod2 {
        public static final int $stable = 0;
        public static final onSuccess INSTANCE = new onSuccess();

        private onSuccess() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod2
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2789AZh interfaceC2789AZhCopydefault = FfiConverterTypeLegacyDownloadCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BcR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceLegacyDownloadCallback.onSuccess.callback$lambda$0(interfaceC2789AZhCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BcV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceLegacyDownloadCallback.onSuccess.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C4298Bav.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(InterfaceC2789AZh interfaceC2789AZh, RustBuffer.ByValue byValue) {
            interfaceC2789AZh.EZpvd(FfiConverterString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeLegacyDownloadCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeLegacyDownloadCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void copydefault(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_network_fn_init_callback_vtable_legacydownloadcallback(vtable);
    }
}
