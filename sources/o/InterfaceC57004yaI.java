package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yaI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC57004yaI {
    public static final ActionBar Companion = ActionBar.KWHzl;

    InterfaceC57001yaF OLrzqt();

    InterfaceC57029yah copydefault();

    /* JADX INFO: renamed from: o.yaI$ActionBar */
    public static final class ActionBar {
        public static volatile InterfaceC57004yaI AEQbTJ;
        public static final /* synthetic */ ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }

        public static /* synthetic */ InterfaceC57004yaI getInstance$default(ActionBar actionBar, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C57000yaE.Companion.OLrzqt();
            }
            return actionBar.AEQbTJ(context);
        }

        public final InterfaceC57004yaI AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            InterfaceC57004yaI c57006yaK = AEQbTJ;
            if (c57006yaK == null) {
                synchronized (this) {
                    c57006yaK = AEQbTJ;
                    if (c57006yaK == null) {
                        c57006yaK = new C57006yaK(context);
                        AEQbTJ = c57006yaK;
                    }
                }
            }
            return c57006yaK;
        }
    }
}
