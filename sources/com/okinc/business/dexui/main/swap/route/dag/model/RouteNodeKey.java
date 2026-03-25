package com.okinc.business.dexui.main.swap.route.dag.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class RouteNodeKey {
    public static final int $stable = 0;
    private final String tokenAddress;
    private final int tokenIndex;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RouteNodeKey copy$default(RouteNodeKey routeNodeKey, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = routeNodeKey.tokenIndex;
        }
        if ((i2 & 2) != 0) {
            str = routeNodeKey.tokenAddress;
        }
        return routeNodeKey.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.tokenIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeKey copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new RouteNodeKey(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteNodeKey)) {
            return false;
        }
        RouteNodeKey routeNodeKey = (RouteNodeKey) obj;
        return this.tokenIndex == routeNodeKey.tokenIndex && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) routeNodeKey.tokenAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTokenIndex() {
        return this.tokenIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.tokenIndex) * 31) + this.tokenAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RouteNodeKey(tokenIndex=" + this.tokenIndex + ", tokenAddress=" + this.tokenAddress + ")";
    }

    public RouteNodeKey(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenIndex = i;
        this.tokenAddress = str;
    }
}
