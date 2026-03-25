package o;

/* JADX INFO: renamed from: o.zsl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC59956zsl {
    public abstract boolean copydefault(C59946zsb c59946zsb, C59946zsb c59946zsb2);

    /* JADX INFO: renamed from: o.zsl$Activity */
    public static final class Activity extends AbstractC59956zsl {
        public java.lang.String AEQbTJ;

        public Activity(java.lang.String str) {
            this.AEQbTJ = str;
        }

        @Override // o.AbstractC59956zsl
        public boolean copydefault(C59946zsb c59946zsb, C59946zsb c59946zsb2) {
            return c59946zsb2.isConnected().equals(this.AEQbTJ);
        }

        public java.lang.String toString() {
            return java.lang.String.format("%s", this.AEQbTJ);
        }
    }
}
