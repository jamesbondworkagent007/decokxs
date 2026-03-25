package uniffi.compliance;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C3981AwI;
import o.C60173zxj;
import o.InterfaceC4055Axd;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.compliance.UniffiVTableCallbackInterfaceIdScanCallback;
import uniffi.compliance.uniffiCallbackInterfaceIDScanCallback;

/* JADX INFO: loaded from: classes25.dex */
public final class uniffiCallbackInterfaceIDScanCallback {
    public static final uniffiCallbackInterfaceIDScanCallback INSTANCE = new uniffiCallbackInterfaceIDScanCallback();
    public static UniffiVTableCallbackInterfaceIdScanCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfaceIdScanCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onFrameSelected.INSTANCE, onAutofocus.INSTANCE, onFrameResponse.INSTANCE, onComplete.INSTANCE, onDebugData.INSTANCE);
    public static final int $stable = 8;

    public static final class onFrameSelected implements UniffiCallbackInterfaceIdScanCallbackMethod0 {
        public static final int $stable = 0;
        public static final onFrameSelected INSTANCE = new onFrameSelected();

        private onFrameSelected() {
        }

        @Override // uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod0
        public void callback(long j, final byte b, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4055Axd interfaceC4055AxdCopydefault = FfiConverterTypeIDScanCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Azt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceIDScanCallback.onFrameSelected.callback$lambda$0(interfaceC4055AxdCopydefault, b);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Azq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceIDScanCallback.onFrameSelected.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C3981AwI.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4055Axd interfaceC4055Axd, byte b) {
            interfaceC4055Axd.OLrzqt(FfiConverterBoolean.INSTANCE.lift(b).booleanValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceIDScanCallback() {
    }

    public static final class onAutofocus implements UniffiCallbackInterfaceIdScanCallbackMethod1 {
        public static final int $stable = 0;
        public static final onAutofocus INSTANCE = new onAutofocus();

        private onAutofocus() {
        }

        @Override // uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod1
        public void callback(long j, final float f, final float f2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4055Axd interfaceC4055AxdCopydefault = FfiConverterTypeIDScanCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Azg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceIDScanCallback.onAutofocus.callback$lambda$0(interfaceC4055AxdCopydefault, f, f2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Azk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceIDScanCallback.onAutofocus.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C3981AwI.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4055Axd interfaceC4055Axd, float f, float f2) {
            FfiConverterFloat ffiConverterFloat = FfiConverterFloat.INSTANCE;
            interfaceC4055Axd.EZpvd(ffiConverterFloat.lift(f).floatValue(), ffiConverterFloat.lift(f2).floatValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class onFrameResponse implements UniffiCallbackInterfaceIdScanCallbackMethod2 {
        public static final int $stable = 0;
        public static final onFrameResponse INSTANCE = new onFrameResponse();

        private onFrameResponse() {
        }

        @Override // uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod2
        public void callback(long j, final int i, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4055Axd interfaceC4055AxdCopydefault = FfiConverterTypeIDScanCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Azn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceIDScanCallback.onFrameResponse.callback$lambda$0(interfaceC4055AxdCopydefault, i);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Azr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceIDScanCallback.onFrameResponse.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C3981AwI.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4055Axd interfaceC4055Axd, int i) {
            interfaceC4055Axd.AEQbTJ(FfiConverterInt.INSTANCE.lift(i).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class onComplete implements UniffiCallbackInterfaceIdScanCallbackMethod3 {
        public static final int $stable = 0;
        public static final onComplete INSTANCE = new onComplete();

        private onComplete() {
        }

        @Override // uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod3
        public void callback(long j, final double d, final byte b, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4055Axd interfaceC4055AxdCopydefault = FfiConverterTypeIDScanCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Azo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceIDScanCallback.onComplete.callback$lambda$0(interfaceC4055AxdCopydefault, d, b);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Azm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceIDScanCallback.onComplete.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C3981AwI.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4055Axd interfaceC4055Axd, double d, byte b) {
            interfaceC4055Axd.AEQbTJ(FfiConverterDouble.INSTANCE.lift(d).doubleValue(), FfiConverterBoolean.INSTANCE.lift(b).booleanValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class onDebugData implements UniffiCallbackInterfaceIdScanCallbackMethod4 {
        public static final int $stable = 0;
        public static final onDebugData INSTANCE = new onDebugData();

        private onDebugData() {
        }

        @Override // uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod4
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4055Axd interfaceC4055AxdCopydefault = FfiConverterTypeIDScanCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Azp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceIDScanCallback.onDebugData.callback$lambda$0(interfaceC4055AxdCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Azl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceIDScanCallback.onDebugData.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C3981AwI.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4055Axd interfaceC4055Axd, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            interfaceC4055Axd.OLrzqt(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2));
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
            FfiConverterTypeIDScanCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeIDScanCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void OLrzqt(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_compliance_fn_init_callback_vtable_idscancallback(vtable);
    }
}
