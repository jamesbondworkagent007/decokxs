package o;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import o.C5403Qj;

/* JADX INFO: loaded from: classes2.dex */
public class QE implements NL<java.io.InputStream, android.graphics.Bitmap> {
    public final C5403Qj EZpvd;
    public final OF OLrzqt;

    public QE(C5403Qj c5403Qj, OF of) {
        this.EZpvd = c5403Qj;
        this.OLrzqt = of;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
    @Override // o.NL
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@androidx.annotation.NonNull java.io.InputStream inputStream, @androidx.annotation.NonNull NM nm) {
        return this.EZpvd.AEQbTJ(inputStream);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
    @Override // o.NL
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public OC<android.graphics.Bitmap> copydefault(@androidx.annotation.NonNull java.io.InputStream inputStream, int i, int i2, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        boolean z;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            z = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.OLrzqt);
        }
        C5470Sy c5470SyOLrzqt = C5470Sy.OLrzqt(recyclableBufferedInputStream);
        try {
            return this.EZpvd.AEQbTJ(new SG(c5470SyOLrzqt), i, i2, nm, new TaskDescription(recyclableBufferedInputStream, c5470SyOLrzqt));
        } finally {
            c5470SyOLrzqt.KWHzl();
            if (z) {
                recyclableBufferedInputStream.KWHzl();
            }
        }
    }

    public static class TaskDescription implements C5403Qj.Application {
        public final RecyclableBufferedInputStream AEQbTJ;
        public final C5470Sy OLrzqt;

        public TaskDescription(RecyclableBufferedInputStream recyclableBufferedInputStream, C5470Sy c5470Sy) {
            this.AEQbTJ = recyclableBufferedInputStream;
            this.OLrzqt = c5470Sy;
        }

        @Override // o.C5403Qj.Application
        public void EZpvd() {
            this.AEQbTJ.copydefault();
        }

        @Override // o.C5403Qj.Application
        public void KWHzl(OG og, android.graphics.Bitmap bitmap) throws java.io.IOException {
            java.io.IOException iOExceptionCopydefault = this.OLrzqt.copydefault();
            if (iOExceptionCopydefault != null) {
                if (bitmap != null) {
                    og.copydefault(bitmap);
                    throw iOExceptionCopydefault;
                }
                throw iOExceptionCopydefault;
            }
        }
    }
}
