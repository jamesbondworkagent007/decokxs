package com.okinc.business.dexui.main.swap.route.dag.model;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class RouteNewGraph {
    public static final int $stable = 8;
    private final Map<Integer, List<RouteNodeNew>> columns;
    private final List<RouteEdgeNew> edges;
    private final String endChainLogoUrl;
    private final RouteNodeMeta endMeta;
    private final int maxIndex;
    private final String startChainLogoUrl;
    private final RouteNodeMeta startMeta;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.dexui.main.swap.route.dag.model.RouteNewGraph */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouteNewGraph copy$default(RouteNewGraph routeNewGraph, Map map, List list, RouteNodeMeta routeNodeMeta, RouteNodeMeta routeNodeMeta2, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = routeNewGraph.columns;
        }
        if ((i2 & 2) != 0) {
            list = routeNewGraph.edges;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            routeNodeMeta = routeNewGraph.startMeta;
        }
        RouteNodeMeta routeNodeMeta3 = routeNodeMeta;
        if ((i2 & 8) != 0) {
            routeNodeMeta2 = routeNewGraph.endMeta;
        }
        RouteNodeMeta routeNodeMeta4 = routeNodeMeta2;
        if ((i2 & 16) != 0) {
            str = routeNewGraph.startChainLogoUrl;
        }
        String str3 = str;
        if ((i2 & 32) != 0) {
            str2 = routeNewGraph.endChainLogoUrl;
        }
        String str4 = str2;
        if ((i2 & 64) != 0) {
            i = routeNewGraph.maxIndex;
        }
        return routeNewGraph.copy(map, list2, routeNodeMeta3, routeNodeMeta4, str3, str4, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<Integer, List<RouteNodeNew>> component1() {
        return this.columns;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RouteEdgeNew> component2() {
        return this.edges;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeMeta component3() {
        return this.startMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeMeta component4() {
        return this.endMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.startChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.endChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.maxIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNewGraph copy(@NotNull Map<Integer, ? extends List<RouteNodeNew>> map, @NotNull List<RouteEdgeNew> list, @NotNull RouteNodeMeta routeNodeMeta, @NotNull RouteNodeMeta routeNodeMeta2, @NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(routeNodeMeta, "");
        Intrinsics.checkNotNullParameter(routeNodeMeta2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new RouteNewGraph(map, list, routeNodeMeta, routeNodeMeta2, str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteNewGraph)) {
            return false;
        }
        RouteNewGraph routeNewGraph = (RouteNewGraph) obj;
        return Intrinsics.EZpvd(this.columns, routeNewGraph.columns) && Intrinsics.EZpvd(this.edges, routeNewGraph.edges) && Intrinsics.EZpvd(this.startMeta, routeNewGraph.startMeta) && Intrinsics.EZpvd(this.endMeta, routeNewGraph.endMeta) && Intrinsics.EZpvd((Object) this.startChainLogoUrl, (Object) routeNewGraph.startChainLogoUrl) && Intrinsics.EZpvd((Object) this.endChainLogoUrl, (Object) routeNewGraph.endChainLogoUrl) && this.maxIndex == routeNewGraph.maxIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<Integer, List<RouteNodeNew>> getColumns() {
        return this.columns;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RouteEdgeNew> getEdges() {
        return this.edges;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndChainLogoUrl() {
        return this.endChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeMeta getEndMeta() {
        return this.endMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxIndex() {
        return this.maxIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartChainLogoUrl() {
        return this.startChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeMeta getStartMeta() {
        return this.startMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.columns.hashCode() * 31) + this.edges.hashCode()) * 31) + this.startMeta.hashCode()) * 31) + this.endMeta.hashCode()) * 31) + this.startChainLogoUrl.hashCode()) * 31) + this.endChainLogoUrl.hashCode()) * 31) + Integer.hashCode(this.maxIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RouteNewGraph(columns=" + this.columns + ", edges=" + this.edges + ", startMeta=" + this.startMeta + ", endMeta=" + this.endMeta + ", startChainLogoUrl=" + this.startChainLogoUrl + ", endChainLogoUrl=" + this.endChainLogoUrl + ", maxIndex=" + this.maxIndex + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.Integer, ? extends java.util.List<com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeNew>> */
    /* JADX WARN: Multi-variable type inference failed */
    public RouteNewGraph(@NotNull Map<Integer, ? extends List<RouteNodeNew>> map, @NotNull List<RouteEdgeNew> list, @NotNull RouteNodeMeta routeNodeMeta, @NotNull RouteNodeMeta routeNodeMeta2, @NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(routeNodeMeta, "");
        Intrinsics.checkNotNullParameter(routeNodeMeta2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.columns = map;
        this.edges = list;
        this.startMeta = routeNodeMeta;
        this.endMeta = routeNodeMeta2;
        this.startChainLogoUrl = str;
        this.endChainLogoUrl = str2;
        this.maxIndex = i;
    }
}
