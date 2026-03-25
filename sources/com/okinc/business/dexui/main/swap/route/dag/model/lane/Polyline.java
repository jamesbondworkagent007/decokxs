package com.okinc.business.dexui.main.swap.route.dag.model.lane;

import android.graphics.PointF;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class Polyline {
    public static final int $stable = 8;
    private final boolean endArrow;
    private final List<PointF> pts;
    private final boolean startArrow;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.swap.route.dag.model.lane.Polyline */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Polyline copy$default(Polyline polyline, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = polyline.pts;
        }
        if ((i & 2) != 0) {
            z = polyline.startArrow;
        }
        if ((i & 4) != 0) {
            z2 = polyline.endArrow;
        }
        return polyline.copy(list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PointF> component1() {
        return this.pts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.startArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.endArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Polyline copy(@NotNull List<? extends PointF> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new Polyline(list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Polyline)) {
            return false;
        }
        Polyline polyline = (Polyline) obj;
        return Intrinsics.EZpvd(this.pts, polyline.pts) && this.startArrow == polyline.startArrow && this.endArrow == polyline.endArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEndArrow() {
        return this.endArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PointF> getPts() {
        return this.pts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getStartArrow() {
        return this.startArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.pts.hashCode() * 31) + Boolean.hashCode(this.startArrow)) * 31) + Boolean.hashCode(this.endArrow);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Polyline(pts=" + this.pts + ", startArrow=" + this.startArrow + ", endArrow=" + this.endArrow + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends android.graphics.PointF> */
    /* JADX WARN: Multi-variable type inference failed */
    public Polyline(@NotNull List<? extends PointF> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.pts = list;
        this.startArrow = z;
        this.endArrow = z2;
    }
}
