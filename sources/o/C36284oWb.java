package o;

import android.graphics.Paint;
import com.okinc.kline.library.layout.ChartArea;

/* JADX INFO: renamed from: o.oWb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36284oWb extends AbstractC36302oWt {
    public final android.graphics.Rect KWHzl;
    public final android.graphics.Paint OLrzqt;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    public C36284oWb(java.lang.String str) {
        super(str);
        this.KWHzl = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.OLrzqt = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
        this.OLrzqt.setColor(owk.OLrzqt());
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        ChartArea chartArea = C36246oUr.copydefault().values().get(EZpvd());
        if (chartArea == null) {
            return;
        }
        canvas.drawRect(chartArea.fetchVPNInfo(), this.OLrzqt);
    }
}
