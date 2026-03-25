package uniffi.network;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AZM;
import o.C4298Bav;
import o.C60173zxj;
import o.InterfaceC4285Bai;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.network.UniffiVTableCallbackInterfaceNativeWsListener;
import uniffi.network.WsListenerKind;
import uniffi.network.uniffiCallbackInterfaceNativeWsListener;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceNativeWsListener {
    public static final uniffiCallbackInterfaceNativeWsListener INSTANCE = new uniffiCallbackInterfaceNativeWsListener();
    public static UniffiVTableCallbackInterfaceNativeWsListener.UniffiByValue vtable = new UniffiVTableCallbackInterfaceNativeWsListener.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, kind.INSTANCE, start.INSTANCE, stop.INSTANCE, getSendable.INSTANCE);
    public static final int $stable = 8;

    public static final class kind implements UniffiCallbackInterfaceNativeWsListenerMethod0 {
        public static final int $stable = 0;
        public static final kind INSTANCE = new kind();

        private kind() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod0
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4285Bai interfaceC4285BaiCopydefault = FfiConverterTypeNativeWsListener.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bdj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4285BaiCopydefault.EZpvd();
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bdm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeWsListener.kind.callback$lambda$1(rustBuffer, (WsListenerKind) obj);
                }
            };
            RustBuffer rustBuffer2 = C4298Bav.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, WsListenerKind wsListenerKind) {
            Intrinsics.checkNotNullParameter(wsListenerKind, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterTypeWsListenerKind.INSTANCE.lower2((Object) wsListenerKind));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceNativeWsListener() {
    }

    public static final class start implements UniffiCallbackInterfaceNativeWsListenerMethod1 {
        public static final int $stable = 0;
        public static final start INSTANCE = new start();

        private start() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod1
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4285Bai interfaceC4285BaiCopydefault = FfiConverterTypeNativeWsListener.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bdk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeWsListener.start.callback$lambda$0(interfaceC4285BaiCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bdp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeWsListener.start.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4285Bai interfaceC4285Bai) {
            interfaceC4285Bai.KWHzl();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class stop implements UniffiCallbackInterfaceNativeWsListenerMethod2 {
        public static final int $stable = 0;
        public static final stop INSTANCE = new stop();

        private stop() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod2
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4285Bai interfaceC4285BaiCopydefault = FfiConverterTypeNativeWsListener.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bdq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeWsListener.stop.callback$lambda$0(interfaceC4285BaiCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bdr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeWsListener.stop.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4285Bai interfaceC4285Bai) {
            interfaceC4285Bai.OLrzqt();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getSendable implements UniffiCallbackInterfaceNativeWsListenerMethod3 {
        public static final int $stable = 0;
        public static final getSendable INSTANCE = new getSendable();

        private getSendable() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod3
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4285Bai interfaceC4285BaiCopydefault = FfiConverterTypeNativeWsListener.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bdl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4285BaiCopydefault.AEQbTJ();
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bdi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeWsListener.getSendable.callback$lambda$1(rustBuffer, (AZM) obj);
                }
            };
            RustBuffer rustBuffer2 = C4298Bav.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, AZM azm) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeNativeMessageSendable.INSTANCE.lower2(azm));
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
            FfiConverterTypeNativeWsListener.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeNativeWsListener.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void EZpvd(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_network_fn_init_callback_vtable_nativewslistener(vtable);
    }
}
