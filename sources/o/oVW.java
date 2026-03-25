package o;

import com.okinc.kline.library.layout.ChartArea;

/* JADX INFO: loaded from: classes8.dex */
public class oVW extends ChartArea {
    public oVW(java.lang.String str) {
        super(str);
    }

    @Override // com.okinc.kline.library.layout.ChartArea
    public ChartArea AEQbTJ(int i, int i2) {
        oWN own;
        ChartArea chartAreaAEQbTJ = super.AEQbTJ(i, i2);
        if (chartAreaAEQbTJ == this && (own = C36246oUr.copydefault().DCJXGO().get(copydefault())) != null) {
            own.KWHzl(i, i2);
        }
        return chartAreaAEQbTJ;
    }
}
