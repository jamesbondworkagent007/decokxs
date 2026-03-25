package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.lifecycle.FfiConverterBoolean;
import uniffi.lifecycle.FfiConverterSequenceString;
import uniffi.lifecycle.FfiConverterString;
import uniffi.lifecycle.UniffiLib;

/* JADX INFO: loaded from: classes25.dex */
public class ARL extends AbstractC60182zxs implements ARK {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARL(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C2692AVo.uniffiRustBuffer, new Function2() { // from class: o.ARU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ARL.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ARX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(ARL.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_free_coreapplinkmetadata(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_clone_coreapplinkmetadata(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARL(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C2692AVo.uniffiRustBuffer, new Function2() { // from class: o.ASc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ARL.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ASd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(ARL.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_free_coreapplinkmetadata(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_clone_coreapplinkmetadata(j, uniffiRustCallStatus);
    }

    @Override // o.ARK
    public java.lang.String AEQbTJ() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ARP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ARL.getLink$lambda$5(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getLink$lambda$5(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ASa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ARL.getLink$lambda$5$lambda$4(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getLink$lambda$5$lambda$4(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coreapplinkmetadata_get_link(j, uniffiRustCallStatus);
    }

    @Override // o.ARK
    public java.lang.String OLrzqt() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ART
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ARL.getMode$lambda$7(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getMode$lambda$7(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ARO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ARL.getMode$lambda$7$lambda$6(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getMode$lambda$7$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coreapplinkmetadata_get_mode(j, uniffiRustCallStatus);
    }

    @Override // o.ARK
    public boolean copydefault() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ARQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ARL.requireAuth$lambda$9(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte requireAuth$lambda$9(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ASh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ARL.requireAuth$lambda$9$lambda$8(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte requireAuth$lambda$9$lambda$8(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coreapplinkmetadata_require_auth(j, uniffiRustCallStatus);
    }

    @Override // o.ARK
    public java.util.List<java.lang.String> EZpvd() {
        return (java.util.List) FfiConverterSequenceString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ARS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ARL.getSupportedOkxDomains$lambda$11(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getSupportedOkxDomains$lambda$11(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ARR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ARL.getSupportedOkxDomains$lambda$11$lambda$10(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getSupportedOkxDomains$lambda$11$lambda$10(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coreapplinkmetadata_get_supported_okx_domains(j, uniffiRustCallStatus);
    }

    @Override // o.ARK
    public boolean AYXKKw() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ARV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ARL.supportRbacAccount$lambda$13(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte supportRbacAccount$lambda$13(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ARZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ARL.supportRbacAccount$lambda$13$lambda$12(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte supportRbacAccount$lambda$13$lambda$12(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coreapplinkmetadata_support_rbac_account(j, uniffiRustCallStatus);
    }

    @Override // o.ARK
    public boolean AhwBna() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ARW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ARL.supportRmAccount$lambda$15(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte supportRmAccount$lambda$15(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ASe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ARL.supportRmAccount$lambda$15$lambda$14(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte supportRmAccount$lambda$15$lambda$14(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coreapplinkmetadata_support_rm_account(j, uniffiRustCallStatus);
    }

    @Override // o.ARK
    public boolean KWHzl() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ARY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ARL.opensInWebview$lambda$17(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte opensInWebview$lambda$17(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ASb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(ARL.opensInWebview$lambda$17$lambda$16(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte opensInWebview$lambda$17$lambda$16(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coreapplinkmetadata_opens_in_webview(j, uniffiRustCallStatus);
    }
}
