package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.dex.DexStrategyBizMode;
import uniffi.dex.FfiConverterBoolean;
import uniffi.dex.FfiConverterOptionalString;
import uniffi.dex.FfiConverterString;
import uniffi.dex.FfiConverterTypeDexStrategyBizMode;
import uniffi.dex.FfiConverterTypeOKRustFutureBridgeChainListWithOKFFIError;
import uniffi.dex.FfiConverterTypeOKRustFutureStrategyChainListWithOKFFIError;
import uniffi.dex.FfiConverterTypeOKRustFutureSwapChainListWithOKFFIError;
import uniffi.dex.UniffiLib;

/* JADX INFO: renamed from: o.AAq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C2149AAq extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2149AAq(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), AAL.uniffiRustBuffer, new Function2() { // from class: o.AAr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2149AAq.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AAx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2149AAq.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_dex_fn_free_dexchainsmanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_clone_dexchainsmanager(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2149AAq(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), AAL.uniffiRustBuffer, new Function2() { // from class: o.AAH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2149AAq.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AAF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2149AAq.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_dex_fn_free_dexchainsmanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_clone_dexchainsmanager(j, uniffiRustCallStatus);
    }

    public C2149AAq() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AAD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2149AAq.copydefault((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_constructor_dexchainsmanager_new(uniffiRustCallStatus);
    }

    public C2204ACt AEQbTJ() {
        return FfiConverterTypeOKRustFutureBridgeChainListWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AAz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2149AAq.getBridgeSupportChains$lambda$6(((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long getBridgeSupportChains$lambda$6(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2149AAq.getBridgeSupportChains$lambda$6$lambda$5(j, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long getBridgeSupportChains$lambda$6$lambda$5(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_method_dexchainsmanager_get_bridge_support_chains(j, uniffiRustCallStatus);
    }

    public AEX copydefault(@NotNull final DexStrategyBizMode dexStrategyBizMode, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(dexStrategyBizMode, "");
        return FfiConverterTypeOKRustFutureStrategyChainListWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2149AAq.getStrategyChains$lambda$8(dexStrategyBizMode, str, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long getStrategyChains$lambda$8(final DexStrategyBizMode dexStrategyBizMode, final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AAE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2149AAq.getStrategyChains$lambda$8$lambda$7(j, dexStrategyBizMode, str, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long getStrategyChains$lambda$8$lambda$7(long j, DexStrategyBizMode dexStrategyBizMode, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_method_dexchainsmanager_get_strategy_chains(j, FfiConverterTypeDexStrategyBizMode.INSTANCE.lower2((java.lang.Object) dexStrategyBizMode), FfiConverterOptionalString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public AFB EZpvd() {
        return FfiConverterTypeOKRustFutureSwapChainListWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AAA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2149AAq.getSwapChains$lambda$10(((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long getSwapChains$lambda$10(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AAB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2149AAq.getSwapChains$lambda$10$lambda$9(j, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long getSwapChains$lambda$10$lambda$9(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_method_dexchainsmanager_get_swap_chains(j, uniffiRustCallStatus);
    }

    public static final byte isCurrentChainInsideLimitChains$lambda$12(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AAG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2149AAq.isCurrentChainInsideLimitChains$lambda$12$lambda$11(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isCurrentChainInsideLimitChains$lambda$12$lambda$11(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_method_dexchainsmanager_is_current_chain_inside_limit_chains(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public boolean EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AAw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2149AAq.isServerSupportAdvanceLimit$lambda$14(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isServerSupportAdvanceLimit$lambda$14(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AAu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2149AAq.isServerSupportAdvanceLimit$lambda$14$lambda$13(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isServerSupportAdvanceLimit$lambda$14$lambda$13(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_method_dexchainsmanager_is_server_support_advance_limit(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public boolean OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AAC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2149AAq.isServerSupportTpsl$lambda$16(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isServerSupportTpsl$lambda$16(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AAv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2149AAq.isServerSupportTpsl$lambda$16$lambda$15(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isServerSupportTpsl$lambda$16$lambda$15(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_method_dexchainsmanager_is_server_support_tpsl(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }
}
