package uniffi.lifecycle;

import com.sun.jna.ptr.ByteByReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ASC;
import o.ASU;
import o.C2692AVo;
import o.C60173zxj;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo;
import uniffi.lifecycle.uniffiCallbackInterfaceCoreDeeplinkParsedInfo;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceCoreDeeplinkParsedInfo {
    public static final uniffiCallbackInterfaceCoreDeeplinkParsedInfo INSTANCE = new uniffiCallbackInterfaceCoreDeeplinkParsedInfo();
    public static UniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo.UniffiByValue vtable = new UniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, getMetadata.INSTANCE, getParams.INSTANCE, canHandle.INSTANCE);
    public static final int $stable = 8;

    public static final class getMetadata implements UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0 {
        public static final int $stable = 0;
        public static final getMetadata INSTANCE = new getMetadata();

        private getMetadata() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ASU asuCopydefault = FfiConverterTypeCoreDeeplinkParsedInfo.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return asuCopydefault.OLrzqt();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreDeeplinkParsedInfo.getMetadata.callback$lambda$1(rustBuffer, (ASC) obj);
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, ASC asc) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeCoreDeeplinkMetadata.INSTANCE.lower2(asc));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceCoreDeeplinkParsedInfo() {
    }

    public static final class getParams implements UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1 {
        public static final int $stable = 0;
        public static final getParams INSTANCE = new getParams();

        private getParams() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ASU asuCopydefault = FfiConverterTypeCoreDeeplinkParsedInfo.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return asuCopydefault.copydefault();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreDeeplinkParsedInfo.getParams.callback$lambda$1(rustBuffer, (java.util.Map) obj);
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, Map map) {
            Intrinsics.checkNotNullParameter(map, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterMapStringString.INSTANCE.lower2((Object) map));
            return Unit.INSTANCE;
        }
    }

    public static final class canHandle implements UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2 {
        public static final int $stable = 0;
        public static final canHandle INSTANCE = new canHandle();

        private canHandle() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ASU asuCopydefault = FfiConverterTypeCoreDeeplinkParsedInfo.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(asuCopydefault.AEQbTJ());
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreDeeplinkParsedInfo.canHandle.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = C2692AVo.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
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
            FfiConverterTypeCoreDeeplinkParsedInfo.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeCoreDeeplinkParsedInfo.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void KWHzl(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_lifecycle_fn_init_callback_vtable_coredeeplinkparsedinfo(vtable);
    }
}
