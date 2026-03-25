package o;

import com.amplifyframework.core.model.ModelIdentifier;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectStreamConstants {
    public static final boolean EZpvd(@NotNull PutField putField) {
        Intrinsics.checkNotNullParameter(putField, "");
        return OLrzqt(putField) && !gEmmrt(putField);
    }

    public static final boolean gEmmrt(@NotNull PutField putField) {
        Intrinsics.checkNotNullParameter(putField, "");
        return OLrzqt(putField) && StringsKt__StringsKt.contains$default((java.lang.CharSequence) putField.EZpvd(), (java.lang.CharSequence) "sso-session", false, 2, (java.lang.Object) null);
    }

    public static final boolean OLrzqt(@NotNull PutField putField) {
        Intrinsics.checkNotNullParameter(putField, "");
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) ObjectStreamClass.OLrzqt(putField.EZpvd())).toString();
        return StringsKt__StringsKt.startsWith$default((java.lang.CharSequence) string, AbstractJsonLexerKt.BEGIN_LIST, false, 2, (java.lang.Object) null) && StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) string, AbstractJsonLexerKt.END_LIST, false, 2, (java.lang.Object) null);
    }

    public static final boolean copydefault(@NotNull PutField putField) {
        Intrinsics.checkNotNullParameter(putField, "");
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) putField.EZpvd()).toString();
        return C59449zhJ.startsWith$default(string, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, false, 2, null) || C59449zhJ.startsWith$default(string, ";", false, 2, null);
    }

    public static final boolean KWHzl(@NotNull PutField putField) {
        Intrinsics.checkNotNullParameter(putField, "");
        return !CharsKt__CharJVMKt.EZpvd(C59454zhO.zLjUOn((java.lang.CharSequence) putField.EZpvd())) && OLrzqt(putField.EZpvd());
    }

    public static final boolean AEQbTJ(@NotNull PutField putField) {
        Intrinsics.checkNotNullParameter(putField, "");
        if (CharsKt__CharJVMKt.EZpvd(C59454zhO.zLjUOn((java.lang.CharSequence) putField.EZpvd()))) {
            Intrinsics.checkNotNullExpressionValue(putField.EZpvd().substring(1), "");
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) r2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean djBIcL(@NotNull PutField putField) {
        Intrinsics.checkNotNullParameter(putField, "");
        return CharsKt__CharJVMKt.EZpvd(C59454zhO.zLjUOn((java.lang.CharSequence) putField.EZpvd())) && OLrzqt(StringsKt__StringsKt.getFieldNames((java.lang.CharSequence) putField.EZpvd()).toString());
    }

    public static final boolean OLrzqt(java.lang.String str) {
        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, '=', false, 2, (java.lang.Object) null)) {
            return false;
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new char[]{'='}, false, 2, 2, (java.lang.Object) null);
        return listSplit$default.size() == 2 && StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) listSplit$default.get(0)).toString().length() > 0;
    }
}
