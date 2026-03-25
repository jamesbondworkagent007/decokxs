package com.okinc.kline.ui.unlock.data.po;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class UnlockProgressInfoPo {
    public static final int $stable = 0;

    @SerializedName("ccy")
    private final String ccy;

    @SerializedName("dataSourceInfo")
    private final String dataSourceInfo;

    @SerializedName("locked")
    private final String locked;

    @SerializedName("maxSupply")
    private final String maxSupply;

    @SerializedName("mcap")
    private final String mcap;

    @SerializedName("notes")
    private final String notes;

    @SerializedName("percOfLocked")
    private final String percOfLocked;

    @SerializedName("percOfUnlocked")
    private final String percOfUnlocked;

    @SerializedName("percOfUntracked")
    private final String percOfUntracked;

    @SerializedName("unlocked")
    private final String unlocked;

    @SerializedName("untracked")
    private final String untracked;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.notes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.dataSourceInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.locked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.mcap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.percOfLocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.percOfUnlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.percOfUntracked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.unlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.untracked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnlockProgressInfoPo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new UnlockProgressInfoPo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnlockProgressInfoPo)) {
            return false;
        }
        UnlockProgressInfoPo unlockProgressInfoPo = (UnlockProgressInfoPo) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) unlockProgressInfoPo.ccy) && Intrinsics.EZpvd((Object) this.locked, (Object) unlockProgressInfoPo.locked) && Intrinsics.EZpvd((Object) this.maxSupply, (Object) unlockProgressInfoPo.maxSupply) && Intrinsics.EZpvd((Object) this.mcap, (Object) unlockProgressInfoPo.mcap) && Intrinsics.EZpvd((Object) this.percOfLocked, (Object) unlockProgressInfoPo.percOfLocked) && Intrinsics.EZpvd((Object) this.percOfUnlocked, (Object) unlockProgressInfoPo.percOfUnlocked) && Intrinsics.EZpvd((Object) this.percOfUntracked, (Object) unlockProgressInfoPo.percOfUntracked) && Intrinsics.EZpvd((Object) this.unlocked, (Object) unlockProgressInfoPo.unlocked) && Intrinsics.EZpvd((Object) this.untracked, (Object) unlockProgressInfoPo.untracked) && Intrinsics.EZpvd((Object) this.notes, (Object) unlockProgressInfoPo.notes) && Intrinsics.EZpvd((Object) this.dataSourceInfo, (Object) unlockProgressInfoPo.dataSourceInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDataSourceInfo() {
        return this.dataSourceInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocked() {
        return this.locked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSupply() {
        return this.maxSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMcap() {
        return this.mcap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercOfLocked() {
        return this.percOfLocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercOfUnlocked() {
        return this.percOfUnlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercOfUntracked() {
        return this.percOfUntracked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnlocked() {
        return this.unlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUntracked() {
        return this.untracked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.ccy.hashCode();
        int iHashCode2 = this.locked.hashCode();
        int iHashCode3 = this.maxSupply.hashCode();
        int iHashCode4 = this.mcap.hashCode();
        int iHashCode5 = this.percOfLocked.hashCode();
        int iHashCode6 = this.percOfUnlocked.hashCode();
        int iHashCode7 = this.percOfUntracked.hashCode();
        int iHashCode8 = this.unlocked.hashCode();
        int iHashCode9 = this.untracked.hashCode();
        int iHashCode10 = this.notes.hashCode();
        String str = this.dataSourceInfo;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnlockProgressInfoPo(ccy=" + this.ccy + ", locked=" + this.locked + ", maxSupply=" + this.maxSupply + ", mcap=" + this.mcap + ", percOfLocked=" + this.percOfLocked + ", percOfUnlocked=" + this.percOfUnlocked + ", percOfUntracked=" + this.percOfUntracked + ", unlocked=" + this.unlocked + ", untracked=" + this.untracked + ", notes=" + this.notes + ", dataSourceInfo=" + this.dataSourceInfo + ")";
    }

    public UnlockProgressInfoPo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.ccy = str;
        this.locked = str2;
        this.maxSupply = str3;
        this.mcap = str4;
        this.percOfLocked = str5;
        this.percOfUnlocked = str6;
        this.percOfUntracked = str7;
        this.unlocked = str8;
        this.untracked = str9;
        this.notes = str10;
        this.dataSourceInfo = str11;
    }
}
