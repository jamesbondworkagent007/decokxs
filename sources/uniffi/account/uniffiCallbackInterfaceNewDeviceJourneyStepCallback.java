package uniffi.account;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C60173zxj;
import o.C60230zyn;
import o.InterfaceC58700zMb;
import o.zLU;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfaceNewDeviceJourneyStepCallback;
import uniffi.account.uniffiCallbackInterfaceNewDeviceJourneyStepCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceNewDeviceJourneyStepCallback {
    public static final uniffiCallbackInterfaceNewDeviceJourneyStepCallback INSTANCE = new uniffiCallbackInterfaceNewDeviceJourneyStepCallback();
    public static UniffiVTableCallbackInterfaceNewDeviceJourneyStepCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfaceNewDeviceJourneyStepCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onChanged.INSTANCE);
    public static final int $stable = 8;

    public static final class onChanged implements UniffiCallbackInterfaceNewDeviceJourneyStepCallbackMethod0 {
        public static final int $stable = 0;
        public static final onChanged INSTANCE = new onChanged();

        private onChanged() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNewDeviceJourneyStepCallbackMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC58700zMb interfaceC58700zMbCopydefault = FfiConverterTypeNewDeviceJourneyStepCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AlC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNewDeviceJourneyStepCallback.onChanged.callback$lambda$0(interfaceC58700zMbCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AlH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNewDeviceJourneyStepCallback.onChanged.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC58700zMb interfaceC58700zMb, RustBuffer.ByValue byValue) {
            interfaceC58700zMb.EZpvd((zLU) FfiConverterTypeNewDeviceJourneyStep.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceNewDeviceJourneyStepCallback() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeNewDeviceJourneyStepCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeNewDeviceJourneyStepCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void EZpvd(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_newdevicejourneystepcallback(vtable);
    }
}
