package o;

import android.app.ActivityManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ytP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58018ytP {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [16=7] */
    public static final java.lang.String EZpvd(@NotNull ActivityManager.RecentTaskInfo recentTaskInfo) {
        Intrinsics.checkNotNullParameter(recentTaskInfo, "");
        if (Build.VERSION.SDK_INT >= 29) {
            java.lang.String string = recentTaskInfo.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        try {
            return "RecentTaskInfo{id=" + recentTaskInfo.id + " persistentId=" + recentTaskInfo.persistentId + " baseIntent=" + recentTaskInfo.baseIntent + " baseActivity=" + recentTaskInfo.baseActivity + " topActivity=" + recentTaskInfo.topActivity + " origActivity=" + recentTaskInfo.origActivity + " numActivities=" + recentTaskInfo.numActivities + AbstractJsonLexerKt.END_OBJ;
        } catch (java.lang.Throwable unused) {
            java.lang.String string2 = recentTaskInfo.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
    }
}
