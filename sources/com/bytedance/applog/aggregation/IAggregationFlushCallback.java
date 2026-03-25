package com.bytedance.applog.aggregation;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public interface IAggregationFlushCallback {
    void onFinish(@NotNull List<Metrics> list);
}
