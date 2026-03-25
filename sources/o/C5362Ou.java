package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.Ou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5362Ou<Z> implements OC<Z> {
    public final boolean AEQbTJ;
    public boolean EZpvd;
    public final boolean KWHzl;
    public final NH OLrzqt;
    public int copydefault;
    public final Activity djBIcL;
    public final OC<Z> valueOf;

    /* JADX INFO: renamed from: o.Ou$Activity */
    public interface Activity {
        void EZpvd(NH nh, C5362Ou<?> c5362Ou);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OC<Z> KWHzl() {
        return this.valueOf;
    }

    public C5362Ou(OC<Z> oc, boolean z, boolean z2, NH nh, Activity activity) {
        this.valueOf = (OC) SE.OLrzqt(oc);
        this.AEQbTJ = z;
        this.KWHzl = z2;
        this.OLrzqt = nh;
        this.djBIcL = (Activity) SE.OLrzqt(activity);
    }

    @Override // o.OC
    public java.lang.Class<Z> copydefault() {
        return this.valueOf.copydefault();
    }

    @Override // o.OC
    public Z AEQbTJ() {
        return this.valueOf.AEQbTJ();
    }

    @Override // o.OC
    public int EZpvd() {
        return this.valueOf.EZpvd();
    }

    @Override // o.OC
    public void djBIcL() {
        synchronized (this) {
            if (this.copydefault > 0) {
                throw new java.lang.IllegalStateException("Cannot recycle a resource while it is still acquired");
            }
            if (this.EZpvd) {
                throw new java.lang.IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
            this.EZpvd = true;
            if (this.KWHzl) {
                this.valueOf.djBIcL();
            }
        }
    }

    public void OLrzqt() {
        synchronized (this) {
            if (this.EZpvd) {
                throw new java.lang.IllegalStateException("Cannot acquire a recycled resource");
            }
            this.copydefault++;
        }
    }

    public void valueOf() {
        boolean z;
        synchronized (this) {
            int i = this.copydefault;
            if (i <= 0) {
                throw new java.lang.IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            int i2 = i - 1;
            this.copydefault = i2;
            z = i2 == 0;
        }
        if (z) {
            this.djBIcL.EZpvd(this.OLrzqt, this);
        }
    }

    public java.lang.String toString() {
        java.lang.String str;
        synchronized (this) {
            str = "EngineResource{isMemoryCacheable=" + this.AEQbTJ + ", listener=" + this.djBIcL + ", key=" + this.OLrzqt + ", acquired=" + this.copydefault + ", isRecycled=" + this.EZpvd + ", resource=" + this.valueOf + AbstractJsonLexerKt.END_OBJ;
        }
        return str;
    }
}
