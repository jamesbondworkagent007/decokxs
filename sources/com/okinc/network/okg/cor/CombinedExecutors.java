package com.okinc.network.okg.cor;

import kotlin.jvm.internal.Intrinsics;
import o.C43326rnF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class CombinedExecutors {
    public static final int $stable = 8;
    private final C43326rnF dexExecutor;
    private final C43326rnF httpExecutor;
    private final String userSite;
    private final C43326rnF v5Executor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CombinedExecutors copy$default(CombinedExecutors combinedExecutors, String str, C43326rnF c43326rnF, C43326rnF c43326rnF2, C43326rnF c43326rnF3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = combinedExecutors.userSite;
        }
        if ((i & 2) != 0) {
            c43326rnF = combinedExecutors.httpExecutor;
        }
        if ((i & 4) != 0) {
            c43326rnF2 = combinedExecutors.v5Executor;
        }
        if ((i & 8) != 0) {
            c43326rnF3 = combinedExecutors.dexExecutor;
        }
        return combinedExecutors.copy(str, c43326rnF, c43326rnF2, c43326rnF3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userSite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43326rnF component2() {
        return this.httpExecutor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43326rnF component3() {
        return this.v5Executor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43326rnF component4() {
        return this.dexExecutor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CombinedExecutors copy(@NotNull String str, @NotNull C43326rnF c43326rnF, @NotNull C43326rnF c43326rnF2, @NotNull C43326rnF c43326rnF3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c43326rnF, "");
        Intrinsics.checkNotNullParameter(c43326rnF2, "");
        Intrinsics.checkNotNullParameter(c43326rnF3, "");
        return new CombinedExecutors(str, c43326rnF, c43326rnF2, c43326rnF3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedExecutors)) {
            return false;
        }
        CombinedExecutors combinedExecutors = (CombinedExecutors) obj;
        return Intrinsics.EZpvd((Object) this.userSite, (Object) combinedExecutors.userSite) && Intrinsics.EZpvd(this.httpExecutor, combinedExecutors.httpExecutor) && Intrinsics.EZpvd(this.v5Executor, combinedExecutors.v5Executor) && Intrinsics.EZpvd(this.dexExecutor, combinedExecutors.dexExecutor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43326rnF getDexExecutor() {
        return this.dexExecutor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43326rnF getHttpExecutor() {
        return this.httpExecutor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserSite() {
        return this.userSite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43326rnF getV5Executor() {
        return this.v5Executor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.userSite.hashCode() * 31) + this.httpExecutor.hashCode()) * 31) + this.v5Executor.hashCode()) * 31) + this.dexExecutor.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CombinedExecutors(userSite=" + this.userSite + ", httpExecutor=" + this.httpExecutor + ", v5Executor=" + this.v5Executor + ", dexExecutor=" + this.dexExecutor + ")";
    }

    public CombinedExecutors(@NotNull String str, @NotNull C43326rnF c43326rnF, @NotNull C43326rnF c43326rnF2, @NotNull C43326rnF c43326rnF3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c43326rnF, "");
        Intrinsics.checkNotNullParameter(c43326rnF2, "");
        Intrinsics.checkNotNullParameter(c43326rnF3, "");
        this.userSite = str;
        this.httpExecutor = c43326rnF;
        this.v5Executor = c43326rnF2;
        this.dexExecutor = c43326rnF3;
    }
}
