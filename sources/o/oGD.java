package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oGD {
    public static final Application Companion = new Application(null);

    @yCM
    public oGD() {
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final C35254nrp EZpvd(@NotNull java.util.List<C35254nrp> list, long j, java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C35254nrp c35254nrp = (C35254nrp) next;
            if (c35254nrp.OLrzqt().getSeq() == j || (str != null && Intrinsics.EZpvd((java.lang.Object) c35254nrp.OLrzqt().getClientMessageId(), (java.lang.Object) str))) {
                break;
            }
        }
        return (C35254nrp) next;
    }
}
