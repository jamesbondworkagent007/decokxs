package o;

import o.NT;

/* JADX INFO: loaded from: classes2.dex */
public class QF implements NT<java.nio.ByteBuffer> {
    public final java.nio.ByteBuffer AEQbTJ;

    @Override // o.NT
    public void EZpvd() {
    }

    public QF(java.nio.ByteBuffer byteBuffer) {
        this.AEQbTJ = byteBuffer;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/lang/Object; */
    @Override // o.NT
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.nio.ByteBuffer AEQbTJ() {
        this.AEQbTJ.position(0);
        return this.AEQbTJ;
    }

    public static class StateListAnimator implements NT.ActionBar<java.nio.ByteBuffer> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NT.ActionBar
        public java.lang.Class<java.nio.ByteBuffer> OLrzqt() {
            return java.nio.ByteBuffer.class;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Lo/NT; */
        @Override // o.NT.ActionBar
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public NT<java.nio.ByteBuffer> EZpvd(java.nio.ByteBuffer byteBuffer) {
            return new QF(byteBuffer);
        }
    }
}
