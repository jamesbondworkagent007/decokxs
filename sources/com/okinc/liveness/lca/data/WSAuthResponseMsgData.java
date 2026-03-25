package com.okinc.liveness.lca.data;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class WSAuthResponseMsgData {
    public static final int $stable = 8;
    private final List<WSAuthResponseMsgColorSequence> colorSequences;
    private final boolean success;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.liveness.lca.data.WSAuthResponseMsgData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WSAuthResponseMsgData copy$default(WSAuthResponseMsgData wSAuthResponseMsgData, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wSAuthResponseMsgData.success;
        }
        if ((i & 2) != 0) {
            list = wSAuthResponseMsgData.colorSequences;
        }
        return wSAuthResponseMsgData.copy(z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WSAuthResponseMsgColorSequence> component2() {
        return this.colorSequences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSAuthResponseMsgData copy(boolean z, @NotNull List<WSAuthResponseMsgColorSequence> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new WSAuthResponseMsgData(z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSAuthResponseMsgData)) {
            return false;
        }
        WSAuthResponseMsgData wSAuthResponseMsgData = (WSAuthResponseMsgData) obj;
        return this.success == wSAuthResponseMsgData.success && Intrinsics.EZpvd(this.colorSequences, wSAuthResponseMsgData.colorSequences);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WSAuthResponseMsgColorSequence> getColorSequences() {
        return this.colorSequences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.success) * 31) + this.colorSequences.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSAuthResponseMsgData(success=" + this.success + ", colorSequences=" + this.colorSequences + ")";
    }

    public WSAuthResponseMsgData(boolean z, @NotNull List<WSAuthResponseMsgColorSequence> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.success = z;
        this.colorSequences = list;
    }
}
