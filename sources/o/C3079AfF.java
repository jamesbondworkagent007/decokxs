package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.account.FfiConverterTypeSubAccountState;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.AfF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C3079AfF extends AbstractC60182zxs implements InterfaceC3074AfA {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3079AfF(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.AfG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3079AfF.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AfD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3079AfF.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_subaccountstatechangecallback(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_subaccountstatechangecallback(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3079AfF(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.AfH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3079AfF.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AfL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3079AfF.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_subaccountstatechangecallback(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_subaccountstatechangecallback(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3074AfA
    public void EZpvd(@NotNull final C3124Afy c3124Afy) {
        Intrinsics.checkNotNullParameter(c3124Afy, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AfJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3079AfF.onChanged$lambda$5(c3124Afy, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onChanged$lambda$5(final C3124Afy c3124Afy, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.AfE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3079AfF.onChanged$lambda$5$lambda$4(j, c3124Afy, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onChanged$lambda$5$lambda$4(long j, C3124Afy c3124Afy, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_subaccountstatechangecallback_on_changed(j, FfiConverterTypeSubAccountState.INSTANCE.lower2((java.lang.Object) c3124Afy), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
