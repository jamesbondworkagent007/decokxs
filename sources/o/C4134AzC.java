package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.dex.FfiConverterTypeBridgeTokenListRequest;
import uniffi.dex.FfiConverterTypeOKRustFutureTokenListResultWithOKFFIError;
import uniffi.dex.UniffiLib;
import uniffi.network.CacheStrategy;
import uniffi.network.FfiConverterTypeCacheStrategy;

/* JADX INFO: renamed from: o.AzC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C4134AzC extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4134AzC(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), AAL.uniffiRustBuffer, new Function2() { // from class: o.AzL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4134AzC.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AzO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4134AzC.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_dex_fn_free_bridgetokenlistmanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_clone_bridgetokenlistmanager(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4134AzC(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), AAL.uniffiRustBuffer, new Function2() { // from class: o.AzF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4134AzC.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AzG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4134AzC.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_dex_fn_free_bridgetokenlistmanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_clone_bridgetokenlistmanager(j, uniffiRustCallStatus);
    }

    public C4134AzC() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AzJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4134AzC.AEQbTJ((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_constructor_bridgetokenlistmanager_new(uniffiRustCallStatus);
    }

    public AFR AEQbTJ(@NotNull final C4149AzR c4149AzR, @NotNull final CacheStrategy cacheStrategy) {
        Intrinsics.checkNotNullParameter(c4149AzR, "");
        Intrinsics.checkNotNullParameter(cacheStrategy, "");
        return FfiConverterTypeOKRustFutureTokenListResultWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AzI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4134AzC.getBridgeTokens$lambda$6(c4149AzR, cacheStrategy, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long getBridgeTokens$lambda$6(final C4149AzR c4149AzR, final CacheStrategy cacheStrategy, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AzN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4134AzC.getBridgeTokens$lambda$6$lambda$5(j, c4149AzR, cacheStrategy, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long getBridgeTokens$lambda$6$lambda$5(long j, C4149AzR c4149AzR, CacheStrategy cacheStrategy, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_method_bridgetokenlistmanager_get_bridge_tokens(j, FfiConverterTypeBridgeTokenListRequest.INSTANCE.lower2((java.lang.Object) c4149AzR), FfiConverterTypeCacheStrategy.INSTANCE.lower2((java.lang.Object) cacheStrategy), uniffiRustCallStatus);
    }

    public AFR copydefault(@NotNull final C4149AzR c4149AzR, @NotNull final CacheStrategy cacheStrategy) {
        Intrinsics.checkNotNullParameter(c4149AzR, "");
        Intrinsics.checkNotNullParameter(cacheStrategy, "");
        return FfiConverterTypeOKRustFutureTokenListResultWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AzK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4134AzC.getCollectionTokens$lambda$8(c4149AzR, cacheStrategy, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long getCollectionTokens$lambda$8(final C4149AzR c4149AzR, final CacheStrategy cacheStrategy, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AzB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4134AzC.getCollectionTokens$lambda$8$lambda$7(j, c4149AzR, cacheStrategy, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long getCollectionTokens$lambda$8$lambda$7(long j, C4149AzR c4149AzR, CacheStrategy cacheStrategy, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_method_bridgetokenlistmanager_get_collection_tokens(j, FfiConverterTypeBridgeTokenListRequest.INSTANCE.lower2((java.lang.Object) c4149AzR), FfiConverterTypeCacheStrategy.INSTANCE.lower2((java.lang.Object) cacheStrategy), uniffiRustCallStatus);
    }

    public AFR EZpvd(@NotNull final C4149AzR c4149AzR, @NotNull final CacheStrategy cacheStrategy) {
        Intrinsics.checkNotNullParameter(c4149AzR, "");
        Intrinsics.checkNotNullParameter(cacheStrategy, "");
        return FfiConverterTypeOKRustFutureTokenListResultWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AzH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4134AzC.searchTokens$lambda$10(c4149AzR, cacheStrategy, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long searchTokens$lambda$10(final C4149AzR c4149AzR, final CacheStrategy cacheStrategy, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AzM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4134AzC.searchTokens$lambda$10$lambda$9(j, c4149AzR, cacheStrategy, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long searchTokens$lambda$10$lambda$9(long j, C4149AzR c4149AzR, CacheStrategy cacheStrategy, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_method_bridgetokenlistmanager_search_tokens(j, FfiConverterTypeBridgeTokenListRequest.INSTANCE.lower2((java.lang.Object) c4149AzR), FfiConverterTypeCacheStrategy.INSTANCE.lower2((java.lang.Object) cacheStrategy), uniffiRustCallStatus);
    }
}
