package com.bytedance.applog.aggregation;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class MetricsSQLiteCache implements IMetricsCache {
    private final MetricsMemoryCache memCache;
    private final MetricsSQLiteOpenHelper openHelper;

    public MetricsSQLiteCache(@NotNull Context context, @NotNull String str) {
        Intrinsics.EZpvd((Object) context, "");
        Intrinsics.EZpvd((Object) str, "");
        this.openHelper = new MetricsSQLiteOpenHelper(context, str);
        this.memCache = new MetricsMemoryCache();
    }

    @Override // com.bytedance.applog.aggregation.IMetricsCache
    public Metrics get(@NotNull String str) {
        Intrinsics.EZpvd((Object) str, "");
        Metrics metrics = this.memCache.get(str);
        if (metrics != null) {
            return metrics;
        }
        Cursor cursorRawQuery = this.openHelper.getReadableDatabase().rawQuery("SELECT * FROM metrics WHERE group_id = ?", new String[]{str});
        if (!cursorRawQuery.moveToNext()) {
            return metrics;
        }
        Intrinsics.AEQbTJ(cursorRawQuery, "");
        Metrics metricsFillMetrics = fillMetrics(cursorRawQuery);
        this.memCache.insert(str, metricsFillMetrics);
        return metricsFillMetrics;
    }

    private final Metrics fillMetrics(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("name"));
        String string2 = cursor.getString(cursor.getColumnIndex("group_id"));
        int i = cursor.getInt(cursor.getColumnIndex(MetricsSQLiteCacheKt.METRICS_AGG_TYPES));
        long j = cursor.getLong(cursor.getColumnIndex(MetricsSQLiteCacheKt.METRICS_START_TIME));
        String string3 = cursor.getString(cursor.getColumnIndex(MetricsSQLiteCacheKt.METRICS_PARAMS));
        JSONObject jSONObject = string3 != null ? UtilsKt.toJSONObject(string3) : null;
        String string4 = cursor.getString(cursor.getColumnIndex("interval"));
        int i2 = cursor.getInt(cursor.getColumnIndex("count"));
        double d = cursor.getDouble(cursor.getColumnIndex(MetricsSQLiteCacheKt.METRICS_SUM));
        long j2 = cursor.getLong(cursor.getColumnIndex(MetricsSQLiteCacheKt.METRICS_END_TIME));
        String string5 = cursor.getString(cursor.getColumnIndex(MetricsSQLiteCacheKt.METRICS_VALUE_ARRAY));
        JSONArray jSONArray = string5 != null ? UtilsKt.toJSONArray(string5) : null;
        Intrinsics.AEQbTJ(string, "");
        Intrinsics.AEQbTJ(string2, "");
        Metrics metrics = new Metrics(string, string2, i, j, jSONObject, string4);
        metrics.restore(i2, d, j2, jSONArray);
        return metrics;
    }

    @Override // com.bytedance.applog.aggregation.IMetricsCache
    public void insert(@NotNull String str, @NotNull Metrics metrics) {
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) metrics, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", metrics.getName());
        contentValues.put("group_id", metrics.getGroupId());
        contentValues.put(MetricsSQLiteCacheKt.METRICS_AGG_TYPES, Integer.valueOf(metrics.getAggregationTypes()));
        contentValues.put(MetricsSQLiteCacheKt.METRICS_START_TIME, Long.valueOf(metrics.getStartTime()));
        JSONObject params = metrics.getParams();
        contentValues.put(MetricsSQLiteCacheKt.METRICS_PARAMS, params != null ? params.toString() : null);
        contentValues.put("interval", metrics.getInterval());
        contentValues.put("count", Integer.valueOf(metrics.getCount()));
        contentValues.put(MetricsSQLiteCacheKt.METRICS_SUM, Double.valueOf(metrics.getSum()));
        contentValues.put(MetricsSQLiteCacheKt.METRICS_END_TIME, Long.valueOf(metrics.getEndTime()));
        contentValues.put(MetricsSQLiteCacheKt.METRICS_VALUE_ARRAY, String.valueOf(metrics.getValues()));
        this.openHelper.getWritableDatabase().insert(MetricsSQLiteCacheKt.METRICS_TABLE_NAME, null, contentValues);
        this.memCache.insert(str, metrics);
    }

    @Override // com.bytedance.applog.aggregation.IMetricsCache
    public void update(@NotNull String str, @NotNull Metrics metrics) {
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) metrics, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put("count", Integer.valueOf(metrics.getCount()));
        contentValues.put(MetricsSQLiteCacheKt.METRICS_SUM, Double.valueOf(metrics.getSum()));
        contentValues.put(MetricsSQLiteCacheKt.METRICS_END_TIME, Long.valueOf(metrics.getEndTime()));
        contentValues.put(MetricsSQLiteCacheKt.METRICS_VALUE_ARRAY, String.valueOf(metrics.getValues()));
        this.openHelper.getWritableDatabase().update(MetricsSQLiteCacheKt.METRICS_TABLE_NAME, contentValues, "group_id = ?", new String[]{str});
        this.memCache.update(str, metrics);
    }

    @Override // com.bytedance.applog.aggregation.IMetricsCache
    public List<Metrics> getAll() {
        Cursor cursorRawQuery = this.openHelper.getReadableDatabase().rawQuery("SELECT * FROM metrics", null);
        ArrayList arrayList = new ArrayList();
        while (cursorRawQuery.moveToNext()) {
            Intrinsics.AEQbTJ(cursorRawQuery, "");
            arrayList.add(fillMetrics(cursorRawQuery));
        }
        return arrayList;
    }

    @Override // com.bytedance.applog.aggregation.IMetricsCache
    public List<Metrics> getByMetricsName(@NotNull String str) {
        Intrinsics.EZpvd((Object) str, "");
        Cursor cursorRawQuery = this.openHelper.getReadableDatabase().rawQuery("SELECT * FROM metrics WHERE name = ?", new String[]{str});
        ArrayList arrayList = new ArrayList();
        while (cursorRawQuery.moveToNext()) {
            Intrinsics.AEQbTJ(cursorRawQuery, "");
            arrayList.add(fillMetrics(cursorRawQuery));
        }
        return arrayList;
    }

    @Override // com.bytedance.applog.aggregation.IMetricsCache
    public void clear() {
        this.openHelper.getWritableDatabase().delete(MetricsSQLiteCacheKt.METRICS_TABLE_NAME, null, null);
        this.memCache.clear();
    }
}
