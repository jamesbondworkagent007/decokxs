package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.ok_future_utils.FfiConverterTypeOKRustFutureboolWithOKFFIError;
import uniffi.retail_trading.DexPeriod;
import uniffi.retail_trading.DexSortBy;
import uniffi.retail_trading.FfiConverterOptionalString;
import uniffi.retail_trading.FfiConverterOptionalUInt;
import uniffi.retail_trading.FfiConverterSequenceTypeDexInstrument;
import uniffi.retail_trading.FfiConverterTypeDexChainGroupVo;
import uniffi.retail_trading.FfiConverterTypeDexListUpdateCallback;
import uniffi.retail_trading.FfiConverterTypeDexPeriod;
import uniffi.retail_trading.FfiConverterTypeDexSortBy;
import uniffi.retail_trading.FfiConverterTypeOKRustFutureDexChainGroupVoListWithOKFFIError;
import uniffi.retail_trading.FfiConverterTypeOKRustFutureDexTokenVoListWithOKFFIError;
import uniffi.retail_trading.FfiConverterTypeOKRustFutureSearchDexVosResultWithOKFFIError;
import uniffi.retail_trading.FfiConverterTypeSortOrder;
import uniffi.retail_trading.SortOrder;
import uniffi.retail_trading.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public class BkX extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BkX(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), BlA.uniffiRustBuffer, new Function2() { // from class: o.Bld
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BkX.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Blg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BkX.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_trading_fn_free_retaildexbridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_clone_retaildexbridge(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BkX(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), BlA.uniffiRustBuffer, new Function2() { // from class: o.Bll
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BkX.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bli
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BkX.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_trading_fn_free_retaildexbridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_clone_retaildexbridge(j, uniffiRustCallStatus);
    }

    public BkX() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(BlA.uniffiRustBuffer, new Function1() { // from class: o.Blo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BkX.EZpvd((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_constructor_retaildexbridge_new(uniffiRustCallStatus);
    }

    public C4449Bem KWHzl(@NotNull final BjD bjD, @NotNull final DexPeriod dexPeriod, @NotNull final DexSortBy dexSortBy, @NotNull final SortOrder sortOrder, final C56395yDu c56395yDu, @NotNull final BjI bjI) {
        Intrinsics.checkNotNullParameter(bjD, "");
        Intrinsics.checkNotNullParameter(dexPeriod, "");
        Intrinsics.checkNotNullParameter(dexSortBy, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        Intrinsics.checkNotNullParameter(bjI, "");
        return FfiConverterTypeOKRustFutureboolWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Blf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BkX.getAndSubscribeDexRankingList_xKlDIQ0$lambda$6(bjD, dexPeriod, dexSortBy, sortOrder, c56395yDu, bjI, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long getAndSubscribeDexRankingList_xKlDIQ0$lambda$6(final BjD bjD, final DexPeriod dexPeriod, final DexSortBy dexSortBy, final SortOrder sortOrder, final C56395yDu c56395yDu, final BjI bjI, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BlA.uniffiRustBuffer, new Function1() { // from class: o.Blc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BkX.getAndSubscribeDexRankingList_xKlDIQ0$lambda$6$lambda$5(j, bjD, dexPeriod, dexSortBy, sortOrder, c56395yDu, bjI, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long getAndSubscribeDexRankingList_xKlDIQ0$lambda$6$lambda$5(long j, BjD bjD, DexPeriod dexPeriod, DexSortBy dexSortBy, SortOrder sortOrder, C56395yDu c56395yDu, BjI bjI, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_method_retaildexbridge_get_and_subscribe_dex_ranking_list(j, FfiConverterTypeDexChainGroupVo.INSTANCE.lower2((java.lang.Object) bjD), FfiConverterTypeDexPeriod.INSTANCE.lower2((java.lang.Object) dexPeriod), FfiConverterTypeDexSortBy.INSTANCE.lower2((java.lang.Object) dexSortBy), FfiConverterTypeSortOrder.INSTANCE.lower2((java.lang.Object) sortOrder), FfiConverterOptionalUInt.INSTANCE.lower2(c56395yDu), FfiConverterTypeDexListUpdateCallback.INSTANCE.lower2(bjI).longValue(), uniffiRustCallStatus);
    }

    public BjX OLrzqt() {
        return FfiConverterTypeOKRustFutureDexChainGroupVoListWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Blm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BkX.getDexChainGroupList$lambda$8(((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long getDexChainGroupList$lambda$8(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BlA.uniffiRustBuffer, new Function1() { // from class: o.Ble
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BkX.getDexChainGroupList$lambda$8$lambda$7(j, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long getDexChainGroupList$lambda$8$lambda$7(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_method_retaildexbridge_get_dex_chain_group_list(j, uniffiRustCallStatus);
    }

    public C4608Bkj AEQbTJ(@NotNull final BjD bjD, @NotNull final DexPeriod dexPeriod, @NotNull final DexSortBy dexSortBy, @NotNull final SortOrder sortOrder, final C56395yDu c56395yDu) {
        Intrinsics.checkNotNullParameter(bjD, "");
        Intrinsics.checkNotNullParameter(dexPeriod, "");
        Intrinsics.checkNotNullParameter(dexSortBy, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        return FfiConverterTypeOKRustFutureDexTokenVoListWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bln
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BkX.getDexRankingList_H3638Bo$lambda$10(bjD, dexPeriod, dexSortBy, sortOrder, c56395yDu, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long getDexRankingList_H3638Bo$lambda$10(final BjD bjD, final DexPeriod dexPeriod, final DexSortBy dexSortBy, final SortOrder sortOrder, final C56395yDu c56395yDu, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BlA.uniffiRustBuffer, new Function1() { // from class: o.Blh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BkX.getDexRankingList_H3638Bo$lambda$10$lambda$9(j, bjD, dexPeriod, dexSortBy, sortOrder, c56395yDu, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long getDexRankingList_H3638Bo$lambda$10$lambda$9(long j, BjD bjD, DexPeriod dexPeriod, DexSortBy dexSortBy, SortOrder sortOrder, C56395yDu c56395yDu, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_method_retaildexbridge_get_dex_ranking_list(j, FfiConverterTypeDexChainGroupVo.INSTANCE.lower2((java.lang.Object) bjD), FfiConverterTypeDexPeriod.INSTANCE.lower2((java.lang.Object) dexPeriod), FfiConverterTypeDexSortBy.INSTANCE.lower2((java.lang.Object) dexSortBy), FfiConverterTypeSortOrder.INSTANCE.lower2((java.lang.Object) sortOrder), FfiConverterOptionalUInt.INSTANCE.lower2(c56395yDu), uniffiRustCallStatus);
    }

    public C4608Bkj AEQbTJ(@NotNull final java.util.List<BjJ> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return FfiConverterTypeOKRustFutureDexTokenVoListWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Blk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BkX.getDexTokenDetail$lambda$12(list, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long getDexTokenDetail$lambda$12(final java.util.List list, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BlA.uniffiRustBuffer, new Function1() { // from class: o.Blp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BkX.getDexTokenDetail$lambda$12$lambda$11(j, list, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long getDexTokenDetail$lambda$12$lambda$11(long j, java.util.List list, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_method_retaildexbridge_get_dex_token_detail(j, FfiConverterSequenceTypeDexInstrument.INSTANCE.lower2((java.lang.Object) list), uniffiRustCallStatus);
    }

    public C4623Bky copydefault(final java.lang.String str) {
        return FfiConverterTypeOKRustFutureSearchDexVosResultWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Blj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BkX.searchDexRankingList$lambda$14(str, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long searchDexRankingList$lambda$14(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BlA.uniffiRustBuffer, new Function1() { // from class: o.Bla
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BkX.searchDexRankingList$lambda$14$lambda$13(j, str, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long searchDexRankingList$lambda$14$lambda$13(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_method_retaildexbridge_search_dex_ranking_list(j, FfiConverterOptionalString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }
}
