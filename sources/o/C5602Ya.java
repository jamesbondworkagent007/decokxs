package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.Ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5602Ya {
    public final LRUMap<YD, VD<java.lang.Object>> EZpvd;
    public final AtomicReference<C5603Yb> copydefault;

    public C5602Ya() {
        this(4000);
    }

    public C5602Ya(int i) {
        this.EZpvd = new LRUMap<>(java.lang.Math.min(64, i >> 2), i);
        this.copydefault = new AtomicReference<>();
    }

    public C5603Yb OLrzqt() {
        C5603Yb c5603Yb = this.copydefault.get();
        return c5603Yb != null ? c5603Yb : AEQbTJ();
    }

    public final C5603Yb AEQbTJ() {
        C5603Yb c5603YbOLrzqt;
        synchronized (this) {
            c5603YbOLrzqt = this.copydefault.get();
            if (c5603YbOLrzqt == null) {
                c5603YbOLrzqt = C5603Yb.OLrzqt(this.EZpvd);
                this.copydefault.set(c5603YbOLrzqt);
            }
        }
        return c5603YbOLrzqt;
    }

    public int EZpvd() {
        int size;
        synchronized (this) {
            size = this.EZpvd.size();
        }
        return size;
    }

    public VD<java.lang.Object> AEQbTJ(java.lang.Class<?> cls) {
        VD<java.lang.Object> vd;
        synchronized (this) {
            vd = this.EZpvd.get(new YD(cls, false));
        }
        return vd;
    }

    public VD<java.lang.Object> AEQbTJ(JavaType javaType) {
        VD<java.lang.Object> vd;
        synchronized (this) {
            vd = this.EZpvd.get(new YD(javaType, false));
        }
        return vd;
    }

    public VD<java.lang.Object> EZpvd(JavaType javaType) {
        VD<java.lang.Object> vd;
        synchronized (this) {
            vd = this.EZpvd.get(new YD(javaType, true));
        }
        return vd;
    }

    public VD<java.lang.Object> EZpvd(java.lang.Class<?> cls) {
        VD<java.lang.Object> vd;
        synchronized (this) {
            vd = this.EZpvd.get(new YD(cls, true));
        }
        return vd;
    }

    public void KWHzl(JavaType javaType, VD<java.lang.Object> vd) {
        synchronized (this) {
            if (this.EZpvd.put(new YD(javaType, true), vd) == null) {
                this.copydefault.set(null);
            }
        }
    }

    public void KWHzl(java.lang.Class<?> cls, VD<java.lang.Object> vd) {
        synchronized (this) {
            if (this.EZpvd.put(new YD(cls, true), vd) == null) {
                this.copydefault.set(null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.VD<java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public void OLrzqt(JavaType javaType, VD<java.lang.Object> vd, VI vi) throws JsonMappingException {
        synchronized (this) {
            if (this.EZpvd.put(new YD(javaType, false), vd) == null) {
                this.copydefault.set(null);
            }
            if (vd instanceof XZ) {
                ((XZ) vd).resolve(vi);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.VD<java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public void KWHzl(java.lang.Class<?> cls, JavaType javaType, VD<java.lang.Object> vd, VI vi) throws JsonMappingException {
        synchronized (this) {
            VD<java.lang.Object> vdPut = this.EZpvd.put(new YD(cls, false), vd);
            VD<java.lang.Object> vdPut2 = this.EZpvd.put(new YD(javaType, false), vd);
            if (vdPut == null || vdPut2 == null) {
                this.copydefault.set(null);
            }
            if (vd instanceof XZ) {
                ((XZ) vd).resolve(vi);
            }
        }
    }

    public void KWHzl() {
        synchronized (this) {
            this.EZpvd.clear();
        }
    }
}
