package uniffi.account;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C60173zxj;
import o.C60230zyn;
import o.C60289zzt;
import o.C60290zzu;
import o.C60292zzw;
import o.C60293zzx;
import o.zYM;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfacePasskeySyncCallback;
import uniffi.account.uniffiCallbackInterfacePasskeySyncCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfacePasskeySyncCallback {
    public static final uniffiCallbackInterfacePasskeySyncCallback INSTANCE = new uniffiCallbackInterfacePasskeySyncCallback();
    public static UniffiVTableCallbackInterfacePasskeySyncCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfacePasskeySyncCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onConnectionStateChanged.INSTANCE, onSessionIdReceived.INSTANCE, onCredentialInfoReceived.INSTANCE, onProtectionKeyReceived.INSTANCE, onErrorReceived.INSTANCE, onError.INSTANCE);
    public static final int $stable = 8;

    public static final class onConnectionStateChanged implements UniffiCallbackInterfacePasskeySyncCallbackMethod0 {
        public static final int $stable = 0;
        public static final onConnectionStateChanged INSTANCE = new onConnectionStateChanged();

        private onConnectionStateChanged() {
        }

        @Override // uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod0
        public void callback(long j, final byte b, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zYM zymCopydefault = FfiConverterTypePasskeySyncCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Ana
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfacePasskeySyncCallback.onConnectionStateChanged.callback$lambda$0(zymCopydefault, b, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AmZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePasskeySyncCallback.onConnectionStateChanged.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(zYM zym, byte b, RustBuffer.ByValue byValue) {
            zym.KWHzl(FfiConverterBoolean.INSTANCE.lift(b).booleanValue(), FfiConverterOptionalString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfacePasskeySyncCallback() {
    }

    public static final class onSessionIdReceived implements UniffiCallbackInterfacePasskeySyncCallbackMethod1 {
        public static final int $stable = 0;
        public static final onSessionIdReceived INSTANCE = new onSessionIdReceived();

        private onSessionIdReceived() {
        }

        @Override // uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zYM zymCopydefault = FfiConverterTypePasskeySyncCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Ank
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfacePasskeySyncCallback.onSessionIdReceived.callback$lambda$0(zymCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Anm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePasskeySyncCallback.onSessionIdReceived.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(zYM zym, RustBuffer.ByValue byValue) {
            zym.KWHzl((C60293zzx) FfiConverterTypeBleSyncSessionId.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class onCredentialInfoReceived implements UniffiCallbackInterfacePasskeySyncCallbackMethod2 {
        public static final int $stable = 0;
        public static final onCredentialInfoReceived INSTANCE = new onCredentialInfoReceived();

        private onCredentialInfoReceived() {
        }

        @Override // uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod2
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zYM zymCopydefault = FfiConverterTypePasskeySyncCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AmY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfacePasskeySyncCallback.onCredentialInfoReceived.callback$lambda$0(zymCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Anb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePasskeySyncCallback.onCredentialInfoReceived.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(zYM zym, RustBuffer.ByValue byValue) {
            zym.KWHzl((C60289zzt) FfiConverterTypeBleSyncCredentialInfo.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class onProtectionKeyReceived implements UniffiCallbackInterfacePasskeySyncCallbackMethod3 {
        public static final int $stable = 0;
        public static final onProtectionKeyReceived INSTANCE = new onProtectionKeyReceived();

        private onProtectionKeyReceived() {
        }

        @Override // uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod3
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zYM zymCopydefault = FfiConverterTypePasskeySyncCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Anf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfacePasskeySyncCallback.onProtectionKeyReceived.callback$lambda$0(zymCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Ani
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePasskeySyncCallback.onProtectionKeyReceived.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(zYM zym, RustBuffer.ByValue byValue) {
            zym.EZpvd((C60290zzu) FfiConverterTypeBleSyncProtectionKey.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class onErrorReceived implements UniffiCallbackInterfacePasskeySyncCallbackMethod4 {
        public static final int $stable = 0;
        public static final onErrorReceived INSTANCE = new onErrorReceived();

        private onErrorReceived() {
        }

        @Override // uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod4
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zYM zymCopydefault = FfiConverterTypePasskeySyncCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Ang
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfacePasskeySyncCallback.onErrorReceived.callback$lambda$0(zymCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.And
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePasskeySyncCallback.onErrorReceived.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(zYM zym, RustBuffer.ByValue byValue) {
            zym.OLrzqt((C60292zzw) FfiConverterTypeBleSyncError.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class onError implements UniffiCallbackInterfacePasskeySyncCallbackMethod5 {
        public static final int $stable = 0;
        public static final onError INSTANCE = new onError();

        private onError() {
        }

        @Override // uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod5
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zYM zymCopydefault = FfiConverterTypePasskeySyncCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Ane
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfacePasskeySyncCallback.onError.callback$lambda$0(zymCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Anh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePasskeySyncCallback.onError.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(zYM zym, RustBuffer.ByValue byValue) {
            zym.copydefault(FfiConverterString.INSTANCE.lift2(byValue));
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
            FfiConverterTypePasskeySyncCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypePasskeySyncCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void EZpvd(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_passkeysynccallback(vtable);
    }
}
