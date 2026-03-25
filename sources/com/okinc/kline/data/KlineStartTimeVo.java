package com.okinc.kline.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineStartTimeVo {
    public static final int $stable = 0;
    private final String bar;
    private final String ts;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KlineStartTimeVo copy$default(KlineStartTimeVo klineStartTimeVo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = klineStartTimeVo.bar;
        }
        if ((i & 2) != 0) {
            str2 = klineStartTimeVo.ts;
        }
        return klineStartTimeVo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineStartTimeVo copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new KlineStartTimeVo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KlineStartTimeVo)) {
            return false;
        }
        KlineStartTimeVo klineStartTimeVo = (KlineStartTimeVo) obj;
        return Intrinsics.EZpvd((Object) this.bar, (Object) klineStartTimeVo.bar) && Intrinsics.EZpvd((Object) this.ts, (Object) klineStartTimeVo.ts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBar() {
        return this.bar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.bar.hashCode() * 31) + this.ts.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KlineStartTimeVo(bar=" + this.bar + ", ts=" + this.ts + ")";
    }

    public KlineStartTimeVo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.bar = str;
        this.ts = str2;
    }
}
