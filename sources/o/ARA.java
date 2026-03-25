package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.lifecycle.FfiConverterOptionalTypeCoreAppLinkHandler;
import uniffi.lifecycle.FfiConverterOptionalTypeCoreAppLinkMetadata;
import uniffi.lifecycle.FfiConverterString;
import uniffi.lifecycle.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public class ARA extends AbstractC60182zxs implements ARC {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARA(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C2692AVo.uniffiRustBuffer, new Function2() { // from class: o.ARH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ARA.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ARG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(ARA.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_free_coreapplinkinfofetcher(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_clone_coreapplinkinfofetcher(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARA(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C2692AVo.uniffiRustBuffer, new Function2() { // from class: o.ARM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ARA.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ARN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(ARA.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_free_coreapplinkinfofetcher(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_clone_coreapplinkinfofetcher(j, uniffiRustCallStatus);
    }

    @Override // o.ARC
    public InterfaceC2599ARy OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterOptionalTypeCoreAppLinkHandler.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ARJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ARA.getAppLinkHandler$lambda$5(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getAppLinkHandler$lambda$5(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ARF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ARA.getAppLinkHandler$lambda$5$lambda$4(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAppLinkHandler$lambda$5$lambda$4(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coreapplinkinfofetcher_get_app_link_handler(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.ARC
    public ARK OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterOptionalTypeCoreAppLinkMetadata.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ARI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ARA.getAppLinkMetadata$lambda$7(str, str2, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getAppLinkMetadata$lambda$7(final java.lang.String str, final java.lang.String str2, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ARE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ARA.getAppLinkMetadata$lambda$7$lambda$6(j, str, str2, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAppLinkMetadata$lambda$7$lambda$6(long j, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_lifecycle_fn_method_coreapplinkinfofetcher_get_app_link_metadata(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
    }
}
