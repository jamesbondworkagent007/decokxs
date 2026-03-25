package o;

import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorSectionUiModel;

/* JADX INFO: loaded from: classes16.dex */
public final class uDT {
    public static final int OLrzqt(Indicator indicator) {
        if (!indicator.gEmmrt()) {
            return 0;
        }
        if (indicator instanceof Indicator.MultiValue) {
            return C56548yJl.copydefault(((Indicator.MultiValue) indicator).AhwBna().size(), 1);
        }
        return 1;
    }

    public static final int KWHzl(Indicator indicator) {
        boolean z = indicator instanceof Indicator.MultiValue;
        return 1;
    }

    public static final uDU EZpvd(uDU udu) {
        java.util.List<IndicatorSectionUiModel> listAEQbTJ = udu.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, ((IndicatorSectionUiModel) it.next()).OLrzqt());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((Indicator) obj).gEmmrt()) {
                arrayList2.add(obj);
            }
        }
        java.util.Iterator it2 = arrayList2.iterator();
        int iOLrzqt = 0;
        while (it2.hasNext()) {
            iOLrzqt += OLrzqt((Indicator) it2.next());
        }
        return uDU.copy$default(udu, null, iOLrzqt, 0, false, 13, null);
    }
}
