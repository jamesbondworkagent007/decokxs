package o;

import androidx.core.util.PatternsCompat;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sTc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44526sTc {
    public static final C44526sTc OLrzqt = new C44526sTc();

    private C44526sTc() {
    }

    public final java.util.List<java.lang.String> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAEQbTJ = AEQbTJ(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Matcher matcher = PatternsCompat.AUTOLINK_WEB_URL.matcher(strAEQbTJ);
        while (matcher.find()) {
            java.lang.String strGroup = matcher.group();
            Intrinsics.copydefault((java.lang.Object) strGroup);
            arrayList.add(strGroup);
        }
        return arrayList;
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        java.lang.String strReplaceAll = PatternsCompat.EMAIL_ADDRESS.matcher(str).replaceAll("");
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "");
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) new Regex("\\s+").replace(strReplaceAll, " ")).toString();
    }
}
