package com.okinc.network.okg.dns.model;

import com.okinc.network.request.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class DoHChain {
    public static final int $stable = 8;
    private final Uri holder;
    private final NetType netType;
    private final Uri target;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DoHChain copy$default(DoHChain doHChain, NetType netType, Uri uri, Uri uri2, int i, Object obj) {
        if ((i & 1) != 0) {
            netType = doHChain.netType;
        }
        if ((i & 2) != 0) {
            uri = doHChain.holder;
        }
        if ((i & 4) != 0) {
            uri2 = doHChain.target;
        }
        return doHChain.copy(netType, uri, uri2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetType component1() {
        return this.netType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri component2() {
        return this.holder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri component3() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DoHChain copy(@NotNull NetType netType, @NotNull Uri uri, @NotNull Uri uri2) {
        Intrinsics.checkNotNullParameter(netType, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(uri2, "");
        return new DoHChain(netType, uri, uri2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoHChain)) {
            return false;
        }
        DoHChain doHChain = (DoHChain) obj;
        return this.netType == doHChain.netType && Intrinsics.EZpvd(this.holder, doHChain.holder) && Intrinsics.EZpvd(this.target, doHChain.target);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri getHolder() {
        return this.holder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetType getNetType() {
        return this.netType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.netType.hashCode() * 31) + this.holder.hashCode()) * 31) + this.target.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DoHChain(netType=" + this.netType + ", holder=" + this.holder + ", target=" + this.target + ")";
    }

    public DoHChain(@NotNull NetType netType, @NotNull Uri uri, @NotNull Uri uri2) {
        Intrinsics.checkNotNullParameter(netType, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(uri2, "");
        this.netType = netType;
        this.holder = uri;
        this.target = uri2;
    }
}
