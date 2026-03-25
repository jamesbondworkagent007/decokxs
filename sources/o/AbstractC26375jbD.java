package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C27284jsL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jbD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC26375jbD {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jbD.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC26375jbD(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.jbD$ActionBar */
    public static final class ActionBar extends AbstractC26375jbD {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    private AbstractC26375jbD() {
    }

    /* JADX INFO: renamed from: o.jbD$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity extends AbstractC26375jbD {
        public final java.util.List<C27284jsL.StateListAnimator> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C27284jsL.StateListAnimator> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.util.List<C27284jsL.StateListAnimator> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
        }
    }

    /* JADX INFO: renamed from: o.jbD$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application extends AbstractC26375jbD {
        public static final Application KWHzl = new Application();

        private Application() {
            super(null);
        }
    }
}
