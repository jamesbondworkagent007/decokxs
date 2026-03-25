package o;

import com.amplifyframework.core.model.ModelIdentifier;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: o.xH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C54400xH {
    public static final java.lang.String KWHzl(java.lang.String str) {
        java.lang.String strSubstringAfter$default;
        if (str == null || (strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(str, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, (java.lang.String) null, 2, (java.lang.Object) null)) == null) {
            return null;
        }
        return StringsKt__StringsKt.substringBefore$default(strSubstringAfter$default, ":", (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
