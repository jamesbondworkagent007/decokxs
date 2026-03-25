package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.network.FfiConverterString;
import uniffi.network.FfiConverterTypeOKNativeTaskResponseWithNetworkError;
import uniffi.network.FfiConverterTypeOKXHttpRequestOptions;
import uniffi.network.UniffiLib;

/* JADX INFO: renamed from: o.Bbm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C4342Bbm extends AbstractC60182zxs implements InterfaceC4346Bbq {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4342Bbm(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), C4298Bav.uniffiRustBuffer, new Function2() { // from class: o.Bbx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4342Bbm.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bbw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4342Bbm.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_free_okxrequestfactory(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_clone_okxrequestfactory(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4342Bbm(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), C4298Bav.uniffiRustBuffer, new Function2() { // from class: o.Bbu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4342Bbm.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bbr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4342Bbm.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_free_okxrequestfactory(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_clone_okxrequestfactory(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4346Bbq
    public InterfaceC4267BaQ copydefault(@NotNull final C4343Bbn c4343Bbn) {
        Intrinsics.checkNotNullParameter(c4343Bbn, "");
        return FfiConverterTypeOKNativeTaskResponseWithNetworkError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BbA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4342Bbm.create$lambda$5(c4343Bbn, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long create$lambda$5(final C4343Bbn c4343Bbn, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C4298Bav.uniffiRustBuffer, new Function1() { // from class: o.Bbv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4342Bbm.create$lambda$5$lambda$4(j, c4343Bbn, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long create$lambda$5$lambda$4(long j, C4343Bbn c4343Bbn, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_method_okxrequestfactory_create(j, FfiConverterTypeOKXHttpRequestOptions.INSTANCE.lower2((java.lang.Object) c4343Bbn), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4346Bbq
    public java.lang.String EZpvd() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bbt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4342Bbm.unifiedErrorMessage$lambda$7(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue unifiedErrorMessage$lambda$7(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C4298Bav.uniffiRustBuffer, new Function1() { // from class: o.Bbs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4342Bbm.unifiedErrorMessage$lambda$7$lambda$6(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue unifiedErrorMessage$lambda$7$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_method_okxrequestfactory_unified_error_message(j, uniffiRustCallStatus);
    }
}
