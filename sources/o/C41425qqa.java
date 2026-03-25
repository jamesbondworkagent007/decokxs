package o;

import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41425qqa {
    public static final long KWHzl(long j) {
        return j + ((long) EZpvd("GMT+8"));
    }

    public static final int EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        TimeZone timeZone = TimeZone.getDefault();
        TimeZone timeZoneOLrzqt = yCN.OLrzqt(str);
        return timeZoneOLrzqt.getOffset(jCurrentTimeMillis) - timeZone.getOffset(jCurrentTimeMillis);
    }
}
