package o;

import androidx.core.app.NotificationManagerCompat;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C6860aXO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6860aXO {
    public static android.content.pm.PackageInfo AYXKKw;
    public static android.content.Context valueOf;
    public static final C6860aXO copydefault = new C6860aXO();
    public static final java.lang.String KWHzl = "is_first_launch";
    public static boolean AhwBna = true;
    public static boolean OLrzqt = true;
    public static long djBIcL = java.lang.System.currentTimeMillis();
    public static final ActionBar EZpvd = new ActionBar();
    public static final int AEQbTJ = 8;

    private C6860aXO() {
    }

    /* JADX INFO: renamed from: o.aXO$ActionBar */
    public static final class ActionBar implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            C6913aYO c6913aYOKWHzl = C6860aXO.copydefault.KWHzl(java.lang.System.currentTimeMillis(), true);
            java.lang.String strAEQbTJ = c6913aYOKWHzl.AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            InterfaceC6911aYM interfaceC6911aYMEZpvd = c6913aYOKWHzl.EZpvd();
            Intrinsics.checkNotNullExpressionValue(interfaceC6911aYMEZpvd, "");
            C32866mlf.EZpvd(strAEQbTJ, interfaceC6911aYMEZpvd);
            java.lang.Long l = SPUtils.getLong("app_loaded_time", 0L);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            Intrinsics.copydefault(l);
            if (jCurrentTimeMillis - l.longValue() > 3600000) {
                SPUtils.put("app_loaded_time", java.lang.Long.valueOf(jCurrentTimeMillis));
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.AEQbTJ("app_loaded", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aXN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C6860aXO.ActionBar.EZpvd((EventParamsList) obj);
                    }
                });
                C6860aXO.OLrzqt = false;
            }
        }

        public static final Unit EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("first_open", java.lang.String.valueOf(C6860aXO.OLrzqt), true);
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
            C6913aYO c6913aYOEZpvd = C6860aXO.copydefault.EZpvd(C6860aXO.djBIcL, java.lang.System.currentTimeMillis());
            java.lang.String strAEQbTJ = c6913aYOEZpvd.AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            InterfaceC6911aYM interfaceC6911aYMEZpvd = c6913aYOEZpvd.EZpvd();
            Intrinsics.checkNotNullExpressionValue(interfaceC6911aYMEZpvd, "");
            C32866mlf.EZpvd(strAEQbTJ, interfaceC6911aYMEZpvd);
        }
    }

    public final void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (valueOf == null) {
            android.content.Context applicationContext = context.getApplicationContext();
            valueOf = applicationContext;
            if (applicationContext == null) {
                Intrinsics.gEmmrt("");
                applicationContext = null;
            }
            android.content.pm.PackageManager packageManager = applicationContext.getPackageManager();
            android.content.Context context2 = valueOf;
            if (context2 == null) {
                Intrinsics.gEmmrt("");
                context2 = null;
            }
            AYXKKw = packageManager.getPackageInfo(context2.getPackageName(), 0);
            java.lang.String str = KWHzl;
            boolean z = SPUtils.getBoolean(str, true, null);
            AhwBna = z;
            OLrzqt = z;
            if (z) {
                SPUtils.put(str, java.lang.Boolean.FALSE, (java.lang.String) null);
                C32866mlf.onEvent$default("install", (TrackChannel[]) null, new Function1() { // from class: o.aXM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C6860aXO.OLrzqt((EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                pUU.KWHzl("AppStartEndTracker", "init, first launch.");
            }
            C54819xWm.KWHzl().AEQbTJ(EZpvd);
            C6913aYO c6913aYOKWHzl = KWHzl(java.lang.System.currentTimeMillis(), false);
            java.lang.String strAEQbTJ = c6913aYOKWHzl.AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            InterfaceC6911aYM interfaceC6911aYMEZpvd = c6913aYOKWHzl.EZpvd();
            Intrinsics.checkNotNullExpressionValue(interfaceC6911aYMEZpvd, "");
            C32866mlf.EZpvd(strAEQbTJ, interfaceC6911aYMEZpvd);
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("app_startup", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
        }
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        try {
            java.lang.String strCopydefault = xVW.copydefault();
            java.lang.String strAEQbTJ = C33514mxr.AEQbTJ(strCopydefault, com.google.android.exoplayer2.C.UTF8_NAME, "AES/ECB/PKCS7Padding", "oH7]bD1!qO7$yB1.");
            Intrinsics.copydefault((java.lang.Object) strCopydefault);
            EventParamsList.put$default(eventParamsList, "origin_did", strCopydefault, false, 4, null);
            Intrinsics.copydefault((java.lang.Object) strAEQbTJ);
            EventParamsList.put$default(eventParamsList, "enc_did", strAEQbTJ, false, 4, null);
        } catch (java.lang.Exception e) {
            pUU.copydefault("AppStartEndTracker", "init, first launch, APP_INSTALL error: " + e.getMessage());
        }
        return Unit.INSTANCE;
    }

    public final C6913aYO KWHzl(long j, boolean z) {
        C6913aYO c6913aYO = new C6913aYO();
        c6913aYO.AEQbTJ("app_start");
        C6909aYK c6909aYK = new C6909aYK();
        c6909aYK.put("_first_time", java.lang.String.valueOf(AhwBna));
        C6860aXO c6860aXO = copydefault;
        android.content.pm.PackageInfo packageInfo = AYXKKw;
        android.content.Context context = null;
        if (packageInfo == null) {
            Intrinsics.gEmmrt("");
            packageInfo = null;
        }
        c6909aYK.put("_first_day", java.lang.String.valueOf(c6860aXO.AEQbTJ(packageInfo.firstInstallTime, j)));
        c6909aYK.put("_resume", java.lang.String.valueOf(z));
        c6909aYK.put("_start_time", java.lang.String.valueOf(j));
        android.content.Context context2 = valueOf;
        if (context2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            context = context2;
        }
        c6909aYK.put("_notification_enable", java.lang.String.valueOf(c6860aXO.EZpvd(context)));
        c6913aYO.copydefault(c6909aYK);
        c6913aYO.AEQbTJ(true);
        djBIcL = j;
        AhwBna = false;
        return c6913aYO;
    }

    public final boolean EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
        Intrinsics.checkNotNullExpressionValue(notificationManagerCompatFrom, "");
        return notificationManagerCompatFrom.areNotificationsEnabled();
    }

    public final C6913aYO EZpvd(long j, long j2) {
        C6913aYO c6913aYO = new C6913aYO();
        c6913aYO.AEQbTJ("app_end");
        C6909aYK c6909aYK = new C6909aYK();
        c6909aYK.put("_start_time", java.lang.String.valueOf(j));
        c6909aYK.put("_end_time", java.lang.String.valueOf(j2));
        c6913aYO.copydefault(c6909aYK);
        c6913aYO.AEQbTJ(true);
        return c6913aYO;
    }

    public final boolean AEQbTJ(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.setTime(new Date(j2));
        return calendar.get(1) == i && calendar.get(2) == i2 && calendar.get(5) == i3;
    }
}
