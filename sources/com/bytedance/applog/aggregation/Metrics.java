package com.bytedance.applog.aggregation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Metrics {
    private final int aggregationTypes;
    private int count;
    private long endTime;
    private final String groupId;
    private final String interval;
    private final String name;
    private final JSONObject params;
    private final long startTime;
    private double sum;
    private JSONArray values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAggregationTypes() {
        return this.aggregationTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterval() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONObject getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getSum() {
        return this.sum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONArray getValues() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void restore(int i, double d, long j, JSONArray jSONArray) {
        this.count = i;
        this.sum = d;
        this.endTime = j;
        this.values = jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndTime(long j) {
        this.endTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValues(JSONArray jSONArray) {
        this.values = jSONArray;
    }

    public Metrics(@NotNull String str, @NotNull String str2, int i, long j, JSONObject jSONObject, String str3) {
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) str2, "");
        this.name = str;
        this.groupId = str2;
        this.aggregationTypes = i;
        this.startTime = j;
        this.params = jSONObject;
        this.interval = str3;
        this.endTime = j;
    }

    public final void append(Object obj) {
        this.count++;
        if ((this.aggregationTypes & 2) > 0 && (obj instanceof Number)) {
            this.sum += ((Number) obj).doubleValue();
        }
        if ((this.aggregationTypes & 8) > 0) {
            if (this.values == null) {
                this.values = new JSONArray();
            }
            JSONArray jSONArray = this.values;
            if (jSONArray != null) {
                jSONArray.put(obj);
            }
        }
        this.endTime = System.currentTimeMillis();
    }

    public final JSONObject toParams() throws JSONException {
        JSONObject jSONObjectCopyFrom = UtilsKt.copyFrom(new JSONObject(), this.params);
        jSONObjectCopyFrom.put("metrics_start_ms", this.startTime);
        jSONObjectCopyFrom.put("metrics_end_ms", this.endTime);
        jSONObjectCopyFrom.put("metrics_aggregation", this.aggregationTypes);
        jSONObjectCopyFrom.put("metrics_count", this.count);
        if ((this.aggregationTypes & 2) > 0) {
            jSONObjectCopyFrom.put("metrics_sum", this.sum);
        }
        if ((this.aggregationTypes & 4) > 0) {
            jSONObjectCopyFrom.put("metrics_avg", this.sum / ((double) this.count));
        }
        if ((this.aggregationTypes & 8) > 0) {
            jSONObjectCopyFrom.put("metrics_values", this.values);
        }
        if ((this.aggregationTypes & 16) > 0) {
            jSONObjectCopyFrom.put("metrics_interval", this.interval);
        }
        return jSONObjectCopyFrom;
    }
}
