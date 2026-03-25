package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yFF {
    public static final int OLrzqt(java.lang.String str) {
        int iIndexOf$default;
        char c = java.io.File.separatorChar;
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, c, 0, false, 4, (java.lang.Object) null);
        if (iIndexOf$default2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, c, 2, false, 4, (java.lang.Object) null)) < 0) {
                return 1;
            }
            int iIndexOf$default3 = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, c, iIndexOf$default + 1, false, 4, (java.lang.Object) null);
            return iIndexOf$default3 >= 0 ? iIndexOf$default3 + 1 : str.length();
        }
        if (iIndexOf$default2 > 0 && str.charAt(iIndexOf$default2 - 1) == ':') {
            return iIndexOf$default2 + 1;
        }
        if (iIndexOf$default2 == -1 && StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) str, AbstractJsonLexerKt.COLON, false, 2, (java.lang.Object) null)) {
            return str.length();
        }
        return 0;
    }

    public static final yFC gEmmrt(@NotNull java.io.File file) {
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(file, "");
        java.lang.String path = file.getPath();
        Intrinsics.copydefault((java.lang.Object) path);
        int iOLrzqt = OLrzqt(path);
        java.lang.String strSubstring = path.substring(0, iOLrzqt);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.String strSubstring2 = path.substring(iOLrzqt);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        if (strSubstring2.length() == 0) {
            listAhwBna = yDY.AhwBna();
        } else {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) strSubstring2, new char[]{java.io.File.separatorChar}, false, 0, 6, (java.lang.Object) null);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
            java.util.Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(new java.io.File((java.lang.String) it.next()));
            }
            listAhwBna = arrayList;
        }
        return new yFC(new java.io.File(strSubstring), listAhwBna);
    }
}
