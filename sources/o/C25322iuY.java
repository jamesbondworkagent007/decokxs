package o;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iuY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25322iuY {
    public static final C25322iuY OLrzqt = new C25322iuY();

    private C25322iuY() {
    }

    public final int djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(C33129mqd.valueOf(str));
        return calendar.get(11);
    }

    public final java.lang.String AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(C33129mqd.valueOf(str));
        int i = calendar.get(11);
        if (i >= 0 && i < 10) {
            return "0" + i + ":00";
        }
        return i + ":00";
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        java.lang.String str2 = new SimpleDateFormat("HH:mm", java.util.Locale.getDefault()).format(new Date(C33129mqd.valueOf(str)));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Date date = new Date(C33129mqd.valueOf(str));
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Date time = calendar.getTime();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        Date time2 = calendar.getTime();
        if (date.before(time) || date.after(time2)) {
            java.lang.String str2 = new SimpleDateFormat("MM/dd HH:mm:ss", java.util.Locale.getDefault()).format(date);
            Intrinsics.copydefault((java.lang.Object) str2);
            return str2;
        }
        java.lang.String str3 = new SimpleDateFormat("HH:mm:ss", java.util.Locale.getDefault()).format(date);
        Intrinsics.copydefault((java.lang.Object) str3);
        return str3;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        long millis = java.util.concurrent.TimeUnit.DAYS.toMillis(1L);
        long millis2 = java.util.concurrent.TimeUnit.HOURS.toMillis(1L);
        long millis3 = java.util.concurrent.TimeUnit.MINUTES.toMillis(1L);
        long millis4 = java.util.concurrent.TimeUnit.SECONDS.toMillis(1L);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - C33129mqd.valueOf(str);
        if (jCurrentTimeMillis < millis3) {
            return C33069mpW.copydefault(C23274hvD.Fragment.areNotificationsEnabled, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.String.valueOf(jCurrentTimeMillis / millis4))));
        }
        if (jCurrentTimeMillis < millis2) {
            return C33069mpW.copydefault(C23274hvD.Fragment.IPostMessageServiceStubProxy, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.String.valueOf(jCurrentTimeMillis / millis3))));
        }
        if (jCurrentTimeMillis < millis) {
            return C33069mpW.copydefault(C23274hvD.Fragment.IPostMessageServiceStub, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.String.valueOf(jCurrentTimeMillis / millis2))));
        }
        long j = ((long) 30) * millis;
        if (jCurrentTimeMillis < j) {
            return C33069mpW.copydefault(C23274hvD.Fragment.IPostMessageService, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.String.valueOf(jCurrentTimeMillis / millis))));
        }
        long j2 = ((long) 360) * millis;
        if (jCurrentTimeMillis < j2) {
            return C33069mpW.copydefault(C23274hvD.Fragment.onExtraCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.String.valueOf(jCurrentTimeMillis / j))));
        }
        if (jCurrentTimeMillis < ((long) 390) * millis) {
            return C33069mpW.copydefault(C23274hvD.Fragment.ITrustedWebActivityCallbackDefault, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.String.valueOf(jCurrentTimeMillis / j2))));
        }
        return C33069mpW.copydefault(C23274hvD.Fragment.ITrustedWebActivityService, C56424yEw.gEmmrt(C56390yDp.OLrzqt("value", java.lang.String.valueOf(jCurrentTimeMillis / j2)), C56390yDp.OLrzqt("value2", java.lang.String.valueOf((jCurrentTimeMillis % j2) / j))));
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        java.lang.String str2 = new SimpleDateFormat("MM/dd", java.util.Locale.getDefault()).format(new Date(C33129mqd.valueOf(str)));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public final java.lang.String valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        java.lang.String str2 = new SimpleDateFormat("MM/dd/yyyy", java.util.Locale.getDefault()).format(new Date(C33129mqd.valueOf(str)));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public final java.lang.String gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        java.lang.String str2 = new SimpleDateFormat("MM/dd, HH:mm", java.util.Locale.getDefault()).format(new Date(C33129mqd.valueOf(str)));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        java.lang.String str2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", java.util.Locale.getDefault()).format(new Date(C33129mqd.valueOf(str)));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public final java.lang.String AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        java.lang.String str2 = new SimpleDateFormat("MMM yyyy", java.util.Locale.getDefault()).format(new Date(C33129mqd.valueOf(str)));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }
}
