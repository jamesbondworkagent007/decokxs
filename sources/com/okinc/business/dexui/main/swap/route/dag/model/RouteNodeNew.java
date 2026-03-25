package com.okinc.business.dexui.main.swap.route.dag.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class RouteNodeNew {
    public static final int $stable = 8;
    private final RouteNodeKey key;
    private final RouteNodeMeta meta;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RouteNodeNew copy$default(RouteNodeNew routeNodeNew, RouteNodeKey routeNodeKey, RouteNodeMeta routeNodeMeta, int i, Object obj) {
        if ((i & 1) != 0) {
            routeNodeKey = routeNodeNew.key;
        }
        if ((i & 2) != 0) {
            routeNodeMeta = routeNodeNew.meta;
        }
        return routeNodeNew.copy(routeNodeKey, routeNodeMeta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeKey component1() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeMeta component2() {
        return this.meta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeNew copy(@NotNull RouteNodeKey routeNodeKey, @NotNull RouteNodeMeta routeNodeMeta) {
        Intrinsics.checkNotNullParameter(routeNodeKey, "");
        Intrinsics.checkNotNullParameter(routeNodeMeta, "");
        return new RouteNodeNew(routeNodeKey, routeNodeMeta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteNodeNew)) {
            return false;
        }
        RouteNodeNew routeNodeNew = (RouteNodeNew) obj;
        return Intrinsics.EZpvd(this.key, routeNodeNew.key) && Intrinsics.EZpvd(this.meta, routeNodeNew.meta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeKey getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeMeta getMeta() {
        return this.meta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.key.hashCode() * 31) + this.meta.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RouteNodeNew(key=" + this.key + ", meta=" + this.meta + ")";
    }

    public RouteNodeNew(@NotNull RouteNodeKey routeNodeKey, @NotNull RouteNodeMeta routeNodeMeta) {
        Intrinsics.checkNotNullParameter(routeNodeKey, "");
        Intrinsics.checkNotNullParameter(routeNodeMeta, "");
        this.key = routeNodeKey;
        this.meta = routeNodeMeta;
    }
}
