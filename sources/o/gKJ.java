package o;

import java.util.LinkedList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class gKJ<T> {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.gKQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return gKJ.EZpvd();
        }
    });

    public final LinkedList<T> OLrzqt() {
        return (LinkedList) this.OLrzqt.getValue();
    }

    public static final LinkedList EZpvd() {
        return new LinkedList();
    }

    public final boolean OLrzqt(T t) {
        return OLrzqt().add(t);
    }

    public final T AEQbTJ() {
        return OLrzqt().poll();
    }

    public final boolean copydefault() {
        return OLrzqt().isEmpty();
    }
}
