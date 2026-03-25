package uniffi.account;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C59056zZo;
import o.C60173zxj;
import o.C60230zyn;
import o.InterfaceC59050zZi;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfacePasskeyVerifyCallback;
import uniffi.account.uniffiCallbackInterfacePasskeyVerifyCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfacePasskeyVerifyCallback {
    public static final uniffiCallbackInterfacePasskeyVerifyCallback INSTANCE = new uniffiCallbackInterfacePasskeyVerifyCallback();
    public static UniffiVTableCallbackInterfacePasskeyVerifyCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfacePasskeyVerifyCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onReceived.INSTANCE);
    public static final int $stable = 8;

    public static final class onReceived implements UniffiCallbackInterfacePasskeyVerifyCallbackMethod0 {
        public static final int $stable = 0;
        public static final onReceived INSTANCE = new onReceived();

        private onReceived() {
        }

        @Override // uniffi.account.UniffiCallbackInterfacePasskeyVerifyCallbackMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC59050zZi interfaceC59050zZiCopydefault = FfiConverterTypePasskeyVerifyCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Anl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfacePasskeyVerifyCallback.onReceived.callback$lambda$0(interfaceC59050zZiCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Anj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePasskeyVerifyCallback.onReceived.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC59050zZi interfaceC59050zZi, RustBuffer.ByValue byValue) {
            interfaceC59050zZi.copydefault((C59056zZo) FfiConverterTypePasskeyVerifyInfo.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfacePasskeyVerifyCallback() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypePasskeyVerifyCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypePasskeyVerifyCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void KWHzl(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_passkeyverifycallback(vtable);
    }
}
