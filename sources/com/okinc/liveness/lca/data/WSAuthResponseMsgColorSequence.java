package com.okinc.liveness.lca.data;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class WSAuthResponseMsgColorSequence {
    public static final int $stable = 8;
    private final int duration;
    private final List<Integer> rgba;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.liveness.lca.data.WSAuthResponseMsgColorSequence */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WSAuthResponseMsgColorSequence copy$default(WSAuthResponseMsgColorSequence wSAuthResponseMsgColorSequence, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wSAuthResponseMsgColorSequence.duration;
        }
        if ((i2 & 2) != 0) {
            list = wSAuthResponseMsgColorSequence.rgba;
        }
        return wSAuthResponseMsgColorSequence.copy(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component2() {
        return this.rgba;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSAuthResponseMsgColorSequence copy(int i, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new WSAuthResponseMsgColorSequence(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSAuthResponseMsgColorSequence)) {
            return false;
        }
        WSAuthResponseMsgColorSequence wSAuthResponseMsgColorSequence = (WSAuthResponseMsgColorSequence) obj;
        return this.duration == wSAuthResponseMsgColorSequence.duration && Intrinsics.EZpvd(this.rgba, wSAuthResponseMsgColorSequence.rgba);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getRgba() {
        return this.rgba;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.duration) * 31) + this.rgba.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSAuthResponseMsgColorSequence(duration=" + this.duration + ", rgba=" + this.rgba + ")";
    }

    public WSAuthResponseMsgColorSequence(int i, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.duration = i;
        this.rgba = list;
    }
}
