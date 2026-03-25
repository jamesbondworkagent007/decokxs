package o;

/* JADX INFO: loaded from: classes2.dex */
public final class Sz {

    public interface Activity<T> {
        T OLrzqt();
    }

    private Sz() {
    }

    public static <T> Activity<T> copydefault(final Activity<T> activity) {
        return new Activity<T>() { // from class: o.Sz.2
            public volatile T OLrzqt;

            @Override // o.Sz.Activity
            public T OLrzqt() {
                if (this.OLrzqt == null) {
                    synchronized (this) {
                        if (this.OLrzqt == null) {
                            this.OLrzqt = (T) SE.OLrzqt(activity.OLrzqt());
                        }
                    }
                }
                return this.OLrzqt;
            }
        };
    }
}
