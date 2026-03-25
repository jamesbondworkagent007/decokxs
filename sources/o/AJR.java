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
import uniffi.feature_restriction.FfiConverterTypeFeatureRestrictionListener;
import uniffi.feature_restriction.UniffiLib;
import uniffi.ok_future_utils.FfiConverterTypeOKRustFutureboolWithOKFFIError;

/* JADX INFO: loaded from: classes13.dex */
public class AJR extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJR(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), ALB.uniffiRustBuffer, new Function2() { // from class: o.AKo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AJR.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AKq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(AJR.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_free_featurerestrictionbridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_clone_featurerestrictionbridge(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJR(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), ALB.uniffiRustBuffer, new Function2() { // from class: o.AKa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AJR.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AKb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(AJR.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_free_featurerestrictionbridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_clone_featurerestrictionbridge(j, uniffiRustCallStatus);
    }

    public AJR() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AJR.AEQbTJ((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_constructor_featurerestrictionbridge_new(uniffiRustCallStatus);
    }

    public java.util.List<java.lang.String> KWHzl() {
        return (java.util.List) FfiConverterSequenceString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.appModes$lambda$6(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue appModes$lambda$6(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.appModes$lambda$6$lambda$5(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue appModes$lambda$6$lambda$5(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_app_modes(j, uniffiRustCallStatus);
    }

    public java.util.List<java.lang.String> copydefault() {
        return (java.util.List) FfiConverterSequenceString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.cefiModes$lambda$8(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue cefiModes$lambda$8(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AJV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.cefiModes$lambda$8$lambda$7(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue cefiModes$lambda$8$lambda$7(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_cefi_modes(j, uniffiRustCallStatus);
    }

    public void EZpvd() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.clearData$lambda$10(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit clearData$lambda$10(final long j) {
        C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.clearData$lambda$10$lambda$9(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit clearData$lambda$10$lambda$9(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_clear_data(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public java.util.List<java.lang.String> AEQbTJ() {
        return (java.util.List) FfiConverterSequenceString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.crTradingModes$lambda$12(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue crTradingModes$lambda$12(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.crTradingModes$lambda$12$lambda$11(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue crTradingModes$lambda$12$lambda$11(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_cr_trading_modes(j, uniffiRustCallStatus);
    }

    public java.util.List<java.lang.String> OLrzqt() {
        return (java.util.List) FfiConverterSequenceString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.crTradingPageModes$lambda$14(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue crTradingPageModes$lambda$14(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.crTradingPageModes$lambda$14$lambda$13(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue crTradingPageModes$lambda$14$lambda$13(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_cr_trading_page_modes(j, uniffiRustCallStatus);
    }

    public AKL copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterOptionalTypeFeatureRestrictionConfigModel.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.currentConfigModel$lambda$16(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue currentConfigModel$lambda$16(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AJW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.currentConfigModel$lambda$16$lambda$15(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue currentConfigModel$lambda$16$lambda$15(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_current_config_model(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public C4449Bem AhwBna() {
        return FfiConverterTypeOKRustFutureboolWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AJR.fetchFeatureRestrictions$lambda$18(((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long fetchFeatureRestrictions$lambda$18(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AJR.fetchFeatureRestrictions$lambda$18$lambda$17(j, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long fetchFeatureRestrictions$lambda$18$lambda$17(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_fetch_feature_restrictions(j, uniffiRustCallStatus);
    }

    public java.lang.String djBIcL() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AJU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.getCountry$lambda$20(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getCountry$lambda$20(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.getCountry$lambda$20$lambda$19(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCountry$lambda$20$lambda$19(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_get_country(j, uniffiRustCallStatus);
    }

    public java.lang.String valueOf() {
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.getCurrentRestrictionDataJson$lambda$22(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getCurrentRestrictionDataJson$lambda$22(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AJX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.getCurrentRestrictionDataJson$lambda$22$lambda$21(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCurrentRestrictionDataJson$lambda$22$lambda$21(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_get_current_restriction_data_json(j, uniffiRustCallStatus);
    }

    public java.lang.String AYXKKw() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.getEntityId$lambda$24(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getEntityId$lambda$24(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AJZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.getEntityId$lambda$24$lambda$23(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getEntityId$lambda$24$lambda$23(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_get_entity_id(j, uniffiRustCallStatus);
    }

    public static final RustBuffer.ByValue getFeatureCode$lambda$26(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.getFeatureCode$lambda$26$lambda$25(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getFeatureCode$lambda$26$lambda$25(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_get_feature_code(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public static final RustBuffer.ByValue getFeatureHiddenList$lambda$28(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AJQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.getFeatureHiddenList$lambda$28$lambda$27(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getFeatureHiddenList$lambda$28$lambda$27(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_get_feature_hidden_list(j, uniffiRustCallStatus);
    }

    public java.lang.String gEmmrt() {
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.getI18nDtoJson$lambda$30(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getI18nDtoJson$lambda$30(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.getI18nDtoJson$lambda$30$lambda$29(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getI18nDtoJson$lambda$30$lambda$29(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_get_i18n_dto_json(j, uniffiRustCallStatus);
    }

    public static final byte hasRestrictionData$lambda$32(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AJR.hasRestrictionData$lambda$32$lambda$31(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte hasRestrictionData$lambda$32$lambda$31(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_has_restriction_data(j, uniffiRustCallStatus);
    }

    public boolean isConnected() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AJR.isCrMarket$lambda$34(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isCrMarket$lambda$34(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AJY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AJR.isCrMarket$lambda$34$lambda$33(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isCrMarket$lambda$34$lambda$33(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_is_cr_market(j, uniffiRustCallStatus);
    }

    public boolean OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AJR.isFeatureHidden$lambda$36(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isFeatureHidden$lambda$36(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AJR.isFeatureHidden$lambda$36$lambda$35(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isFeatureHidden$lambda$36$lambda$35(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_is_feature_hidden(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public boolean KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AJR.isFeatureLimit$lambda$38(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isFeatureLimit$lambda$38(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AJR.isFeatureLimit$lambda$38$lambda$37(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isFeatureLimit$lambda$38$lambda$37(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_is_feature_limit(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public boolean AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AJR.isSupportAppMode$lambda$40(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isSupportAppMode$lambda$40(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AJR.isSupportAppMode$lambda$40$lambda$39(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isSupportAppMode$lambda$40$lambda$39(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_is_support_app_mode(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public boolean EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AJR.isSupportCefiMode$lambda$42(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isSupportCefiMode$lambda$42(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AJR.isSupportCefiMode$lambda$42$lambda$41(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isSupportCefiMode$lambda$42$lambda$41(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_is_support_cefi_mode(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public static final byte isSupportCrTradingMode$lambda$44(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(AJR.isSupportCrTradingMode$lambda$44$lambda$43(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isSupportCrTradingMode$lambda$44$lambda$43(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_is_support_cr_trading_mode(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public void KWHzl(@NotNull final InterfaceC2438ALt interfaceC2438ALt) {
        Intrinsics.checkNotNullParameter(interfaceC2438ALt, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AKv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.registerListener$lambda$46(interfaceC2438ALt, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit registerListener$lambda$46(final InterfaceC2438ALt interfaceC2438ALt, final long j) {
        C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.registerListener$lambda$46$lambda$45(j, interfaceC2438ALt, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit registerListener$lambda$46$lambda$45(long j, InterfaceC2438ALt interfaceC2438ALt, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_register_listener(j, FfiConverterTypeFeatureRestrictionListener.INSTANCE.lower2(interfaceC2438ALt).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit setModeDataOverride$lambda$48(final java.util.List list, final java.util.List list2, final long j) {
        C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.setModeDataOverride$lambda$48$lambda$47(j, list, list2, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setModeDataOverride$lambda$48$lambda$47(long j, java.util.List list, java.util.List list2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterSequenceString ffiConverterSequenceString = FfiConverterSequenceString.INSTANCE;
        uniffiLib.uniffi_feature_restriction_fn_method_featurerestrictionbridge_set_mode_data_override(j, ffiConverterSequenceString.lower2((java.lang.Object) list), ffiConverterSequenceString.lower2((java.lang.Object) list2), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit unregisterAllListeners$lambda$50(final long j) {
        C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.AKm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AJR.unregisterAllListeners$lambda$50$lambda$49(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit unregisterAllListeners$lambda$50$lambda$49(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionbridge_unregister_all_listeners(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
