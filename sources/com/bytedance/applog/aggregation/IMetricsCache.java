package com.bytedance.applog.aggregation;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface IMetricsCache {
    void clear();

    Metrics get(@NotNull String str);

    List<Metrics> getAll();

    List<Metrics> getByMetricsName(@NotNull String str);

    void insert(@NotNull String str, @NotNull Metrics metrics);

    void update(@NotNull String str, @NotNull Metrics metrics);
}
