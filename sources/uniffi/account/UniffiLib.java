package uniffi.account;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.BfS;
import o.BzK;
import o.C2576ARb;
import o.C4298Bav;
import o.C56392yDr;
import o.C60173zxj;
import o.InterfaceC56387yDm;
import o.InterfaceC60177zxn;
import org.jetbrains.annotations.NotNull;
import uniffi.ForeignBytes;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.account.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class UniffiLib {
    public static final int $stable;
    public static final InterfaceC56387yDm CLEANER$delegate;
    public static final UniffiLib INSTANCE;

    public final native void ffi_account_rust_future_cancel_f32(long j);

    public final native void ffi_account_rust_future_cancel_f64(long j);

    public final native void ffi_account_rust_future_cancel_i16(long j);

    public final native void ffi_account_rust_future_cancel_i32(long j);

    public final native void ffi_account_rust_future_cancel_i64(long j);

    public final native void ffi_account_rust_future_cancel_i8(long j);

    public final native void ffi_account_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_account_rust_future_cancel_u16(long j);

    public final native void ffi_account_rust_future_cancel_u32(long j);

    public final native void ffi_account_rust_future_cancel_u64(long j);

    public final native void ffi_account_rust_future_cancel_u8(long j);

    public final native void ffi_account_rust_future_cancel_void(long j);

    public final native float ffi_account_rust_future_complete_f32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_account_rust_future_complete_f64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_account_rust_future_complete_i16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_account_rust_future_complete_i32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_account_rust_future_complete_i64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_account_rust_future_complete_i8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_account_rust_future_complete_rust_buffer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_account_rust_future_complete_u16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_account_rust_future_complete_u32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_account_rust_future_complete_u64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_account_rust_future_complete_u8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_account_rust_future_complete_void(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_account_rust_future_free_f32(long j);

    public final native void ffi_account_rust_future_free_f64(long j);

    public final native void ffi_account_rust_future_free_i16(long j);

    public final native void ffi_account_rust_future_free_i32(long j);

    public final native void ffi_account_rust_future_free_i64(long j);

    public final native void ffi_account_rust_future_free_i8(long j);

    public final native void ffi_account_rust_future_free_rust_buffer(long j);

    public final native void ffi_account_rust_future_free_u16(long j);

    public final native void ffi_account_rust_future_free_u32(long j);

    public final native void ffi_account_rust_future_free_u64(long j);

    public final native void ffi_account_rust_future_free_u8(long j);

    public final native void ffi_account_rust_future_free_void(long j);

    public final native void ffi_account_rust_future_poll_f32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_account_rust_future_poll_f64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_account_rust_future_poll_i16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_account_rust_future_poll_i32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_account_rust_future_poll_i64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_account_rust_future_poll_i8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_account_rust_future_poll_rust_buffer(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_account_rust_future_poll_u16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_account_rust_future_poll_u32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_account_rust_future_poll_u64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_account_rust_future_poll_u8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_account_rust_future_poll_void(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_account_rustbuffer_alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_account_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_account_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_account_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_accountconnectjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_accountconnectjourneycallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_accountsinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_accountsstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_bleconnectioncallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_bledatacallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_bledevicediscoverycallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_changepasswordjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_changepasswordjourneyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_changepasswordjourneystepcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_confirmnewpasswordinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_createsubaccountinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_initsessioncallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_linkconfirmeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_linkconfirminteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_linklandingeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_linklandinginteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_linkresulteventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_linkresultinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_logineventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_logininteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_loginjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_loginjourneyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_loginjourneystepcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_loginpasskeyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_loginpasskeyinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_loginstate(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_loginstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_messagecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfajourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfajourneyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfajourneystatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfaotpeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfaotpinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfaotpstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfapasskeyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfapasskeyinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfapasskeystatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfapasswordeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfapasswordinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfapasswordstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfaservicetrait(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfaswitchmethodeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfaswitchmethodinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_mfaswitchmethodstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_nativeblepasskeyprovider(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_nativepasskeykeyprovider(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdevicecodeeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdevicecodeinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdevicecodestatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdeviceconfirmeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdeviceconfirminteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdeviceconfirmstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdeviceinfoeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdeviceinfointeractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdeviceinfostatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdevicejourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdevicejourneyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdevicejourneystepcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdevicemultipleotpeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdevicemultipleotpinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdevicemultipleotpstate(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdevicemultipleotpstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdevicesingleotpeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdevicesingleotpinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdevicesingleotpstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdeviceverifycallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_newdevicewsmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdevicemasterauthenticateinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdevicemasterauthenticatestatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdevicemasterconnectingeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdevicemasterconnectinginteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdevicemasterconnectingstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdevicemasterjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdevicemasterstepcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdevicesynceventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdevicesyncinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdevicesyncjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdevicesyncstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdevicesyncstepcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdeviceverifyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdeviceverifyinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdeviceverifyjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdeviceverifystatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeycrossdeviceverifystepcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeymanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeymanagerhandling(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeysynccallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeysyncinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeytracker(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeyupgradecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_okxpasskeyupgradeinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_otpeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_otpinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_otpstate(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_otpstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_passkeycorebinding(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_passkeyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_passkeylisteventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_passkeylistinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_passkeyliststatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_passkeyregisterjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_passkeyremovejourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_passkeyresetjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_passkeysdktrait(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_passkeystatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_passkeysupportcheckertrait(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_passkeysyncblemanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_passkeysynccallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_passkeyverifycallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_paypasskeylisteventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_paypasskeylistinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_paypasskeyliststatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_preferencelistinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_profilelisteventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_profilelistinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_profileliststatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registercoreventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registercorinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registercorstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registeremailinputeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registeremailinputinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registeremailinputstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registerjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registerotpeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registerotpinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registerotpstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registerpasswordeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registerpasswordinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registerpasswordstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registerphoneinputeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registerphoneinputinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registerphoneinputstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_registerstepchangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_securitylistinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_securityliststatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_setpasswordinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_subaccounteventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_subaccountstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_trusteddevicejourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_trusteddevicejourneystepcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_trusteddeviceotpeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_trusteddeviceotpinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_trusteddeviceriskinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_trusteddeviceverifycallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_trusteddevicewsmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_unlinkeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_unlinkinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_uploadideventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_uploadidjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_uploadidstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_usercentereventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_usercenterinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_clone_usercenterstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_accountconnectjourney_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_accountsinteractor_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_changepasswordjourney_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_confirmnewpasswordinteractor_create(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_createsubaccountinteractor_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_linkconfirminteractor_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_linklandinginteractor_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_linkresultinteractor_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_logininteractor_new(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_loginjourney_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_loginpasskeyinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_mfajourney_new(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_mfajourney_new_with_options(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_mfaotpinteractor_new(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_mfapasskeyinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_mfapasswordinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_mfaswitchmethodinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_newdevicecodeinteractor_new(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_newdeviceconfirminteractor_new(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_newdeviceinfointeractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_newdevicejourney_new(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_newdevicemultipleotpinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_newdevicesingleotpinteractor_new(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_newdevicewsmanager_shared(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_okxpasskeycrossdevicemasterauthenticateinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_okxpasskeycrossdevicemasterauthenticateinteractor_new_with_data(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_okxpasskeycrossdevicemasterconnectinginteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_okxpasskeycrossdevicemasterjourney_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_okxpasskeycrossdevicemasterjourney_new_with_scan_source(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_okxpasskeycrossdevicesyncinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_okxpasskeycrossdevicesyncjourney_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_okxpasskeycrossdeviceverifyinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_okxpasskeycrossdeviceverifyjourney_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_okxpasskeysyncinteractor_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_okxpasskeytracker_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_okxpasskeyupgradeinteractor_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_otpinteractor_new(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_passkeylistinteractor_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_passkeyregisterjourney_new(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_passkeyremovejourney_new(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_passkeyresetjourney_new(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_passkeysyncblemanager_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_paypasskeylistinteractor_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_preferencelistinteractor_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_profilelistinteractor_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_registercorinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_registeremailinputinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_registerjourney_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_registerotpinteractor_new(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_registerpasswordinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_registerphoneinputinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_securitylistinteractor_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_setpasswordinteractor_create(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_setpasswordinteractor_create_with_social_channel(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_trusteddevicejourney_new(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_trusteddeviceotpinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_trusteddeviceriskinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_trusteddevicewsmanager_shared(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_unlinkinteractor_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_uploadidjourney_new_for_mfa(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_constructor_usercenterinteractor_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_accountconnectjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_accountconnectjourneycallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_accountsinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_accountsstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_bleconnectioncallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_bledatacallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_bledevicediscoverycallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_changepasswordjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_changepasswordjourneyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_changepasswordjourneystepcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_confirmnewpasswordinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_createsubaccountinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_initsessioncallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_linkconfirmeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_linkconfirminteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_linklandingeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_linklandinginteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_linkresulteventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_linkresultinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_logineventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_logininteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_loginjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_loginjourneyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_loginjourneystepcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_loginpasskeyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_loginpasskeyinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_loginstate(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_loginstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_messagecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfajourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfajourneyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfajourneystatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfaotpeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfaotpinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfaotpstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfapasskeyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfapasskeyinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfapasskeystatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfapasswordeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfapasswordinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfapasswordstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfaservicetrait(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfaswitchmethodeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfaswitchmethodinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_mfaswitchmethodstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_nativeblepasskeyprovider(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_nativepasskeykeyprovider(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdevicecodeeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdevicecodeinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdevicecodestatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdeviceconfirmeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdeviceconfirminteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdeviceconfirmstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdeviceinfoeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdeviceinfointeractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdeviceinfostatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdevicejourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdevicejourneyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdevicejourneystepcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdevicemultipleotpeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdevicemultipleotpinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdevicemultipleotpstate(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdevicemultipleotpstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdevicesingleotpeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdevicesingleotpinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdevicesingleotpstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdeviceverifycallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_newdevicewsmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdevicemasterauthenticateinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdevicemasterauthenticatestatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdevicemasterconnectingeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdevicemasterconnectinginteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdevicemasterconnectingstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdevicemasterjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdevicemasterstepcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdevicesynceventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdevicesyncinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdevicesyncjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdevicesyncstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdevicesyncstepcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdeviceverifyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdeviceverifyinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdeviceverifyjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdeviceverifystatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeycrossdeviceverifystepcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeymanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeymanagerhandling(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeysynccallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeysyncinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeytracker(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeyupgradecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_okxpasskeyupgradeinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_otpeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_otpinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_otpstate(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_otpstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_passkeycorebinding(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_passkeyeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_passkeylisteventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_passkeylistinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_passkeyliststatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_passkeyregisterjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_passkeyremovejourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_passkeyresetjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_passkeysdktrait(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_passkeystatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_passkeysupportcheckertrait(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_passkeysyncblemanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_passkeysynccallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_passkeyverifycallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_paypasskeylisteventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_paypasskeylistinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_paypasskeyliststatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_preferencelistinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_profilelisteventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_profilelistinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_profileliststatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registercoreventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registercorinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registercorstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registeremailinputeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registeremailinputinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registeremailinputstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registerjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registerotpeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registerotpinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registerotpstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registerpasswordeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registerpasswordinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registerpasswordstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registerphoneinputeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registerphoneinputinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registerphoneinputstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_registerstepchangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_securitylistinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_securityliststatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_setpasswordinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_subaccounteventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_subaccountstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_trusteddevicejourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_trusteddevicejourneystepcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_trusteddeviceotpeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_trusteddeviceotpinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_trusteddeviceriskinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_trusteddeviceverifycallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_trusteddevicewsmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_unlinkeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_unlinkinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_uploadideventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_uploadidjourney(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_uploadidstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_usercentereventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_usercenterinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_free_usercenterstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_func_ble_passkey_data_characteristic_uuid(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_func_ble_passkey_data_confirm_characteristic_uuid(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int uniffi_account_fn_func_ble_passkey_default_mtu(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_func_color_theme_from_string(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_func_get_okx_passkey_manager(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_func_register_mfa_service(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_func_register_native_ble_passkey_provider(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_func_register_native_passkey_key_provider(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_func_register_passkey_core_binding(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_func_register_passkey_sdk(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_func_register_passkey_support_checker(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_init_callback_vtable_accountconnectjourneycallback(@NotNull UniffiVTableCallbackInterfaceAccountConnectJourneyCallback uniffiVTableCallbackInterfaceAccountConnectJourneyCallback);

    public final native void uniffi_account_fn_init_callback_vtable_accountsstatecallback(@NotNull UniffiVTableCallbackInterfaceAccountsStateCallback uniffiVTableCallbackInterfaceAccountsStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_bleconnectioncallback(@NotNull UniffiVTableCallbackInterfaceBleConnectionCallback uniffiVTableCallbackInterfaceBleConnectionCallback);

    public final native void uniffi_account_fn_init_callback_vtable_bledatacallback(@NotNull UniffiVTableCallbackInterfaceBleDataCallback uniffiVTableCallbackInterfaceBleDataCallback);

    public final native void uniffi_account_fn_init_callback_vtable_bledevicediscoverycallback(@NotNull UniffiVTableCallbackInterfaceBleDeviceDiscoveryCallback uniffiVTableCallbackInterfaceBleDeviceDiscoveryCallback);

    public final native void uniffi_account_fn_init_callback_vtable_changepasswordjourneyeventcallback(@NotNull UniffiVTableCallbackInterfaceChangePasswordJourneyEventCallback uniffiVTableCallbackInterfaceChangePasswordJourneyEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_changepasswordjourneystepcallback(@NotNull UniffiVTableCallbackInterfaceChangePasswordJourneyStepCallback uniffiVTableCallbackInterfaceChangePasswordJourneyStepCallback);

    public final native void uniffi_account_fn_init_callback_vtable_initsessioncallback(@NotNull UniffiVTableCallbackInterfaceInitSessionCallback uniffiVTableCallbackInterfaceInitSessionCallback);

    public final native void uniffi_account_fn_init_callback_vtable_linkconfirmeventcallback(@NotNull UniffiVTableCallbackInterfaceLinkConfirmEventCallback uniffiVTableCallbackInterfaceLinkConfirmEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_linklandingeventcallback(@NotNull UniffiVTableCallbackInterfaceLinkLandingEventCallback uniffiVTableCallbackInterfaceLinkLandingEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_linkresulteventcallback(@NotNull UniffiVTableCallbackInterfaceLinkResultEventCallback uniffiVTableCallbackInterfaceLinkResultEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_logineventcallback(@NotNull UniffiVTableCallbackInterfaceLoginEventCallback uniffiVTableCallbackInterfaceLoginEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_loginjourneyeventcallback(@NotNull UniffiVTableCallbackInterfaceLoginJourneyEventCallback uniffiVTableCallbackInterfaceLoginJourneyEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_loginjourneystepcallback(@NotNull UniffiVTableCallbackInterfaceLoginJourneyStepCallback uniffiVTableCallbackInterfaceLoginJourneyStepCallback);

    public final native void uniffi_account_fn_init_callback_vtable_loginpasskeyeventcallback(@NotNull UniffiVTableCallbackInterfaceLoginPasskeyEventCallback uniffiVTableCallbackInterfaceLoginPasskeyEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_loginstatecallback(@NotNull UniffiVTableCallbackInterfaceLoginStateCallback uniffiVTableCallbackInterfaceLoginStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_messagecallback(@NotNull UniffiVTableCallbackInterfaceMessageCallback uniffiVTableCallbackInterfaceMessageCallback);

    public final native void uniffi_account_fn_init_callback_vtable_mfajourneyeventcallback(@NotNull UniffiVTableCallbackInterfaceMfaJourneyEventCallback uniffiVTableCallbackInterfaceMfaJourneyEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_mfajourneystatecallback(@NotNull UniffiVTableCallbackInterfaceMfaJourneyStateCallback uniffiVTableCallbackInterfaceMfaJourneyStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_mfaotpeventcallback(@NotNull UniffiVTableCallbackInterfaceMfaOtpEventCallback uniffiVTableCallbackInterfaceMfaOtpEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_mfaotpstatecallback(@NotNull UniffiVTableCallbackInterfaceMfaOtpStateCallback uniffiVTableCallbackInterfaceMfaOtpStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_mfapasskeyeventcallback(@NotNull UniffiVTableCallbackInterfaceMfaPasskeyEventCallback uniffiVTableCallbackInterfaceMfaPasskeyEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_mfapasskeystatecallback(@NotNull UniffiVTableCallbackInterfaceMfaPasskeyStateCallback uniffiVTableCallbackInterfaceMfaPasskeyStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_mfapasswordeventcallback(@NotNull UniffiVTableCallbackInterfaceMfaPasswordEventCallback uniffiVTableCallbackInterfaceMfaPasswordEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_mfapasswordstatecallback(@NotNull UniffiVTableCallbackInterfaceMfaPasswordStateCallback uniffiVTableCallbackInterfaceMfaPasswordStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_mfaservicetrait(@NotNull UniffiVTableCallbackInterfaceMfaServiceTrait uniffiVTableCallbackInterfaceMfaServiceTrait);

    public final native void uniffi_account_fn_init_callback_vtable_mfaswitchmethodeventcallback(@NotNull UniffiVTableCallbackInterfaceMfaSwitchMethodEventCallback uniffiVTableCallbackInterfaceMfaSwitchMethodEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_mfaswitchmethodstatecallback(@NotNull UniffiVTableCallbackInterfaceMfaSwitchMethodStateCallback uniffiVTableCallbackInterfaceMfaSwitchMethodStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_nativeblepasskeyprovider(@NotNull UniffiVTableCallbackInterfaceNativeBlePasskeyProvider uniffiVTableCallbackInterfaceNativeBlePasskeyProvider);

    public final native void uniffi_account_fn_init_callback_vtable_nativepasskeykeyprovider(@NotNull UniffiVTableCallbackInterfaceNativePasskeyKeyProvider uniffiVTableCallbackInterfaceNativePasskeyKeyProvider);

    public final native void uniffi_account_fn_init_callback_vtable_newdevicecodeeventcallback(@NotNull UniffiVTableCallbackInterfaceNewDeviceCodeEventCallback uniffiVTableCallbackInterfaceNewDeviceCodeEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_newdevicecodestatecallback(@NotNull UniffiVTableCallbackInterfaceNewDeviceCodeStateCallback uniffiVTableCallbackInterfaceNewDeviceCodeStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_newdeviceconfirmeventcallback(@NotNull UniffiVTableCallbackInterfaceNewDeviceConfirmEventCallback uniffiVTableCallbackInterfaceNewDeviceConfirmEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_newdeviceconfirmstatecallback(@NotNull UniffiVTableCallbackInterfaceNewDeviceConfirmStateCallback uniffiVTableCallbackInterfaceNewDeviceConfirmStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_newdeviceinfoeventcallback(@NotNull UniffiVTableCallbackInterfaceNewDeviceInfoEventCallback uniffiVTableCallbackInterfaceNewDeviceInfoEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_newdeviceinfostatecallback(@NotNull UniffiVTableCallbackInterfaceNewDeviceInfoStateCallback uniffiVTableCallbackInterfaceNewDeviceInfoStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_newdevicejourneyeventcallback(@NotNull UniffiVTableCallbackInterfaceNewDeviceJourneyEventCallback uniffiVTableCallbackInterfaceNewDeviceJourneyEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_newdevicejourneystepcallback(@NotNull UniffiVTableCallbackInterfaceNewDeviceJourneyStepCallback uniffiVTableCallbackInterfaceNewDeviceJourneyStepCallback);

    public final native void uniffi_account_fn_init_callback_vtable_newdevicemultipleotpeventcallback(@NotNull UniffiVTableCallbackInterfaceNewDeviceMultipleOtpEventCallback uniffiVTableCallbackInterfaceNewDeviceMultipleOtpEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_newdevicemultipleotpstatecallback(@NotNull UniffiVTableCallbackInterfaceNewDeviceMultipleOtpStateCallback uniffiVTableCallbackInterfaceNewDeviceMultipleOtpStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_newdevicesingleotpeventcallback(@NotNull UniffiVTableCallbackInterfaceNewDeviceSingleOtpEventCallback uniffiVTableCallbackInterfaceNewDeviceSingleOtpEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_newdevicesingleotpstatecallback(@NotNull UniffiVTableCallbackInterfaceNewDeviceSingleOtpStateCallback uniffiVTableCallbackInterfaceNewDeviceSingleOtpStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_newdeviceverifycallback(@NotNull UniffiVTableCallbackInterfaceNewDeviceVerifyCallback uniffiVTableCallbackInterfaceNewDeviceVerifyCallback);

    public final native void uniffi_account_fn_init_callback_vtable_okxpasskeycrossdevicemasterauthenticatestatecallback(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_okxpasskeycrossdevicemasterconnectingeventcallback(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterConnectingEventCallback uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterConnectingEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_okxpasskeycrossdevicemasterconnectingstatecallback(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterConnectingStateCallback uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterConnectingStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_okxpasskeycrossdevicemasterstepcallback(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback);

    public final native void uniffi_account_fn_init_callback_vtable_okxpasskeycrossdevicesynceventcallback(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncEventCallback uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_okxpasskeycrossdevicesyncstatecallback(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_okxpasskeycrossdevicesyncstepcallback(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStepCallback uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStepCallback);

    public final native void uniffi_account_fn_init_callback_vtable_okxpasskeycrossdeviceverifyeventcallback(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceVerifyEventCallback uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceVerifyEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_okxpasskeycrossdeviceverifystatecallback(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceVerifyStateCallback uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceVerifyStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_okxpasskeycrossdeviceverifystepcallback(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceVerifyStepCallback uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceVerifyStepCallback);

    public final native void uniffi_account_fn_init_callback_vtable_okxpasskeymanagerhandling(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyManagerHandling uniffiVTableCallbackInterfaceOkxPasskeyManagerHandling);

    public final native void uniffi_account_fn_init_callback_vtable_okxpasskeysynccallback(@NotNull UniffiVTableCallbackInterfaceOkxPasskeySyncCallback uniffiVTableCallbackInterfaceOkxPasskeySyncCallback);

    public final native void uniffi_account_fn_init_callback_vtable_okxpasskeyupgradecallback(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback uniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback);

    public final native void uniffi_account_fn_init_callback_vtable_otpeventcallback(@NotNull UniffiVTableCallbackInterfaceOtpEventCallback uniffiVTableCallbackInterfaceOtpEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_otpstatecallback(@NotNull UniffiVTableCallbackInterfaceOtpStateCallback uniffiVTableCallbackInterfaceOtpStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_passkeycorebinding(@NotNull UniffiVTableCallbackInterfacePasskeyCoreBinding uniffiVTableCallbackInterfacePasskeyCoreBinding);

    public final native void uniffi_account_fn_init_callback_vtable_passkeyeventcallback(@NotNull UniffiVTableCallbackInterfacePasskeyEventCallback uniffiVTableCallbackInterfacePasskeyEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_passkeylisteventcallback(@NotNull UniffiVTableCallbackInterfacePasskeyListEventCallback uniffiVTableCallbackInterfacePasskeyListEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_passkeyliststatecallback(@NotNull UniffiVTableCallbackInterfacePasskeyListStateCallback uniffiVTableCallbackInterfacePasskeyListStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_passkeysdktrait(@NotNull UniffiVTableCallbackInterfacePasskeySdkTrait uniffiVTableCallbackInterfacePasskeySdkTrait);

    public final native void uniffi_account_fn_init_callback_vtable_passkeystatecallback(@NotNull UniffiVTableCallbackInterfacePasskeyStateCallback uniffiVTableCallbackInterfacePasskeyStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_passkeysupportcheckertrait(@NotNull UniffiVTableCallbackInterfacePasskeySupportCheckerTrait uniffiVTableCallbackInterfacePasskeySupportCheckerTrait);

    public final native void uniffi_account_fn_init_callback_vtable_passkeysynccallback(@NotNull UniffiVTableCallbackInterfacePasskeySyncCallback uniffiVTableCallbackInterfacePasskeySyncCallback);

    public final native void uniffi_account_fn_init_callback_vtable_passkeyverifycallback(@NotNull UniffiVTableCallbackInterfacePasskeyVerifyCallback uniffiVTableCallbackInterfacePasskeyVerifyCallback);

    public final native void uniffi_account_fn_init_callback_vtable_paypasskeylisteventcallback(@NotNull UniffiVTableCallbackInterfacePayPasskeyListEventCallback uniffiVTableCallbackInterfacePayPasskeyListEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_paypasskeyliststatecallback(@NotNull UniffiVTableCallbackInterfacePayPasskeyListStateCallback uniffiVTableCallbackInterfacePayPasskeyListStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_profilelisteventcallback(@NotNull UniffiVTableCallbackInterfaceProfileListEventCallback uniffiVTableCallbackInterfaceProfileListEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_profileliststatechangecallback(@NotNull UniffiVTableCallbackInterfaceProfileListStateChangeCallback uniffiVTableCallbackInterfaceProfileListStateChangeCallback);

    public final native void uniffi_account_fn_init_callback_vtable_registercoreventcallback(@NotNull UniffiVTableCallbackInterfaceRegisterCorEventCallback uniffiVTableCallbackInterfaceRegisterCorEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_registercorstatechangecallback(@NotNull UniffiVTableCallbackInterfaceRegisterCorStateChangeCallback uniffiVTableCallbackInterfaceRegisterCorStateChangeCallback);

    public final native void uniffi_account_fn_init_callback_vtable_registeremailinputeventcallback(@NotNull UniffiVTableCallbackInterfaceRegisterEmailInputEventCallback uniffiVTableCallbackInterfaceRegisterEmailInputEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_registeremailinputstatechangecallback(@NotNull UniffiVTableCallbackInterfaceRegisterEmailInputStateChangeCallback uniffiVTableCallbackInterfaceRegisterEmailInputStateChangeCallback);

    public final native void uniffi_account_fn_init_callback_vtable_registerotpeventcallback(@NotNull UniffiVTableCallbackInterfaceRegisterOtpEventCallback uniffiVTableCallbackInterfaceRegisterOtpEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_registerotpstatechangecallback(@NotNull UniffiVTableCallbackInterfaceRegisterOtpStateChangeCallback uniffiVTableCallbackInterfaceRegisterOtpStateChangeCallback);

    public final native void uniffi_account_fn_init_callback_vtable_registerpasswordeventcallback(@NotNull UniffiVTableCallbackInterfaceRegisterPasswordEventCallback uniffiVTableCallbackInterfaceRegisterPasswordEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_registerpasswordstatechangecallback(@NotNull UniffiVTableCallbackInterfaceRegisterPasswordStateChangeCallback uniffiVTableCallbackInterfaceRegisterPasswordStateChangeCallback);

    public final native void uniffi_account_fn_init_callback_vtable_registerphoneinputeventcallback(@NotNull UniffiVTableCallbackInterfaceRegisterPhoneInputEventCallback uniffiVTableCallbackInterfaceRegisterPhoneInputEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_registerphoneinputstatechangecallback(@NotNull UniffiVTableCallbackInterfaceRegisterPhoneInputStateChangeCallback uniffiVTableCallbackInterfaceRegisterPhoneInputStateChangeCallback);

    public final native void uniffi_account_fn_init_callback_vtable_registerstepchangecallback(@NotNull UniffiVTableCallbackInterfaceRegisterStepChangeCallback uniffiVTableCallbackInterfaceRegisterStepChangeCallback);

    public final native void uniffi_account_fn_init_callback_vtable_securityliststatechangecallback(@NotNull UniffiVTableCallbackInterfaceSecurityListStateChangeCallback uniffiVTableCallbackInterfaceSecurityListStateChangeCallback);

    public final native void uniffi_account_fn_init_callback_vtable_subaccounteventcallback(@NotNull UniffiVTableCallbackInterfaceSubAccountEventCallback uniffiVTableCallbackInterfaceSubAccountEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_subaccountstatechangecallback(@NotNull UniffiVTableCallbackInterfaceSubAccountStateChangeCallback uniffiVTableCallbackInterfaceSubAccountStateChangeCallback);

    public final native void uniffi_account_fn_init_callback_vtable_trusteddevicejourneystepcallback(@NotNull UniffiVTableCallbackInterfaceTrustedDeviceJourneyStepCallback uniffiVTableCallbackInterfaceTrustedDeviceJourneyStepCallback);

    public final native void uniffi_account_fn_init_callback_vtable_trusteddeviceotpeventcallback(@NotNull UniffiVTableCallbackInterfaceTrustedDeviceOtpEventCallback uniffiVTableCallbackInterfaceTrustedDeviceOtpEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_trusteddeviceverifycallback(@NotNull UniffiVTableCallbackInterfaceTrustedDeviceVerifyCallback uniffiVTableCallbackInterfaceTrustedDeviceVerifyCallback);

    public final native void uniffi_account_fn_init_callback_vtable_unlinkeventcallback(@NotNull UniffiVTableCallbackInterfaceUnlinkEventCallback uniffiVTableCallbackInterfaceUnlinkEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_uploadideventcallback(@NotNull UniffiVTableCallbackInterfaceUploadIdEventCallback uniffiVTableCallbackInterfaceUploadIdEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_uploadidstatecallback(@NotNull UniffiVTableCallbackInterfaceUploadIdStateCallback uniffiVTableCallbackInterfaceUploadIdStateCallback);

    public final native void uniffi_account_fn_init_callback_vtable_usercentereventcallback(@NotNull UniffiVTableCallbackInterfaceUserCenterEventCallback uniffiVTableCallbackInterfaceUserCenterEventCallback);

    public final native void uniffi_account_fn_init_callback_vtable_usercenterstatechangecallback(@NotNull UniffiVTableCallbackInterfaceUserCenterStateChangeCallback uniffiVTableCallbackInterfaceUserCenterStateChangeCallback);

    public final native void uniffi_account_fn_method_accountconnectjourney_clear_binding_token(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountconnectjourney_finish(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_accountconnectjourney_get_binding_token(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_accountconnectjourney_get_current_step(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_accountconnectjourney_get_current_user_login_name(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_accountconnectjourney_get_source(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_accountconnectjourney_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_accountconnectjourney_has_bound_account(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_accountconnectjourney_is_link_flow(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountconnectjourney_navigate_to_force_bound_confirm(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountconnectjourney_navigate_to_link_confirm(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountconnectjourney_navigate_to_link_result_failure(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountconnectjourney_navigate_to_link_result_success(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountconnectjourney_navigate_to_unlink_confirm_with_account(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountconnectjourney_navigate_to_unlink_manage(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountconnectjourney_open_external_link(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountconnectjourney_refresh_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountconnectjourney_restart_link_flow(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountconnectjourney_set_binding_token(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountconnectjourney_set_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountconnectjourney_set_source(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountconnectjourney_start(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_accountconnectjourney_supports_cross_site_binding(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountconnectjourneycallback_on_journey_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountsinteractor_init(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountsinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_accountsstate_uniffi_trait_debug(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_accountsstatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_bleconnectioncallback_on_connection_state_changed(long j, byte b, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_bledatacallback_on_confirmation_received(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_bledatacallback_on_data_received(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_bledevicediscoverycallback_on_device_found(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_changepasswordjourney_get_session_id(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_changepasswordjourney_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_changepasswordjourney_on_confirmation_confirmed(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_changepasswordjourney_on_mfa_completed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_changepasswordjourney_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_changepasswordjourney_set_step_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_changepasswordjourney_start_journey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_changepasswordjourney_update_session_id(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_changepasswordjourneyeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_changepasswordjourneystepcallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_confirmnewpasswordinteractor_set_state_observer(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_confirmnewpasswordinteractor_start(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_confirmnewpasswordinteractor_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_confirmnewpasswordinteractor_stop(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_confirmnewpasswordinteractor_submit_new_password(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_createsubaccountinteractor_check_name_existence(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_createsubaccountinteractor_create_sub_account(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_createsubaccountinteractor_get_business(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_createsubaccountinteractor_get_session_id(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_createsubaccountinteractor_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_createsubaccountinteractor_initiate(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_createsubaccountinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_createsubaccountinteractor_set_session_id(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_createsubaccountinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_createsubaccountinteractor_update_account_type(long j, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_createsubaccountinteractor_update_enable_deposits(long j, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_createsubaccountinteractor_update_sub_account_name(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_deviceverifyinfo_uniffi_trait_debug(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_initsessioncallback_on_error(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_initsessioncallback_on_success(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_linkconfirmeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_linkconfirminteractor_cancel_link_confirm(long j, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_linkconfirminteractor_confirm_link(long j, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_linkconfirminteractor_get_binding_info(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_linkconfirminteractor_get_binding_token(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_linkconfirminteractor_get_journey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_linkconfirminteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_linkconfirminteractor_set_journey(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_linklandingeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_linklandinginteractor_get_journey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_linklandinginteractor_get_universal_link(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_linklandinginteractor_initiate_binding(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_linklandinginteractor_open_link_confirm_in_target_app(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_linklandinginteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_linklandinginteractor_set_journey(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_linkresulteventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_linkresultinteractor_complete_binding(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_linkresultinteractor_get_journey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_linkresultinteractor_get_okx_account_name(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_linkresultinteractor_get_okx_tr_account_name(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_linkresultinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_linkresultinteractor_set_journey(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_logineventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_logininteractor_check_username(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_logininteractor_finish_login_with_passkey(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_logininteractor_init(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_logininteractor_reset_password(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_logininteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_logininteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_logininteractor_start_login_with_passkey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_logininteractor_submit(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_logininteractor_update_current_username(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_logininteractor_update_password(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_logininteractor_update_restriction(long j, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_loginjourney_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_loginjourney_set_step_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_loginjourney_start_journey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_loginjourneyeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_loginjourneystepcallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_loginpasskeyeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_loginpasskeyinteractor_finish_login_with_passkey(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_loginpasskeyinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_loginpasskeyinteractor_start_login_with_passkey(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_loginstate_email_suggestions(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_loginstate_is_forget_password_button_visible(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_loginstate_is_login_button_enabled(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_loginstate_is_next_button_enabled(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_loginstate_is_password_input_visible(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_loginstate_is_social_apple_available(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_loginstate_is_social_google_available(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_loginstate_is_social_telegram_available(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_loginstate_is_username_valid(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_loginstate_saved_usernames(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_loginstate_uniffi_trait_debug(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_loginstatecallback_on_changed(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_messagecallback_on_received(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfajourney_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_mfajourney_get_session_id(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_mfajourney_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfajourney_handle_face_maxout_support(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_mfajourney_is_complete(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_mfajourney_requires_sub_journey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfajourney_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfajourney_set_passkey_enabled(long j, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfajourney_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfajourney_set_total_countdown_time(long j, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfajourney_start_mfa(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfajourney_start_timer(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfajourney_switch_step(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfajourney_switch_to_step(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfajourney_tick_timer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfajourney_update_from_sub_journey(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, int i, int i2, @NotNull RustBuffer.ByValue byValue3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfajourneyeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfajourneystatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfaotpeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_mfaotpinteractor_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfaotpinteractor_send_code(long j, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfaotpinteractor_set_auth_type(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfaotpinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfaotpinteractor_set_remaining_time(long j, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfaotpinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfaotpinteractor_verify_otp(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfaotpstatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfapasskeyeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfapasskeyinteractor_finish_passkey(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfapasskeyinteractor_finish_passkey_cross_device(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_mfapasskeyinteractor_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfapasskeyinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfapasskeyinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfapasskeyinteractor_start_passkey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfapasskeystatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfapasswordeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_mfapasswordinteractor_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfapasswordinteractor_register_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfapasswordinteractor_register_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfapasswordinteractor_verify_password(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfapasswordstatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_method_mfaservicetrait_verify_mfa(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, byte b);

    public final native void uniffi_account_fn_method_mfaswitchmethodeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_mfaswitchmethodinteractor_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfaswitchmethodinteractor_refresh_available_methods(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfaswitchmethodinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfaswitchmethodinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfaswitchmethodinteractor_switch_to_method(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_mfaswitchmethodstatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativeblepasskeyprovider_cleanup(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativeblepasskeyprovider_connect_to_device(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativeblepasskeyprovider_disconnect(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int uniffi_account_fn_method_nativeblepasskeyprovider_get_current_mtu(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_nativeblepasskeyprovider_get_service_uuid(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_nativeblepasskeyprovider_is_advertising(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_nativeblepasskeyprovider_is_bluetooth_enabled(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_nativeblepasskeyprovider_is_connected(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_nativeblepasskeyprovider_is_peripheral_supported(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_nativeblepasskeyprovider_is_scanning(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativeblepasskeyprovider_send_confirmation(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativeblepasskeyprovider_send_data(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativeblepasskeyprovider_set_connection_callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativeblepasskeyprovider_set_data_callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativeblepasskeyprovider_set_device_discovery_callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativeblepasskeyprovider_set_service_uuid(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativeblepasskeyprovider_start_advertising(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativeblepasskeyprovider_start_scanning(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativeblepasskeyprovider_stop_advertising(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativeblepasskeyprovider_stop_scanning(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativepasskeykeyprovider_check_device_passcode(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_method_nativepasskeykeyprovider_decrypt_with_protection_key(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3);

    public final native long uniffi_account_fn_method_nativepasskeykeyprovider_get_protection_public_key(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2);

    public final native byte uniffi_account_fn_method_nativepasskeykeyprovider_has_encrypted_passkey(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_method_nativepasskeykeyprovider_is_protection_key_available(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2);

    public final native RustBuffer.ByValue uniffi_account_fn_method_nativepasskeykeyprovider_load_encrypted_passkey(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_nativepasskeykeyprovider_load_encrypted_passkey_by_credential_id(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativepasskeykeyprovider_remove_encrypted_passkey(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativepasskeykeyprovider_remove_protection_key(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativepasskeykeyprovider_show_device_passcode_for_lockout(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_nativepasskeykeyprovider_store_encrypted_passkey(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_method_nativepasskeykeyprovider_verify_user_presence(long j);

    public final native void uniffi_account_fn_method_newdevicecodeeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicecodeinteractor_done(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicecodeinteractor_init(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicecodeinteractor_resend(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicecodeinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicecodeinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_newdevicecodestate_uniffi_trait_debug(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicecodestatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceconfirmeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceconfirminteractor_confirm(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceconfirminteractor_init(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceconfirminteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceconfirminteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceconfirminteractor_switch_to_other_method(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_newdeviceconfirmstate_uniffi_trait_debug(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceconfirmstatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceinfoeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceinfointeractor_approve(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceinfointeractor_back(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceinfointeractor_dismiss(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceinfointeractor_init(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceinfointeractor_reject(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceinfointeractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceinfointeractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_newdeviceinfostate_uniffi_trait_debug(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceinfostatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicejourney_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicejourney_set_step_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicejourney_start_journey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicejourneyeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_newdevicejourneystate_uniffi_trait_debug(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicejourneystepcallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicemultipleotpeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicemultipleotpinteractor_init(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicemultipleotpinteractor_send_email_otp(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicemultipleotpinteractor_send_phone_otp(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicemultipleotpinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicemultipleotpinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicemultipleotpinteractor_submit(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_newdevicemultipleotpstate_uniffi_trait_debug(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicemultipleotpstatecallback_on_changed(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicesingleotpeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicesingleotpinteractor_init(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicesingleotpinteractor_resend_otp(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicesingleotpinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicesingleotpinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicesingleotpinteractor_submit(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicesingleotpinteractor_switch_to_email(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicesingleotpinteractor_switch_to_google_authenticator(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicesingleotpinteractor_switch_to_sms(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicesingleotpinteractor_switch_to_voice(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_newdevicesingleotpstate_uniffi_trait_debug(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicesingleotpstatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdeviceverifycallback_on_received(long j, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicewsmanager_connect(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicewsmanager_disconnect(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_newdevicewsmanager_is_connected(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_newdevicewsmanager_set_device_verify_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterauthenticateinteractor_approve(long j, byte b, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_okxpasskeycrossdevicemasterauthenticateinteractor_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterauthenticateinteractor_reject(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterauthenticateinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterauthenticateinteractor_start_ble_advertising(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterauthenticateinteractor_start_countdown(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterauthenticateinteractor_stop_ble(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterauthenticatestatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectingeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectinginteractor_cancel_timeout(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectinginteractor_get_ble_manager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectinginteractor_get_credential_info(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectinginteractor_get_device_info(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectinginteractor_get_protection_public_key(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectinginteractor_get_session_id(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectinginteractor_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectinginteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectinginteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectinginteractor_start_ble_flow(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectinginteractor_start_connection(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectinginteractor_start_timeout(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectinginteractor_start_web_flow(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectinginteractor_stop_ble(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterconnectingstatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterjourney_dismiss(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_okxpasskeycrossdevicemasterjourney_get_ble_service_uuid(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_okxpasskeycrossdevicemasterjourney_get_current_step(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_okxpasskeycrossdevicemasterjourney_get_scan_source(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_okxpasskeycrossdevicemasterjourney_is_web_scan(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterjourney_navigate_to_step(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterjourney_set_scan_source(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterjourney_set_step_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterjourney_start_journey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicemasterstepcallback_on_step_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicesynceventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicesyncinteractor_complete_sync_with_device(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_okxpasskeycrossdevicesyncinteractor_get_business(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_okxpasskeycrossdevicesyncinteractor_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicesyncinteractor_initiate(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicesyncinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicesyncinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicesyncjourney_dismiss(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_okxpasskeycrossdevicesyncjourney_get_current_step(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicesyncjourney_navigate_to_step(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicesyncjourney_set_step_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicesyncstatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdevicesyncstepcallback_on_step_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdeviceverifyeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_okxpasskeycrossdeviceverifyinteractor_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdeviceverifyinteractor_on_ws_approval_received(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdeviceverifyinteractor_send_protection_key(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdeviceverifyinteractor_send_session_id(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdeviceverifyinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdeviceverifyinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdeviceverifyinteractor_start_auth_flow(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, byte b, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdeviceverifyinteractor_start_qr_code_flow(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdeviceverifyinteractor_start_sync_flow(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdeviceverifyinteractor_stop_ble(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_okxpasskeycrossdeviceverifyjourney_build_qr_code_deeplink(long j, @NotNull RustBuffer.ByValue byValue, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdeviceverifyjourney_dismiss(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_okxpasskeycrossdeviceverifyjourney_get_current_step(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdeviceverifyjourney_navigate_to_step(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdeviceverifyjourney_set_step_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdeviceverifystatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeycrossdeviceverifystepcallback_on_step_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_method_okxpasskeymanager_create_credential(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6, @NotNull RustBuffer.ByValue byValue7, byte b);

    public final native long uniffi_account_fn_method_okxpasskeymanager_get_assertion(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6);

    public final native byte uniffi_account_fn_method_okxpasskeymanager_is_device_support_biometric(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_method_okxpasskeymanagerhandling_create_credential(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6, @NotNull RustBuffer.ByValue byValue7, byte b);

    public final native long uniffi_account_fn_method_okxpasskeymanagerhandling_get_assertion(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6);

    public final native byte uniffi_account_fn_method_okxpasskeymanagerhandling_is_device_support_biometric(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeysynccallback_on_failure(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeysynccallback_on_success(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeysyncinteractor_confirm_sync(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_bluetooth_connect_bottomsheet_view(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_cross_authorization_bottomsheet_click(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_cross_authorization_bottomsheet_view(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_cross_authorization_success_api_view(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_lost_reinstall_remind_bottomsheet_click(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_lost_reinstall_remind_bottomsheet_view(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_never_exist_remind_bottomsheet_view(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_on_device_app_start_api_view(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_on_device_app_success_api_view(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_promotion_fullpage_click(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_promotion_fullpage_view(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_promotion_security_center_banner_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_promotion_security_center_banner_view(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_qrcode_bottomsheet_view(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_step_one_fullpage_click(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_step_one_fullpage_view(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_upgrade_fido1_success_api_view(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_upgrade_multiple_fido1_bottomsheet_view(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_wait_approve_app_success_api_view(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_wait_approve_bottomsheet_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeytracker_track_wait_approve_bottomsheet_view(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeyupgradecallback_on_failure(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeyupgradecallback_on_success(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_okxpasskeyupgradeinteractor_finish_upgrade(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6, @NotNull RustBuffer.ByValue byValue7, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_otpeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_otpinteractor_init(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_otpinteractor_resend_otp(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_otpinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_otpinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_otpinteractor_submit(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_otpinteractor_switch_to_email(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_otpinteractor_switch_to_google_authenticator(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_otpinteractor_switch_to_sms(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_otpinteractor_switch_to_voice(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_otpstate_is_resend_button_visible(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_otpstate_masked_username(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_otpstate_uniffi_trait_debug(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_otpstatecallback_on_changed(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_method_passkeycorebinding_is_passkey_entry_enable_in_security_center(long j, byte b);

    public final native void uniffi_account_fn_method_passkeyeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeylisteventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_passkeylistinteractor_can_unlink(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeylistinteractor_check_should_show_reset(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int uniffi_account_fn_method_passkeylistinteractor_get_count(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_passkeylistinteractor_get_item(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_passkeylistinteractor_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeylistinteractor_on_add_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeylistinteractor_on_item_click(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeylistinteractor_refresh_data(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeylistinteractor_refresh_list(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeylistinteractor_rename_passkey(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeylistinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeylistinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_passkeylistinteractor_should_show_reset(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeylistinteractor_toggle_mfa_initiate(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeylistinteractor_toggle_switch(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyliststatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyregisterjourney_continue_with_step(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_passkeyregisterjourney_get_scenario(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_passkeyregisterjourney_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyregisterjourney_on_mfa_completed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyregisterjourney_on_sdk_cancelled(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyregisterjourney_on_sdk_register_completed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyregisterjourney_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyregisterjourney_set_mfa_session_id(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyregisterjourney_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyregisterjourney_start_journey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyregisterjourney_start_registration(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyregisterjourney_start_registration_with_token(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_passkeyremovejourney_get_scenario(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_passkeyremovejourney_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyremovejourney_on_mfa_completed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyremovejourney_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyremovejourney_set_mfa_session_id(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyremovejourney_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyremovejourney_start_journey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyresetjourney_continue_with_step(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_passkeyresetjourney_get_operation_type(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_passkeyresetjourney_get_scenario(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_passkeyresetjourney_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyresetjourney_on_mfa_completed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyresetjourney_on_sdk_cancelled(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyresetjourney_on_sdk_rebind_completed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyresetjourney_on_upload_id_completed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyresetjourney_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyresetjourney_set_mfa_session_id(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyresetjourney_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyresetjourney_start_journey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyresetjourney_start_rebind(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_method_passkeysdktrait_assert_passkey(long j, @NotNull RustBuffer.ByValue byValue, byte b);

    public final native long uniffi_account_fn_method_passkeysdktrait_assert_using_in_house_passkey(long j, @NotNull RustBuffer.ByValue byValue);

    public final native long uniffi_account_fn_method_passkeysdktrait_register_passkey(long j, @NotNull RustBuffer.ByValue byValue, byte b);

    public final native void uniffi_account_fn_method_passkeystatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_method_passkeysupportcheckertrait_is_fido1_passkey_supported(long j);

    public final native long uniffi_account_fn_method_passkeysupportcheckertrait_is_fido2_passkey_supported(long j);

    public final native long uniffi_account_fn_method_passkeysupportcheckertrait_is_passkey_supported(long j);

    public final native byte uniffi_account_fn_method_passkeysyncblemanager_is_connected(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeysyncblemanager_send_credential_info(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeysyncblemanager_send_error(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeysyncblemanager_send_protection_key(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeysyncblemanager_send_session_id(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeysyncblemanager_set_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeysyncblemanager_start_central_flow(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeysyncblemanager_start_peripheral_flow(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeysyncblemanager_stop(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeysynccallback_on_connection_state_changed(long j, byte b, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeysynccallback_on_credential_info_received(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeysynccallback_on_error(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeysynccallback_on_error_received(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeysynccallback_on_protection_key_received(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeysynccallback_on_session_id_received(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_passkeyverifycallback_on_received(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_passkeyverifyinfo_uniffi_trait_debug(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_paypasskeylisteventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_paypasskeylistinteractor_can_unlink(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_paypasskeylistinteractor_delete_passkey(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int uniffi_account_fn_method_paypasskeylistinteractor_get_count(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_paypasskeylistinteractor_get_item(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_paypasskeylistinteractor_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_paypasskeylistinteractor_on_item_click(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_paypasskeylistinteractor_prepare_delete(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_paypasskeylistinteractor_refresh_list(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_paypasskeylistinteractor_rename_passkey(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_paypasskeylistinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_paypasskeylistinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_paypasskeyliststatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_preferencelistinteractor_refresh_list(long j, @NotNull RustBuffer.ByValue byValue, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_profilelisteventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_profilelistinteractor_fetch_data(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_profilelistinteractor_get_default_profile_list(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_method_profilelistinteractor_on_item_click(long j, @NotNull RustBuffer.ByValue byValue);

    public final native void uniffi_account_fn_method_profilelistinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_profilelistinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_profileliststatechangecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registercoreventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registercorinteractor_fetch_rewards(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_registercorinteractor_get_cor_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registercorinteractor_select_country(long j, @NotNull RustBuffer.ByValue byValue, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registercorinteractor_select_province(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registercorinteractor_set_cor_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registercorinteractor_set_cor_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registercorinteractor_set_forbid_register(long j, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registercorinteractor_submit_cor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registercorinteractor_update_checkbox(long j, @NotNull RustBuffer.ByValue byValue, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registercorstatechangecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registeremailinputeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_registeremailinputinteractor_get_current_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_registeremailinputinteractor_get_pre_condition(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_registeremailinputinteractor_get_register_token(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registeremailinputinteractor_set_email_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registeremailinputinteractor_set_email_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registeremailinputinteractor_submit_email(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registeremailinputinteractor_update_email(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registeremailinputstatechangecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_registerjourney_get_current_step(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_registerjourney_get_subdomain_strategy(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerjourney_set_step_change_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerjourney_set_subdomain_strategy(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerjourney_start_journey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerotpeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_registerotpinteractor_get_register_account(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_registerotpinteractor_get_send_code_type(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_registerotpinteractor_get_show_risk_banner(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerotpinteractor_send_code(long j, byte b, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerotpinteractor_set_otp_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerotpinteractor_set_otp_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerotpinteractor_set_remaining_time(long j, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerotpinteractor_set_send_code_type(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerotpinteractor_verify_code(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerotpstatechangecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerpasswordeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_registerpasswordinteractor_get_login_name(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_registerpasswordinteractor_get_password_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_registerpasswordinteractor_get_register_token(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerpasswordinteractor_set_password_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerpasswordinteractor_set_password_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerpasswordinteractor_submit_password(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerpasswordinteractor_update_password(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerpasswordstatechangecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerphoneinputeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerphoneinputinteractor_check_and_submit_phone(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_registerphoneinputinteractor_get_phone_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_registerphoneinputinteractor_get_register_token(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerphoneinputinteractor_set_phone_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerphoneinputinteractor_set_phone_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerphoneinputinteractor_update_phone(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerphoneinputstatechangecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_registerstepchangecallback_on_step_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_securitylistinteractor_emit_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_method_securitylistinteractor_get_on_click_navigation(long j, @NotNull RustBuffer.ByValue byValue);

    public final native long uniffi_account_fn_method_securitylistinteractor_get_security_list_state(long j);

    public final native long uniffi_account_fn_method_securitylistinteractor_refresh_state(long j);

    public final native void uniffi_account_fn_method_securitylistinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_securityliststatechangecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_setpasswordinteractor_get_code_requirement(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_setpasswordinteractor_set_state_observer(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_setpasswordinteractor_start(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_setpasswordinteractor_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_setpasswordinteractor_stop(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_setpasswordinteractor_submit_login_password(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_subaccounteventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_subaccountstatechangecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_trusteddevicejourney_set_step_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_trusteddevicejourney_start_journey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_trusteddevicejourneystate_uniffi_trait_debug(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_trusteddevicejourneystepcallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_trusteddeviceotpevent_uniffi_trait_debug(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_trusteddeviceotpeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_trusteddeviceotpinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_trusteddeviceotpinteractor_verify(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_trusteddeviceriskinteractor_change_password(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_trusteddeviceriskinteractor_later(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_trusteddeviceverifycallback_on_received(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_trusteddevicewsmanager_connect(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_trusteddevicewsmanager_disconnect(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_account_fn_method_trusteddevicewsmanager_is_connected(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_trusteddevicewsmanager_set_device_verify_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_trusteddevicewsmanager_set_message_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_trusteddevicewsmanager_set_passkey_verify_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_unlinkeventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_unlinkinteractor_get_journey(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_unlinkinteractor_navigate_to_unlink_confirm(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_unlinkinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_unlinkinteractor_set_journey(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_unlinkinteractor_unbind(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_uploadideventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_uploadidjourney_add_file_id(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_uploadidjourney_clear_file_ids(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_uploadidjourney_get_file_ids(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_uploadidjourney_get_reminder_content(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_uploadidjourney_get_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_uploadidjourney_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_uploadidjourney_set_file_ids(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_uploadidjourney_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_uploadidjourney_submit_files(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_uploadidstatecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_usercentereventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_method_usercenterinteractor_ack_avatar_reject(long j);

    public final native void uniffi_account_fn_method_usercenterinteractor_emit_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_usercenterinteractor_emit_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_usercenterinteractor_get_cached_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_account_fn_method_usercenterinteractor_load_avatar_info(long j);

    public final native void uniffi_account_fn_method_usercenterinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_usercenterinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_account_fn_method_usercenterstatechangecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_account_fn_method_username_uniffi_trait_debug(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    private UniffiLib() {
    }

    static {
        UniffiLib uniffiLib = new UniffiLib();
        INSTANCE = uniffiLib;
        CLEANER$delegate = C56392yDr.copydefault(new Function0() { // from class: o.Ahd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UniffiLib.CLEANER_delegate$lambda$0();
            }
        });
        String strFindLibraryName = C60173zxj.findLibraryName(MTAnalysisConstants.Account.KEY_ACCOUNT);
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        Native.register((Class<?>) UniffiLib.class, C60173zxj.findLibraryName(MTAnalysisConstants.Account.KEY_ACCOUNT));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        uniffiCallbackInterfaceAccountConnectJourneyCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceAccountsStateCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceBleConnectionCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceBleDataCallback.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceBleDeviceDiscoveryCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceChangePasswordJourneyEventCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceChangePasswordJourneyStepCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceInitSessionCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceLinkConfirmEventCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceLinkLandingEventCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceLinkResultEventCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceLoginEventCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceLoginJourneyEventCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceLoginJourneyStepCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceLoginPasskeyEventCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceLoginStateCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceMessageCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceMfaJourneyEventCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceMfaJourneyStateCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceMfaOtpEventCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceMfaOtpStateCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceMfaPasskeyEventCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceMfaPasskeyStateCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceMfaPasswordEventCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceMfaPasswordStateCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceMfaServiceTrait.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceMfaSwitchMethodEventCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceMfaSwitchMethodStateCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceNativeBlePasskeyProvider.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceNativePasskeyKeyProvider.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceNewDeviceCodeEventCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceNewDeviceCodeStateCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceNewDeviceConfirmEventCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceNewDeviceConfirmStateCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceNewDeviceInfoEventCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceNewDeviceInfoStateCallback.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceNewDeviceJourneyEventCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceNewDeviceJourneyStepCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceNewDeviceMultipleOtpEventCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceNewDeviceMultipleOtpStateCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceNewDeviceSingleOtpEventCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceNewDeviceSingleOtpStateCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceNewDeviceVerifyCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterConnectingEventCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterConnectingStateCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncEventCallback.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStepCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceOkxPasskeyCrossDeviceVerifyEventCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceOkxPasskeyCrossDeviceVerifyStateCallback.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceOkxPasskeyCrossDeviceVerifyStepCallback.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceOkxPasskeyManagerHandling.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceOkxPasskeySyncCallback.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceOkxPasskeyUpgradeCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceOtpEventCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceOtpStateCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfacePasskeyCoreBinding.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfacePasskeyEventCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfacePasskeyListEventCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfacePasskeyListStateCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfacePasskeySDKTrait.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfacePasskeyStateCallback.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfacePasskeySupportCheckerTrait.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfacePasskeySyncCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfacePasskeyVerifyCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfacePayPasskeyListEventCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfacePayPasskeyListStateCallback.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceProfileListEventCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceProfileListStateChangeCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceRegisterCorEventCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceRegisterCorStateChangeCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceRegisterEmailInputEventCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceRegisterEmailInputStateChangeCallback.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceRegisterOTPEventCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceRegisterOTPStateChangeCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceRegisterPasswordEventCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceRegisterPasswordStateChangeCallback.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceRegisterPhoneInputEventCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceRegisterPhoneInputStateChangeCallback.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceRegisterStepChangeCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceSecurityListStateChangeCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceSubAccountEventCallback.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceSubAccountStateChangeCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceTrustedDeviceJourneyStepCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceTrustedDeviceOtpEventCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceTrustedDeviceVerifyCallback.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceUnlinkEventCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceUploadIdEventCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceUploadIdStateCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceUserCenterEventCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceUserCenterStateChangeCallback.INSTANCE.KWHzl(uniffiLib);
        BzK.uniffiEnsureInitialized();
        C2576ARb.uniffiEnsureInitialized();
        C4298Bav.uniffiEnsureInitialized();
        BfS.uniffiEnsureInitialized();
        $stable = 8;
    }

    public final InterfaceC60177zxn OLrzqt() {
        return (InterfaceC60177zxn) CLEANER$delegate.getValue();
    }

    public static final InterfaceC60177zxn CLEANER_delegate$lambda$0() {
        return C60173zxj.create(InterfaceC60177zxn.Companion);
    }
}
