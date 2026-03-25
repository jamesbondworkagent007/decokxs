package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.growth.FfiConverterBoolean;
import uniffi.growth.FfiConverterSequenceTypeSharePlatform;
import uniffi.growth.FfiConverterString;
import uniffi.growth.FfiConverterTypeShareConfig;
import uniffi.growth.FfiConverterTypeSharePlatform;
import uniffi.growth.SharePlatform;
import uniffi.growth.UniffiLib;

/* JADX INFO: renamed from: o.AOk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C2507AOk extends AbstractC60182zxs implements InterfaceC2502AOf {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2507AOk(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), ANQ.uniffiRustBuffer, new Function2() { // from class: o.AOo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2507AOk.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AOp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2507AOk.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_free_platformpackagecallback(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_clone_platformpackagecallback(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2507AOk(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), ANQ.uniffiRustBuffer, new Function2() { // from class: o.AOg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2507AOk.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AOh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2507AOk.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_free_platformpackagecallback(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_clone_platformpackagecallback(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2502AOf
    public boolean KWHzl(@NotNull final java.lang.String str, @NotNull final SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AOl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2507AOk.isPackageInstalled$lambda$5(str, sharePlatform, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isPackageInstalled$lambda$5(final java.lang.String str, final SharePlatform sharePlatform, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(ANQ.uniffiRustBuffer, new Function1() { // from class: o.AOj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2507AOk.isPackageInstalled$lambda$5$lambda$4(j, str, sharePlatform, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isPackageInstalled$lambda$5$lambda$4(long j, java.lang.String str, SharePlatform sharePlatform, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_platformpackagecallback_is_package_installed(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterTypeSharePlatform.INSTANCE.lower2((java.lang.Object) sharePlatform), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2502AOf
    public java.util.List<SharePlatform> EZpvd(@NotNull final APJ apj, @NotNull final java.util.List<? extends SharePlatform> list) {
        Intrinsics.checkNotNullParameter(apj, "");
        Intrinsics.checkNotNullParameter(list, "");
        return (java.util.List) FfiConverterSequenceTypeSharePlatform.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AOi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2507AOk.filterAvailableSharePlatforms$lambda$7(apj, list, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue filterAvailableSharePlatforms$lambda$7(final APJ apj, final java.util.List list, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ANQ.uniffiRustBuffer, new Function1() { // from class: o.AOm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2507AOk.filterAvailableSharePlatforms$lambda$7$lambda$6(j, apj, list, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue filterAvailableSharePlatforms$lambda$7$lambda$6(long j, APJ apj, java.util.List list, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_platformpackagecallback_filter_available_share_platforms(j, FfiConverterTypeShareConfig.INSTANCE.lower2((java.lang.Object) apj), FfiConverterSequenceTypeSharePlatform.INSTANCE.lower2((java.lang.Object) list), uniffiRustCallStatus);
    }
}
