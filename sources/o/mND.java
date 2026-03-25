package o;

/* JADX INFO: loaded from: classes8.dex */
public class mND {
    public static StateListAnimator EZpvd;
    public static java.util.Map<java.lang.String, mNF> KWHzl;

    private mND() {
    }

    public static mNF OLrzqt(@androidx.annotation.NonNull java.lang.String str) {
        java.util.Map<java.lang.String, mNF> map = KWHzl;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public static StateListAnimator KWHzl(@androidx.annotation.NonNull android.content.Context context) {
        StateListAnimator stateListAnimator = new StateListAnimator(context);
        EZpvd = stateListAnimator;
        return stateListAnimator;
    }

    public static void EZpvd(java.lang.String str) {
        java.util.Map<java.lang.String, mNF> map = KWHzl;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        KWHzl.get(str).EZpvd();
        KWHzl.remove(str);
    }

    public static class StateListAnimator {
        public boolean AEQbTJ;
        public android.animation.TimeInterpolator AhwBna;
        public mNN AuCTel;
        public int DbNXlk;
        public java.lang.Class[] EZpvd;
        public android.content.Context KWHzl;
        public int ejfBZ;
        public int fARcdN;
        public android.view.View fIwbmz;
        public mNK fetchVPNInfo;
        public int gEmmrt;
        public int isConnected;
        public int fJNWhG = -2;
        public int djBIcL = -2;
        public int copydefault = 8388659;
        public boolean values = true;
        public int valueOf = 3;
        public long AYXKKw = 300;
        public boolean OLrzqt = true;
        public java.lang.String AkhnZx = "default_float_window_tag";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator AEQbTJ(int i) {
            this.fJNWhG = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator AEQbTJ(int i, int i2, int i3) {
            this.valueOf = i;
            this.isConnected = i2;
            this.DbNXlk = i3;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator AEQbTJ(@androidx.annotation.NonNull java.lang.String str) {
            this.AkhnZx = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator AEQbTJ(mNK mnk) {
            this.fetchVPNInfo = mnk;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator EZpvd(int i) {
            this.djBIcL = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator EZpvd(@androidx.annotation.NonNull android.view.View view) {
            this.fIwbmz = view;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator EZpvd(mNN mnn) {
            this.AuCTel = mnn;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator KWHzl(boolean z) {
            this.AEQbTJ = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator OLrzqt(int i) {
            this.ejfBZ = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator copydefault(int i) {
            this.fARcdN = i;
            return this;
        }

        private StateListAnimator() {
        }

        public StateListAnimator(android.content.Context context) {
            this.KWHzl = context;
        }

        public StateListAnimator copydefault(int i, float f) {
            int iEZpvd;
            if (i == 0) {
                iEZpvd = mNQ.AEQbTJ(this.KWHzl);
            } else {
                iEZpvd = mNQ.EZpvd(this.KWHzl);
            }
            this.fJNWhG = (int) (iEZpvd * f);
            return this;
        }

        public StateListAnimator OLrzqt(int i, float f) {
            int iEZpvd;
            if (i == 0) {
                iEZpvd = mNQ.AEQbTJ(this.KWHzl);
            } else {
                iEZpvd = mNQ.EZpvd(this.KWHzl);
            }
            this.fARcdN = (int) (iEZpvd * f);
            return this;
        }

        public StateListAnimator AEQbTJ(int i, float f) {
            int iEZpvd;
            if (i == 0) {
                iEZpvd = mNQ.AEQbTJ(this.KWHzl);
            } else {
                iEZpvd = mNQ.EZpvd(this.KWHzl);
            }
            this.ejfBZ = (int) (iEZpvd * f);
            return this;
        }

        public StateListAnimator KWHzl(int i) {
            return AEQbTJ(i, 0, 0);
        }

        public void KWHzl() {
            if (mND.KWHzl == null) {
                mND.KWHzl = new java.util.HashMap();
            }
            android.view.View view = this.fIwbmz;
            if (view == null && this.gEmmrt == 0) {
                throw new java.lang.IllegalArgumentException("View has not been set!");
            }
            if (view == null) {
                this.fIwbmz = mNQ.KWHzl(this.KWHzl, this.gEmmrt);
            }
            mND.KWHzl.put(this.AkhnZx, new mNE(this));
        }
    }
}
