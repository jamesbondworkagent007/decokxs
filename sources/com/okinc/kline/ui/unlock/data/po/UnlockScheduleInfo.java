package com.okinc.kline.ui.unlock.data.po;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class UnlockScheduleInfo {
    public static final int $stable = 0;

    @SerializedName("label")
    private final String label;

    @SerializedName("unlocked")
    private final String unlocked;

    @SerializedName("unlockedValue")
    private final String unlockedValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UnlockScheduleInfo copy$default(UnlockScheduleInfo unlockScheduleInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unlockScheduleInfo.label;
        }
        if ((i & 2) != 0) {
            str2 = unlockScheduleInfo.unlocked;
        }
        if ((i & 4) != 0) {
            str3 = unlockScheduleInfo.unlockedValue;
        }
        return unlockScheduleInfo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.unlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.unlockedValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnlockScheduleInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new UnlockScheduleInfo(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnlockScheduleInfo)) {
            return false;
        }
        UnlockScheduleInfo unlockScheduleInfo = (UnlockScheduleInfo) obj;
        return Intrinsics.EZpvd((Object) this.label, (Object) unlockScheduleInfo.label) && Intrinsics.EZpvd((Object) this.unlocked, (Object) unlockScheduleInfo.unlocked) && Intrinsics.EZpvd((Object) this.unlockedValue, (Object) unlockScheduleInfo.unlockedValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnlocked() {
        return this.unlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnlockedValue() {
        return this.unlockedValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.label.hashCode() * 31) + this.unlocked.hashCode()) * 31) + this.unlockedValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnlockScheduleInfo(label=" + this.label + ", unlocked=" + this.unlocked + ", unlockedValue=" + this.unlockedValue + ")";
    }

    public UnlockScheduleInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.label = str;
        this.unlocked = str2;
        this.unlockedValue = str3;
    }
}
