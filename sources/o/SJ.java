package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SJ {
    public abstract void AEQbTJ();

    public abstract void OLrzqt(boolean z);

    public static SJ copydefault() {
        return new StateListAnimator();
    }

    private SJ() {
    }

    public static class StateListAnimator extends SJ {
        public volatile boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.SJ
        public void OLrzqt(boolean z) {
            this.OLrzqt = z;
        }

        public StateListAnimator() {
            super();
        }

        @Override // o.SJ
        public void AEQbTJ() {
            if (this.OLrzqt) {
                throw new java.lang.IllegalStateException("Already released");
            }
        }
    }
}
