package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.path_provider.FfiConverterString;
import uniffi.path_provider.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public class BgC extends AbstractC60182zxs implements BgF {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BgC(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.KWHzl(), BgU.uniffiRustBuffer, new Function2() { // from class: o.BgB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BgC.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.BgD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BgC.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_path_provider_fn_free_pathproviderinterface(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_path_provider_fn_clone_pathproviderinterface(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BgC(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.KWHzl(), BgU.uniffiRustBuffer, new Function2() { // from class: o.BgM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BgC.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.BgO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BgC.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_path_provider_fn_free_pathproviderinterface(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_path_provider_fn_clone_pathproviderinterface(j, uniffiRustCallStatus);
    }

    @Override // o.BgF
    public java.lang.String EZpvd() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BgP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BgC.getTemporaryDirectory$lambda$5(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getTemporaryDirectory$lambda$5(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BgU.uniffiRustBuffer, new Function1() { // from class: o.BgH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BgC.getTemporaryDirectory$lambda$5$lambda$4(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getTemporaryDirectory$lambda$5$lambda$4(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_path_provider_fn_method_pathproviderinterface_get_temporary_directory(j, uniffiRustCallStatus);
    }

    @Override // o.BgF
    public java.lang.String OLrzqt() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BgN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BgC.getApplicationDocumentsDirectory$lambda$7(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getApplicationDocumentsDirectory$lambda$7(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BgU.uniffiRustBuffer, new Function1() { // from class: o.BgJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BgC.getApplicationDocumentsDirectory$lambda$7$lambda$6(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getApplicationDocumentsDirectory$lambda$7$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_path_provider_fn_method_pathproviderinterface_get_application_documents_directory(j, uniffiRustCallStatus);
    }

    @Override // o.BgF
    public java.lang.String AEQbTJ() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BgK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BgC.getApplicationSupportDirectory$lambda$9(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getApplicationSupportDirectory$lambda$9(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BgU.uniffiRustBuffer, new Function1() { // from class: o.BgQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BgC.getApplicationSupportDirectory$lambda$9$lambda$8(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getApplicationSupportDirectory$lambda$9$lambda$8(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_path_provider_fn_method_pathproviderinterface_get_application_support_directory(j, uniffiRustCallStatus);
    }

    @Override // o.BgF
    public java.lang.String KWHzl() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BgI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BgC.getApplicationCacheDirectory$lambda$11(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getApplicationCacheDirectory$lambda$11(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BgU.uniffiRustBuffer, new Function1() { // from class: o.BgG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BgC.getApplicationCacheDirectory$lambda$11$lambda$10(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getApplicationCacheDirectory$lambda$11$lambda$10(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_path_provider_fn_method_pathproviderinterface_get_application_cache_directory(j, uniffiRustCallStatus);
    }

    @Override // o.BgF
    public java.lang.String copydefault() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BgL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BgC.getDownloadsDirectory$lambda$13(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getDownloadsDirectory$lambda$13(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BgU.uniffiRustBuffer, new Function1() { // from class: o.BgE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BgC.getDownloadsDirectory$lambda$13$lambda$12(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getDownloadsDirectory$lambda$13$lambda$12(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_path_provider_fn_method_pathproviderinterface_get_downloads_directory(j, uniffiRustCallStatus);
    }
}
