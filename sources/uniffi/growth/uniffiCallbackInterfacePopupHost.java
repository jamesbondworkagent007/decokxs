package uniffi.growth;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ANQ;
import o.C60173zxj;
import o.InterfaceC2518AOv;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.growth.PopupHostKind;
import uniffi.growth.UniffiVTableCallbackInterfacePopupHost;
import uniffi.growth.uniffiCallbackInterfacePopupHost;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfacePopupHost {
    public static final uniffiCallbackInterfacePopupHost INSTANCE = new uniffiCallbackInterfacePopupHost();
    public static UniffiVTableCallbackInterfacePopupHost.UniffiByValue vtable = new UniffiVTableCallbackInterfacePopupHost.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, kind.INSTANCE, identifier.INSTANCE);
    public static final int $stable = 8;

    public static final class kind implements UniffiCallbackInterfacePopupHostMethod0 {
        public static final int $stable = 0;
        public static final kind INSTANCE = new kind();

        private kind() {
        }

        @Override // uniffi.growth.UniffiCallbackInterfacePopupHostMethod0
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2518AOv interfaceC2518AOvCopydefault = FfiConverterTypePopupHost.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AQL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC2518AOvCopydefault.EZpvd();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AQO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePopupHost.kind.callback$lambda$1(rustBuffer, (PopupHostKind) obj);
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, PopupHostKind popupHostKind) {
            Intrinsics.checkNotNullParameter(popupHostKind, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterTypePopupHostKind.INSTANCE.lower2((Object) popupHostKind));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfacePopupHost() {
    }

    public static final class identifier implements UniffiCallbackInterfacePopupHostMethod1 {
        public static final int $stable = 0;
        public static final identifier INSTANCE = new identifier();

        private identifier() {
        }

        @Override // uniffi.growth.UniffiCallbackInterfacePopupHostMethod1
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2518AOv interfaceC2518AOvCopydefault = FfiConverterTypePopupHost.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AQH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC2518AOvCopydefault.OLrzqt();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AQK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePopupHost.identifier.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
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
            FfiConverterTypePopupHost.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypePopupHost.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void copydefault(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_growth_fn_init_callback_vtable_popuphost(vtable);
    }
}
