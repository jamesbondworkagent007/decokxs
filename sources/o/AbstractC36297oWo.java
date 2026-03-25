package o;

import android.graphics.Paint;
import android.graphics.RectF;
import com.okinc.kline.library.layout.ChartArea;
import java.text.NumberFormat;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.oWo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC36297oWo extends AbstractC36302oWt {
    public int AEQbTJ;
    public final float AYXKKw;
    public final NumberFormat AhwBna;
    public int AkhnZx;
    public android.graphics.Paint[] AuCTel;
    public int DbNXlk;
    public final java.lang.String KWHzl;
    public int OLrzqt;
    public android.graphics.Paint djBIcL;
    public android.graphics.Paint ejfBZ;
    public final int fIwbmz;
    public int fJNWhG;
    public int fetchVPNInfo;
    public int gEmmrt;
    public int isConnected;
    public final NumberFormat valueOf;
    public final NumberFormat values;

    public java.lang.String valueOf() {
        return null;
    }

    public AbstractC36297oWo(java.lang.String str) {
        super(str);
        this.AuCTel = new android.graphics.Paint[4];
        this.gEmmrt = 0;
        this.fJNWhG = 0;
        this.KWHzl = ": --";
        android.graphics.Paint paint = new android.graphics.Paint();
        this.ejfBZ = paint;
        paint.setAntiAlias(true);
        this.ejfBZ.setTextAlign(Paint.Align.LEFT);
        this.ejfBZ.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        this.ejfBZ.setTypeface(C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf"));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.djBIcL = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint.FontMetrics fontMetrics = this.ejfBZ.getFontMetrics();
        this.fIwbmz = (int) java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top);
        int i = 0;
        while (true) {
            android.graphics.Paint[] paintArr = this.AuCTel;
            if (i < paintArr.length) {
                paintArr[i] = new android.graphics.Paint(this.ejfBZ);
                i++;
            } else {
                this.OLrzqt = AbstractC36302oWt.copydefault(2.0f);
                this.AEQbTJ = AbstractC36302oWt.copydefault(20.0f);
                this.AkhnZx = AbstractC36302oWt.copydefault(16.0f);
                this.DbNXlk = AbstractC36302oWt.copydefault(6.0f);
                this.fetchVPNInfo = AbstractC36302oWt.copydefault(14.0f);
                this.AYXKKw = -this.ejfBZ.getFontMetrics().top;
                java.util.Locale locale = java.util.Locale.US;
                NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
                this.AhwBna = numberInstance;
                numberInstance.setGroupingUsed(false);
                NumberFormat numberInstance2 = NumberFormat.getNumberInstance(locale);
                this.values = numberInstance2;
                numberInstance2.setGroupingUsed(false);
                NumberFormat numberInstance3 = NumberFormat.getNumberInstance(locale);
                this.valueOf = numberInstance3;
                numberInstance3.setGroupingUsed(false);
                return;
            }
        }
    }

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
        oWC owc = C36246oUr.copydefault().iwGUEr().QVAiDq().get(EZpvd());
        this.values.setMaximumFractionDigits(owc.isConnected());
        this.values.setMinimumFractionDigits(owc.values());
        this.AhwBna.setMaximumFractionDigits(owc.isConnected());
        this.AhwBna.setMinimumFractionDigits(owc.values());
        this.valueOf.setMaximumFractionDigits(4);
        this.valueOf.setMinimumFractionDigits(2);
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
        this.ejfBZ.setColor(owk.EZpvd(3));
        this.djBIcL.setColor(owk.AEQbTJ());
        int i = 0;
        while (true) {
            android.graphics.Paint[] paintArr = this.AuCTel;
            if (i >= paintArr.length) {
                return;
            }
            paintArr[i].setColor(owk.copydefault(i));
            i++;
        }
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        java.lang.String strValueOf;
        if (C36246oUr.copydefault().values().get(EZpvd()) == null || (strValueOf = valueOf()) == null) {
            return;
        }
        canvas.drawText(strValueOf, r0.AYXKKw() + this.AkhnZx, r0.AuCTel() + this.AYXKKw, this.ejfBZ);
    }

    public void KWHzl(android.graphics.Canvas canvas, java.lang.String[] strArr, int[] iArr, int i, int i2, android.graphics.Paint paint) {
        if (strArr.length == 0) {
            return;
        }
        int width = (canvas.getWidth() - (this.AkhnZx * 2)) - this.fJNWhG;
        float f = i;
        boolean z = this instanceof C36300oWr;
        int i3 = 0;
        if (!z || !C36246oUr.copydefault().aUsmxb()) {
            float f2 = f;
            int i4 = 0;
            while (i3 < strArr.length) {
                java.lang.String str = strArr[i3];
                if (str != null) {
                    int iMeasureText = (int) paint.measureText(str);
                    if (iMeasureText > width) {
                        width = (canvas.getWidth() - (this.AkhnZx * 2)) - this.fJNWhG;
                        i4++;
                        f2 = f;
                    }
                    if (z) {
                        this.djBIcL.setAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
                        int i5 = this.fIwbmz;
                        canvas.drawRoundRect(new RectF(f2, (i4 * i5) + i2, iMeasureText + f2, i2 + ((i4 + 1) * i5)), 0.0f, 0.0f, this.djBIcL);
                    }
                    paint.setColor(iArr[i3]);
                    canvas.drawText(strArr[i3], f2, i2 + this.AYXKKw + (this.fIwbmz * i4), paint);
                    f2 += iMeasureText;
                    width -= iMeasureText;
                }
                i3++;
            }
            i3 = i4;
        }
        if (z) {
            C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
            if (c36246oUrCopydefault.aUsmxb() || c36246oUrCopydefault.zLjUOn().isCeFiMCapMode()) {
                this.isConnected = c36246oUrCopydefault.zuBGHE();
            } else {
                this.isConnected = c36246oUrCopydefault.iwGUEr().AubY() + c36246oUrCopydefault.zuBGHE();
            }
            this.gEmmrt = c36246oUrCopydefault.zuBGHE();
        } else {
            this.isConnected = (this.fIwbmz * (i3 + 1)) + (this.DbNXlk * 2);
        }
        gEmmrt();
    }

    public void AYXKKw() {
        this.isConnected = C36246oUr.copydefault().iwGUEr().AubY();
        this.gEmmrt = C36246oUr.copydefault().zuBGHE();
        gEmmrt();
    }

    public final void gEmmrt() {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        ChartArea chartArea = c36246oUrCopydefault.values().get(EZpvd());
        oWC owc = c36246oUrCopydefault.iwGUEr().QVAiDq().get(EZpvd());
        if (chartArea == null || owc == null || owc.fIwbmz() == this.isConnected) {
            return;
        }
        chartArea.OLrzqt(true);
        owc.OLrzqt(this.isConnected);
        int i = this.gEmmrt;
        if (i > 0) {
            owc.KWHzl(i);
        }
        owc.AubY();
    }
}
