package o;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface LI {
    Future<LI> AEQbTJ(LF lf, LK lk);

    LJ AEQbTJ();

    Future<LI> EZpvd(LF lf);

    Future<LI> KWHzl(LF lf);

    LP KWHzl(@NotNull java.lang.String str, LP lp);

    LF OLrzqt();

    java.util.Map<java.lang.String, LP> copydefault();

    LP copydefault(@NotNull java.lang.String str);

    public static final class StateListAnimator {
        public static /* synthetic */ Future start$default(LI li, LF lf, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i & 1) != 0) {
                lf = null;
            }
            return li.EZpvd(lf);
        }

        public static /* synthetic */ Future fetch$default(LI li, LF lf, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
            }
            if ((i & 1) != 0) {
                lf = null;
            }
            return li.KWHzl(lf);
        }

        public static /* synthetic */ Future fetch$default(LI li, LF lf, LK lk, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
            }
            if ((i & 1) != 0) {
                lf = null;
            }
            if ((i & 2) != 0) {
                lk = null;
            }
            return li.AEQbTJ(lf, lk);
        }

        public static /* synthetic */ LP variant$default(LI li, java.lang.String str, LP lp, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: variant");
            }
            if ((i & 2) != 0) {
                lp = null;
            }
            return li.KWHzl(str, lp);
        }
    }
}
