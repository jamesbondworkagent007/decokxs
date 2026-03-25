package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.network.FfiConverterString;
import uniffi.network.FfiConverterTypeLegacyDownloadFactory;
import uniffi.network.FfiConverterTypeNetworkState;
import uniffi.network.FfiConverterTypeOKXRequestFactory;
import uniffi.network.FfiConverterTypeOKXWsFactory;
import uniffi.network.FfiConverterTypePlatformDohManager;
import uniffi.network.IntegrityCheckingUniffiLib;
import uniffi.network.UniffiLib;

/* JADX INFO: renamed from: o.Bav, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C4298Bav {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new StateListAnimator());

    /* JADX INFO: renamed from: o.Bav$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_network_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_network_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_network_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final java.lang.String getHttpBaseUrl() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BaD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4298Bav.getHttpBaseUrl$lambda$0((UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue getHttpBaseUrl$lambda$0(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_func_get_http_base_url(uniffiRustCallStatus);
    }

    public static final java.lang.String getWeb3HttpBaseUrl() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BaB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4298Bav.getWeb3HttpBaseUrl$lambda$1((UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue getWeb3HttpBaseUrl$lambda$1(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_func_get_web3_http_base_url(uniffiRustCallStatus);
    }

    public static final java.lang.String getWsCefiUrl() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BaM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4298Bav.getWsCefiUrl$lambda$2((UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue getWsCefiUrl$lambda$2(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_func_get_ws_cefi_url(uniffiRustCallStatus);
    }

    public static final java.lang.String getWsDefiUrl() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BaH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4298Bav.getWsDefiUrl$lambda$3((UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue getWsDefiUrl$lambda$3(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_func_get_ws_defi_url(uniffiRustCallStatus);
    }

    public static final void initNetworkStateChangeWatcher(@NotNull final C4259BaI c4259BaI) {
        Intrinsics.checkNotNullParameter(c4259BaI, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BaE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4298Bav.initNetworkStateChangeWatcher$lambda$4(c4259BaI, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit initNetworkStateChangeWatcher$lambda$4(C4259BaI c4259BaI, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_func_init_network_state_change_watcher(FfiConverterTypeNetworkState.INSTANCE.lower2((java.lang.Object) c4259BaI), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void networkDidChanged(@NotNull final C4259BaI c4259BaI, @NotNull final C4259BaI c4259BaI2) {
        Intrinsics.checkNotNullParameter(c4259BaI, "");
        Intrinsics.checkNotNullParameter(c4259BaI2, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Baz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4298Bav.networkDidChanged$lambda$5(c4259BaI, c4259BaI2, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit networkDidChanged$lambda$5(C4259BaI c4259BaI, C4259BaI c4259BaI2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterTypeNetworkState ffiConverterTypeNetworkState = FfiConverterTypeNetworkState.INSTANCE;
        uniffiLib.uniffi_network_fn_func_network_did_changed(ffiConverterTypeNetworkState.lower2((java.lang.Object) c4259BaI), ffiConverterTypeNetworkState.lower2((java.lang.Object) c4259BaI2), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerLegacyDownloadFactory(@NotNull final InterfaceC2800AZs interfaceC2800AZs) {
        Intrinsics.checkNotNullParameter(interfaceC2800AZs, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bay
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4298Bav.registerLegacyDownloadFactory$lambda$6(interfaceC2800AZs, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerLegacyDownloadFactory$lambda$6(InterfaceC2800AZs interfaceC2800AZs, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_func_register_legacy_download_factory(FfiConverterTypeLegacyDownloadFactory.INSTANCE.lower2(interfaceC2800AZs).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerOkxRequestFactory(@NotNull final InterfaceC4346Bbq interfaceC4346Bbq) {
        Intrinsics.checkNotNullParameter(interfaceC4346Bbq, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BaG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4298Bav.registerOkxRequestFactory$lambda$7(interfaceC4346Bbq, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerOkxRequestFactory$lambda$7(InterfaceC4346Bbq interfaceC4346Bbq, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_func_register_okx_request_factory(FfiConverterTypeOKXRequestFactory.INSTANCE.lower2(interfaceC4346Bbq).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerOkxWsFactory(@NotNull final InterfaceC4354Bby interfaceC4354Bby) {
        Intrinsics.checkNotNullParameter(interfaceC4354Bby, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BaA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4298Bav.registerOkxWsFactory$lambda$8(interfaceC4354Bby, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerOkxWsFactory$lambda$8(InterfaceC4354Bby interfaceC4354Bby, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_func_register_okx_ws_factory(FfiConverterTypeOKXWsFactory.INSTANCE.lower2(interfaceC4354Bby).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerPlatformDohManager(@NotNull final InterfaceC4310BbG interfaceC4310BbG) {
        Intrinsics.checkNotNullParameter(interfaceC4310BbG, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BaF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4298Bav.registerPlatformDohManager$lambda$9(interfaceC4310BbG, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerPlatformDohManager$lambda$9(InterfaceC4310BbG interfaceC4310BbG, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_func_register_platform_doh_manager(FfiConverterTypePlatformDohManager.INSTANCE.lower2(interfaceC4310BbG).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void setHttpBaseUrl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bat
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4298Bav.setHttpBaseUrl$lambda$10(str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit setHttpBaseUrl$lambda$10(java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_func_set_http_base_url(FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void setWeb3HttpBaseUrl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BaK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4298Bav.setWeb3HttpBaseUrl$lambda$11(str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit setWeb3HttpBaseUrl$lambda$11(java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_func_set_web3_http_base_url(FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void setWsCefiUrl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BaL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4298Bav.setWsCefiUrl$lambda$12(str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit setWsCefiUrl$lambda$12(java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_func_set_ws_cefi_url(FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void setWsDefiUrl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BaC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4298Bav.setWsDefiUrl$lambda$13(str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit setWsDefiUrl$lambda$13(java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_func_set_ws_defi_url(FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
