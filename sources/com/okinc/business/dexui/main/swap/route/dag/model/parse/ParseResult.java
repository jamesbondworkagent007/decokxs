package com.okinc.business.dexui.main.swap.route.dag.model.parse;

import com.okinc.business.dexui.main.swap.route.dag.model.RouteNewGraph;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class ParseResult {
    public static final int $stable = 8;
    private final RouteNewGraph graph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ParseResult copy$default(ParseResult parseResult, RouteNewGraph routeNewGraph, int i, Object obj) {
        if ((i & 1) != 0) {
            routeNewGraph = parseResult.graph;
        }
        return parseResult.copy(routeNewGraph);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNewGraph component1() {
        return this.graph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ParseResult copy(@NotNull RouteNewGraph routeNewGraph) {
        Intrinsics.checkNotNullParameter(routeNewGraph, "");
        return new ParseResult(routeNewGraph);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ParseResult) && Intrinsics.EZpvd(this.graph, ((ParseResult) obj).graph);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNewGraph getGraph() {
        return this.graph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.graph.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ParseResult(graph=" + this.graph + ")";
    }

    public ParseResult(@NotNull RouteNewGraph routeNewGraph) {
        Intrinsics.checkNotNullParameter(routeNewGraph, "");
        this.graph = routeNewGraph;
    }
}
