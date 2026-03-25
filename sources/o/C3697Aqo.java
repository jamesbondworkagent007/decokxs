package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.buy_sell.FfiConverterInt;
import uniffi.buy_sell.FfiConverterOptionalString;
import uniffi.buy_sell.FfiConverterString;
import uniffi.buy_sell.FfiConverterUInt;
import uniffi.buy_sell.UniffiLib;

/* JADX INFO: renamed from: o.Aqo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C3697Aqo extends AbstractC60182zxs implements InterfaceC3696Aqn {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3697Aqo(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.Aqx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3697Aqo.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Aqz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3697Aqo.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_buysellformatter(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_buysellformatter(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3697Aqo(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.Aqq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3697Aqo.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Aqt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3697Aqo.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_buysellformatter(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_buysellformatter(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3696Aqn
    public java.lang.String EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AqA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.formatFiatWithSymbolMax_hJeF8fQ$lambda$5(str, str2, i, i2, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue formatFiatWithSymbolMax_hJeF8fQ$lambda$5(final java.lang.String str, final java.lang.String str2, final int i, final int i2, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Aqw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.formatFiatWithSymbolMax_hJeF8fQ$lambda$5$lambda$4(j, str, str2, i, i2, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue formatFiatWithSymbolMax_hJeF8fQ$lambda$5$lambda$4(long j, java.lang.String str, java.lang.String str2, int i, int i2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_method_buysellformatter_format_fiat_with_symbol_max(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), FfiConverterInt.INSTANCE.lower(i).intValue(), FfiConverterUInt.INSTANCE.m9552lowerWZ4Q5Ns(i2).intValue(), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3696Aqn
    public java.lang.String copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final int i, final int i2, final int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Aqv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.formatFiatWithSymbolMinmax_LRKxwks$lambda$7(str, str2, i, i2, i3, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue formatFiatWithSymbolMinmax_LRKxwks$lambda$7(final java.lang.String str, final java.lang.String str2, final int i, final int i2, final int i3, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AqB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.formatFiatWithSymbolMinmax_LRKxwks$lambda$7$lambda$6(j, str, str2, i, i2, i3, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue formatFiatWithSymbolMinmax_LRKxwks$lambda$7$lambda$6(long j, java.lang.String str, java.lang.String str2, int i, int i2, int i3, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        RustBuffer.ByValue byValueLower2 = ffiConverterString.lower2(str);
        RustBuffer.ByValue byValueLower22 = ffiConverterString.lower2(str2);
        int iIntValue = FfiConverterInt.INSTANCE.lower(i).intValue();
        FfiConverterUInt ffiConverterUInt = FfiConverterUInt.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_method_buysellformatter_format_fiat_with_symbol_minmax(j, byValueLower2, byValueLower22, iIntValue, ffiConverterUInt.m9552lowerWZ4Q5Ns(i2).intValue(), ffiConverterUInt.m9552lowerWZ4Q5Ns(i3).intValue(), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3696Aqn
    public java.lang.String AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AqH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.formatFiatWithCodeMax_hJeF8fQ$lambda$9(str, str2, i, i2, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue formatFiatWithCodeMax_hJeF8fQ$lambda$9(final java.lang.String str, final java.lang.String str2, final int i, final int i2, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AqD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.formatFiatWithCodeMax_hJeF8fQ$lambda$9$lambda$8(j, str, str2, i, i2, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue formatFiatWithCodeMax_hJeF8fQ$lambda$9$lambda$8(long j, java.lang.String str, java.lang.String str2, int i, int i2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_method_buysellformatter_format_fiat_with_code_max(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), FfiConverterInt.INSTANCE.lower(i).intValue(), FfiConverterUInt.INSTANCE.m9552lowerWZ4Q5Ns(i2).intValue(), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3696Aqn
    public java.lang.String OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final int i, final int i2, final int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AqK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.formatFiatWithCodeMinmax_LRKxwks$lambda$11(str, str2, i, i2, i3, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue formatFiatWithCodeMinmax_LRKxwks$lambda$11(final java.lang.String str, final java.lang.String str2, final int i, final int i2, final int i3, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AqE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.formatFiatWithCodeMinmax_LRKxwks$lambda$11$lambda$10(j, str, str2, i, i2, i3, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue formatFiatWithCodeMinmax_LRKxwks$lambda$11$lambda$10(long j, java.lang.String str, java.lang.String str2, int i, int i2, int i3, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        RustBuffer.ByValue byValueLower2 = ffiConverterString.lower2(str);
        RustBuffer.ByValue byValueLower22 = ffiConverterString.lower2(str2);
        int iIntValue = FfiConverterInt.INSTANCE.lower(i).intValue();
        FfiConverterUInt ffiConverterUInt = FfiConverterUInt.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_method_buysellformatter_format_fiat_with_code_minmax(j, byValueLower2, byValueLower22, iIntValue, ffiConverterUInt.m9552lowerWZ4Q5Ns(i2).intValue(), ffiConverterUInt.m9552lowerWZ4Q5Ns(i3).intValue(), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3696Aqn
    public java.lang.String KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AqC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.formatCrypto_hJeF8fQ$lambda$13(str, str2, i, i2, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue formatCrypto_hJeF8fQ$lambda$13(final java.lang.String str, final java.lang.String str2, final int i, final int i2, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Aqs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.formatCrypto_hJeF8fQ$lambda$13$lambda$12(j, str, str2, i, i2, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue formatCrypto_hJeF8fQ$lambda$13$lambda$12(long j, java.lang.String str, java.lang.String str2, int i, int i2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_method_buysellformatter_format_crypto(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), FfiConverterInt.INSTANCE.lower(i).intValue(), FfiConverterUInt.INSTANCE.m9552lowerWZ4Q5Ns(i2).intValue(), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3696Aqn
    public java.lang.String OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AqF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.formatExchangeRate_Urd2D_w$lambda$15(str, str2, str3, str4, i, i2, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue formatExchangeRate_Urd2D_w$lambda$15(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final int i, final int i2, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AqG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.formatExchangeRate_Urd2D_w$lambda$15$lambda$14(j, str, str2, str3, str4, i, i2, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue formatExchangeRate_Urd2D_w$lambda$15$lambda$14(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_method_buysellformatter_format_exchange_rate(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), ffiConverterString.lower2(str3), ffiConverterString.lower2(str4), FfiConverterInt.INSTANCE.lower(i).intValue(), FfiConverterUInt.INSTANCE.m9552lowerWZ4Q5Ns(i2).intValue(), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3696Aqn
    public java.lang.String AEQbTJ(@NotNull final java.lang.String str, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AqJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.toPlainString_Qn1smSk$lambda$17(str, i, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue toPlainString_Qn1smSk$lambda$17(final java.lang.String str, final int i, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Aqy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.toPlainString_Qn1smSk$lambda$17$lambda$16(j, str, i, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue toPlainString_Qn1smSk$lambda$17$lambda$16(long j, java.lang.String str, int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellformatter_to_plain_string(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterUInt.INSTANCE.m9552lowerWZ4Q5Ns(i).intValue(), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3696Aqn
    public java.lang.String EZpvd(@NotNull final java.lang.String str, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Aqr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.formatPlainString_Qn1smSk$lambda$19(str, i, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue formatPlainString_Qn1smSk$lambda$19(final java.lang.String str, final int i, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Aqu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3697Aqo.formatPlainString_Qn1smSk$lambda$19$lambda$18(j, str, i, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue formatPlainString_Qn1smSk$lambda$19$lambda$18(long j, java.lang.String str, int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellformatter_format_plain_string(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterUInt.INSTANCE.m9552lowerWZ4Q5Ns(i).intValue(), uniffiRustCallStatus);
    }
}
