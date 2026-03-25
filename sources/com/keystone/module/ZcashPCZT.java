package com.keystone.module;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ZcashPCZT {
    private final String pczt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ZcashPCZT copy$default(ZcashPCZT zcashPCZT, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zcashPCZT.pczt;
        }
        return zcashPCZT.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pczt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZcashPCZT copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ZcashPCZT(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZcashPCZT) && Intrinsics.EZpvd((Object) this.pczt, (Object) ((ZcashPCZT) obj).pczt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPczt() {
        return this.pczt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.pczt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ZcashPCZT(pczt=" + this.pczt + ')';
    }

    public ZcashPCZT(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pczt = str;
    }
}
