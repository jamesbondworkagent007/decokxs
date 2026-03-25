package uniffi.account;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58476zDu;
import o.C60173zxj;
import o.C60230zyn;
import o.InterfaceC58480zDy;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfaceLoginJourneyStepCallback;
import uniffi.account.uniffiCallbackInterfaceLoginJourneyStepCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceLoginJourneyStepCallback {
    public static final uniffiCallbackInterfaceLoginJourneyStepCallback INSTANCE = new uniffiCallbackInterfaceLoginJourneyStepCallback();
    public static UniffiVTableCallbackInterfaceLoginJourneyStepCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfaceLoginJourneyStepCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onChanged.INSTANCE);
    public static final int $stable = 8;

    public static final class onChanged implements UniffiCallbackInterfaceLoginJourneyStepCallbackMethod0 {
        public static final int $stable = 0;
        public static final onChanged INSTANCE = new onChanged();

        private onChanged() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceLoginJourneyStepCallbackMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC58480zDy interfaceC58480zDyCopydefault = FfiConverterTypeLoginJourneyStepCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AjE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceLoginJourneyStepCallback.onChanged.callback$lambda$0(interfaceC58480zDyCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AjA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceLoginJourneyStepCallback.onChanged.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC58480zDy interfaceC58480zDy, RustBuffer.ByValue byValue) {
            interfaceC58480zDy.KWHzl((AbstractC58476zDu) FfiConverterTypeLoginJourneyStep.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceLoginJourneyStepCallback() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeLoginJourneyStepCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeLoginJourneyStepCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void AEQbTJ(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_loginjourneystepcallback(vtable);
    }
}
