package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.experiment.FfiConverterTypeFeatureItem;
import uniffi.experiment.UniffiLib;

/* JADX INFO: renamed from: o.AIm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C2353AIm extends AbstractC60182zxs implements InterfaceC2350AIj {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2353AIm(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.KWHzl(), C2348AIh.uniffiRustBuffer, new Function2() { // from class: o.AIo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2353AIm.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AIw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2353AIm.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_experiment_fn_free_featureupdatehandler(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_clone_featureupdatehandler(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2353AIm(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.KWHzl(), C2348AIh.uniffiRustBuffer, new Function2() { // from class: o.AIp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2353AIm.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AIn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2353AIm.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_experiment_fn_free_featureupdatehandler(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_clone_featureupdatehandler(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2350AIj
    public void EZpvd(@NotNull final C2351AIk c2351AIk) {
        Intrinsics.checkNotNullParameter(c2351AIk, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AIr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2353AIm.onFeatureUpdated$lambda$5(c2351AIk, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onFeatureUpdated$lambda$5(final C2351AIk c2351AIk, final long j) {
        C60173zxj.uniffiRustCall(C2348AIh.uniffiRustBuffer, new Function1() { // from class: o.AIq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2353AIm.onFeatureUpdated$lambda$5$lambda$4(j, c2351AIk, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onFeatureUpdated$lambda$5$lambda$4(long j, C2351AIk c2351AIk, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_experiment_fn_method_featureupdatehandler_on_feature_updated(j, FfiConverterTypeFeatureItem.INSTANCE.lower2((java.lang.Object) c2351AIk), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
