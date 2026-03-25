package o;

import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class OL implements OF {
    public final int AEQbTJ;
    public final java.util.Map<java.lang.Class<?>, OI<?>> EZpvd;
    public int KWHzl;
    public final ActionBar OLrzqt;
    public final OJ<TaskDescription, java.lang.Object> copydefault;
    public final java.util.Map<java.lang.Class<?>, NavigableMap<java.lang.Integer, java.lang.Integer>> valueOf;

    public OL() {
        this.copydefault = new OJ<>();
        this.OLrzqt = new ActionBar();
        this.valueOf = new java.util.HashMap();
        this.EZpvd = new java.util.HashMap();
        this.AEQbTJ = 4194304;
    }

    public OL(int i) {
        this.copydefault = new OJ<>();
        this.OLrzqt = new ActionBar();
        this.valueOf = new java.util.HashMap();
        this.EZpvd = new java.util.HashMap();
        this.AEQbTJ = i;
    }

    @Override // o.OF
    public <T> void EZpvd(T t) {
        synchronized (this) {
            java.lang.Class<?> cls = t.getClass();
            OI<T> oiCopydefault = copydefault((java.lang.Class) cls);
            int iAEQbTJ = oiCopydefault.AEQbTJ(t);
            int iKWHzl = oiCopydefault.KWHzl() * iAEQbTJ;
            if (AEQbTJ(iKWHzl)) {
                TaskDescription taskDescriptionCopydefault = this.OLrzqt.copydefault(iAEQbTJ, cls);
                this.copydefault.copydefault(taskDescriptionCopydefault, t);
                NavigableMap<java.lang.Integer, java.lang.Integer> navigableMapKWHzl = KWHzl(cls);
                java.lang.Integer num = navigableMapKWHzl.get(java.lang.Integer.valueOf(taskDescriptionCopydefault.EZpvd));
                int i = taskDescriptionCopydefault.EZpvd;
                int iIntValue = 1;
                if (num != null) {
                    iIntValue = 1 + num.intValue();
                }
                navigableMapKWHzl.put(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iIntValue));
                this.KWHzl += iKWHzl;
                copydefault();
            }
        }
    }

    @Override // o.OF
    public <T> T AEQbTJ(int i, java.lang.Class<T> cls) {
        T t;
        synchronized (this) {
            t = (T) KWHzl(this.OLrzqt.copydefault(i, cls), cls);
        }
        return t;
    }

    @Override // o.OF
    public <T> T EZpvd(int i, java.lang.Class<T> cls) {
        TaskDescription taskDescriptionCopydefault;
        T t;
        synchronized (this) {
            java.lang.Integer numCeilingKey = KWHzl((java.lang.Class<?>) cls).ceilingKey(java.lang.Integer.valueOf(i));
            if (copydefault(i, numCeilingKey)) {
                taskDescriptionCopydefault = this.OLrzqt.copydefault(numCeilingKey.intValue(), cls);
            } else {
                taskDescriptionCopydefault = this.OLrzqt.copydefault(i, cls);
            }
            t = (T) KWHzl(taskDescriptionCopydefault, cls);
        }
        return t;
    }

    public final <T> T KWHzl(TaskDescription taskDescription, java.lang.Class<T> cls) {
        OI<T> oiCopydefault = copydefault((java.lang.Class) cls);
        T t = (T) OLrzqt(taskDescription);
        if (t != null) {
            this.KWHzl -= oiCopydefault.AEQbTJ(t) * oiCopydefault.KWHzl();
            KWHzl(oiCopydefault.AEQbTJ(t), (java.lang.Class<?>) cls);
        }
        if (t != null) {
            return t;
        }
        if (android.util.Log.isLoggable(oiCopydefault.EZpvd(), 2)) {
            oiCopydefault.EZpvd();
            int i = taskDescription.EZpvd;
        }
        return oiCopydefault.copydefault(taskDescription.EZpvd);
    }

    public final <T> T OLrzqt(TaskDescription taskDescription) {
        return (T) this.copydefault.OLrzqt(taskDescription);
    }

    public final boolean AEQbTJ(int i) {
        return i <= this.AEQbTJ / 2;
    }

    public final boolean copydefault(int i, java.lang.Integer num) {
        return num != null && (KWHzl() || num.intValue() <= i * 8);
    }

    public final boolean KWHzl() {
        int i = this.KWHzl;
        return i == 0 || this.AEQbTJ / i >= 2;
    }

    @Override // o.OF
    public void AEQbTJ() {
        synchronized (this) {
            KWHzl(0);
        }
    }

    @Override // o.OF
    public void EZpvd(int i) {
        synchronized (this) {
            try {
                if (i >= 40) {
                    AEQbTJ();
                } else if (i >= 20 || i == 15) {
                    KWHzl(this.AEQbTJ / 2);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void copydefault() {
        KWHzl(this.AEQbTJ);
    }

    public final void KWHzl(int i) {
        while (this.KWHzl > i) {
            java.lang.Object objCopydefault = this.copydefault.copydefault();
            SE.OLrzqt(objCopydefault);
            OI oiCopydefault = copydefault(objCopydefault);
            this.KWHzl -= oiCopydefault.AEQbTJ(objCopydefault) * oiCopydefault.KWHzl();
            KWHzl(oiCopydefault.AEQbTJ(objCopydefault), objCopydefault.getClass());
            if (android.util.Log.isLoggable(oiCopydefault.EZpvd(), 2)) {
                oiCopydefault.EZpvd();
                oiCopydefault.AEQbTJ(objCopydefault);
            }
        }
    }

    public final void KWHzl(int i, java.lang.Class<?> cls) {
        NavigableMap<java.lang.Integer, java.lang.Integer> navigableMapKWHzl = KWHzl(cls);
        java.lang.Integer num = navigableMapKWHzl.get(java.lang.Integer.valueOf(i));
        if (num == null) {
            throw new java.lang.NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        }
        if (num.intValue() == 1) {
            navigableMapKWHzl.remove(java.lang.Integer.valueOf(i));
        } else {
            navigableMapKWHzl.put(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(num.intValue() - 1));
        }
    }

    public final NavigableMap<java.lang.Integer, java.lang.Integer> KWHzl(java.lang.Class<?> cls) {
        NavigableMap<java.lang.Integer, java.lang.Integer> navigableMap = this.valueOf.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.valueOf.put(cls, treeMap);
        return treeMap;
    }

    public final <T> OI<T> copydefault(T t) {
        return copydefault((java.lang.Class) t.getClass());
    }

    public final <T> OI<T> copydefault(java.lang.Class<T> cls) {
        OI<T> ok = (OI) this.EZpvd.get(cls);
        if (ok == null) {
            if (cls.equals(int[].class)) {
                ok = new ON();
            } else if (cls.equals(byte[].class)) {
                ok = new OK();
            } else {
                throw new java.lang.IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.EZpvd.put(cls, ok);
        }
        return ok;
    }

    public static final class ActionBar extends OE<TaskDescription> {
        public TaskDescription copydefault(int i, java.lang.Class<?> cls) {
            TaskDescription taskDescriptionOLrzqt = OLrzqt();
            taskDescriptionOLrzqt.OLrzqt(i, cls);
            return taskDescriptionOLrzqt;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/OO; */
        @Override // o.OE
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public TaskDescription KWHzl() {
            return new TaskDescription(this);
        }
    }

    public static final class TaskDescription implements OO {
        public int EZpvd;
        public java.lang.Class<?> OLrzqt;
        public final ActionBar copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt(int i, java.lang.Class<?> cls) {
            this.EZpvd = i;
            this.OLrzqt = cls;
        }

        public TaskDescription(ActionBar actionBar) {
            this.copydefault = actionBar;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof TaskDescription) {
                TaskDescription taskDescription = (TaskDescription) obj;
                if (this.EZpvd == taskDescription.EZpvd && this.OLrzqt == taskDescription.OLrzqt) {
                    return true;
                }
            }
            return false;
        }

        public java.lang.String toString() {
            return "Key{size=" + this.EZpvd + "array=" + this.OLrzqt + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // o.OO
        public void OLrzqt() {
            this.copydefault.AEQbTJ(this);
        }

        public int hashCode() {
            int i = this.EZpvd;
            java.lang.Class<?> cls = this.OLrzqt;
            return (i * 31) + (cls != null ? cls.hashCode() : 0);
        }
    }
}
