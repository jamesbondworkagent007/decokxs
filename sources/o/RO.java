package o;

/* JADX INFO: loaded from: classes2.dex */
public class RO {
    public final java.util.List<ActionBar<?>> OLrzqt = new java.util.ArrayList();

    public <Z> void AEQbTJ(@androidx.annotation.NonNull java.lang.Class<Z> cls, @androidx.annotation.NonNull NP<Z> np) {
        synchronized (this) {
            this.OLrzqt.add(new ActionBar<>(cls, np));
        }
    }

    public <Z> NP<Z> copydefault(@androidx.annotation.NonNull java.lang.Class<Z> cls) {
        synchronized (this) {
            int size = this.OLrzqt.size();
            for (int i = 0; i < size; i++) {
                ActionBar<?> actionBar = this.OLrzqt.get(i);
                if (actionBar.AEQbTJ(cls)) {
                    return (NP<Z>) actionBar.OLrzqt;
                }
            }
            return null;
        }
    }

    public static final class ActionBar<T> {
        public final java.lang.Class<T> AEQbTJ;
        public final NP<T> OLrzqt;

        public ActionBar(@androidx.annotation.NonNull java.lang.Class<T> cls, @androidx.annotation.NonNull NP<T> np) {
            this.AEQbTJ = cls;
            this.OLrzqt = np;
        }

        public boolean AEQbTJ(@androidx.annotation.NonNull java.lang.Class<?> cls) {
            return this.AEQbTJ.isAssignableFrom(cls);
        }
    }
}
