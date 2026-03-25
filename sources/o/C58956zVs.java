package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.account.FfiConverterBoolean;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.zVs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C58956zVs extends AbstractC60182zxs implements InterfaceC58955zVr {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58955zVr
    public java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return isPasskeyEntryEnableInSecurityCenter$suspendImpl(this, z, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58956zVs(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zVt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C58956zVs.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zVu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C58956zVs.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_passkeycorebinding(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_passkeycorebinding(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58956zVs(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zVv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C58956zVs.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zVx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C58956zVs.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_passkeycorebinding(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_passkeycorebinding(j, uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object isPasskeyEntryEnableInSecurityCenter$suspendImpl(C58956zVs c58956zVs, final boolean z, Continuation<? super java.lang.Boolean> continuation) {
        return C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) c58956zVs.callWithHandle$OKCore_deploy(new Function1() { // from class: o.zVw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C58956zVs.isPasskeyEntryEnableInSecurityCenter$lambda$4(z, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.zVA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C58956zVs.isPasskeyEntryEnableInSecurityCenter$lambda$5(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.zVz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Byte.valueOf(C58956zVs.isPasskeyEntryEnableInSecurityCenter$lambda$6(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        }, new Function1() { // from class: o.zVy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58956zVs.isPasskeyEntryEnableInSecurityCenter$lambda$7(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.zVC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C58956zVs.isPasskeyEntryEnableInSecurityCenter$lambda$8(((java.lang.Byte) obj).byteValue()));
            }
        }, new C60178zxo(C60230zyn.uniffiRustBuffer), continuation);
    }

    public static final long isPasskeyEntryEnableInSecurityCenter$lambda$4(boolean z, long j) {
        return UniffiLib.INSTANCE.uniffi_account_fn_method_passkeycorebinding_is_passkey_entry_enable_in_security_center(j, FfiConverterBoolean.INSTANCE.lower(z).byteValue());
    }

    public static final Unit isPasskeyEntryEnableInSecurityCenter$lambda$5(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_i8(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final byte isPasskeyEntryEnableInSecurityCenter$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_account_rust_future_complete_i8(j, uniffiRustCallStatus);
    }

    public static final Unit isPasskeyEntryEnableInSecurityCenter$lambda$7(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_i8(j);
        return Unit.INSTANCE;
    }

    public static final boolean isPasskeyEntryEnableInSecurityCenter$lambda$8(byte b) {
        return FfiConverterBoolean.INSTANCE.lift(b).booleanValue();
    }
}
