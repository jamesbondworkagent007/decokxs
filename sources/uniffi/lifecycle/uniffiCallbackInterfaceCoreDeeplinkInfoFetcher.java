package uniffi.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ASC;
import o.C2692AVo;
import o.C60173zxj;
import o.InterfaceC2607ASg;
import o.InterfaceC2618ASr;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher;
import uniffi.lifecycle.uniffiCallbackInterfaceCoreDeeplinkInfoFetcher;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceCoreDeeplinkInfoFetcher {
    public static final uniffiCallbackInterfaceCoreDeeplinkInfoFetcher INSTANCE = new uniffiCallbackInterfaceCoreDeeplinkInfoFetcher();
    public static UniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher.UniffiByValue vtable = new UniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, getDeeplinkHandler.INSTANCE, getDeeplinkMetadata.INSTANCE, getHandlerForScheme.INSTANCE, getMetadataForScheme.INSTANCE);
    public static final int $stable = 8;

    public static final class getDeeplinkHandler implements UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0 {
        public static final int $stable = 0;
        public static final getDeeplinkHandler INSTANCE = new getDeeplinkHandler();

        private getDeeplinkHandler() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0
        public void callback(long j, final long j2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2618ASr interfaceC2618ASrCopydefault = FfiConverterTypeCoreDeeplinkInfoFetcher.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AWZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreDeeplinkInfoFetcher.getDeeplinkHandler.callback$lambda$0(interfaceC2618ASrCopydefault, j2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreDeeplinkInfoFetcher.getDeeplinkHandler.callback$lambda$1(rustBuffer, (InterfaceC2607ASg) obj);
                }
            };
            RustBuffer rustBuffer2 = C2692AVo.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer2).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC2607ASg callback$lambda$0(InterfaceC2618ASr interfaceC2618ASr, long j) {
            return interfaceC2618ASr.copydefault(FfiConverterTypeCoreDeeplinkMetadata.INSTANCE.lift(j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, InterfaceC2607ASg interfaceC2607ASg) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeCoreDeeplinkHandler.INSTANCE.lower2(interfaceC2607ASg));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceCoreDeeplinkInfoFetcher() {
    }

    public static final class getDeeplinkMetadata implements UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1 {
        public static final int $stable = 0;
        public static final getDeeplinkMetadata INSTANCE = new getDeeplinkMetadata();

        private getDeeplinkMetadata() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2618ASr interfaceC2618ASrCopydefault = FfiConverterTypeCoreDeeplinkInfoFetcher.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreDeeplinkInfoFetcher.getDeeplinkMetadata.callback$lambda$0(interfaceC2618ASrCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreDeeplinkInfoFetcher.getDeeplinkMetadata.callback$lambda$1(rustBuffer, (ASC) obj);
                }
            };
            RustBuffer rustBuffer2 = C2692AVo.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer2).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ASC callback$lambda$0(InterfaceC2618ASr interfaceC2618ASr, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return interfaceC2618ASr.copydefault(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, ASC asc) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeCoreDeeplinkMetadata.INSTANCE.lower2(asc));
            return Unit.INSTANCE;
        }
    }

    public static final class getHandlerForScheme implements UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2 {
        public static final int $stable = 0;
        public static final getHandlerForScheme INSTANCE = new getHandlerForScheme();

        private getHandlerForScheme() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2618ASr interfaceC2618ASrCopydefault = FfiConverterTypeCoreDeeplinkInfoFetcher.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreDeeplinkInfoFetcher.getHandlerForScheme.callback$lambda$0(interfaceC2618ASrCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreDeeplinkInfoFetcher.getHandlerForScheme.callback$lambda$1(rustBuffer, (InterfaceC2607ASg) obj);
                }
            };
            RustBuffer rustBuffer2 = C2692AVo.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer2).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC2607ASg callback$lambda$0(InterfaceC2618ASr interfaceC2618ASr, RustBuffer.ByValue byValue) {
            return interfaceC2618ASr.EZpvd(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, InterfaceC2607ASg interfaceC2607ASg) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeCoreDeeplinkHandler.INSTANCE.lower2(interfaceC2607ASg));
            return Unit.INSTANCE;
        }
    }

    public static final class getMetadataForScheme implements UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3 {
        public static final int $stable = 0;
        public static final getMetadataForScheme INSTANCE = new getMetadataForScheme();

        private getMetadataForScheme() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2618ASr interfaceC2618ASrCopydefault = FfiConverterTypeCoreDeeplinkInfoFetcher.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreDeeplinkInfoFetcher.getMetadataForScheme.callback$lambda$0(interfaceC2618ASrCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreDeeplinkInfoFetcher.getMetadataForScheme.callback$lambda$1(rustBuffer, (ASC) obj);
                }
            };
            RustBuffer rustBuffer2 = C2692AVo.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer2).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ASC callback$lambda$0(InterfaceC2618ASr interfaceC2618ASr, RustBuffer.ByValue byValue) {
            return interfaceC2618ASr.copydefault(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, ASC asc) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeCoreDeeplinkMetadata.INSTANCE.lower2(asc));
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
            FfiConverterTypeCoreDeeplinkInfoFetcher.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeCoreDeeplinkInfoFetcher.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void AEQbTJ(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_lifecycle_fn_init_callback_vtable_coredeeplinkinfofetcher(vtable);
    }
}
