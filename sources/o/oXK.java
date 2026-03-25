package o;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes8.dex */
public final class oXK {
    public final android.graphics.Paint AEQbTJ;
    public final android.graphics.Paint AYXKKw;
    public final android.graphics.Paint AhwBna;
    public final android.graphics.Paint AkhnZx;
    public android.graphics.Paint AuCTel;
    public float DbNXlk;
    public final android.graphics.Paint EZpvd;
    public final float KWHzl;
    public final android.graphics.Paint OLrzqt;
    public final android.graphics.Paint copydefault;
    public final android.graphics.Paint djBIcL;
    public final android.graphics.Paint fIwbmz;
    public final android.graphics.Paint fJNWhG;
    public DashPathEffect fetchVPNInfo;
    public final android.graphics.Paint gEmmrt;
    public final android.graphics.Paint isConnected;
    public final float values;
    public float valueOf = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
    public float ejfBZ = C55298xhM.dp2pxFloat$default(16.0f, null, 1, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Paint AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Paint AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Paint AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Paint DbNXlk() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Paint EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Paint KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Paint OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Paint copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Paint fetchVPNInfo() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Paint gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Paint isConnected() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Paint valueOf() {
        return this.gEmmrt;
    }

    public oXK() {
        float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(1.0f, null, 1, null);
        this.values = fDp2pxFloat$default;
        float fDp2pxFloat$default2 = C55298xhM.dp2pxFloat$default(2.0f, null, 1, null);
        this.KWHzl = fDp2pxFloat$default2;
        this.DbNXlk = C55298xhM.dp2pxFloat$default(0.25f, null, 1, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Join join = Paint.Join.MITER;
        paint.setStrokeJoin(join);
        this.gEmmrt = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setStrokeJoin(join);
        this.fJNWhG = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setStrokeJoin(join);
        this.isConnected = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setAntiAlias(true);
        paint4.setStyle(style);
        paint4.setStrokeJoin(join);
        this.OLrzqt = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        paint5.setAntiAlias(true);
        paint5.setStyle(style);
        paint5.setStrokeJoin(join);
        this.AkhnZx = paint5;
        android.graphics.Paint paint6 = new android.graphics.Paint();
        paint6.setAntiAlias(true);
        paint6.setStyle(style);
        paint6.setStrokeJoin(join);
        this.copydefault = paint6;
        android.graphics.Paint paint7 = new android.graphics.Paint();
        paint7.setAntiAlias(true);
        paint7.setStyle(style);
        this.djBIcL = paint7;
        android.graphics.Paint paint8 = new android.graphics.Paint();
        paint8.setAntiAlias(true);
        paint8.setStyle(style);
        this.fIwbmz = paint8;
        android.graphics.Paint paint9 = new android.graphics.Paint();
        paint9.setAntiAlias(true);
        paint9.setStyle(style);
        paint9.setStrokeJoin(join);
        paint9.setStrokeWidth(fDp2pxFloat$default);
        paint9.setPathEffect(new DashPathEffect(new float[]{fDp2pxFloat$default2, fDp2pxFloat$default2}, 0.0f));
        this.AYXKKw = paint9;
        android.graphics.Paint paint10 = new android.graphics.Paint();
        paint10.setAntiAlias(true);
        paint10.setStyle(style);
        paint10.setStrokeJoin(join);
        this.AEQbTJ = paint10;
        android.graphics.Paint paint11 = new android.graphics.Paint();
        paint11.setAntiAlias(true);
        paint11.setStyle(style);
        paint11.setStrokeJoin(join);
        this.EZpvd = paint11;
        android.graphics.Paint paint12 = new android.graphics.Paint();
        paint12.setAntiAlias(true);
        paint12.setStyle(style);
        paint12.setStrokeJoin(join);
        this.AhwBna = paint12;
        android.graphics.Paint paint13 = new android.graphics.Paint();
        paint13.setAntiAlias(true);
        paint13.setStyle(style);
        paint13.setStrokeJoin(join);
        this.AuCTel = paint13;
    }

    public final void OLrzqt(@NotNull oXS oxs) {
        Intrinsics.checkNotNullParameter(oxs, "");
        this.isConnected.setColor(oxs.copydefault());
        this.AkhnZx.setColor(oxs.copydefault());
        this.copydefault.setColor(oxs.EZpvd());
        this.AEQbTJ.setColor(oxs.KWHzl());
        this.AhwBna.setColor(oxs.AEQbTJ());
        this.EZpvd.setColor(oxs.AEQbTJ());
        this.AYXKKw.setColor(oxs.KWHzl());
        this.gEmmrt.setColor(Color.argb(51, Color.red(oxs.OLrzqt()), Color.green(oxs.OLrzqt()), Color.blue(oxs.OLrzqt())));
        this.fJNWhG.setColor(Color.argb(127, Color.red(oxs.OLrzqt()), Color.green(oxs.OLrzqt()), Color.blue(oxs.OLrzqt())));
        this.AuCTel.setColor(0);
        if (oxs.AhwBna() != 0) {
            this.AhwBna.setShadowLayer(this.valueOf, 0.0f, 0.0f, oxs.AhwBna());
            this.AuCTel.setShadowLayer(this.ejfBZ, 0.0f, 0.0f, oxs.AhwBna());
        } else {
            this.AhwBna.clearShadowLayer();
            this.AuCTel.clearShadowLayer();
        }
    }

    public final void OLrzqt(@NotNull oXS oxs, @NotNull oXP oxp) {
        Intrinsics.checkNotNullParameter(oxs, "");
        Intrinsics.checkNotNullParameter(oxp, "");
        this.fetchVPNInfo = new DashPathEffect(new float[]{oxp.ejfBZ(), oxp.valueOf()}, 0.0f);
        this.isConnected.setStrokeWidth(oxp.valueOf());
        this.isConnected.setPathEffect(this.fetchVPNInfo);
        this.isConnected.setShader(KWHzl(oxp.AhwBna(), oxp.gEmmrt(), this.isConnected.getColor(), true, oxs.gEmmrt()));
        this.AkhnZx.setStrokeWidth(oxp.valueOf());
        this.AkhnZx.setShader(KWHzl(oxp.AhwBna(), oxp.gEmmrt(), this.isConnected.getColor(), true, oxs.gEmmrt()));
        this.copydefault.setShader(KWHzl(oxp.AhwBna(), oxp.gEmmrt(), this.copydefault.getColor(), false, oxs.djBIcL()));
        this.copydefault.setStrokeWidth(oxp.ejfBZ());
        this.copydefault.setPathEffect(new DashPathEffect(new float[]{oxp.ejfBZ(), oxp.valueOf()}, 0.0f));
    }

    public final void copydefault(@NotNull oXH<?> oxh) {
        Intrinsics.checkNotNullParameter(oxh, "");
        this.djBIcL.setColor(oxh.gEmmrt().copydefault());
        this.djBIcL.setTextSize(oxh.gEmmrt().KWHzl());
        android.graphics.Typeface typefaceOLrzqt = oxh.gEmmrt().OLrzqt();
        if (typefaceOLrzqt != null) {
            this.djBIcL.setTypeface(typefaceOLrzqt);
        }
        this.fIwbmz.setColor(oxh.gEmmrt().copydefault());
        this.fIwbmz.setTextSize(oxh.gEmmrt().KWHzl());
        android.graphics.Typeface typefaceOLrzqt2 = oxh.gEmmrt().OLrzqt();
        if (typefaceOLrzqt2 != null) {
            this.fIwbmz.setTypeface(typefaceOLrzqt2);
        }
    }

    public final void EZpvd(int i, int i2) {
        float f = 400;
        float f2 = 255;
        this.OLrzqt.setAlpha((int) ((C56548yJl.valueOf(i, i2) / f) * f2));
        int iCopydefault = (int) (f2 * (C56548yJl.copydefault(i + LuaValue.ERR_WRITE_FILE_ERROR, 0) / f));
        this.djBIcL.setAlpha(iCopydefault);
        this.fIwbmz.setAlpha(iCopydefault);
    }

    public final LinearGradient KWHzl(float f, float f2, int i, boolean z, int i2) {
        int iArgb = Color.argb(0, Color.red(i), Color.green(i), Color.blue(i));
        int iArgb2 = Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
        if (z) {
            return new LinearGradient(0.0f, f, 0.0f, f2, new int[]{iArgb, iArgb2}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, f2, 0.0f, f, new int[]{iArgb, iArgb2}, (float[]) null, Shader.TileMode.CLAMP);
    }
}
