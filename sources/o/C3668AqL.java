package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.buy_sell.FfiConverterInt;
import uniffi.buy_sell.FfiConverterString;
import uniffi.buy_sell.UniffiLib;

/* JADX INFO: renamed from: o.AqL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C3668AqL extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3668AqL(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.AqQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3668AqL.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AqT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3668AqL.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_buysellgrafanabuilder(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_buysellgrafanabuilder(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3668AqL(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.AqR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3668AqL.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AqX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3668AqL.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_buysellgrafanabuilder(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_buysellgrafanabuilder(j, uniffiRustCallStatus);
    }

    public C3668AqL() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AqU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3668AqL.OLrzqt((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_constructor_buysellgrafanabuilder_new(uniffiRustCallStatus);
    }

    public static final Unit track$lambda$6(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AqP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3668AqL.track$lambda$6$lambda$5(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit track$lambda$6$lambda$5(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellgrafanabuilder_track(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final long withClick$lambda$8(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AqY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3668AqL.withClick$lambda$8$lambda$7(j, str, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long withClick$lambda$8$lambda$7(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellgrafanabuilder_with_click(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public static final long withCurrentPage$lambda$10(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AqN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3668AqL.withCurrentPage$lambda$10$lambda$9(j, str, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long withCurrentPage$lambda$10$lambda$9(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellgrafanabuilder_with_current_page(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public static final long withErrorCode$lambda$12(final int i, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AqO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3668AqL.withErrorCode$lambda$12$lambda$11(j, i, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long withErrorCode$lambda$12$lambda$11(long j, int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellgrafanabuilder_with_error_code(j, FfiConverterInt.INSTANCE.lower(i).intValue(), uniffiRustCallStatus);
    }

    public static final long withLog$lambda$14(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AqS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3668AqL.withLog$lambda$14$lambda$13(j, str, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long withLog$lambda$14$lambda$13(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellgrafanabuilder_with_log(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public static final long withSource$lambda$16(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AqV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3668AqL.withSource$lambda$16$lambda$15(j, str, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long withSource$lambda$16$lambda$15(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellgrafanabuilder_with_source(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public static final long withToken$lambda$18(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AqM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3668AqL.withToken$lambda$18$lambda$17(j, str, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long withToken$lambda$18$lambda$17(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellgrafanabuilder_with_token(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }
}
