package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.buy_sell.ConvertBottomSheetAction;
import uniffi.buy_sell.ConvertOrderStatus;
import uniffi.buy_sell.FfiConverterBoolean;
import uniffi.buy_sell.FfiConverterTypeBSCQuickConvertStateObserver;
import uniffi.buy_sell.FfiConverterTypeConvertBottomSheetAction;
import uniffi.buy_sell.FfiConverterTypeConvertOrderStatus;
import uniffi.buy_sell.FfiConverterTypeSubmitOrderQuickConvertRequest;
import uniffi.buy_sell.UniffiLib;

/* JADX INFO: renamed from: o.Ape, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C3634Ape extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3634Ape(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.Apt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3634Ape.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Apg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3634Ape.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_bscquickconvertinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_bscquickconvertinteractor(j, uniffiRustCallStatus);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ArM.access$getUniffiRustBuffer$p():uniffi.RustBuffer */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3634Ape(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.Apl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3634Ape.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Apj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3634Ape.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_bscquickconvertinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_bscquickconvertinteractor(j, uniffiRustCallStatus);
    }

    public void copydefault(@NotNull final InterfaceC3650Apu interfaceC3650Apu) {
        Intrinsics.checkNotNullParameter(interfaceC3650Apu, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Apr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3634Ape.observeState$lambda$5(interfaceC3650Apu, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit observeState$lambda$5(final InterfaceC3650Apu interfaceC3650Apu, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Apf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3634Ape.observeState$lambda$5$lambda$4(j, interfaceC3650Apu, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit observeState$lambda$5$lambda$4(long j, InterfaceC3650Apu interfaceC3650Apu, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_bscquickconvertinteractor_observe_state(j, FfiConverterTypeBSCQuickConvertStateObserver.INSTANCE.lower2(interfaceC3650Apu).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void AEQbTJ() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Api
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3634Ape.onAppear$lambda$7(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onAppear$lambda$7(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Aph
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3634Ape.onAppear$lambda$7$lambda$6(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onAppear$lambda$7$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_bscquickconvertinteractor_on_appear(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void copydefault(@NotNull final ConvertOrderStatus convertOrderStatus, @NotNull final ConvertBottomSheetAction convertBottomSheetAction) {
        Intrinsics.checkNotNullParameter(convertOrderStatus, "");
        Intrinsics.checkNotNullParameter(convertBottomSheetAction, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Apk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3634Ape.onBottomSheetDismissed$lambda$9(convertOrderStatus, convertBottomSheetAction, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onBottomSheetDismissed$lambda$9(final ConvertOrderStatus convertOrderStatus, final ConvertBottomSheetAction convertBottomSheetAction, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.App
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3634Ape.onBottomSheetDismissed$lambda$9$lambda$8(j, convertOrderStatus, convertBottomSheetAction, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onBottomSheetDismissed$lambda$9$lambda$8(long j, ConvertOrderStatus convertOrderStatus, ConvertBottomSheetAction convertBottomSheetAction, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_bscquickconvertinteractor_on_bottom_sheet_dismissed(j, FfiConverterTypeConvertOrderStatus.INSTANCE.lower2((java.lang.Object) convertOrderStatus), FfiConverterTypeConvertBottomSheetAction.INSTANCE.lower2((java.lang.Object) convertBottomSheetAction), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void EZpvd() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Apm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3634Ape.onDisappear$lambda$11(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onDisappear$lambda$11(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Apn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3634Ape.onDisappear$lambda$11$lambda$10(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onDisappear$lambda$11$lambda$10(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_bscquickconvertinteractor_on_disappear(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void EZpvd(final boolean z, final boolean z2) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Apq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3634Ape.showInitContent$lambda$13(z, z2, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit showInitContent$lambda$13(final boolean z, final boolean z2, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Apv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3634Ape.showInitContent$lambda$13$lambda$12(j, z, z2, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit showInitContent$lambda$13$lambda$12(long j, boolean z, boolean z2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        uniffiLib.uniffi_buy_sell_fn_method_bscquickconvertinteractor_show_init_content(j, ffiConverterBoolean.lower(z).byteValue(), ffiConverterBoolean.lower(z2).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void copydefault(final boolean z, @NotNull final C3922AvC c3922AvC, final boolean z2) {
        Intrinsics.checkNotNullParameter(c3922AvC, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Apo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3634Ape.submitOrder$lambda$15(z, c3922AvC, z2, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit submitOrder$lambda$15(final boolean z, final C3922AvC c3922AvC, final boolean z2, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Aps
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3634Ape.submitOrder$lambda$15$lambda$14(j, z, c3922AvC, z2, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit submitOrder$lambda$15$lambda$14(long j, boolean z, C3922AvC c3922AvC, boolean z2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        uniffiLib.uniffi_buy_sell_fn_method_bscquickconvertinteractor_submit_order(j, ffiConverterBoolean.lower(z).byteValue(), FfiConverterTypeSubmitOrderQuickConvertRequest.INSTANCE.lower2((java.lang.Object) c3922AvC), ffiConverterBoolean.lower(z2).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
