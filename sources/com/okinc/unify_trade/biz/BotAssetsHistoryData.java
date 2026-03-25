package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotAssetsHistoryData {
    public static final int $stable = 0;
    private final String assets;
    private final String pnlRatio;
    private final String ts;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotAssetsHistoryData copy$default(BotAssetsHistoryData botAssetsHistoryData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botAssetsHistoryData.assets;
        }
        if ((i & 2) != 0) {
            str2 = botAssetsHistoryData.ts;
        }
        if ((i & 4) != 0) {
            str3 = botAssetsHistoryData.pnlRatio;
        }
        return botAssetsHistoryData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.assets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotAssetsHistoryData copy(String str, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new BotAssetsHistoryData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotAssetsHistoryData)) {
            return false;
        }
        BotAssetsHistoryData botAssetsHistoryData = (BotAssetsHistoryData) obj;
        return Intrinsics.EZpvd((Object) this.assets, (Object) botAssetsHistoryData.assets) && Intrinsics.EZpvd((Object) this.ts, (Object) botAssetsHistoryData.ts) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) botAssetsHistoryData.pnlRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssets() {
        return this.assets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.assets;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ts;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.pnlRatio.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotAssetsHistoryData(assets=" + this.assets + ", ts=" + this.ts + ", pnlRatio=" + this.pnlRatio + ")";
    }

    public BotAssetsHistoryData(String str, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.assets = str;
        this.ts = str2;
        this.pnlRatio = str3;
    }
}
