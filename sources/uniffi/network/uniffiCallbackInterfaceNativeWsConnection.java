package uniffi.network;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.LongByReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AZX;
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
import uniffi.network.UniffiVTableCallbackInterfaceNativeWsConnection;
import uniffi.network.WsListenerKind;
import uniffi.network.uniffiCallbackInterfaceNativeWsConnection;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceNativeWsConnection {
    public static final uniffiCallbackInterfaceNativeWsConnection INSTANCE = new uniffiCallbackInterfaceNativeWsConnection();
    public static UniffiVTableCallbackInterfaceNativeWsConnection.UniffiByValue vtable = new UniffiVTableCallbackInterfaceNativeWsConnection.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, kind.INSTANCE, createListener.INSTANCE, reconnect.INSTANCE);
    public static final int $stable = 8;

    public static final class kind implements UniffiCallbackInterfaceNativeWsConnectionMethod0 {
        public static final int $stable = 0;
        public static final kind INSTANCE = new kind();

        private kind() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod0
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AZX azxCopydefault = FfiConverterTypeNativeWsConnection.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bdf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return azxCopydefault.OLrzqt();
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bdh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeWsConnection.kind.callback$lambda$1(rustBuffer, (WsListenerKind) obj);
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

    private uniffiCallbackInterfaceNativeWsConnection() {
    }

    public static final class createListener implements UniffiCallbackInterfaceNativeWsConnectionMethod1 {
        public static final int $stable = 0;
        public static final createListener INSTANCE = new createListener();

        private createListener() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, final long j2, final long j3, @NotNull final LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(longByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AZX azxCopydefault = FfiConverterTypeNativeWsConnection.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bda
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeWsConnection.createListener.callback$lambda$0(azxCopydefault, byValue, byValue2, j2, j3);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bdg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeWsConnection.createListener.callback$lambda$1(longByReference, (InterfaceC4285Bai) obj);
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
        public static final InterfaceC4285Bai callback$lambda$0(AZX azx, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, long j, long j2) {
            return azx.AEQbTJ(FfiConverterString.INSTANCE.lift2(byValue), (List) FfiConverterSequenceTypeWsArgPayload.INSTANCE.lift2(byValue2), FfiConverterTypeRustWsStateCallback.INSTANCE.lift(j), FfiConverterTypeRustWsDataCallback.INSTANCE.lift(j2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(LongByReference longByReference, InterfaceC4285Bai interfaceC4285Bai) {
            Intrinsics.checkNotNullParameter(interfaceC4285Bai, "");
            longByReference.setValue(FfiConverterTypeNativeWsListener.INSTANCE.lower2(interfaceC4285Bai).longValue());
            return Unit.INSTANCE;
        }
    }

    public static final class reconnect implements UniffiCallbackInterfaceNativeWsConnectionMethod2 {
        public static final int $stable = 0;
        public static final reconnect INSTANCE = new reconnect();

        private reconnect() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod2
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AZX azxCopydefault = FfiConverterTypeNativeWsConnection.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bde
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeWsConnection.reconnect.callback$lambda$0(azxCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bdd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeWsConnection.reconnect.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(AZX azx) {
            azx.copydefault();
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
            FfiConverterTypeNativeWsConnection.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeNativeWsConnection.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void AEQbTJ(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_network_fn_init_callback_vtable_nativewsconnection(vtable);
    }
}
