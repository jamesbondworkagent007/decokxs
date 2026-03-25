package com.okinc.business.dexui.main.swap.route.dag.model.parse;

import com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeMeta;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class EndpointMetadataResult {
    public static final int $stable = 8;
    private final String endChainLogoUrl;
    private final RouteNodeMeta endMeta;
    private final String startChainLogoUrl;
    private final RouteNodeMeta startMeta;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EndpointMetadataResult copy$default(EndpointMetadataResult endpointMetadataResult, RouteNodeMeta routeNodeMeta, RouteNodeMeta routeNodeMeta2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            routeNodeMeta = endpointMetadataResult.startMeta;
        }
        if ((i & 2) != 0) {
            routeNodeMeta2 = endpointMetadataResult.endMeta;
        }
        if ((i & 4) != 0) {
            str = endpointMetadataResult.startChainLogoUrl;
        }
        if ((i & 8) != 0) {
            str2 = endpointMetadataResult.endChainLogoUrl;
        }
        return endpointMetadataResult.copy(routeNodeMeta, routeNodeMeta2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeMeta component1() {
        return this.startMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeMeta component2() {
        return this.endMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.startChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.endChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EndpointMetadataResult copy(@NotNull RouteNodeMeta routeNodeMeta, @NotNull RouteNodeMeta routeNodeMeta2, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(routeNodeMeta, "");
        Intrinsics.checkNotNullParameter(routeNodeMeta2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new EndpointMetadataResult(routeNodeMeta, routeNodeMeta2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndpointMetadataResult)) {
            return false;
        }
        EndpointMetadataResult endpointMetadataResult = (EndpointMetadataResult) obj;
        return Intrinsics.EZpvd(this.startMeta, endpointMetadataResult.startMeta) && Intrinsics.EZpvd(this.endMeta, endpointMetadataResult.endMeta) && Intrinsics.EZpvd((Object) this.startChainLogoUrl, (Object) endpointMetadataResult.startChainLogoUrl) && Intrinsics.EZpvd((Object) this.endChainLogoUrl, (Object) endpointMetadataResult.endChainLogoUrl);
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
    public final String getStartChainLogoUrl() {
        return this.startChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeMeta getStartMeta() {
        return this.startMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.startMeta.hashCode() * 31) + this.endMeta.hashCode()) * 31) + this.startChainLogoUrl.hashCode()) * 31) + this.endChainLogoUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EndpointMetadataResult(startMeta=" + this.startMeta + ", endMeta=" + this.endMeta + ", startChainLogoUrl=" + this.startChainLogoUrl + ", endChainLogoUrl=" + this.endChainLogoUrl + ")";
    }

    public EndpointMetadataResult(@NotNull RouteNodeMeta routeNodeMeta, @NotNull RouteNodeMeta routeNodeMeta2, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(routeNodeMeta, "");
        Intrinsics.checkNotNullParameter(routeNodeMeta2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.startMeta = routeNodeMeta;
        this.endMeta = routeNodeMeta2;
        this.startChainLogoUrl = str;
        this.endChainLogoUrl = str2;
    }
}
