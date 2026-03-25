package uniffi.account;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC3057Aek;
import o.C60173zxj;
import o.C60230zyn;
import o.InterfaceC3054Aeh;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfaceRegisterStepChangeCallback;
import uniffi.account.uniffiCallbackInterfaceRegisterStepChangeCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceRegisterStepChangeCallback {
    public static final uniffiCallbackInterfaceRegisterStepChangeCallback INSTANCE = new uniffiCallbackInterfaceRegisterStepChangeCallback();
    public static UniffiVTableCallbackInterfaceRegisterStepChangeCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfaceRegisterStepChangeCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onStepChanged.INSTANCE);
    public static final int $stable = 8;

    public static final class onStepChanged implements UniffiCallbackInterfaceRegisterStepChangeCallbackMethod0 {
        public static final int $stable = 0;
        public static final onStepChanged INSTANCE = new onStepChanged();

        private onStepChanged() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceRegisterStepChangeCallbackMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3054Aeh interfaceC3054AehCopydefault = FfiConverterTypeRegisterStepChangeCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AnO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceRegisterStepChangeCallback.onStepChanged.callback$lambda$0(interfaceC3054AehCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AnM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceRegisterStepChangeCallback.onStepChanged.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC3054Aeh interfaceC3054Aeh, RustBuffer.ByValue byValue) {
            interfaceC3054Aeh.AEQbTJ((AbstractC3057Aek) FfiConverterTypeRegisterStep.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceRegisterStepChangeCallback() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeRegisterStepChangeCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeRegisterStepChangeCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void EZpvd(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_registerstepchangecallback(vtable);
    }
}
