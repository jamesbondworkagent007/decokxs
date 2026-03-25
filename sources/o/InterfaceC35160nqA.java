package o;

import com.okinc.homepage.bean.InteractionList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC35160nqA extends InterfaceC43217rlC {
    public static final ActionBar Companion = ActionBar.KWHzl;

    androidx.fragment.app.DialogFragment EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z, boolean z2, Function0<Unit> function0);

    InterfaceC35168nqI KWHzl(@NotNull C35165nqF c35165nqF);

    AbstractC58185ywX<java.lang.Boolean> KWHzl(@NotNull InteractionList interactionList);

    void KWHzl(@NotNull android.app.Activity activity);

    boolean OLrzqt();

    /* JADX INFO: renamed from: o.nqA$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.nqA$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.nqA */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.fragment.app.DialogFragment showRechargeGuideFragment$default(InterfaceC35160nqA interfaceC35160nqA, androidx.fragment.app.FragmentManager fragmentManager, boolean z, boolean z2, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showRechargeGuideFragment");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            if ((i & 8) != 0) {
                function0 = null;
            }
            return interfaceC35160nqA.EZpvd(fragmentManager, z, z2, function0);
        }

        public static /* synthetic */ InterfaceC35168nqI createIsolatedPopupPriorityManager$default(InterfaceC35160nqA interfaceC35160nqA, C35165nqF c35165nqF, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createIsolatedPopupPriorityManager");
            }
            if ((i & 1) != 0) {
                c35165nqF = C35165nqF.Companion.KWHzl();
            }
            return interfaceC35160nqA.KWHzl(c35165nqF);
        }
    }
}
