package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.localization.FfiConverterTypeAppLanguageItem;
import uniffi.settings.FfiConverterTypeLanguageCoreBinding;
import uniffi.settings.FfiConverterTypeLanguageListStateChangeCallback;
import uniffi.settings.FfiConverterTypeLanguageSelectEventCallback;
import uniffi.settings.UniffiLib;

/* JADX INFO: renamed from: o.Bol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C4718Bol extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object EZpvd(@NotNull AXZ axz, @NotNull Continuation<? super Unit> continuation) {
        return changeLanguage$suspendImpl(this, axz, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) {
        return loadLanguages$suspendImpl(this, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4718Bol(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), BoN.uniffiRustBuffer, new Function2() { // from class: o.Bou
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4718Bol.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bos
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4718Bol.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_settings_fn_free_languageselectinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_clone_languageselectinteractor(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4718Bol(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), BoN.uniffiRustBuffer, new Function2() { // from class: o.BoC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4718Bol.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.BoD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4718Bol.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_settings_fn_free_languageselectinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_clone_languageselectinteractor(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4718Bol(@NotNull final BnI bnI) {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.Bov
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4718Bol._init_$lambda$4(bnI, (UniffiRustCallStatus) obj));
            }
        })).longValue());
        Intrinsics.checkNotNullParameter(bnI, "");
    }

    public static final long _init_$lambda$4(BnI bnI, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_constructor_languageselectinteractor_new(FfiConverterTypeLanguageCoreBinding.INSTANCE.lower2(bnI).longValue(), uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object changeLanguage$suspendImpl(C4718Bol c4718Bol, final AXZ axz, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(BoN.uniffiRustBuffer, ((java.lang.Number) c4718Bol.callWithHandle$OKCore_deploy(new Function1() { // from class: o.BoH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4718Bol.changeLanguage$lambda$5(axz, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.BoI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C4718Bol.changeLanguage$lambda$6(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.BoJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4718Bol.changeLanguage$lambda$7(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.Bor
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4718Bol.changeLanguage$lambda$8(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.Boq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4718Bol.changeLanguage$lambda$9((Unit) obj);
            }
        }, new C60178zxo(BoN.uniffiRustBuffer), continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long changeLanguage$lambda$5(AXZ axz, long j) {
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_languageselectinteractor_change_language(j, FfiConverterTypeAppLanguageItem.INSTANCE.lower2((java.lang.Object) axz));
    }

    public static final Unit changeLanguage$lambda$6(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit changeLanguage$lambda$7(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit changeLanguage$lambda$8(long j) {
        UniffiLib.INSTANCE.ffi_settings_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit changeLanguage$lambda$9(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object loadLanguages$suspendImpl(C4718Bol c4718Bol, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(BoN.uniffiRustBuffer, ((java.lang.Number) c4718Bol.callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bop
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4718Bol.loadLanguages$lambda$10(((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.Bot
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C4718Bol.loadLanguages$lambda$11(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.BoE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4718Bol.loadLanguages$lambda$12(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.BoA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4718Bol.loadLanguages$lambda$13(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.BoB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4718Bol.loadLanguages$lambda$14((Unit) obj);
            }
        }, new C60178zxo(BoN.uniffiRustBuffer), continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long loadLanguages$lambda$10(long j) {
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_languageselectinteractor_load_languages(j);
    }

    public static final Unit loadLanguages$lambda$11(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit loadLanguages$lambda$12(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit loadLanguages$lambda$13(long j) {
        UniffiLib.INSTANCE.ffi_settings_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit loadLanguages$lambda$14(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public void EZpvd(@NotNull final InterfaceC4714Boh interfaceC4714Boh) {
        Intrinsics.checkNotNullParameter(interfaceC4714Boh, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bow
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4718Bol.setEventCallback$lambda$16(interfaceC4714Boh, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setEventCallback$lambda$16(final InterfaceC4714Boh interfaceC4714Boh, final long j) {
        C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.Box
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4718Bol.setEventCallback$lambda$16$lambda$15(j, interfaceC4714Boh, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setEventCallback$lambda$16$lambda$15(long j, InterfaceC4714Boh interfaceC4714Boh, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_settings_fn_method_languageselectinteractor_set_event_callback(j, FfiConverterTypeLanguageSelectEventCallback.INSTANCE.lower2(interfaceC4714Boh).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void EZpvd(@NotNull final InterfaceC4707Boa interfaceC4707Boa) {
        Intrinsics.checkNotNullParameter(interfaceC4707Boa, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Boy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4718Bol.setStateCallback$lambda$18(interfaceC4707Boa, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setStateCallback$lambda$18(final InterfaceC4707Boa interfaceC4707Boa, final long j) {
        C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.Boz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4718Bol.setStateCallback$lambda$18$lambda$17(j, interfaceC4707Boa, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setStateCallback$lambda$18$lambda$17(long j, InterfaceC4707Boa interfaceC4707Boa, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_settings_fn_method_languageselectinteractor_set_state_callback(j, FfiConverterTypeLanguageListStateChangeCallback.INSTANCE.lower2(interfaceC4707Boa).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
