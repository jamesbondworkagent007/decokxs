package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.experiment.AbTestInstance;
import uniffi.experiment.FfiConverterOptionalString;
import uniffi.experiment.FfiConverterString;
import uniffi.experiment.FfiConverterTypeABTestInstance;
import uniffi.experiment.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public class AHT extends AbstractC60182zxs implements AHX {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AHT(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.KWHzl(), C2348AIh.uniffiRustBuffer, new Function2() { // from class: o.AHW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AHT.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AHV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(AHT.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_experiment_fn_free_abtestfactory(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_clone_abtestfactory(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AHT(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.KWHzl(), C2348AIh.uniffiRustBuffer, new Function2() { // from class: o.AHZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AHT.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AId
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(AHT.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_experiment_fn_free_abtestfactory(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_clone_abtestfactory(j, uniffiRustCallStatus);
    }

    @Override // o.AHX
    public java.lang.String OLrzqt(@NotNull final java.lang.String str, @NotNull final AbTestInstance abTestInstance) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abTestInstance, "");
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AHY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AHT.getPayload$lambda$5(str, abTestInstance, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getPayload$lambda$5(final java.lang.String str, final AbTestInstance abTestInstance, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2348AIh.uniffiRustBuffer, new Function1() { // from class: o.AIc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AHT.getPayload$lambda$5$lambda$4(j, str, abTestInstance, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getPayload$lambda$5$lambda$4(long j, java.lang.String str, AbTestInstance abTestInstance, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_method_abtestfactory_get_payload(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterTypeABTestInstance.INSTANCE.lower2((java.lang.Object) abTestInstance), uniffiRustCallStatus);
    }

    @Override // o.AHX
    public java.lang.String OLrzqt(@NotNull final java.lang.String str, @NotNull final AbTestInstance abTestInstance, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abTestInstance, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AIa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AHT.getPayloadWithEnterpriseOverride$lambda$7(str, abTestInstance, str2, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getPayloadWithEnterpriseOverride$lambda$7(final java.lang.String str, final AbTestInstance abTestInstance, final java.lang.String str2, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2348AIh.uniffiRustBuffer, new Function1() { // from class: o.AIb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AHT.getPayloadWithEnterpriseOverride$lambda$7$lambda$6(j, str, abTestInstance, str2, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getPayloadWithEnterpriseOverride$lambda$7$lambda$6(long j, java.lang.String str, AbTestInstance abTestInstance, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_experiment_fn_method_abtestfactory_get_payload_with_enterprise_override(j, ffiConverterString.lower2(str), FfiConverterTypeABTestInstance.INSTANCE.lower2((java.lang.Object) abTestInstance), ffiConverterString.lower2(str2), uniffiRustCallStatus);
    }
}
