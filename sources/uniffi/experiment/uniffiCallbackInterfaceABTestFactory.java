package uniffi.experiment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AHX;
import o.C2348AIh;
import o.C60173zxj;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.experiment.UniffiVTableCallbackInterfaceAbTestFactory;
import uniffi.experiment.uniffiCallbackInterfaceABTestFactory;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceABTestFactory {
    public static final uniffiCallbackInterfaceABTestFactory INSTANCE = new uniffiCallbackInterfaceABTestFactory();
    public static UniffiVTableCallbackInterfaceAbTestFactory.UniffiByValue vtable = new UniffiVTableCallbackInterfaceAbTestFactory.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, getPayload.INSTANCE, getPayloadWithEnterpriseOverride.INSTANCE);
    public static final int $stable = 8;

    public static final class getPayload implements UniffiCallbackInterfaceAbTestFactoryMethod0 {
        public static final int $stable = 0;
        public static final getPayload INSTANCE = new getPayload();

        private getPayload() {
        }

        @Override // uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AHX ahxCopydefault = FfiConverterTypeABTestFactory.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AJF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceABTestFactory.getPayload.callback$lambda$0(ahxCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AJJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceABTestFactory.getPayload.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = C2348AIh.uniffiRustBuffer;
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
        public static final String callback$lambda$0(AHX ahx, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            return ahx.OLrzqt(FfiConverterString.INSTANCE.lift2(byValue), (AbTestInstance) FfiConverterTypeABTestInstance.INSTANCE.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceABTestFactory() {
    }

    public static final class getPayloadWithEnterpriseOverride implements UniffiCallbackInterfaceAbTestFactoryMethod1 {
        public static final int $stable = 0;
        public static final getPayloadWithEnterpriseOverride INSTANCE = new getPayloadWithEnterpriseOverride();

        private getPayloadWithEnterpriseOverride() {
        }

        @Override // uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer.ByValue byValue3, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byValue3, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AHX ahxCopydefault = FfiConverterTypeABTestFactory.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AJI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceABTestFactory.getPayloadWithEnterpriseOverride.callback$lambda$0(ahxCopydefault, byValue, byValue2, byValue3);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AJK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceABTestFactory.getPayloadWithEnterpriseOverride.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = C2348AIh.uniffiRustBuffer;
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
        public static final String callback$lambda$0(AHX ahx, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return ahx.OLrzqt(ffiConverterString.lift2(byValue), (AbTestInstance) FfiConverterTypeABTestInstance.INSTANCE.lift2(byValue2), ffiConverterString.lift2(byValue3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
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
            FfiConverterTypeABTestFactory.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeABTestFactory.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void AEQbTJ(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_experiment_fn_init_callback_vtable_abtestfactory(vtable);
    }
}
