package o;

import com.okinc.kline.library.layout.ChartArea;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oVT extends ChartArea {
    public ChartArea fIwbmz;
    public final java.util.ArrayList<ChartArea> fJNWhG;

    public abstract void OLrzqt(android.graphics.Canvas canvas);

    public abstract void copydefault(oWK owk);

    public void AEQbTJ(ChartArea chartArea) {
        this.fIwbmz = chartArea;
        OLrzqt(true);
    }

    public int getFieldNames() {
        return this.fJNWhG.size();
    }

    public ChartArea AEQbTJ(int i) {
        return this.fJNWhG.get(i);
    }

    public void EZpvd(ChartArea chartArea) {
        this.fJNWhG.add(chartArea);
        OLrzqt(true);
    }

    public void copydefault(ChartArea chartArea) {
        if (this.fJNWhG.remove(chartArea)) {
            OLrzqt(true);
        }
    }

    public oVT(java.lang.String str) {
        super(str);
        this.fJNWhG = new java.util.ArrayList<>();
    }

    @Override // com.okinc.kline.library.layout.ChartArea
    public ChartArea EZpvd(int i, int i2) {
        java.util.Iterator<ChartArea> it = this.fJNWhG.iterator();
        while (it.hasNext()) {
            ChartArea chartAreaEZpvd = it.next().EZpvd(i, i2);
            if (chartAreaEZpvd != null) {
                return chartAreaEZpvd;
            }
        }
        return null;
    }

    @Override // com.okinc.kline.library.layout.ChartArea
    public ChartArea AEQbTJ(int i, int i2) {
        java.util.Iterator<ChartArea> it = this.fJNWhG.iterator();
        while (it.hasNext()) {
            ChartArea chartAreaAEQbTJ = it.next().AEQbTJ(i, i2);
            if (chartAreaAEQbTJ != null) {
                return chartAreaAEQbTJ;
            }
        }
        return null;
    }
}
