package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.retail_trading.FfiConverterTypeUpDownTimeZone;
import uniffi.retail_trading.UniffiLib;
import uniffi.retail_trading.UpDownTimeZone;

/* JADX INFO: renamed from: o.Blr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C4643Blr extends AbstractC60182zxs implements InterfaceC4642Blq {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4643Blr(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), BlA.uniffiRustBuffer, new Function2() { // from class: o.Blt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4643Blr.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Blu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4643Blr.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_trading_fn_free_retailtradingnativeapi(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_clone_retailtradingnativeapi(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4643Blr(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), BlA.uniffiRustBuffer, new Function2() { // from class: o.Bls
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4643Blr.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Blx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4643Blr.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_trading_fn_free_retailtradingnativeapi(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_clone_retailtradingnativeapi(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4642Blq
    public UpDownTimeZone OLrzqt() {
        return (UpDownTimeZone) FfiConverterTypeUpDownTimeZone.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Blv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4643Blr.getUpDownTimeZone$lambda$5(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getUpDownTimeZone$lambda$5(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BlA.uniffiRustBuffer, new Function1() { // from class: o.Blz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4643Blr.getUpDownTimeZone$lambda$5$lambda$4(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getUpDownTimeZone$lambda$5$lambda$4(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_trading_fn_method_retailtradingnativeapi_get_up_down_time_zone(j, uniffiRustCallStatus);
    }
}
