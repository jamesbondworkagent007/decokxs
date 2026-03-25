package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.lifecycle.FfiConverterString;
import uniffi.lifecycle.FfiConverterTypeCoreLinkDependencyHelper;
import uniffi.lifecycle.FfiConverterTypeOKRustFutureShortLinkInfoWithLifecycleFutureError;
import uniffi.lifecycle.FfiConverterTypeOKRustFutureboolWithLifecycleFutureError;
import uniffi.lifecycle.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public class ATC extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ATC(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C2692AVo.uniffiRustBuffer, new Function2() { // from class: o.ATN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ATC.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ATL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(ATC.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_free_corelifecyclelinkservicebridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_clone_corelifecyclelinkservicebridge(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ATC(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C2692AVo.uniffiRustBuffer, new Function2() { // from class: o.ATE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ATC.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ATF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(ATC.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_free_corelifecyclelinkservicebridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_clone_corelifecyclelinkservicebridge(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ATC(@NotNull final AUI aui) {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ATJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(ATC._init_$lambda$4(aui, (UniffiRustCallStatus) obj));
            }
        })).longValue());
        Intrinsics.checkNotNullParameter(aui, "");
    }

    public static final long _init_$lambda$4(AUI aui, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_constructor_corelifecyclelinkservicebridge_new(FfiConverterTypeCoreLinkDependencyHelper.INSTANCE.lower2(aui).longValue(), uniffiRustCallStatus);
    }

    public AVV EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterTypeOKRustFutureShortLinkInfoWithLifecycleFutureError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ATI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(ATC.getShortLinkInfo$lambda$6(str, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long getShortLinkInfo$lambda$6(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ATG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(ATC.getShortLinkInfo$lambda$6$lambda$5(j, str, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long getShortLinkInfo$lambda$6$lambda$5(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_corelifecyclelinkservicebridge_get_short_link_info(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public C2712AWi OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterTypeOKRustFutureboolWithLifecycleFutureError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ATH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(ATC.processExternalLink$lambda$8(str, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long processExternalLink$lambda$8(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ATK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(ATC.processExternalLink$lambda$8$lambda$7(j, str, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long processExternalLink$lambda$8$lambda$7(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_corelifecyclelinkservicebridge_process_external_link(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }
}
