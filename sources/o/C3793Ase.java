package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.buy_sell.FfiConverterString;
import uniffi.buy_sell.FfiConverterTypeErrorMessageItem;
import uniffi.buy_sell.FfiConverterTypeInputValidationResult;
import uniffi.buy_sell.InputValidationResult;
import uniffi.buy_sell.UniffiLib;

/* JADX INFO: renamed from: o.Ase, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C3793Ase extends AbstractC60182zxs implements InterfaceC3796Ash {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3793Ase(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.Asi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3793Ase.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Asr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3793Ase.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_inputvalidationlocalization(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_inputvalidationlocalization(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3793Ase(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.Asm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3793Ase.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Asl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3793Ase.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_inputvalidationlocalization(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_inputvalidationlocalization(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3796Ash
    public java.lang.String KWHzl(@NotNull final InputValidationResult inputValidationResult, @NotNull final C3792Asd c3792Asd) {
        Intrinsics.checkNotNullParameter(inputValidationResult, "");
        Intrinsics.checkNotNullParameter(c3792Asd, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Asp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3793Ase.getBuyLocalizedErrorMessage$lambda$5(inputValidationResult, c3792Asd, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getBuyLocalizedErrorMessage$lambda$5(final InputValidationResult inputValidationResult, final C3792Asd c3792Asd, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Ask
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3793Ase.getBuyLocalizedErrorMessage$lambda$5$lambda$4(j, inputValidationResult, c3792Asd, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getBuyLocalizedErrorMessage$lambda$5$lambda$4(long j, InputValidationResult inputValidationResult, C3792Asd c3792Asd, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_inputvalidationlocalization_get_buy_localized_error_message(j, FfiConverterTypeInputValidationResult.INSTANCE.lower2((java.lang.Object) inputValidationResult), FfiConverterTypeErrorMessageItem.INSTANCE.lower2((java.lang.Object) c3792Asd), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3796Ash
    public java.lang.String OLrzqt(@NotNull final InputValidationResult inputValidationResult, @NotNull final C3792Asd c3792Asd) {
        Intrinsics.checkNotNullParameter(inputValidationResult, "");
        Intrinsics.checkNotNullParameter(c3792Asd, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Asj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3793Ase.getSellLocalizedErrorMessage$lambda$7(inputValidationResult, c3792Asd, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getSellLocalizedErrorMessage$lambda$7(final InputValidationResult inputValidationResult, final C3792Asd c3792Asd, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Asq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3793Ase.getSellLocalizedErrorMessage$lambda$7$lambda$6(j, inputValidationResult, c3792Asd, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getSellLocalizedErrorMessage$lambda$7$lambda$6(long j, InputValidationResult inputValidationResult, C3792Asd c3792Asd, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_inputvalidationlocalization_get_sell_localized_error_message(j, FfiConverterTypeInputValidationResult.INSTANCE.lower2((java.lang.Object) inputValidationResult), FfiConverterTypeErrorMessageItem.INSTANCE.lower2((java.lang.Object) c3792Asd), uniffiRustCallStatus);
    }
}
