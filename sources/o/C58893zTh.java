package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.account.BluetoothConnectDevice;
import uniffi.account.CrossAuthorizationSyncClick;
import uniffi.account.FfiConverterTypeBluetoothConnectDevice;
import uniffi.account.FfiConverterTypeCrossAuthorizationSyncClick;
import uniffi.account.FfiConverterTypeLostPasskeyButtonName;
import uniffi.account.FfiConverterTypeLostPasskeyDevice;
import uniffi.account.FfiConverterTypePasskeyVerifyType;
import uniffi.account.FfiConverterTypePromotionButtonName;
import uniffi.account.FfiConverterTypeStepOneButtonName;
import uniffi.account.FfiConverterTypeSuccessType;
import uniffi.account.FfiConverterTypeTriggerPlatform;
import uniffi.account.FfiConverterTypeUpgradeDevice;
import uniffi.account.FfiConverterTypeUpgradeType;
import uniffi.account.LostPasskeyButtonName;
import uniffi.account.LostPasskeyDevice;
import uniffi.account.PasskeyVerifyType;
import uniffi.account.PromotionButtonName;
import uniffi.account.StepOneButtonName;
import uniffi.account.SuccessType;
import uniffi.account.TriggerPlatform;
import uniffi.account.UniffiLib;
import uniffi.account.UpgradeDevice;
import uniffi.account.UpgradeType;

/* JADX INFO: renamed from: o.zTh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C58893zTh extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58893zTh(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zTj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C58893zTh.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zTi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C58893zTh.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_okxpasskeytracker(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_okxpasskeytracker(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58893zTh(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zTB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C58893zTh.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zTA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C58893zTh.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_okxpasskeytracker(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_okxpasskeytracker(j, uniffiRustCallStatus);
    }

    public C58893zTh() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C58893zTh.AEQbTJ((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_constructor_okxpasskeytracker_new(uniffiRustCallStatus);
    }

    public void KWHzl(@NotNull final BluetoothConnectDevice bluetoothConnectDevice) {
        Intrinsics.checkNotNullParameter(bluetoothConnectDevice, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackBluetoothConnectBottomsheetView$lambda$6(bluetoothConnectDevice, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackBluetoothConnectBottomsheetView$lambda$6(final BluetoothConnectDevice bluetoothConnectDevice, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackBluetoothConnectBottomsheetView$lambda$6$lambda$5(j, bluetoothConnectDevice, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackBluetoothConnectBottomsheetView$lambda$6$lambda$5(long j, BluetoothConnectDevice bluetoothConnectDevice, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_bluetooth_connect_bottomsheet_view(j, FfiConverterTypeBluetoothConnectDevice.INSTANCE.lower2((java.lang.Object) bluetoothConnectDevice), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void EZpvd(@NotNull final CrossAuthorizationSyncClick crossAuthorizationSyncClick, @NotNull final PasskeyVerifyType passkeyVerifyType, @NotNull final TriggerPlatform triggerPlatform) {
        Intrinsics.checkNotNullParameter(crossAuthorizationSyncClick, "");
        Intrinsics.checkNotNullParameter(passkeyVerifyType, "");
        Intrinsics.checkNotNullParameter(triggerPlatform, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackCrossAuthorizationBottomsheetClick$lambda$8(crossAuthorizationSyncClick, passkeyVerifyType, triggerPlatform, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackCrossAuthorizationBottomsheetClick$lambda$8(final CrossAuthorizationSyncClick crossAuthorizationSyncClick, final PasskeyVerifyType passkeyVerifyType, final TriggerPlatform triggerPlatform, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackCrossAuthorizationBottomsheetClick$lambda$8$lambda$7(j, crossAuthorizationSyncClick, passkeyVerifyType, triggerPlatform, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackCrossAuthorizationBottomsheetClick$lambda$8$lambda$7(long j, CrossAuthorizationSyncClick crossAuthorizationSyncClick, PasskeyVerifyType passkeyVerifyType, TriggerPlatform triggerPlatform, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_cross_authorization_bottomsheet_click(j, FfiConverterTypeCrossAuthorizationSyncClick.INSTANCE.lower2((java.lang.Object) crossAuthorizationSyncClick), FfiConverterTypePasskeyVerifyType.INSTANCE.lower2((java.lang.Object) passkeyVerifyType), FfiConverterTypeTriggerPlatform.INSTANCE.lower2((java.lang.Object) triggerPlatform), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void EZpvd(@NotNull final PasskeyVerifyType passkeyVerifyType, @NotNull final TriggerPlatform triggerPlatform) {
        Intrinsics.checkNotNullParameter(passkeyVerifyType, "");
        Intrinsics.checkNotNullParameter(triggerPlatform, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackCrossAuthorizationBottomsheetView$lambda$10(passkeyVerifyType, triggerPlatform, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackCrossAuthorizationBottomsheetView$lambda$10(final PasskeyVerifyType passkeyVerifyType, final TriggerPlatform triggerPlatform, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackCrossAuthorizationBottomsheetView$lambda$10$lambda$9(j, passkeyVerifyType, triggerPlatform, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackCrossAuthorizationBottomsheetView$lambda$10$lambda$9(long j, PasskeyVerifyType passkeyVerifyType, TriggerPlatform triggerPlatform, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_cross_authorization_bottomsheet_view(j, FfiConverterTypePasskeyVerifyType.INSTANCE.lower2((java.lang.Object) passkeyVerifyType), FfiConverterTypeTriggerPlatform.INSTANCE.lower2((java.lang.Object) triggerPlatform), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void AEQbTJ(@NotNull final PasskeyVerifyType passkeyVerifyType, @NotNull final TriggerPlatform triggerPlatform) {
        Intrinsics.checkNotNullParameter(passkeyVerifyType, "");
        Intrinsics.checkNotNullParameter(triggerPlatform, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackCrossAuthorizationSuccessApiView$lambda$12(passkeyVerifyType, triggerPlatform, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackCrossAuthorizationSuccessApiView$lambda$12(final PasskeyVerifyType passkeyVerifyType, final TriggerPlatform triggerPlatform, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackCrossAuthorizationSuccessApiView$lambda$12$lambda$11(j, passkeyVerifyType, triggerPlatform, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackCrossAuthorizationSuccessApiView$lambda$12$lambda$11(long j, PasskeyVerifyType passkeyVerifyType, TriggerPlatform triggerPlatform, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_cross_authorization_success_api_view(j, FfiConverterTypePasskeyVerifyType.INSTANCE.lower2((java.lang.Object) passkeyVerifyType), FfiConverterTypeTriggerPlatform.INSTANCE.lower2((java.lang.Object) triggerPlatform), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void OLrzqt(@NotNull final LostPasskeyDevice lostPasskeyDevice, @NotNull final LostPasskeyButtonName lostPasskeyButtonName) {
        Intrinsics.checkNotNullParameter(lostPasskeyDevice, "");
        Intrinsics.checkNotNullParameter(lostPasskeyButtonName, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackLostReinstallRemindBottomsheetClick$lambda$14(lostPasskeyDevice, lostPasskeyButtonName, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackLostReinstallRemindBottomsheetClick$lambda$14(final LostPasskeyDevice lostPasskeyDevice, final LostPasskeyButtonName lostPasskeyButtonName, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackLostReinstallRemindBottomsheetClick$lambda$14$lambda$13(j, lostPasskeyDevice, lostPasskeyButtonName, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackLostReinstallRemindBottomsheetClick$lambda$14$lambda$13(long j, LostPasskeyDevice lostPasskeyDevice, LostPasskeyButtonName lostPasskeyButtonName, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_lost_reinstall_remind_bottomsheet_click(j, FfiConverterTypeLostPasskeyDevice.INSTANCE.lower2((java.lang.Object) lostPasskeyDevice), FfiConverterTypeLostPasskeyButtonName.INSTANCE.lower2((java.lang.Object) lostPasskeyButtonName), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void AEQbTJ(@NotNull final LostPasskeyDevice lostPasskeyDevice) {
        Intrinsics.checkNotNullParameter(lostPasskeyDevice, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackLostReinstallRemindBottomsheetView$lambda$16(lostPasskeyDevice, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackLostReinstallRemindBottomsheetView$lambda$16(final LostPasskeyDevice lostPasskeyDevice, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackLostReinstallRemindBottomsheetView$lambda$16$lambda$15(j, lostPasskeyDevice, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackLostReinstallRemindBottomsheetView$lambda$16$lambda$15(long j, LostPasskeyDevice lostPasskeyDevice, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_lost_reinstall_remind_bottomsheet_view(j, FfiConverterTypeLostPasskeyDevice.INSTANCE.lower2((java.lang.Object) lostPasskeyDevice), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void AEQbTJ() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackNeverExistRemindBottomsheetView$lambda$18(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackNeverExistRemindBottomsheetView$lambda$18(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackNeverExistRemindBottomsheetView$lambda$18$lambda$17(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackNeverExistRemindBottomsheetView$lambda$18$lambda$17(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_never_exist_remind_bottomsheet_view(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void copydefault() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackOnDeviceAppStartApiView$lambda$20(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackOnDeviceAppStartApiView$lambda$20(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackOnDeviceAppStartApiView$lambda$20$lambda$19(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackOnDeviceAppStartApiView$lambda$20$lambda$19(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_on_device_app_start_api_view(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void KWHzl() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackOnDeviceAppSuccessApiView$lambda$22(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackOnDeviceAppSuccessApiView$lambda$22(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackOnDeviceAppSuccessApiView$lambda$22$lambda$21(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackOnDeviceAppSuccessApiView$lambda$22$lambda$21(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_on_device_app_success_api_view(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void copydefault(@NotNull final PromotionButtonName promotionButtonName) {
        Intrinsics.checkNotNullParameter(promotionButtonName, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackPromotionFullpageClick$lambda$24(promotionButtonName, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackPromotionFullpageClick$lambda$24(final PromotionButtonName promotionButtonName, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackPromotionFullpageClick$lambda$24$lambda$23(j, promotionButtonName, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackPromotionFullpageClick$lambda$24$lambda$23(long j, PromotionButtonName promotionButtonName, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_promotion_fullpage_click(j, FfiConverterTypePromotionButtonName.INSTANCE.lower2((java.lang.Object) promotionButtonName), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void OLrzqt() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zUa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackPromotionFullpageView$lambda$26(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackPromotionFullpageView$lambda$26(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackPromotionFullpageView$lambda$26$lambda$25(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackPromotionFullpageView$lambda$26$lambda$25(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_promotion_fullpage_view(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void EZpvd() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackPromotionSecurityCenterBannerClick$lambda$28(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackPromotionSecurityCenterBannerClick$lambda$28(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackPromotionSecurityCenterBannerClick$lambda$28$lambda$27(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackPromotionSecurityCenterBannerClick$lambda$28$lambda$27(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_promotion_security_center_banner_click(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void AYXKKw() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackPromotionSecurityCenterBannerView$lambda$30(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackPromotionSecurityCenterBannerView$lambda$30(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackPromotionSecurityCenterBannerView$lambda$30$lambda$29(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackPromotionSecurityCenterBannerView$lambda$30$lambda$29(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_promotion_security_center_banner_view(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void OLrzqt(@NotNull final PasskeyVerifyType passkeyVerifyType) {
        Intrinsics.checkNotNullParameter(passkeyVerifyType, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackQrcodeBottomsheetView$lambda$32(passkeyVerifyType, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackQrcodeBottomsheetView$lambda$32(final PasskeyVerifyType passkeyVerifyType, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackQrcodeBottomsheetView$lambda$32$lambda$31(j, passkeyVerifyType, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackQrcodeBottomsheetView$lambda$32$lambda$31(long j, PasskeyVerifyType passkeyVerifyType, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_qrcode_bottomsheet_view(j, FfiConverterTypePasskeyVerifyType.INSTANCE.lower2((java.lang.Object) passkeyVerifyType), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void KWHzl(@NotNull final StepOneButtonName stepOneButtonName) {
        Intrinsics.checkNotNullParameter(stepOneButtonName, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackStepOneFullpageClick$lambda$34(stepOneButtonName, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackStepOneFullpageClick$lambda$34(final StepOneButtonName stepOneButtonName, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackStepOneFullpageClick$lambda$34$lambda$33(j, stepOneButtonName, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackStepOneFullpageClick$lambda$34$lambda$33(long j, StepOneButtonName stepOneButtonName, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_step_one_fullpage_click(j, FfiConverterTypeStepOneButtonName.INSTANCE.lower2((java.lang.Object) stepOneButtonName), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void AhwBna() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackStepOneFullpageView$lambda$36(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackStepOneFullpageView$lambda$36(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackStepOneFullpageView$lambda$36$lambda$35(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackStepOneFullpageView$lambda$36$lambda$35(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_step_one_fullpage_view(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void copydefault(@NotNull final UpgradeType upgradeType) {
        Intrinsics.checkNotNullParameter(upgradeType, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackUpgradeFido1SuccessApiView$lambda$38(upgradeType, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackUpgradeFido1SuccessApiView$lambda$38(final UpgradeType upgradeType, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackUpgradeFido1SuccessApiView$lambda$38$lambda$37(j, upgradeType, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackUpgradeFido1SuccessApiView$lambda$38$lambda$37(long j, UpgradeType upgradeType, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_upgrade_fido1_success_api_view(j, FfiConverterTypeUpgradeType.INSTANCE.lower2((java.lang.Object) upgradeType), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void copydefault(@NotNull final UpgradeDevice upgradeDevice) {
        Intrinsics.checkNotNullParameter(upgradeDevice, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackUpgradeMultipleFido1BottomsheetView$lambda$40(upgradeDevice, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackUpgradeMultipleFido1BottomsheetView$lambda$40(final UpgradeDevice upgradeDevice, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackUpgradeMultipleFido1BottomsheetView$lambda$40$lambda$39(j, upgradeDevice, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackUpgradeMultipleFido1BottomsheetView$lambda$40$lambda$39(long j, UpgradeDevice upgradeDevice, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_upgrade_multiple_fido1_bottomsheet_view(j, FfiConverterTypeUpgradeDevice.INSTANCE.lower2((java.lang.Object) upgradeDevice), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void OLrzqt(@NotNull final PasskeyVerifyType passkeyVerifyType, @NotNull final SuccessType successType) {
        Intrinsics.checkNotNullParameter(passkeyVerifyType, "");
        Intrinsics.checkNotNullParameter(successType, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackWaitApproveAppSuccessApiView$lambda$42(passkeyVerifyType, successType, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackWaitApproveAppSuccessApiView$lambda$42(final PasskeyVerifyType passkeyVerifyType, final SuccessType successType, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackWaitApproveAppSuccessApiView$lambda$42$lambda$41(j, passkeyVerifyType, successType, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackWaitApproveAppSuccessApiView$lambda$42$lambda$41(long j, PasskeyVerifyType passkeyVerifyType, SuccessType successType, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_wait_approve_app_success_api_view(j, FfiConverterTypePasskeyVerifyType.INSTANCE.lower2((java.lang.Object) passkeyVerifyType), FfiConverterTypeSuccessType.INSTANCE.lower2((java.lang.Object) successType), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void gEmmrt() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackWaitApproveBottomsheetClick$lambda$44(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackWaitApproveBottomsheetClick$lambda$44(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackWaitApproveBottomsheetClick$lambda$44$lambda$43(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackWaitApproveBottomsheetClick$lambda$44$lambda$43(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_wait_approve_bottomsheet_click(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void djBIcL() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zTI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackWaitApproveBottomsheetView$lambda$46(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackWaitApproveBottomsheetView$lambda$46(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zTp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58893zTh.trackWaitApproveBottomsheetView$lambda$46$lambda$45(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackWaitApproveBottomsheetView$lambda$46$lambda$45(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeytracker_track_wait_approve_bottomsheet_view(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
