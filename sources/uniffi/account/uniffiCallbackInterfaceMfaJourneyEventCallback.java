package uniffi.account;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58517zFh;
import o.C60173zxj;
import o.C60230zyn;
import o.InterfaceC58518zFi;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfaceMfaJourneyEventCallback;
import uniffi.account.uniffiCallbackInterfaceMfaJourneyEventCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceMfaJourneyEventCallback {
    public static final uniffiCallbackInterfaceMfaJourneyEventCallback INSTANCE = new uniffiCallbackInterfaceMfaJourneyEventCallback();
    public static UniffiVTableCallbackInterfaceMfaJourneyEventCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfaceMfaJourneyEventCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onEvent.INSTANCE);
    public static final int $stable = 8;

    public static final class onEvent implements UniffiCallbackInterfaceMfaJourneyEventCallbackMethod0 {
        public static final int $stable = 0;
        public static final onEvent INSTANCE = new onEvent();

        private onEvent() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceMfaJourneyEventCallbackMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC58518zFi interfaceC58518zFiCopydefault = FfiConverterTypeMfaJourneyEventCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AjF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceMfaJourneyEventCallback.onEvent.callback$lambda$0(interfaceC58518zFiCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AjO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceMfaJourneyEventCallback.onEvent.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC58518zFi interfaceC58518zFi, RustBuffer.ByValue byValue) {
            interfaceC58518zFi.onEvent((AbstractC58517zFh) FfiConverterTypeMfaJourneyEvent.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceMfaJourneyEventCallback() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeMfaJourneyEventCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeMfaJourneyEventCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void AEQbTJ(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_mfajourneyeventcallback(vtable);
    }
}
