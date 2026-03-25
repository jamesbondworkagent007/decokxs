package uniffi.account;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C60173zxj;
import o.C60230zyn;
import o.zKU;
import o.zKW;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfaceNewDeviceInfoEventCallback;
import uniffi.account.uniffiCallbackInterfaceNewDeviceInfoEventCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceNewDeviceInfoEventCallback {
    public static final uniffiCallbackInterfaceNewDeviceInfoEventCallback INSTANCE = new uniffiCallbackInterfaceNewDeviceInfoEventCallback();
    public static UniffiVTableCallbackInterfaceNewDeviceInfoEventCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfaceNewDeviceInfoEventCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onEvent.INSTANCE);
    public static final int $stable = 8;

    public static final class onEvent implements UniffiCallbackInterfaceNewDeviceInfoEventCallbackMethod0 {
        public static final int $stable = 0;
        public static final onEvent INSTANCE = new onEvent();

        private onEvent() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNewDeviceInfoEventCallbackMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zKW zkwCopydefault = FfiConverterTypeNewDeviceInfoEventCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AlA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNewDeviceInfoEventCallback.onEvent.callback$lambda$0(zkwCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Alw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNewDeviceInfoEventCallback.onEvent.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(zKW zkw, RustBuffer.ByValue byValue) {
            zkw.onEvent((zKU) FfiConverterTypeNewDeviceInfoEvent.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceNewDeviceInfoEventCallback() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeNewDeviceInfoEventCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeNewDeviceInfoEventCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void EZpvd(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_newdeviceinfoeventcallback(vtable);
    }
}
