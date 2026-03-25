package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mxJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33480mxJ {
    public static final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Pattern patternCompile = Pattern.compile("[🀀-🏿]|[🐀-\u1f7ff]|[🠀-\u1fbff]|[℀-㋿]|[0-\u007f][⃐-\u20ff]|[\u0080-ÿ]");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        Matcher matcher = patternCompile.matcher(str);
        Intrinsics.checkNotNullExpressionValue(matcher, "");
        return matcher.find();
    }
}
