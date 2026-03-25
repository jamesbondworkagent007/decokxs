package o;

import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.ChartHighlighter;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

/* JADX INFO: renamed from: o.vkJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C51291vkJ<T extends BarLineScatterCandleBubbleDataProvider> extends ChartHighlighter<T> {
    public C51291vkJ(T t) {
        super(t);
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    public BarLineScatterCandleBubbleData getData() {
        LineData lineData = (LineData) super.getData();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = lineData.getDataSets().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((LineDataSet) ((ILineDataSet) it.next())).getValues());
        }
        return new LineData(new LineDataSet(arrayList, ""));
    }
}
