package o;

import android.graphics.Paint;
import android.graphics.RectF;
import androidx.camera.video.AudioStats;
import com.okinc.kline.library.layout.ChartArea;
import java.text.NumberFormat;

/* JADX INFO: renamed from: o.oWz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36308oWz extends AbstractC36302oWt {
    public final android.graphics.Paint AEQbTJ;
    public final int AYXKKw;
    public final int AhwBna;
    public int AkhnZx;
    public final int DbNXlk;
    public final android.graphics.Paint EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final android.graphics.Paint djBIcL;
    public final float fIwbmz;
    public final int fetchVPNInfo;
    public final android.graphics.Paint gEmmrt;
    public final NumberFormat isConnected;
    public final android.graphics.Paint valueOf;
    public final RectF values;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    public C36308oWz(java.lang.String str) {
        super(str);
        this.values = new RectF();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(java.util.Locale.US);
        this.isConnected = numberInstance;
        numberInstance.setGroupingUsed(false);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.djBIcL = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setStrokeWidth(AbstractC36302oWt.copydefault(1.0f));
        paint.setPathEffect(this.getPriority);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.valueOf = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        C55051xce c55051xce = C55051xce.OLrzqt;
        paint2.setTypeface(c55051xce.valueOf());
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.EZpvd = paint3;
        paint3.setStyle(style);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.AEQbTJ = paint4;
        paint4.setStyle(style);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.gEmmrt = paint5;
        paint5.setAntiAlias(true);
        paint5.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint5.setTypeface(c55051xce.valueOf());
        Paint.FontMetrics fontMetrics = paint5.getFontMetrics();
        this.AkhnZx = (int) java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top);
        this.fIwbmz = (-(r0 >> 1)) - fontMetrics.top;
        this.fetchVPNInfo = AbstractC36302oWt.copydefault(16.0f);
        this.DbNXlk = AbstractC36302oWt.copydefault(2.0f);
        this.AYXKKw = AbstractC36302oWt.copydefault(4.0f);
        this.AhwBna = AbstractC36302oWt.copydefault(4.0f);
        this.KWHzl = AbstractC36302oWt.copydefault(2.0f);
        this.OLrzqt = AbstractC36302oWt.copydefault(4.0f);
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
        this.djBIcL.setColor(owk.AkhnZx());
        this.EZpvd.setColor(owk.fetchVPNInfo());
        this.AEQbTJ.setColor(owk.djBIcL());
        this.gEmmrt.setColor(owk.DbNXlk());
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        if (this.zhUgOk) {
            return;
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        ChartArea chartArea = c36246oUrCopydefault.values().get(EZpvd());
        oWN own = c36246oUrCopydefault.DCJXGO().get(copydefault());
        if (chartArea == null || own == null || own.DbNXlk() < 0) {
            return;
        }
        AEQbTJ(canvas, c36246oUrCopydefault, chartArea, own);
        int iUzCIH = own.uzCIH();
        if (iUzCIH >= chartArea.KWHzl() || iUzCIH <= chartArea.AuCTel()) {
            return;
        }
        EZpvd(canvas, c36246oUrCopydefault, own, chartArea.EZpvd());
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, C36246oUr c36246oUr, ChartArea chartArea, oWN own) {
        float fAYXKKw = own.AYXKKw(own.DbNXlk());
        float fUzCIH = own.uzCIH();
        canvas.drawCircle(fAYXKKw, fUzCIH, this.OLrzqt, this.AEQbTJ);
        canvas.drawCircle(fAYXKKw, fUzCIH, this.KWHzl, this.EZpvd);
        canvas.drawLine(fAYXKKw, chartArea.AuCTel(), fAYXKKw, chartArea.KWHzl(), this.djBIcL);
        canvas.drawLine(chartArea.AYXKKw(), fUzCIH, chartArea.DbNXlk() - AEQbTJ(AbstractC36302oWt.AYXKKw(c36246oUr.iwGUEr().QVAiDq().get(chartArea.EZpvd()).EZpvd(r15))), fUzCIH, this.djBIcL);
    }

    public final void EZpvd(android.graphics.Canvas canvas, C36246oUr c36246oUr, oWN own, java.lang.String str) {
        java.lang.String strAYXKKw;
        com.okinc.kline.library.data.DataSource dataSource = c36246oUr.sSMYrx().get(copydefault());
        oWC owc = c36246oUr.iwGUEr().QVAiDq().get(str);
        if (owc == null || dataSource == null || dataSource.gEmmrt() < 1) {
            return;
        }
        int iUzCIH = own.uzCIH();
        this.isConnected.setMaximumFractionDigits(owc.isConnected());
        this.isConnected.setMinimumFractionDigits(owc.isConnected());
        if (owc.AhwBna().equals("VOLUME")) {
            strAYXKKw = oWC.AEQbTJ(owc.EZpvd(iUzCIH), owc.isConnected());
        } else if (valueOf(owc.AhwBna())) {
            if (getFieldNames()) {
                double dEZpvd = owc.EZpvd(iUzCIH);
                if (dEZpvd < AudioStats.AUDIO_AMPLITUDE_NONE) {
                    if (-1.7976931348623157E308d == dEZpvd) {
                        dEZpvd = 0.0d;
                    }
                    strAYXKKw = AbstractC36302oWt.AEQbTJ(dEZpvd, 2);
                } else {
                    if (Double.MAX_VALUE == dEZpvd) {
                        dEZpvd = 0.0d;
                    }
                    strAYXKKw = oWC.AEQbTJ(dEZpvd, 2);
                }
            } else {
                strAYXKKw = "0";
            }
        } else {
            strAYXKKw = AbstractC36302oWt.AYXKKw(owc.EZpvd(iUzCIH));
        }
        int i = this.fetchVPNInfo;
        int width = canvas.getWidth();
        int iAEQbTJ = AEQbTJ(strAYXKKw);
        int i2 = this.KWHzl;
        int i3 = i >> 1;
        this.values.set((width - iAEQbTJ) - i2, iUzCIH - i3, canvas.getWidth() - this.KWHzl, i3 + iUzCIH);
        RectF rectF = this.values;
        float f = this.DbNXlk;
        canvas.drawRoundRect(rectF, f, f, this.EZpvd);
        this.gEmmrt.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText(strAYXKKw, r4 - this.AhwBna, iUzCIH + this.fIwbmz, this.gEmmrt);
    }

    private int AEQbTJ(java.lang.String str) {
        return (int) (this.valueOf.measureText(str) + this.AYXKKw + this.AhwBna);
    }
}
