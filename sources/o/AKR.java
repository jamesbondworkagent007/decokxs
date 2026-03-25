package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.feature_restriction.FfiConverterBoolean;
import uniffi.feature_restriction.FfiConverterOptionalSequenceString;
import uniffi.feature_restriction.FfiConverterOptionalTypeFeatureRestrictionConfigModel;
import uniffi.feature_restriction.FfiConverterSequenceString;
import uniffi.feature_restriction.FfiConverterString;
import uniffi.feature_restriction.FfiConverterTypeFeatureRestrictionConfigModel;
import uniffi.feature_restriction.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public class AKR extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKR(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), ALB.uniffiRustBuffer, new Function2() { // from class: o.AKN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AKR.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AKW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(AKR.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_free_featurerestrictiondebugbridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_clone_featurerestrictiondebugbridge(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKR(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), ALB.uniffiRustBuffer, new Function2() { // from class: o.ALm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AKR.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ALo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(AKR.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_free_featurerestrictiondebugbridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_clone_featurerestrictiondebugbridge(j, uniffiRustCallStatus);
    }

    public AKR() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AKR.KWHzl((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_constructor_featurerestrictiondebugbridge_new(uniffiRustCallStatus);
    }

    public static final Unit clearDebugAllFeatureConfigsOverride$lambda$6(final long j) {
        C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.clearDebugAllFeatureConfigsOverride$lambda$6$lambda$5(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit clearDebugAllFeatureConfigsOverride$lambda$6$lambda$5(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_clear_debug_all_feature_configs_override(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit clearDebugAllOverrides$lambda$8(final long j) {
        C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.clearDebugAllOverrides$lambda$8$lambda$7(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit clearDebugAllOverrides$lambda$8$lambda$7(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_clear_debug_all_overrides(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit clearDebugFeatureConfigOverride$lambda$10(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.clearDebugFeatureConfigOverride$lambda$10$lambda$9(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit clearDebugFeatureConfigOverride$lambda$10$lambda$9(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_clear_debug_feature_config_override(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public java.util.List<java.lang.String> KWHzl() {
        return (java.util.List) FfiConverterSequenceString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.getAllFeatureKeys$lambda$12(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getAllFeatureKeys$lambda$12(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.getAllFeatureKeys$lambda$12$lambda$11(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAllFeatureKeys$lambda$12$lambda$11(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_get_all_feature_keys(j, uniffiRustCallStatus);
    }

    public java.util.List<java.lang.String> AEQbTJ() {
        return (java.util.List) FfiConverterOptionalSequenceString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.getDebugAppModesOverride$lambda$14(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getDebugAppModesOverride$lambda$14(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.getDebugAppModesOverride$lambda$14$lambda$13(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getDebugAppModesOverride$lambda$14$lambda$13(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_get_debug_app_modes_override(j, uniffiRustCallStatus);
    }

    public java.util.List<java.lang.String> OLrzqt() {
        return (java.util.List) FfiConverterOptionalSequenceString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.getDebugCefiModesOverride$lambda$16(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getDebugCefiModesOverride$lambda$16(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.getDebugCefiModesOverride$lambda$16$lambda$15(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getDebugCefiModesOverride$lambda$16$lambda$15(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_get_debug_cefi_modes_override(j, uniffiRustCallStatus);
    }

    public AKL EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterOptionalTypeFeatureRestrictionConfigModel.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.getDebugFeatureConfigOverride$lambda$18(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getDebugFeatureConfigOverride$lambda$18(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.getDebugFeatureConfigOverride$lambda$18$lambda$17(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getDebugFeatureConfigOverride$lambda$18$lambda$17(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_get_debug_feature_config_override(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public boolean OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ALa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AKR.getDebugFeatureKeyOverriden$lambda$20(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte getDebugFeatureKeyOverriden$lambda$20(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AKR.getDebugFeatureKeyOverriden$lambda$20$lambda$19(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte getDebugFeatureKeyOverriden$lambda$20$lambda$19(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_get_debug_feature_key_overriden(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public static final RustBuffer.ByValue getDebugFeatureKeysOverride$lambda$22(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.getDebugFeatureKeysOverride$lambda$22$lambda$21(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getDebugFeatureKeysOverride$lambda$22$lambda$21(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_get_debug_feature_keys_override(j, uniffiRustCallStatus);
    }

    public static final byte isDebugFeatureKeyOverriden$lambda$24(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AKR.isDebugFeatureKeyOverriden$lambda$24$lambda$23(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isDebugFeatureKeyOverriden$lambda$24$lambda$23(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_is_debug_feature_key_overriden(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public static final byte isDebugModesOverriden$lambda$26(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AKR.isDebugModesOverriden$lambda$26$lambda$25(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isDebugModesOverriden$lambda$26$lambda$25(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_is_debug_modes_overriden(j, uniffiRustCallStatus);
    }

    public void OLrzqt(@NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.ALk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.setDebugAppModesOverride$lambda$28(list, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setDebugAppModesOverride$lambda$28(final java.util.List list, final long j) {
        C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.setDebugAppModesOverride$lambda$28$lambda$27(j, list, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setDebugAppModesOverride$lambda$28$lambda$27(long j, java.util.List list, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_set_debug_app_modes_override(j, FfiConverterSequenceString.INSTANCE.lower2((java.lang.Object) list), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void EZpvd(@NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.ALj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.setDebugCefiModesOverride$lambda$30(list, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setDebugCefiModesOverride$lambda$30(final java.util.List list, final long j) {
        C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.setDebugCefiModesOverride$lambda$30$lambda$29(j, list, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setDebugCefiModesOverride$lambda$30$lambda$29(long j, java.util.List list, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_set_debug_cefi_modes_override(j, FfiConverterSequenceString.INSTANCE.lower2((java.lang.Object) list), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void AEQbTJ(@NotNull final java.lang.String str, @NotNull final AKL akl) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(akl, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.ALd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.setDebugFeatureConfigOverride$lambda$32(str, akl, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setDebugFeatureConfigOverride$lambda$32(final java.lang.String str, final AKL akl, final long j) {
        C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.setDebugFeatureConfigOverride$lambda$32$lambda$31(j, str, akl, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setDebugFeatureConfigOverride$lambda$32$lambda$31(long j, java.lang.String str, AKL akl, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_set_debug_feature_config_override(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterTypeFeatureRestrictionConfigModel.INSTANCE.lower2((java.lang.Object) akl), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void OLrzqt(@NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.ALl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.setDebugFeatureKeyOverriden$lambda$34(str, z, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setDebugFeatureKeyOverriden$lambda$34(final java.lang.String str, final boolean z, final long j) {
        C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.setDebugFeatureKeyOverriden$lambda$34$lambda$33(j, str, z, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setDebugFeatureKeyOverriden$lambda$34$lambda$33(long j, java.lang.String str, boolean z, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_set_debug_feature_key_overriden(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit setDebugFeatureKeysOverride$lambda$36(final java.util.List list, final long j) {
        C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.setDebugFeatureKeysOverride$lambda$36$lambda$35(j, list, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setDebugFeatureKeysOverride$lambda$36$lambda$35(long j, java.util.List list, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_set_debug_feature_keys_override(j, FfiConverterSequenceString.INSTANCE.lower2((java.lang.Object) list), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit setDebugModesOverriden$lambda$38(final boolean z, final long j) {
        C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AKR.setDebugModesOverriden$lambda$38$lambda$37(j, z, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setDebugModesOverriden$lambda$38$lambda$37(long j, boolean z, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictiondebugbridge_set_debug_modes_overriden(j, FfiConverterBoolean.INSTANCE.lower(z).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
