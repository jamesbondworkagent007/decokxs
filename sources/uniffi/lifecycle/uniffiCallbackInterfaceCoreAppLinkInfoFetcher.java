package uniffi.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ARC;
import o.ARK;
import o.C2692AVo;
import o.C60173zxj;
import o.InterfaceC2599ARy;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher;
import uniffi.lifecycle.uniffiCallbackInterfaceCoreAppLinkInfoFetcher;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceCoreAppLinkInfoFetcher {
    public static final uniffiCallbackInterfaceCoreAppLinkInfoFetcher INSTANCE = new uniffiCallbackInterfaceCoreAppLinkInfoFetcher();
    public static UniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher.UniffiByValue vtable = new UniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, getAppLinkHandler.INSTANCE, getAppLinkMetadata.INSTANCE);
    public static final int $stable = 8;

    public static final class getAppLinkHandler implements UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0 {
        public static final int $stable = 0;
        public static final getAppLinkHandler INSTANCE = new getAppLinkHandler();

        private getAppLinkHandler() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ARC arcCopydefault = FfiConverterTypeCoreAppLinkInfoFetcher.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AWB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreAppLinkInfoFetcher.getAppLinkHandler.callback$lambda$0(arcCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AWG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreAppLinkInfoFetcher.getAppLinkHandler.callback$lambda$1(rustBuffer, (InterfaceC2599ARy) obj);
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
        public static final InterfaceC2599ARy callback$lambda$0(ARC arc, RustBuffer.ByValue byValue) {
            return arc.OLrzqt(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, InterfaceC2599ARy interfaceC2599ARy) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeCoreAppLinkHandler.INSTANCE.lower2(interfaceC2599ARy));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceCoreAppLinkInfoFetcher() {
    }

    public static final class getAppLinkMetadata implements UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1 {
        public static final int $stable = 0;
        public static final getAppLinkMetadata INSTANCE = new getAppLinkMetadata();

        private getAppLinkMetadata() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ARC arcCopydefault = FfiConverterTypeCoreAppLinkInfoFetcher.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AWH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreAppLinkInfoFetcher.getAppLinkMetadata.callback$lambda$0(arcCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AWJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreAppLinkInfoFetcher.getAppLinkMetadata.callback$lambda$1(rustBuffer, (ARK) obj);
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
        public static final ARK callback$lambda$0(ARC arc, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return arc.OLrzqt(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, ARK ark) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeCoreAppLinkMetadata.INSTANCE.lower2(ark));
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
            FfiConverterTypeCoreAppLinkInfoFetcher.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeCoreAppLinkInfoFetcher.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void AEQbTJ(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_lifecycle_fn_init_callback_vtable_coreapplinkinfofetcher(vtable);
    }
}
