package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pXg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38397pXg {
    public static /* synthetic */ void registerDebugItem$default(java.lang.String str, int i, int i2, Function1 function1, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        OLrzqt(str, i, i2, function1);
    }

    public static final void OLrzqt(@NotNull java.lang.String str, int i, int i2, @NotNull Function1<? super android.content.Context, Unit> function1) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<T> it = ActivityC38392pXb.Companion.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((pWV) next).AEQbTJ(), (java.lang.Object) str)) {
                    break;
                }
            }
        }
        if (next == null) {
            ActivityC38392pXb.Companion.AEQbTJ().add(new pWV(str, i, i2, function1));
        }
    }
}
