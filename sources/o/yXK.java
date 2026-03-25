package o;

import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class yXK extends yXM {
    public final yXQ EZpvd;

    public yXQ EZpvd() {
        return OLrzqt(this.EZpvd);
    }

    public int hashCode() {
        return EZpvd().hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        return EZpvd().equals(obj);
    }

    public java.lang.String toString() {
        return EZpvd().toString();
    }

    public static class Activity<K> implements Map.Entry<K, java.lang.Object> {
        public Map.Entry<K, yXK> copydefault;

        public Activity(Map.Entry<K, yXK> entry) {
            this.copydefault = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.copydefault.getKey();
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getValue() {
            yXK value = this.copydefault.getValue();
            if (value == null) {
                return null;
            }
            return value.EZpvd();
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object obj) {
            if (!(obj instanceof yXQ)) {
                throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return this.copydefault.getValue().copydefault((yXQ) obj);
        }
    }

    public static class StateListAnimator<K> implements java.util.Iterator<Map.Entry<K, java.lang.Object>> {
        public java.util.Iterator<Map.Entry<K, java.lang.Object>> OLrzqt;

        public StateListAnimator(java.util.Iterator<Map.Entry<K, java.lang.Object>> it) {
            this.OLrzqt = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.OLrzqt.hasNext();
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, java.lang.Object> next() {
            Map.Entry<K, java.lang.Object> next = this.OLrzqt.next();
            return next.getValue() instanceof yXK ? new Activity(next) : next;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.OLrzqt.remove();
        }
    }
}
