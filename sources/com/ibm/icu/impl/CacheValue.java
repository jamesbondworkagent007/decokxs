package com.ibm.icu.impl;

import com.ibm.icu.util.ICUException;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CacheValue<V> {
    public static volatile Strength AEQbTJ = Strength.SOFT;
    public static final CacheValue copydefault = new Application();

    public enum Strength {
        STRONG,
        SOFT
    }

    public abstract V AEQbTJ();

    public abstract V KWHzl(V v);

    public boolean KWHzl() {
        return false;
    }

    public static boolean copydefault() {
        return AEQbTJ == Strength.STRONG;
    }

    public static <V> CacheValue<V> EZpvd(V v) {
        return v == null ? copydefault : AEQbTJ == Strength.STRONG ? new Activity(v) : new TaskDescription(v);
    }

    public static final class Application<V> extends CacheValue<V> {
        @Override // com.ibm.icu.impl.CacheValue
        public V AEQbTJ() {
            return null;
        }

        @Override // com.ibm.icu.impl.CacheValue
        public boolean KWHzl() {
            return true;
        }

        private Application() {
        }

        @Override // com.ibm.icu.impl.CacheValue
        public V KWHzl(V v) {
            if (v == null) {
                return null;
            }
            throw new ICUException("resetting a null value to a non-null value");
        }
    }

    public static final class Activity<V> extends CacheValue<V> {
        public V EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.ibm.icu.impl.CacheValue
        public V AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.ibm.icu.impl.CacheValue
        public V KWHzl(V v) {
            return this.EZpvd;
        }

        public Activity(V v) {
            this.EZpvd = v;
        }
    }

    public static final class TaskDescription<V> extends CacheValue<V> {
        public volatile Reference<V> EZpvd;

        public TaskDescription(V v) {
            this.EZpvd = new SoftReference(v);
        }

        @Override // com.ibm.icu.impl.CacheValue
        public V AEQbTJ() {
            return this.EZpvd.get();
        }

        @Override // com.ibm.icu.impl.CacheValue
        public V KWHzl(V v) {
            synchronized (this) {
                V v2 = this.EZpvd.get();
                if (v2 != null) {
                    return v2;
                }
                this.EZpvd = new SoftReference(v);
                return v;
            }
        }
    }
}
