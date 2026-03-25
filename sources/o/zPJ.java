package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.account.FfiConverterTypeOkxPasskeyCrossDeviceMasterStep;
import uniffi.account.UniffiLib;

/* JADX INFO: loaded from: classes20.dex */
public class zPJ extends AbstractC60182zxs implements zPB {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zPJ(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zPF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return zPJ.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zPN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(zPJ.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_okxpasskeycrossdevicemasterstepcallback(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_okxpasskeycrossdevicemasterstepcallback(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zPJ(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zPH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return zPJ.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zPG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(zPJ.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_okxpasskeycrossdevicemasterstepcallback(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_okxpasskeycrossdevicemasterstepcallback(j, uniffiRustCallStatus);
    }

    @Override // o.zPB
    public void OLrzqt(@NotNull final zPD zpd) {
        Intrinsics.checkNotNullParameter(zpd, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zPI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zPJ.onStepChanged$lambda$5(zpd, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onStepChanged$lambda$5(final zPD zpd, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zPK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zPJ.onStepChanged$lambda$5$lambda$4(j, zpd, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onStepChanged$lambda$5$lambda$4(long j, zPD zpd, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeycrossdevicemasterstepcallback_on_step_changed(j, FfiConverterTypeOkxPasskeyCrossDeviceMasterStep.INSTANCE.lower2((java.lang.Object) zpd), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
