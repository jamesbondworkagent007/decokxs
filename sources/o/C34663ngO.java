package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ngO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34663ngO {
    public static final java.lang.String EZpvd(java.lang.String str, @NotNull Function1<? super java.lang.String, java.lang.String> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (str == null) {
            str = "";
        }
        return str.length() == 0 ? str : function1.invoke(str);
    }

    public static final java.lang.String AEQbTJ(java.lang.String str, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (str == null) {
            str = "";
        }
        return str.length() == 0 ? function0.invoke() : str;
    }

    public static final void OLrzqt(java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            function1.invoke(str);
        }
    }

    public static final java.lang.String KWHzl(java.lang.String str, @NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL) || str.length() == 0) ? function0.invoke() : str;
    }
}
