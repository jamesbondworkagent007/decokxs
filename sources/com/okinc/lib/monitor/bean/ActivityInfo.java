package com.okinc.lib.monitor.bean;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes16.dex */
public class ActivityInfo {
    public String activityName;
    public long launchCost;
    public long otherCost;
    public long pauseCost;
    public long renderCost;
    public boolean show;
    public long time;
    public String title;
    public long totalCost;

    public String toString() {
        return "ActivityInfo{time=" + this.time + ", activityName=" + this.activityName + ", totalCost=" + this.totalCost + ", pauseCost=" + this.pauseCost + ", launchCost=" + this.launchCost + ", renderCost=" + this.renderCost + ", otherCost=" + this.otherCost + ", title='" + this.title + "', show=" + this.show + AbstractJsonLexerKt.END_OBJ;
    }
}
