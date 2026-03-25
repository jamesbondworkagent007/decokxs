package o;

/* JADX INFO: loaded from: classes2.dex */
public interface YM {

    public static abstract class Activity {
        public long AEQbTJ;
        public long copydefault;
    }

    public static abstract class Application {
        public long OLrzqt;
    }

    public static abstract class StateListAnimator {
        public int AEQbTJ;
        public int AYXKKw;
        public long AhwBna;
        public int EZpvd;
        public boolean KWHzl;
        public int OLrzqt;
        public long copydefault;
        public int djBIcL;
        public int gEmmrt;

        public abstract Application AEQbTJ(int i) throws java.io.IOException;

        public abstract TaskDescription AEQbTJ(long j) throws java.io.IOException;

        public abstract Activity copydefault(long j, int i) throws java.io.IOException;
    }

    public static abstract class TaskDescription {
        public long EZpvd;
        public long KWHzl;
        public long OLrzqt;
        public long copydefault;
    }
}
