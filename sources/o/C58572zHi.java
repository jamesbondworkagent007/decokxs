package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.account.FfiConverterBoolean;
import uniffi.account.FfiConverterOptionalString;
import uniffi.account.FfiConverterString;
import uniffi.account.FfiConverterTypeMfaScenario;
import uniffi.account.FfiConverterTypeMfaServiceResult;
import uniffi.account.MfaScenario;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.zHi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C58572zHi extends AbstractC60182zxs implements InterfaceC58571zHh {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58571zHh
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull MfaScenario mfaScenario, java.lang.String str2, boolean z, @NotNull Continuation<? super AbstractC58575zHl> continuation) {
        return verifyMfa$suspendImpl(this, str, mfaScenario, str2, z, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58572zHi(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zHr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C58572zHi.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zHv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C58572zHi.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_mfaservicetrait(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_mfaservicetrait(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58572zHi(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zHu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C58572zHi.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zHs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C58572zHi.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_mfaservicetrait(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_mfaservicetrait(j, uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object verifyMfa$suspendImpl(C58572zHi c58572zHi, final java.lang.String str, final MfaScenario mfaScenario, final java.lang.String str2, final boolean z, Continuation<? super AbstractC58575zHl> continuation) {
        return C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) c58572zHi.callWithHandle$OKCore_deploy(new Function1() { // from class: o.zHo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C58572zHi.verifyMfa$lambda$4(str, mfaScenario, str2, z, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.zHm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C58572zHi.verifyMfa$lambda$5(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.zHn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C58572zHi.verifyMfa$lambda$6(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.zHq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58572zHi.verifyMfa$lambda$7(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.zHp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58572zHi.verifyMfa$lambda$8((RustBuffer.ByValue) obj);
            }
        }, new C60178zxo(C60230zyn.uniffiRustBuffer), continuation);
    }

    public static final long verifyMfa$lambda$4(java.lang.String str, MfaScenario mfaScenario, java.lang.String str2, boolean z, long j) {
        return UniffiLib.INSTANCE.uniffi_account_fn_method_mfaservicetrait_verify_mfa(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterTypeMfaScenario.INSTANCE.lower2((java.lang.Object) mfaScenario), FfiConverterOptionalString.INSTANCE.lower2(str2), FfiConverterBoolean.INSTANCE.lower(z).byteValue());
    }

    public static final Unit verifyMfa$lambda$5(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue verifyMfa$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_account_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit verifyMfa$lambda$7(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final AbstractC58575zHl verifyMfa$lambda$8(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (AbstractC58575zHl) FfiConverterTypeMfaServiceResult.INSTANCE.lift2(byValue);
    }
}
