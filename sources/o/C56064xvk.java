package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56064xvk {
    public static final C56064xvk copydefault = new C56064xvk();

    private C56064xvk() {
    }

    public final java.util.ArrayList<java.lang.String> AEQbTJ(int i) {
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String strRemS$default = C33129mqd.remS$default(100, java.lang.Integer.valueOf(i), 0, null, roundingMode, 4, null);
        java.lang.String strDivS$default = C33129mqd.divS$default(100, java.lang.Integer.valueOf(i), 0, null, roundingMode, 4, null);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(strDivS$default);
        }
        if (C33129mqd.valueOf(strRemS$default, 1) && (!arrayList.isEmpty())) {
            arrayList.set(yDY.AuCTel(arrayList), C33129mqd.addS$default(strDivS$default, strRemS$default, null, null, null, 14, null));
        } else {
            int iAhwBna = C33129mqd.AhwBna(strRemS$default);
            if (1 <= iAhwBna) {
                int i3 = 1;
                while (true) {
                    arrayList.set(arrayList.size() - i3, C33129mqd.addS$default(strDivS$default, 1, null, null, null, 14, null));
                    if (i3 == iAhwBna) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    public final boolean copydefault(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return Intrinsics.EZpvd(AEQbTJ(list.size()), list);
    }
}
