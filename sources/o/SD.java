package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class SD<T, Y> {
    public final java.util.Map<T, ActionBar<Y>> KWHzl = new LinkedHashMap(100, 0.75f, true);
    public final long OLrzqt;
    public long copydefault;
    public long valueOf;

    public int KWHzl(@androidx.annotation.Nullable Y y) {
        return 1;
    }

    public void KWHzl(@androidx.annotation.NonNull T t, @androidx.annotation.Nullable Y y) {
    }

    public SD(long j) {
        this.OLrzqt = j;
        this.valueOf = j;
    }

    public long OLrzqt() {
        long j;
        synchronized (this) {
            j = this.valueOf;
        }
        return j;
    }

    public Y AEQbTJ(@androidx.annotation.NonNull T t) {
        Y y;
        synchronized (this) {
            ActionBar<Y> actionBar = this.KWHzl.get(t);
            y = actionBar != null ? actionBar.copydefault : null;
        }
        return y;
    }

    public Y copydefault(@androidx.annotation.NonNull T t, @androidx.annotation.Nullable Y y) {
        synchronized (this) {
            int iKWHzl = KWHzl(y);
            long j = iKWHzl;
            if (j >= this.valueOf) {
                KWHzl(t, y);
                return null;
            }
            if (y != null) {
                this.copydefault += j;
            }
            ActionBar<Y> actionBarPut = this.KWHzl.put(t, y == null ? null : new ActionBar<>(y, iKWHzl));
            if (actionBarPut != null) {
                this.copydefault -= (long) actionBarPut.OLrzqt;
                if (!actionBarPut.copydefault.equals(y)) {
                    KWHzl(t, actionBarPut.copydefault);
                }
            }
            KWHzl();
            return actionBarPut != null ? actionBarPut.copydefault : null;
        }
    }

    public Y OLrzqt(@androidx.annotation.NonNull T t) {
        synchronized (this) {
            ActionBar<Y> actionBarRemove = this.KWHzl.remove(t);
            if (actionBarRemove == null) {
                return null;
            }
            this.copydefault -= (long) actionBarRemove.OLrzqt;
            return actionBarRemove.copydefault;
        }
    }

    public void AEQbTJ() {
        EZpvd(0L);
    }

    public void EZpvd(long j) {
        synchronized (this) {
            while (this.copydefault > j) {
                java.util.Iterator<Map.Entry<T, ActionBar<Y>>> it = this.KWHzl.entrySet().iterator();
                Map.Entry<T, ActionBar<Y>> next = it.next();
                ActionBar<Y> value = next.getValue();
                this.copydefault -= (long) value.OLrzqt;
                T key = next.getKey();
                it.remove();
                KWHzl(key, value.copydefault);
            }
        }
    }

    public final void KWHzl() {
        EZpvd(this.valueOf);
    }

    public static final class ActionBar<Y> {
        public final int OLrzqt;
        public final Y copydefault;

        public ActionBar(Y y, int i) {
            this.copydefault = y;
            this.OLrzqt = i;
        }
    }
}
