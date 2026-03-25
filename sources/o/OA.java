package o;

import androidx.core.util.Pools;
import o.SL;

/* JADX INFO: loaded from: classes2.dex */
public final class OA<Z> implements OC<Z>, SL.TaskDescription {
    public static final Pools.Pool<OA<?>> EZpvd = SL.copydefault(20, new SL.StateListAnimator<OA<?>>() { // from class: o.OA.5
        /* JADX DEBUG: Method merged with bridge method: KWHzl()Ljava/lang/Object; */
        @Override // o.SL.StateListAnimator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public OA<?> KWHzl() {
            return new OA<>();
        }
    });
    public boolean AEQbTJ;
    public OC<Z> KWHzl;
    public final SJ OLrzqt = SJ.copydefault();
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(OC<Z> oc) {
        this.AEQbTJ = false;
        this.copydefault = true;
        this.KWHzl = oc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.SL.TaskDescription
    public SJ valueOf() {
        return this.OLrzqt;
    }

    public static <Z> OA<Z> copydefault(OC<Z> oc) {
        OA<Z> oa = (OA) SE.OLrzqt(EZpvd.acquire());
        oa.KWHzl(oc);
        return oa;
    }

    private void OLrzqt() {
        this.KWHzl = null;
        EZpvd.release(this);
    }

    public void KWHzl() {
        synchronized (this) {
            this.OLrzqt.AEQbTJ();
            if (!this.copydefault) {
                throw new java.lang.IllegalStateException("Already unlocked");
            }
            this.copydefault = false;
            if (this.AEQbTJ) {
                djBIcL();
            }
        }
    }

    @Override // o.OC
    public java.lang.Class<Z> copydefault() {
        return this.KWHzl.copydefault();
    }

    @Override // o.OC
    public Z AEQbTJ() {
        return this.KWHzl.AEQbTJ();
    }

    @Override // o.OC
    public int EZpvd() {
        return this.KWHzl.EZpvd();
    }

    @Override // o.OC
    public void djBIcL() {
        synchronized (this) {
            this.OLrzqt.AEQbTJ();
            this.AEQbTJ = true;
            if (!this.copydefault) {
                this.KWHzl.djBIcL();
                OLrzqt();
            }
        }
    }
}
