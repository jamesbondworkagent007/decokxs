package com.okinc.liveness.lca.data;

import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56423yEv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ScoreData {
    public static final int $stable = 8;
    private String lastColor = "";
    private final List<Map<String, ArrayList<Double>>> qcScores = new ArrayList();

    public final void addColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.qcScores.add(C56423yEv.EZpvd(C56390yDp.OLrzqt(str, new ArrayList())));
        this.lastColor = str;
    }

    public final void addScore(double d) {
        ArrayList arrayList;
        Map map = (Map) CollectionsKt___CollectionsKt.wlaJM(this.qcScores);
        if (map == null || (arrayList = (ArrayList) map.get(this.lastColor)) == null) {
            return;
        }
        arrayList.add(Double.valueOf(d));
    }

    public final String toJson() {
        String json = new GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(this.qcScores);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public final void clear() {
        this.qcScores.clear();
        this.lastColor = "";
    }

    public final int size() {
        return this.qcScores.size();
    }
}
