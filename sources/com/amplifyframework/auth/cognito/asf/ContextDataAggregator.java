package com.amplifyframework.auth.cognito.asf;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56403yEb;
import o.C56406yEe;
import o.C56423yEv;
import o.C56548yJl;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ContextDataAggregator {
    private List<? extends DataCollector> dataCollectors;

    public ContextDataAggregator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dataCollectors = yDY.gEmmrt(new ApplicationDataCollector(), new BuildDataCollector(), new DeviceDataCollector(str));
    }

    public final Map<String, String> getAggregatedData(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        List<? extends DataCollector> list = this.dataCollectors;
        ArrayList<Map.Entry> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, ((DataCollector) it.next()).collect(context).entrySet());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
        for (Map.Entry entry : arrayList) {
            Pair pairOLrzqt = C56390yDp.OLrzqt(entry.getKey(), entry.getValue());
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getValue();
            if (!(str == null || str.length() == 0)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2;
    }
}
