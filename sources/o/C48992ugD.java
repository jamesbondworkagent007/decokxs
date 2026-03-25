package o;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okuser.data.User;
import com.okinc.search.bean.SearchResultContentPo;
import com.okinc.share.bean.TriggerSource;
import com.okinc.share.platforms.SharePlatform;
import com.reown.android.pulse.model.ConnectionMethod;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ugD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48992ugD {
    public static final int AEQbTJ;
    public static final java.util.HashMap<SharePlatform, java.lang.String> EZpvd;
    public static final C48992ugD KWHzl = new C48992ugD();

    /* JADX INFO: renamed from: o.ugD$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TriggerSource.values().length];
            try {
                iArr[TriggerSource.SCREEN_SHOT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TriggerSource.BUTTON_CLICK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    private C48992ugD() {
    }

    static {
        java.util.HashMap<SharePlatform, java.lang.String> map = new java.util.HashMap<>();
        map.put(SharePlatform.WHATS_APP, "whatsapp");
        map.put(SharePlatform.TWITTER, SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER);
        map.put(SharePlatform.TELEGRAM, "telegram");
        map.put(SharePlatform.FACEBOOK, "facebook");
        map.put(SharePlatform.WECHAT, "wechat");
        map.put(SharePlatform.WECHAT_MOMENTS, "moments");
        map.put(SharePlatform.SMS, OtpEventTracker.OTP_EVENT_VALUE_SMS);
        map.put(SharePlatform.SINA_WEIBO, "weibo");
        map.put(SharePlatform.KAKAO, "kakao");
        map.put(SharePlatform.FACEBOOK_MESSENGER, "messenger");
        map.put(SharePlatform.VIBER, "viber");
        map.put(SharePlatform.LINE, "line");
        map.put(SharePlatform.DISCORD, "discord");
        map.put(SharePlatform.ZALO, "zalo");
        map.put(SharePlatform.INSTAGRAM, "instagram");
        map.put(SharePlatform.MORE, "more");
        map.put(SharePlatform.QRCODE, ConnectionMethod.QR_CODE);
        map.put(SharePlatform.QQ, "qq");
        map.put(SharePlatform.LINK, "copy_link");
        map.put(SharePlatform.SAVE_IMAGE, "save_image");
        EZpvd = map;
        AEQbTJ = 8;
    }

    public final java.lang.String EZpvd(SharePlatform sharePlatform) {
        java.lang.String str = EZpvd.get(sharePlatform);
        return str == null ? java.lang.String.valueOf(sharePlatform.getPlatformName()) : str;
    }

    public final void AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("SharePage_Sheet_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ugC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48992ugD.OLrzqt(str, (EventParamsList) obj);
            }
        });
        OLrzqt(str);
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("share_from", str, false);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull SharePlatform sharePlatform, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        Intrinsics.checkNotNullParameter(str, "");
        final java.lang.String strEZpvd = EZpvd(sharePlatform);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("SharePage_Sheet_Channel_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ugF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48992ugD.OLrzqt(str, strEZpvd, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("share_from", str, false);
        eventParamsList.put("share_channel", str2, false);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull SharePlatform sharePlatform, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        Intrinsics.checkNotNullParameter(str, "");
        final java.lang.String strEZpvd = EZpvd(sharePlatform);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("SharePage_Sheet_Channel_Success", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ugB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48992ugD.EZpvd(str, strEZpvd, (EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("share_from", str, false);
        eventParamsList.put("share_channel", str2, false);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("ScreenShot_Share_Api_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ugJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48992ugD.EZpvd(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page_name", str, false);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
        if (str == null || str.length() == 0) {
            C55326xho.OLrzqt("share from can't be empty,must defined in  BaseShareParams,ShareH5Bean,FootView");
        }
    }

    public final void KWHzl(@NotNull final TriggerSource triggerSource, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(triggerSource, "");
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("ShareModule_Sheet_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ugK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48992ugD.OLrzqt(triggerSource, str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(TriggerSource triggerSource, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C48992ugD c48992ugD = KWHzl;
        eventParamsList.put("share_type", c48992ugD.EZpvd(triggerSource), true);
        eventParamsList.put("page_name", c48992ugD.copydefault(triggerSource, str), false);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final TriggerSource triggerSource, @NotNull final SharePlatform sharePlatform, @NotNull final java.lang.String str, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(triggerSource, "");
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("ShareModule_Sheet_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ugE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48992ugD.OLrzqt(triggerSource, str, sharePlatform, num, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(TriggerSource triggerSource, java.lang.String str, SharePlatform sharePlatform, java.lang.Integer num, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C48992ugD c48992ugD = KWHzl;
        eventParamsList.put("page_name", c48992ugD.copydefault(triggerSource, str), false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, c48992ugD.EZpvd(sharePlatform), true);
        User userOLrzqt = ((InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class)).OLrzqt();
        eventParamsList.put("is_vip", java.lang.String.valueOf(userOLrzqt != null ? userOLrzqt.isVip() : false), true);
        if (num != null) {
            eventParamsList.put("page_index", java.lang.String.valueOf(num.intValue() + 1), true);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void logShareModuleSheetEditClick$default(C48992ugD c48992ugD, TriggerSource triggerSource, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        c48992ugD.KWHzl(triggerSource, str, num);
    }

    public final void KWHzl(@NotNull final TriggerSource triggerSource, @NotNull final java.lang.String str, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(triggerSource, "");
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("ShareModule_Sheet_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ugI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48992ugD.KWHzl(triggerSource, str, num, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(TriggerSource triggerSource, java.lang.String str, java.lang.Integer num, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page_name", KWHzl.copydefault(triggerSource, str), false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "edit", true);
        if (num != null) {
            eventParamsList.put("page_index", java.lang.String.valueOf(num.intValue() + 1), true);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final TriggerSource triggerSource, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(triggerSource, "");
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("ShareModule_Edit_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ugG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48992ugD.AEQbTJ(triggerSource, str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(TriggerSource triggerSource, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C48992ugD c48992ugD = KWHzl;
        eventParamsList.put("share_type", c48992ugD.EZpvd(triggerSource), true);
        eventParamsList.put("page_name", c48992ugD.copydefault(triggerSource, str), false);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final TriggerSource triggerSource, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(triggerSource, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("ShareModule_Edit_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ugH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48992ugD.copydefault(triggerSource, str, str2, num, (EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(TriggerSource triggerSource, java.lang.String str, java.lang.String str2, java.lang.Integer num, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page_name", KWHzl.copydefault(triggerSource, str), false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str2, false);
        if (num != null) {
            eventParamsList.put("page_index", java.lang.String.valueOf(num.intValue() + 1), true);
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String EZpvd(TriggerSource triggerSource) {
        int i = StateListAnimator.EZpvd[triggerSource.ordinal()];
        if (i == 1) {
            return "screenshot";
        }
        if (i == 2) {
            return "button_share";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final java.lang.String copydefault(TriggerSource triggerSource, java.lang.String str) {
        int i = StateListAnimator.EZpvd[triggerSource.ordinal()];
        if (i == 1) {
            return EZpvd();
        }
        if (i == 2) {
            return str;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final java.lang.String EZpvd() {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            return "unknown";
        }
        if (activityAEQbTJ instanceof AbstractActivityC33041mov) {
            return ((AbstractActivityC33041mov) activityAEQbTJ).getQPLSourceName();
        }
        java.lang.String name = activityAEQbTJ.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return name;
    }
}
