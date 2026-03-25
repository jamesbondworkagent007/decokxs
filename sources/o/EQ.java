package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EQ {
    public static final java.lang.String KWHzl(@NotNull C5101Et c5101Et) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(c5101Et, "");
        java.util.Iterator<T> it = c5101Et.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC5096Eo) next).getClass() == EX.class) {
                break;
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        if (interfaceC5096Eo != null) {
            return ((EX) interfaceC5096Eo).KWHzl();
        }
        throw new java.lang.IllegalArgumentException(("Expected to find trait " + C56524yIo.AEQbTJ(EX.class) + " in " + c5101Et + " but was not present.").toString());
    }
}
