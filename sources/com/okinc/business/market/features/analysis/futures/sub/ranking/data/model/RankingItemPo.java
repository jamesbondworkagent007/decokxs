package com.okinc.business.market.features.analysis.futures.sub.ranking.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class RankingItemPo {
    public static final int $stable = 0;
    public static final int BIZ_TYPE_FUTURES = 3;
    public static final int BIZ_TYPE_PERPETUAL = 4;
    public static final ActionBar Companion = new ActionBar(null);

    @SerializedName("bizType")
    private final int bizType;

    @SerializedName("instName")
    private final String instName;

    @SerializedName("longPnl")
    private final String longPnl;

    @SerializedName("netPnl")
    private final String netPnl;

    @SerializedName("shortPnl")
    private final String shortPnl;

    @SerializedName("timeStamp")
    private final long timeStamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RankingItemPo copy$default(RankingItemPo rankingItemPo, int i, String str, String str2, String str3, String str4, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = rankingItemPo.bizType;
        }
        if ((i2 & 2) != 0) {
            str = rankingItemPo.instName;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = rankingItemPo.longPnl;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = rankingItemPo.netPnl;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = rankingItemPo.shortPnl;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            j = rankingItemPo.timeStamp;
        }
        return rankingItemPo.copy(i, str5, str6, str7, str8, j);
    }

    public static /* synthetic */ void getTimeStamp$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.longPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.netPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.shortPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.timeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankingItemPo copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new RankingItemPo(i, str, str2, str3, str4, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankingItemPo)) {
            return false;
        }
        RankingItemPo rankingItemPo = (RankingItemPo) obj;
        return this.bizType == rankingItemPo.bizType && Intrinsics.EZpvd((Object) this.instName, (Object) rankingItemPo.instName) && Intrinsics.EZpvd((Object) this.longPnl, (Object) rankingItemPo.longPnl) && Intrinsics.EZpvd((Object) this.netPnl, (Object) rankingItemPo.netPnl) && Intrinsics.EZpvd((Object) this.shortPnl, (Object) rankingItemPo.shortPnl) && this.timeStamp == rankingItemPo.timeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstName() {
        return this.instName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLongPnl() {
        return this.longPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetPnl() {
        return this.netPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortPnl() {
        return this.shortPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Integer.hashCode(this.bizType) * 31) + this.instName.hashCode()) * 31) + this.longPnl.hashCode()) * 31) + this.netPnl.hashCode()) * 31) + this.shortPnl.hashCode()) * 31) + Long.hashCode(this.timeStamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RankingItemPo(bizType=" + this.bizType + ", instName=" + this.instName + ", longPnl=" + this.longPnl + ", netPnl=" + this.netPnl + ", shortPnl=" + this.shortPnl + ", timeStamp=" + this.timeStamp + ")";
    }

    public RankingItemPo(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.bizType = i;
        this.instName = str;
        this.longPnl = str2;
        this.netPnl = str3;
        this.shortPnl = str4;
        this.timeStamp = j;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.analysis.futures.sub.ranking.data.model.RankingItemPo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
