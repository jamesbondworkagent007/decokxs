package com.okinc.business.dexui.main.swap.route.dag.model.parse;

import com.okinc.business.dexui.main.swap.route.dag.model.PoolInfo;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteEdgeNew;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeKey;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeNew;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class ParseContext {
    public static final int $stable = 8;
    private final Map<RouteNodeKey, RouteNodeNew> nodesByKey = new LinkedHashMap();
    private final List<RouteEdgeNew> edges = new ArrayList();
    private final Map<String, List<PoolInfo>> edgePools = new LinkedHashMap();
    private final Map<String, Float> edgeWeights = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, List<PoolInfo>> getEdgePools() {
        return this.edgePools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Float> getEdgeWeights() {
        return this.edgeWeights;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RouteEdgeNew> getEdges() {
        return this.edges;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<RouteNodeKey, RouteNodeNew> getNodesByKey() {
        return this.nodesByKey;
    }
}
