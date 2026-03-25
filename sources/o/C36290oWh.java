package o;

import android.graphics.Paint;
import android.graphics.RectF;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.layout.ChartArea;

/* JADX INFO: renamed from: o.oWh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36290oWh extends AbstractC36302oWt {
    public java.util.ArrayList<DrawLineData.Dot> AEQbTJ;
    public int AYXKKw;
    public android.graphics.Paint AhwBna;
    public int EZpvd;
    public android.graphics.Paint KWHzl;
    public final int OLrzqt;
    public final RectF djBIcL;
    public int gEmmrt;
    public float isConnected;
    public int valueOf;
    public int values;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    public C36290oWh(java.lang.String str) {
        super(str);
        this.djBIcL = new RectF();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.KWHzl = paint;
        paint.setStyle(Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.AhwBna = paint2;
        paint2.setAntiAlias(true);
        this.AhwBna.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        this.AhwBna.setTypeface(C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf"));
        this.AhwBna.setColor(-1);
        Paint.FontMetrics fontMetrics = this.AhwBna.getFontMetrics();
        this.values = (int) java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top);
        this.isConnected = (-(r1 >> 1)) - fontMetrics.top;
        this.AYXKKw = AbstractC36302oWt.copydefault(16.0f);
        this.gEmmrt = AbstractC36302oWt.copydefault(2.0f);
        this.EZpvd = AbstractC36302oWt.copydefault(4.0f);
        this.valueOf = AbstractC36302oWt.copydefault(4.0f);
        this.OLrzqt = AbstractC36302oWt.copydefault(16.0f);
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
        this.KWHzl.setColor(owk.ejfBZ());
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        DrawLineData drawLineData = DrawLineData.copydefault;
        if (drawLineData.isConnected() == null) {
            return;
        }
        java.util.ArrayList<DrawLineData.Dot> dotList = drawLineData.isConnected().getDotList();
        this.AEQbTJ = dotList;
        if (dotList.isEmpty()) {
            return;
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        ChartArea chartArea = c36246oUrCopydefault.values().get(EZpvd());
        if (chartArea == null) {
            return;
        }
        AEQbTJ(canvas, c36246oUrCopydefault, this.AEQbTJ);
        this.KWHzl.setAlpha(255);
        for (int i = 0; i < this.AEQbTJ.size(); i++) {
            copydefault(canvas, c36246oUrCopydefault, this.AEQbTJ.get(i), chartArea);
        }
    }

    private void AEQbTJ(android.graphics.Canvas canvas, C36246oUr c36246oUr, java.util.ArrayList<DrawLineData.Dot> arrayList) {
        ChartArea chartArea = c36246oUr.values().get(EZpvd());
        oWN own = c36246oUr.DCJXGO().get(copydefault());
        if (chartArea == null || own == null) {
            return;
        }
        C37897pEt c37897pEt = C37897pEt.KWHzl;
        DrawLineData.Dot first = c37897pEt.copydefault(arrayList).getFirst();
        DrawLineData.Dot second = c37897pEt.copydefault(arrayList).getSecond();
        float y = (float) first.getY();
        float y2 = (float) second.getY();
        if (y == y2) {
            DrawLineData drawLineData = DrawLineData.copydefault;
            if (drawLineData.isConnected().getLineType() != DrawLineData.LineType.PRICE_LINE && drawLineData.isConnected().getLineType() != DrawLineData.LineType.H_SEGMENT && drawLineData.isConnected().getLineType() != DrawLineData.LineType.H_RADIAL && drawLineData.isConnected().getLineType() != DrawLineData.LineType.H_LINE) {
                y2 = own.uzCIH();
            }
        }
        java.lang.String strAYXKKw = AbstractC36302oWt.AYXKKw(first.getPrice());
        int width = canvas.getWidth() - this.OLrzqt;
        int iCopydefault = copydefault(strAYXKKw);
        this.KWHzl.setAlpha(50);
        this.djBIcL.set(width - iCopydefault, y, width, y2);
        canvas.drawRect(this.djBIcL, this.KWHzl);
    }

    public final void copydefault(android.graphics.Canvas canvas, C36246oUr c36246oUr, DrawLineData.Dot dot, ChartArea chartArea) {
        int y;
        if (c36246oUr.sSMYrx().get(copydefault()).gEmmrt() >= 1 && (y = (int) dot.getY()) <= chartArea.KWHzl()) {
            java.lang.String strAYXKKw = AbstractC36302oWt.AYXKKw(dot.getPrice());
            int i = this.AYXKKw;
            int i2 = i >> 1;
            this.djBIcL.set(r1 - copydefault(strAYXKKw), y - i2, canvas.getWidth() - this.OLrzqt, i2 + y);
            RectF rectF = this.djBIcL;
            float f = this.gEmmrt;
            canvas.drawRoundRect(rectF, f, f, this.KWHzl);
            this.AhwBna.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(strAYXKKw, r1 - this.valueOf, y + this.isConnected, this.AhwBna);
        }
    }

    public final int copydefault(java.lang.String str) {
        return (int) (this.AhwBna.measureText(str) + this.EZpvd + this.valueOf);
    }
}
