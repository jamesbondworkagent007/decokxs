package com.okinc.wallet.core.decode;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class PsbtDecodeParamsNew {
    public static final int $stable = 8;

    @SerializedName("full")
    private final boolean full;

    @SerializedName("psbtHexs")
    private final List<String> hexList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.decode.PsbtDecodeParamsNew */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PsbtDecodeParamsNew copy$default(PsbtDecodeParamsNew psbtDecodeParamsNew, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = psbtDecodeParamsNew.hexList;
        }
        if ((i & 2) != 0) {
            z = psbtDecodeParamsNew.full;
        }
        return psbtDecodeParamsNew.copy(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.hexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.full;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PsbtDecodeParamsNew copy(@NotNull List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new PsbtDecodeParamsNew(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PsbtDecodeParamsNew)) {
            return false;
        }
        PsbtDecodeParamsNew psbtDecodeParamsNew = (PsbtDecodeParamsNew) obj;
        return Intrinsics.EZpvd(this.hexList, psbtDecodeParamsNew.hexList) && this.full == psbtDecodeParamsNew.full;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFull() {
        return this.full;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getHexList() {
        return this.hexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.hexList.hashCode() * 31) + Boolean.hashCode(this.full);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PsbtDecodeParamsNew(hexList=" + this.hexList + ", full=" + this.full + ")";
    }

    public PsbtDecodeParamsNew(@NotNull List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.hexList = list;
        this.full = z;
    }
}
