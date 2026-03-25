package uniffi.account;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58469zDn;
import o.C60173zxj;
import o.C60230zyn;
import o.InterfaceC58467zDl;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfaceLoginJourneyEventCallback;
import uniffi.account.uniffiCallbackInterfaceLoginJourneyEventCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceLoginJourneyEventCallback {
    public static final uniffiCallbackInterfaceLoginJourneyEventCallback INSTANCE = new uniffiCallbackInterfaceLoginJourneyEventCallback();
    public static UniffiVTableCallbackInterfaceLoginJourneyEventCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfaceLoginJourneyEventCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onEvent.INSTANCE);
    public static final int $stable = 8;

    public static final class onEvent implements UniffiCallbackInterfaceLoginJourneyEventCallbackMethod0 {
        public static final int $stable = 0;
        public static final onEvent INSTANCE = new onEvent();

        private onEvent() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceLoginJourneyEventCallbackMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC58467zDl interfaceC58467zDlCopydefault = FfiConverterTypeLoginJourneyEventCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Ajy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceLoginJourneyEventCallback.onEvent.callback$lambda$0(interfaceC58467zDlCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AjD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceLoginJourneyEventCallback.onEvent.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC58467zDl interfaceC58467zDl, RustBuffer.ByValue byValue) {
            interfaceC58467zDl.onEvent((AbstractC58469zDn) FfiConverterTypeLoginJourneyEvent.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceLoginJourneyEventCallback() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeLoginJourneyEventCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeLoginJourneyEventCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void AEQbTJ(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_loginjourneyeventcallback(vtable);
    }
}
