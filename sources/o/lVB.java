package o;

import com.okinc.captcha.impl.data.CaptchaVendor;
import com.okinc.captcha.impl.geetest.GeetestCaptchaDeepknowException;
import com.okinc.captcha.impl.geetest.GeetestCaptchaVerificationException;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lVB {
    public static final lVB AEQbTJ = new lVB();

    private lVB() {
    }

    public final void KWHzl(@NotNull final OKServerException oKServerException, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(oKServerException, "");
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("GeeTest_Backend_Api_ErrorType", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lVJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lVB.AEQbTJ(oKServerException, str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(OKServerException oKServerException, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "errorCode", java.lang.String.valueOf(oKServerException.getCode()), false, 4, null);
        java.lang.String message = oKServerException.getMessage();
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_MSG_HUMP, message == null ? "" : message, false, 4, null);
        EventParamsList.put$default(eventParamsList, "scene", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull final GeetestCaptchaDeepknowException geetestCaptchaDeepknowException, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(geetestCaptchaDeepknowException, "");
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("GeeTest_Backend_Api_ErrorSession", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lVF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lVB.copydefault(geetestCaptchaDeepknowException, str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(GeetestCaptchaDeepknowException geetestCaptchaDeepknowException, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "errorCode", geetestCaptchaDeepknowException.getCode(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_MSG_HUMP, geetestCaptchaDeepknowException.getMessage(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "scene", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull final GeetestCaptchaVerificationException geetestCaptchaVerificationException, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(geetestCaptchaVerificationException, "");
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("GeeTest_Backend_Api_CaptchaSessionReceiveError", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lVH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lVB.copydefault(geetestCaptchaVerificationException, str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(GeetestCaptchaVerificationException geetestCaptchaVerificationException, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "errorCode", geetestCaptchaVerificationException.getCode(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_MSG_HUMP, geetestCaptchaVerificationException.getMessage(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "scene", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackFail$default(lVB lvb, java.lang.String str, long j, GeetestCaptchaVerificationException geetestCaptchaVerificationException, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        lvb.EZpvd(str, j, geetestCaptchaVerificationException);
    }

    public final void EZpvd(@NotNull java.lang.String str, long j, @NotNull GeetestCaptchaVerificationException geetestCaptchaVerificationException) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(geetestCaptchaVerificationException, "");
        lWv.copydefault.OLrzqt(str, CaptchaVendor.GEETEST, j, geetestCaptchaVerificationException.getCode(), geetestCaptchaVerificationException.getMessage());
    }

    public final void KWHzl(@NotNull java.lang.String str, Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        lWv.trackView$default(lWv.copydefault, str, CaptchaVendor.GEETEST, null, function1, 4, null);
    }

    public static /* synthetic */ void trackSuccess$default(lVB lvb, java.lang.String str, long j, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        lvb.EZpvd(str, j, (Function1<? super EventParamsList, Unit>) function1);
    }

    public final void EZpvd(@NotNull java.lang.String str, long j, Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        lWv.copydefault.KWHzl(str, CaptchaVendor.GEETEST, j, function1);
    }
}
