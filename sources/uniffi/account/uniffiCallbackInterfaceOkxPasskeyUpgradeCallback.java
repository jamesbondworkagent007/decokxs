package uniffi.account;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C3492Amv;
import o.C60173zxj;
import o.C60230zyn;
import o.C60231zyo;
import o.InterfaceC58915zUd;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback;
import uniffi.account.uniffiCallbackInterfaceOkxPasskeyUpgradeCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceOkxPasskeyUpgradeCallback {
    public static final uniffiCallbackInterfaceOkxPasskeyUpgradeCallback INSTANCE = new uniffiCallbackInterfaceOkxPasskeyUpgradeCallback();
    public static UniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onSuccess.INSTANCE, onFailure.INSTANCE);
    public static final int $stable = 8;

    public static final class onSuccess implements UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0 {
        public static final int $stable = 0;
        public static final onSuccess INSTANCE = new onSuccess();

        private onSuccess() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC58915zUd interfaceC58915zUdCopydefault = FfiConverterTypeOkxPasskeyUpgradeCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Amu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceOkxPasskeyUpgradeCallback.onSuccess.callback$lambda$0(interfaceC58915zUdCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Amy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOkxPasskeyUpgradeCallback.onSuccess.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC58915zUd interfaceC58915zUd) {
            interfaceC58915zUd.copydefault();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceOkxPasskeyUpgradeCallback() {
    }

    public static final class onFailure implements UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1 {
        public static final int $stable = 0;
        public static final onFailure INSTANCE = new onFailure();

        private onFailure() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            C3492Amv c3492Amv = new C3492Amv(FfiConverterTypeOkxPasskeyUpgradeCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue);
            Function1 function1 = new Function1() { // from class: o.Amx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOkxPasskeyUpgradeCallback.onFailure.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(c3492Amv.invoke());
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
        public static final Unit callback$lambda$0(InterfaceC58915zUd interfaceC58915zUd, RustBuffer.ByValue byValue) {
            interfaceC58915zUd.KWHzl((C60231zyo) FfiConverterTypeAccountError.INSTANCE.lift2(byValue));
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
            FfiConverterTypeOkxPasskeyUpgradeCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeOkxPasskeyUpgradeCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void EZpvd(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_okxpasskeyupgradecallback(vtable);
    }
}
