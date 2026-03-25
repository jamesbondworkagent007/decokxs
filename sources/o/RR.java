package o;

/* JADX INFO: loaded from: classes2.dex */
public class RR {
    public final java.util.List<java.lang.String> copydefault = new java.util.ArrayList();
    public final java.util.Map<java.lang.String, java.util.List<Application<?, ?>>> KWHzl = new java.util.HashMap();

    public void copydefault(@androidx.annotation.NonNull java.util.List<java.lang.String> list) {
        synchronized (this) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(this.copydefault);
            this.copydefault.clear();
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                this.copydefault.add(it.next());
            }
            for (java.lang.String str : arrayList) {
                if (!list.contains(str)) {
                    this.copydefault.add(str);
                }
            }
        }
    }

    public <T, R> java.util.List<NL<T, R>> copydefault(@androidx.annotation.NonNull java.lang.Class<T> cls, @androidx.annotation.NonNull java.lang.Class<R> cls2) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator<java.lang.String> it = this.copydefault.iterator();
            while (it.hasNext()) {
                java.util.List<Application<?, ?>> list = this.KWHzl.get(it.next());
                if (list != null) {
                    for (Application<?, ?> application : list) {
                        if (application.EZpvd(cls, cls2)) {
                            arrayList.add(application.AEQbTJ);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public <T, R> java.util.List<java.lang.Class<R>> EZpvd(@androidx.annotation.NonNull java.lang.Class<T> cls, @androidx.annotation.NonNull java.lang.Class<R> cls2) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator<java.lang.String> it = this.copydefault.iterator();
            while (it.hasNext()) {
                java.util.List<Application<?, ?>> list = this.KWHzl.get(it.next());
                if (list != null) {
                    for (Application<?, ?> application : list) {
                        if (application.EZpvd(cls, cls2) && !arrayList.contains(application.EZpvd)) {
                            arrayList.add(application.EZpvd);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public <T, R> void AEQbTJ(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull NL<T, R> nl, @androidx.annotation.NonNull java.lang.Class<T> cls, @androidx.annotation.NonNull java.lang.Class<R> cls2) {
        synchronized (this) {
            OLrzqt(str).add(new Application<>(cls, cls2, nl));
        }
    }

    public <T, R> void KWHzl(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull NL<T, R> nl, @androidx.annotation.NonNull java.lang.Class<T> cls, @androidx.annotation.NonNull java.lang.Class<R> cls2) {
        synchronized (this) {
            OLrzqt(str).add(0, new Application<>(cls, cls2, nl));
        }
    }

    public final java.util.List<Application<?, ?>> OLrzqt(@androidx.annotation.NonNull java.lang.String str) {
        java.util.List<Application<?, ?>> arrayList;
        synchronized (this) {
            if (!this.copydefault.contains(str)) {
                this.copydefault.add(str);
            }
            arrayList = this.KWHzl.get(str);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
                this.KWHzl.put(str, arrayList);
            }
        }
        return arrayList;
    }

    public static class Application<T, R> {
        public final NL<T, R> AEQbTJ;
        public final java.lang.Class<R> EZpvd;
        public final java.lang.Class<T> copydefault;

        public Application(@androidx.annotation.NonNull java.lang.Class<T> cls, @androidx.annotation.NonNull java.lang.Class<R> cls2, NL<T, R> nl) {
            this.copydefault = cls;
            this.EZpvd = cls2;
            this.AEQbTJ = nl;
        }

        public boolean EZpvd(@androidx.annotation.NonNull java.lang.Class<?> cls, @androidx.annotation.NonNull java.lang.Class<?> cls2) {
            return this.copydefault.isAssignableFrom(cls) && cls2.isAssignableFrom(this.EZpvd);
        }
    }
}
