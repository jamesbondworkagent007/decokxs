package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.feature_restriction.FfiConverterBoolean;
import uniffi.feature_restriction.FfiConverterOptionalString;
import uniffi.feature_restriction.FfiConverterOptionalTypeFeatureRestrictionConfigModel;
import uniffi.feature_restriction.FfiConverterSequenceString;
import uniffi.feature_restriction.FfiConverterString;
import uniffi.feature_restriction.FfiConverterTypeOKNativeTaskboolWithNativeFetchFeatureRestrictionError;
import uniffi.feature_restriction.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public class ALJ extends AbstractC60182zxs implements ALH {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ALJ(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), ALB.uniffiRustBuffer, new Function2() { // from class: o.AMa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ALJ.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AMc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(ALJ.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_free_nativefeaturerestrictioninterface(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_clone_nativefeaturerestrictioninterface(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ALJ(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), ALB.uniffiRustBuffer, new Function2() { // from class: o.ALV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ALJ.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ALX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(ALJ.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_free_nativefeaturerestrictioninterface(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_clone_nativefeaturerestrictioninterface(j, uniffiRustCallStatus);
    }

    @Override // o.ALH
    public InterfaceC2462AMr EZpvd() {
        return FfiConverterTypeOKNativeTaskboolWithNativeFetchFeatureRestrictionError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AMj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(ALJ.fetchFeatureRestrictions$lambda$5(((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long fetchFeatureRestrictions$lambda$5(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AMh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(ALJ.fetchFeatureRestrictions$lambda$5$lambda$4(j, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long fetchFeatureRestrictions$lambda$5$lambda$4(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_nativefeaturerestrictioninterface_fetch_feature_restrictions(j, uniffiRustCallStatus);
    }

    @Override // o.ALH
    public boolean KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ALY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ALJ.isFeatureHidden$lambda$7(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isFeatureHidden$lambda$7(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ALJ.isFeatureHidden$lambda$7$lambda$6(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isFeatureHidden$lambda$7$lambda$6(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_nativefeaturerestrictioninterface_is_feature_hidden(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.ALH
    public boolean AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AMn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ALJ.isFeatureLimit$lambda$9(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isFeatureLimit$lambda$9(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ALJ.isFeatureLimit$lambda$9$lambda$8(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isFeatureLimit$lambda$9$lambda$8(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_nativefeaturerestrictioninterface_is_feature_limit(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.ALH
    public AKL OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterOptionalTypeFeatureRestrictionConfigModel.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ALR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getFeatureConfigModel$lambda$11(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getFeatureConfigModel$lambda$11(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getFeatureConfigModel$lambda$11$lambda$10(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getFeatureConfigModel$lambda$11$lambda$10(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_nativefeaturerestrictioninterface_get_feature_config_model(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.ALH
    public java.lang.String djBIcL() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ALG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getEntityId$lambda$13(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getEntityId$lambda$13(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getEntityId$lambda$13$lambda$12(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getEntityId$lambda$13$lambda$12(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_nativefeaturerestrictioninterface_get_entity_id(j, uniffiRustCallStatus);
    }

    @Override // o.ALH
    public java.lang.String AEQbTJ() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ALI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getCountry$lambda$15(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getCountry$lambda$15(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getCountry$lambda$15$lambda$14(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCountry$lambda$15$lambda$14(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_nativefeaturerestrictioninterface_get_country(j, uniffiRustCallStatus);
    }

    @Override // o.ALH
    public boolean AhwBna() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ALZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ALJ.isCrMarket$lambda$17(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isCrMarket$lambda$17(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AMb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ALJ.isCrMarket$lambda$17$lambda$16(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isCrMarket$lambda$17$lambda$16(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_nativefeaturerestrictioninterface_is_cr_market(j, uniffiRustCallStatus);
    }

    @Override // o.ALH
    public java.lang.String gEmmrt() {
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AMi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getI18nDtoJson$lambda$19(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getI18nDtoJson$lambda$19(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getI18nDtoJson$lambda$19$lambda$18(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getI18nDtoJson$lambda$19$lambda$18(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_nativefeaturerestrictioninterface_get_i18n_dto_json(j, uniffiRustCallStatus);
    }

    @Override // o.ALH
    public java.util.List<java.lang.String> copydefault() {
        return (java.util.List) FfiConverterSequenceString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AMg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getAppModes$lambda$21(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getAppModes$lambda$21(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AMo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getAppModes$lambda$21$lambda$20(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAppModes$lambda$21$lambda$20(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_nativefeaturerestrictioninterface_get_app_modes(j, uniffiRustCallStatus);
    }

    @Override // o.ALH
    public boolean copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ALL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ALJ.isSupportAppMode$lambda$23(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isSupportAppMode$lambda$23(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ALJ.isSupportAppMode$lambda$23$lambda$22(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isSupportAppMode$lambda$23$lambda$22(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_nativefeaturerestrictioninterface_is_support_app_mode(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.ALH
    public java.util.List<java.lang.String> OLrzqt() {
        return (java.util.List) FfiConverterSequenceString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AMe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getCefiModes$lambda$25(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getCefiModes$lambda$25(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getCefiModes$lambda$25$lambda$24(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCefiModes$lambda$25$lambda$24(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_nativefeaturerestrictioninterface_get_cefi_modes(j, uniffiRustCallStatus);
    }

    @Override // o.ALH
    public boolean EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AMk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ALJ.isSupportCefiMode$lambda$27(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isSupportCefiMode$lambda$27(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AMf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ALJ.isSupportCefiMode$lambda$27$lambda$26(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isSupportCefiMode$lambda$27$lambda$26(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_nativefeaturerestrictioninterface_is_support_cefi_mode(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.ALH
    public java.util.List<java.lang.String> KWHzl() {
        return (java.util.List) FfiConverterSequenceString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AMd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getCrTradingModes$lambda$29(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getCrTradingModes$lambda$29(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getCrTradingModes$lambda$29$lambda$28(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCrTradingModes$lambda$29$lambda$28(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_nativefeaturerestrictioninterface_get_cr_trading_modes(j, uniffiRustCallStatus);
    }

    @Override // o.ALH
    public java.util.List<java.lang.String> AYXKKw() {
        return (java.util.List) FfiConverterSequenceString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ALN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getCrTradingPageModes$lambda$31(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getCrTradingPageModes$lambda$31(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AMt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALJ.getCrTradingPageModes$lambda$31$lambda$30(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCrTradingPageModes$lambda$31$lambda$30(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_nativefeaturerestrictioninterface_get_cr_trading_page_modes(j, uniffiRustCallStatus);
    }

    @Override // o.ALH
    public boolean AYXKKw(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AMl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ALJ.isSupportCrTradingMode$lambda$33(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isSupportCrTradingMode$lambda$33(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AMm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ALJ.isSupportCrTradingMode$lambda$33$lambda$32(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isSupportCrTradingMode$lambda$33$lambda$32(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_nativefeaturerestrictioninterface_is_support_cr_trading_mode(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }
}
