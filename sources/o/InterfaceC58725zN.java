package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC56482yH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC58725zN extends InterfaceC56482yH<java.lang.String> {
    public static final ActionBar AEQbTJ = ActionBar.AEQbTJ;

    /* JADX INFO: renamed from: o.zN$TaskDescription */
    public static final class TaskDescription {
        public static java.lang.String AEQbTJ(@NotNull InterfaceC58725zN interfaceC58725zN, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return (java.lang.String) InterfaceC56482yH.Application.KWHzl(interfaceC58725zN, str);
        }

        public static void EZpvd(@NotNull InterfaceC58725zN interfaceC58725zN, @NotNull Function2<? super java.lang.String, ? super java.util.List<java.lang.String>, Unit> function2) {
            Intrinsics.checkNotNullParameter(function2, "");
            InterfaceC56482yH.Application.OLrzqt(interfaceC58725zN, function2);
        }
    }

    /* JADX INFO: renamed from: o.zN$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar AEQbTJ = new ActionBar();
        public static final InterfaceC58725zN OLrzqt = C58698zM.OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC58725zN EZpvd() {
            return OLrzqt;
        }

        private ActionBar() {
        }

        public final InterfaceC58725zN copydefault(@NotNull Function1<? super C58617zJ, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            C58617zJ c58617zJ = new C58617zJ();
            function1.invoke(c58617zJ);
            return c58617zJ.AYXKKw();
        }
    }
}
