package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27491jwG {
    public static /* synthetic */ java.lang.String getRightString$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = OrderDetailListItem.SLIP_OUT;
        }
        return AEQbTJ(str, str2);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) JwtUtilsKt.JWT_DELIMITER, false, 2, (java.lang.Object) null) ? C33129mqd.formatS$default(str, java.lang.Integer.valueOf(C33129mqd.AhwBna(str2)), null, null, 6, null) : str;
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, JwtUtilsKt.JWT_DELIMITER, 0, false, 6, (java.lang.Object) null) != 0) {
            return str;
        }
        return "0" + str;
    }

    public static final <T> java.lang.String AEQbTJ(@NotNull java.lang.Iterable<? extends T> iterable, @NotNull Function1<? super T, java.lang.String> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<? extends T> it = iterable.iterator();
        java.lang.String strAddS$default = "0.0";
        while (it.hasNext()) {
            strAddS$default = C33129mqd.addS$default(strAddS$default, function1.invoke(it.next()), null, null, null, 14, null);
        }
        return strAddS$default;
    }
}
