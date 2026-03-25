package uniffi.lifecycle;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C2692AVo;
import o.C60173zxj;
import o.InterfaceC2678AVa;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreLinkExecutionHelper;
import uniffi.lifecycle.uniffiCallbackInterfaceCoreLinkExecutionHelper;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceCoreLinkExecutionHelper {
    public static final uniffiCallbackInterfaceCoreLinkExecutionHelper INSTANCE = new uniffiCallbackInterfaceCoreLinkExecutionHelper();
    public static UniffiVTableCallbackInterfaceCoreLinkExecutionHelper.UniffiByValue vtable = new UniffiVTableCallbackInterfaceCoreLinkExecutionHelper.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, getContextRefer.INSTANCE, openLink.INSTANCE, clearContext.INSTANCE);
    public static final int $stable = 8;

    public static final class getContextRefer implements UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0 {
        public static final int $stable = 0;
        public static final getContextRefer INSTANCE = new getContextRefer();

        private getContextRefer() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2678AVa interfaceC2678AVaCopydefault = FfiConverterTypeCoreLinkExecutionHelper.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC2678AVaCopydefault.copydefault();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreLinkExecutionHelper.getContextRefer.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceCoreLinkExecutionHelper() {
    }

    public static final class openLink implements UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1 {
        public static final int $stable = 0;
        public static final openLink INSTANCE = new openLink();

        private openLink() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2678AVa interfaceC2678AVaCopydefault = FfiConverterTypeCoreLinkExecutionHelper.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreLinkExecutionHelper.openLink.callback$lambda$0(interfaceC2678AVaCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreLinkExecutionHelper.openLink.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC2678AVa interfaceC2678AVa, RustBuffer.ByValue byValue) {
            interfaceC2678AVa.EZpvd(FfiConverterString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class clearContext implements UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2 {
        public static final int $stable = 0;
        public static final clearContext INSTANCE = new clearContext();

        private clearContext() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2678AVa interfaceC2678AVaCopydefault = FfiConverterTypeCoreLinkExecutionHelper.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AXR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreLinkExecutionHelper.clearContext.callback$lambda$0(interfaceC2678AVaCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AXO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreLinkExecutionHelper.clearContext.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC2678AVa interfaceC2678AVa) {
            interfaceC2678AVa.KWHzl();
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
            FfiConverterTypeCoreLinkExecutionHelper.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeCoreLinkExecutionHelper.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void copydefault(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_lifecycle_fn_init_callback_vtable_corelinkexecutionhelper(vtable);
    }
}
