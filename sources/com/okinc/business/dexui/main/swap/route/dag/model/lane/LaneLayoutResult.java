package com.okinc.business.dexui.main.swap.route.dag.model.lane;

import android.graphics.RectF;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeKey;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeMeta;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class LaneLayoutResult {
    public static final int $stable = 8;
    private final float anchorYLane0;
    private final List<Capsule> capsules;
    private final RouteNodeMeta endMeta;
    private final int height;
    private final float laneStep;
    private final float leftTrunkBottom;
    private final float leftTrunkX;
    private final float nodeHeightOut;
    private final Map<RouteNodeKey, RouteNodeMeta> nodeMeta;
    private final Map<RouteNodeKey, RectF> nodeRects;
    private final List<Polyline> polylines;
    private final float rightTrunkBottom;
    private final float rightTrunkX;
    private final RouteNodeMeta startMeta;
    private final float trunkTop;
    private final int width;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<RouteNodeKey, RectF> component1() {
        return this.nodeRects;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component10() {
        return this.leftTrunkBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component11() {
        return this.rightTrunkBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component12() {
        return this.anchorYLane0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component13() {
        return this.laneStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component14() {
        return this.nodeHeightOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<RouteNodeKey, RouteNodeMeta> component2() {
        return this.nodeMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Capsule> component3() {
        return this.capsules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Polyline> component4() {
        return this.polylines;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeMeta component5() {
        return this.startMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeMeta component6() {
        return this.endMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component7() {
        return this.leftTrunkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component8() {
        return this.rightTrunkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component9() {
        return this.trunkTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LaneLayoutResult copy(@NotNull Map<RouteNodeKey, ? extends RectF> map, @NotNull Map<RouteNodeKey, RouteNodeMeta> map2, @NotNull List<Capsule> list, @NotNull List<Polyline> list2, @NotNull RouteNodeMeta routeNodeMeta, @NotNull RouteNodeMeta routeNodeMeta2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i, int i2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(routeNodeMeta, "");
        Intrinsics.checkNotNullParameter(routeNodeMeta2, "");
        return new LaneLayoutResult(map, map2, list, list2, routeNodeMeta, routeNodeMeta2, f, f2, f3, f4, f5, f6, f7, f8, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LaneLayoutResult)) {
            return false;
        }
        LaneLayoutResult laneLayoutResult = (LaneLayoutResult) obj;
        return Intrinsics.EZpvd(this.nodeRects, laneLayoutResult.nodeRects) && Intrinsics.EZpvd(this.nodeMeta, laneLayoutResult.nodeMeta) && Intrinsics.EZpvd(this.capsules, laneLayoutResult.capsules) && Intrinsics.EZpvd(this.polylines, laneLayoutResult.polylines) && Intrinsics.EZpvd(this.startMeta, laneLayoutResult.startMeta) && Intrinsics.EZpvd(this.endMeta, laneLayoutResult.endMeta) && Float.compare(this.leftTrunkX, laneLayoutResult.leftTrunkX) == 0 && Float.compare(this.rightTrunkX, laneLayoutResult.rightTrunkX) == 0 && Float.compare(this.trunkTop, laneLayoutResult.trunkTop) == 0 && Float.compare(this.leftTrunkBottom, laneLayoutResult.leftTrunkBottom) == 0 && Float.compare(this.rightTrunkBottom, laneLayoutResult.rightTrunkBottom) == 0 && Float.compare(this.anchorYLane0, laneLayoutResult.anchorYLane0) == 0 && Float.compare(this.laneStep, laneLayoutResult.laneStep) == 0 && Float.compare(this.nodeHeightOut, laneLayoutResult.nodeHeightOut) == 0 && this.width == laneLayoutResult.width && this.height == laneLayoutResult.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getAnchorYLane0() {
        return this.anchorYLane0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Capsule> getCapsules() {
        return this.capsules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeMeta getEndMeta() {
        return this.endMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getLaneStep() {
        return this.laneStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getLeftTrunkBottom() {
        return this.leftTrunkBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getLeftTrunkX() {
        return this.leftTrunkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getNodeHeightOut() {
        return this.nodeHeightOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<RouteNodeKey, RouteNodeMeta> getNodeMeta() {
        return this.nodeMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<RouteNodeKey, RectF> getNodeRects() {
        return this.nodeRects;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Polyline> getPolylines() {
        return this.polylines;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getRightTrunkBottom() {
        return this.rightTrunkBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getRightTrunkX() {
        return this.rightTrunkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteNodeMeta getStartMeta() {
        return this.startMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getTrunkTop() {
        return this.trunkTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((this.nodeRects.hashCode() * 31) + this.nodeMeta.hashCode()) * 31) + this.capsules.hashCode()) * 31) + this.polylines.hashCode()) * 31) + this.startMeta.hashCode()) * 31) + this.endMeta.hashCode()) * 31) + Float.hashCode(this.leftTrunkX)) * 31) + Float.hashCode(this.rightTrunkX)) * 31) + Float.hashCode(this.trunkTop)) * 31) + Float.hashCode(this.leftTrunkBottom)) * 31) + Float.hashCode(this.rightTrunkBottom)) * 31) + Float.hashCode(this.anchorYLane0)) * 31) + Float.hashCode(this.laneStep)) * 31) + Float.hashCode(this.nodeHeightOut)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LaneLayoutResult(nodeRects=" + this.nodeRects + ", nodeMeta=" + this.nodeMeta + ", capsules=" + this.capsules + ", polylines=" + this.polylines + ", startMeta=" + this.startMeta + ", endMeta=" + this.endMeta + ", leftTrunkX=" + this.leftTrunkX + ", rightTrunkX=" + this.rightTrunkX + ", trunkTop=" + this.trunkTop + ", leftTrunkBottom=" + this.leftTrunkBottom + ", rightTrunkBottom=" + this.rightTrunkBottom + ", anchorYLane0=" + this.anchorYLane0 + ", laneStep=" + this.laneStep + ", nodeHeightOut=" + this.nodeHeightOut + ", width=" + this.width + ", height=" + this.height + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.Map<com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeKey, ? extends android.graphics.RectF> */
    /* JADX WARN: Multi-variable type inference failed */
    public LaneLayoutResult(@NotNull Map<RouteNodeKey, ? extends RectF> map, @NotNull Map<RouteNodeKey, RouteNodeMeta> map2, @NotNull List<Capsule> list, @NotNull List<Polyline> list2, @NotNull RouteNodeMeta routeNodeMeta, @NotNull RouteNodeMeta routeNodeMeta2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i, int i2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(routeNodeMeta, "");
        Intrinsics.checkNotNullParameter(routeNodeMeta2, "");
        this.nodeRects = map;
        this.nodeMeta = map2;
        this.capsules = list;
        this.polylines = list2;
        this.startMeta = routeNodeMeta;
        this.endMeta = routeNodeMeta2;
        this.leftTrunkX = f;
        this.rightTrunkX = f2;
        this.trunkTop = f3;
        this.leftTrunkBottom = f4;
        this.rightTrunkBottom = f5;
        this.anchorYLane0 = f6;
        this.laneStep = f7;
        this.nodeHeightOut = f8;
        this.width = i;
        this.height = i2;
    }
}
