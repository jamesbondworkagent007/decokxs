package uniffi.wallet;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BCE;
import o.BCp;
import o.BCr;
import o.BCu;
import o.C60173zxj;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.wallet.UniffiVTableCallbackInterfaceWalletHeaderProvider;
import uniffi.wallet.uniffiCallbackInterfaceWalletHeaderProvider;

/* JADX INFO: loaded from: classes14.dex */
public final class uniffiCallbackInterfaceWalletHeaderProvider {
    public static final uniffiCallbackInterfaceWalletHeaderProvider INSTANCE = new uniffiCallbackInterfaceWalletHeaderProvider();
    public static UniffiVTableCallbackInterfaceWalletHeaderProvider.UniffiByValue vtable = new UniffiVTableCallbackInterfaceWalletHeaderProvider.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, getSignedHeader.INSTANCE, getCommonHeader.INSTANCE);
    public static final int $stable = 8;

    public static final class getSignedHeader implements UniffiCallbackInterfaceWalletHeaderProviderMethod0 {
        public static final int $stable = 0;
        public static final getSignedHeader INSTANCE = new getSignedHeader();

        private getSignedHeader() {
        }

        @Override // uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod0
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final BCu bCuCopydefault = FfiConverterTypeWalletHeaderProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BCN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return bCuCopydefault.copydefault();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BCQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceWalletHeaderProvider.getSignedHeader.callback$lambda$1(rustBuffer, (BCp) obj);
                }
            };
            RustBuffer rustBuffer2 = BCE.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                if (e instanceof WalletHeaderProviderException) {
                    uniffiRustCallStatus.code = (byte) 1;
                    uniffiRustCallStatus.error_buf = FfiConverterTypeWalletHeaderProviderError.INSTANCE.lower2(e);
                } else {
                    Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                    if (unExceptionReport != null) {
                        unExceptionReport.invoke(e);
                    }
                    uniffiRustCallStatus.code = (byte) 2;
                    uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer2).lower2(e.toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, BCp bCp) {
            Intrinsics.checkNotNullParameter(bCp, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterTypeSignedHeader.INSTANCE.lower2((Object) bCp));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceWalletHeaderProvider() {
    }

    public static final class getCommonHeader implements UniffiCallbackInterfaceWalletHeaderProviderMethod1 {
        public static final int $stable = 0;
        public static final getCommonHeader INSTANCE = new getCommonHeader();

        private getCommonHeader() {
        }

        @Override // uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod1
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final BCu bCuCopydefault = FfiConverterTypeWalletHeaderProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BCL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return bCuCopydefault.AEQbTJ();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BCK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceWalletHeaderProvider.getCommonHeader.callback$lambda$1(rustBuffer, (BCr) obj);
                }
            };
            RustBuffer rustBuffer2 = BCE.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer2).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, BCr bCr) {
            Intrinsics.checkNotNullParameter(bCr, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterTypeCommonHeader.INSTANCE.lower2((Object) bCr));
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
            FfiConverterTypeWalletHeaderProvider.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeWalletHeaderProvider.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void AEQbTJ(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_wallet_fn_init_callback_vtable_walletheaderprovider(vtable);
    }
}
