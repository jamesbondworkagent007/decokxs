package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.network.FfiConverterTypeNativeWsConnection;
import uniffi.network.FfiConverterTypeWsConfigProvider;
import uniffi.network.FfiConverterTypeWsStaticConnectionConfig;
import uniffi.network.UniffiLib;

/* JADX INFO: renamed from: o.Bbz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C4355Bbz extends AbstractC60182zxs implements InterfaceC4354Bby {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4355Bbz(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), C4298Bav.uniffiRustBuffer, new Function2() { // from class: o.BbF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4355Bbz.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.BbD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4355Bbz.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_free_okxwsfactory(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_clone_okxwsfactory(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4355Bbz(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), C4298Bav.uniffiRustBuffer, new Function2() { // from class: o.BbB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4355Bbz.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.BbI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4355Bbz.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_free_okxwsfactory(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_clone_okxwsfactory(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4354Bby
    public AZX EZpvd(@NotNull final C4367BcK c4367BcK, @NotNull final C4358BcB c4358BcB) {
        Intrinsics.checkNotNullParameter(c4367BcK, "");
        Intrinsics.checkNotNullParameter(c4358BcB, "");
        return FfiConverterTypeNativeWsConnection.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BbC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4355Bbz.createConnection$lambda$5(c4367BcK, c4358BcB, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long createConnection$lambda$5(final C4367BcK c4367BcK, final C4358BcB c4358BcB, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C4298Bav.uniffiRustBuffer, new Function1() { // from class: o.BbE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4355Bbz.createConnection$lambda$5$lambda$4(j, c4367BcK, c4358BcB, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long createConnection$lambda$5$lambda$4(long j, C4367BcK c4367BcK, C4358BcB c4358BcB, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_method_okxwsfactory_create_connection(j, FfiConverterTypeWsStaticConnectionConfig.INSTANCE.lower2((java.lang.Object) c4367BcK), FfiConverterTypeWsConfigProvider.INSTANCE.lower2(c4358BcB).longValue(), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4354Bby
    public AZX AEQbTJ(@NotNull final C4367BcK c4367BcK, @NotNull final C4358BcB c4358BcB) {
        Intrinsics.checkNotNullParameter(c4367BcK, "");
        Intrinsics.checkNotNullParameter(c4358BcB, "");
        return FfiConverterTypeNativeWsConnection.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BbK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4355Bbz.createSimplifiedConnection$lambda$7(c4367BcK, c4358BcB, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long createSimplifiedConnection$lambda$7(final C4367BcK c4367BcK, final C4358BcB c4358BcB, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C4298Bav.uniffiRustBuffer, new Function1() { // from class: o.BbJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4355Bbz.createSimplifiedConnection$lambda$7$lambda$6(j, c4367BcK, c4358BcB, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long createSimplifiedConnection$lambda$7$lambda$6(long j, C4367BcK c4367BcK, C4358BcB c4358BcB, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_method_okxwsfactory_create_simplified_connection(j, FfiConverterTypeWsStaticConnectionConfig.INSTANCE.lower2((java.lang.Object) c4367BcK), FfiConverterTypeWsConfigProvider.INSTANCE.lower2(c4358BcB).longValue(), uniffiRustCallStatus);
    }
}
