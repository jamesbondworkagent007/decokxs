package o;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import o.NT;

/* JADX INFO: loaded from: classes2.dex */
public final class NX implements NT<java.io.InputStream> {
    public final RecyclableBufferedInputStream AEQbTJ;

    public NX(java.io.InputStream inputStream, OF of) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, of);
        this.AEQbTJ = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/lang/Object; */
    @Override // o.NT
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.io.InputStream AEQbTJ() throws java.io.IOException {
        this.AEQbTJ.reset();
        return this.AEQbTJ;
    }

    @Override // o.NT
    public void EZpvd() {
        this.AEQbTJ.KWHzl();
    }

    public void copydefault() {
        this.AEQbTJ.copydefault();
    }

    public static final class ActionBar implements NT.ActionBar<java.io.InputStream> {
        public final OF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NT.ActionBar
        public java.lang.Class<java.io.InputStream> OLrzqt() {
            return java.io.InputStream.class;
        }

        public ActionBar(OF of) {
            this.copydefault = of;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Lo/NT; */
        @Override // o.NT.ActionBar
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public NT<java.io.InputStream> EZpvd(java.io.InputStream inputStream) {
            return new NX(inputStream, this.copydefault);
        }
    }
}
