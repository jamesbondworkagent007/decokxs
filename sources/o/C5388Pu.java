package o;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.Collections;

/* JADX INFO: renamed from: o.Pu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5388Pu {
    public final Application EZpvd;
    public final PA copydefault;

    public C5388Pu(@androidx.annotation.NonNull Pools.Pool<java.util.List<java.lang.Throwable>> pool) {
        this(new PA(pool));
    }

    public C5388Pu(@androidx.annotation.NonNull PA pa) {
        this.EZpvd = new Application();
        this.copydefault = pa;
    }

    public <Model, Data> void copydefault(@androidx.annotation.NonNull java.lang.Class<Model> cls, @androidx.annotation.NonNull java.lang.Class<Data> cls2, @androidx.annotation.NonNull InterfaceC5390Pw<? extends Model, ? extends Data> interfaceC5390Pw) {
        synchronized (this) {
            this.copydefault.KWHzl(cls, cls2, interfaceC5390Pw);
            this.EZpvd.KWHzl();
        }
    }

    public <Model, Data> void EZpvd(@androidx.annotation.NonNull java.lang.Class<Model> cls, @androidx.annotation.NonNull java.lang.Class<Data> cls2, @androidx.annotation.NonNull InterfaceC5390Pw<? extends Model, ? extends Data> interfaceC5390Pw) {
        synchronized (this) {
            this.copydefault.OLrzqt(cls, cls2, interfaceC5390Pw);
            this.EZpvd.KWHzl();
        }
    }

    public <Model, Data> void AEQbTJ(@androidx.annotation.NonNull java.lang.Class<Model> cls, @androidx.annotation.NonNull java.lang.Class<Data> cls2, @androidx.annotation.NonNull InterfaceC5390Pw<? extends Model, ? extends Data> interfaceC5390Pw) {
        synchronized (this) {
            EZpvd(this.copydefault.EZpvd(cls, cls2, interfaceC5390Pw));
            this.EZpvd.KWHzl();
        }
    }

    public final <Model, Data> void EZpvd(@androidx.annotation.NonNull java.util.List<InterfaceC5390Pw<? extends Model, ? extends Data>> list) {
        java.util.Iterator<InterfaceC5390Pw<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().AEQbTJ();
        }
    }

    public <A> java.util.List<InterfaceC5386Ps<A, ?>> AEQbTJ(@androidx.annotation.NonNull A a2) {
        java.util.List<InterfaceC5386Ps<A, ?>> listCopydefault = copydefault((java.lang.Class) copydefault(a2));
        if (listCopydefault.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a2);
        }
        int size = listCopydefault.size();
        java.util.List<InterfaceC5386Ps<A, ?>> listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            InterfaceC5386Ps<A, ?> interfaceC5386Ps = listCopydefault.get(i);
            if (interfaceC5386Ps.OLrzqt(a2)) {
                if (z) {
                    listEmptyList = new java.util.ArrayList<>(size - i);
                    z = false;
                }
                listEmptyList.add(interfaceC5386Ps);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a2, listCopydefault);
        }
        return listEmptyList;
    }

    public java.util.List<java.lang.Class<?>> AEQbTJ(@androidx.annotation.NonNull java.lang.Class<?> cls) {
        java.util.List<java.lang.Class<?>> listEZpvd;
        synchronized (this) {
            listEZpvd = this.copydefault.EZpvd(cls);
        }
        return listEZpvd;
    }

    public final <A> java.util.List<InterfaceC5386Ps<A, ?>> copydefault(@androidx.annotation.NonNull java.lang.Class<A> cls) {
        java.util.List<InterfaceC5386Ps<A, ?>> listOLrzqt;
        synchronized (this) {
            listOLrzqt = this.EZpvd.OLrzqt(cls);
            if (listOLrzqt == null) {
                listOLrzqt = Collections.unmodifiableList(this.copydefault.OLrzqt(cls));
                this.EZpvd.OLrzqt(cls, listOLrzqt);
            }
        }
        return listOLrzqt;
    }

    public static <A> java.lang.Class<A> copydefault(@androidx.annotation.NonNull A a2) {
        return (java.lang.Class<A>) a2.getClass();
    }

    /* JADX INFO: renamed from: o.Pu$Application */
    public static class Application {
        public final java.util.Map<java.lang.Class<?>, TaskDescription<?>> AEQbTJ = new java.util.HashMap();

        public void KWHzl() {
            this.AEQbTJ.clear();
        }

        public <Model> void OLrzqt(java.lang.Class<Model> cls, java.util.List<InterfaceC5386Ps<Model, ?>> list) {
            if (this.AEQbTJ.put(cls, new TaskDescription<>(list)) == null) {
                return;
            }
            throw new java.lang.IllegalStateException("Already cached loaders for model: " + cls);
        }

        public <Model> java.util.List<InterfaceC5386Ps<Model, ?>> OLrzqt(java.lang.Class<Model> cls) {
            TaskDescription<?> taskDescription = this.AEQbTJ.get(cls);
            if (taskDescription == null) {
                return null;
            }
            return (java.util.List<InterfaceC5386Ps<Model, ?>>) taskDescription.EZpvd;
        }

        /* JADX INFO: renamed from: o.Pu$Application$TaskDescription */
        public static class TaskDescription<Model> {
            public final java.util.List<InterfaceC5386Ps<Model, ?>> EZpvd;

            public TaskDescription(java.util.List<InterfaceC5386Ps<Model, ?>> list) {
                this.EZpvd = list;
            }
        }
    }
}
