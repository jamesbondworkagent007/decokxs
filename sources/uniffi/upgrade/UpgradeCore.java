package uniffi.upgrade;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC60182zxs;
import o.BtU;
import o.BuB;
import o.C60168zxe;
import o.C60173zxj;
import o.C60184zxu;
import o.yHO;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.upgrade.UpgradeCore;

/* JADX INFO: loaded from: classes14.dex */
public class UpgradeCore extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object checkUpgradeAsync(@NotNull CheckUpgradeInfo checkUpgradeInfo, @NotNull Continuation<? super CheckResult> continuation) throws UpgradeException {
        return checkUpgradeAsync$suspendImpl(this, checkUpgradeInfo, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeCore(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.EZpvd(), BuB.uniffiRustBuffer, new Function2() { // from class: o.Buv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return UpgradeCore._init_$lambda$0(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Buz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(UpgradeCore._init_$lambda$1(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_upgrade_fn_free_upgradecore(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _init_$lambda$1(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_upgrade_fn_clone_upgradecore(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeCore(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.EZpvd(), BuB.uniffiRustBuffer, new Function2() { // from class: o.Bug
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return UpgradeCore._init_$lambda$2(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Buw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(UpgradeCore._init_$lambda$3(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_upgrade_fn_free_upgradecore(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _init_$lambda$3(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_upgrade_fn_clone_upgradecore(j, uniffiRustCallStatus);
    }

    public static /* synthetic */ Object checkUpgradeAsync$suspendImpl(UpgradeCore upgradeCore, final CheckUpgradeInfo checkUpgradeInfo, Continuation<? super CheckResult> continuation) throws UpgradeException {
        return C60173zxj.uniffiRustCallAsync(BuB.uniffiRustBuffer, ((Number) upgradeCore.callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bul
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(UpgradeCore.checkUpgradeAsync$lambda$4(checkUpgradeInfo, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.Buk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return UpgradeCore.checkUpgradeAsync$lambda$5(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.Bum
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return UpgradeCore.checkUpgradeAsync$lambda$6(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.Buj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UpgradeCore.checkUpgradeAsync$lambda$7(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.Bun
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UpgradeCore.checkUpgradeAsync$lambda$8((RustBuffer.ByValue) obj);
            }
        }, UpgradeException.ErrorHandler, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long checkUpgradeAsync$lambda$4(CheckUpgradeInfo checkUpgradeInfo, long j) {
        return UniffiLib.INSTANCE.uniffi_upgrade_fn_method_upgradecore_check_upgrade_async(j, FfiConverterTypeCheckUpgradeInfo.INSTANCE.lower2((Object) checkUpgradeInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpgradeAsync$lambda$5(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_upgrade_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue checkUpgradeAsync$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_upgrade_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpgradeAsync$lambda$7(long j) {
        UniffiLib.INSTANCE.ffi_upgrade_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckResult checkUpgradeAsync$lambda$8(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (CheckResult) FfiConverterTypeCheckResult.INSTANCE.lift2(byValue);
    }

    public void clearCacheResponse() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.But
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UpgradeCore.clearCacheResponse$lambda$10(((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearCacheResponse$lambda$10(final long j) {
        C60173zxj.uniffiRustCall(BuB.uniffiRustBuffer, new Function1() { // from class: o.BuC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UpgradeCore.clearCacheResponse$lambda$10$lambda$9(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearCacheResponse$lambda$10$lambda$9(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_upgrade_fn_method_upgradecore_clear_cache_response(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void clearPopedFlag() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Buu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UpgradeCore.clearPopedFlag$lambda$12(((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearPopedFlag$lambda$12(final long j) {
        C60173zxj.uniffiRustCall(BuB.uniffiRustBuffer, new Function1() { // from class: o.Buq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UpgradeCore.clearPopedFlag$lambda$12$lambda$11(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearPopedFlag$lambda$12$lambda$11(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_upgrade_fn_method_upgradecore_clear_poped_flag(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public byte[] getCachedResponse() {
        return FfiConverterOptionalByteArray.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bup
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UpgradeCore.getCachedResponse$lambda$14(((java.lang.Long) obj).longValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue getCachedResponse$lambda$14(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BuB.uniffiRustBuffer, new Function1() { // from class: o.Bue
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UpgradeCore.getCachedResponse$lambda$14$lambda$13(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue getCachedResponse$lambda$14$lambda$13(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_upgrade_fn_method_upgradecore_get_cached_response(j, uniffiRustCallStatus);
    }

    public boolean setDebugCachedResponse(@NotNull final byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return FfiConverterBoolean.INSTANCE.lift(((Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bur
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(UpgradeCore.setDebugCachedResponse$lambda$16(bArr, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte setDebugCachedResponse$lambda$16(final byte[] bArr, final long j) {
        return ((Number) C60173zxj.uniffiRustCall(BuB.uniffiRustBuffer, new Function1() { // from class: o.BuA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(UpgradeCore.setDebugCachedResponse$lambda$16$lambda$15(j, bArr, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte setDebugCachedResponse$lambda$16$lambda$15(long j, byte[] bArr, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_upgrade_fn_method_upgradecore_set_debug_cached_response(j, FfiConverterByteArray.INSTANCE.lower2((Object) bArr), uniffiRustCallStatus);
    }

    public void setPopedFlag() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Buo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UpgradeCore.setPopedFlag$lambda$18(((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPopedFlag$lambda$18(final long j) {
        C60173zxj.uniffiRustCall(BuB.uniffiRustBuffer, new Function1() { // from class: o.Bus
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UpgradeCore.setPopedFlag$lambda$18$lambda$17(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPopedFlag$lambda$18$lambda$17(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_upgrade_fn_method_upgradecore_set_poped_flag(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void setUpgradeContext(@NotNull final BtU btU) {
        Intrinsics.checkNotNullParameter(btU, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Buy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UpgradeCore.setUpgradeContext$lambda$20(btU, ((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUpgradeContext$lambda$20(final BtU btU, final long j) {
        C60173zxj.uniffiRustCall(BuB.uniffiRustBuffer, new Function1() { // from class: o.Bux
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UpgradeCore.setUpgradeContext$lambda$20$lambda$19(j, btU, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUpgradeContext$lambda$20$lambda$19(long j, BtU btU, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_upgrade_fn_method_upgradecore_set_upgrade_context(j, FfiConverterTypeUpgradeContextInterface.INSTANCE.lower2(btU).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
