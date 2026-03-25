package o;

import com.okinc.kline.library.indicator.Expression;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pDS {
    public static final pDS OLrzqt = new pDS();

    private pDS() {
    }

    public final java.util.ArrayList<Expression.Parameter> EZpvd(@NotNull java.util.ArrayList<Expression.Parameter> arrayList, @NotNull java.util.ArrayList<Expression.Parameter> arrayList2) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (Expression.Parameter parameter : arrayList) {
            java.util.Iterator<T> it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((Expression.Parameter) next).getName(), (java.lang.Object) parameter.getName())) {
                    break;
                }
            }
            Expression.Parameter parameter2 = (Expression.Parameter) next;
            if (parameter2 != null) {
                parameter2.setColorDefaultValue(parameter.getColorDefaultValue());
                parameter2.setColorBlkDefaultValue(parameter.getColorBlkDefaultValue());
                parameter = parameter2;
            }
            arrayList3.add(parameter);
        }
        return (java.util.ArrayList) CollectionsKt___CollectionsKt.OLrzqt(arrayList3, new java.util.ArrayList());
    }
}
