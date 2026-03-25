package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.network.FfiConverterOptionalTypeWsIncomingData;
import uniffi.network.UniffiLib;

/* JADX INFO: renamed from: o.BbY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C4328BbY extends AbstractC60182zxs implements InterfaceC4325BbV {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4328BbY(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), C4298Bav.uniffiRustBuffer, new Function2() { // from class: o.BbZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4328BbY.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bcb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4328BbY.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_free_rustwsdatacallback(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_clone_rustwsdatacallback(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4328BbY(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), C4298Bav.uniffiRustBuffer, new Function2() { // from class: o.Bce
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4328BbY.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bcd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4328BbY.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_free_rustwsdatacallback(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_clone_rustwsdatacallback(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4325BbV
    public void AEQbTJ(final C4366BcJ c4366BcJ) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bcc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4328BbY.onData$lambda$5(c4366BcJ, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onData$lambda$5(final C4366BcJ c4366BcJ, final long j) {
        C60173zxj.uniffiRustCall(C4298Bav.uniffiRustBuffer, new Function1() { // from class: o.Bca
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4328BbY.onData$lambda$5$lambda$4(j, c4366BcJ, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onData$lambda$5$lambda$4(long j, C4366BcJ c4366BcJ, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_method_rustwsdatacallback_on_data(j, FfiConverterOptionalTypeWsIncomingData.INSTANCE.lower2(c4366BcJ), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
