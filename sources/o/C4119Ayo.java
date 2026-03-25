package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C4119Ayo;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.compliance.FfiConverterBoolean;
import uniffi.compliance.FfiConverterDouble;
import uniffi.compliance.FfiConverterFloat;
import uniffi.compliance.FfiConverterInt;
import uniffi.compliance.FfiConverterLong;
import uniffi.compliance.FfiConverterString;
import uniffi.compliance.FfiConverterTypeIDScanCallback;
import uniffi.compliance.FfiConverterTypeIDScanConfig;
import uniffi.compliance.FfiConverterTypeIDScanOrchestratorBridge;
import uniffi.compliance.UniffiLib;

/* JADX INFO: renamed from: o.Ayo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C4119Ayo extends AbstractC60182zxs {
    public static final int $stable = 0;
    public static final Activity Companion = new Activity(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4119Ayo(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), C3981AwI.uniffiRustBuffer, new Function2() { // from class: o.Ayu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4119Ayo.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Ayz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4119Ayo.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_free_idscanorchestratorbridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_clone_idscanorchestratorbridge(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4119Ayo(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), C3981AwI.uniffiRustBuffer, new Function2() { // from class: o.AyS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4119Ayo.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AyT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4119Ayo.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_free_idscanorchestratorbridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_clone_idscanorchestratorbridge(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4119Ayo(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Ayt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4119Ayo._init_$lambda$4(str, str2, (UniffiRustCallStatus) obj));
            }
        })).longValue());
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    public static final long _init_$lambda$4(java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_compliance_fn_constructor_idscanorchestratorbridge_new(ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
    }

    public float KWHzl() {
        return FfiConverterFloat.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AyM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Float.valueOf(C4119Ayo.getOutputPaddingRatio$lambda$6(((java.lang.Long) obj).longValue()));
            }
        })).floatValue()).floatValue();
    }

    public static final float getOutputPaddingRatio$lambda$6(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Azc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Float.valueOf(C4119Ayo.getOutputPaddingRatio$lambda$6$lambda$5(j, (UniffiRustCallStatus) obj));
            }
        })).floatValue();
    }

    public static final float getOutputPaddingRatio$lambda$6$lambda$5(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscanorchestratorbridge_get_output_padding_ratio(j, uniffiRustCallStatus);
    }

    public int EZpvd() {
        return FfiConverterInt.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AyQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C4119Ayo.getSuccessCount$lambda$8(((java.lang.Long) obj).longValue()));
            }
        })).intValue()).intValue();
    }

    public static final int getSuccessCount$lambda$8(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Azd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C4119Ayo.getSuccessCount$lambda$8$lambda$7(j, (UniffiRustCallStatus) obj));
            }
        })).intValue();
    }

    public static final int getSuccessCount$lambda$8$lambda$7(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscanorchestratorbridge_get_success_count(j, uniffiRustCallStatus);
    }

    public boolean copydefault() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AyH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4119Ayo.isAnalyzerEnabled$lambda$10(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isAnalyzerEnabled$lambda$10(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AyA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4119Ayo.isAnalyzerEnabled$lambda$10$lambda$9(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isAnalyzerEnabled$lambda$10$lambda$9(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscanorchestratorbridge_is_analyzer_enabled(j, uniffiRustCallStatus);
    }

    public void EZpvd(final boolean z, final long j, final boolean z2) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AyW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.onAutofocusCompletedWithRetry$lambda$12(z, j, z2, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onAutofocusCompletedWithRetry$lambda$12(final boolean z, final long j, final boolean z2, final long j2) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AyF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.onAutofocusCompletedWithRetry$lambda$12$lambda$11(j2, z, j, z2, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onAutofocusCompletedWithRetry$lambda$12$lambda$11(long j, boolean z, long j2, boolean z2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        uniffiLib.uniffi_compliance_fn_method_idscanorchestratorbridge_on_autofocus_completed_with_retry(j, ffiConverterBoolean.lower(z).byteValue(), FfiConverterLong.INSTANCE.lower(j2).longValue(), ffiConverterBoolean.lower(z2).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void KWHzl(final boolean z, final boolean z2) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AyB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.onFrameSubmitted$lambda$14(z, z2, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onFrameSubmitted$lambda$14(final boolean z, final boolean z2, final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AyU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.onFrameSubmitted$lambda$14$lambda$13(j, z, z2, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onFrameSubmitted$lambda$14$lambda$13(long j, boolean z, boolean z2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        uniffiLib.uniffi_compliance_fn_method_idscanorchestratorbridge_on_frame_submitted(j, ffiConverterBoolean.lower(z).byteValue(), ffiConverterBoolean.lower(z2).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void AEQbTJ(final int i, final long j, final long j2, final boolean z, final boolean z2, final boolean z3) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Ayp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.onFrameWithHandles$lambda$16(i, j, j2, z, z2, z3, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onFrameWithHandles$lambda$16(final int i, final long j, final long j2, final boolean z, final boolean z2, final boolean z3, final long j3) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Ayy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.onFrameWithHandles$lambda$16$lambda$15(j3, i, j, j2, z, z2, z3, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onFrameWithHandles$lambda$16$lambda$15(long j, int i, long j2, long j3, boolean z, boolean z2, boolean z3, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        int iIntValue = FfiConverterInt.INSTANCE.lower(i).intValue();
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jLongValue = ffiConverterLong.lower(j2).longValue();
        long jLongValue2 = ffiConverterLong.lower(j3).longValue();
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        uniffiLib.uniffi_compliance_fn_method_idscanorchestratorbridge_on_frame_with_handles(j, iIntValue, jLongValue, jLongValue2, ffiConverterBoolean.lower(z).byteValue(), ffiConverterBoolean.lower(z2).byteValue(), ffiConverterBoolean.lower(z3).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void copydefault(final double d, final double d2, final double d3, final long j) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AyV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.onGyroSample$lambda$18(d, d2, d3, j, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onGyroSample$lambda$18(final double d, final double d2, final double d3, final long j, final long j2) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AyL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.onGyroSample$lambda$18$lambda$17(j2, d, d2, d3, j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onGyroSample$lambda$18$lambda$17(long j, double d, double d2, double d3, long j2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        uniffiLib.uniffi_compliance_fn_method_idscanorchestratorbridge_on_gyro_sample(j, ffiConverterDouble.lower(d).doubleValue(), ffiConverterDouble.lower(d2).doubleValue(), ffiConverterDouble.lower(d3).doubleValue(), FfiConverterLong.INSTANCE.lower(j2).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AyO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.onMlkitFailure$lambda$20(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onMlkitFailure$lambda$20(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AyX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.onMlkitFailure$lambda$20$lambda$19(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onMlkitFailure$lambda$20$lambda$19(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscanorchestratorbridge_on_mlkit_failure(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void OLrzqt() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Aze
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.onRealShakeDetected$lambda$22(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onRealShakeDetected$lambda$22(final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AyC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.onRealShakeDetected$lambda$22$lambda$21(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onRealShakeDetected$lambda$22$lambda$21(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscanorchestratorbridge_on_real_shake_detected(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void AEQbTJ() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AyY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.onRefocusRequested$lambda$24(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onRefocusRequested$lambda$24(final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Ayn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.onRefocusRequested$lambda$24$lambda$23(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onRefocusRequested$lambda$24$lambda$23(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscanorchestratorbridge_on_refocus_requested(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void gEmmrt() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AyD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.pauseAnalyzer$lambda$26(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit pauseAnalyzer$lambda$26(final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Ayw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.pauseAnalyzer$lambda$26$lambda$25(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit pauseAnalyzer$lambda$26$lambda$25(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscanorchestratorbridge_pause_analyzer(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public boolean EZpvd(final int i, final float f, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final float f8) {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AyG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4119Ayo.preCheckCoordinates$lambda$28(i, f, f2, f3, f4, f5, f6, f7, f8, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte preCheckCoordinates$lambda$28(final int i, final float f, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final float f8, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AyI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4119Ayo.preCheckCoordinates$lambda$28$lambda$27(j, i, f, f2, f3, f4, f5, f6, f7, f8, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte preCheckCoordinates$lambda$28$lambda$27(long j, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        int iIntValue = FfiConverterInt.INSTANCE.lower(i).intValue();
        FfiConverterFloat ffiConverterFloat = FfiConverterFloat.INSTANCE;
        return uniffiLib.uniffi_compliance_fn_method_idscanorchestratorbridge_pre_check_coordinates(j, iIntValue, ffiConverterFloat.lower(f).floatValue(), ffiConverterFloat.lower(f2).floatValue(), ffiConverterFloat.lower(f3).floatValue(), ffiConverterFloat.lower(f4).floatValue(), ffiConverterFloat.lower(f5).floatValue(), ffiConverterFloat.lower(f6).floatValue(), ffiConverterFloat.lower(f7).floatValue(), ffiConverterFloat.lower(f8).floatValue(), uniffiRustCallStatus);
    }

    public void OLrzqt(@NotNull final InterfaceC4055Axd interfaceC4055Axd) {
        Intrinsics.checkNotNullParameter(interfaceC4055Axd, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AyE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.registerCallback$lambda$30(interfaceC4055Axd, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit registerCallback$lambda$30(final InterfaceC4055Axd interfaceC4055Axd, final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AyP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.registerCallback$lambda$30$lambda$29(j, interfaceC4055Axd, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit registerCallback$lambda$30$lambda$29(long j, InterfaceC4055Axd interfaceC4055Axd, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscanorchestratorbridge_register_callback(j, FfiConverterTypeIDScanCallback.INSTANCE.lower2(interfaceC4055Axd).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void AhwBna() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Ays
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.resetGyro$lambda$32(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit resetGyro$lambda$32(final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AyK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.resetGyro$lambda$32$lambda$31(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit resetGyro$lambda$32$lambda$31(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscanorchestratorbridge_reset_gyro(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void valueOf() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AyR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.resumeAnalyzer$lambda$34(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit resumeAnalyzer$lambda$34(final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Azf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.resumeAnalyzer$lambda$34$lambda$33(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit resumeAnalyzer$lambda$34$lambda$33(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscanorchestratorbridge_resume_analyzer(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void AEQbTJ(@NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Aza
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.sendPlatformEvent$lambda$36(str, z, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit sendPlatformEvent$lambda$36(final java.lang.String str, final boolean z, final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Ayv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.sendPlatformEvent$lambda$36$lambda$35(j, str, z, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit sendPlatformEvent$lambda$36$lambda$35(long j, java.lang.String str, boolean z, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscanorchestratorbridge_send_platform_event(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void OLrzqt(final boolean z) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Ayr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.setDebugMode$lambda$38(z, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setDebugMode$lambda$38(final boolean z, final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AyN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.setDebugMode$lambda$38$lambda$37(j, z, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setDebugMode$lambda$38$lambda$37(long j, boolean z, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscanorchestratorbridge_set_debug_mode(j, FfiConverterBoolean.INSTANCE.lower(z).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void AYXKKw() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Ayx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.start$lambda$40(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit start$lambda$40(final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AyZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.start$lambda$40$lambda$39(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit start$lambda$40$lambda$39(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscanorchestratorbridge_start(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Ayq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.stop$lambda$42(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit stop$lambda$42(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AyJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4119Ayo.stop$lambda$42$lambda$41(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit stop$lambda$42$lambda$41(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscanorchestratorbridge_stop(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.Ayo$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Ayo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C4119Ayo OLrzqt(@NotNull final C4071Axt c4071Axt) {
            Intrinsics.checkNotNullParameter(c4071Axt, "");
            return FfiConverterTypeIDScanOrchestratorBridge.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Azb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Long.valueOf(C4119Ayo.Activity.newWithConfig$lambda$0(c4071Axt, (UniffiRustCallStatus) obj));
                }
            })).longValue());
        }

        public static final long newWithConfig$lambda$0(C4071Axt c4071Axt, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.uniffi_compliance_fn_constructor_idscanorchestratorbridge_new_with_config(FfiConverterTypeIDScanConfig.INSTANCE.lower2((java.lang.Object) c4071Axt), uniffiRustCallStatus);
        }
    }
}
