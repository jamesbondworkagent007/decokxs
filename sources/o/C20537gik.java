package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AbstractC8610bFv;

/* JADX INFO: renamed from: o.gik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20537gik<T extends AbstractC8610bFv<?>> extends AbstractC20481ghh<T> {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.gik$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gik.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: o.ghh$Activity */
        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: o.ghh$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C20537gik newInstance$default(StateListAnimator stateListAnimator, java.util.List list, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = null;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            if (list != null) {
                AbstractC20481ghh.Companion.KWHzl(list);
            }
            if (function1 != null) {
                AbstractC20481ghh.Companion.OLrzqt(function1);
            }
            return new C20537gik();
        }
    }
}
