package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tWp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46499tWp {
    public static final C46492tWi KWHzl(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return null;
        }
        Ref.DoubleRef doubleRef = new Ref.DoubleRef();
        doubleRef.element = Double.MAX_VALUE;
        Ref.DoubleRef doubleRef2 = new Ref.DoubleRef();
        doubleRef2.element = -1.7976931348623157E308d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (java.lang.Object obj : list) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            double dGEmmrt = C56548yJl.gEmmrt(doubleRef.element, C33129mqd.AEQbTJ(str));
            if (dGEmmrt == C33129mqd.AEQbTJ(str) && dGEmmrt != doubleRef.element) {
                i = i3;
            }
            doubleRef.element = dGEmmrt;
            double dKWHzl = C56548yJl.KWHzl(doubleRef2.element, C33129mqd.AEQbTJ(str));
            if (dKWHzl == C33129mqd.AEQbTJ(str)) {
                i2 = i3;
            }
            doubleRef2.element = dKWHzl;
            i3++;
        }
        return new C46492tWi(C33129mqd.gEmmrt(java.lang.Double.valueOf(doubleRef.element)), C33129mqd.gEmmrt(java.lang.Double.valueOf(doubleRef2.element)), i, i2);
    }
}
