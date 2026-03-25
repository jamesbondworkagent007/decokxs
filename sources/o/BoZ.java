package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.localization.FfiConverterTypeLanguageUnit;
import uniffi.settings.FfiConverterBoolean;
import uniffi.settings.FfiConverterInt;
import uniffi.settings.FfiConverterOptionalTypeCurrencyModel;
import uniffi.settings.FfiConverterSequenceTypeCurrencyModel;
import uniffi.settings.FfiConverterString;
import uniffi.settings.FfiConverterTypeCurrencyModel;
import uniffi.settings.FfiConverterTypeSettingsNotificationBridgingCallback;
import uniffi.settings.FfiConverterTypeUserSettings;
import uniffi.settings.SettingsException;
import uniffi.settings.UniffiLib;

/* JADX INFO: loaded from: classes25.dex */
public class BoZ extends AbstractC60182zxs implements InterfaceC4736Bpc {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC4736Bpc
    public java.lang.Object AEQbTJ(int i, @NotNull Continuation<? super Unit> continuation) throws SettingsException {
        return setRiseFallCycle$suspendImpl(this, i, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC4736Bpc
    public java.lang.Object AEQbTJ(@NotNull C2777AYv c2777AYv, @NotNull Continuation<? super Unit> continuation) throws SettingsException {
        return setUserLanguage$suspendImpl(this, c2777AYv, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC4736Bpc
    public java.lang.Object EZpvd(int i, @NotNull Continuation<? super Unit> continuation) throws SettingsException {
        return setCurrencyPref$suspendImpl(this, i, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC4736Bpc
    public java.lang.Object EZpvd(@NotNull Continuation<? super C4774Bqn> continuation) throws SettingsException {
        return getSettingsFromRemote$suspendImpl(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC4736Bpc
    public java.lang.Object KWHzl(int i, @NotNull Continuation<? super Unit> continuation) throws SettingsException {
        return setColorAppearance$suspendImpl(this, i, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC4736Bpc
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws SettingsException {
        return setFundUnit$suspendImpl(this, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC4736Bpc
    public java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super java.util.List<BmO>> continuation) throws SettingsException {
        return getCurrencyListFromRemote$suspendImpl(this, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC4736Bpc
    public java.lang.Object OLrzqt(int i, @NotNull Continuation<? super Unit> continuation) throws SettingsException {
        return setColorPalette$suspendImpl(this, i, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC4736Bpc
    public java.lang.Object copydefault(int i, @NotNull Continuation<? super Unit> continuation) throws SettingsException {
        return setRiseFallColor$suspendImpl(this, i, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoZ(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), BoN.uniffiRustBuffer, new Function2() { // from class: o.Bpv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BoZ.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bpx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BoZ.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_settings_fn_free_settingsserviceforeignhandling(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_clone_settingsserviceforeignhandling(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoZ(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), BoN.uniffiRustBuffer, new Function2() { // from class: o.Bqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BoZ.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bqg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BoZ.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_settings_fn_free_settingsserviceforeignhandling(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_clone_settingsserviceforeignhandling(j, uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object getSettingsFromRemote$suspendImpl(BoZ boZ, Continuation<? super C4774Bqn> continuation) throws SettingsException {
        return C60173zxj.uniffiRustCallAsync(BoN.uniffiRustBuffer, ((java.lang.Number) boZ.callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bph
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BoZ.getSettingsFromRemote$lambda$4(((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.Bpg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BoZ.getSettingsFromRemote$lambda$5(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.Bpf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BoZ.getSettingsFromRemote$lambda$6(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.Bpm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.getSettingsFromRemote$lambda$7(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.Bpn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.getSettingsFromRemote$lambda$8((RustBuffer.ByValue) obj);
            }
        }, SettingsException.ErrorHandler, continuation);
    }

    public static final long getSettingsFromRemote$lambda$4(long j) {
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_get_settings_from_remote(j);
    }

    public static final Unit getSettingsFromRemote$lambda$5(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue getSettingsFromRemote$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_settings_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit getSettingsFromRemote$lambda$7(long j) {
        UniffiLib.INSTANCE.ffi_settings_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final C4774Bqn getSettingsFromRemote$lambda$8(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (C4774Bqn) FfiConverterTypeUserSettings.INSTANCE.lift2(byValue);
    }

    @Override // o.InterfaceC4736Bpc
    public C4774Bqn AEQbTJ() {
        return (C4774Bqn) FfiConverterTypeUserSettings.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bpe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.getSettingsFromCache$lambda$10(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getSettingsFromCache$lambda$10(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.BpY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.getSettingsFromCache$lambda$10$lambda$9(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getSettingsFromCache$lambda$10$lambda$9(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_get_settings_from_cache(j, uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object getCurrencyListFromRemote$suspendImpl(BoZ boZ, final boolean z, Continuation<? super java.util.List<BmO>> continuation) throws SettingsException {
        return C60173zxj.uniffiRustCallAsync(BoN.uniffiRustBuffer, ((java.lang.Number) boZ.callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bpt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BoZ.getCurrencyListFromRemote$lambda$11(z, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.Bpw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BoZ.getCurrencyListFromRemote$lambda$12(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.Bpy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BoZ.getCurrencyListFromRemote$lambda$13(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.Bpz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.getCurrencyListFromRemote$lambda$14(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.BpB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.getCurrencyListFromRemote$lambda$15((RustBuffer.ByValue) obj);
            }
        }, SettingsException.ErrorHandler, continuation);
    }

    public static final long getCurrencyListFromRemote$lambda$11(boolean z, long j) {
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_get_currency_list_from_remote(j, FfiConverterBoolean.INSTANCE.lower(z).byteValue());
    }

    public static final Unit getCurrencyListFromRemote$lambda$12(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue getCurrencyListFromRemote$lambda$13(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_settings_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit getCurrencyListFromRemote$lambda$14(long j) {
        UniffiLib.INSTANCE.ffi_settings_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final java.util.List getCurrencyListFromRemote$lambda$15(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (java.util.List) FfiConverterSequenceTypeCurrencyModel.INSTANCE.lift2(byValue);
    }

    @Override // o.InterfaceC4736Bpc
    public java.util.List<BmO> EZpvd() {
        return (java.util.List) FfiConverterSequenceTypeCurrencyModel.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bpa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.getCurrencyListFromCache$lambda$17(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getCurrencyListFromCache$lambda$17(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.BpZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.getCurrencyListFromCache$lambda$17$lambda$16(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCurrencyListFromCache$lambda$17$lambda$16(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_get_currency_list_from_cache(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4736Bpc
    public void KWHzl(@NotNull final java.util.List<BmO> list) {
        Intrinsics.checkNotNullParameter(list, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bpp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.updateCurrencyList$lambda$19(list, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit updateCurrencyList$lambda$19(final java.util.List list, final long j) {
        C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.Bpu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.updateCurrencyList$lambda$19$lambda$18(j, list, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit updateCurrencyList$lambda$19$lambda$18(long j, java.util.List list, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_update_currency_list(j, FfiConverterSequenceTypeCurrencyModel.INSTANCE.lower2((java.lang.Object) list), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4736Bpc
    public BmO EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterOptionalTypeCurrencyModel.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bqd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.getCurrencyInfoWithIsoCode$lambda$21(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getCurrencyInfoWithIsoCode$lambda$21(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.BpO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.getCurrencyInfoWithIsoCode$lambda$21$lambda$20(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCurrencyInfoWithIsoCode$lambda$21$lambda$20(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_get_currency_info_with_iso_code(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4736Bpc
    public BmO OLrzqt() {
        return (BmO) FfiConverterTypeCurrencyModel.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BpX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.getCurrencyPref$lambda$23(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getCurrencyPref$lambda$23(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.Bqc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.getCurrencyPref$lambda$23$lambda$22(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCurrencyPref$lambda$23$lambda$22(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_get_currency_pref(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4736Bpc
    public java.lang.String copydefault() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bqa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.getFundUnit$lambda$25(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getFundUnit$lambda$25(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.BpS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.getFundUnit$lambda$25$lambda$24(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getFundUnit$lambda$25$lambda$24(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_get_fund_unit(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4736Bpc
    public void EZpvd(@NotNull final C4774Bqn c4774Bqn) throws SettingsException {
        Intrinsics.checkNotNullParameter(c4774Bqn, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BpN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.updateUserSettings$lambda$27(c4774Bqn, ((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit updateUserSettings$lambda$27(final C4774Bqn c4774Bqn, final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(BoN.uniffiRustBuffer, SettingsException.ErrorHandler, new Function1() { // from class: o.BpC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.updateUserSettings$lambda$27$lambda$26(j, c4774Bqn, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit updateUserSettings$lambda$27$lambda$26(long j, C4774Bqn c4774Bqn, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_update_user_settings(j, FfiConverterTypeUserSettings.INSTANCE.lower2((java.lang.Object) c4774Bqn), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object setRiseFallColor$suspendImpl(BoZ boZ, final int i, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(BoN.uniffiRustBuffer, ((java.lang.Number) boZ.callWithHandle$OKCore_deploy(new Function1() { // from class: o.BpK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BoZ.setRiseFallColor$lambda$28(i, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.BpI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BoZ.setRiseFallColor$lambda$29(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.BpJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BoZ.setRiseFallColor$lambda$30(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.BpM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.setRiseFallColor$lambda$31(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.BpQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.setRiseFallColor$lambda$32((Unit) obj);
            }
        }, SettingsException.ErrorHandler, continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long setRiseFallColor$lambda$28(int i, long j) {
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_set_rise_fall_color(j, FfiConverterInt.INSTANCE.lower(i).intValue());
    }

    public static final Unit setRiseFallColor$lambda$29(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit setRiseFallColor$lambda$30(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit setRiseFallColor$lambda$31(long j) {
        UniffiLib.INSTANCE.ffi_settings_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit setRiseFallColor$lambda$32(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object setColorAppearance$suspendImpl(BoZ boZ, final int i, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(BoN.uniffiRustBuffer, ((java.lang.Number) boZ.callWithHandle$OKCore_deploy(new Function1() { // from class: o.BpR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BoZ.setColorAppearance$lambda$33(i, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.BpP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BoZ.setColorAppearance$lambda$34(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.BpU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BoZ.setColorAppearance$lambda$35(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.BpT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.setColorAppearance$lambda$36(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.BpV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.setColorAppearance$lambda$37((Unit) obj);
            }
        }, SettingsException.ErrorHandler, continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long setColorAppearance$lambda$33(int i, long j) {
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_set_color_appearance(j, FfiConverterInt.INSTANCE.lower(i).intValue());
    }

    public static final Unit setColorAppearance$lambda$34(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit setColorAppearance$lambda$35(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit setColorAppearance$lambda$36(long j) {
        UniffiLib.INSTANCE.ffi_settings_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit setColorAppearance$lambda$37(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object setColorPalette$suspendImpl(BoZ boZ, final int i, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(BoN.uniffiRustBuffer, ((java.lang.Number) boZ.callWithHandle$OKCore_deploy(new Function1() { // from class: o.BpE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BoZ.setColorPalette$lambda$38(i, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.BpH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BoZ.setColorPalette$lambda$39(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.BpF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BoZ.setColorPalette$lambda$40(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.BpD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.setColorPalette$lambda$41(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.BpG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.setColorPalette$lambda$42((Unit) obj);
            }
        }, SettingsException.ErrorHandler, continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long setColorPalette$lambda$38(int i, long j) {
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_set_color_palette(j, FfiConverterInt.INSTANCE.lower(i).intValue());
    }

    public static final Unit setColorPalette$lambda$39(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit setColorPalette$lambda$40(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit setColorPalette$lambda$41(long j) {
        UniffiLib.INSTANCE.ffi_settings_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit setColorPalette$lambda$42(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object setRiseFallCycle$suspendImpl(BoZ boZ, final int i, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(BoN.uniffiRustBuffer, ((java.lang.Number) boZ.callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bpb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BoZ.setRiseFallCycle$lambda$43(i, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.Bpj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BoZ.setRiseFallCycle$lambda$44(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.BpA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BoZ.setRiseFallCycle$lambda$45(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.BpL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.setRiseFallCycle$lambda$46(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.BpW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.setRiseFallCycle$lambda$47((Unit) obj);
            }
        }, SettingsException.ErrorHandler, continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long setRiseFallCycle$lambda$43(int i, long j) {
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_set_rise_fall_cycle(j, FfiConverterInt.INSTANCE.lower(i).intValue());
    }

    public static final Unit setRiseFallCycle$lambda$44(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit setRiseFallCycle$lambda$45(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit setRiseFallCycle$lambda$46(long j) {
        UniffiLib.INSTANCE.ffi_settings_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit setRiseFallCycle$lambda$47(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object setCurrencyPref$suspendImpl(BoZ boZ, final int i, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(BoN.uniffiRustBuffer, ((java.lang.Number) boZ.callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bql
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BoZ.setCurrencyPref$lambda$48(i, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.Bqo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BoZ.setCurrencyPref$lambda$49(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.Bqq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BoZ.setCurrencyPref$lambda$50(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.Bpd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.setCurrencyPref$lambda$51(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.Bpi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.setCurrencyPref$lambda$52((Unit) obj);
            }
        }, SettingsException.ErrorHandler, continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long setCurrencyPref$lambda$48(int i, long j) {
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_set_currency_pref(j, FfiConverterInt.INSTANCE.lower(i).intValue());
    }

    public static final Unit setCurrencyPref$lambda$49(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit setCurrencyPref$lambda$50(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit setCurrencyPref$lambda$51(long j) {
        UniffiLib.INSTANCE.ffi_settings_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit setCurrencyPref$lambda$52(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object setFundUnit$suspendImpl(BoZ boZ, final java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(BoN.uniffiRustBuffer, ((java.lang.Number) boZ.callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bpk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BoZ.setFundUnit$lambda$53(str, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.Bpo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BoZ.setFundUnit$lambda$54(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.Bpq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BoZ.setFundUnit$lambda$55(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.Bps
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.setFundUnit$lambda$56(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.Bpr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.setFundUnit$lambda$57((Unit) obj);
            }
        }, SettingsException.ErrorHandler, continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long setFundUnit$lambda$53(java.lang.String str, long j) {
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_set_fund_unit(j, FfiConverterString.INSTANCE.lower2(str));
    }

    public static final Unit setFundUnit$lambda$54(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit setFundUnit$lambda$55(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit setFundUnit$lambda$56(long j) {
        UniffiLib.INSTANCE.ffi_settings_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit setFundUnit$lambda$57(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object setUserLanguage$suspendImpl(BoZ boZ, final C2777AYv c2777AYv, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(BoN.uniffiRustBuffer, ((java.lang.Number) boZ.callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bqf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BoZ.setUserLanguage$lambda$58(c2777AYv, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.Bqh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BoZ.setUserLanguage$lambda$59(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.Bqj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BoZ.setUserLanguage$lambda$60(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.Bqi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.setUserLanguage$lambda$61(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.Bqk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.setUserLanguage$lambda$62((Unit) obj);
            }
        }, SettingsException.ErrorHandler, continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long setUserLanguage$lambda$58(C2777AYv c2777AYv, long j) {
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_set_user_language(j, FfiConverterTypeLanguageUnit.INSTANCE.lower2((java.lang.Object) c2777AYv));
    }

    public static final Unit setUserLanguage$lambda$59(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit setUserLanguage$lambda$60(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_settings_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit setUserLanguage$lambda$61(long j) {
        UniffiLib.INSTANCE.ffi_settings_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit setUserLanguage$lambda$62(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4736Bpc
    public void EZpvd(@NotNull final BoL boL) {
        Intrinsics.checkNotNullParameter(boL, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bpl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.registerSettingsEventCallback$lambda$64(boL, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit registerSettingsEventCallback$lambda$64(final BoL boL, final long j) {
        C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.Bqe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BoZ.registerSettingsEventCallback$lambda$64$lambda$63(j, boL, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit registerSettingsEventCallback$lambda$64$lambda$63(long j, BoL boL, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_settings_fn_method_settingsserviceforeignhandling_register_settings_event_callback(j, FfiConverterTypeSettingsNotificationBridgingCallback.INSTANCE.lower2(boL).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
