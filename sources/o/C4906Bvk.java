package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.user.FfiConverterBoolean;
import uniffi.user.FfiConverterOptionalInt;
import uniffi.user.FfiConverterOptionalString;
import uniffi.user.FfiConverterString;
import uniffi.user.UniffiLib;

/* JADX INFO: renamed from: o.Bvk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C4906Bvk extends AbstractC60182zxs implements InterfaceC4907Bvl {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4906Bvk(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), BzK.uniffiRustBuffer, new Function2() { // from class: o.Bvq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4906Bvk.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bvn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4906Bvk.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_free_coreentitymanagerforeignhandling(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_clone_coreentitymanagerforeignhandling(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4906Bvk(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), BzK.uniffiRustBuffer, new Function2() { // from class: o.Bvs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4906Bvk.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bvu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4906Bvk.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_free_coreentitymanagerforeignhandling(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_clone_coreentitymanagerforeignhandling(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4907Bvl
    public java.lang.String EZpvd() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BvJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.getSiteCode$lambda$5(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getSiteCode$lambda$5(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bvz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.getSiteCode$lambda$5$lambda$4(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getSiteCode$lambda$5$lambda$4(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreentitymanagerforeignhandling_get_site_code(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4907Bvl
    public void KWHzl(final java.lang.Integer num) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BvD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.setEntityId$lambda$7(num, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setEntityId$lambda$7(final java.lang.Integer num, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bvv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.setEntityId$lambda$7$lambda$6(j, num, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setEntityId$lambda$7$lambda$6(long j, java.lang.Integer num, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreentitymanagerforeignhandling_set_entity_id(j, FfiConverterOptionalInt.INSTANCE.lower2(num), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4907Bvl
    public java.lang.Integer AEQbTJ() {
        return FfiConverterOptionalInt.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BvB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.getEntityId$lambda$9(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getEntityId$lambda$9(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BvA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.getEntityId$lambda$9$lambda$8(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getEntityId$lambda$9$lambda$8(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreentitymanagerforeignhandling_get_entity_id(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4907Bvl
    public java.lang.String copydefault(final java.lang.String str) {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bvr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.getJsonSiteCode$lambda$11(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getJsonSiteCode$lambda$11(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bvo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.getJsonSiteCode$lambda$11$lambda$10(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getJsonSiteCode$lambda$11$lambda$10(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreentitymanagerforeignhandling_get_json_site_code(j, FfiConverterOptionalString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4907Bvl
    public java.lang.String OLrzqt() {
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BvE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.switchSiteCode$lambda$13(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue switchSiteCode$lambda$13(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BvF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.switchSiteCode$lambda$13$lambda$12(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue switchSiteCode$lambda$13$lambda$12(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreentitymanagerforeignhandling_switch_site_code(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4907Bvl
    public boolean AEQbTJ(final java.lang.String str) {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bvy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4906Bvk.isSwitchDomainSiteCode$lambda$15(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isSwitchDomainSiteCode$lambda$15(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bvh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4906Bvk.isSwitchDomainSiteCode$lambda$15$lambda$14(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isSwitchDomainSiteCode$lambda$15$lambda$14(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreentitymanagerforeignhandling_is_switch_domain_site_code(j, FfiConverterOptionalString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4907Bvl
    public void KWHzl(final java.lang.String str) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bvx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.setSimulatedSiteCode$lambda$17(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setSimulatedSiteCode$lambda$17(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bvi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.setSimulatedSiteCode$lambda$17$lambda$16(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setSimulatedSiteCode$lambda$17$lambda$16(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreentitymanagerforeignhandling_set_simulated_site_code(j, FfiConverterOptionalString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4907Bvl
    public java.lang.String KWHzl() {
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bvp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.getSimulatedSiteCode$lambda$19(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getSimulatedSiteCode$lambda$19(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BvC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.getSimulatedSiteCode$lambda$19$lambda$18(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getSimulatedSiteCode$lambda$19$lambda$18(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreentitymanagerforeignhandling_get_simulated_site_code(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4907Bvl
    public java.lang.String copydefault() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bvj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.getRegion$lambda$21(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getRegion$lambda$21(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bvw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.getRegion$lambda$21$lambda$20(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getRegion$lambda$21$lambda$20(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreentitymanagerforeignhandling_get_region(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4907Bvl
    public void OLrzqt(final java.lang.String str) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bvm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.setRegion$lambda$23(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setRegion$lambda$23(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bvt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4906Bvk.setRegion$lambda$23$lambda$22(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setRegion$lambda$23$lambda$22(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreentitymanagerforeignhandling_set_region(j, FfiConverterOptionalString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
