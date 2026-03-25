package uniffi.account;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C60173zxj;
import o.C60230zyn;
import o.InterfaceC60214zyX;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfaceBleConnectionCallback;
import uniffi.account.uniffiCallbackInterfaceBleConnectionCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceBleConnectionCallback {
    public static final uniffiCallbackInterfaceBleConnectionCallback INSTANCE = new uniffiCallbackInterfaceBleConnectionCallback();
    public static UniffiVTableCallbackInterfaceBleConnectionCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfaceBleConnectionCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onConnectionStateChanged.INSTANCE);
    public static final int $stable = 8;

    public static final class onConnectionStateChanged implements UniffiCallbackInterfaceBleConnectionCallbackMethod0 {
        public static final int $stable = 0;
        public static final onConnectionStateChanged INSTANCE = new onConnectionStateChanged();

        private onConnectionStateChanged() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceBleConnectionCallbackMethod0
        public void callback(long j, final byte b, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC60214zyX interfaceC60214zyXCopydefault = FfiConverterTypeBleConnectionCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Ajd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceBleConnectionCallback.onConnectionStateChanged.callback$lambda$0(interfaceC60214zyXCopydefault, b, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Ajb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceBleConnectionCallback.onConnectionStateChanged.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC60214zyX interfaceC60214zyX, byte b, RustBuffer.ByValue byValue) {
            interfaceC60214zyX.EZpvd(FfiConverterBoolean.INSTANCE.lift(b).booleanValue(), FfiConverterOptionalString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceBleConnectionCallback() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeBleConnectionCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeBleConnectionCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void OLrzqt(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_bleconnectioncallback(vtable);
    }
}
