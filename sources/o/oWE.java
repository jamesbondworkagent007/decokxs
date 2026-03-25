package o;

import android.graphics.Paint;
import android.graphics.RectF;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;

/* JADX INFO: loaded from: classes8.dex */
public class oWE extends AbstractC36302oWt {
    public final android.graphics.Paint AEQbTJ;
    public final android.graphics.Paint AYXKKw;
    public final Date AhwBna;
    public final int EZpvd;
    public final android.graphics.Paint KWHzl;
    public final int OLrzqt;
    public final RectF djBIcL;
    public final float fetchVPNInfo;
    public int gEmmrt;
    public final float valueOf;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    public oWE(java.lang.String str) {
        super(str);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.AYXKKw = paint;
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint.setTypeface(C55051xce.OLrzqt.valueOf());
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.gEmmrt = (int) java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top);
        this.fetchVPNInfo = (-(r2 >> 1)) - ((int) fontMetrics.top);
        this.valueOf = paint.measureText("0000-00-00 00:00") + AbstractC36302oWt.copydefault(4.0f);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.KWHzl = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(AbstractC36302oWt.copydefault(0.5f));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.AEQbTJ = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.EZpvd = AbstractC36302oWt.copydefault(16.0f);
        this.OLrzqt = AbstractC36302oWt.copydefault(2.0f);
        this.AhwBna = new Date();
        this.djBIcL = new RectF();
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
        this.AYXKKw.setColor(owk.DbNXlk());
        this.KWHzl.setColor(owk.EZpvd(6));
        this.AEQbTJ.setColor(owk.fetchVPNInfo());
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        ChartArea chartArea = c36246oUrCopydefault.values().get(EZpvd());
        com.okinc.kline.library.data.DataSource dataSource = c36246oUrCopydefault.sSMYrx().get(copydefault());
        oWN own = c36246oUrCopydefault.DCJXGO().get(copydefault());
        if (chartArea == null || dataSource == null || own == null || own.DbNXlk() < 0) {
            return;
        }
        float fAYXKKw = own.AYXKKw(own.DbNXlk());
        float f = this.valueOf / 2.0f;
        float f2 = 1.0f + f;
        if (fAYXKKw < f2) {
            fAYXKKw = f2;
        } else if (f + fAYXKKw > chartArea.DbNXlk()) {
            fAYXKKw = chartArea.DbNXlk() - (this.valueOf / 2.0f);
        }
        float f3 = this.valueOf / 2.0f;
        int iAkhnZx = chartArea.AkhnZx();
        int i = this.EZpvd;
        this.djBIcL.set(fAYXKKw - f3, iAkhnZx - (i >> 1), f3 + fAYXKKw, chartArea.AkhnZx() + (this.EZpvd >> 1));
        RectF rectF = this.djBIcL;
        float f4 = this.OLrzqt;
        canvas.drawRoundRect(rectF, f4, f4, this.AEQbTJ);
        if (own.hDKMBd() < 0 && !dataSource.AEQbTJ.isEmpty()) {
            Date date = this.AhwBna;
            DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList = dataSource.AEQbTJ;
            date.setTime(dataArrayList.get(dataArrayList.size() - 1).AhwBna() + (((long) (own.DbNXlk() - (dataSource.AEQbTJ.size() - 1))) * iwGUEr()));
        } else if (dataSource.AEQbTJ.size() > 1) {
            this.AhwBna.setTime(dataSource.AEQbTJ.get(own.hDKMBd()).AhwBna());
        } else {
            this.AhwBna.setTime(dataSource.AEQbTJ.get(0).AhwBna());
        }
        c36246oUrCopydefault.OLrzqt(this.AhwBna.getTime(), c36246oUrCopydefault.ODWQjV());
        canvas.drawText(pTA.KWHzl(this.AhwBna, OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM), fAYXKKw, chartArea.AkhnZx() + this.fetchVPNInfo, this.AYXKKw);
    }
}
