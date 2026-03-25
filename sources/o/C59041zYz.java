package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.InternalException;
import uniffi.UniffiRustCallStatus;
import uniffi.account.BlePasskeyException;
import uniffi.account.FfiConverterString;
import uniffi.account.FfiConverterTypeBleSyncCredentialInfo;
import uniffi.account.FfiConverterTypeBleSyncError;
import uniffi.account.FfiConverterTypeBleSyncProtectionKey;
import uniffi.account.FfiConverterTypeBleSyncSessionId;
import uniffi.account.FfiConverterTypePasskeySyncCallback;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.zYz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C59041zYz extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59041zYz(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zYD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C59041zYz.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zYE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C59041zYz.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_passkeysyncblemanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_passkeysyncblemanager(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59041zYz(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zYP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C59041zYz.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zYN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C59041zYz.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_passkeysyncblemanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_passkeysyncblemanager(j, uniffiRustCallStatus);
    }

    public C59041zYz() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zYK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C59041zYz.EZpvd((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_constructor_passkeysyncblemanager_new(uniffiRustCallStatus);
    }

    public static final byte isConnected$lambda$6(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zYJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C59041zYz.isConnected$lambda$6$lambda$5(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isConnected$lambda$6$lambda$5(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysyncblemanager_is_connected(j, uniffiRustCallStatus);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit sendCredentialInfo$lambda$8(final C60289zzt c60289zzt, final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, BlePasskeyException.ErrorHandler, new Function1() { // from class: o.zYH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59041zYz.sendCredentialInfo$lambda$8$lambda$7(j, c60289zzt, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit sendCredentialInfo$lambda$8$lambda$7(long j, C60289zzt c60289zzt, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysyncblemanager_send_credential_info(j, FfiConverterTypeBleSyncCredentialInfo.INSTANCE.lower2((java.lang.Object) c60289zzt), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit sendError$lambda$10(final C60292zzw c60292zzw, final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, BlePasskeyException.ErrorHandler, new Function1() { // from class: o.zYI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59041zYz.sendError$lambda$10$lambda$9(j, c60292zzw, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit sendError$lambda$10$lambda$9(long j, C60292zzw c60292zzw, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysyncblemanager_send_error(j, FfiConverterTypeBleSyncError.INSTANCE.lower2((java.lang.Object) c60292zzw), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit sendProtectionKey$lambda$12(final C60290zzu c60290zzu, final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, BlePasskeyException.ErrorHandler, new Function1() { // from class: o.zYL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59041zYz.sendProtectionKey$lambda$12$lambda$11(j, c60290zzu, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit sendProtectionKey$lambda$12$lambda$11(long j, C60290zzu c60290zzu, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysyncblemanager_send_protection_key(j, FfiConverterTypeBleSyncProtectionKey.INSTANCE.lower2((java.lang.Object) c60290zzu), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit sendSessionId$lambda$14(final C60293zzx c60293zzx, final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, BlePasskeyException.ErrorHandler, new Function1() { // from class: o.zYx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59041zYz.sendSessionId$lambda$14$lambda$13(j, c60293zzx, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit sendSessionId$lambda$14$lambda$13(long j, C60293zzx c60293zzx, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysyncblemanager_send_session_id(j, FfiConverterTypeBleSyncSessionId.INSTANCE.lower2((java.lang.Object) c60293zzx), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit setCallback$lambda$16(final zYM zym, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zYF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59041zYz.setCallback$lambda$16$lambda$15(j, zym, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setCallback$lambda$16$lambda$15(long j, zYM zym, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysyncblemanager_set_callback(j, FfiConverterTypePasskeySyncCallback.INSTANCE.lower2(zym).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit startCentralFlow$lambda$18(final java.lang.String str, final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, BlePasskeyException.ErrorHandler, new Function1() { // from class: o.zYG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59041zYz.startCentralFlow$lambda$18$lambda$17(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit startCentralFlow$lambda$18$lambda$17(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysyncblemanager_start_central_flow(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit startPeripheralFlow$lambda$20(final java.lang.String str, final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, BlePasskeyException.ErrorHandler, new Function1() { // from class: o.zYB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59041zYz.startPeripheralFlow$lambda$20$lambda$19(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit startPeripheralFlow$lambda$20$lambda$19(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysyncblemanager_start_peripheral_flow(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit stop$lambda$22(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zYC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59041zYz.stop$lambda$22$lambda$21(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit stop$lambda$22$lambda$21(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysyncblemanager_stop(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
