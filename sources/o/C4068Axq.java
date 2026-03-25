package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C4068Axq;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.compliance.FfiConverterBoolean;
import uniffi.compliance.FfiConverterDouble;
import uniffi.compliance.FfiConverterFloat;
import uniffi.compliance.FfiConverterInt;
import uniffi.compliance.FfiConverterLong;
import uniffi.compliance.FfiConverterOptionalDouble;
import uniffi.compliance.FfiConverterOptionalTypeGyroBlurDetector;
import uniffi.compliance.FfiConverterSequenceFloat;
import uniffi.compliance.FfiConverterString;
import uniffi.compliance.FfiConverterTypeBlurResult;
import uniffi.compliance.FfiConverterTypeBrightnessResult;
import uniffi.compliance.FfiConverterTypeFusionBlurResult;
import uniffi.compliance.FfiConverterTypeGlareCheckBridgeResult;
import uniffi.compliance.FfiConverterTypeGlareDetectionParams;
import uniffi.compliance.FfiConverterTypeGlareResult;
import uniffi.compliance.FfiConverterTypeIDScanConfig;
import uniffi.compliance.FfiConverterTypeIDScanDebugBridge;
import uniffi.compliance.FfiConverterUByte;
import uniffi.compliance.UniffiLib;

/* JADX INFO: renamed from: o.Axq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C4068Axq extends AbstractC60182zxs {
    public static final int $stable = 0;
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4068Axq(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), C3981AwI.uniffiRustBuffer, new Function2() { // from class: o.Ayc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4068Axq.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Ayf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4068Axq.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_free_idscandebugbridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_clone_idscandebugbridge(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4068Axq(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), C3981AwI.uniffiRustBuffer, new Function2() { // from class: o.AxK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4068Axq.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AxM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4068Axq.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_free_idscandebugbridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_clone_idscandebugbridge(j, uniffiRustCallStatus);
    }

    public C3982AwJ OLrzqt(final long j, final double d) {
        return (C3982AwJ) FfiConverterTypeFusionBlurResult.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AxR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.analyzeBlurFusionBenchmark$lambda$5(j, d, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue analyzeBlurFusionBenchmark$lambda$5(final long j, final double d, final long j2) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AxB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.analyzeBlurFusionBenchmark$lambda$5$lambda$4(j2, j, d, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue analyzeBlurFusionBenchmark$lambda$5$lambda$4(long j, long j2, double d, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_analyze_blur_fusion_benchmark(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), FfiConverterDouble.INSTANCE.lower(d).doubleValue(), uniffiRustCallStatus);
    }

    public static final RustBuffer.ByValue analyzeBlurFusionHandle$lambda$7(final long j, final C3984AwL c3984AwL, final long j2) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Axs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.analyzeBlurFusionHandle$lambda$7$lambda$6(j2, j, c3984AwL, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue analyzeBlurFusionHandle$lambda$7$lambda$6(long j, long j2, C3984AwL c3984AwL, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_analyze_blur_fusion_handle(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), FfiConverterOptionalTypeGyroBlurDetector.INSTANCE.lower2(c3984AwL), uniffiRustCallStatus);
    }

    public C3982AwJ OLrzqt(final long j, final java.lang.Double d) {
        return (C3982AwJ) FfiConverterTypeFusionBlurResult.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Ayk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.analyzeBlurFusionWithGyro$lambda$9(j, d, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue analyzeBlurFusionWithGyro$lambda$9(final long j, final java.lang.Double d, final long j2) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AxV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.analyzeBlurFusionWithGyro$lambda$9$lambda$8(j2, j, d, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue analyzeBlurFusionWithGyro$lambda$9$lambda$8(long j, long j2, java.lang.Double d, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_analyze_blur_fusion_with_gyro(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), FfiConverterOptionalDouble.INSTANCE.lower2(d), uniffiRustCallStatus);
    }

    public C3976AwD copydefault(final long j, final double d) {
        return (C3976AwD) FfiConverterTypeBlurResult.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AxF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.analyzeBlurHandle$lambda$11(j, d, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue analyzeBlurHandle$lambda$11(final long j, final double d, final long j2) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Ayj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.analyzeBlurHandle$lambda$11$lambda$10(j2, j, d, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue analyzeBlurHandle$lambda$11$lambda$10(long j, long j2, double d, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_analyze_blur_handle(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), FfiConverterDouble.INSTANCE.lower(d).doubleValue(), uniffiRustCallStatus);
    }

    public C3977AwE OLrzqt(final long j) {
        return (C3977AwE) FfiConverterTypeBrightnessResult.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Ayg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.analyzeBrightnessHandle$lambda$13(j, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue analyzeBrightnessHandle$lambda$13(final long j, final long j2) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Ayi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.analyzeBrightnessHandle$lambda$13$lambda$12(j2, j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue analyzeBrightnessHandle$lambda$13$lambda$12(long j, long j2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_analyze_brightness_handle(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), uniffiRustCallStatus);
    }

    public C3988AwP AEQbTJ(final long j, @NotNull final C3987AwO c3987AwO, final double d) {
        Intrinsics.checkNotNullParameter(c3987AwO, "");
        return (C3988AwP) FfiConverterTypeGlareResult.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AxE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.analyzeGlareEnhancedHandle$lambda$15(j, c3987AwO, d, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue analyzeGlareEnhancedHandle$lambda$15(final long j, final C3987AwO c3987AwO, final double d, final long j2) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Aye
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.analyzeGlareEnhancedHandle$lambda$15$lambda$14(j2, j, c3987AwO, d, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue analyzeGlareEnhancedHandle$lambda$15$lambda$14(long j, long j2, C3987AwO c3987AwO, double d, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_analyze_glare_enhanced_handle(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), FfiConverterTypeGlareDetectionParams.INSTANCE.lower2((java.lang.Object) c3987AwO), FfiConverterDouble.INSTANCE.lower(d).doubleValue(), uniffiRustCallStatus);
    }

    public C3988AwP EZpvd(final long j, final byte b, final double d) {
        return (C3988AwP) FfiConverterTypeGlareResult.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AxL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.analyzeGlareLegacyHandle_Zo7BePA$lambda$17(j, b, d, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue analyzeGlareLegacyHandle_Zo7BePA$lambda$17(final long j, final byte b, final double d, final long j2) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AxQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.analyzeGlareLegacyHandle_Zo7BePA$lambda$17$lambda$16(j2, j, b, d, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue analyzeGlareLegacyHandle_Zo7BePA$lambda$17$lambda$16(long j, long j2, byte b, double d, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_analyze_glare_legacy_handle(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), FfiConverterUByte.INSTANCE.m9545lower7apg3OU(b).byteValue(), FfiConverterDouble.INSTANCE.lower(d).doubleValue(), uniffiRustCallStatus);
    }

    public double AEQbTJ(final long j) {
        return FfiConverterDouble.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Ayd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Double.valueOf(C4068Axq.analyzeSmdHandle$lambda$19(j, ((java.lang.Long) obj).longValue()));
            }
        })).doubleValue()).doubleValue();
    }

    public static final double analyzeSmdHandle$lambda$19(final long j, final long j2) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AxC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Double.valueOf(C4068Axq.analyzeSmdHandle$lambda$19$lambda$18(j2, j, (UniffiRustCallStatus) obj));
            }
        })).doubleValue();
    }

    public static final double analyzeSmdHandle$lambda$19$lambda$18(long j, long j2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_analyze_smd_handle(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), uniffiRustCallStatus);
    }

    public java.util.List<java.lang.Float> AEQbTJ(final long j, final int i, final int i2, final float f, final float f2, final int i3, final int i4, final int i5) {
        return (java.util.List) FfiConverterSequenceFloat.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AxG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.detectCardAngleHandle$lambda$21(j, i, i2, f, f2, i3, i4, i5, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue detectCardAngleHandle$lambda$21(final long j, final int i, final int i2, final float f, final float f2, final int i3, final int i4, final int i5, final long j2) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Aya
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.detectCardAngleHandle$lambda$21$lambda$20(j2, j, i, i2, f, f2, i3, i4, i5, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue detectCardAngleHandle$lambda$21$lambda$20(long j, long j2, int i, int i2, float f, float f2, int i3, int i4, int i5, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        long jLongValue = FfiConverterLong.INSTANCE.lower(j2).longValue();
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        int iIntValue = ffiConverterInt.lower(i).intValue();
        int iIntValue2 = ffiConverterInt.lower(i2).intValue();
        FfiConverterFloat ffiConverterFloat = FfiConverterFloat.INSTANCE;
        return uniffiLib.uniffi_compliance_fn_method_idscandebugbridge_detect_card_angle_handle(j, jLongValue, iIntValue, iIntValue2, ffiConverterFloat.lower(f).floatValue(), ffiConverterFloat.lower(f2).floatValue(), ffiConverterInt.lower(i3).intValue(), ffiConverterInt.lower(i4).intValue(), ffiConverterInt.lower(i5).intValue(), uniffiRustCallStatus);
    }

    public static final RustBuffer.ByValue detectEdgeHandle$lambda$23(final long j, final long j2) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AxY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.detectEdgeHandle$lambda$23$lambda$22(j2, j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue detectEdgeHandle$lambda$23$lambda$22(long j, long j2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_detect_edge_handle(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), uniffiRustCallStatus);
    }

    public int KWHzl(final long j, final int i, final byte b, final boolean z, @NotNull final C3987AwO c3987AwO) {
        Intrinsics.checkNotNullParameter(c3987AwO, "");
        return FfiConverterInt.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Ayh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C4068Axq.detectGlareSplitHandle_oF_AHCs$lambda$25(j, i, b, z, c3987AwO, ((java.lang.Long) obj).longValue()));
            }
        })).intValue()).intValue();
    }

    public static final int detectGlareSplitHandle_oF_AHCs$lambda$25(final long j, final int i, final byte b, final boolean z, final C3987AwO c3987AwO, final long j2) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AxO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C4068Axq.detectGlareSplitHandle_oF_AHCs$lambda$25$lambda$24(j2, j, i, b, z, c3987AwO, (UniffiRustCallStatus) obj));
            }
        })).intValue();
    }

    public static final int detectGlareSplitHandle_oF_AHCs$lambda$25$lambda$24(long j, long j2, int i, byte b, boolean z, C3987AwO c3987AwO, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_detect_glare_split_handle(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), FfiConverterInt.INSTANCE.lower(i).intValue(), FfiConverterUByte.INSTANCE.m9545lower7apg3OU(b).byteValue(), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), FfiConverterTypeGlareDetectionParams.INSTANCE.lower2((java.lang.Object) c3987AwO), uniffiRustCallStatus);
    }

    public static final Unit freeMatHandle$lambda$27(final long j, final long j2) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AxH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.freeMatHandle$lambda$27$lambda$26(j2, j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit freeMatHandle$lambda$27$lambda$26(long j, long j2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_free_mat_handle(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue getConfigSummary$lambda$29(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Axx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.getConfigSummary$lambda$29$lambda$28(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getConfigSummary$lambda$29$lambda$28(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_get_config_summary(j, uniffiRustCallStatus);
    }

    public static final RustBuffer.ByValue getDefaultThresholds$lambda$31(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Axy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.getDefaultThresholds$lambda$31$lambda$30(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getDefaultThresholds$lambda$31$lambda$30(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_get_default_thresholds(j, uniffiRustCallStatus);
    }

    public java.lang.String EZpvd() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Axv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.getRawRemoteConfig$lambda$33(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getRawRemoteConfig$lambda$33(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AxX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.getRawRemoteConfig$lambda$33$lambda$32(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getRawRemoteConfig$lambda$33$lambda$32(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_get_raw_remote_config(j, uniffiRustCallStatus);
    }

    public C4071Axt OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return (C4071Axt) FfiConverterTypeIDScanConfig.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AxT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.getRemoteScanConfig$lambda$35(str, str2, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getRemoteScanConfig$lambda$35(final java.lang.String str, final java.lang.String str2, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Axu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.getRemoteScanConfig$lambda$35$lambda$34(j, str, str2, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getRemoteScanConfig$lambda$35$lambda$34(long j, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_compliance_fn_method_idscandebugbridge_get_remote_scan_config(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
    }

    public long EZpvd(final long j, final int i) {
        return FfiConverterLong.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AxN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4068Axq.glareStep1BlurHandle$lambda$37(j, i, ((java.lang.Long) obj).longValue()));
            }
        })).longValue()).longValue();
    }

    public static final long glareStep1BlurHandle$lambda$37(final long j, final int i, final long j2) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Axw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4068Axq.glareStep1BlurHandle$lambda$37$lambda$36(j2, j, i, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long glareStep1BlurHandle$lambda$37$lambda$36(long j, long j2, int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_glare_step1_blur_handle(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), FfiConverterInt.INSTANCE.lower(i).intValue(), uniffiRustCallStatus);
    }

    public long copydefault(final long j, final int i, final int i2) {
        return FfiConverterLong.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Axz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4068Axq.glareStep2ResizeHandle$lambda$39(j, i, i2, ((java.lang.Long) obj).longValue()));
            }
        })).longValue()).longValue();
    }

    public static final long glareStep2ResizeHandle$lambda$39(final long j, final int i, final int i2, final long j2) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AxU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4068Axq.glareStep2ResizeHandle$lambda$39$lambda$38(j2, j, i, i2, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long glareStep2ResizeHandle$lambda$39$lambda$38(long j, long j2, int i, int i2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        long jLongValue = FfiConverterLong.INSTANCE.lower(j2).longValue();
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return uniffiLib.uniffi_compliance_fn_method_idscandebugbridge_glare_step2_resize_handle(j, jLongValue, ffiConverterInt.lower(i).intValue(), ffiConverterInt.lower(i2).intValue(), uniffiRustCallStatus);
    }

    public long AEQbTJ(final long j, final int i) {
        return FfiConverterLong.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AxZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4068Axq.glareStep3BrightnessHandle$lambda$41(j, i, ((java.lang.Long) obj).longValue()));
            }
        })).longValue()).longValue();
    }

    public static final long glareStep3BrightnessHandle$lambda$41(final long j, final int i, final long j2) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AxS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4068Axq.glareStep3BrightnessHandle$lambda$41$lambda$40(j2, j, i, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long glareStep3BrightnessHandle$lambda$41$lambda$40(long j, long j2, int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_glare_step3_brightness_handle(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), FfiConverterInt.INSTANCE.lower(i).intValue(), uniffiRustCallStatus);
    }

    public long OLrzqt(final long j, final int i, final int i2) {
        return FfiConverterLong.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AxA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4068Axq.glareStep4SaturationHandle$lambda$43(j, i, i2, ((java.lang.Long) obj).longValue()));
            }
        })).longValue()).longValue();
    }

    public static final long glareStep4SaturationHandle$lambda$43(final long j, final int i, final int i2, final long j2) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Ayb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4068Axq.glareStep4SaturationHandle$lambda$43$lambda$42(j2, j, i, i2, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long glareStep4SaturationHandle$lambda$43$lambda$42(long j, long j2, int i, int i2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        long jLongValue = FfiConverterLong.INSTANCE.lower(j2).longValue();
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return uniffiLib.uniffi_compliance_fn_method_idscandebugbridge_glare_step4_saturation_handle(j, jLongValue, ffiConverterInt.lower(i).intValue(), ffiConverterInt.lower(i2).intValue(), uniffiRustCallStatus);
    }

    public long KWHzl(final long j, final long j2) {
        return FfiConverterLong.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Aym
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4068Axq.glareStep5CombinedHandle$lambda$45(j, j2, ((java.lang.Long) obj).longValue()));
            }
        })).longValue()).longValue();
    }

    public static final long glareStep5CombinedHandle$lambda$45(final long j, final long j2, final long j3) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AxP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4068Axq.glareStep5CombinedHandle$lambda$45$lambda$44(j3, j, j2, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long glareStep5CombinedHandle$lambda$45$lambda$44(long j, long j2, long j3, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        return uniffiLib.uniffi_compliance_fn_method_idscandebugbridge_glare_step5_combined_handle(j, ffiConverterLong.lower(j2).longValue(), ffiConverterLong.lower(j3).longValue(), uniffiRustCallStatus);
    }

    public long AEQbTJ(final long j, final int i, final int i2) {
        return FfiConverterLong.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AxW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4068Axq.glareStep6MorphologicalHandle$lambda$47(j, i, i2, ((java.lang.Long) obj).longValue()));
            }
        })).longValue()).longValue();
    }

    public static final long glareStep6MorphologicalHandle$lambda$47(final long j, final int i, final int i2, final long j2) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AxD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4068Axq.glareStep6MorphologicalHandle$lambda$47$lambda$46(j2, j, i, i2, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long glareStep6MorphologicalHandle$lambda$47$lambda$46(long j, long j2, int i, int i2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        long jLongValue = FfiConverterLong.INSTANCE.lower(j2).longValue();
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return uniffiLib.uniffi_compliance_fn_method_idscandebugbridge_glare_step6_morphological_handle(j, jLongValue, ffiConverterInt.lower(i).intValue(), ffiConverterInt.lower(i2).intValue(), uniffiRustCallStatus);
    }

    public static final byte isRemoteConfigLoaded$lambda$49(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.AxI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4068Axq.isRemoteConfigLoaded$lambda$49$lambda$48(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isRemoteConfigLoaded$lambda$49$lambda$48(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscandebugbridge_is_remote_config_loaded(j, uniffiRustCallStatus);
    }

    public C3985AwM KWHzl(final long j, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return (C3985AwM) FfiConverterTypeGlareCheckBridgeResult.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AxJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.runGlareCheck$lambda$51(j, str, str2, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue runGlareCheck$lambda$51(final long j, final java.lang.String str, final java.lang.String str2, final long j2) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Axr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4068Axq.runGlareCheck$lambda$51$lambda$50(j2, j, str, str2, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue runGlareCheck$lambda$51$lambda$50(long j, long j2, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        long jLongValue = FfiConverterLong.INSTANCE.lower(j2).longValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_compliance_fn_method_idscandebugbridge_run_glare_check(j, jLongValue, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
    }

    /* JADX INFO: renamed from: o.Axq$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Axq.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C4068Axq AEQbTJ() {
            return FfiConverterTypeIDScanDebugBridge.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Ayl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Long.valueOf(C4068Axq.TaskDescription.create$lambda$0((UniffiRustCallStatus) obj));
                }
            })).longValue());
        }

        public static final long create$lambda$0(UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.uniffi_compliance_fn_constructor_idscandebugbridge_create(uniffiRustCallStatus);
        }
    }
}
