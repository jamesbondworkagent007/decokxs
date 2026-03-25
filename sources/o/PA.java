package o;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import o.InterfaceC5386Ps;

/* JADX INFO: loaded from: classes2.dex */
public class PA {
    public final java.util.List<Application<?, ?>> EZpvd;
    public final StateListAnimator KWHzl;
    public final java.util.Set<Application<?, ?>> copydefault;
    public final Pools.Pool<java.util.List<java.lang.Throwable>> gEmmrt;
    public static final StateListAnimator OLrzqt = new StateListAnimator();
    public static final InterfaceC5386Ps<java.lang.Object, java.lang.Object> AEQbTJ = new ActionBar();

    public static class ActionBar implements InterfaceC5386Ps<java.lang.Object, java.lang.Object> {
        @Override // o.InterfaceC5386Ps
        public InterfaceC5386Ps.Application<java.lang.Object> AEQbTJ(@androidx.annotation.NonNull java.lang.Object obj, int i, int i2, @androidx.annotation.NonNull NM nm) {
            return null;
        }

        @Override // o.InterfaceC5386Ps
        public boolean OLrzqt(@androidx.annotation.NonNull java.lang.Object obj) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static <Model, Data> InterfaceC5386Ps<Model, Data> KWHzl() {
        return (InterfaceC5386Ps<Model, Data>) AEQbTJ;
    }

    public PA(@androidx.annotation.NonNull Pools.Pool<java.util.List<java.lang.Throwable>> pool) {
        this(pool, OLrzqt);
    }

    public PA(@androidx.annotation.NonNull Pools.Pool<java.util.List<java.lang.Throwable>> pool, @androidx.annotation.NonNull StateListAnimator stateListAnimator) {
        this.EZpvd = new java.util.ArrayList();
        this.copydefault = new java.util.HashSet();
        this.gEmmrt = pool;
        this.KWHzl = stateListAnimator;
    }

    public <Model, Data> void KWHzl(@androidx.annotation.NonNull java.lang.Class<Model> cls, @androidx.annotation.NonNull java.lang.Class<Data> cls2, @androidx.annotation.NonNull InterfaceC5390Pw<? extends Model, ? extends Data> interfaceC5390Pw) {
        synchronized (this) {
            copydefault(cls, cls2, interfaceC5390Pw, true);
        }
    }

    public <Model, Data> void OLrzqt(@androidx.annotation.NonNull java.lang.Class<Model> cls, @androidx.annotation.NonNull java.lang.Class<Data> cls2, @androidx.annotation.NonNull InterfaceC5390Pw<? extends Model, ? extends Data> interfaceC5390Pw) {
        synchronized (this) {
            copydefault(cls, cls2, interfaceC5390Pw, false);
        }
    }

    public final <Model, Data> void copydefault(@androidx.annotation.NonNull java.lang.Class<Model> cls, @androidx.annotation.NonNull java.lang.Class<Data> cls2, @androidx.annotation.NonNull InterfaceC5390Pw<? extends Model, ? extends Data> interfaceC5390Pw, boolean z) {
        Application<?, ?> application = new Application<>(cls, cls2, interfaceC5390Pw);
        java.util.List<Application<?, ?>> list = this.EZpvd;
        list.add(z ? list.size() : 0, application);
    }

    public <Model, Data> java.util.List<InterfaceC5390Pw<? extends Model, ? extends Data>> EZpvd(@androidx.annotation.NonNull java.lang.Class<Model> cls, @androidx.annotation.NonNull java.lang.Class<Data> cls2, @androidx.annotation.NonNull InterfaceC5390Pw<? extends Model, ? extends Data> interfaceC5390Pw) {
        java.util.List<InterfaceC5390Pw<? extends Model, ? extends Data>> listKWHzl;
        synchronized (this) {
            listKWHzl = KWHzl(cls, cls2);
            KWHzl(cls, cls2, interfaceC5390Pw);
        }
        return listKWHzl;
    }

    public <Model, Data> java.util.List<InterfaceC5390Pw<? extends Model, ? extends Data>> KWHzl(@androidx.annotation.NonNull java.lang.Class<Model> cls, @androidx.annotation.NonNull java.lang.Class<Data> cls2) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator<Application<?, ?>> it = this.EZpvd.iterator();
            while (it.hasNext()) {
                Application<?, ?> next = it.next();
                if (next.EZpvd(cls, cls2)) {
                    it.remove();
                    arrayList.add(EZpvd(next));
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public <Model> java.util.List<InterfaceC5386Ps<Model, ?>> OLrzqt(@androidx.annotation.NonNull java.lang.Class<Model> cls) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            try {
                arrayList = new java.util.ArrayList();
                for (Application<?, ?> application : this.EZpvd) {
                    if (!this.copydefault.contains(application) && application.KWHzl(cls)) {
                        this.copydefault.add(application);
                        arrayList.add(copydefault(application));
                        this.copydefault.remove(application);
                    }
                }
            } catch (java.lang.Throwable th) {
                this.copydefault.clear();
                throw th;
            }
        }
        return arrayList;
    }

    public java.util.List<java.lang.Class<?>> EZpvd(@androidx.annotation.NonNull java.lang.Class<?> cls) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList();
            for (Application<?, ?> application : this.EZpvd) {
                if (!arrayList.contains(application.copydefault) && application.KWHzl(cls)) {
                    arrayList.add(application.copydefault);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public <Model, Data> InterfaceC5386Ps<Model, Data> OLrzqt(@androidx.annotation.NonNull java.lang.Class<Model> cls, @androidx.annotation.NonNull java.lang.Class<Data> cls2) {
        synchronized (this) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z = false;
                for (Application<?, ?> application : this.EZpvd) {
                    if (this.copydefault.contains(application)) {
                        z = true;
                    } else if (application.EZpvd(cls, cls2)) {
                        this.copydefault.add(application);
                        arrayList.add(copydefault(application));
                        this.copydefault.remove(application);
                    }
                }
                if (arrayList.size() > 1) {
                    return this.KWHzl.OLrzqt(arrayList, this.gEmmrt);
                }
                if (arrayList.size() == 1) {
                    return (InterfaceC5386Ps) arrayList.get(0);
                }
                if (z) {
                    return KWHzl();
                }
                throw new Registry.NoModelLoaderAvailableException((java.lang.Class<?>) cls, (java.lang.Class<?>) cls2);
            } catch (java.lang.Throwable th) {
                this.copydefault.clear();
                throw th;
            }
        }
    }

    public final <Model, Data> InterfaceC5390Pw<Model, Data> EZpvd(@androidx.annotation.NonNull Application<?, ?> application) {
        return (InterfaceC5390Pw<Model, Data>) application.KWHzl;
    }

    public final <Model, Data> InterfaceC5386Ps<Model, Data> copydefault(@androidx.annotation.NonNull Application<?, ?> application) {
        return (InterfaceC5386Ps) SE.OLrzqt(application.KWHzl.AEQbTJ(this));
    }

    public static class Application<Model, Data> {
        public final java.lang.Class<Model> EZpvd;
        public final InterfaceC5390Pw<? extends Model, ? extends Data> KWHzl;
        public final java.lang.Class<Data> copydefault;

        public Application(@androidx.annotation.NonNull java.lang.Class<Model> cls, @androidx.annotation.NonNull java.lang.Class<Data> cls2, @androidx.annotation.NonNull InterfaceC5390Pw<? extends Model, ? extends Data> interfaceC5390Pw) {
            this.EZpvd = cls;
            this.copydefault = cls2;
            this.KWHzl = interfaceC5390Pw;
        }

        public boolean EZpvd(@androidx.annotation.NonNull java.lang.Class<?> cls, @androidx.annotation.NonNull java.lang.Class<?> cls2) {
            return KWHzl(cls) && this.copydefault.isAssignableFrom(cls2);
        }

        public boolean KWHzl(@androidx.annotation.NonNull java.lang.Class<?> cls) {
            return this.EZpvd.isAssignableFrom(cls);
        }
    }

    public static class StateListAnimator {
        public <Model, Data> C5387Pt<Model, Data> OLrzqt(@androidx.annotation.NonNull java.util.List<InterfaceC5386Ps<Model, Data>> list, @androidx.annotation.NonNull Pools.Pool<java.util.List<java.lang.Throwable>> pool) {
            return new C5387Pt<>(list, pool);
        }
    }
}
