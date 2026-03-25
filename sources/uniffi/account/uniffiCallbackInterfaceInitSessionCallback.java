package uniffi.account;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C58415zBn;
import o.C60173zxj;
import o.C60230zyn;
import o.InterfaceC58402zBa;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfaceInitSessionCallback;
import uniffi.account.uniffiCallbackInterfaceInitSessionCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceInitSessionCallback {
    public static final uniffiCallbackInterfaceInitSessionCallback INSTANCE = new uniffiCallbackInterfaceInitSessionCallback();
    public static UniffiVTableCallbackInterfaceInitSessionCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfaceInitSessionCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onSuccess.INSTANCE, onError.INSTANCE);
    public static final int $stable = 8;

    public static final class onSuccess implements UniffiCallbackInterfaceInitSessionCallbackMethod0 {
        public static final int $stable = 0;
        public static final onSuccess INSTANCE = new onSuccess();

        private onSuccess() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC58402zBa interfaceC58402zBaCopydefault = FfiConverterTypeInitSessionCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Ajn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceInitSessionCallback.onSuccess.callback$lambda$0(interfaceC58402zBaCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Ajt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceInitSessionCallback.onSuccess.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC58402zBa interfaceC58402zBa, RustBuffer.ByValue byValue) {
            interfaceC58402zBa.KWHzl((C58415zBn) FfiConverterTypeInitSessionResponse.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceInitSessionCallback() {
    }

    public static final class onError implements UniffiCallbackInterfaceInitSessionCallbackMethod1 {
        public static final int $stable = 0;
        public static final onError INSTANCE = new onError();

        private onError() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC58402zBa interfaceC58402zBaCopydefault = FfiConverterTypeInitSessionCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Ajp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceInitSessionCallback.onError.callback$lambda$0(interfaceC58402zBaCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Ajo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceInitSessionCallback.onError.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC58402zBa interfaceC58402zBa, RustBuffer.ByValue byValue) {
            interfaceC58402zBa.copydefault(FfiConverterString.INSTANCE.lift2(byValue));
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
            FfiConverterTypeInitSessionCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeInitSessionCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void AEQbTJ(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_initsessioncallback(vtable);
    }
}
