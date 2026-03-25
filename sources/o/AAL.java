package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.dex.FfiConverterLong;
import uniffi.dex.FfiConverterOptionalString;
import uniffi.dex.FfiConverterString;
import uniffi.dex.FfiConverterTypeBridgeApproveDataParamsJson;
import uniffi.dex.FfiConverterTypeBridgeApproveDataRequest;
import uniffi.dex.FfiConverterTypeOKRustFutureBridgePlatformCheckResponseWithOKFFIError;
import uniffi.dex.FfiConverterTypeOKRustFutureCoinCheckResultWithOKFFIError;
import uniffi.dex.FfiConverterTypeOKRustFutureDexHolderAnalysisDataWithOKFFIError;
import uniffi.dex.FfiConverterTypeOKRustFutureDexLiquidityChartDataWithOKFFIError;
import uniffi.dex.FfiConverterTypeOKRustFutureMarketChainListWithOKFFIError;
import uniffi.dex.FfiConverterTypeOKRustFutureOptionalBridgeApproveDataWithOKFFIError;
import uniffi.dex.FfiConverterTypeOKRustFutureOptionalCoinRiskDataWithOKFFIError;
import uniffi.dex.FfiConverterTypeOKRustFuturePresetRequestConfigWithOKFFIError;
import uniffi.dex.FfiConverterTypeOKRustFutureSummaryDataWithOKFFIError;
import uniffi.dex.FfiConverterTypePresetUserParams;
import uniffi.dex.FfiConverterTypePresetUserParamsJson;
import uniffi.dex.IntegrityCheckingUniffiLib;
import uniffi.dex.UniffiLib;
import uniffi.network.CacheStrategy;
import uniffi.network.FfiConverterTypeCacheStrategy;
import uniffi.ok_future_utils.FfiConverterTypeOKRustFutureStringWithOKFFIError;
import uniffi.ok_future_utils.FfiConverterTypeOKRustFutureboolWithOKFFIError;

/* JADX INFO: loaded from: classes13.dex */
public final class AAL {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new ActionBar());

    public static final class ActionBar implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_dex_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_dex_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_dex_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final C2242AEf bridgeApproveData(@NotNull final C4179Azv c4179Azv) {
        Intrinsics.checkNotNullParameter(c4179Azv, "");
        return FfiConverterTypeOKRustFutureOptionalBridgeApproveDataWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AAV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AAL.bridgeApproveData$lambda$0(c4179Azv, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long bridgeApproveData$lambda$0(C4179Azv c4179Azv, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_func_bridge_approve_data(FfiConverterTypeBridgeApproveDataRequest.INSTANCE.lower2((java.lang.Object) c4179Azv), uniffiRustCallStatus);
    }

    public static final C4439Bec bridgeApproveDataJson(@NotNull final C4182Azy c4182Azy) {
        Intrinsics.checkNotNullParameter(c4182Azy, "");
        return FfiConverterTypeOKRustFutureStringWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AAY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AAL.bridgeApproveDataJson$lambda$1(c4182Azy, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long bridgeApproveDataJson$lambda$1(C4182Azy c4182Azy, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_func_bridge_approve_data_json(FfiConverterTypeBridgeApproveDataParamsJson.INSTANCE.lower2((java.lang.Object) c4182Azy), uniffiRustCallStatus);
    }

    public static final ACF bridgePlatformCheck() {
        return FfiConverterTypeOKRustFutureBridgePlatformCheckResponseWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AAZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AAL.bridgePlatformCheck$lambda$2((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long bridgePlatformCheck$lambda$2(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_func_bridge_platform_check(uniffiRustCallStatus);
    }

    public static final C4439Bec bridgePlatformCheckJson() {
        return FfiConverterTypeOKRustFutureStringWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AAP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AAL.bridgePlatformCheckJson$lambda$3((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long bridgePlatformCheckJson$lambda$3(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_func_bridge_platform_check_json(uniffiRustCallStatus);
    }

    public static final ACT getCoinRisk(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterTypeOKRustFutureCoinCheckResultWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AAR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AAL.getCoinRisk$lambda$4(str, str2, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getCoinRisk$lambda$4(java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_dex_fn_func_get_coin_risk(ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
    }

    public static final C2257AEu getCoinRiskData(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterTypeOKRustFutureOptionalCoinRiskDataWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AAX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AAL.getCoinRiskData$lambda$5(str, str2, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getCoinRiskData$lambda$5(java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_dex_fn_func_get_coin_risk_data(ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
    }

    public static final C2221ADk getHolderAnalysis(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterTypeOKRustFutureDexHolderAnalysisDataWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AAS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AAL.getHolderAnalysis$lambda$6(str, str2, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getHolderAnalysis$lambda$6(java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_dex_fn_func_get_holder_analysis(ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
    }

    public static final C2275AFm getInsightsSummary(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return FfiConverterTypeOKRustFutureSummaryDataWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ABb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AAL.getInsightsSummary$lambda$7(str, str2, str3, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getInsightsSummary$lambda$7(java.lang.String str, java.lang.String str2, java.lang.String str3, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_dex_fn_func_get_insights_summary(ffiConverterString.lower2(str), ffiConverterString.lower2(str2), ffiConverterString.lower2(str3), uniffiRustCallStatus);
    }

    public static final C2234ADx getLiquidityChart(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterTypeOKRustFutureDexLiquidityChartDataWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AAQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AAL.getLiquidityChart$lambda$8(str, str2, str3, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getLiquidityChart$lambda$8(java.lang.String str, java.lang.String str2, java.lang.String str3, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_dex_fn_func_get_liquidity_chart(ffiConverterString.lower2(str), ffiConverterString.lower2(str2), FfiConverterOptionalString.INSTANCE.lower2(str3), uniffiRustCallStatus);
    }

    public static final ADO getMarketChainList(@NotNull final CacheStrategy cacheStrategy) {
        Intrinsics.checkNotNullParameter(cacheStrategy, "");
        return FfiConverterTypeOKRustFutureMarketChainListWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AAT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AAL.getMarketChainList$lambda$9(cacheStrategy, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getMarketChainList$lambda$9(CacheStrategy cacheStrategy, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_func_get_market_chain_list(FfiConverterTypeCacheStrategy.INSTANCE.lower2((java.lang.Object) cacheStrategy), uniffiRustCallStatus);
    }

    public static final AEH resetPresetConfig(@NotNull final java.lang.String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterTypeOKRustFuturePresetRequestConfigWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AAO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AAL.resetPresetConfig$lambda$10(str, j, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long resetPresetConfig$lambda$10(java.lang.String str, long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_func_reset_preset_config(FfiConverterString.INSTANCE.lower2(str), FfiConverterLong.INSTANCE.lower(j).longValue(), uniffiRustCallStatus);
    }

    public static final C4439Bec resetPresetConfigJson(@NotNull final java.lang.String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterTypeOKRustFutureStringWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AAU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AAL.resetPresetConfigJson$lambda$11(str, j, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long resetPresetConfigJson$lambda$11(java.lang.String str, long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_func_reset_preset_config_json(FfiConverterString.INSTANCE.lower2(str), FfiConverterLong.INSTANCE.lower(j).longValue(), uniffiRustCallStatus);
    }

    public static final C4449Bem savePresetConfig(@NotNull final C2297AGi c2297AGi) {
        Intrinsics.checkNotNullParameter(c2297AGi, "");
        return FfiConverterTypeOKRustFutureboolWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AAW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AAL.savePresetConfig$lambda$12(c2297AGi, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long savePresetConfig$lambda$12(C2297AGi c2297AGi, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_func_save_preset_config(FfiConverterTypePresetUserParams.INSTANCE.lower2((java.lang.Object) c2297AGi), uniffiRustCallStatus);
    }

    public static final C4449Bem savePresetConfigJson(@NotNull final C2299AGk c2299AGk) {
        Intrinsics.checkNotNullParameter(c2299AGk, "");
        return FfiConverterTypeOKRustFutureboolWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AAN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AAL.savePresetConfigJson$lambda$13(c2299AGk, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long savePresetConfigJson$lambda$13(C2299AGk c2299AGk, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_func_save_preset_config_json(FfiConverterTypePresetUserParamsJson.INSTANCE.lower2((java.lang.Object) c2299AGk), uniffiRustCallStatus);
    }
}
