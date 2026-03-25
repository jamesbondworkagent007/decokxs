package o;

/* JADX INFO: loaded from: classes2.dex */
public class RK {
    public final java.util.List<StateListAnimator<?>> copydefault = new java.util.ArrayList();

    public <T> NI<T> KWHzl(@androidx.annotation.NonNull java.lang.Class<T> cls) {
        synchronized (this) {
            for (StateListAnimator<?> stateListAnimator : this.copydefault) {
                if (stateListAnimator.OLrzqt(cls)) {
                    return (NI<T>) stateListAnimator.AEQbTJ;
                }
            }
            return null;
        }
    }

    public <T> void AEQbTJ(@androidx.annotation.NonNull java.lang.Class<T> cls, @androidx.annotation.NonNull NI<T> ni) {
        synchronized (this) {
            this.copydefault.add(new StateListAnimator<>(cls, ni));
        }
    }

    public static final class StateListAnimator<T> {
        public final NI<T> AEQbTJ;
        public final java.lang.Class<T> OLrzqt;

        public StateListAnimator(@androidx.annotation.NonNull java.lang.Class<T> cls, @androidx.annotation.NonNull NI<T> ni) {
            this.OLrzqt = cls;
            this.AEQbTJ = ni;
        }

        public boolean OLrzqt(@androidx.annotation.NonNull java.lang.Class<?> cls) {
            return this.OLrzqt.isAssignableFrom(cls);
        }
    }
}
