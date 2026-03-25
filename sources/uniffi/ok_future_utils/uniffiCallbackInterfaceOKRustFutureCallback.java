package uniffi.ok_future_utils;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BfS;
import o.C60173zxj;
import o.InterfaceC4440Bed;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.ok_future_utils.UniffiVTableCallbackInterfaceOkRustFutureCallback;
import uniffi.ok_future_utils.uniffiCallbackInterfaceOKRustFutureCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceOKRustFutureCallback {
    public static final uniffiCallbackInterfaceOKRustFutureCallback INSTANCE = new uniffiCallbackInterfaceOKRustFutureCallback();
    public static UniffiVTableCallbackInterfaceOkRustFutureCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfaceOkRustFutureCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onFinished.INSTANCE);
    public static final int $stable = 8;

    public static final class onFinished implements UniffiCallbackInterfaceOkRustFutureCallbackMethod0 {
        public static final int $stable = 0;
        public static final onFinished INSTANCE = new onFinished();

        private onFinished() {
        }

        @Override // uniffi.ok_future_utils.UniffiCallbackInterfaceOkRustFutureCallbackMethod0
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4440Bed interfaceC4440BedCopydefault = FfiConverterTypeOKRustFutureCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bgb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceOKRustFutureCallback.onFinished.callback$lambda$0(interfaceC4440BedCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BfY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKRustFutureCallback.onFinished.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = BfS.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4440Bed interfaceC4440Bed) {
            interfaceC4440Bed.OLrzqt();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceOKRustFutureCallback() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeOKRustFutureCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeOKRustFutureCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void copydefault(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_ok_future_utils_fn_init_callback_vtable_okrustfuturecallback(vtable);
    }
}
