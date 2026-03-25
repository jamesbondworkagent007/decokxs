package o;

import o.NT;

/* JADX INFO: loaded from: classes2.dex */
public class NR {
    public static final NT.ActionBar<?> copydefault = new NT.ActionBar<java.lang.Object>() { // from class: o.NR.4
        @Override // o.NT.ActionBar
        public NT<java.lang.Object> EZpvd(@androidx.annotation.NonNull java.lang.Object obj) {
            return new ActionBar(obj);
        }

        @Override // o.NT.ActionBar
        public java.lang.Class<java.lang.Object> OLrzqt() {
            throw new java.lang.UnsupportedOperationException("Not implemented");
        }
    };
    public final java.util.Map<java.lang.Class<?>, NT.ActionBar<?>> KWHzl = new java.util.HashMap();

    public void OLrzqt(@androidx.annotation.NonNull NT.ActionBar<?> actionBar) {
        synchronized (this) {
            this.KWHzl.put(actionBar.OLrzqt(), actionBar);
        }
    }

    public <T> NT<T> AEQbTJ(@androidx.annotation.NonNull T t) {
        NT<T> nt;
        synchronized (this) {
            SE.OLrzqt(t);
            NT.ActionBar<?> actionBar = this.KWHzl.get(t.getClass());
            if (actionBar == null) {
                java.util.Iterator<NT.ActionBar<?>> it = this.KWHzl.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    NT.ActionBar<?> next = it.next();
                    if (next.OLrzqt().isAssignableFrom(t.getClass())) {
                        actionBar = next;
                        break;
                    }
                }
            }
            if (actionBar == null) {
                actionBar = copydefault;
            }
            nt = (NT<T>) actionBar.EZpvd(t);
        }
        return nt;
    }

    public static final class ActionBar implements NT<java.lang.Object> {
        public final java.lang.Object KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NT
        public java.lang.Object AEQbTJ() {
            return this.KWHzl;
        }

        @Override // o.NT
        public void EZpvd() {
        }

        public ActionBar(@androidx.annotation.NonNull java.lang.Object obj) {
            this.KWHzl = obj;
        }
    }
}
