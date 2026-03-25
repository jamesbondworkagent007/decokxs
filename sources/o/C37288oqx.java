package o;

import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37288oqx {
    public static final boolean KWHzl(@NotNull C37246oqH c37246oqH, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c37246oqH, "");
        return (str == null || str.length() == 0 || c37246oqH.OLrzqt().isEmpty() || (!StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c37246oqH.EZpvd(), (java.lang.CharSequence) str, true) && !EZpvd(c37246oqH, str))) ? false : true;
    }

    public static final boolean EZpvd(C37246oqH c37246oqH, java.lang.String str) {
        java.lang.Object next;
        java.util.Iterator<T> it = c37246oqH.OLrzqt().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AEQbTJ(((PhoneRelation) next).getRawNumber(), str)) {
                break;
            }
        }
        return next != null;
    }

    public static final C37246oqH copydefault(@NotNull C37246oqH c37246oqH, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c37246oqH, "");
        if (str == null || str.length() == 0 || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c37246oqH.EZpvd(), (java.lang.CharSequence) str, true)) {
            return c37246oqH;
        }
        java.util.List<PhoneRelation> listOLrzqt = c37246oqH.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOLrzqt) {
            if (AEQbTJ(((PhoneRelation) obj).getRawNumber(), str)) {
                arrayList.add(obj);
            }
        }
        return C37246oqH.copy$default(c37246oqH, null, null, arrayList, 3, null);
    }

    public static final boolean AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (str == null || str.length() == 0) {
            return false;
        }
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) new Regex("\\s").replace(str, ""), (java.lang.CharSequence) new Regex("\\s").replace(str2, ""), false, 2, (java.lang.Object) null);
    }
}
