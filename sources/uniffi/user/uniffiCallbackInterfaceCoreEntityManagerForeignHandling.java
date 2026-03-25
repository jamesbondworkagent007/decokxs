package uniffi.user;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BzK;
import o.C60173zxj;
import o.InterfaceC4907Bvl;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.user.UniffiVTableCallbackInterfaceCoreEntityManagerForeignHandling;
import uniffi.user.uniffiCallbackInterfaceCoreEntityManagerForeignHandling;

/* JADX INFO: loaded from: classes14.dex */
public final class uniffiCallbackInterfaceCoreEntityManagerForeignHandling {
    public static final uniffiCallbackInterfaceCoreEntityManagerForeignHandling INSTANCE = new uniffiCallbackInterfaceCoreEntityManagerForeignHandling();
    public static UniffiVTableCallbackInterfaceCoreEntityManagerForeignHandling.UniffiByValue vtable = new UniffiVTableCallbackInterfaceCoreEntityManagerForeignHandling.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, getSiteCode.INSTANCE, setEntityId.INSTANCE, getEntityId.INSTANCE, getJsonSiteCode.INSTANCE, switchSiteCode.INSTANCE, isSwitchDomainSiteCode.INSTANCE, setSimulatedSiteCode.INSTANCE, getSimulatedSiteCode.INSTANCE, getRegion.INSTANCE, setRegion.INSTANCE);
    public static final int $stable = 8;

    public static final class getSiteCode implements UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod0 {
        public static final int $stable = 0;
        public static final getSiteCode INSTANCE = new getSiteCode();

        private getSiteCode() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod0
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4907Bvl interfaceC4907BvlCopydefault = FfiConverterTypeCoreEntityManagerForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4907BvlCopydefault.EZpvd();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreEntityManagerForeignHandling.getSiteCode.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = BzK.uniffiRustBuffer;
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

    private uniffiCallbackInterfaceCoreEntityManagerForeignHandling() {
    }

    public static final class setEntityId implements UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod1 {
        public static final int $stable = 0;
        public static final setEntityId INSTANCE = new setEntityId();

        private setEntityId() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4907Bvl interfaceC4907BvlCopydefault = FfiConverterTypeCoreEntityManagerForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreEntityManagerForeignHandling.setEntityId.callback$lambda$0(interfaceC4907BvlCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreEntityManagerForeignHandling.setEntityId.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = BzK.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4907Bvl interfaceC4907Bvl, RustBuffer.ByValue byValue) {
            interfaceC4907Bvl.KWHzl(FfiConverterOptionalInt.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getEntityId implements UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod2 {
        public static final int $stable = 0;
        public static final getEntityId INSTANCE = new getEntityId();

        private getEntityId() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod2
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4907Bvl interfaceC4907BvlCopydefault = FfiConverterTypeCoreEntityManagerForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4907BvlCopydefault.AEQbTJ();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreEntityManagerForeignHandling.getEntityId.callback$lambda$1(rustBuffer, (java.lang.Integer) obj);
                }
            };
            RustBuffer rustBuffer2 = BzK.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, Integer num) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalInt.INSTANCE.lower2(num));
            return Unit.INSTANCE;
        }
    }

    public static final class getJsonSiteCode implements UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod3 {
        public static final int $stable = 0;
        public static final getJsonSiteCode INSTANCE = new getJsonSiteCode();

        private getJsonSiteCode() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod3
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4907Bvl interfaceC4907BvlCopydefault = FfiConverterTypeCoreEntityManagerForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreEntityManagerForeignHandling.getJsonSiteCode.callback$lambda$0(interfaceC4907BvlCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreEntityManagerForeignHandling.getJsonSiteCode.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = BzK.uniffiRustBuffer;
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
        public static final String callback$lambda$0(InterfaceC4907Bvl interfaceC4907Bvl, RustBuffer.ByValue byValue) {
            return interfaceC4907Bvl.copydefault(FfiConverterOptionalString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class switchSiteCode implements UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod4 {
        public static final int $stable = 0;
        public static final switchSiteCode INSTANCE = new switchSiteCode();

        private switchSiteCode() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod4
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4907Bvl interfaceC4907BvlCopydefault = FfiConverterTypeCoreEntityManagerForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4907BvlCopydefault.OLrzqt();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreEntityManagerForeignHandling.switchSiteCode.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = BzK.uniffiRustBuffer;
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

    public static final class isSwitchDomainSiteCode implements UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod5 {
        public static final int $stable = 0;
        public static final isSwitchDomainSiteCode INSTANCE = new isSwitchDomainSiteCode();

        private isSwitchDomainSiteCode() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod5
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4907Bvl interfaceC4907BvlCopydefault = FfiConverterTypeCoreEntityManagerForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(uniffiCallbackInterfaceCoreEntityManagerForeignHandling.isSwitchDomainSiteCode.callback$lambda$0(interfaceC4907BvlCopydefault, byValue));
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreEntityManagerForeignHandling.isSwitchDomainSiteCode.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = BzK.uniffiRustBuffer;
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
        public static final boolean callback$lambda$0(InterfaceC4907Bvl interfaceC4907Bvl, RustBuffer.ByValue byValue) {
            return interfaceC4907Bvl.AEQbTJ(FfiConverterOptionalString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    public static final class setSimulatedSiteCode implements UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod6 {
        public static final int $stable = 0;
        public static final setSimulatedSiteCode INSTANCE = new setSimulatedSiteCode();

        private setSimulatedSiteCode() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod6
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4907Bvl interfaceC4907BvlCopydefault = FfiConverterTypeCoreEntityManagerForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreEntityManagerForeignHandling.setSimulatedSiteCode.callback$lambda$0(interfaceC4907BvlCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreEntityManagerForeignHandling.setSimulatedSiteCode.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = BzK.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4907Bvl interfaceC4907Bvl, RustBuffer.ByValue byValue) {
            interfaceC4907Bvl.KWHzl(FfiConverterOptionalString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getSimulatedSiteCode implements UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod7 {
        public static final int $stable = 0;
        public static final getSimulatedSiteCode INSTANCE = new getSimulatedSiteCode();

        private getSimulatedSiteCode() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod7
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4907Bvl interfaceC4907BvlCopydefault = FfiConverterTypeCoreEntityManagerForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4907BvlCopydefault.KWHzl();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreEntityManagerForeignHandling.getSimulatedSiteCode.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = BzK.uniffiRustBuffer;
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

    public static final class getRegion implements UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod8 {
        public static final int $stable = 0;
        public static final getRegion INSTANCE = new getRegion();

        private getRegion() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod8
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4907Bvl interfaceC4907BvlCopydefault = FfiConverterTypeCoreEntityManagerForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4907BvlCopydefault.copydefault();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreEntityManagerForeignHandling.getRegion.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = BzK.uniffiRustBuffer;
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

    public static final class setRegion implements UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod9 {
        public static final int $stable = 0;
        public static final setRegion INSTANCE = new setRegion();

        private setRegion() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod9
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4907Bvl interfaceC4907BvlCopydefault = FfiConverterTypeCoreEntityManagerForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreEntityManagerForeignHandling.setRegion.callback$lambda$0(interfaceC4907BvlCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreEntityManagerForeignHandling.setRegion.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = BzK.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4907Bvl interfaceC4907Bvl, RustBuffer.ByValue byValue) {
            interfaceC4907Bvl.OLrzqt(FfiConverterOptionalString.INSTANCE.lift2(byValue));
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
            FfiConverterTypeCoreEntityManagerForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeCoreEntityManagerForeignHandling.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void AEQbTJ(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_user_fn_init_callback_vtable_coreentitymanagerforeignhandling(vtable);
    }
}
