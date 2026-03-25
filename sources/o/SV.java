package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SV {
    public int EZpvd = 1;
    public boolean AEQbTJ = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.EZpvd;
    }

    public abstract int EZpvd();

    public abstract int KWHzl();

    public abstract int OLrzqt();

    public abstract int copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i) {
        this.EZpvd = i;
    }

    public void KWHzl(ST st) {
        int i = this.EZpvd;
        if (i == 1) {
            AEQbTJ(st, false);
            KWHzl(st, false);
            EZpvd(st, false);
            return;
        }
        if (i == 2) {
            AEQbTJ(st, true);
            KWHzl(st, false);
            EZpvd(st, false);
        } else if (i == 3) {
            AEQbTJ(st, false);
            KWHzl(st, true);
            EZpvd(st, false);
        } else {
            if (i != 4) {
                return;
            }
            AEQbTJ(st, false);
            KWHzl(st, false);
            EZpvd(st, true);
        }
    }

    public final void AEQbTJ(ST st, boolean z) {
        st.KWHzl(KWHzl(), z);
    }

    public final void KWHzl(ST st, boolean z) {
        st.KWHzl(copydefault(), z);
    }

    public final void EZpvd(ST st, boolean z) {
        int iEZpvd = EZpvd();
        if (iEZpvd != 0) {
            st.KWHzl(iEZpvd, z);
        }
    }

    public final boolean AYXKKw() {
        if (EZpvd() == 0) {
            return true;
        }
        return this.AEQbTJ;
    }
}
