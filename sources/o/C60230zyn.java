package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.account.ColorTheme;
import uniffi.account.FfiConverterOptionalString;
import uniffi.account.FfiConverterOptionalTypeColorTheme;
import uniffi.account.FfiConverterString;
import uniffi.account.FfiConverterTypeMfaServiceTrait;
import uniffi.account.FfiConverterTypeNativeBlePasskeyProvider;
import uniffi.account.FfiConverterTypeNativePasskeyKeyProvider;
import uniffi.account.FfiConverterTypeOkxPasskeyManagerHandling;
import uniffi.account.FfiConverterTypePasskeyCoreBinding;
import uniffi.account.FfiConverterTypePasskeySDKTrait;
import uniffi.account.FfiConverterTypePasskeySupportCheckerTrait;
import uniffi.account.FfiConverterUInt;
import uniffi.account.IntegrityCheckingUniffiLib;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.zyn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60230zyn {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new ActionBar());

    /* JADX INFO: renamed from: o.zyn$ActionBar */
    public static final class ActionBar implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_account_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_account_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final java.lang.String blePasskeyDataCharacteristicUuid() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.zyw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C60230zyn.blePasskeyDataCharacteristicUuid$lambda$0((UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue blePasskeyDataCharacteristicUuid$lambda$0(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_func_ble_passkey_data_characteristic_uuid(uniffiRustCallStatus);
    }

    public static final java.lang.String blePasskeyDataConfirmCharacteristicUuid() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.zyr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C60230zyn.blePasskeyDataConfirmCharacteristicUuid$lambda$1((UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue blePasskeyDataConfirmCharacteristicUuid$lambda$1(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_func_ble_passkey_data_confirm_characteristic_uuid(uniffiRustCallStatus);
    }

    public static final int blePasskeyDefaultMtu() {
        return FfiConverterUInt.INSTANCE.m9550liftOGnWXxg(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.zyl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C60230zyn.blePasskeyDefaultMtu$lambda$2((UniffiRustCallStatus) obj));
            }
        })).intValue());
    }

    public static final int blePasskeyDefaultMtu$lambda$2(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_func_ble_passkey_default_mtu(uniffiRustCallStatus);
    }

    public static final ColorTheme colorThemeFromString(final java.lang.String str) {
        return FfiConverterOptionalTypeColorTheme.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.zys
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C60230zyn.colorThemeFromString$lambda$3(str, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue colorThemeFromString$lambda$3(java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_func_color_theme_from_string(FfiConverterOptionalString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public static final InterfaceC58880zSu getOkxPasskeyManager() {
        return FfiConverterTypeOkxPasskeyManagerHandling.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.zyk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C60230zyn.getOkxPasskeyManager$lambda$4((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getOkxPasskeyManager$lambda$4(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_func_get_okx_passkey_manager(uniffiRustCallStatus);
    }

    public static final void registerMfaService(@NotNull final InterfaceC58571zHh interfaceC58571zHh) {
        Intrinsics.checkNotNullParameter(interfaceC58571zHh, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.zym
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C60230zyn.registerMfaService$lambda$5(interfaceC58571zHh, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerMfaService$lambda$5(InterfaceC58571zHh interfaceC58571zHh, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_func_register_mfa_service(FfiConverterTypeMfaServiceTrait.INSTANCE.lower2(interfaceC58571zHh).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerNativeBlePasskeyProvider(@NotNull final zHY zhy) {
        Intrinsics.checkNotNullParameter(zhy, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.zyq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C60230zyn.registerNativeBlePasskeyProvider$lambda$6(zhy, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerNativeBlePasskeyProvider$lambda$6(zHY zhy, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_func_register_native_ble_passkey_provider(FfiConverterTypeNativeBlePasskeyProvider.INSTANCE.lower2(zhy).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerNativePasskeyKeyProvider(@NotNull final zIR zir) {
        Intrinsics.checkNotNullParameter(zir, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.zyp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C60230zyn.registerNativePasskeyKeyProvider$lambda$7(zir, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerNativePasskeyKeyProvider$lambda$7(zIR zir, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_func_register_native_passkey_key_provider(FfiConverterTypeNativePasskeyKeyProvider.INSTANCE.lower2(zir).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerPasskeyCoreBinding(@NotNull final InterfaceC58955zVr interfaceC58955zVr) {
        Intrinsics.checkNotNullParameter(interfaceC58955zVr, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.zyy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C60230zyn.registerPasskeyCoreBinding$lambda$8(interfaceC58955zVr, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerPasskeyCoreBinding$lambda$8(InterfaceC58955zVr interfaceC58955zVr, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_func_register_passkey_core_binding(FfiConverterTypePasskeyCoreBinding.INSTANCE.lower2(interfaceC58955zVr).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerPasskeySdk(@NotNull final zXB zxb) {
        Intrinsics.checkNotNullParameter(zxb, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.zyt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C60230zyn.registerPasskeySdk$lambda$9(zxb, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerPasskeySdk$lambda$9(zXB zxb, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_func_register_passkey_sdk(FfiConverterTypePasskeySDKTrait.INSTANCE.lower2(zxb).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerPasskeySupportChecker(@NotNull final InterfaceC59023zYh interfaceC59023zYh) {
        Intrinsics.checkNotNullParameter(interfaceC59023zYh, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.zyx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C60230zyn.registerPasskeySupportChecker$lambda$10(interfaceC59023zYh, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerPasskeySupportChecker$lambda$10(InterfaceC59023zYh interfaceC59023zYh, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_func_register_passkey_support_checker(FfiConverterTypePasskeySupportCheckerTrait.INSTANCE.lower2(interfaceC59023zYh).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_account_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }
}
