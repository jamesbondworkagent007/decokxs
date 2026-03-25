package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.experiment.UniffiLib;

/* JADX INFO: loaded from: classes25.dex */
public class AIC extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIC(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.KWHzl(), C2348AIh.uniffiRustBuffer, new Function2() { // from class: o.AIJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AIC.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AII
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(AIC.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_experiment_fn_free_feedbackservice(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_clone_feedbackservice(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIC(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.KWHzl(), C2348AIh.uniffiRustBuffer, new Function2() { // from class: o.AIE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AIC.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AIK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(AIC.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_experiment_fn_free_feedbackservice(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_clone_feedbackservice(j, uniffiRustCallStatus);
    }

    public AIC() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C2348AIh.uniffiRustBuffer, new Function1() { // from class: o.AID
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AIC.EZpvd((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_constructor_feedbackservice_new(uniffiRustCallStatus);
    }

    public static final byte enableMonitorShakingIfNeeded$lambda$6(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2348AIh.uniffiRustBuffer, new Function1() { // from class: o.AIH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AIC.enableMonitorShakingIfNeeded$lambda$6$lambda$5(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte enableMonitorShakingIfNeeded$lambda$6$lambda$5(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_method_feedbackservice_enable_monitor_shaking_if_needed(j, uniffiRustCallStatus);
    }

    public static final Unit increaseShakingTimes$lambda$8(final long j) {
        C60173zxj.uniffiRustCall(C2348AIh.uniffiRustBuffer, new Function1() { // from class: o.AIG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AIC.increaseShakingTimes$lambda$8$lambda$7(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit increaseShakingTimes$lambda$8$lambda$7(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_experiment_fn_method_feedbackservice_increase_shaking_times(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final byte isShakingFeedbackAvailable$lambda$10(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2348AIh.uniffiRustBuffer, new Function1() { // from class: o.AIL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AIC.isShakingFeedbackAvailable$lambda$10$lambda$9(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isShakingFeedbackAvailable$lambda$10$lambda$9(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_method_feedbackservice_is_shaking_feedback_available(j, uniffiRustCallStatus);
    }
}
