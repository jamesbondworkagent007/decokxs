package uniffi.feature_restriction;

import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.LongByReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AKL;
import o.ALB;
import o.ALH;
import o.C60173zxj;
import o.InterfaceC2462AMr;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.feature_restriction.UniffiVTableCallbackInterfaceNativeFeatureRestrictionInterface;
import uniffi.feature_restriction.uniffiCallbackInterfaceNativeFeatureRestrictionInterface;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceNativeFeatureRestrictionInterface {
    public static final uniffiCallbackInterfaceNativeFeatureRestrictionInterface INSTANCE = new uniffiCallbackInterfaceNativeFeatureRestrictionInterface();
    public static UniffiVTableCallbackInterfaceNativeFeatureRestrictionInterface.UniffiByValue vtable = new UniffiVTableCallbackInterfaceNativeFeatureRestrictionInterface.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, fetchFeatureRestrictions.INSTANCE, isFeatureHidden.INSTANCE, isFeatureLimit.INSTANCE, getFeatureConfigModel.INSTANCE, getEntityId.INSTANCE, getCountry.INSTANCE, isCrMarket.INSTANCE, getI18nDtoJson.INSTANCE, getAppModes.INSTANCE, isSupportAppMode.INSTANCE, getCefiModes.INSTANCE, isSupportCefiMode.INSTANCE, getCrTradingModes.INSTANCE, getCrTradingPageModes.INSTANCE, isSupportCrTradingMode.INSTANCE);
    public static final int $stable = 8;

    public static final class fetchFeatureRestrictions implements UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod0 {
        public static final int $stable = 0;
        public static final fetchFeatureRestrictions INSTANCE = new fetchFeatureRestrictions();

        private fetchFeatureRestrictions() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod0
        public void callback(long j, @NotNull final LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(longByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ALH alhCopydefault = FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AMG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return alhCopydefault.EZpvd();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AMI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.fetchFeatureRestrictions.callback$lambda$1(longByReference, (InterfaceC2462AMr) obj);
                }
            };
            RustBuffer rustBuffer = ALB.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(LongByReference longByReference, InterfaceC2462AMr interfaceC2462AMr) {
            Intrinsics.checkNotNullParameter(interfaceC2462AMr, "");
            longByReference.setValue(FfiConverterTypeOKNativeTaskboolWithNativeFetchFeatureRestrictionError.INSTANCE.lower2(interfaceC2462AMr).longValue());
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceNativeFeatureRestrictionInterface() {
    }

    public static final class isFeatureHidden implements UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod1 {
        public static final int $stable = 0;
        public static final isFeatureHidden INSTANCE = new isFeatureHidden();

        private isFeatureHidden() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ALH alhCopydefault = FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AMY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(uniffiCallbackInterfaceNativeFeatureRestrictionInterface.isFeatureHidden.callback$lambda$0(alhCopydefault, byValue));
                }
            };
            Function1 function1 = new Function1() { // from class: o.ANb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.isFeatureHidden.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = ALB.uniffiRustBuffer;
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
        public static final boolean callback$lambda$0(ALH alh, RustBuffer.ByValue byValue) {
            return alh.KWHzl(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    public static final class isFeatureLimit implements UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod2 {
        public static final int $stable = 0;
        public static final isFeatureLimit INSTANCE = new isFeatureLimit();

        private isFeatureLimit() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod2
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ALH alhCopydefault = FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.ANc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(uniffiCallbackInterfaceNativeFeatureRestrictionInterface.isFeatureLimit.callback$lambda$0(alhCopydefault, byValue));
                }
            };
            Function1 function1 = new Function1() { // from class: o.ANg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.isFeatureLimit.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = ALB.uniffiRustBuffer;
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
        public static final boolean callback$lambda$0(ALH alh, RustBuffer.ByValue byValue) {
            return alh.AEQbTJ(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    public static final class getFeatureConfigModel implements UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod3 {
        public static final int $stable = 0;
        public static final getFeatureConfigModel INSTANCE = new getFeatureConfigModel();

        private getFeatureConfigModel() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod3
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ALH alhCopydefault = FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AMX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.getFeatureConfigModel.callback$lambda$0(alhCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AMU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.getFeatureConfigModel.callback$lambda$1(rustBuffer, (AKL) obj);
                }
            };
            RustBuffer rustBuffer2 = ALB.uniffiRustBuffer;
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
        public static final AKL callback$lambda$0(ALH alh, RustBuffer.ByValue byValue) {
            return alh.OLrzqt(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, AKL akl) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeFeatureRestrictionConfigModel.INSTANCE.lower2(akl));
            return Unit.INSTANCE;
        }
    }

    public static final class getEntityId implements UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod4 {
        public static final int $stable = 0;
        public static final getEntityId INSTANCE = new getEntityId();

        private getEntityId() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod4
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ALH alhCopydefault = FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AMQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return alhCopydefault.djBIcL();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AMT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.getEntityId.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = ALB.uniffiRustBuffer;
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
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class getCountry implements UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod5 {
        public static final int $stable = 0;
        public static final getCountry INSTANCE = new getCountry();

        private getCountry() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod5
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ALH alhCopydefault = FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AMK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return alhCopydefault.AEQbTJ();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AMM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.getCountry.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = ALB.uniffiRustBuffer;
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
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class isCrMarket implements UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod6 {
        public static final int $stable = 0;
        public static final isCrMarket INSTANCE = new isCrMarket();

        private isCrMarket() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod6
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ALH alhCopydefault = FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.ANa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(alhCopydefault.AhwBna());
                }
            };
            Function1 function1 = new Function1() { // from class: o.AMZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.isCrMarket.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = ALB.uniffiRustBuffer;
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

    public static final class getI18nDtoJson implements UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod7 {
        public static final int $stable = 0;
        public static final getI18nDtoJson INSTANCE = new getI18nDtoJson();

        private getI18nDtoJson() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod7
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ALH alhCopydefault = FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AMW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return alhCopydefault.gEmmrt();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AMV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.getI18nDtoJson.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = ALB.uniffiRustBuffer;
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

    public static final class getAppModes implements UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod8 {
        public static final int $stable = 0;
        public static final getAppModes INSTANCE = new getAppModes();

        private getAppModes() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod8
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ALH alhCopydefault = FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AME
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return alhCopydefault.copydefault();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AMN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.getAppModes.callback$lambda$1(rustBuffer, (java.util.List) obj);
                }
            };
            RustBuffer rustBuffer2 = ALB.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, List list) {
            Intrinsics.checkNotNullParameter(list, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterSequenceString.INSTANCE.lower2((Object) list));
            return Unit.INSTANCE;
        }
    }

    public static final class isSupportAppMode implements UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod9 {
        public static final int $stable = 0;
        public static final isSupportAppMode INSTANCE = new isSupportAppMode();

        private isSupportAppMode() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod9
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ALH alhCopydefault = FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.ANe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(uniffiCallbackInterfaceNativeFeatureRestrictionInterface.isSupportAppMode.callback$lambda$0(alhCopydefault, byValue));
                }
            };
            Function1 function1 = new Function1() { // from class: o.ANh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.isSupportAppMode.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = ALB.uniffiRustBuffer;
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
        public static final boolean callback$lambda$0(ALH alh, RustBuffer.ByValue byValue) {
            return alh.copydefault(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    public static final class getCefiModes implements UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod10 {
        public static final int $stable = 0;
        public static final getCefiModes INSTANCE = new getCefiModes();

        private getCefiModes() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod10
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ALH alhCopydefault = FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AML
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return alhCopydefault.OLrzqt();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AMJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.getCefiModes.callback$lambda$1(rustBuffer, (java.util.List) obj);
                }
            };
            RustBuffer rustBuffer2 = ALB.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, List list) {
            Intrinsics.checkNotNullParameter(list, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterSequenceString.INSTANCE.lower2((Object) list));
            return Unit.INSTANCE;
        }
    }

    public static final class isSupportCefiMode implements UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod11 {
        public static final int $stable = 0;
        public static final isSupportCefiMode INSTANCE = new isSupportCefiMode();

        private isSupportCefiMode() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod11
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ALH alhCopydefault = FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.ANd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(uniffiCallbackInterfaceNativeFeatureRestrictionInterface.isSupportCefiMode.callback$lambda$0(alhCopydefault, byValue));
                }
            };
            Function1 function1 = new Function1() { // from class: o.ANf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.isSupportCefiMode.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = ALB.uniffiRustBuffer;
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
        public static final boolean callback$lambda$0(ALH alh, RustBuffer.ByValue byValue) {
            return alh.EZpvd(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    public static final class getCrTradingModes implements UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod12 {
        public static final int $stable = 0;
        public static final getCrTradingModes INSTANCE = new getCrTradingModes();

        private getCrTradingModes() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod12
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ALH alhCopydefault = FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AMR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return alhCopydefault.KWHzl();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AMS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.getCrTradingModes.callback$lambda$1(rustBuffer, (java.util.List) obj);
                }
            };
            RustBuffer rustBuffer2 = ALB.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, List list) {
            Intrinsics.checkNotNullParameter(list, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterSequenceString.INSTANCE.lower2((Object) list));
            return Unit.INSTANCE;
        }
    }

    public static final class getCrTradingPageModes implements UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod13 {
        public static final int $stable = 0;
        public static final getCrTradingPageModes INSTANCE = new getCrTradingPageModes();

        private getCrTradingPageModes() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod13
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ALH alhCopydefault = FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AMP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return alhCopydefault.AYXKKw();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AMO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.getCrTradingPageModes.callback$lambda$1(rustBuffer, (java.util.List) obj);
                }
            };
            RustBuffer rustBuffer2 = ALB.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, List list) {
            Intrinsics.checkNotNullParameter(list, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterSequenceString.INSTANCE.lower2((Object) list));
            return Unit.INSTANCE;
        }
    }

    public static final class isSupportCrTradingMode implements UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod14 {
        public static final int $stable = 0;
        public static final isSupportCrTradingMode INSTANCE = new isSupportCrTradingMode();

        private isSupportCrTradingMode() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceNativeFeatureRestrictionInterfaceMethod14
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final ALH alhCopydefault = FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.ANk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(uniffiCallbackInterfaceNativeFeatureRestrictionInterface.isSupportCrTradingMode.callback$lambda$0(alhCopydefault, byValue));
                }
            };
            Function1 function1 = new Function1() { // from class: o.ANl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativeFeatureRestrictionInterface.isSupportCrTradingMode.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = ALB.uniffiRustBuffer;
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
        public static final boolean callback$lambda$0(ALH alh, RustBuffer.ByValue byValue) {
            return alh.AYXKKw(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
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
            FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void copydefault(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_feature_restriction_fn_init_callback_vtable_nativefeaturerestrictioninterface(vtable);
    }
}
