package o;

import android.graphics.Bitmap;
import com.bumptech.glide.load.EncodeStrategy;
import java.util.Objects;

/* JADX INFO: renamed from: o.Qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5395Qb implements NP<android.graphics.Bitmap> {
    public static final NJ<java.lang.Integer> AEQbTJ = NJ.OLrzqt("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final NJ<Bitmap.CompressFormat> KWHzl = NJ.OLrzqt("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    public final OF OLrzqt;

    public C5395Qb(@androidx.annotation.NonNull OF of) {
        this.OLrzqt = of;
    }

    @java.lang.Deprecated
    public C5395Qb() {
        this.OLrzqt = null;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/io/File;Lo/NM;)Z */
    @Override // o.NI
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean KWHzl(@androidx.annotation.NonNull OC<android.graphics.Bitmap> oc, @androidx.annotation.NonNull java.io.File file, @androidx.annotation.NonNull NM nm) {
        java.io.OutputStream fileOutputStream;
        boolean z;
        android.graphics.Bitmap bitmapAEQbTJ = oc.AEQbTJ();
        Bitmap.CompressFormat compressFormatEZpvd = EZpvd(bitmapAEQbTJ, nm);
        SH.OLrzqt("encode: [%dx%d] %s", java.lang.Integer.valueOf(bitmapAEQbTJ.getWidth()), java.lang.Integer.valueOf(bitmapAEQbTJ.getHeight()), compressFormatEZpvd);
        try {
            long jCopydefault = SF.copydefault();
            int iIntValue = ((java.lang.Integer) nm.OLrzqt(AEQbTJ)).intValue();
            java.io.OutputStream nq = null;
            try {
                fileOutputStream = new java.io.FileOutputStream(file);
            } catch (java.io.IOException unused) {
                fileOutputStream = nq;
            } catch (java.lang.Throwable th) {
                th = th;
                fileOutputStream = nq;
            }
            try {
                nq = this.OLrzqt != null ? new NQ(fileOutputStream, this.OLrzqt) : fileOutputStream;
                bitmapAEQbTJ.compress(compressFormatEZpvd, iIntValue, nq);
                nq.close();
                try {
                    nq.close();
                } catch (java.io.IOException unused2) {
                }
                z = true;
            } catch (java.io.IOException unused3) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (java.io.IOException unused4) {
                    }
                }
                z = false;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (java.io.IOException unused5) {
                    }
                }
                throw th;
            }
            if (android.util.Log.isLoggable("BitmapEncoder", 2)) {
                Objects.toString(compressFormatEZpvd);
                SI.KWHzl(bitmapAEQbTJ);
                SF.OLrzqt(jCopydefault);
                Objects.toString(nm.OLrzqt(KWHzl));
                bitmapAEQbTJ.hasAlpha();
            }
            return z;
        } finally {
            SH.EZpvd();
        }
    }

    public final Bitmap.CompressFormat EZpvd(android.graphics.Bitmap bitmap, NM nm) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) nm.OLrzqt(KWHzl);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Override // o.NP
    public EncodeStrategy EZpvd(@androidx.annotation.NonNull NM nm) {
        return EncodeStrategy.TRANSFORMED;
    }
}
