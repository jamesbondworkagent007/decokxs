package o;

import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class iCH {
    public static /* synthetic */ java.util.List mapToUserInputList$default(java.util.List list, Function1 function1, Function1 function12, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return AEQbTJ(list, function1, function12, str);
    }

    public static final <T> java.lang.Integer OLrzqt(@NotNull java.util.List<? extends T> list, @NotNull java.lang.String str, @NotNull Function1<? super T, java.lang.String> function1, @NotNull Function1<? super T, java.lang.Integer> function12) {
        int i;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        java.util.Iterator<? extends T> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (Intrinsics.EZpvd((java.lang.Object) function1.invoke(it.next()), (java.lang.Object) str)) {
                break;
            }
            i2++;
        }
        if (i2 < 0 || list.size() <= (i = i2 + 1)) {
            return null;
        }
        return function12.invoke(list.get(i));
    }

    public static final <T> java.util.List<InvestTokenWithAmount> AEQbTJ(@NotNull java.util.List<? extends T> list, @NotNull Function1<? super T, java.lang.Long> function1, @NotNull Function1<? super T, java.lang.String> function12, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (T t : list) {
            arrayList.add(new InvestTokenWithAmount(function1.invoke(t).longValue(), str == null ? "0" : str, (java.lang.String) null, false, false, (java.lang.String) null, function12.invoke(t), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435388, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }
}
