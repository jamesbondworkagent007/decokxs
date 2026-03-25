package com.okinc.network.okg.cor;

import com.okinc.network.okg.dns.DohTypeEnum;
import kotlin.jvm.internal.Intrinsics;
import o.C43326rnF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class SingleExecutor {
    public static final int $stable = 8;
    private final C43326rnF executor;
    private final DohTypeEnum type;
    private final String userSite;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SingleExecutor copy$default(SingleExecutor singleExecutor, String str, DohTypeEnum dohTypeEnum, C43326rnF c43326rnF, int i, Object obj) {
        if ((i & 1) != 0) {
            str = singleExecutor.userSite;
        }
        if ((i & 2) != 0) {
            dohTypeEnum = singleExecutor.type;
        }
        if ((i & 4) != 0) {
            c43326rnF = singleExecutor.executor;
        }
        return singleExecutor.copy(str, dohTypeEnum, c43326rnF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userSite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DohTypeEnum component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43326rnF component3() {
        return this.executor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SingleExecutor copy(@NotNull String str, @NotNull DohTypeEnum dohTypeEnum, @NotNull C43326rnF c43326rnF) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dohTypeEnum, "");
        Intrinsics.checkNotNullParameter(c43326rnF, "");
        return new SingleExecutor(str, dohTypeEnum, c43326rnF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleExecutor)) {
            return false;
        }
        SingleExecutor singleExecutor = (SingleExecutor) obj;
        return Intrinsics.EZpvd((Object) this.userSite, (Object) singleExecutor.userSite) && this.type == singleExecutor.type && Intrinsics.EZpvd(this.executor, singleExecutor.executor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43326rnF getExecutor() {
        return this.executor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DohTypeEnum getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserSite() {
        return this.userSite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.userSite.hashCode() * 31) + this.type.hashCode()) * 31) + this.executor.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SingleExecutor(userSite=" + this.userSite + ", type=" + this.type + ", executor=" + this.executor + ")";
    }

    public SingleExecutor(@NotNull String str, @NotNull DohTypeEnum dohTypeEnum, @NotNull C43326rnF c43326rnF) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dohTypeEnum, "");
        Intrinsics.checkNotNullParameter(c43326rnF, "");
        this.userSite = str;
        this.type = dohTypeEnum;
        this.executor = c43326rnF;
    }
}
