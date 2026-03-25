package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.buy_sell.FfiConverterBoolean;
import uniffi.buy_sell.FfiConverterOptionalString;
import uniffi.buy_sell.FfiConverterString;
import uniffi.buy_sell.FfiConverterTypeRecurringBuyPlanDetailDependencies;
import uniffi.buy_sell.FfiConverterTypeRecurringBuyPlanDetailStateObserver;
import uniffi.buy_sell.UniffiLib;

/* JADX INFO: renamed from: o.AsD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C3766AsD extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3766AsD(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.AsM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3766AsD.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AsT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3766AsD.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_recurringbuyplandetailinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_recurringbuyplandetailinteractor(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3766AsD(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.AsR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3766AsD.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Ata
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3766AsD.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_recurringbuyplandetailinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_recurringbuyplandetailinteractor(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3766AsD(@NotNull final C3763AsA c3763AsA) {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AsQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3766AsD._init_$lambda$4(c3763AsA, (UniffiRustCallStatus) obj));
            }
        })).longValue());
        Intrinsics.checkNotNullParameter(c3763AsA, "");
    }

    public static final long _init_$lambda$4(C3763AsA c3763AsA, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_constructor_recurringbuyplandetailinteractor_new(FfiConverterTypeRecurringBuyPlanDetailDependencies.INSTANCE.lower2((java.lang.Object) c3763AsA), uniffiRustCallStatus);
    }

    public void copydefault(final boolean z) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AsV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.loadPlanDetails$lambda$6(z, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit loadPlanDetails$lambda$6(final boolean z, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AsL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.loadPlanDetails$lambda$6$lambda$5(j, z, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit loadPlanDetails$lambda$6$lambda$5(long j, boolean z, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_load_plan_details(j, FfiConverterBoolean.INSTANCE.lower(z).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void AEQbTJ(@NotNull final InterfaceC3825AtJ interfaceC3825AtJ) {
        Intrinsics.checkNotNullParameter(interfaceC3825AtJ, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AsS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.observeState$lambda$8(interfaceC3825AtJ, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit observeState$lambda$8(final InterfaceC3825AtJ interfaceC3825AtJ, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AsO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.observeState$lambda$8$lambda$7(j, interfaceC3825AtJ, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit observeState$lambda$8$lambda$7(long j, InterfaceC3825AtJ interfaceC3825AtJ, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_observe_state(j, FfiConverterTypeRecurringBuyPlanDetailStateObserver.INSTANCE.lower2(interfaceC3825AtJ).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void EZpvd() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AsY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.onAppear$lambda$10(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onAppear$lambda$10(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Atf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.onAppear$lambda$10$lambda$9(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onAppear$lambda$10$lambda$9(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_on_appear(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void OLrzqt() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AsH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.onCancelButtonClick$lambda$12(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onCancelButtonClick$lambda$12(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AsE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.onCancelButtonClick$lambda$12$lambda$11(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onCancelButtonClick$lambda$12$lambda$11(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_on_cancel_button_click(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void KWHzl() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Atd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.onDisappear$lambda$14(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onDisappear$lambda$14(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AsN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.onDisappear$lambda$14$lambda$13(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onDisappear$lambda$14$lambda$13(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_on_disappear(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AsC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.onOrderItemClick$lambda$16(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onOrderItemClick$lambda$16(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AsU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.onOrderItemClick$lambda$16$lambda$15(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onOrderItemClick$lambda$16$lambda$15(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_on_order_item_click(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void copydefault() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Ate
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.onPauseButtonClick$lambda$18(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onPauseButtonClick$lambda$18(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AsW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.onPauseButtonClick$lambda$18$lambda$17(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onPauseButtonClick$lambda$18$lambda$17(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_on_pause_button_click(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void AEQbTJ() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AsX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.onResumeButtonClick$lambda$20(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onResumeButtonClick$lambda$20(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AsI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.onResumeButtonClick$lambda$20$lambda$19(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onResumeButtonClick$lambda$20$lambda$19(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_on_resume_button_click(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void valueOf() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AsJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.onViewAllOrdersClick$lambda$22(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onViewAllOrdersClick$lambda$22(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AsK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.onViewAllOrdersClick$lambda$22$lambda$21(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onViewAllOrdersClick$lambda$22$lambda$21(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_on_view_all_orders_click(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void copydefault(@NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Atc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.setParameters$lambda$24(str, z, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setParameters$lambda$24(final java.lang.String str, final boolean z, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AsZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.setParameters$lambda$24$lambda$23(j, str, z, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setParameters$lambda$24$lambda$23(long j, java.lang.String str, boolean z, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_set_parameters(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void copydefault(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AsF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.updatePlan$lambda$26(str, str2, str3, str4, str5, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit updatePlan$lambda$26(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AsP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3766AsD.updatePlan$lambda$26$lambda$25(j, str, str2, str3, str4, str5, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit updatePlan$lambda$26$lambda$25(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        uniffiLib.uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_update_plan(j, ffiConverterOptionalString.lower2(str), ffiConverterOptionalString.lower2(str2), ffiConverterOptionalString.lower2(str3), ffiConverterOptionalString.lower2(str4), ffiConverterOptionalString.lower2(str5), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
