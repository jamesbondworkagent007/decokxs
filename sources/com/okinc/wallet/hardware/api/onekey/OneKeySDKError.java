package com.okinc.wallet.hardware.api.onekey;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.wallet.hardware.api.onekey.OneKeySDKError;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.yDV;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class OneKeySDKError {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OneKeySDKError[] $VALUES;
    public static final ActionBar Companion;
    private static final InterfaceC56387yDm<List<OneKeySDKError>> ENTRIES$delegate;
    private final String code;
    private final String message;
    public static final OneKeySDKError UnknownError = new OneKeySDKError("UnknownError", 0, "0", "Unknown error occurred. Check message property.");
    public static final OneKeySDKError DeviceFwException = new OneKeySDKError("DeviceFwException", 1, UnsignedSwapData.CALLDATA_TYPE_EVM_TRANSFER, "Firmware version mismatch");
    public static final OneKeySDKError DeviceUnexpectedMode = new OneKeySDKError("DeviceUnexpectedMode", 2, "102", "Device unexpected mode");
    public static final OneKeySDKError DeviceListNotInitialized = new OneKeySDKError("DeviceListNotInitialized", 3, "103", "Device list is not initialized");
    public static final OneKeySDKError SelectDevice = new OneKeySDKError("SelectDevice", 4, "104", "Please select the connected device");
    public static final OneKeySDKError DeviceNotFound = new OneKeySDKError("DeviceNotFound", 5, "105", "Device not found");
    public static final OneKeySDKError DeviceInitializeFailed = new OneKeySDKError("DeviceInitializeFailed", 6, "106", "Device initialization failed");
    public static final OneKeySDKError DeviceInterruptedFromOutside = new OneKeySDKError("DeviceInterruptedFromOutside", 7, "107", "Device interrupted");
    public static final OneKeySDKError DeviceUnexpectedBootloaderMode = new OneKeySDKError("DeviceUnexpectedBootloaderMode", 8, "108", "Device should be in bootloader mode");
    public static final OneKeySDKError DeviceInterruptedFromUser = new OneKeySDKError("DeviceInterruptedFromUser", 9, "109", "Device interrupted");
    public static final OneKeySDKError DeviceCheckDeviceIdError = new OneKeySDKError("DeviceCheckDeviceIdError", 10, "110", "Device Id in the features is not same.");
    public static final OneKeySDKError DeviceNotSupportPassphrase = new OneKeySDKError("DeviceNotSupportPassphrase", 11, "111", "Device not support passphrase");
    public static final OneKeySDKError DeviceCheckPassphraseStateError = new OneKeySDKError("DeviceCheckPassphraseStateError", 12, "112", "Device passphrase state error");
    public static final OneKeySDKError DeviceNotOpenedPassphrase = new OneKeySDKError("DeviceNotOpenedPassphrase", 13, "113", "Device not opened passphrase");
    public static final OneKeySDKError DeviceOpenedPassphrase = new OneKeySDKError("DeviceOpenedPassphrase", 14, "114", "Device opened passphrase");
    public static final OneKeySDKError NotInitialized = new OneKeySDKError("NotInitialized", 15, "200", "Not initialized");
    public static final OneKeySDKError IFrameNotInitialized = new OneKeySDKError("IFrameNotInitialized", 16, "300", "IFrame not initialized");
    public static final OneKeySDKError IFrameAleradyInitialized = new OneKeySDKError("IFrameAleradyInitialized", 17, "301", "IFrame alerady initialized");
    public static final OneKeySDKError IFrameLoadFail = new OneKeySDKError("IFrameLoadFail", 18, "302", "IFrame load fail");
    public static final OneKeySDKError IframeTimeout = new OneKeySDKError("IframeTimeout", 19, "303", "init iframe time out");
    public static final OneKeySDKError IframeBlocked = new OneKeySDKError("IframeBlocked", 20, "304", "IFrame blocked");
    public static final OneKeySDKError CallMethodError = new OneKeySDKError("CallMethodError", 21, "400", "Runtime errors during method execution");
    public static final OneKeySDKError CallMethodNotResponse = new OneKeySDKError("CallMethodNotResponse", 22, "404", "Method does not responding");
    public static final OneKeySDKError CallMethodInvalidParameter = new OneKeySDKError("CallMethodInvalidParameter", 23, "405", "Call method invalid parameter");
    public static final OneKeySDKError FirmwareUpdateDownloadFailed = new OneKeySDKError("FirmwareUpdateDownloadFailed", 24, "406", "Firmware update download failed");
    public static final OneKeySDKError CallMethodNeedUpgradeFirmware = new OneKeySDKError("CallMethodNeedUpgradeFirmware", 25, "407", "Call method need upgrade firmware");
    public static final OneKeySDKError CallMethodDeprecated = new OneKeySDKError("CallMethodDeprecated", 26, "408", "Call method is deprecated");
    public static final OneKeySDKError FirmwareUpdateLimitOneDevice = new OneKeySDKError("FirmwareUpdateLimitOneDevice", 27, "409", "Only one device can be connected during firmware upgrade");
    public static final OneKeySDKError FirmwareUpdateManuallyEnterBoot = new OneKeySDKError("FirmwareUpdateManuallyEnterBoot", 28, "410", "You need to manually enter boot");
    public static final OneKeySDKError FirmwareUpdateAutoEnterBootFailure = new OneKeySDKError("FirmwareUpdateAutoEnterBootFailure", 29, "411", "Description Failed to automatically enter boot");
    public static final OneKeySDKError NewFirmwareUnRelease = new OneKeySDKError("NewFirmwareUnRelease", 30, "412", "new firmware has not been released yet");
    public static final OneKeySDKError UseDesktopToUpdateFirmware = new OneKeySDKError("UseDesktopToUpdateFirmware", 31, "413", "Please use OneKey desktop client to update the firmware");
    public static final OneKeySDKError NewFirmwareForceUpdate = new OneKeySDKError("NewFirmwareForceUpdate", 32, "414", "new firmware has been released, please update");
    public static final OneKeySDKError NetworkError = new OneKeySDKError("NetworkError", 33, "500", "Network request error");
    public static final OneKeySDKError TransportNotConfigured = new OneKeySDKError("TransportNotConfigured", 34, MultiTransferSignData.MAX_INTERVAL, "Transport not configured");
    public static final OneKeySDKError TransportCallInProgress = new OneKeySDKError("TransportCallInProgress", 35, "601", "Transport call in progress");
    public static final OneKeySDKError TransportNotFound = new OneKeySDKError("TransportNotFound", 36, "602", "Transport not found");
    public static final OneKeySDKError TransportInvalidProtobuf = new OneKeySDKError("TransportInvalidProtobuf", 37, "603", "Transport invalid protobuf");
    public static final OneKeySDKError BleScanError = new OneKeySDKError("BleScanError", 38, "700", "BLE scan error");
    public static final OneKeySDKError BlePermissionError = new OneKeySDKError("BlePermissionError", 39, "701", "Bluetooth required to be turned on");
    public static final OneKeySDKError BleLocationError = new OneKeySDKError("BleLocationError", 40, "702", "Location permissions for the application are not available");
    public static final OneKeySDKError BleRequiredUUID = new OneKeySDKError("BleRequiredUUID", 41, "703", "uuid is required");
    public static final OneKeySDKError BleConnectedError = new OneKeySDKError("BleConnectedError", 42, "704", "connected error is always runtime error");
    public static final OneKeySDKError BleDeviceNotBonded = new OneKeySDKError("BleDeviceNotBonded", 43, "705", "device is not bonded");
    public static final OneKeySDKError BleServiceNotFound = new OneKeySDKError("BleServiceNotFound", 44, "706", "BLEServiceNotFound: service not found");
    public static final OneKeySDKError BleCharacteristicNotFound = new OneKeySDKError("BleCharacteristicNotFound", 45, "707", "BLEServiceNotFound: service not found");
    public static final OneKeySDKError BleMonitorError = new OneKeySDKError("BleMonitorError", 46, "708", "Monitor Error: characteristic not found");
    public static final OneKeySDKError BleCharacteristicNotifyError = new OneKeySDKError("BleCharacteristicNotifyError", 47, "709", "Characteristic Notify Error");
    public static final OneKeySDKError BleWriteCharacteristicError = new OneKeySDKError("BleWriteCharacteristicError", 48, "710", "Write Characteristic Error");
    public static final OneKeySDKError BleAlreadyConnected = new OneKeySDKError("BleAlreadyConnected", 49, "711", "Already connected to device");
    public static final OneKeySDKError BleLocationServicesDisabled = new OneKeySDKError("BleLocationServicesDisabled", 50, "712", "Location Services disabled");
    public static final OneKeySDKError BleTimeoutError = new OneKeySDKError("BleTimeoutError", 51, "713", "The connection has timed out unexpectedly.");
    public static final OneKeySDKError BleForceCleanRunPromise = new OneKeySDKError("BleForceCleanRunPromise", 52, "714", "Force clean Bluetooth run promise");
    public static final OneKeySDKError BleDeviceBondError = new OneKeySDKError("BleDeviceBondError", 53, "715", "Bluetooth pairing failed");
    public static final OneKeySDKError RuntimeError = new OneKeySDKError("RuntimeError", 54, "800", "Runtime error");
    public static final OneKeySDKError PinInvalid = new OneKeySDKError("PinInvalid", 55, "801", "Pin invalid");
    public static final OneKeySDKError PinCancelled = new OneKeySDKError("PinCancelled", 56, "802", "Pin cancelled");
    public static final OneKeySDKError ActionCancelled = new OneKeySDKError("ActionCancelled", 57, "803", "Action cancelled by user");
    public static final OneKeySDKError FirmwareError = new OneKeySDKError("FirmwareError", 58, "804", "Firmware installation failed");
    public static final OneKeySDKError ResponseUnexpectTypeError = new OneKeySDKError("ResponseUnexpectTypeError", 59, "805", "Response type is not expected");
    public static final OneKeySDKError BridgeNetworkError = new OneKeySDKError("BridgeNetworkError", 60, "806", "Bridge network error");
    public static final OneKeySDKError BridgeTimeoutError = new OneKeySDKError("BridgeTimeoutError", 61, "807", "Bridge network timeout");
    public static final OneKeySDKError BridgeNotInstalled = new OneKeySDKError("BridgeNotInstalled", 62, "808", "Bridge not installed");
    public static final OneKeySDKError PollingTimeout = new OneKeySDKError("PollingTimeout", 63, "809", "Polling timeout");
    public static final OneKeySDKError PollingStop = new OneKeySDKError("PollingStop", 64, "810", "Polling stop");
    public static final OneKeySDKError BlindSignDisabled = new OneKeySDKError("BlindSignDisabled", 65, "811", "Please confirm the BlindSign enabled");
    public static final OneKeySDKError UnexpectPassphrase = new OneKeySDKError("UnexpectPassphrase", 66, "812", "Unexpect passphrase");
    public static final OneKeySDKError FileAlreadyExists = new OneKeySDKError("FileAlreadyExists", 67, "813", "File already exists");
    public static final OneKeySDKError CheckDownloadFileError = new OneKeySDKError("CheckDownloadFileError", 68, "814", "Check download file error");
    public static final OneKeySDKError NotInSigningMode = new OneKeySDKError("NotInSigningMode", 69, "815", "not in signing mode");
    public static final OneKeySDKError LowlevelTrasnportConnectError = new OneKeySDKError("LowlevelTrasnportConnectError", 70, "900", "Lowlevel transport connect error");
    public static final OneKeySDKError SDKUnavailable = new OneKeySDKError("SDKUnavailable", 71, MultiTransferSignData.DEFAULT_INTERVAL, "OneKey SDK not available");
    public static final OneKeySDKError BluetoothError = new OneKeySDKError("BluetoothError", 72, "-2", "General Bluetooth Error");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OneKeySDKError[] $values() {
        return new OneKeySDKError[]{UnknownError, DeviceFwException, DeviceUnexpectedMode, DeviceListNotInitialized, SelectDevice, DeviceNotFound, DeviceInitializeFailed, DeviceInterruptedFromOutside, DeviceUnexpectedBootloaderMode, DeviceInterruptedFromUser, DeviceCheckDeviceIdError, DeviceNotSupportPassphrase, DeviceCheckPassphraseStateError, DeviceNotOpenedPassphrase, DeviceOpenedPassphrase, NotInitialized, IFrameNotInitialized, IFrameAleradyInitialized, IFrameLoadFail, IframeTimeout, IframeBlocked, CallMethodError, CallMethodNotResponse, CallMethodInvalidParameter, FirmwareUpdateDownloadFailed, CallMethodNeedUpgradeFirmware, CallMethodDeprecated, FirmwareUpdateLimitOneDevice, FirmwareUpdateManuallyEnterBoot, FirmwareUpdateAutoEnterBootFailure, NewFirmwareUnRelease, UseDesktopToUpdateFirmware, NewFirmwareForceUpdate, NetworkError, TransportNotConfigured, TransportCallInProgress, TransportNotFound, TransportInvalidProtobuf, BleScanError, BlePermissionError, BleLocationError, BleRequiredUUID, BleConnectedError, BleDeviceNotBonded, BleServiceNotFound, BleCharacteristicNotFound, BleMonitorError, BleCharacteristicNotifyError, BleWriteCharacteristicError, BleAlreadyConnected, BleLocationServicesDisabled, BleTimeoutError, BleForceCleanRunPromise, BleDeviceBondError, RuntimeError, PinInvalid, PinCancelled, ActionCancelled, FirmwareError, ResponseUnexpectTypeError, BridgeNetworkError, BridgeTimeoutError, BridgeNotInstalled, PollingTimeout, PollingStop, BlindSignDisabled, UnexpectPassphrase, FileAlreadyExists, CheckDownloadFileError, NotInSigningMode, LowlevelTrasnportConnectError, SDKUnavailable, BluetoothError};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OneKeySDKError> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    private OneKeySDKError(String str, int i, String str2, String str3) {
        this.code = str2;
        this.message = str3;
    }

    static {
        OneKeySDKError[] oneKeySDKErrorArr$values = $values();
        $VALUES = oneKeySDKErrorArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oneKeySDKErrorArr$values);
        Companion = new ActionBar(null);
        ENTRIES$delegate = C56392yDr.copydefault(new Function0() { // from class: o.yaz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OneKeySDKError.ENTRIES_delegate$lambda$0();
            }
        });
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.OneKeySDKError.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final List<OneKeySDKError> AEQbTJ() {
            return (List) OneKeySDKError.ENTRIES$delegate.getValue();
        }

        public final OneKeySDKError OLrzqt(String str) {
            Object next;
            Iterator<T> it = AEQbTJ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((OneKeySDKError) next).getCode(), (Object) str)) {
                    break;
                }
            }
            OneKeySDKError oneKeySDKError = (OneKeySDKError) next;
            return oneKeySDKError == null ? OneKeySDKError.UnknownError : oneKeySDKError;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List ENTRIES_delegate$lambda$0() {
        return yDV.AwvSrB(values());
    }

    public static OneKeySDKError valueOf(String str) {
        return (OneKeySDKError) Enum.valueOf(OneKeySDKError.class, str);
    }

    public static OneKeySDKError[] values() {
        return (OneKeySDKError[]) $VALUES.clone();
    }
}
