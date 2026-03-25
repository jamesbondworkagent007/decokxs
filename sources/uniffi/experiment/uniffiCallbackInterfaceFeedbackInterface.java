package uniffi.experiment;

import com.sun.jna.ptr.ByteByReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C2348AIh;
import o.C60173zxj;
import o.InterfaceC2361AIu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.experiment.UniffiVTableCallbackInterfaceFeedbackInterface;
import uniffi.experiment.uniffiCallbackInterfaceFeedbackInterface;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceFeedbackInterface {
    public static final uniffiCallbackInterfaceFeedbackInterface INSTANCE = new uniffiCallbackInterfaceFeedbackInterface();
    public static UniffiVTableCallbackInterfaceFeedbackInterface.UniffiByValue vtable = new UniffiVTableCallbackInterfaceFeedbackInterface.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, enableMonitorShaking.INSTANCE, disableMonitorShaking.INSTANCE);
    public static final int $stable = 8;

    public static final class enableMonitorShaking implements UniffiCallbackInterfaceFeedbackInterfaceMethod0 {
        public static final int $stable = 0;
        public static final enableMonitorShaking INSTANCE = new enableMonitorShaking();

        private enableMonitorShaking() {
        }

        @Override // uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod0
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2361AIu interfaceC2361AIuCopydefault = FfiConverterTypeFeedbackInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AJS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(interfaceC2361AIuCopydefault.OLrzqt());
                }
            };
            Function1 function1 = new Function1() { // from class: o.AJT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceFeedbackInterface.enableMonitorShaking.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = C2348AIh.uniffiRustBuffer;
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

    private uniffiCallbackInterfaceFeedbackInterface() {
    }

    public static final class disableMonitorShaking implements UniffiCallbackInterfaceFeedbackInterfaceMethod1 {
        public static final int $stable = 0;
        public static final disableMonitorShaking INSTANCE = new disableMonitorShaking();

        private disableMonitorShaking() {
        }

        @Override // uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod1
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2361AIu interfaceC2361AIuCopydefault = FfiConverterTypeFeedbackInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AJN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(interfaceC2361AIuCopydefault.KWHzl());
                }
            };
            Function1 function1 = new Function1() { // from class: o.AJM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceFeedbackInterface.disableMonitorShaking.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = C2348AIh.uniffiRustBuffer;
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
            FfiConverterTypeFeedbackInterface.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeFeedbackInterface.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void copydefault(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_experiment_fn_init_callback_vtable_feedbackinterface(vtable);
    }
}
