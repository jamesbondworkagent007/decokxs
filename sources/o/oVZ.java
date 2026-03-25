package o;

import com.okinc.kline.library.layout.ChartArea;

/* JADX INFO: loaded from: classes8.dex */
public class oVZ extends C36284oWb {
    public oVZ(java.lang.String str) {
        super(str);
    }

    @Override // o.C36284oWb, o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        ChartArea chartArea = C36246oUr.copydefault().values().get(EZpvd());
        if (chartArea == null) {
            return;
        }
        this.KWHzl.set(chartArea.AYXKKw(), chartArea.AuCTel(), chartArea.DbNXlk(), chartArea.KWHzl());
        canvas.drawRect(this.KWHzl, this.OLrzqt);
    }
}
