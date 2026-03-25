package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.wallet.FfiConverterMapStringString;
import uniffi.wallet.FfiConverterSequenceString;
import uniffi.wallet.FfiConverterTypeCommonHeader;
import uniffi.wallet.FfiConverterTypeSignedHeader;
import uniffi.wallet.FfiConverterTypeWalletHeaderProvider;
import uniffi.wallet.IntegrityCheckingUniffiLib;
import uniffi.wallet.UniffiLib;
import uniffi.wallet.WalletHeaderProviderException;

/* JADX INFO: loaded from: classes14.dex */
public final class BCE {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new TaskDescription());

    public static final class TaskDescription implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_wallet_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_wallet_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_wallet_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final BCr getCommonHeader() throws WalletHeaderProviderException {
        return (BCr) FfiConverterTypeCommonHeader.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCallWithError(uniffiRustBuffer, WalletHeaderProviderException.ErrorHandler, new Function1() { // from class: o.BCF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BCE.getCommonHeader$lambda$0((UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue getCommonHeader$lambda$0(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_wallet_fn_func_get_common_header(uniffiRustCallStatus);
    }

    public static final java.util.Map<java.lang.String, java.lang.String> getCommonHeaderMap() throws WalletHeaderProviderException {
        return (java.util.Map) FfiConverterMapStringString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCallWithError(uniffiRustBuffer, WalletHeaderProviderException.ErrorHandler, new Function1() { // from class: o.BCJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BCE.getCommonHeaderMap$lambda$1((UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue getCommonHeaderMap$lambda$1(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_wallet_fn_func_get_common_header_map(uniffiRustCallStatus);
    }

    public static final BCp getSignedHeader() throws WalletHeaderProviderException {
        return (BCp) FfiConverterTypeSignedHeader.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCallWithError(uniffiRustBuffer, WalletHeaderProviderException.ErrorHandler, new Function1() { // from class: o.BCI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BCE.getSignedHeader$lambda$2((UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue getSignedHeader$lambda$2(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_wallet_fn_func_get_signed_header(uniffiRustCallStatus);
    }

    public static final java.util.Map<java.lang.String, java.lang.String> getSignedHeaderMap() throws WalletHeaderProviderException {
        return (java.util.Map) FfiConverterMapStringString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCallWithError(uniffiRustBuffer, WalletHeaderProviderException.ErrorHandler, new Function1() { // from class: o.BCD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BCE.getSignedHeaderMap$lambda$3((UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue getSignedHeaderMap$lambda$3(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_wallet_fn_func_get_signed_header_map(uniffiRustCallStatus);
    }

    public static final void registerWalletHeaderProvider(@NotNull final BCu bCu) {
        Intrinsics.checkNotNullParameter(bCu, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BCC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BCE.registerWalletHeaderProvider$lambda$4(bCu, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerWalletHeaderProvider$lambda$4(BCu bCu, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_wallet_fn_func_register_wallet_header_provider(FfiConverterTypeWalletHeaderProvider.INSTANCE.lower2(bCu).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void walletWsOnWalletChanged(@NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BCH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BCE.walletWsOnWalletChanged$lambda$5(list, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit walletWsOnWalletChanged$lambda$5(java.util.List list, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_wallet_fn_func_wallet_ws_on_wallet_changed(FfiConverterSequenceString.INSTANCE.lower2((java.lang.Object) list), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void walletWsSetAddresses(@NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BCG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BCE.walletWsSetAddresses$lambda$6(list, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit walletWsSetAddresses$lambda$6(java.util.List list, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_wallet_fn_func_wallet_ws_set_addresses(FfiConverterSequenceString.INSTANCE.lower2((java.lang.Object) list), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
