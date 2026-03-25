package o;

import android.graphics.Bitmap;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.Queue;
import o.InterfaceC5341Nz;

/* JADX INFO: loaded from: classes2.dex */
public class QW implements NL<java.nio.ByteBuffer, QX> {
    public final java.util.List<ImageHeaderParser> AhwBna;
    public final android.content.Context EZpvd;
    public final Activity OLrzqt;
    public final ActionBar copydefault;
    public final QZ gEmmrt;
    public static final Activity KWHzl = new Activity();
    public static final ActionBar AEQbTJ = new ActionBar();

    public QW(android.content.Context context, java.util.List<ImageHeaderParser> list, OG og, OF of) {
        this(context, list, og, of, AEQbTJ, KWHzl);
    }

    public QW(android.content.Context context, java.util.List<ImageHeaderParser> list, OG og, OF of, ActionBar actionBar, Activity activity) {
        this.EZpvd = context.getApplicationContext();
        this.AhwBna = list;
        this.OLrzqt = activity;
        this.gEmmrt = new QZ(og, of);
        this.copydefault = actionBar;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
    @Override // o.NL
    public boolean copydefault(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        return !((java.lang.Boolean) nm.OLrzqt(C5424Re.KWHzl)).booleanValue() && NK.OLrzqt(this.AhwBna, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
    @Override // o.NL
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public QV copydefault(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer, int i, int i2, @androidx.annotation.NonNull NM nm) {
        NB nbEZpvd = this.copydefault.EZpvd(byteBuffer);
        try {
            return AEQbTJ(byteBuffer, i, i2, nbEZpvd, nm);
        } finally {
            this.copydefault.EZpvd(nbEZpvd);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE]}, finally: {[INVOKE, INVOKE, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [128=4, 129=4] */
    public final QV AEQbTJ(java.nio.ByteBuffer byteBuffer, int i, int i2, NB nb, NM nm) {
        long jCopydefault = SF.copydefault();
        try {
            NA naKWHzl = nb.KWHzl();
            if (naKWHzl.copydefault() > 0 && naKWHzl.OLrzqt() == 0) {
                Bitmap.Config config = nm.OLrzqt(C5424Re.copydefault) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC5341Nz interfaceC5341NzAEQbTJ = this.OLrzqt.AEQbTJ(this.gEmmrt, naKWHzl, byteBuffer, OLrzqt(naKWHzl, i, i2));
                interfaceC5341NzAEQbTJ.KWHzl(config);
                interfaceC5341NzAEQbTJ.OLrzqt();
                android.graphics.Bitmap bitmapAYXKKw = interfaceC5341NzAEQbTJ.AYXKKw();
                if (bitmapAYXKKw == null) {
                    return null;
                }
                QV qv = new QV(new QX(this.EZpvd, interfaceC5341NzAEQbTJ, PW.AEQbTJ(), i, i2, bitmapAYXKKw));
                if (android.util.Log.isLoggable("BufferGifDecoder", 2)) {
                    SF.OLrzqt(jCopydefault);
                }
                return qv;
            }
            if (android.util.Log.isLoggable("BufferGifDecoder", 2)) {
                SF.OLrzqt(jCopydefault);
            }
            return null;
        } finally {
            if (android.util.Log.isLoggable("BufferGifDecoder", 2)) {
                SF.OLrzqt(jCopydefault);
            }
        }
    }

    public static int OLrzqt(NA na, int i, int i2) {
        int iMin = java.lang.Math.min(na.AEQbTJ() / i2, na.KWHzl() / i);
        int iMax = java.lang.Math.max(1, iMin == 0 ? 0 : java.lang.Integer.highestOneBit(iMin));
        if (android.util.Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            na.KWHzl();
            na.AEQbTJ();
        }
        return iMax;
    }

    public static class Activity {
        public InterfaceC5341Nz AEQbTJ(InterfaceC5341Nz.Application application, NA na, java.nio.ByteBuffer byteBuffer, int i) {
            return new NE(application, na, byteBuffer, i);
        }
    }

    public static class ActionBar {
        public final Queue<NB> OLrzqt = SI.copydefault(0);

        public NB EZpvd(java.nio.ByteBuffer byteBuffer) {
            NB nbEZpvd;
            synchronized (this) {
                NB nbPoll = this.OLrzqt.poll();
                if (nbPoll == null) {
                    nbPoll = new NB();
                }
                nbEZpvd = nbPoll.EZpvd(byteBuffer);
            }
            return nbEZpvd;
        }

        public void EZpvd(NB nb) {
            synchronized (this) {
                nb.OLrzqt();
                this.OLrzqt.offer(nb);
            }
        }
    }
}
