package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.account.FfiConverterBoolean;
import uniffi.account.FfiConverterOptionalString;
import uniffi.account.FfiConverterString;
import uniffi.account.FfiConverterTypeBleSyncCredentialInfo;
import uniffi.account.FfiConverterTypeBleSyncError;
import uniffi.account.FfiConverterTypeBleSyncProtectionKey;
import uniffi.account.FfiConverterTypeBleSyncSessionId;
import uniffi.account.UniffiLib;

/* JADX INFO: loaded from: classes25.dex */
public class zYO extends AbstractC60182zxs implements zYM {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zYO(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zYZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return zYO.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zZa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(zYO.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_passkeysynccallback(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_passkeysynccallback(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zYO(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zYQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return zYO.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zYV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(zYO.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_passkeysynccallback(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_passkeysynccallback(j, uniffiRustCallStatus);
    }

    @Override // o.zYM
    public void KWHzl(final boolean z, final java.lang.String str) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zYW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zYO.AEQbTJ(z, str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(final boolean z, final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zYT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zYO.KWHzl(j, z, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, boolean z, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysynccallback_on_connection_state_changed(j, FfiConverterBoolean.INSTANCE.lower(z).byteValue(), FfiConverterOptionalString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zYM
    public void KWHzl(@NotNull final C60293zzx c60293zzx) {
        Intrinsics.checkNotNullParameter(c60293zzx, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zYY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zYO.onSessionIdReceived$lambda$7(c60293zzx, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onSessionIdReceived$lambda$7(final C60293zzx c60293zzx, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zYS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zYO.onSessionIdReceived$lambda$7$lambda$6(j, c60293zzx, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onSessionIdReceived$lambda$7$lambda$6(long j, C60293zzx c60293zzx, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysynccallback_on_session_id_received(j, FfiConverterTypeBleSyncSessionId.INSTANCE.lower2((java.lang.Object) c60293zzx), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zYM
    public void KWHzl(@NotNull final C60289zzt c60289zzt) {
        Intrinsics.checkNotNullParameter(c60289zzt, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zZc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zYO.onCredentialInfoReceived$lambda$9(c60289zzt, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onCredentialInfoReceived$lambda$9(final C60289zzt c60289zzt, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zYR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zYO.onCredentialInfoReceived$lambda$9$lambda$8(j, c60289zzt, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onCredentialInfoReceived$lambda$9$lambda$8(long j, C60289zzt c60289zzt, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysynccallback_on_credential_info_received(j, FfiConverterTypeBleSyncCredentialInfo.INSTANCE.lower2((java.lang.Object) c60289zzt), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zYM
    public void EZpvd(@NotNull final C60290zzu c60290zzu) {
        Intrinsics.checkNotNullParameter(c60290zzu, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zYU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zYO.onProtectionKeyReceived$lambda$11(c60290zzu, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onProtectionKeyReceived$lambda$11(final C60290zzu c60290zzu, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zZf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zYO.onProtectionKeyReceived$lambda$11$lambda$10(j, c60290zzu, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onProtectionKeyReceived$lambda$11$lambda$10(long j, C60290zzu c60290zzu, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysynccallback_on_protection_key_received(j, FfiConverterTypeBleSyncProtectionKey.INSTANCE.lower2((java.lang.Object) c60290zzu), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zYM
    public void OLrzqt(@NotNull final C60292zzw c60292zzw) {
        Intrinsics.checkNotNullParameter(c60292zzw, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zZb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zYO.onErrorReceived$lambda$13(c60292zzw, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onErrorReceived$lambda$13(final C60292zzw c60292zzw, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zZd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zYO.onErrorReceived$lambda$13$lambda$12(j, c60292zzw, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onErrorReceived$lambda$13$lambda$12(long j, C60292zzw c60292zzw, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysynccallback_on_error_received(j, FfiConverterTypeBleSyncError.INSTANCE.lower2((java.lang.Object) c60292zzw), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zYM
    public void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zZe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zYO.onError$lambda$15(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onError$lambda$15(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zYX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zYO.onError$lambda$15$lambda$14(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onError$lambda$15$lambda$14(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysynccallback_on_error(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
