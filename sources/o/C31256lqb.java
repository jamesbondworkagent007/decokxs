package o;

import android.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31256lqb {
    public static final java.lang.String AEQbTJ(java.lang.String str, @NotNull Function1<? super java.lang.String, java.lang.String> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (str == null) {
            str = "";
        }
        return str.length() == 0 ? str : function1.invoke(str);
    }

    public static final java.lang.String KWHzl(java.lang.String str, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (str == null) {
            str = "";
        }
        return str.length() == 0 ? function0.invoke() : str;
    }

    public static final java.lang.String AEQbTJ(java.lang.String str, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL) || str.length() == 0) ? function0.invoke() : str;
    }

    public static final void EZpvd(java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            function1.invoke(str);
        }
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult matchResult = (MatchResult) C59467zhb.zLjUOn(Regex.findAll$default(new Regex("[a-zA-Z0-9]{32,512}"), str, 0, 2, null));
        return (matchResult == null || (strKWHzl = matchResult.KWHzl()) == null) ? str : strKWHzl;
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.Enum<?> r3) {
        Intrinsics.checkNotNullParameter(r3, "");
        java.lang.String lowerCase = new Regex("([a-z0-9])([A-Z])").replace(new Regex("(?<=[a-zA-Z])[A-Z](?=[a-z])").replace(r3.name(), "_$0"), "$1_$2").toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static final int KWHzl(java.lang.String str, @androidx.annotation.ColorInt int i) {
        try {
            return Color.parseColor(str);
        } catch (java.lang.Throwable unused) {
            return i;
        }
    }
}
