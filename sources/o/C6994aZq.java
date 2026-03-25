package o;

import android.graphics.Bitmap;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6994aZq {
    public final Bitmap.Config AEQbTJ;
    public final int AYXKKw;
    public final int AhwBna;
    public final float AkhnZx;
    public final int DbNXlk;
    public final int EZpvd;
    public final int KWHzl;
    public final float OLrzqt;
    public final int copydefault;
    public final android.graphics.Bitmap djBIcL;
    public final int fetchVPNInfo;
    public final int gEmmrt;
    public final int isConnected;
    public final ErrorCorrectionLevel valueOf;
    public final float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bitmap.Config KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6994aZq OLrzqt(int i, int i2, android.graphics.Bitmap bitmap, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, float f2, @NotNull Bitmap.Config config, float f3, @NotNull ErrorCorrectionLevel errorCorrectionLevel) {
        Intrinsics.checkNotNullParameter(config, "");
        Intrinsics.checkNotNullParameter(errorCorrectionLevel, "");
        return new C6994aZq(i, i2, bitmap, i3, i4, i5, i6, i7, i8, i9, f, f2, config, f3, errorCorrectionLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ErrorCorrectionLevel djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6994aZq)) {
            return false;
        }
        C6994aZq c6994aZq = (C6994aZq) obj;
        return this.isConnected == c6994aZq.isConnected && this.AYXKKw == c6994aZq.AYXKKw && Intrinsics.EZpvd(this.djBIcL, c6994aZq.djBIcL) && this.gEmmrt == c6994aZq.gEmmrt && this.AhwBna == c6994aZq.AhwBna && this.DbNXlk == c6994aZq.DbNXlk && this.KWHzl == c6994aZq.KWHzl && this.fetchVPNInfo == c6994aZq.fetchVPNInfo && this.copydefault == c6994aZq.copydefault && this.EZpvd == c6994aZq.EZpvd && java.lang.Float.compare(this.AkhnZx, c6994aZq.AkhnZx) == 0 && java.lang.Float.compare(this.OLrzqt, c6994aZq.OLrzqt) == 0 && this.AEQbTJ == c6994aZq.AEQbTJ && java.lang.Float.compare(this.values, c6994aZq.values) == 0 && this.valueOf == c6994aZq.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Bitmap gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.isConnected);
        int iHashCode2 = java.lang.Integer.hashCode(this.AYXKKw);
        android.graphics.Bitmap bitmap = this.djBIcL;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + java.lang.Integer.hashCode(this.gEmmrt)) * 31) + java.lang.Integer.hashCode(this.AhwBna)) * 31) + java.lang.Integer.hashCode(this.DbNXlk)) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.fetchVPNInfo)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Float.hashCode(this.AkhnZx)) * 31) + java.lang.Float.hashCode(this.OLrzqt)) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Float.hashCode(this.values)) * 31) + this.valueOf.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "QRCodeInfo(width=" + this.isConnected + ", height=" + this.AYXKKw + ", logo=" + this.djBIcL + ", logoWidth=" + this.gEmmrt + ", logoHeight=" + this.AhwBna + ", qrColor=" + this.DbNXlk + ", bgColor=" + this.KWHzl + ", padding=" + this.fetchVPNInfo + ", anchorType=" + this.copydefault + ", contentType=" + this.EZpvd + ", ratio=" + this.AkhnZx + ", contentRatio=" + this.OLrzqt + ", config=" + this.AEQbTJ + ", psRandom=" + this.values + ", errorCorrectionLevel=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.fetchVPNInfo;
    }

    public C6994aZq(int i, int i2, android.graphics.Bitmap bitmap, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, float f2, @NotNull Bitmap.Config config, float f3, @NotNull ErrorCorrectionLevel errorCorrectionLevel) {
        Intrinsics.checkNotNullParameter(config, "");
        Intrinsics.checkNotNullParameter(errorCorrectionLevel, "");
        this.isConnected = i;
        this.AYXKKw = i2;
        this.djBIcL = bitmap;
        this.gEmmrt = i3;
        this.AhwBna = i4;
        this.DbNXlk = i5;
        this.KWHzl = i6;
        this.fetchVPNInfo = i7;
        this.copydefault = i8;
        this.EZpvd = i9;
        this.AkhnZx = f;
        this.OLrzqt = f2;
        this.AEQbTJ = config;
        this.values = f3;
        this.valueOf = errorCorrectionLevel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007e: CONSTRUCTOR 
  (r19v0 int)
  (r20v0 int)
  (wrap:android.graphics.Bitmap:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.Bitmap) : (r21v0 android.graphics.Bitmap))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r22v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r23v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-16777216 int) : (r24v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0026: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r25v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002e: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0037: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003f: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0047: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (1.0f float) : (r29v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0051: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (1.0f float) : (r30v0 float))
  (wrap:android.graphics.Bitmap$Config:?: TERNARY null = ((wrap:int:0x0059: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005f: SGET  A[WRAPPED] (LINE:45) android.graphics.Bitmap.Config.RGB_565 android.graphics.Bitmap$Config) : (r31v0 android.graphics.Bitmap$Config))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0063: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r32v0 float))
  (wrap:com.google.zxing.qrcode.decoder.ErrorCorrectionLevel:?: TERNARY null = ((wrap:int:0x006d: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0073: SGET  A[WRAPPED] (LINE:47) com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.H com.google.zxing.qrcode.decoder.ErrorCorrectionLevel) : (r33v0 com.google.zxing.qrcode.decoder.ErrorCorrectionLevel))
 A[MD:(int, int, android.graphics.Bitmap, int, int, int, int, int, int, int, float, float, android.graphics.Bitmap$Config, float, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel):void (m)] (LINE:32) call: o.aZq.<init>(int, int, android.graphics.Bitmap, int, int, int, int, int, int, int, float, float, android.graphics.Bitmap$Config, float, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel):void type: THIS */
    public /* synthetic */ C6994aZq(int i, int i2, android.graphics.Bitmap bitmap, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, float f2, Bitmap.Config config, float f3, ErrorCorrectionLevel errorCorrectionLevel, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i10 & 4) != 0 ? null : bitmap, (i10 & 8) != 0 ? -1 : i3, (i10 & 16) != 0 ? -1 : i4, (i10 & 32) != 0 ? -16777216 : i5, (i10 & 64) != 0 ? -1 : i6, (i10 & 128) != 0 ? 0 : i7, (i10 & 256) != 0 ? 0 : i8, (i10 & 512) != 0 ? 0 : i9, (i10 & 1024) != 0 ? 1.0f : f, (i10 & 2048) != 0 ? 1.0f : f2, (i10 & 4096) != 0 ? Bitmap.Config.RGB_565 : config, (i10 & 8192) != 0 ? 0.0f : f3, (i10 & 16384) != 0 ? ErrorCorrectionLevel.H : errorCorrectionLevel);
    }
}
