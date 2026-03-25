package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.ok_future_utils.FfiConverterTypeOKFFIError;
import uniffi.ok_future_utils.OkffiException;
import uniffi.retail_trading.FfiConverterSequenceTypeQuotationDexItemVo;
import uniffi.retail_trading.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public class BjF extends AbstractC60182zxs implements BjI {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BjF(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), BlA.uniffiRustBuffer, new Function2() { // from class: o.BjM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BjF.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.BjK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BjF.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_trading_fn_free_dexlistupdatecallback(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_clone_dexlistupdatecallback(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BjF(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), BlA.uniffiRustBuffer, new Function2() { // from class: o.BjH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BjF.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.BjL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BjF.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_trading_fn_free_dexlistupdatecallback(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_clone_dexlistupdatecallback(j, uniffiRustCallStatus);
    }

    @Override // o.BjI
    public void copydefault(@NotNull final java.util.List<BkU> list) {
        Intrinsics.checkNotNullParameter(list, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BjG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BjF.onUpdateDexListBatched$lambda$5(list, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onUpdateDexListBatched$lambda$5(final java.util.List list, final long j) {
        C60173zxj.uniffiRustCall(BlA.uniffiRustBuffer, new Function1() { // from class: o.BjO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BjF.onUpdateDexListBatched$lambda$5$lambda$4(j, list, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onUpdateDexListBatched$lambda$5$lambda$4(long j, java.util.List list, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_trading_fn_method_dexlistupdatecallback_on_update_dex_list_batched(j, FfiConverterSequenceTypeQuotationDexItemVo.INSTANCE.lower2((java.lang.Object) list), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.BjI
    public void AEQbTJ(@NotNull final OkffiException okffiException) {
        Intrinsics.checkNotNullParameter(okffiException, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BjQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BjF.onUpdateDexListError$lambda$7(okffiException, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onUpdateDexListError$lambda$7(final OkffiException okffiException, final long j) {
        C60173zxj.uniffiRustCall(BlA.uniffiRustBuffer, new Function1() { // from class: o.BjN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BjF.onUpdateDexListError$lambda$7$lambda$6(j, okffiException, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onUpdateDexListError$lambda$7$lambda$6(long j, OkffiException okffiException, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_trading_fn_method_dexlistupdatecallback_on_update_dex_list_error(j, FfiConverterTypeOKFFIError.INSTANCE.lower2((java.lang.Object) okffiException), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.BjI
    public void copydefault() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BjS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BjF.onUpdateDexListCompleted$lambda$9(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onUpdateDexListCompleted$lambda$9(final long j) {
        C60173zxj.uniffiRustCall(BlA.uniffiRustBuffer, new Function1() { // from class: o.BjR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BjF.onUpdateDexListCompleted$lambda$9$lambda$8(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onUpdateDexListCompleted$lambda$9$lambda$8(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_trading_fn_method_dexlistupdatecallback_on_update_dex_list_completed(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
