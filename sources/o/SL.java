package o;

import androidx.core.util.Pools;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class SL {
    public static final Activity<java.lang.Object> EZpvd = new Activity<java.lang.Object>() { // from class: o.SL.1
        @Override // o.SL.Activity
        public void EZpvd(@androidx.annotation.NonNull java.lang.Object obj) {
        }
    };

    public interface Activity<T> {
        void EZpvd(@androidx.annotation.NonNull T t);
    }

    public interface StateListAnimator<T> {
        T KWHzl();
    }

    public interface TaskDescription {
        SJ valueOf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static <T> Activity<T> AEQbTJ() {
        return (Activity<T>) EZpvd;
    }

    private SL() {
    }

    public static <T extends TaskDescription> Pools.Pool<T> copydefault(int i, @androidx.annotation.NonNull StateListAnimator<T> stateListAnimator) {
        return EZpvd(new Pools.SynchronizedPool(i), stateListAnimator);
    }

    public static <T> Pools.Pool<java.util.List<T>> OLrzqt() {
        return OLrzqt(20);
    }

    public static <T> Pools.Pool<java.util.List<T>> OLrzqt(int i) {
        return OLrzqt(new Pools.SynchronizedPool(i), new StateListAnimator<java.util.List<T>>() { // from class: o.SL.2
            /* JADX DEBUG: Method merged with bridge method: KWHzl()Ljava/lang/Object; */
            @Override // o.SL.StateListAnimator
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public java.util.List<T> KWHzl() {
                return new java.util.ArrayList();
            }
        }, new Activity<java.util.List<T>>() { // from class: o.SL.5
            /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)V */
            @Override // o.SL.Activity
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public void EZpvd(@androidx.annotation.NonNull java.util.List<T> list) {
                list.clear();
            }
        });
    }

    public static <T extends TaskDescription> Pools.Pool<T> EZpvd(@androidx.annotation.NonNull Pools.Pool<T> pool, @androidx.annotation.NonNull StateListAnimator<T> stateListAnimator) {
        return OLrzqt(pool, stateListAnimator, AEQbTJ());
    }

    public static <T> Pools.Pool<T> OLrzqt(@androidx.annotation.NonNull Pools.Pool<T> pool, @androidx.annotation.NonNull StateListAnimator<T> stateListAnimator, @androidx.annotation.NonNull Activity<T> activity) {
        return new ActionBar(pool, stateListAnimator, activity);
    }

    public static final class ActionBar<T> implements Pools.Pool<T> {
        public final Activity<T> AEQbTJ;
        public final StateListAnimator<T> EZpvd;
        public final Pools.Pool<T> KWHzl;

        public ActionBar(@androidx.annotation.NonNull Pools.Pool<T> pool, @androidx.annotation.NonNull StateListAnimator<T> stateListAnimator, @androidx.annotation.NonNull Activity<T> activity) {
            this.KWHzl = pool;
            this.EZpvd = stateListAnimator;
            this.AEQbTJ = activity;
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            T tAcquire = this.KWHzl.acquire();
            if (tAcquire == null) {
                tAcquire = this.EZpvd.KWHzl();
                if (android.util.Log.isLoggable("FactoryPools", 2)) {
                    Objects.toString(tAcquire.getClass());
                }
            }
            if (tAcquire instanceof TaskDescription) {
                ((TaskDescription) tAcquire).valueOf().OLrzqt(false);
            }
            return tAcquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(@androidx.annotation.NonNull T t) {
            if (t instanceof TaskDescription) {
                ((TaskDescription) t).valueOf().OLrzqt(true);
            }
            this.AEQbTJ.EZpvd(t);
            return this.KWHzl.release(t);
        }
    }
}
