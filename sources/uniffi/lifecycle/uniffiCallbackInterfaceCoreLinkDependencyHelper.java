package uniffi.lifecycle;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.LongByReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AUI;
import o.C2692AVo;
import o.C60173zxj;
import o.InterfaceC2699AVv;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreLinkDependencyHelper;
import uniffi.lifecycle.uniffiCallbackInterfaceCoreLinkDependencyHelper;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceCoreLinkDependencyHelper {
    public static final uniffiCallbackInterfaceCoreLinkDependencyHelper INSTANCE = new uniffiCallbackInterfaceCoreLinkDependencyHelper();
    public static UniffiVTableCallbackInterfaceCoreLinkDependencyHelper.UniffiByValue vtable = new UniffiVTableCallbackInterfaceCoreLinkDependencyHelper.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, performAuth.INSTANCE, isPro.INSTANCE, validateMode.INSTANCE, switchModeIfRequired.INSTANCE, isPayModeSupported.INSTANCE, invokeLink.INSTANCE, waitForConfigSync.INSTANCE, processLinkParams.INSTANCE, isValidLanguageCode.INSTANCE);
    public static final int $stable = 8;

    public static final class performAuth implements UniffiCallbackInterfaceCoreLinkDependencyHelperMethod0 {
        public static final int $stable = 0;
        public static final performAuth INSTANCE = new performAuth();

        private performAuth() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkDependencyHelperMethod0
        public void callback(long j, final byte b, @NotNull final LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(longByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AUI auiCopydefault = FfiConverterTypeCoreLinkDependencyHelper.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreLinkDependencyHelper.performAuth.callback$lambda$0(auiCopydefault, b);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreLinkDependencyHelper.performAuth.callback$lambda$1(longByReference, (InterfaceC2699AVv) obj);
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
        public static final InterfaceC2699AVv callback$lambda$0(AUI aui, byte b) {
            return aui.copydefault(FfiConverterBoolean.INSTANCE.lift(b).booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(LongByReference longByReference, InterfaceC2699AVv interfaceC2699AVv) {
            Intrinsics.checkNotNullParameter(interfaceC2699AVv, "");
            longByReference.setValue(FfiConverterTypeOKNativeTaskboolWithLifecycleFutureError.INSTANCE.lower2(interfaceC2699AVv).longValue());
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceCoreLinkDependencyHelper() {
    }

    public static final class isPro implements UniffiCallbackInterfaceCoreLinkDependencyHelperMethod1 {
        public static final int $stable = 0;
        public static final isPro INSTANCE = new isPro();

        private isPro() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkDependencyHelperMethod1
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AUI auiCopydefault = FfiConverterTypeCoreLinkDependencyHelper.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(auiCopydefault.EZpvd());
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreLinkDependencyHelper.isPro.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
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

    public static final class validateMode implements UniffiCallbackInterfaceCoreLinkDependencyHelperMethod2 {
        public static final int $stable = 0;
        public static final validateMode INSTANCE = new validateMode();

        private validateMode() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkDependencyHelperMethod2
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AUI auiCopydefault = FfiConverterTypeCoreLinkDependencyHelper.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreLinkDependencyHelper.validateMode.callback$lambda$0(auiCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreLinkDependencyHelper.validateMode.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(AUI aui, RustBuffer.ByValue byValue) {
            return aui.OLrzqt(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class switchModeIfRequired implements UniffiCallbackInterfaceCoreLinkDependencyHelperMethod3 {
        public static final int $stable = 0;
        public static final switchModeIfRequired INSTANCE = new switchModeIfRequired();

        private switchModeIfRequired() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkDependencyHelperMethod3
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(longByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AUI auiCopydefault = FfiConverterTypeCoreLinkDependencyHelper.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreLinkDependencyHelper.switchModeIfRequired.callback$lambda$0(auiCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreLinkDependencyHelper.switchModeIfRequired.callback$lambda$1(longByReference, (InterfaceC2699AVv) obj);
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
        public static final InterfaceC2699AVv callback$lambda$0(AUI aui, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return aui.OLrzqt(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(LongByReference longByReference, InterfaceC2699AVv interfaceC2699AVv) {
            Intrinsics.checkNotNullParameter(interfaceC2699AVv, "");
            longByReference.setValue(FfiConverterTypeOKNativeTaskboolWithLifecycleFutureError.INSTANCE.lower2(interfaceC2699AVv).longValue());
            return Unit.INSTANCE;
        }
    }

    public static final class isPayModeSupported implements UniffiCallbackInterfaceCoreLinkDependencyHelperMethod4 {
        public static final int $stable = 0;
        public static final isPayModeSupported INSTANCE = new isPayModeSupported();

        private isPayModeSupported() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkDependencyHelperMethod4
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AUI auiCopydefault = FfiConverterTypeCoreLinkDependencyHelper.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(auiCopydefault.OLrzqt());
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreLinkDependencyHelper.isPayModeSupported.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
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

    public static final class invokeLink implements UniffiCallbackInterfaceCoreLinkDependencyHelperMethod5 {
        public static final int $stable = 0;
        public static final invokeLink INSTANCE = new invokeLink();

        private invokeLink() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkDependencyHelperMethod5
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(longByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AUI auiCopydefault = FfiConverterTypeCoreLinkDependencyHelper.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreLinkDependencyHelper.invokeLink.callback$lambda$0(auiCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreLinkDependencyHelper.invokeLink.callback$lambda$1(longByReference, (InterfaceC2699AVv) obj);
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
        public static final InterfaceC2699AVv callback$lambda$0(AUI aui, RustBuffer.ByValue byValue) {
            return aui.copydefault(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(LongByReference longByReference, InterfaceC2699AVv interfaceC2699AVv) {
            Intrinsics.checkNotNullParameter(interfaceC2699AVv, "");
            longByReference.setValue(FfiConverterTypeOKNativeTaskboolWithLifecycleFutureError.INSTANCE.lower2(interfaceC2699AVv).longValue());
            return Unit.INSTANCE;
        }
    }

    public static final class waitForConfigSync implements UniffiCallbackInterfaceCoreLinkDependencyHelperMethod6 {
        public static final int $stable = 0;
        public static final waitForConfigSync INSTANCE = new waitForConfigSync();

        private waitForConfigSync() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkDependencyHelperMethod6
        public void callback(long j, @NotNull final LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(longByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AUI auiCopydefault = FfiConverterTypeCoreLinkDependencyHelper.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return auiCopydefault.copydefault();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreLinkDependencyHelper.waitForConfigSync.callback$lambda$1(longByReference, (InterfaceC2699AVv) obj);
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
        public static final Unit callback$lambda$1(LongByReference longByReference, InterfaceC2699AVv interfaceC2699AVv) {
            Intrinsics.checkNotNullParameter(interfaceC2699AVv, "");
            longByReference.setValue(FfiConverterTypeOKNativeTaskboolWithLifecycleFutureError.INSTANCE.lower2(interfaceC2699AVv).longValue());
            return Unit.INSTANCE;
        }
    }

    public static final class processLinkParams implements UniffiCallbackInterfaceCoreLinkDependencyHelperMethod7 {
        public static final int $stable = 0;
        public static final processLinkParams INSTANCE = new processLinkParams();

        private processLinkParams() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkDependencyHelperMethod7
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AUI auiCopydefault = FfiConverterTypeCoreLinkDependencyHelper.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreLinkDependencyHelper.processLinkParams.callback$lambda$0(auiCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreLinkDependencyHelper.processLinkParams.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(AUI aui, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            aui.AEQbTJ((Map) FfiConverterMapStringString.INSTANCE.lift2(byValue), FfiConverterString.INSTANCE.lift2(byValue2));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class isValidLanguageCode implements UniffiCallbackInterfaceCoreLinkDependencyHelperMethod8 {
        public static final int $stable = 0;
        public static final isValidLanguageCode INSTANCE = new isValidLanguageCode();

        private isValidLanguageCode() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkDependencyHelperMethod8
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AUI auiCopydefault = FfiConverterTypeCoreLinkDependencyHelper.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(uniffiCallbackInterfaceCoreLinkDependencyHelper.isValidLanguageCode.callback$lambda$0(auiCopydefault, byValue));
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreLinkDependencyHelper.isValidLanguageCode.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
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
        public static final boolean callback$lambda$0(AUI aui, RustBuffer.ByValue byValue) {
            return aui.EZpvd(FfiConverterString.INSTANCE.lift2(byValue));
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
            FfiConverterTypeCoreLinkDependencyHelper.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeCoreLinkDependencyHelper.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void AEQbTJ(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_lifecycle_fn_init_callback_vtable_corelinkdependencyhelper(vtable);
    }
}
