package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.dex.FfiConverterTypeOKRustFutureTokenListResultWithOKFFIError;
import uniffi.dex.FfiConverterTypeSingleTokenListRequest;
import uniffi.dex.UniffiLib;
import uniffi.network.CacheStrategy;
import uniffi.network.FfiConverterTypeCacheStrategy;

/* JADX INFO: renamed from: o.AGo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C2303AGo extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2303AGo(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), AAL.uniffiRustBuffer, new Function2() { // from class: o.AGv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2303AGo.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AGx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2303AGo.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_dex_fn_free_singletokenlistmanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_clone_singletokenlistmanager(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2303AGo(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), AAL.uniffiRustBuffer, new Function2() { // from class: o.AGD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2303AGo.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AGr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2303AGo.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_dex_fn_free_singletokenlistmanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_clone_singletokenlistmanager(j, uniffiRustCallStatus);
    }

    public C2303AGo() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AGs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2303AGo.OLrzqt((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_constructor_singletokenlistmanager_new(uniffiRustCallStatus);
    }

    public AFR KWHzl(@NotNull final AGF agf, @NotNull final CacheStrategy cacheStrategy) {
        Intrinsics.checkNotNullParameter(agf, "");
        Intrinsics.checkNotNullParameter(cacheStrategy, "");
        return FfiConverterTypeOKRustFutureTokenListResultWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AGm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2303AGo.getAllNetworkTokens$lambda$6(agf, cacheStrategy, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long getAllNetworkTokens$lambda$6(final AGF agf, final CacheStrategy cacheStrategy, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AGn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2303AGo.getAllNetworkTokens$lambda$6$lambda$5(j, agf, cacheStrategy, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long getAllNetworkTokens$lambda$6$lambda$5(long j, AGF agf, CacheStrategy cacheStrategy, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_method_singletokenlistmanager_get_all_network_tokens(j, FfiConverterTypeSingleTokenListRequest.INSTANCE.lower2((java.lang.Object) agf), FfiConverterTypeCacheStrategy.INSTANCE.lower2((java.lang.Object) cacheStrategy), uniffiRustCallStatus);
    }

    public AFR EZpvd(@NotNull final AGF agf, @NotNull final CacheStrategy cacheStrategy) {
        Intrinsics.checkNotNullParameter(agf, "");
        Intrinsics.checkNotNullParameter(cacheStrategy, "");
        return FfiConverterTypeOKRustFutureTokenListResultWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AGt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2303AGo.getCollectionTokens$lambda$8(agf, cacheStrategy, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long getCollectionTokens$lambda$8(final AGF agf, final CacheStrategy cacheStrategy, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AGA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2303AGo.getCollectionTokens$lambda$8$lambda$7(j, agf, cacheStrategy, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long getCollectionTokens$lambda$8$lambda$7(long j, AGF agf, CacheStrategy cacheStrategy, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_method_singletokenlistmanager_get_collection_tokens(j, FfiConverterTypeSingleTokenListRequest.INSTANCE.lower2((java.lang.Object) agf), FfiConverterTypeCacheStrategy.INSTANCE.lower2((java.lang.Object) cacheStrategy), uniffiRustCallStatus);
    }

    public AFR copydefault(@NotNull final AGF agf, @NotNull final CacheStrategy cacheStrategy) {
        Intrinsics.checkNotNullParameter(agf, "");
        Intrinsics.checkNotNullParameter(cacheStrategy, "");
        return FfiConverterTypeOKRustFutureTokenListResultWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AGu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2303AGo.getSingleChainTokens$lambda$10(agf, cacheStrategy, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long getSingleChainTokens$lambda$10(final AGF agf, final CacheStrategy cacheStrategy, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AGy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2303AGo.getSingleChainTokens$lambda$10$lambda$9(j, agf, cacheStrategy, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long getSingleChainTokens$lambda$10$lambda$9(long j, AGF agf, CacheStrategy cacheStrategy, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_method_singletokenlistmanager_get_single_chain_tokens(j, FfiConverterTypeSingleTokenListRequest.INSTANCE.lower2((java.lang.Object) agf), FfiConverterTypeCacheStrategy.INSTANCE.lower2((java.lang.Object) cacheStrategy), uniffiRustCallStatus);
    }

    public AFR AEQbTJ(@NotNull final AGF agf, @NotNull final CacheStrategy cacheStrategy) {
        Intrinsics.checkNotNullParameter(agf, "");
        Intrinsics.checkNotNullParameter(cacheStrategy, "");
        return FfiConverterTypeOKRustFutureTokenListResultWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AGz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2303AGo.searchTokens$lambda$12(agf, cacheStrategy, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long searchTokens$lambda$12(final AGF agf, final CacheStrategy cacheStrategy, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AGw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2303AGo.searchTokens$lambda$12$lambda$11(j, agf, cacheStrategy, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long searchTokens$lambda$12$lambda$11(long j, AGF agf, CacheStrategy cacheStrategy, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_method_singletokenlistmanager_search_tokens(j, FfiConverterTypeSingleTokenListRequest.INSTANCE.lower2((java.lang.Object) agf), FfiConverterTypeCacheStrategy.INSTANCE.lower2((java.lang.Object) cacheStrategy), uniffiRustCallStatus);
    }
}
