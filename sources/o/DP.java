package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DB;

/* JADX INFO: loaded from: classes2.dex */
public final class DP {
    public static final kotlin.Pair<DB, java.lang.Integer> OLrzqt(java.lang.String str) {
        if (StringsKt__StringsKt.startsWith$default((java.lang.CharSequence) str, AbstractJsonLexerKt.BEGIN_LIST, false, 2, (java.lang.Object) null)) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, AbstractJsonLexerKt.END_LIST, 0, false, 6, (java.lang.Object) null);
            if (iIndexOf$default <= 0) {
                throw new java.lang.IllegalArgumentException("unmatched [ or ]".toString());
            }
            java.lang.String strSubstring = str.substring(1, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            DB dbKWHzl = DB.copydefault.KWHzl(C5167Hh.KWHzl.copydefault().copydefault(strSubstring));
            if (!(dbKWHzl instanceof DB.TaskDescription) || !(((DB.TaskDescription) dbKWHzl).OLrzqt() instanceof DG)) {
                throw new java.lang.IllegalArgumentException("non-ipv6 host was enclosed in []-brackets".toString());
            }
            java.lang.Character chAhwBna = C59454zhO.AhwBna((java.lang.CharSequence) str, iIndexOf$default + 1);
            if (chAhwBna != null && chAhwBna.charValue() == ':') {
                java.lang.String strSubstring2 = str.substring(iIndexOf$default + 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                numValueOf = java.lang.Integer.valueOf(java.lang.Integer.parseInt(strSubstring2));
            } else if (chAhwBna != null) {
                throw new java.lang.IllegalArgumentException("unexpected characters after ]");
            }
            return C56390yDp.OLrzqt(dbKWHzl, numValueOf);
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new char[]{AbstractJsonLexerKt.COLON}, false, 0, 6, (java.lang.Object) null);
        DB dbKWHzl2 = DB.copydefault.KWHzl(C5167Hh.KWHzl.copydefault().copydefault((java.lang.String) listSplit$default.get(0)));
        if ((dbKWHzl2 instanceof DB.TaskDescription) && (((DB.TaskDescription) dbKWHzl2).OLrzqt() instanceof DG)) {
            throw new java.lang.IllegalArgumentException("ipv6 host given without []-brackets".toString());
        }
        java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default, 1);
        return C56390yDp.OLrzqt(dbKWHzl2, str2 != null ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2)) : null);
    }
}
