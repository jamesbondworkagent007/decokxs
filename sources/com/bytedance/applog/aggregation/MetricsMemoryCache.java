package com.bytedance.applog.aggregation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MetricsMemoryCache implements IMetricsCache {
    private final HashMap<String, Metrics> cache = new HashMap<>();

    @Override // com.bytedance.applog.aggregation.IMetricsCache
    public Metrics get(@NotNull String str) {
        Intrinsics.EZpvd((Object) str, "");
        return this.cache.get(str);
    }

    @Override // com.bytedance.applog.aggregation.IMetricsCache
    public void insert(@NotNull String str, @NotNull Metrics metrics) {
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) metrics, "");
        this.cache.put(str, metrics);
    }

    @Override // com.bytedance.applog.aggregation.IMetricsCache
    public void update(@NotNull String str, @NotNull Metrics metrics) {
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) metrics, "");
        insert(str, metrics);
    }

    @Override // com.bytedance.applog.aggregation.IMetricsCache
    public List<Metrics> getAll() {
        Collection<Metrics> collectionValues = this.cache.values();
        Intrinsics.AEQbTJ(collectionValues, "");
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues);
    }

    @Override // com.bytedance.applog.aggregation.IMetricsCache
    public List<Metrics> getByMetricsName(@NotNull String str) {
        Intrinsics.EZpvd((Object) str, "");
        Collection<Metrics> collectionValues = this.cache.values();
        Intrinsics.AEQbTJ(collectionValues, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (Intrinsics.EZpvd((Object) ((Metrics) obj).getName(), (Object) str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.applog.aggregation.IMetricsCache
    public void clear() {
        this.cache.clear();
    }
}
