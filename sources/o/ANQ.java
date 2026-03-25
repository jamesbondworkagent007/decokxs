package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.growth.FfiConverterInt;
import uniffi.growth.FfiConverterOptionalTypePopupNextAction;
import uniffi.growth.FfiConverterOptionalTypeSharePlatform;
import uniffi.growth.FfiConverterString;
import uniffi.growth.FfiConverterTypePlatformCategory;
import uniffi.growth.FfiConverterTypePlatformPackageCallback;
import uniffi.growth.FfiConverterTypeSharePlatform;
import uniffi.growth.FfiConverterTypeSharePlatformManager;
import uniffi.growth.FfiConverterTypeUIExecutor;
import uniffi.growth.IntegrityCheckingUniffiLib;
import uniffi.growth.PlatformCategory;
import uniffi.growth.PopupNextAction;
import uniffi.growth.SharePlatform;
import uniffi.growth.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class ANQ {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new ActionBar());

    public static final class ActionBar implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_growth_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_growth_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_growth_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final PopupNextAction getPopupNextActionFromInt(final int i) {
        return FfiConverterOptionalTypePopupNextAction.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ANM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ANQ.getPopupNextActionFromInt$lambda$0(i, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue getPopupNextActionFromInt$lambda$0(int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_func_get_popup_next_action_from_int(FfiConverterInt.INSTANCE.lower(i).intValue(), uniffiRustCallStatus);
    }

    public static final APK getSharedSharePlatformManager() {
        return FfiConverterTypeSharePlatformManager.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ANU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(ANQ.getSharedSharePlatformManager$lambda$1((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getSharedSharePlatformManager$lambda$1(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_func_get_shared_share_platform_manager(uniffiRustCallStatus);
    }

    public static final void registerPlatformPackageCallback(@NotNull final InterfaceC2502AOf interfaceC2502AOf) {
        Intrinsics.checkNotNullParameter(interfaceC2502AOf, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ANT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ANQ.registerPlatformPackageCallback$lambda$2(interfaceC2502AOf, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerPlatformPackageCallback$lambda$2(InterfaceC2502AOf interfaceC2502AOf, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_func_register_platform_package_callback(FfiConverterTypePlatformPackageCallback.INSTANCE.lower2(interfaceC2502AOf).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerPopupUiExecutor(@NotNull final InterfaceC2568AQt interfaceC2568AQt) {
        Intrinsics.checkNotNullParameter(interfaceC2568AQt, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ANV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ANQ.registerPopupUiExecutor$lambda$3(interfaceC2568AQt, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerPopupUiExecutor$lambda$3(InterfaceC2568AQt interfaceC2568AQt, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_func_register_popup_ui_executor(FfiConverterTypeUIExecutor.INSTANCE.lower2(interfaceC2568AQt).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final PlatformCategory sharePlatformCategory(@NotNull final SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        return (PlatformCategory) FfiConverterTypePlatformCategory.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ANO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ANQ.sharePlatformCategory$lambda$4(sharePlatform, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue sharePlatformCategory$lambda$4(SharePlatform sharePlatform, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_func_share_platform_category(FfiConverterTypeSharePlatform.INSTANCE.lower2((java.lang.Object) sharePlatform), uniffiRustCallStatus);
    }

    public static final SharePlatform sharePlatformFromPlatformId(final int i) {
        return FfiConverterOptionalTypeSharePlatform.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ANS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ANQ.sharePlatformFromPlatformId$lambda$5(i, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue sharePlatformFromPlatformId$lambda$5(int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_func_share_platform_from_platform_id(FfiConverterInt.INSTANCE.lower(i).intValue(), uniffiRustCallStatus);
    }

    public static final java.lang.String sharePlatformNameString(@NotNull final SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ANR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ANQ.sharePlatformNameString$lambda$6(sharePlatform, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue sharePlatformNameString$lambda$6(SharePlatform sharePlatform, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_func_share_platform_name_string(FfiConverterTypeSharePlatform.INSTANCE.lower2((java.lang.Object) sharePlatform), uniffiRustCallStatus);
    }
}
