package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gKw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19667gKw {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.gKx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19667gKw.AEQbTJ();
        }
    });

    public final java.util.HashMap<java.lang.Integer, gKP> KWHzl() {
        return (java.util.HashMap) this.OLrzqt.getValue();
    }

    public static final java.util.HashMap AEQbTJ() {
        return new java.util.HashMap();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.gKw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addType$default(C19667gKw c19667gKw, int i, int i2, java.lang.String[] strArr, int i3, java.util.Map map, int i4, java.lang.Object obj) {
        if ((i4 & 8) != 0) {
            i3 = -1;
        }
        int i5 = i3;
        if ((i4 & 16) != 0) {
            map = null;
        }
        c19667gKw.copydefault(i, i2, strArr, i5, map);
    }

    public final void copydefault(int i, @androidx.annotation.StringRes int i2, @NotNull java.lang.String[] strArr, int i3, java.util.Map<java.lang.String, ? extends Function1<? super java.lang.String, java.lang.String>> map) {
        Intrinsics.checkNotNullParameter(strArr, "");
        if (i3 != -1) {
            KWHzl().put(java.lang.Integer.valueOf((i * 100) + i3), new gKP(i, i2, strArr, i3, map));
        } else {
            KWHzl().put(java.lang.Integer.valueOf(i), new gKP(i, i2, strArr, 0, map, 8, null));
        }
    }

    public static /* synthetic */ java.lang.String getNotifyStr$default(C19667gKw c19667gKw, android.content.Context context, int i, java.util.List list, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        return c19667gKw.AEQbTJ(context, i, list, i2);
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context, int i, @NotNull java.util.List<java.lang.String> list, int i2) {
        gKP gkp;
        java.lang.String strInvoke;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (i2 != -1) {
            gkp = KWHzl().get(java.lang.Integer.valueOf((i * 100) + i2));
        } else {
            gkp = KWHzl().get(java.lang.Integer.valueOf(i));
        }
        if (gkp == null) {
            if (!C34703nhO.AhwBna(context)) {
                return "";
            }
            throw new java.lang.RuntimeException("must add " + i + " first");
        }
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String[] strArrKWHzl = gkp.KWHzl();
        int length = strArrKWHzl.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            java.lang.String str = strArrKWHzl[i3];
            if (gkp.OLrzqt() == null || !gkp.OLrzqt().containsKey(str)) {
                strInvoke = list.get(i4);
            } else {
                Function1<java.lang.String, java.lang.String> function1 = gkp.OLrzqt().get(str);
                if (function1 == null || (strInvoke = function1.invoke(list.get(i4))) == null) {
                    strInvoke = "";
                }
            }
            map.put(str, strInvoke);
            i3++;
            i4++;
        }
        return C33069mpW.KWHzl(context, gkp.AEQbTJ(), map);
    }
}
