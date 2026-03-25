package com.okinc.biz.statistics.data.bean;

/* JADX INFO: loaded from: classes3.dex */
public class StatisticsResp {
    public int code;
    public long timestamp;

    public StatisticsResp() {
    }

    public StatisticsResp(int i, long j) {
        this.code = i;
        this.timestamp = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{code=" + String.valueOf(this.code) + ";timestamp=" + this.timestamp + "}");
        sb.append(super.toString());
        return sb.toString();
    }
}
