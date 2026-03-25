package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.ok_future_utils.FfiConverterTypeOKRustFutureCallback;
import uniffi.ok_future_utils.OkffiException;
import uniffi.retail_trading.FfiConverterOptionalSequenceTypeDexChainGroupVo;
import uniffi.retail_trading.FfiConverterOptionalTypeOKFFIError;
import uniffi.retail_trading.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public class BjX extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BjX(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), BlA.uniffiRustBuffer, new Function2() { // from class: o.Bkg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BjX.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BjX.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_trading_fn_free_okrustfuturedexchaingroupvolistwithokffierror(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_clone_okrustfuturedexchaingroupvolistwithokffierror(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BjX(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), BlA.uniffiRustBuffer, new Function2() { // from class: o.Bkh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BjX.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bke
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BjX.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_trading_fn_free_okrustfuturedexchaingroupvolistwithokffierror(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_clone_okrustfuturedexchaingroupvolistwithokffierror(j, uniffiRustCallStatus);
    }

    public void OLrzqt() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bkm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BjX.AEQbTJ(((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(final long j) {
        C60173zxj.uniffiRustCall(BlA.uniffiRustBuffer, new Function1() { // from class: o.BjZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BjX.copydefault(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_trading_fn_method_okrustfuturedexchaingroupvolistwithokffierror_cancel(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public OkffiException AEQbTJ() {
        return FfiConverterOptionalTypeOKFFIError.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bkn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BjX.KWHzl(((java.lang.Long) obj).longValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue KWHzl(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BlA.uniffiRustBuffer, new Function1() { // from class: o.Bkd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BjX.AhwBna(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue AhwBna(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_method_okrustfuturedexchaingroupvolistwithokffierror_get_error(j, uniffiRustCallStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue EZpvd(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BlA.uniffiRustBuffer, new Function1() { // from class: o.Bka
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BjX.gEmmrt(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue gEmmrt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_method_okrustfuturedexchaingroupvolistwithokffierror_get_result_status(j, uniffiRustCallStatus);
    }

    public java.util.List<BjD> KWHzl() {
        return (java.util.List) FfiConverterOptionalSequenceTypeDexChainGroupVo.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bkk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BjX.OLrzqt(((java.lang.Long) obj).longValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue OLrzqt(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BlA.uniffiRustBuffer, new Function1() { // from class: o.BjU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BjX.valueOf(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue valueOf(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_method_okrustfuturedexchaingroupvolistwithokffierror_get_success_result(j, uniffiRustCallStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte copydefault(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BlA.uniffiRustBuffer, new Function1() { // from class: o.Bkc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BjX.AYXKKw(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte AYXKKw(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_method_okrustfuturedexchaingroupvolistwithokffierror_is_finished(j, uniffiRustCallStatus);
    }

    public void copydefault(@NotNull final InterfaceC4440Bed interfaceC4440Bed) throws OkffiException {
        Intrinsics.checkNotNullParameter(interfaceC4440Bed, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bkf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BjX.KWHzl(interfaceC4440Bed, ((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit KWHzl(final InterfaceC4440Bed interfaceC4440Bed, final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(BlA.uniffiRustBuffer, BkR.INSTANCE, new Function1() { // from class: o.Bkb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BjX.EZpvd(j, interfaceC4440Bed, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, InterfaceC4440Bed interfaceC4440Bed, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_trading_fn_method_okrustfuturedexchaingroupvolistwithokffierror_start_with_callback(j, FfiConverterTypeOKRustFutureCallback.INSTANCE.lower2(interfaceC4440Bed).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
