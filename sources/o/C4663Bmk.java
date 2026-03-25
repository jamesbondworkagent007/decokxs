package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.settings.FfiConverterBoolean;
import uniffi.settings.FfiConverterTypeColorCoreBinding;
import uniffi.settings.FfiConverterTypeColorPreferenceStateChangeCallback;
import uniffi.settings.UniffiLib;

/* JADX INFO: renamed from: o.Bmk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C4663Bmk extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object AEQbTJ(boolean z, @NotNull Continuation<? super Unit> continuation) {
        return onModernClassicClicked$suspendImpl(this, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super Unit> continuation) {
        return onGreenRedUpClicked$suspendImpl(this, z, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4663Bmk(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), BoN.uniffiRustBuffer, new Function2() { // from class: o.Bmx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4663Bmk.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bmw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4663Bmk.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_settings_fn_free_colorselectinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_clone_colorselectinteractor(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4663Bmk(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), BoN.uniffiRustBuffer, new Function2() { // from class: o.Bms
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4663Bmk.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bmv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4663Bmk.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_settings_fn_free_colorselectinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_clone_colorselectinteractor(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4663Bmk(@NotNull final BlN blN) {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.Bmu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4663Bmk._init_$lambda$4(blN, (UniffiRustCallStatus) obj));
            }
        })).longValue());
        Intrinsics.checkNotNullParameter(blN, "");
    }

    public static final long _init_$lambda$4(BlN blN, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_constructor_colorselectinteractor_new(FfiConverterTypeColorCoreBinding.INSTANCE.lower2(blN).longValue(), uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object onGreenRedUpClicked$suspendImpl(C4663Bmk c4663Bmk, final boolean z, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(BoN.uniffiRustBuffer, ((java.lang.Number) c4663Bmk.callWithHandle$OKCore_deploy(new Function1() { // from class: o.BmB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4663Bmk.onGreenRedUpClicked$lambda$5(z, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.BmA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C4663Bmk.onGreenRedUpClicked$lambda$6(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.BmC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4663Bmk.onGreenRedUpClicked$lambda$7(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.Bmz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4663Bmk.onGreenRedUpClicked$lambda$8(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.BmD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4663Bmk.onGreenRedUpClicked$lambda$9((Unit) obj);
            }
        }, new C60178zxo(BoN.uniffiRustBuffer), continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long onGreenRedUpClicked$lambda$5(boolean z, long j) {
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_colorselectinteractor_on_green_red_up_clicked(j, FfiConverterBoolean.INSTANCE.lower(z).byteValue());
    }

    public static final Unit onGreenRedUpClicked$lambda$6(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit onGreenRedUpClicked$lambda$7(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit onGreenRedUpClicked$lambda$8(long j) {
        UniffiLib.INSTANCE.ffi_settings_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit onGreenRedUpClicked$lambda$9(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object onModernClassicClicked$suspendImpl(C4663Bmk c4663Bmk, final boolean z, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(BoN.uniffiRustBuffer, ((java.lang.Number) c4663Bmk.callWithHandle$OKCore_deploy(new Function1() { // from class: o.BmE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4663Bmk.onModernClassicClicked$lambda$10(z, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.BmF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C4663Bmk.onModernClassicClicked$lambda$11(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.Bmp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4663Bmk.onModernClassicClicked$lambda$12(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.Bmr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4663Bmk.onModernClassicClicked$lambda$13(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.Bmq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4663Bmk.onModernClassicClicked$lambda$14((Unit) obj);
            }
        }, new C60178zxo(BoN.uniffiRustBuffer), continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long onModernClassicClicked$lambda$10(boolean z, long j) {
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_colorselectinteractor_on_modern_classic_clicked(j, FfiConverterBoolean.INSTANCE.lower(z).byteValue());
    }

    public static final Unit onModernClassicClicked$lambda$11(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit onModernClassicClicked$lambda$12(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit onModernClassicClicked$lambda$13(long j) {
        UniffiLib.INSTANCE.ffi_settings_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit onModernClassicClicked$lambda$14(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public void AEQbTJ(@NotNull final InterfaceC4660Bmh interfaceC4660Bmh) {
        Intrinsics.checkNotNullParameter(interfaceC4660Bmh, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bmt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4663Bmk.setStateCallback$lambda$16(interfaceC4660Bmh, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setStateCallback$lambda$16(final InterfaceC4660Bmh interfaceC4660Bmh, final long j) {
        C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.Bmy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4663Bmk.setStateCallback$lambda$16$lambda$15(j, interfaceC4660Bmh, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setStateCallback$lambda$16$lambda$15(long j, InterfaceC4660Bmh interfaceC4660Bmh, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_settings_fn_method_colorselectinteractor_set_state_callback(j, FfiConverterTypeColorPreferenceStateChangeCallback.INSTANCE.lower2(interfaceC4660Bmh).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
