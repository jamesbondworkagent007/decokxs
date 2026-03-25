package o;

import android.graphics.Paint;
import androidx.compose.material3.CalendarModelKt;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;

/* JADX INFO: renamed from: o.oWy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36307oWy extends AbstractC36302oWt {
    public final C36246oUr AEQbTJ;
    public final Date EZpvd;
    public final android.graphics.Paint KWHzl;
    public final int OLrzqt;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    public C36307oWy(java.lang.String str) {
        super(str);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.KWHzl = paint;
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        this.OLrzqt = (-(((int) java.lang.Math.ceil(r1.bottom - r1.top)) >> 1)) - ((int) paint.getFontMetrics().top);
        paint.setTypeface(C55051xce.OLrzqt.valueOf());
        this.AEQbTJ = C36246oUr.copydefault();
        this.EZpvd = new Date();
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
        this.KWHzl.setColor(owk.EZpvd(1));
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        int i;
        ChartArea chartArea = this.AEQbTJ.values().get(EZpvd());
        oWN own = this.AEQbTJ.DCJXGO().get(copydefault());
        com.okinc.kline.library.data.DataSource dataSource = this.AEQbTJ.sSMYrx().get(copydefault());
        if (own == null || dataSource == null || dataSource.gEmmrt() == 0 || chartArea == null) {
            return;
        }
        long jIwGUEr = iwGUEr();
        if (jIwGUEr <= 0) {
            return;
        }
        if (dataSource.gEmmrt() == 1) {
            AEQbTJ(canvas, chartArea, own, dataSource, 0, jIwGUEr);
            return;
        }
        int iOLrzqt = own.OLrzqt(chartArea.fIwbmz() / 5);
        if (iOLrzqt > 0) {
            int iIsConnected = (own.isConnected() / iOLrzqt) * iOLrzqt;
            while (iIsConnected < dataSource.AEQbTJ.size() && iIsConnected <= own.fIwbmz()) {
                if (iIsConnected > dataSource.AEQbTJ.size() - 1 || iIsConnected < own.isConnected()) {
                    i = iIsConnected;
                } else {
                    i = iIsConnected;
                    AEQbTJ(canvas, chartArea, own, dataSource, iIsConnected, jIwGUEr);
                }
                iIsConnected = i + iOLrzqt;
            }
        }
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, ChartArea chartArea, oWN own, com.okinc.kline.library.data.DataSource dataSource, int i, long j) {
        java.lang.String strKWHzl;
        this.EZpvd.setTime(dataSource.AEQbTJ.get(i).AhwBna());
        if (j >= CalendarModelKt.MillisecondsIn24Hours) {
            strKWHzl = pTA.copydefault(this.EZpvd, OKDateEnum.DATE_FORMAT_SIMPLE);
        } else {
            strKWHzl = pTA.KWHzl(this.EZpvd, OKDateEnum.DATE_FORMAT_SIMPLE_MD, j < 60000 ? OKTimeEnum.TIME_FORMAT_SIMPLE : OKTimeEnum.TIME_FORMAT_SIMPLE_HM);
        }
        canvas.drawText(strKWHzl, own.AYXKKw(i), chartArea.AkhnZx() + this.OLrzqt, this.KWHzl);
    }

    public int AhwBna() {
        return AbstractC36302oWt.copydefault(22.0f);
    }
}
