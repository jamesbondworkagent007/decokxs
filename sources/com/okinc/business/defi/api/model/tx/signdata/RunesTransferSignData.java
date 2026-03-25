package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RunesTransferSignData extends UTXOTransferSignData {
    public static final int $stable = 8;
    private int protocolId;
    private String runeid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuneid() {
        return this.runeid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolId(int i) {
        this.protocolId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRuneid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.runeid = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunesTransferSignData(long j, @NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, String str5) {
        super(j, str2, str3, str4, z, z2, str5);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.runeid = str;
        this.protocolId = i;
    }
}
