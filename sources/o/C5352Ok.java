package o;

import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.Map;
import o.InterfaceC5386Ps;

/* JADX INFO: renamed from: o.Ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5352Ok<Transcode> {
    public AbstractC5360Os AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public java.lang.Class<?> AkhnZx;
    public NM DbNXlk;
    public int EZpvd;
    public C5330No OLrzqt;
    public DecodeJob.TaskDescription copydefault;
    public java.util.Map<java.lang.Class<?>, NN<?>> fARcdN;
    public int fIwbmz;
    public java.lang.Class<Transcode> fJNWhG;
    public NH fetchVPNInfo;
    public boolean gEmmrt;
    public Priority isConnected;
    public boolean valueOf;
    public java.lang.Object values;
    public final java.util.List<InterfaceC5386Ps.Application<?>> djBIcL = new java.util.ArrayList();
    public final java.util.List<NH> KWHzl = new java.util.ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Priority AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int DbNXlk() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC5360Os EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.lang.Class<R> */
    /* JADX WARN: Multi-variable type inference failed */
    public <R> void OLrzqt(C5330No c5330No, java.lang.Object obj, NH nh, int i, int i2, AbstractC5360Os abstractC5360Os, java.lang.Class<?> cls, java.lang.Class<R> cls2, Priority priority, NM nm, java.util.Map<java.lang.Class<?>, NN<?>> map, boolean z, boolean z2, DecodeJob.TaskDescription taskDescription) {
        this.OLrzqt = c5330No;
        this.values = obj;
        this.fetchVPNInfo = nh;
        this.fIwbmz = i;
        this.EZpvd = i2;
        this.AEQbTJ = abstractC5360Os;
        this.AkhnZx = cls;
        this.copydefault = taskDescription;
        this.fJNWhG = cls2;
        this.isConnected = priority;
        this.DbNXlk = nm;
        this.fARcdN = map;
        this.valueOf = z;
        this.AYXKKw = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NM gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NH isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Class<?> values() {
        return this.fJNWhG;
    }

    public void OLrzqt() {
        this.OLrzqt = null;
        this.values = null;
        this.fetchVPNInfo = null;
        this.AkhnZx = null;
        this.fJNWhG = null;
        this.DbNXlk = null;
        this.isConnected = null;
        this.fARcdN = null;
        this.AEQbTJ = null;
        this.djBIcL.clear();
        this.gEmmrt = false;
        this.KWHzl.clear();
        this.AhwBna = false;
    }

    public OP KWHzl() {
        return this.copydefault.KWHzl();
    }

    public <T> NT<T> EZpvd(T t) {
        return this.OLrzqt.valueOf().OLrzqt(t);
    }

    public OF AEQbTJ() {
        return this.OLrzqt.EZpvd();
    }

    public java.lang.Class<?> AhwBna() {
        return this.values.getClass();
    }

    public java.util.List<java.lang.Class<?>> fetchVPNInfo() {
        return this.OLrzqt.valueOf().AEQbTJ(this.values.getClass(), this.AkhnZx, this.fJNWhG);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean copydefault(java.lang.Class<?> cls) {
        return OLrzqt(cls) != null;
    }

    public <Data> C5363Ov<Data, ?, Transcode> OLrzqt(java.lang.Class<Data> cls) {
        return this.OLrzqt.valueOf().EZpvd(cls, this.AkhnZx, this.fJNWhG);
    }

    public <Z> NN<Z> KWHzl(java.lang.Class<Z> cls) {
        NN<Z> nn = (NN) this.fARcdN.get(cls);
        if (nn == null) {
            java.util.Iterator<Map.Entry<java.lang.Class<?>, NN<?>>> it = this.fARcdN.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<java.lang.Class<?>, NN<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    nn = (NN) next.getValue();
                    break;
                }
            }
        }
        if (nn != null) {
            return nn;
        }
        if (this.fARcdN.isEmpty() && this.valueOf) {
            throw new java.lang.IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
        }
        return PW.AEQbTJ();
    }

    public boolean copydefault(OC<?> oc) {
        return this.OLrzqt.valueOf().EZpvd(oc);
    }

    public <Z> NP<Z> EZpvd(OC<Z> oc) {
        return this.OLrzqt.valueOf().AEQbTJ((OC) oc);
    }

    public java.util.List<InterfaceC5386Ps<java.io.File, ?>> copydefault(java.io.File file) throws Registry.NoModelLoaderAvailableException {
        return this.OLrzqt.valueOf().EZpvd(file);
    }

    public boolean copydefault(NH nh) {
        java.util.List<InterfaceC5386Ps.Application<?>> listValueOf = valueOf();
        int size = listValueOf.size();
        for (int i = 0; i < size; i++) {
            if (listValueOf.get(i).OLrzqt.equals(nh)) {
                return true;
            }
        }
        return false;
    }

    public java.util.List<InterfaceC5386Ps.Application<?>> valueOf() {
        if (!this.gEmmrt) {
            this.gEmmrt = true;
            this.djBIcL.clear();
            java.util.List listEZpvd = this.OLrzqt.valueOf().EZpvd(this.values);
            int size = listEZpvd.size();
            for (int i = 0; i < size; i++) {
                InterfaceC5386Ps.Application<?> applicationAEQbTJ = ((InterfaceC5386Ps) listEZpvd.get(i)).AEQbTJ(this.values, this.fIwbmz, this.EZpvd, this.DbNXlk);
                if (applicationAEQbTJ != null) {
                    this.djBIcL.add(applicationAEQbTJ);
                }
            }
        }
        return this.djBIcL;
    }

    public java.util.List<NH> copydefault() {
        if (!this.AhwBna) {
            this.AhwBna = true;
            this.KWHzl.clear();
            java.util.List<InterfaceC5386Ps.Application<?>> listValueOf = valueOf();
            int size = listValueOf.size();
            for (int i = 0; i < size; i++) {
                InterfaceC5386Ps.Application<?> application = listValueOf.get(i);
                if (!this.KWHzl.contains(application.OLrzqt)) {
                    this.KWHzl.add(application.OLrzqt);
                }
                for (int i2 = 0; i2 < application.KWHzl.size(); i2++) {
                    if (!this.KWHzl.contains(application.KWHzl.get(i2))) {
                        this.KWHzl.add(application.KWHzl.get(i2));
                    }
                }
            }
        }
        return this.KWHzl;
    }

    public <X> NI<X> KWHzl(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.OLrzqt.valueOf().AEQbTJ(x);
    }
}
