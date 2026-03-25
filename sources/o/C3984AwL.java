package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.compliance.FfiConverterLong;
import uniffi.compliance.FfiConverterTypeGyroSample;
import uniffi.compliance.FfiConverterTypeMotionBlurConfig;
import uniffi.compliance.UniffiLib;

/* JADX INFO: renamed from: o.AwL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C3984AwL extends AbstractC60182zxs {
    public static final int $stable = 0;
    public static final Application Companion = new Application(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3984AwL(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), C3981AwI.uniffiRustBuffer, new Function2() { // from class: o.AwZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3984AwL.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AwU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3984AwL.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_free_gyroblurdetector(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_clone_gyroblurdetector(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3984AwL(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), C3981AwI.uniffiRustBuffer, new Function2() { // from class: o.AwR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3984AwL.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AwT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3984AwL.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_free_gyroblurdetector(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_clone_gyroblurdetector(j, uniffiRustCallStatus);
    }

    public static final Unit addSample$lambda$5(final C3995AwW c3995AwW, final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AwQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3984AwL.addSample$lambda$5$lambda$4(j, c3995AwW, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit addSample$lambda$5$lambda$4(long j, C3995AwW c3995AwW, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_gyroblurdetector_add_sample(j, FfiConverterTypeGyroSample.INSTANCE.lower2((java.lang.Object) c3995AwW), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue estimateMotionBlur$lambda$7(final long j, final long j2) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AwN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3984AwL.estimateMotionBlur$lambda$7$lambda$6(j2, j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue estimateMotionBlur$lambda$7$lambda$6(long j, long j2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_gyroblurdetector_estimate_motion_blur(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), uniffiRustCallStatus);
    }

    public static final RustBuffer.ByValue getCurrentMotionBlur$lambda$9(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AwS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3984AwL.getCurrentMotionBlur$lambda$9$lambda$8(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCurrentMotionBlur$lambda$9$lambda$8(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_gyroblurdetector_get_current_motion_blur(j, uniffiRustCallStatus);
    }

    public static final Unit markExposureStart$lambda$11(final long j, final long j2) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AwV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3984AwL.markExposureStart$lambda$11$lambda$10(j2, j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit markExposureStart$lambda$11$lambda$10(long j, long j2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_gyroblurdetector_mark_exposure_start(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit reset$lambda$13(final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AwY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3984AwL.reset$lambda$13$lambda$12(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit reset$lambda$13$lambda$12(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_gyroblurdetector_reset(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit setConfig$lambda$15(final C4166Azi c4166Azi, final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AwX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3984AwL.setConfig$lambda$15$lambda$14(j, c4166Azi, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setConfig$lambda$15$lambda$14(long j, C4166Azi c4166Azi, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_gyroblurdetector_set_config(j, FfiConverterTypeMotionBlurConfig.INSTANCE.lower2((java.lang.Object) c4166Azi), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.AwL$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AwL.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static final long create$lambda$0(UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.uniffi_compliance_fn_constructor_gyroblurdetector_create(uniffiRustCallStatus);
        }

        public static final long createWithConfig$lambda$1(C4166Azi c4166Azi, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.uniffi_compliance_fn_constructor_gyroblurdetector_create_with_config(FfiConverterTypeMotionBlurConfig.INSTANCE.lower2((java.lang.Object) c4166Azi), uniffiRustCallStatus);
        }
    }
}
