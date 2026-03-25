package o;

import com.amplifyframework.core.model.ModelIdentifier;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectStreamClass {
    public static final java.lang.String KWHzl(@NotNull java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        if (num != null) {
            num.intValue();
            sb.append(" on line " + num + '.');
        }
        sb.append(" See https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-configure.html for file format details.");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ java.lang.String contextMessage$default(java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return KWHzl(str, num);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new char[]{'='}, false, 2, 2, (java.lang.Object) null);
        return C56390yDp.OLrzqt(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) listSplit$default.get(0)).toString(), StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) listSplit$default.get(1)).toString());
    }

    public static final java.util.List<java.lang.String> copydefault(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString(), new java.lang.String[]{" ", "\t"}, false, i, 2, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listSplit$default) {
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) it.next()).toString());
        }
        return arrayList2;
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(KWHzl(str, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER), ";");
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(KWHzl(str, " #"), " ;");
    }

    public static final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        return (java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{str2}, false, 2, 2, (java.lang.Object) null).get(0);
    }

    public static final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        for (int i = 0; i < str.length(); i++) {
            if (CharsKt__CharJVMKt.EZpvd(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
