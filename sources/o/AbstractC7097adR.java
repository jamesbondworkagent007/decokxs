package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.adR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7097adR<K, V> {
    public ConcurrentHashMap<K, ActionBar<K, V>> EZpvd;
    public ReferenceQueue<V> copydefault;

    public K EZpvd(K k) {
        return k;
    }

    public abstract V KWHzl(K k);

    public AbstractC7097adR() {
        this(16, 0.75f, 16);
    }

    public AbstractC7097adR(int i, float f, int i2) {
        this.copydefault = new ReferenceQueue<>();
        this.EZpvd = new ConcurrentHashMap<>(i, f, i2);
    }

    public V copydefault(K k) {
        copydefault();
        ActionBar<K, V> actionBar = this.EZpvd.get(k);
        V v = actionBar != null ? actionBar.get() : null;
        if (v != null) {
            return v;
        }
        K kEZpvd = EZpvd(k);
        V vKWHzl = KWHzl(kEZpvd);
        if (kEZpvd == null || vKWHzl == null) {
            return null;
        }
        ActionBar<K, V> actionBar2 = new ActionBar<>(kEZpvd, vKWHzl, this.copydefault);
        while (v == null) {
            copydefault();
            ActionBar<K, V> actionBarPutIfAbsent = this.EZpvd.putIfAbsent(kEZpvd, actionBar2);
            if (actionBarPutIfAbsent == null) {
                return vKWHzl;
            }
            v = actionBarPutIfAbsent.get();
        }
        return v;
    }

    public final void copydefault() {
        while (true) {
            ActionBar actionBar = (ActionBar) this.copydefault.poll();
            if (actionBar == null) {
                return;
            } else {
                this.EZpvd.remove(actionBar.KWHzl());
            }
        }
    }

    /* JADX INFO: renamed from: o.adR$ActionBar */
    public static class ActionBar<K, V> extends SoftReference<V> {
        public K OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public K KWHzl() {
            return this.OLrzqt;
        }

        public ActionBar(K k, V v, ReferenceQueue<V> referenceQueue) {
            super(v, referenceQueue);
            this.OLrzqt = k;
        }
    }
}
