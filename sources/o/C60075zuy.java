package o;

import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: o.zuy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60075zuy {
    public static final java.lang.String EZpvd(java.lang.String str) {
        if (str != null) {
            if (!C59449zhJ.startsWith$default(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString(), com.ibm.icu.text.DateFormat.MINUTE, false, 2, null)) {
                throw new java.lang.IllegalArgumentException("Must start with m");
            }
            return C59449zhJ.replace$default(StringsKt__StringsKt.KWHzl(StringsKt__StringsKt.KWHzl(str, (java.lang.CharSequence) com.ibm.icu.text.DateFormat.MINUTE), (java.lang.CharSequence) "/"), " ", "", false, 4, (java.lang.Object) null);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
