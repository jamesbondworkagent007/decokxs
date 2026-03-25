package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.account.FfiConverterBoolean;
import uniffi.account.FfiConverterOptionalString;
import uniffi.account.FfiConverterOptionalTypeCrossDeviceCredentialInfo;
import uniffi.account.FfiConverterOptionalTypeCrossDeviceDeviceInfo;
import uniffi.account.FfiConverterTypeOkxPasskeyCrossDeviceMasterAuthenticateStateCallback;
import uniffi.account.FfiConverterTypeOkxPasskeyCrossDeviceMasterJourney;
import uniffi.account.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public class zNP extends AbstractC60182zxs implements InterfaceC58765zOm {
    public static final int $stable = 0;
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zNP(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zOb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return zNP.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zOd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(zNP.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_okxpasskeycrossdevicemasterauthenticateinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_okxpasskeycrossdevicemasterauthenticateinteractor(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zNP(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zNT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return zNP.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zOh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(zNP.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_okxpasskeycrossdevicemasterauthenticateinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_okxpasskeycrossdevicemasterauthenticateinteractor(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zNP(@NotNull final C58785zPg c58785zPg) {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zNU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(zNP._init_$lambda$4(c58785zPg, (UniffiRustCallStatus) obj));
            }
        })).longValue());
        Intrinsics.checkNotNullParameter(c58785zPg, "");
    }

    public static final long _init_$lambda$4(C58785zPg c58785zPg, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_constructor_okxpasskeycrossdevicemasterauthenticateinteractor_new(FfiConverterTypeOkxPasskeyCrossDeviceMasterJourney.INSTANCE.lower2(c58785zPg).longValue(), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC58765zOm
    public void AEQbTJ(final boolean z, final java.lang.String str, final java.lang.String str2) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zNX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zNP.approve$lambda$6(z, str, str2, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit approve$lambda$6(final boolean z, final java.lang.String str, final java.lang.String str2, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zNZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zNP.approve$lambda$6$lambda$5(j, z, str, str2, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit approve$lambda$6$lambda$5(long j, boolean z, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        byte bByteValue = FfiConverterBoolean.INSTANCE.lower(z).byteValue();
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        uniffiLib.uniffi_account_fn_method_okxpasskeycrossdevicemasterauthenticateinteractor_approve(j, bByteValue, ffiConverterOptionalString.lower2(str), ffiConverterOptionalString.lower2(str2), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue copydefault(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zNW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zNP.AEQbTJ(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeycrossdevicemasterauthenticateinteractor_get_state(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC58765zOm
    public void AEQbTJ() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zOa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zNP.reject$lambda$10(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit reject$lambda$10(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zOj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zNP.reject$lambda$10$lambda$9(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit reject$lambda$10$lambda$9(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeycrossdevicemasterauthenticateinteractor_reject(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC58765zOm
    public void OLrzqt(@NotNull final InterfaceC58767zOo interfaceC58767zOo) {
        Intrinsics.checkNotNullParameter(interfaceC58767zOo, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zNV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zNP.setStateCallback$lambda$12(interfaceC58767zOo, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setStateCallback$lambda$12(final InterfaceC58767zOo interfaceC58767zOo, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zOl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zNP.setStateCallback$lambda$12$lambda$11(j, interfaceC58767zOo, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setStateCallback$lambda$12$lambda$11(long j, InterfaceC58767zOo interfaceC58767zOo, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeycrossdevicemasterauthenticateinteractor_set_state_callback(j, FfiConverterTypeOkxPasskeyCrossDeviceMasterAuthenticateStateCallback.INSTANCE.lower2(interfaceC58767zOo).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC58765zOm
    public void EZpvd() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zOc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zNP.startBleAdvertising$lambda$14(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit startBleAdvertising$lambda$14(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zNY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zNP.startBleAdvertising$lambda$14$lambda$13(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit startBleAdvertising$lambda$14$lambda$13(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeycrossdevicemasterauthenticateinteractor_start_ble_advertising(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC58765zOm
    public void KWHzl() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zOe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zNP.startCountdown$lambda$16(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit startCountdown$lambda$16(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zOf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zNP.startCountdown$lambda$16$lambda$15(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit startCountdown$lambda$16$lambda$15(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeycrossdevicemasterauthenticateinteractor_start_countdown(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC58765zOm
    public void OLrzqt() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zOk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zNP.stopBle$lambda$18(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit stopBle$lambda$18(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zOg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zNP.stopBle$lambda$18$lambda$17(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit stopBle$lambda$18$lambda$17(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeycrossdevicemasterauthenticateinteractor_stop_ble(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zNP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static final long newWithData$lambda$0(C58785zPg c58785zPg, java.lang.String str, zAR zar, zAS zas, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib uniffiLib = UniffiLib.INSTANCE;
            long jLongValue = FfiConverterTypeOkxPasskeyCrossDeviceMasterJourney.INSTANCE.lower2(c58785zPg).longValue();
            FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
            return uniffiLib.uniffi_account_fn_constructor_okxpasskeycrossdevicemasterauthenticateinteractor_new_with_data(jLongValue, ffiConverterOptionalString.lower2(str), FfiConverterOptionalTypeCrossDeviceDeviceInfo.INSTANCE.lower2(zar), FfiConverterOptionalTypeCrossDeviceCredentialInfo.INSTANCE.lower2(zas), ffiConverterOptionalString.lower2(str2), uniffiRustCallStatus);
        }
    }
}
