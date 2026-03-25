package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.account.BlePasskeyException;
import uniffi.account.FfiConverterBoolean;
import uniffi.account.FfiConverterOptionalString;
import uniffi.account.FfiConverterOptionalTypeBleConnectionCallback;
import uniffi.account.FfiConverterOptionalTypeBleDataCallback;
import uniffi.account.FfiConverterOptionalTypeBleDeviceDiscoveryCallback;
import uniffi.account.FfiConverterString;
import uniffi.account.FfiConverterUInt;
import uniffi.account.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public class zHW extends AbstractC60182zxs implements zHY {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zHW(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zIQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return zHW.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zIP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(zHW.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_nativeblepasskeyprovider(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_nativeblepasskeyprovider(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zHW(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zIn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return zHW.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zIm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(zHW.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_nativeblepasskeyprovider(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_nativeblepasskeyprovider(j, uniffiRustCallStatus);
    }

    @Override // o.zHY
    public boolean AYXKKw() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.zII
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(zHW.isBluetoothEnabled$lambda$5(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isBluetoothEnabled$lambda$5(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zIo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(zHW.isBluetoothEnabled$lambda$5$lambda$4(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isBluetoothEnabled$lambda$5$lambda$4(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_is_bluetooth_enabled(j, uniffiRustCallStatus);
    }

    @Override // o.zHY
    public boolean fetchVPNInfo() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(zHW.isPeripheralSupported$lambda$7(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isPeripheralSupported$lambda$7(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zIb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(zHW.isPeripheralSupported$lambda$7$lambda$6(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isPeripheralSupported$lambda$7$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_is_peripheral_supported(j, uniffiRustCallStatus);
    }

    @Override // o.zHY
    public void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.setServiceUuid$lambda$9(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setServiceUuid$lambda$9(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zIS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.setServiceUuid$lambda$9$lambda$8(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setServiceUuid$lambda$9$lambda$8(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_set_service_uuid(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zHY
    public java.lang.String djBIcL() {
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.getServiceUuid$lambda$11(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getServiceUuid$lambda$11(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zIv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.getServiceUuid$lambda$11$lambda$10(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getServiceUuid$lambda$11$lambda$10(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_get_service_uuid(j, uniffiRustCallStatus);
    }

    @Override // o.zHY
    public void AEQbTJ(final InterfaceC60279zzj interfaceC60279zzj) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.setDeviceDiscoveryCallback$lambda$13(interfaceC60279zzj, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setDeviceDiscoveryCallback$lambda$13(final InterfaceC60279zzj interfaceC60279zzj, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zIK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.setDeviceDiscoveryCallback$lambda$13$lambda$12(j, interfaceC60279zzj, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setDeviceDiscoveryCallback$lambda$13$lambda$12(long j, InterfaceC60279zzj interfaceC60279zzj, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_set_device_discovery_callback(j, FfiConverterOptionalTypeBleDeviceDiscoveryCallback.INSTANCE.lower2(interfaceC60279zzj), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zHY
    public void KWHzl(final InterfaceC60214zyX interfaceC60214zyX) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.setConnectionCallback$lambda$15(interfaceC60214zyX, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setConnectionCallback$lambda$15(final InterfaceC60214zyX interfaceC60214zyX, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zIA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.setConnectionCallback$lambda$15$lambda$14(j, interfaceC60214zyX, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setConnectionCallback$lambda$15$lambda$14(long j, InterfaceC60214zyX interfaceC60214zyX, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_set_connection_callback(j, FfiConverterOptionalTypeBleConnectionCallback.INSTANCE.lower2(interfaceC60214zyX), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zHY
    public void copydefault(final InterfaceC60216zyZ interfaceC60216zyZ) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.setDataCallback$lambda$17(interfaceC60216zyZ, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setDataCallback$lambda$17(final InterfaceC60216zyZ interfaceC60216zyZ, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zIM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.setDataCallback$lambda$17$lambda$16(j, interfaceC60216zyZ, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setDataCallback$lambda$17$lambda$16(long j, InterfaceC60216zyZ interfaceC60216zyZ, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_set_data_callback(j, FfiConverterOptionalTypeBleDataCallback.INSTANCE.lower2(interfaceC60216zyZ), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zHY
    public void AkhnZx() throws BlePasskeyException {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.startScanning$lambda$19(((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit startScanning$lambda$19(final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, BlePasskeyException.ErrorHandler, new Function1() { // from class: o.zIu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.startScanning$lambda$19$lambda$18(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit startScanning$lambda$19$lambda$18(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_start_scanning(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zHY
    public void ejfBZ() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.stopScanning$lambda$21(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit stopScanning$lambda$21(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zIO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.stopScanning$lambda$21$lambda$20(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit stopScanning$lambda$21$lambda$20(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_stop_scanning(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zHY
    public boolean DbNXlk() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(zHW.isScanning$lambda$23(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isScanning$lambda$23(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zIx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(zHW.isScanning$lambda$23$lambda$22(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isScanning$lambda$23$lambda$22(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_is_scanning(j, uniffiRustCallStatus);
    }

    @Override // o.zHY
    public void KWHzl(@NotNull final java.lang.String str) throws BlePasskeyException {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.connectToDevice$lambda$25(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit connectToDevice$lambda$25(final java.lang.String str, final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, BlePasskeyException.ErrorHandler, new Function1() { // from class: o.zIe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.connectToDevice$lambda$25$lambda$24(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit connectToDevice$lambda$25$lambda$24(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_connect_to_device(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zHY
    public void copydefault(final java.lang.String str) throws BlePasskeyException {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.startAdvertising$lambda$27(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit startAdvertising$lambda$27(final java.lang.String str, final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, BlePasskeyException.ErrorHandler, new Function1() { // from class: o.zIy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.startAdvertising$lambda$27$lambda$26(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit startAdvertising$lambda$27$lambda$26(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_start_advertising(j, FfiConverterOptionalString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zHY
    public void isConnected() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.stopAdvertising$lambda$29(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit stopAdvertising$lambda$29(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zIh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.stopAdvertising$lambda$29$lambda$28(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit stopAdvertising$lambda$29$lambda$28(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_stop_advertising(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zHY
    public boolean valueOf() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(zHW.isAdvertising$lambda$31(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isAdvertising$lambda$31(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zIN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(zHW.isAdvertising$lambda$31$lambda$30(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isAdvertising$lambda$31$lambda$30(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_is_advertising(j, uniffiRustCallStatus);
    }

    @Override // o.zHY
    public void AEQbTJ() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.disconnect$lambda$33(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit disconnect$lambda$33(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zIz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.disconnect$lambda$33$lambda$32(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit disconnect$lambda$33$lambda$32(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_disconnect(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zHY
    public boolean values() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(zHW.isConnected$lambda$35(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isConnected$lambda$35(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zId
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(zHW.isConnected$lambda$35$lambda$34(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isConnected$lambda$35$lambda$34(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_is_connected(j, uniffiRustCallStatus);
    }

    @Override // o.zHY
    public int AhwBna() {
        return FfiConverterUInt.INSTANCE.m9550liftOGnWXxg(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(zHW.getCurrentMtu_pVg5ArA$lambda$37(((java.lang.Long) obj).longValue()));
            }
        })).intValue());
    }

    public static final int getCurrentMtu_pVg5ArA$lambda$37(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zIF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(zHW.getCurrentMtu_pVg5ArA$lambda$37$lambda$36(j, (UniffiRustCallStatus) obj));
            }
        })).intValue();
    }

    public static final int getCurrentMtu_pVg5ArA$lambda$37$lambda$36(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_get_current_mtu(j, uniffiRustCallStatus);
    }

    @Override // o.zHY
    public void OLrzqt(@NotNull final java.lang.String str) throws BlePasskeyException {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.sendData$lambda$39(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit sendData$lambda$39(final java.lang.String str, final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, BlePasskeyException.ErrorHandler, new Function1() { // from class: o.zIG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.sendData$lambda$39$lambda$38(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit sendData$lambda$39$lambda$38(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_send_data(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zHY
    public void AEQbTJ(@NotNull final java.lang.String str) throws BlePasskeyException {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zID
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.sendConfirmation$lambda$41(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit sendConfirmation$lambda$41(final java.lang.String str, final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, BlePasskeyException.ErrorHandler, new Function1() { // from class: o.zIw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.sendConfirmation$lambda$41$lambda$40(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit sendConfirmation$lambda$41$lambda$40(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_send_confirmation(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zHY
    public void OLrzqt() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.cleanup$lambda$43(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit cleanup$lambda$43(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zIc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zHW.cleanup$lambda$43$lambda$42(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit cleanup$lambda$43$lambda$42(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_nativeblepasskeyprovider_cleanup(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
