package o;

import com.ibm.icu.util.ICUCloneNotSupportedException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o.adh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7113adh implements java.lang.Cloneable {
    public AtomicInteger AhwBna = new AtomicInteger();

    /* JADX INFO: renamed from: o.adh$ActionBar */
    public static final class ActionBar<T extends C7113adh> implements java.lang.Cloneable {
        public T AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public T OLrzqt() {
            return this.AEQbTJ;
        }

        public ActionBar(T t) {
            this.AEQbTJ = t;
            if (t != null) {
                t.DbNXlk();
            }
        }

        /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public ActionBar<T> clone() {
            try {
                ActionBar<T> actionBar = (ActionBar) super.clone();
                T t = this.AEQbTJ;
                if (t != null) {
                    t.DbNXlk();
                }
                return actionBar;
            } catch (java.lang.CloneNotSupportedException e) {
                throw new ICUCloneNotSupportedException(e);
            }
        }

        public T KWHzl() {
            T t = this.AEQbTJ;
            if (t.isConnected() <= 1) {
                return t;
            }
            T t2 = (T) t.clone();
            t.values();
            this.AEQbTJ = t2;
            t2.DbNXlk();
            return t2;
        }

        public void copydefault() {
            T t = this.AEQbTJ;
            if (t != null) {
                t.values();
                this.AEQbTJ = null;
            }
        }

        public void finalize() throws java.lang.Throwable {
            super.finalize();
            copydefault();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // 
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C7113adh clone() {
        try {
            C7113adh c7113adh = (C7113adh) super.clone();
            c7113adh.AhwBna = new AtomicInteger();
            return c7113adh;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new ICUCloneNotSupportedException(e);
        }
    }

    public final void DbNXlk() {
        this.AhwBna.incrementAndGet();
    }

    public final void values() {
        this.AhwBna.decrementAndGet();
    }

    public final int isConnected() {
        return this.AhwBna.get();
    }
}
