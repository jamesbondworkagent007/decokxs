package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.ok_future_utils.FfiConverterBoolean;
import uniffi.ok_future_utils.UniffiLib;

/* JADX INFO: loaded from: classes17.dex */
public class BdU extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BdU(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), BfS.uniffiRustBuffer, new Function2() { // from class: o.BdR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BdU.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bea
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BdU.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_ok_future_utils_fn_free_okcancellationtoken(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_ok_future_utils_fn_clone_okcancellationtoken(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BdU(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), BfS.uniffiRustBuffer, new Function2() { // from class: o.BdW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BdU.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Beb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BdU.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_ok_future_utils_fn_free_okcancellationtoken(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_ok_future_utils_fn_clone_okcancellationtoken(j, uniffiRustCallStatus);
    }

    public BdU() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(BfS.uniffiRustBuffer, new Function1() { // from class: o.BdY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BdU.KWHzl((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_ok_future_utils_fn_constructor_okcancellationtoken_new(uniffiRustCallStatus);
    }

    public void copydefault() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BdZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BdU.OLrzqt(((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(final long j) {
        C60173zxj.uniffiRustCall(BfS.uniffiRustBuffer, new Function1() { // from class: o.BdS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BdU.AEQbTJ(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_ok_future_utils_fn_method_okcancellationtoken_cancel(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public boolean EZpvd() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BdX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BdU.isCancelled$lambda$8(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isCancelled$lambda$8(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BfS.uniffiRustBuffer, new Function1() { // from class: o.BdV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BdU.isCancelled$lambda$8$lambda$7(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isCancelled$lambda$8$lambda$7(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_ok_future_utils_fn_method_okcancellationtoken_is_cancelled(j, uniffiRustCallStatus);
    }
}
