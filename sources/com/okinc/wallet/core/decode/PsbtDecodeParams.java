package com.okinc.wallet.core.decode;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class PsbtDecodeParams {
    public static final int $stable = 8;

    @SerializedName("psbtHexs")
    private final List<String> hexList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.decode.PsbtDecodeParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PsbtDecodeParams copy$default(PsbtDecodeParams psbtDecodeParams, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = psbtDecodeParams.hexList;
        }
        return psbtDecodeParams.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.hexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PsbtDecodeParams copy(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new PsbtDecodeParams(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PsbtDecodeParams) && Intrinsics.EZpvd(this.hexList, ((PsbtDecodeParams) obj).hexList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getHexList() {
        return this.hexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.hexList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PsbtDecodeParams(hexList=" + this.hexList + ")";
    }

    public PsbtDecodeParams(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.hexList = list;
    }
}
