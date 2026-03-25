package uniffi.growth;

import com.sun.jna.ptr.ByteByReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ANQ;
import o.APJ;
import o.C60173zxj;
import o.InterfaceC2502AOf;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.growth.UniffiVTableCallbackInterfacePlatformPackageCallback;
import uniffi.growth.uniffiCallbackInterfacePlatformPackageCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfacePlatformPackageCallback {
    public static final uniffiCallbackInterfacePlatformPackageCallback INSTANCE = new uniffiCallbackInterfacePlatformPackageCallback();
    public static UniffiVTableCallbackInterfacePlatformPackageCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfacePlatformPackageCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, isPackageInstalled.INSTANCE, filterAvailableSharePlatforms.INSTANCE);
    public static final int $stable = 8;

    public static final class isPackageInstalled implements UniffiCallbackInterfacePlatformPackageCallbackMethod0 {
        public static final int $stable = 0;
        public static final isPackageInstalled INSTANCE = new isPackageInstalled();

        private isPackageInstalled() {
        }

        @Override // uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2502AOf interfaceC2502AOfCopydefault = FfiConverterTypePlatformPackageCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AQI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(uniffiCallbackInterfacePlatformPackageCallback.isPackageInstalled.callback$lambda$0(interfaceC2502AOfCopydefault, byValue, byValue2));
                }
            };
            Function1 function1 = new Function1() { // from class: o.AQJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePlatformPackageCallback.isPackageInstalled.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = ANQ.uniffiRustBuffer;
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
        public static final boolean callback$lambda$0(InterfaceC2502AOf interfaceC2502AOf, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            return interfaceC2502AOf.KWHzl(FfiConverterString.INSTANCE.lift2(byValue), (SharePlatform) FfiConverterTypeSharePlatform.INSTANCE.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfacePlatformPackageCallback() {
    }

    public static final class filterAvailableSharePlatforms implements UniffiCallbackInterfacePlatformPackageCallbackMethod1 {
        public static final int $stable = 0;
        public static final filterAvailableSharePlatforms INSTANCE = new filterAvailableSharePlatforms();

        private filterAvailableSharePlatforms() {
        }

        @Override // uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2502AOf interfaceC2502AOfCopydefault = FfiConverterTypePlatformPackageCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AQD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfacePlatformPackageCallback.filterAvailableSharePlatforms.callback$lambda$0(interfaceC2502AOfCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AQG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePlatformPackageCallback.filterAvailableSharePlatforms.callback$lambda$1(rustBuffer, (java.util.List) obj);
                }
            };
            RustBuffer rustBuffer2 = ANQ.uniffiRustBuffer;
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
        public static final List callback$lambda$0(InterfaceC2502AOf interfaceC2502AOf, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            return interfaceC2502AOf.EZpvd((APJ) FfiConverterTypeShareConfig.INSTANCE.lift2(byValue), (List) FfiConverterSequenceTypeSharePlatform.INSTANCE.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, List list) {
            Intrinsics.checkNotNullParameter(list, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterSequenceTypeSharePlatform.INSTANCE.lower2((Object) list));
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
            FfiConverterTypePlatformPackageCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypePlatformPackageCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void AEQbTJ(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_growth_fn_init_callback_vtable_platformpackagecallback(vtable);
    }
}
