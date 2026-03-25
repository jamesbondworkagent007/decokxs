package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.account.FfiConverterTypeOkxPasskeyCrossDeviceSyncEventCallback;
import uniffi.account.FfiConverterTypeOkxPasskeyCrossDeviceSyncJourney;
import uniffi.account.FfiConverterTypeOkxPasskeyCrossDeviceSyncStateCallback;
import uniffi.account.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public class zPW extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zPW(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zQn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return zPW.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zQj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(zPW.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_okxpasskeycrossdevicesyncinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_okxpasskeycrossdevicesyncinteractor(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zPW(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zPX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return zPW.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zPV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(zPW.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_okxpasskeycrossdevicesyncinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_okxpasskeycrossdevicesyncinteractor(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zPW(@NotNull final C58816zQk c58816zQk) {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zPU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(zPW._init_$lambda$4(c58816zQk, (UniffiRustCallStatus) obj));
            }
        })).longValue());
        Intrinsics.checkNotNullParameter(c58816zQk, "");
    }

    public static final long _init_$lambda$4(C58816zQk c58816zQk, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_constructor_okxpasskeycrossdevicesyncinteractor_new(FfiConverterTypeOkxPasskeyCrossDeviceSyncJourney.INSTANCE.lower2(c58816zQk).longValue(), uniffiRustCallStatus);
    }

    public void KWHzl() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zQd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zPW.completeSyncWithDevice$lambda$6(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit completeSyncWithDevice$lambda$6(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zPZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zPW.completeSyncWithDevice$lambda$6$lambda$5(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit completeSyncWithDevice$lambda$6$lambda$5(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeycrossdevicesyncinteractor_complete_sync_with_device(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue getBusiness$lambda$8(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zQb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zPW.getBusiness$lambda$8$lambda$7(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getBusiness$lambda$8$lambda$7(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeycrossdevicesyncinteractor_get_business(j, uniffiRustCallStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue copydefault(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zQh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zPW.EZpvd(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeycrossdevicesyncinteractor_get_state(j, uniffiRustCallStatus);
    }

    public void AEQbTJ() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zQe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zPW.initiate$lambda$12(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit initiate$lambda$12(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zQa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zPW.initiate$lambda$12$lambda$11(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit initiate$lambda$12$lambda$11(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeycrossdevicesyncinteractor_initiate(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void KWHzl(@NotNull final zPO zpo) {
        Intrinsics.checkNotNullParameter(zpo, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zQg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zPW.setEventCallback$lambda$14(zpo, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setEventCallback$lambda$14(final zPO zpo, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zQc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zPW.setEventCallback$lambda$14$lambda$13(j, zpo, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setEventCallback$lambda$14$lambda$13(long j, zPO zpo, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeycrossdevicesyncinteractor_set_event_callback(j, FfiConverterTypeOkxPasskeyCrossDeviceSyncEventCallback.INSTANCE.lower2(zpo).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void OLrzqt(@NotNull final zQB zqb) {
        Intrinsics.checkNotNullParameter(zqb, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zQi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zPW.setStateCallback$lambda$16(zqb, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setStateCallback$lambda$16(final zQB zqb, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zQf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zPW.setStateCallback$lambda$16$lambda$15(j, zqb, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setStateCallback$lambda$16$lambda$15(long j, zQB zqb, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeycrossdevicesyncinteractor_set_state_callback(j, FfiConverterTypeOkxPasskeyCrossDeviceSyncStateCallback.INSTANCE.lower2(zqb).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
