package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.retail_kline.FfiConverterBoolean;
import uniffi.retail_kline.FfiConverterString;
import uniffi.retail_kline.FfiConverterTypeMarketEventsPushListener;
import uniffi.retail_kline.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public class BhB extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BhB(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.KWHzl(), C4578Bjg.uniffiRustBuffer, new Function2() { // from class: o.BhE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BhB.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.BhI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BhB.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_kline_fn_free_marketeventswsmanagerwrapper(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_kline_fn_clone_marketeventswsmanagerwrapper(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BhB(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.KWHzl(), C4578Bjg.uniffiRustBuffer, new Function2() { // from class: o.BhN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BhB.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.BhM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BhB.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_kline_fn_free_marketeventswsmanagerwrapper(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_kline_fn_clone_marketeventswsmanagerwrapper(j, uniffiRustCallStatus);
    }

    public static final byte isSubscribed$lambda$5(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C4578Bjg.uniffiRustBuffer, new Function1() { // from class: o.BhF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BhB.isSubscribed$lambda$5$lambda$4(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isSubscribed$lambda$5$lambda$4(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_kline_fn_method_marketeventswsmanagerwrapper_is_subscribed(j, uniffiRustCallStatus);
    }

    public boolean EZpvd(@NotNull final java.lang.String str, @NotNull final InterfaceC4535Bhr interfaceC4535Bhr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC4535Bhr, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BhG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BhB.subscribe$lambda$7(str, interfaceC4535Bhr, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte subscribe$lambda$7(final java.lang.String str, final InterfaceC4535Bhr interfaceC4535Bhr, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C4578Bjg.uniffiRustBuffer, new Function1() { // from class: o.BhK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BhB.subscribe$lambda$7$lambda$6(j, str, interfaceC4535Bhr, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte subscribe$lambda$7$lambda$6(long j, java.lang.String str, InterfaceC4535Bhr interfaceC4535Bhr, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_kline_fn_method_marketeventswsmanagerwrapper_subscribe(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterTypeMarketEventsPushListener.INSTANCE.lower2(interfaceC4535Bhr).longValue(), uniffiRustCallStatus);
    }

    public void OLrzqt() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BhL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BhB.unsubscribe$lambda$9(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit unsubscribe$lambda$9(final long j) {
        C60173zxj.uniffiRustCall(C4578Bjg.uniffiRustBuffer, new Function1() { // from class: o.BhH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BhB.unsubscribe$lambda$9$lambda$8(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit unsubscribe$lambda$9$lambda$8(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_kline_fn_method_marketeventswsmanagerwrapper_unsubscribe(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
