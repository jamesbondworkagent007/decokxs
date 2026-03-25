package o;

import java.util.TimeZone;

/* JADX INFO: renamed from: o.adn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7119adn implements InterfaceC7130ady {
    public AbstractC7089adJ EZpvd;
    public Activity OLrzqt = new Activity();

    @Override // o.InterfaceC7130ady
    public InterfaceC7130ady copydefault(TimeZone timeZone) {
        return this;
    }

    public C7119adn(AbstractC7089adJ abstractC7089adJ) {
        this.EZpvd = abstractC7089adJ;
    }

    public static long KWHzl(C7080adA c7080adA) {
        return C7080adA.AhwBna[c7080adA.isConnected];
    }

    /* JADX INFO: renamed from: o.adn$Activity */
    public class Activity {
        public boolean AYXKKw;
        public boolean EZpvd;
        public int KWHzl;
        public int djBIcL;
        public short valueOf = 255;
        public C7080adA AEQbTJ = C7080adA.valueOf;
        public C7080adA AhwBna = C7080adA.AEQbTJ;
        public boolean OLrzqt = true;
        public boolean copydefault = true;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity copydefault() {
            this.EZpvd = true;
            return this;
        }

        public Activity() {
        }

        public short EZpvd() {
            return this.copydefault ? this.valueOf : (short) (this.valueOf & (~(1 << C7080adA.AEQbTJ.isConnected)));
        }

        public C7080adA AEQbTJ() {
            if (this.copydefault || this.AhwBna != C7080adA.AEQbTJ) {
                return this.AhwBna;
            }
            int length = C7080adA.AYXKKw.length - 1;
            do {
                length--;
                if (length < 0) {
                    return C7080adA.gEmmrt;
                }
            } while ((this.valueOf & (1 << length)) == 0);
            return C7080adA.AYXKKw[length];
        }

        public Activity EZpvd(boolean z) {
            if (this.OLrzqt == z) {
                return this;
            }
            Activity activityKWHzl = this.EZpvd ? KWHzl() : this;
            activityKWHzl.OLrzqt = z;
            return activityKWHzl;
        }

        public Activity copydefault(boolean z) {
            if (this.AYXKKw == z) {
                return this;
            }
            Activity activityKWHzl = this.EZpvd ? KWHzl() : this;
            activityKWHzl.AYXKKw = z;
            return activityKWHzl;
        }

        public Activity OLrzqt(boolean z) {
            if (this.copydefault == z) {
                return this;
            }
            Activity activityKWHzl = this.EZpvd ? KWHzl() : this;
            activityKWHzl.copydefault = z;
            return activityKWHzl;
        }

        public Activity AEQbTJ(java.lang.String str) {
            C7081adB c7081adBOLrzqt = C7119adn.this.EZpvd.OLrzqt(str);
            return EZpvd(c7081adBOLrzqt.EZpvd()).copydefault(c7081adBOLrzqt.copydefault()).OLrzqt(c7081adBOLrzqt.KWHzl() != 1);
        }

        public C7126adu EZpvd(long j, boolean z) {
            if (this.KWHzl > 0) {
                long jKWHzl = C7119adn.KWHzl(this.AEQbTJ);
                int i = this.KWHzl;
                if (j * 1000 > ((long) i) * jKWHzl) {
                    return C7126adu.KWHzl(i / 1000.0f, this.AEQbTJ).copydefault(z);
                }
            }
            if (this.djBIcL <= 0) {
                return null;
            }
            C7080adA c7080adAAEQbTJ = AEQbTJ();
            long jKWHzl2 = C7119adn.KWHzl(c7080adAAEQbTJ);
            C7080adA c7080adA = this.AhwBna;
            long jMax = c7080adAAEQbTJ == c7080adA ? this.djBIcL : java.lang.Math.max(1000L, (C7119adn.KWHzl(c7080adA) * ((long) this.djBIcL)) / jKWHzl2);
            if (j * 1000 < jKWHzl2 * jMax) {
                return C7126adu.EZpvd(jMax / 1000.0f, c7080adAAEQbTJ).copydefault(z);
            }
            return null;
        }

        public Activity KWHzl() {
            Activity activity = C7119adn.this.new Activity();
            activity.EZpvd = this.EZpvd;
            activity.valueOf = this.valueOf;
            activity.AEQbTJ = this.AEQbTJ;
            activity.AhwBna = this.AhwBna;
            activity.KWHzl = this.KWHzl;
            activity.djBIcL = this.djBIcL;
            activity.OLrzqt = this.OLrzqt;
            activity.AYXKKw = this.AYXKKw;
            activity.copydefault = this.copydefault;
            return activity;
        }
    }

    @Override // o.InterfaceC7130ady
    public InterfaceC7130ady OLrzqt(java.lang.String str) {
        this.OLrzqt = this.OLrzqt.AEQbTJ(str);
        return this;
    }

    public final Activity EZpvd() {
        if (this.OLrzqt.EZpvd() == 0) {
            return null;
        }
        return this.OLrzqt.copydefault();
    }

    @Override // o.InterfaceC7130ady
    public InterfaceC7129adx KWHzl() {
        return C7084adE.OLrzqt(EZpvd());
    }
}
