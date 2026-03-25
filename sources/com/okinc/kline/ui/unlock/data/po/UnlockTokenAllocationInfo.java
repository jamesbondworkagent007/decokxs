package com.okinc.kline.ui.unlock.data.po;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class UnlockTokenAllocationInfo {
    public static final int $stable = 0;

    @SerializedName("label")
    private final String label;

    @SerializedName("percOfLabel")
    private final String percOfLabel;

    @SerializedName("percOfUnlocked")
    private final String percOfUnlocked;

    @SerializedName("progress")
    private final String progress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UnlockTokenAllocationInfo copy$default(UnlockTokenAllocationInfo unlockTokenAllocationInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unlockTokenAllocationInfo.label;
        }
        if ((i & 2) != 0) {
            str2 = unlockTokenAllocationInfo.percOfLabel;
        }
        if ((i & 4) != 0) {
            str3 = unlockTokenAllocationInfo.percOfUnlocked;
        }
        if ((i & 8) != 0) {
            str4 = unlockTokenAllocationInfo.progress;
        }
        return unlockTokenAllocationInfo.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.percOfLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.percOfUnlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnlockTokenAllocationInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new UnlockTokenAllocationInfo(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnlockTokenAllocationInfo)) {
            return false;
        }
        UnlockTokenAllocationInfo unlockTokenAllocationInfo = (UnlockTokenAllocationInfo) obj;
        return Intrinsics.EZpvd((Object) this.label, (Object) unlockTokenAllocationInfo.label) && Intrinsics.EZpvd((Object) this.percOfLabel, (Object) unlockTokenAllocationInfo.percOfLabel) && Intrinsics.EZpvd((Object) this.percOfUnlocked, (Object) unlockTokenAllocationInfo.percOfUnlocked) && Intrinsics.EZpvd((Object) this.progress, (Object) unlockTokenAllocationInfo.progress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercOfLabel() {
        return this.percOfLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercOfUnlocked() {
        return this.percOfUnlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProgress() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.label.hashCode() * 31) + this.percOfLabel.hashCode()) * 31) + this.percOfUnlocked.hashCode()) * 31) + this.progress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnlockTokenAllocationInfo(label=" + this.label + ", percOfLabel=" + this.percOfLabel + ", percOfUnlocked=" + this.percOfUnlocked + ", progress=" + this.progress + ")";
    }

    public UnlockTokenAllocationInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.label = str;
        this.percOfLabel = str2;
        this.percOfUnlocked = str3;
        this.progress = str4;
    }
}
