package uniffi.environment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AGR;
import o.C2338AHx;
import o.C60173zxj;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.environment.AppType;
import uniffi.environment.UniffiVTableCallbackInterfaceAppInfoInterface;
import uniffi.environment.uniffiCallbackInterfaceAppInfoInterface;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceAppInfoInterface {
    public static final uniffiCallbackInterfaceAppInfoInterface INSTANCE = new uniffiCallbackInterfaceAppInfoInterface();
    public static UniffiVTableCallbackInterfaceAppInfoInterface.UniffiByValue vtable = new UniffiVTableCallbackInterfaceAppInfoInterface.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, getBundleId.INSTANCE, getAppName.INSTANCE, getAppVersion.INSTANCE, getAppVersionCode.INSTANCE, getAppType.INSTANCE);
    public static final int $stable = 8;

    public static final class getBundleId implements UniffiCallbackInterfaceAppInfoInterfaceMethod0 {
        public static final int $stable = 0;
        public static final getBundleId INSTANCE = new getBundleId();

        private getBundleId() {
        }

        @Override // uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod0
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AGR agrCopydefault = FfiConverterTypeAppInfoInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AHG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return agrCopydefault.copydefault();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AHJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceAppInfoInterface.getBundleId.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = C2338AHx.uniffiRustBuffer;
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

    private uniffiCallbackInterfaceAppInfoInterface() {
    }

    public static final class getAppName implements UniffiCallbackInterfaceAppInfoInterfaceMethod1 {
        public static final int $stable = 0;
        public static final getAppName INSTANCE = new getAppName();

        private getAppName() {
        }

        @Override // uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod1
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AGR agrCopydefault = FfiConverterTypeAppInfoInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AHD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return agrCopydefault.EZpvd();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AHz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceAppInfoInterface.getAppName.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = C2338AHx.uniffiRustBuffer;
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

    public static final class getAppVersion implements UniffiCallbackInterfaceAppInfoInterfaceMethod2 {
        public static final int $stable = 0;
        public static final getAppVersion INSTANCE = new getAppVersion();

        private getAppVersion() {
        }

        @Override // uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod2
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AGR agrCopydefault = FfiConverterTypeAppInfoInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AHH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return agrCopydefault.AEQbTJ();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AHF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceAppInfoInterface.getAppVersion.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = C2338AHx.uniffiRustBuffer;
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

    public static final class getAppVersionCode implements UniffiCallbackInterfaceAppInfoInterfaceMethod3 {
        public static final int $stable = 0;
        public static final getAppVersionCode INSTANCE = new getAppVersionCode();

        private getAppVersionCode() {
        }

        @Override // uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod3
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AGR agrCopydefault = FfiConverterTypeAppInfoInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AHI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return agrCopydefault.KWHzl();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AHE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceAppInfoInterface.getAppVersionCode.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = C2338AHx.uniffiRustBuffer;
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

    public static final class getAppType implements UniffiCallbackInterfaceAppInfoInterfaceMethod4 {
        public static final int $stable = 0;
        public static final getAppType INSTANCE = new getAppType();

        private getAppType() {
        }

        @Override // uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod4
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AGR agrCopydefault = FfiConverterTypeAppInfoInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AHA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return agrCopydefault.OLrzqt();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AHC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceAppInfoInterface.getAppType.callback$lambda$1(rustBuffer, (AppType) obj);
                }
            };
            RustBuffer rustBuffer2 = C2338AHx.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, AppType appType) {
            Intrinsics.checkNotNullParameter(appType, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterTypeAppType.INSTANCE.lower2((Object) appType));
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
            FfiConverterTypeAppInfoInterface.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeAppInfoInterface.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void copydefault(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_environment_fn_init_callback_vtable_appinfointerface(vtable);
    }
}
