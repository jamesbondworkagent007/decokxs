package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.buy_sell.FfiConverterString;
import uniffi.buy_sell.FfiConverterTypeRecurringBuyPlanOrderListStateObserver;
import uniffi.buy_sell.UniffiLib;

/* JADX INFO: renamed from: o.AuK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C3879AuK extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3879AuK(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.Avb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3879AuK.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Avi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3879AuK.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_recurringbuyplanorderlistinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_recurringbuyplanorderlistinteractor(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3879AuK(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.AuT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3879AuK.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AuU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3879AuK.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_recurringbuyplanorderlistinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_recurringbuyplanorderlistinteractor(j, uniffiRustCallStatus);
    }

    public void AEQbTJ() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AuY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.OLrzqt(((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Avc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.OLrzqt(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_load_initial_page(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void OLrzqt() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AuW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.KWHzl(((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AuP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.AhwBna(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AhwBna(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_load_next_page(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void EZpvd(@NotNull final InterfaceC3963Avr interfaceC3963Avr) {
        Intrinsics.checkNotNullParameter(interfaceC3963Avr, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AuJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.observeState$lambda$9(interfaceC3963Avr, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit observeState$lambda$9(final InterfaceC3963Avr interfaceC3963Avr, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AuV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.observeState$lambda$9$lambda$8(j, interfaceC3963Avr, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit observeState$lambda$9$lambda$8(long j, InterfaceC3963Avr interfaceC3963Avr, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_observe_state(j, FfiConverterTypeRecurringBuyPlanOrderListStateObserver.INSTANCE.lower2(interfaceC3963Avr).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void EZpvd() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AuZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.AEQbTJ(((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AuR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.valueOf(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit valueOf(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_on_appear(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void KWHzl() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Ava
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.EZpvd(((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Avd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.AYXKKw(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AYXKKw(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_on_disappear(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AuL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.onOrderItemClick$lambda$15(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onOrderItemClick$lambda$15(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AuQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.onOrderItemClick$lambda$15$lambda$14(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onOrderItemClick$lambda$15$lambda$14(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_on_order_item_click(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void copydefault() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Avf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.refresh$lambda$17(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit refresh$lambda$17(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AuM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.refresh$lambda$17$lambda$16(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit refresh$lambda$17$lambda$16(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_refresh(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AuO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.setPlanId$lambda$19(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setPlanId$lambda$19(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.AuS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3879AuK.setPlanId$lambda$19$lambda$18(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setPlanId$lambda$19$lambda$18(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_set_plan_id(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
