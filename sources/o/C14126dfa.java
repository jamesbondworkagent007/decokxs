package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dfa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14126dfa {
    public static final C14126dfa KWHzl = new C14126dfa();

    /* JADX INFO: renamed from: o.dfa$StateListAnimator */
    public static final class StateListAnimator {
        public int KWHzl = -1;
        public boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.OLrzqt;
        }
    }

    private C14126dfa() {
    }

    public final StateListAnimator copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        StateListAnimator stateListAnimator = new StateListAnimator();
        if (str.length() >= 6) {
            stateListAnimator.KWHzl(true);
        }
        return stateListAnimator;
    }
}
