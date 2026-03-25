package o;

import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.GlideException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InterfaceC5386Ps;
import o.NU;

/* JADX INFO: renamed from: o.Pt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5387Pt<Model, Data> implements InterfaceC5386Ps<Model, Data> {
    public final java.util.List<InterfaceC5386Ps<Model, Data>> AEQbTJ;
    public final Pools.Pool<java.util.List<java.lang.Throwable>> EZpvd;

    public C5387Pt(@androidx.annotation.NonNull java.util.List<InterfaceC5386Ps<Model, Data>> list, @androidx.annotation.NonNull Pools.Pool<java.util.List<java.lang.Throwable>> pool) {
        this.AEQbTJ = list;
        this.EZpvd = pool;
    }

    @Override // o.InterfaceC5386Ps
    public InterfaceC5386Ps.Application<Data> AEQbTJ(@androidx.annotation.NonNull Model model, int i, int i2, @androidx.annotation.NonNull NM nm) {
        InterfaceC5386Ps.Application<Data> applicationAEQbTJ;
        int size = this.AEQbTJ.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        NH nh = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC5386Ps<Model, Data> interfaceC5386Ps = this.AEQbTJ.get(i3);
            if (interfaceC5386Ps.OLrzqt(model) && (applicationAEQbTJ = interfaceC5386Ps.AEQbTJ(model, i, i2, nm)) != null) {
                nh = applicationAEQbTJ.OLrzqt;
                arrayList.add(applicationAEQbTJ.EZpvd);
            }
        }
        if (arrayList.isEmpty() || nh == null) {
            return null;
        }
        return new InterfaceC5386Ps.Application<>(nh, new TaskDescription(arrayList, this.EZpvd));
    }

    @Override // o.InterfaceC5386Ps
    public boolean OLrzqt(@androidx.annotation.NonNull Model model) {
        java.util.Iterator<InterfaceC5386Ps<Model, Data>> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            if (it.next().OLrzqt(model)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        return "MultiModelLoader{modelLoaders=" + java.util.Arrays.toString(this.AEQbTJ.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: renamed from: o.Pt$TaskDescription */
    public static class TaskDescription<Data> implements NU<Data>, NU.TaskDescription<Data> {
        public NU.TaskDescription<? super Data> AEQbTJ;
        public int EZpvd;
        public boolean KWHzl;
        public java.util.List<java.lang.Throwable> OLrzqt;
        public final java.util.List<NU<Data>> copydefault;
        public Priority gEmmrt;
        public final Pools.Pool<java.util.List<java.lang.Throwable>> valueOf;

        public TaskDescription(@androidx.annotation.NonNull java.util.List<NU<Data>> list, @androidx.annotation.NonNull Pools.Pool<java.util.List<java.lang.Throwable>> pool) {
            this.valueOf = pool;
            SE.KWHzl(list);
            this.copydefault = list;
            this.EZpvd = 0;
        }

        @Override // o.NU
        public void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super Data> taskDescription) {
            this.gEmmrt = priority;
            this.AEQbTJ = taskDescription;
            this.OLrzqt = this.valueOf.acquire();
            this.copydefault.get(this.EZpvd).EZpvd(priority, this);
            if (this.KWHzl) {
                copydefault();
            }
        }

        @Override // o.NU
        public void AEQbTJ() {
            java.util.List<java.lang.Throwable> list = this.OLrzqt;
            if (list != null) {
                this.valueOf.release(list);
            }
            this.OLrzqt = null;
            java.util.Iterator<NU<Data>> it = this.copydefault.iterator();
            while (it.hasNext()) {
                it.next().AEQbTJ();
            }
        }

        @Override // o.NU
        public void copydefault() {
            this.KWHzl = true;
            java.util.Iterator<NU<Data>> it = this.copydefault.iterator();
            while (it.hasNext()) {
                it.next().copydefault();
            }
        }

        @Override // o.NU
        public java.lang.Class<Data> KWHzl() {
            return this.copydefault.get(0).KWHzl();
        }

        @Override // o.NU
        public com.bumptech.glide.load.DataSource OLrzqt() {
            return this.copydefault.get(0).OLrzqt();
        }

        @Override // o.NU.TaskDescription
        public void KWHzl(@androidx.annotation.Nullable Data data) {
            if (data != null) {
                this.AEQbTJ.KWHzl(data);
            } else {
                EZpvd();
            }
        }

        @Override // o.NU.TaskDescription
        public void copydefault(@androidx.annotation.NonNull java.lang.Exception exc) {
            ((java.util.List) SE.OLrzqt(this.OLrzqt)).add(exc);
            EZpvd();
        }

        public final void EZpvd() {
            if (this.KWHzl) {
                return;
            }
            if (this.EZpvd < this.copydefault.size() - 1) {
                this.EZpvd++;
                EZpvd(this.gEmmrt, this.AEQbTJ);
            } else {
                SE.OLrzqt(this.OLrzqt);
                this.AEQbTJ.copydefault(new GlideException("Fetch failed", new java.util.ArrayList(this.OLrzqt)));
            }
        }
    }
}
