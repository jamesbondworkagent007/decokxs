package o;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ygy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57364ygy {
    public static /* synthetic */ java.lang.String getFormattedStringOrDefault$default(android.content.Context context, int i, java.util.Map map, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        if ((i2 & 4) != 0) {
            str = "";
        }
        return KWHzl(context, i, map, str);
    }

    public static final java.lang.String KWHzl(@NotNull android.content.Context context, @androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return C33069mpW.KWHzl(context, i, map);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }
}
