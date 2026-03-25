package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.growth.FfiConverterBoolean;
import uniffi.growth.FfiConverterInt;
import uniffi.growth.FfiConverterTypePopupCallbacks;
import uniffi.growth.FfiConverterTypePopupTriggerContext;
import uniffi.growth.UniffiLib;

/* JADX INFO: loaded from: classes25.dex */
public class AOU extends AbstractC60182zxs implements AOQ {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AOQ
    public java.lang.Object AEQbTJ(@NotNull C2533APk c2533APk, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return shouldShow$suspendImpl(this, c2533APk, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AOU(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), ANQ.uniffiRustBuffer, new Function2() { // from class: o.AOW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AOU.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AOV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(AOU.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_free_popupprovider(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_clone_popupprovider(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AOU(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), ANQ.uniffiRustBuffer, new Function2() { // from class: o.APf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AOU.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.APh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(AOU.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_free_popupprovider(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_clone_popupprovider(j, uniffiRustCallStatus);
    }

    @Override // o.AOQ
    public int OLrzqt() {
        return FfiConverterInt.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.APc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(AOU.popupId$lambda$5(((java.lang.Long) obj).longValue()));
            }
        })).intValue()).intValue();
    }

    public static final int popupId$lambda$5(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ANQ.uniffiRustBuffer, new Function1() { // from class: o.APb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(AOU.popupId$lambda$5$lambda$4(j, (UniffiRustCallStatus) obj));
            }
        })).intValue();
    }

    public static final int popupId$lambda$5$lambda$4(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_popupprovider_popup_id(j, uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object shouldShow$suspendImpl(AOU aou, final C2533APk c2533APk, Continuation<? super java.lang.Boolean> continuation) {
        return C60173zxj.uniffiRustCallAsync(ANQ.uniffiRustBuffer, ((java.lang.Number) aou.callWithHandle$OKCore_deploy(new Function1() { // from class: o.APi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AOU.shouldShow$lambda$6(c2533APk, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.APg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return AOU.shouldShow$lambda$7(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.AOY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Byte.valueOf(AOU.shouldShow$lambda$8(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        }, new Function1() { // from class: o.AOX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AOU.shouldShow$lambda$9(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.APa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(AOU.shouldShow$lambda$10(((java.lang.Byte) obj).byteValue()));
            }
        }, new C60178zxo(ANQ.uniffiRustBuffer), continuation);
    }

    public static final long shouldShow$lambda$6(C2533APk c2533APk, long j) {
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_popupprovider_should_show(j, FfiConverterTypePopupTriggerContext.INSTANCE.lower2(c2533APk).longValue());
    }

    public static final Unit shouldShow$lambda$7(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_poll_i8(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final byte shouldShow$lambda$8(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_growth_rust_future_complete_i8(j, uniffiRustCallStatus);
    }

    public static final Unit shouldShow$lambda$9(long j) {
        UniffiLib.INSTANCE.ffi_growth_rust_future_free_i8(j);
        return Unit.INSTANCE;
    }

    public static final boolean shouldShow$lambda$10(byte b) {
        return FfiConverterBoolean.INSTANCE.lift(b).booleanValue();
    }

    @Override // o.AOQ
    public void copydefault(@NotNull final C2533APk c2533APk, @NotNull final C2510AOn c2510AOn) {
        Intrinsics.checkNotNullParameter(c2533APk, "");
        Intrinsics.checkNotNullParameter(c2510AOn, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AOZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AOU.showPopup$lambda$12(c2533APk, c2510AOn, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit showPopup$lambda$12(final C2533APk c2533APk, final C2510AOn c2510AOn, final long j) {
        C60173zxj.uniffiRustCall(ANQ.uniffiRustBuffer, new Function1() { // from class: o.APd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AOU.showPopup$lambda$12$lambda$11(j, c2533APk, c2510AOn, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit showPopup$lambda$12$lambda$11(long j, C2533APk c2533APk, C2510AOn c2510AOn, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_method_popupprovider_show_popup(j, FfiConverterTypePopupTriggerContext.INSTANCE.lower2(c2533APk).longValue(), FfiConverterTypePopupCallbacks.INSTANCE.lower2(c2510AOn).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
