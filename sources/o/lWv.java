package o;

import com.okinc.captcha.impl.data.CaptchaVendor;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lWv {
    public static final lWv copydefault = new lWv();

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CaptchaVendor.values().length];
            try {
                iArr[CaptchaVendor.GEETEST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CaptchaVendor.TCAPTCHA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CaptchaVendor.RECAPTCHA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    private lWv() {
    }

    public static /* synthetic */ void trackView$default(lWv lwv, java.lang.String str, CaptchaVendor captchaVendor, java.lang.String str2, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        lwv.EZpvd(str, captchaVendor, str2, function1);
    }

    public final void EZpvd(@NotNull final java.lang.String str, @NotNull final CaptchaVendor captchaVendor, @NotNull final java.lang.String str2, final Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(captchaVendor, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("CreateAccount_Pop_CaptchaVerify_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lWx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lWv.AEQbTJ(str, captchaVendor, str2, function1, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(java.lang.String str, CaptchaVendor captchaVendor, java.lang.String str2, Function1 function1, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "scenario", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "vendor", copydefault.AEQbTJ(captchaVendor), false, 4, null);
        EventParamsList.put$default(eventParamsList, "verification_method", str2, false, 4, null);
        if (function1 != null) {
            function1.invoke(eventParamsList);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackSuccess$default(lWv lwv, java.lang.String str, CaptchaVendor captchaVendor, long j, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = 0;
        }
        lwv.KWHzl(str, captchaVendor, j, function1);
    }

    public final void KWHzl(@NotNull final java.lang.String str, @NotNull final CaptchaVendor captchaVendor, final long j, final Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(captchaVendor, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("CreateAccount_CaptchaVerification_Api_Success", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lWu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lWv.OLrzqt(str, captchaVendor, j, function1, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.String str, CaptchaVendor captchaVendor, long j, Function1 function1, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "scenario", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "vendor", copydefault.AEQbTJ(captchaVendor), false, 4, null);
        EventParamsList.put$default(eventParamsList, "stay_time", java.lang.String.valueOf(j), false, 4, null);
        if (function1 != null) {
            function1.invoke(eventParamsList);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackFail$default(lWv lwv, java.lang.String str, CaptchaVendor captchaVendor, long j, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = 0;
        }
        lwv.OLrzqt(str, captchaVendor, j, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final CaptchaVendor captchaVendor, final long j, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(captchaVendor, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("CreateAccount_VendorCaptcha_Fail_Scroll", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lWy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lWv.KWHzl(str, captchaVendor, j, str2, str3, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, CaptchaVendor captchaVendor, long j, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "scenario", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "vendor", copydefault.AEQbTJ(captchaVendor), false, 4, null);
        EventParamsList.put$default(eventParamsList, "stay_time", java.lang.String.valueOf(j), false, 4, null);
        EventParamsList.put$default(eventParamsList, "errorcode", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "errormsg", str3, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final java.util.List<java.lang.String> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        if (z) {
            return;
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Captcha_MultiVendor_ModeSelection_Scroll", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lWw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lWv.KWHzl(list, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(java.util.List list, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
        if (str != null) {
            EventParamsList.put$default(eventParamsList, "primary_vendor", copydefault.AEQbTJ(CaptchaVendor.Companion.KWHzl(str)), false, 4, null);
        }
        java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(list, 1);
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "secondary_vendor", copydefault.AEQbTJ(CaptchaVendor.Companion.KWHzl(str2)), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(CaptchaVendor captchaVendor) {
        int i = captchaVendor == null ? -1 : TaskDescription.AEQbTJ[captchaVendor.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "" : "google" : "tencent" : "geetest";
    }
}
