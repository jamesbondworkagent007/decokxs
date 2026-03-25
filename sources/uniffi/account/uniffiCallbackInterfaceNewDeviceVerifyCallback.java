package uniffi.account;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C60173zxj;
import o.C60230zyn;
import o.InterfaceC58746zNu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfaceNewDeviceVerifyCallback;
import uniffi.account.uniffiCallbackInterfaceNewDeviceVerifyCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceNewDeviceVerifyCallback {
    public static final uniffiCallbackInterfaceNewDeviceVerifyCallback INSTANCE = new uniffiCallbackInterfaceNewDeviceVerifyCallback();
    public static UniffiVTableCallbackInterfaceNewDeviceVerifyCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfaceNewDeviceVerifyCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onReceived.INSTANCE);
    public static final int $stable = 8;

    public static final class onReceived implements UniffiCallbackInterfaceNewDeviceVerifyCallbackMethod0 {
        public static final int $stable = 0;
        public static final onReceived INSTANCE = new onReceived();

        private onReceived() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNewDeviceVerifyCallbackMethod0
        public void callback(long j, final byte b, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC58746zNu interfaceC58746zNuCopydefault = FfiConverterTypeNewDeviceVerifyCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AlP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNewDeviceVerifyCallback.onReceived.callback$lambda$0(interfaceC58746zNuCopydefault, b);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AlT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNewDeviceVerifyCallback.onReceived.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC58746zNu interfaceC58746zNu, byte b) {
            interfaceC58746zNu.AEQbTJ(FfiConverterBoolean.INSTANCE.lift(b).booleanValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceNewDeviceVerifyCallback() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeNewDeviceVerifyCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeNewDeviceVerifyCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void KWHzl(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_newdeviceverifycallback(vtable);
    }
}
