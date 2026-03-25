package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bTq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC9347bTq {
    public static final StateListAnimator Companion = StateListAnimator.KWHzl;

    int fIwbmz();

    java.lang.Integer fJNWhG();

    /* JADX INFO: renamed from: o.bTq$StateListAnimator */
    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.bTq$Application */
    public static final class Application {
        public static int copydefault(@NotNull InterfaceC9347bTq interfaceC9347bTq) {
            java.lang.Integer numFJNWhG = interfaceC9347bTq.fJNWhG();
            if (numFJNWhG != null) {
                return numFJNWhG.intValue();
            }
            return 3;
        }
    }
}
