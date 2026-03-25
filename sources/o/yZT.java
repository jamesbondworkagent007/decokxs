package o;

import o.yZU;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yZT {
    public abstract int EZpvd();

    public java.lang.String toString() {
        return getClass().getSimpleName();
    }

    public static final class Application extends yZT {
        public static final int AEQbTJ;
        public static final Application OLrzqt = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.yZT
        public int EZpvd() {
            return AEQbTJ;
        }

        private Application() {
        }

        static {
            yZU.Application application = yZU.AYXKKw;
            AEQbTJ = (~(application.AhwBna() | application.EZpvd())) & application.KWHzl();
        }
    }

    public static final class Activity extends yZT {
        public static final Activity OLrzqt = new Activity();

        @Override // o.yZT
        public int EZpvd() {
            return 0;
        }

        private Activity() {
        }
    }
}
