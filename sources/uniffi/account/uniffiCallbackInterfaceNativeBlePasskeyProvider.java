package uniffi.account;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.IntByReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56395yDu;
import o.C60173zxj;
import o.C60230zyn;
import o.zHY;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfaceNativeBlePasskeyProvider;
import uniffi.account.uniffiCallbackInterfaceNativeBlePasskeyProvider;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceNativeBlePasskeyProvider {
    public static final uniffiCallbackInterfaceNativeBlePasskeyProvider INSTANCE = new uniffiCallbackInterfaceNativeBlePasskeyProvider();
    public static UniffiVTableCallbackInterfaceNativeBlePasskeyProvider.UniffiByValue vtable = new UniffiVTableCallbackInterfaceNativeBlePasskeyProvider.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, isBluetoothEnabled.INSTANCE, isPeripheralSupported.INSTANCE, setServiceUuid.INSTANCE, getServiceUuid.INSTANCE, setDeviceDiscoveryCallback.INSTANCE, setConnectionCallback.INSTANCE, setDataCallback.INSTANCE, startScanning.INSTANCE, stopScanning.INSTANCE, isScanning.INSTANCE, connectToDevice.INSTANCE, startAdvertising.INSTANCE, stopAdvertising.INSTANCE, isAdvertising.INSTANCE, disconnect.INSTANCE, isConnected.INSTANCE, getCurrentMtu.INSTANCE, sendData.INSTANCE, sendConfirmation.INSTANCE, cleanup.INSTANCE);
    public static final int $stable = 8;

    public static final class isBluetoothEnabled implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod0 {
        public static final int $stable = 0;
        public static final isBluetoothEnabled INSTANCE = new isBluetoothEnabled();

        private isBluetoothEnabled() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod0
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Akr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(zhyCopydefault.AYXKKw());
                }
            };
            Function1 function1 = new Function1() { // from class: o.Aks
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.isBluetoothEnabled.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceNativeBlePasskeyProvider() {
    }

    public static final class isPeripheralSupported implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod1 {
        public static final int $stable = 0;
        public static final isPeripheralSupported INSTANCE = new isPeripheralSupported();

        private isPeripheralSupported() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod1
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Akw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(zhyCopydefault.fetchVPNInfo());
                }
            };
            Function1 function1 = new Function1() { // from class: o.Akt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.isPeripheralSupported.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    public static final class setServiceUuid implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod2 {
        public static final int $stable = 0;
        public static final setServiceUuid INSTANCE = new setServiceUuid();

        private setServiceUuid() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod2
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AkL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.setServiceUuid.callback$lambda$0(zhyCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AkJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.setServiceUuid.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zHY zhy, RustBuffer.ByValue byValue) {
            zhy.EZpvd(FfiConverterString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getServiceUuid implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod3 {
        public static final int $stable = 0;
        public static final getServiceUuid INSTANCE = new getServiceUuid();

        private getServiceUuid() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod3
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Akk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return zhyCopydefault.djBIcL();
                }
            };
            Function1 function1 = new Function1() { // from class: o.Akq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.getServiceUuid.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer2).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class setDeviceDiscoveryCallback implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod4 {
        public static final int $stable = 0;
        public static final setDeviceDiscoveryCallback INSTANCE = new setDeviceDiscoveryCallback();

        private setDeviceDiscoveryCallback() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod4
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AkF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.setDeviceDiscoveryCallback.callback$lambda$0(zhyCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AkM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.setDeviceDiscoveryCallback.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zHY zhy, RustBuffer.ByValue byValue) {
            zhy.AEQbTJ(FfiConverterOptionalTypeBleDeviceDiscoveryCallback.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class setConnectionCallback implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod5 {
        public static final int $stable = 0;
        public static final setConnectionCallback INSTANCE = new setConnectionCallback();

        private setConnectionCallback() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod5
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AkE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.setConnectionCallback.callback$lambda$0(zhyCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AkH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.setConnectionCallback.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zHY zhy, RustBuffer.ByValue byValue) {
            zhy.KWHzl(FfiConverterOptionalTypeBleConnectionCallback.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class setDataCallback implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod6 {
        public static final int $stable = 0;
        public static final setDataCallback INSTANCE = new setDataCallback();

        private setDataCallback() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod6
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AkD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.setDataCallback.callback$lambda$0(zhyCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AkG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.setDataCallback.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zHY zhy, RustBuffer.ByValue byValue) {
            zhy.copydefault(FfiConverterOptionalTypeBleDataCallback.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class startScanning implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod7 {
        public static final int $stable = 0;
        public static final startScanning INSTANCE = new startScanning();

        private startScanning() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod7
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AkQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.startScanning.callback$lambda$0(zhyCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AkR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.startScanning.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                if (e instanceof BlePasskeyException) {
                    uniffiRustCallStatus.code = (byte) 1;
                    uniffiRustCallStatus.error_buf = FfiConverterTypeBlePasskeyError.INSTANCE.lower2(e);
                } else {
                    Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                    if (unExceptionReport != null) {
                        unExceptionReport.invoke(e);
                    }
                    uniffiRustCallStatus.code = (byte) 2;
                    uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zHY zhy) {
            zhy.AkhnZx();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class stopScanning implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod8 {
        public static final int $stable = 0;
        public static final stopScanning INSTANCE = new stopScanning();

        private stopScanning() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod8
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AkN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.stopScanning.callback$lambda$0(zhyCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AkV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.stopScanning.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zHY zhy) {
            zhy.ejfBZ();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class isScanning implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod9 {
        public static final int $stable = 0;
        public static final isScanning INSTANCE = new isScanning();

        private isScanning() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod9
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Akv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(zhyCopydefault.DbNXlk());
                }
            };
            Function1 function1 = new Function1() { // from class: o.AkB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.isScanning.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    public static final class connectToDevice implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod10 {
        public static final int $stable = 0;
        public static final connectToDevice INSTANCE = new connectToDevice();

        private connectToDevice() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod10
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Ake
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.connectToDevice.callback$lambda$0(zhyCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Akg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.connectToDevice.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                if (e instanceof BlePasskeyException) {
                    uniffiRustCallStatus.code = (byte) 1;
                    uniffiRustCallStatus.error_buf = FfiConverterTypeBlePasskeyError.INSTANCE.lower2(e);
                } else {
                    Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                    if (unExceptionReport != null) {
                        unExceptionReport.invoke(e);
                    }
                    uniffiRustCallStatus.code = (byte) 2;
                    uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zHY zhy, RustBuffer.ByValue byValue) {
            zhy.KWHzl(FfiConverterString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class startAdvertising implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod11 {
        public static final int $stable = 0;
        public static final startAdvertising INSTANCE = new startAdvertising();

        private startAdvertising() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod11
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AkK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.startAdvertising.callback$lambda$0(zhyCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AkI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.startAdvertising.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                if (e instanceof BlePasskeyException) {
                    uniffiRustCallStatus.code = (byte) 1;
                    uniffiRustCallStatus.error_buf = FfiConverterTypeBlePasskeyError.INSTANCE.lower2(e);
                } else {
                    Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                    if (unExceptionReport != null) {
                        unExceptionReport.invoke(e);
                    }
                    uniffiRustCallStatus.code = (byte) 2;
                    uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zHY zhy, RustBuffer.ByValue byValue) {
            zhy.copydefault(FfiConverterOptionalString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class stopAdvertising implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod12 {
        public static final int $stable = 0;
        public static final stopAdvertising INSTANCE = new stopAdvertising();

        private stopAdvertising() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod12
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AkO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.stopAdvertising.callback$lambda$0(zhyCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AkP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.stopAdvertising.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zHY zhy) {
            zhy.isConnected();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class isAdvertising implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod13 {
        public static final int $stable = 0;
        public static final isAdvertising INSTANCE = new isAdvertising();

        private isAdvertising() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod13
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Akp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(zhyCopydefault.valueOf());
                }
            };
            Function1 function1 = new Function1() { // from class: o.Ako
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.isAdvertising.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    public static final class disconnect implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod14 {
        public static final int $stable = 0;
        public static final disconnect INSTANCE = new disconnect();

        private disconnect() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod14
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Akm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.disconnect.callback$lambda$0(zhyCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Akl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.disconnect.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zHY zhy) {
            zhy.AEQbTJ();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class isConnected implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod15 {
        public static final int $stable = 0;
        public static final isConnected INSTANCE = new isConnected();

        private isConnected() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod15
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Aku
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(zhyCopydefault.values());
                }
            };
            Function1 function1 = new Function1() { // from class: o.Akx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.isConnected.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    public static final class getCurrentMtu implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod16 {
        public static final int $stable = 0;
        public static final getCurrentMtu INSTANCE = new getCurrentMtu();

        private getCurrentMtu() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod16
        public void callback(long j, @NotNull final IntByReference intByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(intByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Akj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.getCurrentMtu.callback$lambda$0(zhyCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Akn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.getCurrentMtu.callback$lambda$1(intByReference, (C56395yDu) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C56395yDu callback$lambda$0(zHY zhy) {
            return C56395yDu.AEQbTJ(zhy.AhwBna());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(IntByReference intByReference, C56395yDu c56395yDu) {
            intByReference.setValue(FfiConverterUInt.INSTANCE.m9552lowerWZ4Q5Ns(c56395yDu.copydefault()).intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class sendData implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod17 {
        public static final int $stable = 0;
        public static final sendData INSTANCE = new sendData();

        private sendData() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod17
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AkC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.sendData.callback$lambda$0(zhyCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Akz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.sendData.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                if (e instanceof BlePasskeyException) {
                    uniffiRustCallStatus.code = (byte) 1;
                    uniffiRustCallStatus.error_buf = FfiConverterTypeBlePasskeyError.INSTANCE.lower2(e);
                } else {
                    Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                    if (unExceptionReport != null) {
                        unExceptionReport.invoke(e);
                    }
                    uniffiRustCallStatus.code = (byte) 2;
                    uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zHY zhy, RustBuffer.ByValue byValue) {
            zhy.OLrzqt(FfiConverterString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class sendConfirmation implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod18 {
        public static final int $stable = 0;
        public static final sendConfirmation INSTANCE = new sendConfirmation();

        private sendConfirmation() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod18
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Aky
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.sendConfirmation.callback$lambda$0(zhyCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AkA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.sendConfirmation.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                if (e instanceof BlePasskeyException) {
                    uniffiRustCallStatus.code = (byte) 1;
                    uniffiRustCallStatus.error_buf = FfiConverterTypeBlePasskeyError.INSTANCE.lower2(e);
                } else {
                    Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                    if (unExceptionReport != null) {
                        unExceptionReport.invoke(e);
                    }
                    uniffiRustCallStatus.code = (byte) 2;
                    uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zHY zhy, RustBuffer.ByValue byValue) {
            zhy.AEQbTJ(FfiConverterString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class cleanup implements UniffiCallbackInterfaceNativeBlePasskeyProviderMethod19 {
        public static final int $stable = 0;
        public static final cleanup INSTANCE = new cleanup();

        private cleanup() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativeBlePasskeyProviderMethod19
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zHY zhyCopydefault = FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Akh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.cleanup.callback$lambda$0(zhyCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Aki
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeBlePasskeyProvider.cleanup.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zHY zhy) {
            zhy.OLrzqt();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void copydefault(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_nativeblepasskeyprovider(vtable);
    }
}
