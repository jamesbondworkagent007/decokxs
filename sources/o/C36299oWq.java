package o;

import android.graphics.Paint;
import androidx.camera.video.AudioStats;
import com.okinc.kline.library.layout.ChartArea;

/* JADX INFO: renamed from: o.oWq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36299oWq extends AbstractC36302oWt {
    public final android.graphics.Paint KWHzl;
    public final android.graphics.Paint OLrzqt;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    public C36299oWq(java.lang.String str) {
        super(str);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.KWHzl = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.OLrzqt = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AbstractC36302oWt.copydefault(1.0f));
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
        this.KWHzl.setColor(owk.OLrzqt(5));
        this.KWHzl.setAlpha(200);
        this.OLrzqt.setColor(owk.KWHzl());
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        if (this.zhUgOk) {
            return;
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        ChartArea chartArea = c36246oUrCopydefault.values().get(EZpvd());
        oWC owc = c36246oUrCopydefault.iwGUEr().QVAiDq().get(EZpvd());
        if (owc == null || owc.AuCTel() == AudioStats.AUDIO_AMPLITUDE_NONE || !owc.AhwBna().equals("PRICE")) {
            return;
        }
        int iAYXKKw = chartArea.AYXKKw();
        int iDbNXlk = chartArea.DbNXlk();
        int iAuCTel = chartArea.AuCTel();
        int iKWHzl = chartArea.KWHzl();
        java.util.ArrayList<java.lang.Double> arrayListAYXKKw = owc.AYXKKw();
        if (owc.AhwBna().equals("PRICE")) {
            for (java.lang.Double dValueOf : arrayListAYXKKw) {
                if (c36246oUrCopydefault.zLjUOn().isCompareKLine()) {
                    dValueOf = java.lang.Double.valueOf(gEmmrt(dValueOf.doubleValue()));
                }
                float fDjBIcL = owc.djBIcL(dValueOf.doubleValue());
                canvas.drawLine(iAYXKKw, fDjBIcL, iDbNXlk, fDjBIcL, this.KWHzl);
            }
            if (c36246oUrCopydefault.zLjUOn().isCompareKLine()) {
                copydefault(canvas, owc);
            }
        } else {
            float fZsXlph = ((iKWHzl * 1.0f) - (iAuCTel * 1.0f)) / c36246oUrCopydefault.zsXlph();
            for (int i = 0; i < c36246oUrCopydefault.zsXlph(); i++) {
                float f = fZsXlph * i;
                canvas.drawLine(iAYXKKw, f, iDbNXlk, f, this.KWHzl);
            }
        }
        float f2 = ((iDbNXlk * 1.0f) - (iAYXKKw * 1.0f)) / 5.0f;
        for (int i2 = 0; i2 < 5; i2++) {
            if (i2 != 0) {
                float f3 = f2 * i2;
                canvas.drawLine(f3, iAuCTel, f3, iKWHzl, this.KWHzl);
            }
        }
    }

    public final void copydefault(android.graphics.Canvas canvas, oWC owc) {
        float fDjBIcL = owc.djBIcL(fARcdN());
        canvas.drawLine(0.0f, fDjBIcL, canvas.getWidth(), fDjBIcL, this.OLrzqt);
    }
}
