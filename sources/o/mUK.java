package o;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mUK {
    public static final mUK AEQbTJ = new mUK();

    private mUK() {
    }

    public final int AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(C33129mqd.valueOf(str));
        return calendar.get(11);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
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

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        java.lang.String str2 = new SimpleDateFormat("MM/dd", java.util.Locale.getDefault()).format(new Date(C33129mqd.valueOf(str)));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        java.lang.String str2 = new SimpleDateFormat("MM/dd, HH:mm", java.util.Locale.getDefault()).format(new Date(C33129mqd.valueOf(str)));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }
}
