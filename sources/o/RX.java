package o;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import androidx.camera.video.AudioStats;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import o.RX;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RX<T extends RX<T>> implements java.lang.Cloneable {
    public boolean AuCTelauCTel;
    public boolean AubY;
    public int AwvSrB;
    public Resources.Theme DTwDnp;
    public boolean OcIXYQ;
    public boolean QbewEr;
    public int ejfBZ;
    public android.graphics.drawable.Drawable fARcdN;
    public android.graphics.drawable.Drawable fIwbmz;
    public int fJNWhG;
    public boolean getNewProxyInstance;
    public int iwGUEr;
    public android.graphics.drawable.Drawable sSMYrx;
    public boolean uzCIH;
    public float QKVWgx = 1.0f;
    public AbstractC5360Os AuCTel = AbstractC5360Os.AEQbTJ;
    public Priority gHZMYf = Priority.NORMAL;
    public boolean getFieldNames = true;
    public int zLjUOn = -1;
    public int zuBGHE = -1;
    public NH ORxRYg = C5467Sv.OLrzqt();
    public boolean wlaJM = true;
    public NM zsXlph = new NM();
    public java.util.Map<java.lang.Class<?>, NN<?>> QOLQEE = new SB();
    public java.lang.Class<?> AxsJAY = java.lang.Object.class;
    public boolean hDKMBd = true;

    public static boolean EZpvd(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable AkhnZx() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AuCTel() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTelauCTel() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Resources.Theme AubY() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AxsJAY() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean DTwDnp() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OcIXYQ() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QKVWgx() {
        return this.AubY;
    }

    public final T UeEOUB() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NM ejfBZ() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fARcdN() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable fIwbmz() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fJNWhG() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gHZMYf() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFieldNames() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Priority getNewProxyInstance() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int hDKMBd() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Class<?> iwGUEr() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean sSMYrx() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable uzCIH() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC5360Os values() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.Class<?>, NN<?>> wlaJM() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float zLjUOn() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NH zsXlph() {
        return this.ORxRYg;
    }

    public T EZpvd(@androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        if (this.uzCIH) {
            return (T) copydefault().EZpvd(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new java.lang.IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.QKVWgx = f;
        this.iwGUEr |= 2;
        return (T) dNCPSb();
    }

    public T KWHzl(boolean z) {
        if (this.uzCIH) {
            return (T) copydefault().KWHzl(z);
        }
        this.OcIXYQ = z;
        this.iwGUEr |= 1048576;
        return (T) dNCPSb();
    }

    public T AEQbTJ(boolean z) {
        if (this.uzCIH) {
            return (T) copydefault().AEQbTJ(z);
        }
        this.AuCTelauCTel = z;
        this.iwGUEr |= 524288;
        return (T) dNCPSb();
    }

    public T copydefault(@androidx.annotation.NonNull AbstractC5360Os abstractC5360Os) {
        if (this.uzCIH) {
            return (T) copydefault().copydefault(abstractC5360Os);
        }
        this.AuCTel = (AbstractC5360Os) SE.OLrzqt(abstractC5360Os);
        this.iwGUEr |= 4;
        return (T) dNCPSb();
    }

    public T OLrzqt(@androidx.annotation.NonNull Priority priority) {
        if (this.uzCIH) {
            return (T) copydefault().OLrzqt(priority);
        }
        this.gHZMYf = (Priority) SE.OLrzqt(priority);
        this.iwGUEr |= 8;
        return (T) dNCPSb();
    }

    public T AEQbTJ(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        if (this.uzCIH) {
            return (T) copydefault().AEQbTJ(drawable);
        }
        this.sSMYrx = drawable;
        int i = this.iwGUEr;
        this.AwvSrB = 0;
        this.iwGUEr = (i | 64) & (-129);
        return (T) dNCPSb();
    }

    public T KWHzl(@androidx.annotation.DrawableRes int i) {
        if (this.uzCIH) {
            return (T) copydefault().KWHzl(i);
        }
        this.AwvSrB = i;
        int i2 = this.iwGUEr;
        this.sSMYrx = null;
        this.iwGUEr = (i2 | 128) & (-65);
        return (T) dNCPSb();
    }

    public T EZpvd(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        if (this.uzCIH) {
            return (T) copydefault().EZpvd(drawable);
        }
        this.fIwbmz = drawable;
        int i = this.iwGUEr;
        this.ejfBZ = 0;
        this.iwGUEr = (i | 8192) & (-16385);
        return (T) dNCPSb();
    }

    public T AEQbTJ(@androidx.annotation.DrawableRes int i) {
        if (this.uzCIH) {
            return (T) copydefault().AEQbTJ(i);
        }
        this.ejfBZ = i;
        int i2 = this.iwGUEr;
        this.fIwbmz = null;
        this.iwGUEr = (i2 | 16384) & (-8193);
        return (T) dNCPSb();
    }

    public T OLrzqt(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        if (this.uzCIH) {
            return (T) copydefault().OLrzqt(drawable);
        }
        this.fARcdN = drawable;
        int i = this.iwGUEr;
        this.fJNWhG = 0;
        this.iwGUEr = (i | 16) & (-33);
        return (T) dNCPSb();
    }

    public T copydefault(@androidx.annotation.DrawableRes int i) {
        if (this.uzCIH) {
            return (T) copydefault().copydefault(i);
        }
        this.fJNWhG = i;
        int i2 = this.iwGUEr;
        this.fARcdN = null;
        this.iwGUEr = (i2 | 32) & (-17);
        return (T) dNCPSb();
    }

    /* JADX DEBUG: Type inference failed for r0v4. Raw type applied. Possible types: o.NJ<android.content.res.Resources$Theme>, o.NJ<Y> */
    public T EZpvd(@androidx.annotation.Nullable Resources.Theme theme) {
        if (this.uzCIH) {
            return (T) copydefault().EZpvd(theme);
        }
        this.DTwDnp = theme;
        if (theme != null) {
            this.iwGUEr |= 32768;
            return (T) OLrzqt((NJ<Resources.Theme>) QT.AEQbTJ, theme);
        }
        this.iwGUEr &= -32769;
        return (T) copydefault(QT.AEQbTJ);
    }

    public T copydefault(boolean z) {
        if (this.uzCIH) {
            return (T) copydefault().copydefault(true);
        }
        this.getFieldNames = !z;
        this.iwGUEr |= 256;
        return (T) dNCPSb();
    }

    public T copydefault(int i, int i2) {
        if (this.uzCIH) {
            return (T) copydefault().copydefault(i, i2);
        }
        this.zuBGHE = i;
        this.zLjUOn = i2;
        this.iwGUEr |= 512;
        return (T) dNCPSb();
    }

    public T OLrzqt(int i) {
        return (T) copydefault(i, i);
    }

    public T AEQbTJ(@androidx.annotation.NonNull NH nh) {
        if (this.uzCIH) {
            return (T) copydefault().AEQbTJ(nh);
        }
        this.ORxRYg = (NH) SE.OLrzqt(nh);
        this.iwGUEr |= 1024;
        return (T) dNCPSb();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // 
    public T copydefault() {
        try {
            T t = (T) super.clone();
            NM nm = new NM();
            t.zsXlph = nm;
            nm.AEQbTJ(this.zsXlph);
            SB sb = new SB();
            t.QOLQEE = sb;
            sb.putAll(this.QOLQEE);
            t.getNewProxyInstance = false;
            t.uzCIH = false;
            return t;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public <Y> T OLrzqt(@androidx.annotation.NonNull NJ<Y> nj, @androidx.annotation.NonNull Y y) {
        if (this.uzCIH) {
            return (T) copydefault().OLrzqt(nj, y);
        }
        SE.OLrzqt(nj);
        SE.OLrzqt(y);
        this.zsXlph.copydefault(nj, y);
        return (T) dNCPSb();
    }

    public T copydefault(@androidx.annotation.NonNull NJ<?> nj) {
        if (this.uzCIH) {
            return (T) copydefault().copydefault(nj);
        }
        this.zsXlph.EZpvd(nj);
        return (T) dNCPSb();
    }

    public T AEQbTJ(@androidx.annotation.NonNull java.lang.Class<?> cls) {
        if (this.uzCIH) {
            return (T) copydefault().AEQbTJ(cls);
        }
        this.AxsJAY = (java.lang.Class) SE.OLrzqt(cls);
        this.iwGUEr |= 4096;
        return (T) dNCPSb();
    }

    public final boolean ORxRYg() {
        return EZpvd(2048);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.NJ<com.bumptech.glide.load.DecodeFormat>, o.NJ<Y> */
    public T AEQbTJ(@androidx.annotation.NonNull DecodeFormat decodeFormat) {
        SE.OLrzqt(decodeFormat);
        return (T) OLrzqt((NJ<DecodeFormat>) C5403Qj.AEQbTJ, decodeFormat).OLrzqt(C5424Re.copydefault, decodeFormat);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.NJ<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy>, o.NJ<Y> */
    public T EZpvd(@androidx.annotation.NonNull DownsampleStrategy downsampleStrategy) {
        return (T) OLrzqt((NJ<java.lang.Object>) DownsampleStrategy.valueOf, SE.OLrzqt(downsampleStrategy));
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.NJ<java.lang.Integer>, o.NJ<Y> */
    public T AYXKKw(@androidx.annotation.IntRange(from = 0) int i) {
        return (T) OLrzqt((NJ<java.lang.Integer>) PF.OLrzqt, java.lang.Integer.valueOf(i));
    }

    public T QfsBiF() {
        return (T) EZpvd(DownsampleStrategy.copydefault, new C5405Ql());
    }

    public T djBIcL() {
        return (T) OLrzqt(DownsampleStrategy.copydefault, new C5405Ql());
    }

    public T QUSxYX() {
        return (T) copydefault(DownsampleStrategy.gEmmrt, new C5412Qs());
    }

    public T fetchVPNInfo() {
        return (T) AEQbTJ(DownsampleStrategy.gEmmrt, new C5412Qs());
    }

    public T QbewEr() {
        return (T) copydefault(DownsampleStrategy.OLrzqt, new C5404Qk());
    }

    public T valueOf() {
        return (T) AEQbTJ(DownsampleStrategy.OLrzqt, new C5404Qk());
    }

    public T gEmmrt() {
        return (T) OLrzqt(DownsampleStrategy.OLrzqt, new C5401Qh());
    }

    public final T EZpvd(@androidx.annotation.NonNull DownsampleStrategy downsampleStrategy, @androidx.annotation.NonNull NN<android.graphics.Bitmap> nn) {
        if (this.uzCIH) {
            return (T) copydefault().EZpvd(downsampleStrategy, nn);
        }
        EZpvd(downsampleStrategy);
        return (T) EZpvd(nn, false);
    }

    public final T OLrzqt(@androidx.annotation.NonNull DownsampleStrategy downsampleStrategy, @androidx.annotation.NonNull NN<android.graphics.Bitmap> nn) {
        if (this.uzCIH) {
            return (T) copydefault().OLrzqt(downsampleStrategy, nn);
        }
        EZpvd(downsampleStrategy);
        return (T) EZpvd(nn);
    }

    public final T AEQbTJ(@androidx.annotation.NonNull DownsampleStrategy downsampleStrategy, @androidx.annotation.NonNull NN<android.graphics.Bitmap> nn) {
        return (T) OLrzqt(downsampleStrategy, nn, true);
    }

    public final T copydefault(@androidx.annotation.NonNull DownsampleStrategy downsampleStrategy, @androidx.annotation.NonNull NN<android.graphics.Bitmap> nn) {
        return (T) OLrzqt(downsampleStrategy, nn, false);
    }

    public final T OLrzqt(@androidx.annotation.NonNull DownsampleStrategy downsampleStrategy, @androidx.annotation.NonNull NN<android.graphics.Bitmap> nn, boolean z) {
        T t;
        if (z) {
            t = (T) OLrzqt(downsampleStrategy, nn);
        } else {
            t = (T) EZpvd(downsampleStrategy, nn);
        }
        t.hDKMBd = true;
        return t;
    }

    public T EZpvd(@androidx.annotation.NonNull NN<android.graphics.Bitmap> nn) {
        return (T) EZpvd(nn, true);
    }

    public T AEQbTJ(@androidx.annotation.NonNull NN<android.graphics.Bitmap>... nnArr) {
        if (nnArr.length > 1) {
            return (T) EZpvd((NN<android.graphics.Bitmap>) new NG(nnArr), true);
        }
        if (nnArr.length == 1) {
            return (T) EZpvd(nnArr[0]);
        }
        return (T) dNCPSb();
    }

    public T copydefault(@androidx.annotation.NonNull NN<android.graphics.Bitmap> nn) {
        return (T) EZpvd(nn, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.NN<android.graphics.Bitmap> */
    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.NN<android.graphics.drawable.BitmapDrawable>, o.NN<Y> */
    /* JADX WARN: Multi-variable type inference failed */
    public T EZpvd(@androidx.annotation.NonNull NN<android.graphics.Bitmap> nn, boolean z) {
        if (this.uzCIH) {
            return (T) copydefault().EZpvd(nn, z);
        }
        C5413Qt c5413Qt = new C5413Qt(nn, z);
        EZpvd(android.graphics.Bitmap.class, nn, z);
        EZpvd(android.graphics.drawable.Drawable.class, c5413Qt, z);
        EZpvd(BitmapDrawable.class, c5413Qt.OLrzqt(), z);
        EZpvd(QX.class, new C5422Rc(nn), z);
        return (T) dNCPSb();
    }

    public <Y> T EZpvd(@androidx.annotation.NonNull java.lang.Class<Y> cls, @androidx.annotation.NonNull NN<Y> nn, boolean z) {
        if (this.uzCIH) {
            return (T) copydefault().EZpvd(cls, nn, z);
        }
        SE.OLrzqt(cls);
        SE.OLrzqt(nn);
        this.QOLQEE.put(cls, nn);
        int i = this.iwGUEr;
        this.wlaJM = true;
        this.iwGUEr = 67584 | i;
        this.hDKMBd = false;
        if (z) {
            this.iwGUEr = i | 198656;
            this.AubY = true;
        }
        return (T) dNCPSb();
    }

    public T DbNXlk() {
        if (this.uzCIH) {
            return (T) copydefault().DbNXlk();
        }
        this.QOLQEE.clear();
        int i = this.iwGUEr;
        this.AubY = false;
        this.wlaJM = false;
        this.iwGUEr = (i & (-133121)) | 65536;
        this.hDKMBd = true;
        return (T) dNCPSb();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.NJ<java.lang.Boolean>, o.NJ<Y> */
    public T AYXKKw() {
        return (T) OLrzqt((NJ<java.lang.Boolean>) C5424Re.KWHzl, java.lang.Boolean.TRUE);
    }

    public T KWHzl(@androidx.annotation.NonNull RX<?> rx) {
        if (this.uzCIH) {
            return (T) copydefault().KWHzl(rx);
        }
        if (EZpvd(rx.iwGUEr, 2)) {
            this.QKVWgx = rx.QKVWgx;
        }
        if (EZpvd(rx.iwGUEr, 262144)) {
            this.QbewEr = rx.QbewEr;
        }
        if (EZpvd(rx.iwGUEr, 1048576)) {
            this.OcIXYQ = rx.OcIXYQ;
        }
        if (EZpvd(rx.iwGUEr, 4)) {
            this.AuCTel = rx.AuCTel;
        }
        if (EZpvd(rx.iwGUEr, 8)) {
            this.gHZMYf = rx.gHZMYf;
        }
        if (EZpvd(rx.iwGUEr, 16)) {
            this.fARcdN = rx.fARcdN;
            this.fJNWhG = 0;
            this.iwGUEr &= -33;
        }
        if (EZpvd(rx.iwGUEr, 32)) {
            this.fJNWhG = rx.fJNWhG;
            this.fARcdN = null;
            this.iwGUEr &= -17;
        }
        if (EZpvd(rx.iwGUEr, 64)) {
            this.sSMYrx = rx.sSMYrx;
            this.AwvSrB = 0;
            this.iwGUEr &= -129;
        }
        if (EZpvd(rx.iwGUEr, 128)) {
            this.AwvSrB = rx.AwvSrB;
            this.sSMYrx = null;
            this.iwGUEr &= -65;
        }
        if (EZpvd(rx.iwGUEr, 256)) {
            this.getFieldNames = rx.getFieldNames;
        }
        if (EZpvd(rx.iwGUEr, 512)) {
            this.zuBGHE = rx.zuBGHE;
            this.zLjUOn = rx.zLjUOn;
        }
        if (EZpvd(rx.iwGUEr, 1024)) {
            this.ORxRYg = rx.ORxRYg;
        }
        if (EZpvd(rx.iwGUEr, 4096)) {
            this.AxsJAY = rx.AxsJAY;
        }
        if (EZpvd(rx.iwGUEr, 8192)) {
            this.fIwbmz = rx.fIwbmz;
            this.ejfBZ = 0;
            this.iwGUEr &= -16385;
        }
        if (EZpvd(rx.iwGUEr, 16384)) {
            this.ejfBZ = rx.ejfBZ;
            this.fIwbmz = null;
            this.iwGUEr &= -8193;
        }
        if (EZpvd(rx.iwGUEr, 32768)) {
            this.DTwDnp = rx.DTwDnp;
        }
        if (EZpvd(rx.iwGUEr, 65536)) {
            this.wlaJM = rx.wlaJM;
        }
        if (EZpvd(rx.iwGUEr, 131072)) {
            this.AubY = rx.AubY;
        }
        if (EZpvd(rx.iwGUEr, 2048)) {
            this.QOLQEE.putAll(rx.QOLQEE);
            this.hDKMBd = rx.hDKMBd;
        }
        if (EZpvd(rx.iwGUEr, 524288)) {
            this.AuCTelauCTel = rx.AuCTelauCTel;
        }
        if (!this.wlaJM) {
            this.QOLQEE.clear();
            int i = this.iwGUEr;
            this.AubY = false;
            this.iwGUEr = i & (-133121);
            this.hDKMBd = true;
        }
        this.iwGUEr |= rx.iwGUEr;
        this.zsXlph.AEQbTJ(rx.zsXlph);
        return (T) dNCPSb();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof RX) {
            RX rx = (RX) obj;
            if (java.lang.Float.compare(rx.QKVWgx, this.QKVWgx) == 0 && this.fJNWhG == rx.fJNWhG && SI.AEQbTJ(this.fARcdN, rx.fARcdN) && this.AwvSrB == rx.AwvSrB && SI.AEQbTJ(this.sSMYrx, rx.sSMYrx) && this.ejfBZ == rx.ejfBZ && SI.AEQbTJ(this.fIwbmz, rx.fIwbmz) && this.getFieldNames == rx.getFieldNames && this.zLjUOn == rx.zLjUOn && this.zuBGHE == rx.zuBGHE && this.AubY == rx.AubY && this.wlaJM == rx.wlaJM && this.QbewEr == rx.QbewEr && this.AuCTelauCTel == rx.AuCTelauCTel && this.AuCTel.equals(rx.AuCTel) && this.gHZMYf == rx.gHZMYf && this.zsXlph.equals(rx.zsXlph) && this.QOLQEE.equals(rx.QOLQEE) && this.AxsJAY.equals(rx.AxsJAY) && SI.AEQbTJ(this.ORxRYg, rx.ORxRYg) && SI.AEQbTJ(this.DTwDnp, rx.DTwDnp)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return SI.OLrzqt(this.DTwDnp, SI.OLrzqt(this.ORxRYg, SI.OLrzqt(this.AxsJAY, SI.OLrzqt(this.QOLQEE, SI.OLrzqt(this.zsXlph, SI.OLrzqt(this.gHZMYf, SI.OLrzqt(this.AuCTel, SI.OLrzqt(this.AuCTelauCTel, SI.OLrzqt(this.QbewEr, SI.OLrzqt(this.wlaJM, SI.OLrzqt(this.AubY, SI.KWHzl(this.zuBGHE, SI.KWHzl(this.zLjUOn, SI.OLrzqt(this.getFieldNames, SI.OLrzqt(this.fIwbmz, SI.KWHzl(this.ejfBZ, SI.OLrzqt(this.sSMYrx, SI.KWHzl(this.AwvSrB, SI.OLrzqt(this.fARcdN, SI.KWHzl(this.fJNWhG, SI.OLrzqt(this.QKVWgx)))))))))))))))))))));
    }

    public T QVAiDq() {
        this.getNewProxyInstance = true;
        return (T) UeEOUB();
    }

    public T AhwBna() {
        if (this.getNewProxyInstance && !this.uzCIH) {
            throw new java.lang.IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.uzCIH = true;
        return (T) QVAiDq();
    }

    public final T dNCPSb() {
        if (this.getNewProxyInstance) {
            throw new java.lang.IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) UeEOUB();
    }

    public final boolean AwvSrB() {
        return EZpvd(4);
    }

    public final boolean QOLQEE() {
        return EZpvd(256);
    }

    public final boolean zuBGHE() {
        return EZpvd(8);
    }

    public final boolean RJOkX() {
        return SI.OLrzqt(this.zuBGHE, this.zLjUOn);
    }

    public final boolean EZpvd(int i) {
        return EZpvd(this.iwGUEr, i);
    }
}
