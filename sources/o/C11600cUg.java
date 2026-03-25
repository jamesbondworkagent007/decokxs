package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cUg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11600cUg {
    public static final boolean KWHzl(int i) {
        return i != 0;
    }

    public static final int OLrzqt(boolean z) {
        return z ? 1 : 0;
    }

    public static final int copydefault(java.lang.Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final long copydefault(java.lang.Long l) {
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final java.util.List<java.lang.String> copydefault(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.List<java.lang.String> listSplit$default = str != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{str2}, false, 0, 6, (java.lang.Object) null) : null;
        return listSplit$default == null ? yDY.AhwBna() : listSplit$default;
    }

    public static final <T> java.util.List<T> KWHzl(java.lang.String str, @NotNull java.lang.String str2, @NotNull Function1<? super java.lang.String, ? extends T> function1) {
        java.util.ArrayList arrayList;
        java.util.List listSplit$default;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (str == null || (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{str2}, false, 0, 6, (java.lang.Object) null)) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
            java.util.Iterator<T> it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(function1.invoke(it.next()));
            }
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    public static final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Regex("^(0x|0X)?[0-9a-fA-F]+$").matches(str);
    }
}
